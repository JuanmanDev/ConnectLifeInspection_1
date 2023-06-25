package androidx.camera.core;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.DeferrableSurface;
import androidx.camera.core.FixedSizeSurfaceTexture;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p040c.p200q.p353b.p360g.p361a.C6316e;

public final class CheckedSurfaceTexture extends DeferrableSurface {
    public Object mLock = new Object();
    public final OnTextureChangedListener mOutputChangedListener;
    @Nullable
    public Size mResolution;
    @VisibleForTesting
    @GuardedBy("mLock")
    public final Map<SurfaceTexture, Resource> mResourceMap = new HashMap();
    @Nullable
    public Surface mSurface;
    @Nullable
    public FixedSizeSurfaceTexture mSurfaceTexture;
    public final List<Surface> mSurfaceToReleaseList = new ArrayList();

    public interface OnTextureChangedListener {
        void onTextureChanged(SurfaceTexture surfaceTexture, Size size);
    }

    public class Resource implements FixedSizeSurfaceTexture.Owner {
        public boolean mIsReadyToRelease = false;
        public boolean mIsReleasing = false;
        public Surface mSurface;
        public FixedSizeSurfaceTexture mSurfaceTexture;

        public Resource() {
        }

        public synchronized boolean isReleasing() {
            return this.mIsReleasing;
        }

        @UiThread
        public synchronized void release() {
            this.mIsReadyToRelease = true;
            if (this.mSurfaceTexture != null) {
                this.mSurfaceTexture.release();
                this.mSurfaceTexture = null;
            }
            if (this.mSurface != null) {
                this.mSurface.release();
                this.mSurface = null;
            }
        }

        public synchronized boolean requestRelease() {
            if (this.mIsReadyToRelease) {
                return true;
            }
            CheckedSurfaceTexture.this.releaseResourceWhenDetached(this);
            return false;
        }

        public synchronized void setReleasing(boolean z) {
            this.mIsReleasing = z;
        }

        @UiThread
        public void setSurface(Surface surface) {
            this.mSurface = surface;
        }

        @UiThread
        public void setSurfaceTexture(FixedSizeSurfaceTexture fixedSizeSurfaceTexture) {
            this.mSurfaceTexture = fixedSizeSurfaceTexture;
        }
    }

    public CheckedSurfaceTexture(OnTextureChangedListener onTextureChangedListener) {
        this.mOutputChangedListener = onTextureChangedListener;
    }

    private FixedSizeSurfaceTexture createDetachedSurfaceTexture(Size size) {
        IntBuffer allocate = IntBuffer.allocate(1);
        GLES20.glGenTextures(1, allocate);
        Resource resource = new Resource();
        FixedSizeSurfaceTexture fixedSizeSurfaceTexture = new FixedSizeSurfaceTexture(allocate.get(), size, (FixedSizeSurfaceTexture.Owner) resource);
        fixedSizeSurfaceTexture.detachFromGLContext();
        resource.setSurfaceTexture(fixedSizeSurfaceTexture);
        synchronized (this.mLock) {
            this.mResourceMap.put(fixedSizeSurfaceTexture, resource);
        }
        return fixedSizeSurfaceTexture;
    }

    @UiThread
    public Surface createSurfaceFrom(FixedSizeSurfaceTexture fixedSizeSurfaceTexture) {
        Surface surface = new Surface(fixedSizeSurfaceTexture);
        synchronized (this.mLock) {
            Resource resource = this.mResourceMap.get(fixedSizeSurfaceTexture);
            if (resource == null) {
                resource = new Resource();
                resource.setSurfaceTexture(fixedSizeSurfaceTexture);
                this.mResourceMap.put(fixedSizeSurfaceTexture, resource);
            }
            resource.setSurface(surface);
        }
        return surface;
    }

    public C6316e<Surface> getSurface() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<Surface>() {
            public Object attachCompleter(@NonNull final CallbackToFutureAdapter.Completer<Surface> completer) {
                CheckedSurfaceTexture.this.runOnMainThread(new Runnable() {
                    public void run() {
                        CheckedSurfaceTexture checkedSurfaceTexture = CheckedSurfaceTexture.this;
                        if (checkedSurfaceTexture.isSurfaceTextureReleasing(checkedSurfaceTexture.mSurfaceTexture)) {
                            CheckedSurfaceTexture.this.resetSurfaceTexture();
                        }
                        CheckedSurfaceTexture checkedSurfaceTexture2 = CheckedSurfaceTexture.this;
                        if (checkedSurfaceTexture2.mSurface == null) {
                            checkedSurfaceTexture2.mSurface = checkedSurfaceTexture2.createSurfaceFrom(checkedSurfaceTexture2.mSurfaceTexture);
                        }
                        completer.set(CheckedSurfaceTexture.this.mSurface);
                    }
                });
                return "CheckSurfaceTexture";
            }
        });
    }

    @UiThread
    public boolean isSurfaceTextureReleasing(FixedSizeSurfaceTexture fixedSizeSurfaceTexture) {
        synchronized (this.mLock) {
            Resource resource = this.mResourceMap.get(fixedSizeSurfaceTexture);
            if (resource == null) {
                return true;
            }
            boolean isReleasing = resource.isReleasing();
            return isReleasing;
        }
    }

    public void refresh() {
        runOnMainThread(new Runnable() {
            public void run() {
                CheckedSurfaceTexture checkedSurfaceTexture = CheckedSurfaceTexture.this;
                if (checkedSurfaceTexture.isSurfaceTextureReleasing(checkedSurfaceTexture.mSurfaceTexture)) {
                    CheckedSurfaceTexture.this.resetSurfaceTexture();
                }
                CheckedSurfaceTexture checkedSurfaceTexture2 = CheckedSurfaceTexture.this;
                Surface surface = checkedSurfaceTexture2.mSurface;
                if (surface != null) {
                    checkedSurfaceTexture2.mSurfaceToReleaseList.add(surface);
                }
                CheckedSurfaceTexture checkedSurfaceTexture3 = CheckedSurfaceTexture.this;
                checkedSurfaceTexture3.mSurface = checkedSurfaceTexture3.createSurfaceFrom(checkedSurfaceTexture3.mSurfaceTexture);
            }
        });
    }

    @UiThread
    public void release() {
        Resource resource;
        if (this.mSurface != null || this.mSurfaceTexture != null) {
            synchronized (this.mLock) {
                resource = this.mResourceMap.get(this.mSurfaceTexture);
            }
            if (resource != null) {
                releaseResourceWhenDetached(resource);
            }
            this.mSurfaceTexture = null;
            this.mSurface = null;
            for (Surface release : this.mSurfaceToReleaseList) {
                release.release();
            }
            this.mSurfaceToReleaseList.clear();
        }
    }

    public void releaseResourceWhenDetached(Resource resource) {
        synchronized (this.mLock) {
            resource.setReleasing(true);
        }
        setOnSurfaceDetachedListener(CameraXExecutors.mainThreadExecutor(), new DeferrableSurface.OnSurfaceDetachedListener() {
            public void onSurfaceDetached() {
                ArrayList<Resource> arrayList = new ArrayList<>();
                synchronized (CheckedSurfaceTexture.this.mLock) {
                    for (Resource next : CheckedSurfaceTexture.this.mResourceMap.values()) {
                        if (next.isReleasing()) {
                            arrayList.add(next);
                        }
                    }
                    for (Resource resource : arrayList) {
                        CheckedSurfaceTexture.this.mResourceMap.remove(resource.mSurfaceTexture);
                    }
                }
                for (Resource release : arrayList) {
                    release.release();
                }
            }
        });
    }

    @UiThread
    public void resetSurfaceTexture() {
        if (this.mResolution != null) {
            release();
            FixedSizeSurfaceTexture createDetachedSurfaceTexture = createDetachedSurfaceTexture(this.mResolution);
            this.mSurfaceTexture = createDetachedSurfaceTexture;
            this.mOutputChangedListener.onTextureChanged(createDetachedSurfaceTexture, this.mResolution);
            return;
        }
        throw new IllegalStateException("setResolution() must be called before resetSurfaceTexture()");
    }

    public void runOnMainThread(Runnable runnable) {
        Executor executor;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            executor = CameraXExecutors.directExecutor();
        } else {
            executor = CameraXExecutors.mainThreadExecutor();
        }
        executor.execute(runnable);
    }

    @UiThread
    public void setResolution(Size size) {
        this.mResolution = size;
    }
}
