package androidx.camera.camera2.impl.compat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import java.util.concurrent.Executor;

@RequiresApi(21)
public final class CameraManagerCompat {
    public final CameraManagerCompatImpl mImpl;

    public static final class AvailabilityCallbackExecutorWrapper extends CameraManager.AvailabilityCallback {
        public final Executor mExecutor;
        public final CameraManager.AvailabilityCallback mWrappedCallback;

        public AvailabilityCallbackExecutorWrapper(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = availabilityCallback;
        }

        @RequiresApi(29)
        public void onCameraAccessPrioritiesChanged() {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    AvailabilityCallbackExecutorWrapper.this.mWrappedCallback.onCameraAccessPrioritiesChanged();
                }
            });
        }

        public void onCameraAvailable(@NonNull final String str) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    AvailabilityCallbackExecutorWrapper.this.mWrappedCallback.onCameraAvailable(str);
                }
            });
        }

        public void onCameraUnavailable(@NonNull final String str) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    AvailabilityCallbackExecutorWrapper.this.mWrappedCallback.onCameraUnavailable(str);
                }
            });
        }
    }

    public interface CameraManagerCompatImpl {
        @NonNull
        CameraManager getCameraManager();

        @RequiresPermission("android.permission.CAMERA")
        void openCamera(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback);

        void registerAvailabilityCallback(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback);

        void unregisterAvailabilityCallback(@NonNull CameraManager.AvailabilityCallback availabilityCallback);
    }

    public CameraManagerCompat(CameraManagerCompatImpl cameraManagerCompatImpl) {
        this.mImpl = cameraManagerCompatImpl;
    }

    public static CameraManagerCompat from(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new CameraManagerCompat(new CameraManagerCompatApi28Impl(context));
        }
        return new CameraManagerCompat(new CameraManagerCompatBaseImpl(context));
    }

    @RequiresPermission("android.permission.CAMERA")
    public void openCamera(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) {
        this.mImpl.openCamera(str, executor, stateCallback);
    }

    @SuppressLint({"LambdaLast"})
    public void registerAvailabilityCallback(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        this.mImpl.registerAvailabilityCallback(executor, availabilityCallback);
    }

    public void unregisterAvailabilityCallback(@NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        this.mImpl.unregisterAvailabilityCallback(availabilityCallback);
    }

    @NonNull
    public CameraManager unwrap() {
        return this.mImpl.getCameraManager();
    }
}
