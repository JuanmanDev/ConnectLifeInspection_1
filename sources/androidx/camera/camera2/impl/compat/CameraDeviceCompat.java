package androidx.camera.camera2.impl.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.impl.compat.params.SessionConfigurationCompat;
import java.util.concurrent.Executor;

@RequiresApi(21)
public final class CameraDeviceCompat {
    public static final CameraDeviceCompatImpl IMPL = chooseImplementation();
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int SESSION_OPERATION_MODE_CONSTRAINED_HIGH_SPEED = 1;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int SESSION_OPERATION_MODE_NORMAL = 0;

    public interface CameraDeviceCompatImpl {
        void createCaptureSession(@NonNull CameraDevice cameraDevice, @NonNull SessionConfigurationCompat sessionConfigurationCompat);
    }

    public static final class StateCallbackExecutorWrapper extends CameraDevice.StateCallback {
        public final Executor mExecutor;
        public final CameraDevice.StateCallback mWrappedCallback;

        public StateCallbackExecutorWrapper(@NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = stateCallback;
        }

        public void onClosed(@NonNull final CameraDevice cameraDevice) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onClosed(cameraDevice);
                }
            });
        }

        public void onDisconnected(@NonNull final CameraDevice cameraDevice) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onDisconnected(cameraDevice);
                }
            });
        }

        public void onError(@NonNull final CameraDevice cameraDevice, final int i) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onError(cameraDevice, i);
                }
            });
        }

        public void onOpened(@NonNull final CameraDevice cameraDevice) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onOpened(cameraDevice);
                }
            });
        }
    }

    public static CameraDeviceCompatImpl chooseImplementation() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new CameraDeviceCompatApi28Impl();
        }
        if (i >= 24) {
            return new CameraDeviceCompatApi24Impl();
        }
        if (i >= 23) {
            return new CameraDeviceCompatApi23Impl();
        }
        return new CameraDeviceCompatBaseImpl();
    }

    public static void createCaptureSession(@NonNull CameraDevice cameraDevice, @NonNull SessionConfigurationCompat sessionConfigurationCompat) {
        IMPL.createCaptureSession(cameraDevice, sessionConfigurationCompat);
    }
}
