package androidx.camera.core;

import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p040c.p200q.p353b.p360g.p361a.C6316e;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class DeferrableSurface {
    public static final boolean DEBUG = false;
    public static final String TAG = "DeferrableSurface";
    public static AtomicInteger sSurfaceCount = new AtomicInteger(0);
    @GuardedBy("mLock")
    public int mAttachedCount = 0;
    @GuardedBy("mLock")
    @Nullable
    public Executor mListenerExecutor = null;
    public final Object mLock = new Object();
    @GuardedBy("mLock")
    @Nullable
    public OnSurfaceDetachedListener mOnSurfaceDetachedListener = null;

    public interface OnSurfaceDetachedListener {
        void onSurfaceDetached();
    }

    public static void callOnSurfaceDetachedListener(@NonNull final OnSurfaceDetachedListener onSurfaceDetachedListener, @NonNull Executor executor) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(onSurfaceDetachedListener);
        executor.execute(new Runnable() {
            public void run() {
                onSurfaceDetachedListener.onSurfaceDetached();
            }
        });
    }

    @VisibleForTesting
    public int getAttachedCount() {
        int i;
        synchronized (this.mLock) {
            i = this.mAttachedCount;
        }
        return i;
    }

    @Nullable
    public abstract C6316e<Surface> getSurface();

    public void notifySurfaceAttached() {
        synchronized (this.mLock) {
            this.mAttachedCount++;
        }
    }

    public void notifySurfaceDetached() {
        OnSurfaceDetachedListener onSurfaceDetachedListener;
        Executor executor;
        synchronized (this.mLock) {
            if (this.mAttachedCount != 0) {
                int i = this.mAttachedCount - 1;
                this.mAttachedCount = i;
                onSurfaceDetachedListener = null;
                if (i == 0) {
                    onSurfaceDetachedListener = this.mOnSurfaceDetachedListener;
                    executor = this.mListenerExecutor;
                } else {
                    executor = null;
                }
            } else {
                throw new IllegalStateException("Detaching occurs more times than attaching");
            }
        }
        if (onSurfaceDetachedListener != null && executor != null) {
            callOnSurfaceDetachedListener(onSurfaceDetachedListener, executor);
        }
    }

    public void refresh() {
    }

    public void setOnSurfaceDetachedListener(@NonNull Executor executor, @NonNull OnSurfaceDetachedListener onSurfaceDetachedListener) {
        boolean z;
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(onSurfaceDetachedListener);
        synchronized (this.mLock) {
            this.mOnSurfaceDetachedListener = onSurfaceDetachedListener;
            this.mListenerExecutor = executor;
            z = this.mAttachedCount == 0;
        }
        if (z) {
            callOnSurfaceDetachedListener(onSurfaceDetachedListener, executor);
        }
    }

    public final class SurfaceClosedException extends Exception {
        public SurfaceClosedException(String str, Throwable th) {
            super(str, th);
        }

        public SurfaceClosedException(String str) {
            super(str);
        }
    }
}
