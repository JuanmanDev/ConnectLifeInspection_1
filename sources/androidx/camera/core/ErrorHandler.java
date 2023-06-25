package androidx.camera.core;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraX;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ErrorHandler {
    public static final String TAG = "ErrorHandler";
    public final Object mErrorLock = new Object();
    @GuardedBy("mErrorLock")
    public Handler mHandler = new Handler(Looper.getMainLooper());
    @GuardedBy("mErrorLock")
    public CameraX.ErrorListener mListener = new PrintingErrorListener();

    public static final class PrintingErrorListener implements CameraX.ErrorListener {
        public void onError(CameraX.ErrorCode errorCode, String str) {
            "ErrorHandler occurred: " + errorCode + " with message: " + str;
        }
    }

    public void postError(final CameraX.ErrorCode errorCode, final String str) {
        synchronized (this.mErrorLock) {
            final CameraX.ErrorListener errorListener = this.mListener;
            this.mHandler.post(new Runnable() {
                public void run() {
                    errorListener.onError(errorCode, str);
                }
            });
        }
    }

    public void setErrorListener(CameraX.ErrorListener errorListener, Handler handler) {
        synchronized (this.mErrorLock) {
            if (handler == null) {
                this.mHandler = new Handler(Looper.getMainLooper());
            } else {
                this.mHandler = handler;
            }
            if (errorListener == null) {
                this.mListener = new PrintingErrorListener();
            } else {
                this.mListener = errorListener;
            }
        }
    }
}
