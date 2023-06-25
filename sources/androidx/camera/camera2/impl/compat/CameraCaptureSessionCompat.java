package androidx.camera.camera2.impl.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;
import java.util.concurrent.Executor;

@RequiresApi(21)
public final class CameraCaptureSessionCompat {
    public static final CameraCaptureSessionCompatImpl IMPL = chooseImplementation();

    public interface CameraCaptureSessionCompatImpl {
        int captureBurstRequests(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback);

        int captureSingleRequest(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback);

        int setRepeatingBurstRequests(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback);

        int setSingleRepeatingRequest(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback);
    }

    public static final class CaptureCallbackExecutorWrapper extends CameraCaptureSession.CaptureCallback {
        public final Executor mExecutor;
        public final CameraCaptureSession.CaptureCallback mWrappedCallback;

        public CaptureCallbackExecutorWrapper(@NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = captureCallback;
        }

        @RequiresApi(24)
        public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            final CameraCaptureSession cameraCaptureSession2 = cameraCaptureSession;
            final CaptureRequest captureRequest2 = captureRequest;
            final Surface surface2 = surface;
            final long j2 = j;
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureBufferLost(cameraCaptureSession2, captureRequest2, surface2, j2);
                }
            });
        }

        public void onCaptureCompleted(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final TotalCaptureResult totalCaptureResult) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        public void onCaptureFailed(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final CaptureFailure captureFailure) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        public void onCaptureProgressed(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final CaptureResult captureResult) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        public void onCaptureSequenceAborted(@NonNull final CameraCaptureSession cameraCaptureSession, final int i) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureSequenceAborted(cameraCaptureSession, i);
                }
            });
        }

        public void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i, long j) {
            final CameraCaptureSession cameraCaptureSession2 = cameraCaptureSession;
            final int i2 = i;
            final long j2 = j;
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureSequenceCompleted(cameraCaptureSession2, i2, j2);
                }
            });
        }

        public void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j, long j2) {
            final CameraCaptureSession cameraCaptureSession2 = cameraCaptureSession;
            final CaptureRequest captureRequest2 = captureRequest;
            final long j3 = j;
            final long j4 = j2;
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureStarted(cameraCaptureSession2, captureRequest2, j3, j4);
                }
            });
        }
    }

    public static final class StateCallbackExecutorWrapper extends CameraCaptureSession.StateCallback {
        public final Executor mExecutor;
        public final CameraCaptureSession.StateCallback mWrappedCallback;

        public StateCallbackExecutorWrapper(@NonNull Executor executor, @NonNull CameraCaptureSession.StateCallback stateCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = stateCallback;
        }

        public void onActive(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onActive(cameraCaptureSession);
                }
            });
        }

        @RequiresApi(26)
        public void onCaptureQueueEmpty(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onCaptureQueueEmpty(cameraCaptureSession);
                }
            });
        }

        public void onClosed(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onClosed(cameraCaptureSession);
                }
            });
        }

        public void onConfigureFailed(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onConfigureFailed(cameraCaptureSession);
                }
            });
        }

        public void onConfigured(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onConfigured(cameraCaptureSession);
                }
            });
        }

        public void onReady(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onReady(cameraCaptureSession);
                }
            });
        }

        @RequiresApi(23)
        public void onSurfacePrepared(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final Surface surface) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onSurfacePrepared(cameraCaptureSession, surface);
                }
            });
        }
    }

    public static int captureBurstRequests(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        return IMPL.captureBurstRequests(cameraCaptureSession, list, executor, captureCallback);
    }

    public static int captureSingleRequest(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        return IMPL.captureSingleRequest(cameraCaptureSession, captureRequest, executor, captureCallback);
    }

    public static CameraCaptureSessionCompatImpl chooseImplementation() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new CameraCaptureSessionCompatApi28Impl();
        }
        return new CameraCaptureSessionCompatBaseImpl();
    }

    public static int setRepeatingBurstRequests(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        return IMPL.setRepeatingBurstRequests(cameraCaptureSession, list, executor, captureCallback);
    }

    public static int setSingleRepeatingRequest(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        return IMPL.setSingleRepeatingRequest(cameraCaptureSession, captureRequest, executor, captureCallback);
    }
}
