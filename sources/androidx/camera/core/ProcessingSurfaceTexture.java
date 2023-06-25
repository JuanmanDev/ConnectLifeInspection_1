package androidx.camera.core;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.DeferrableSurface;
import androidx.camera.core.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import p040c.p200q.p353b.p360g.p361a.C6316e;

public final class ProcessingSurfaceTexture extends DeferrableSurface {
    public static final int MAX_IMAGES = 2;
    public static final String TAG = "ProcessingSurfaceTextur";
    public final CameraCaptureCallback mCameraCaptureCallback;
    @GuardedBy("mLock")
    @NonNull
    public final CaptureProcessor mCaptureProcessor;
    public final CaptureStage mCaptureStage;
    @GuardedBy("mLock")
    public boolean mClosed = false;
    @GuardedBy("mLock")
    public final MetadataImageReader mInputImageReader;
    @GuardedBy("mLock")
    public final Surface mInputSurface;
    public final Object mLock = new Object();
    @NonNull
    public final Size mResolution;
    @GuardedBy("mLock")
    public SurfaceTexture mSurfaceTexture;
    @GuardedBy("mLock")
    public Surface mSurfaceTextureSurface;
    public final ImageReaderProxy.OnImageAvailableListener mTransformedListener = new ImageReaderProxy.OnImageAvailableListener() {
        public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
            ProcessingSurfaceTexture.this.imageIncoming(imageReaderProxy);
        }
    };

    public ProcessingSurfaceTexture(int i, int i2, int i3, @Nullable Handler handler, @NonNull CaptureStage captureStage, @NonNull CaptureProcessor captureProcessor) {
        Handler handler2;
        this.mResolution = new Size(i, i2);
        if (handler != null) {
            handler2 = handler;
        } else {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                handler2 = new Handler(myLooper);
            } else {
                throw new IllegalStateException("Creating a ProcessingSurfaceTexture requires a non-null Handler, or be created on a thread with a Looper.");
            }
        }
        MetadataImageReader metadataImageReader = new MetadataImageReader(i, i2, i3, 2, handler2);
        this.mInputImageReader = metadataImageReader;
        metadataImageReader.setOnImageAvailableListener(this.mTransformedListener, handler);
        this.mInputSurface = this.mInputImageReader.getSurface();
        this.mCameraCaptureCallback = this.mInputImageReader.getCameraCaptureCallback();
        this.mSurfaceTexture = FixedSizeSurfaceTextures.createDetachedSurfaceTexture(this.mResolution);
        Surface surface = new Surface(this.mSurfaceTexture);
        this.mSurfaceTextureSurface = surface;
        this.mCaptureProcessor = captureProcessor;
        captureProcessor.onOutputSurface(surface, 1);
        this.mCaptureProcessor.onResolutionUpdate(this.mResolution);
        this.mCaptureStage = captureStage;
    }

    public void close() {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                this.mSurfaceTexture.release();
                this.mSurfaceTexture = null;
                this.mSurfaceTextureSurface.release();
                this.mSurfaceTextureSurface = null;
                this.mClosed = true;
                setOnSurfaceDetachedListener(CameraXExecutors.directExecutor(), new DeferrableSurface.OnSurfaceDetachedListener() {
                    public void onSurfaceDetached() {
                        ProcessingSurfaceTexture.this.closeInputs();
                    }
                });
            }
        }
    }

    public void closeInputs() {
        synchronized (this.mLock) {
            this.mInputImageReader.close();
            this.mInputSurface.release();
        }
    }

    @Nullable
    public CameraCaptureCallback getCameraCaptureCallback() {
        CameraCaptureCallback cameraCaptureCallback;
        synchronized (this.mLock) {
            if (!this.mClosed) {
                cameraCaptureCallback = this.mCameraCaptureCallback;
            } else {
                throw new IllegalStateException("ProcessingSurfaceTexture already closed!");
            }
        }
        return cameraCaptureCallback;
    }

    @Nullable
    public C6316e<Surface> getSurface() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                C6316e<Surface> immediateFailedFuture = Futures.immediateFailedFuture(new DeferrableSurface.SurfaceClosedException("ProcessingSurfaceTexture already closed!"));
                return immediateFailedFuture;
            }
            C6316e<Surface> immediateFuture = Futures.immediateFuture(this.mInputSurface);
            return immediateFuture;
        }
    }

    public SurfaceTexture getSurfaceTexture() {
        SurfaceTexture surfaceTexture;
        synchronized (this.mLock) {
            if (!this.mClosed) {
                surfaceTexture = this.mSurfaceTexture;
            } else {
                throw new IllegalStateException("ProcessingSurfaceTexture already closed!");
            }
        }
        return surfaceTexture;
    }

    @GuardedBy("mLock")
    public void imageIncoming(ImageReaderProxy imageReaderProxy) {
        if (!this.mClosed) {
            ImageProxy imageProxy = null;
            try {
                imageProxy = imageReaderProxy.acquireNextImage();
            } catch (IllegalStateException unused) {
            }
            if (imageProxy != null) {
                ImageInfo imageInfo = imageProxy.getImageInfo();
                if (imageInfo == null) {
                    imageProxy.close();
                    return;
                }
                Object tag = imageInfo.getTag();
                if (tag == null) {
                    imageProxy.close();
                } else if (!(tag instanceof Integer)) {
                    imageProxy.close();
                } else {
                    Integer num = (Integer) tag;
                    if (this.mCaptureStage.getId() != num.intValue()) {
                        "ImageProxyBundle does not contain this id: " + num;
                        imageProxy.close();
                        return;
                    }
                    SingleImageProxyBundle singleImageProxyBundle = new SingleImageProxyBundle(imageProxy);
                    this.mCaptureProcessor.process(singleImageProxyBundle);
                    singleImageProxyBundle.close();
                }
            }
        }
    }

    public void resetSurfaceTexture() {
        if (!this.mClosed) {
            this.mSurfaceTexture.release();
            this.mSurfaceTextureSurface.release();
            this.mSurfaceTexture = FixedSizeSurfaceTextures.createDetachedSurfaceTexture(this.mResolution);
            Surface surface = new Surface(this.mSurfaceTexture);
            this.mSurfaceTextureSurface = surface;
            this.mCaptureProcessor.onOutputSurface(surface, 1);
            return;
        }
        throw new IllegalStateException("ProcessingSurfaceTexture already closed!");
    }
}
