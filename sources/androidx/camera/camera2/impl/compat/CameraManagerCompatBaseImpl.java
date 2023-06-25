package androidx.camera.camera2.impl.compat;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.camera2.impl.compat.CameraDeviceCompat;
import androidx.camera.camera2.impl.compat.CameraManagerCompat;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@RequiresApi(21)
public class CameraManagerCompatBaseImpl implements CameraManagerCompat.CameraManagerCompatImpl {
    public final CameraManager mCameraManager;
    public final Object mObject;

    public static final class CameraManagerCompatParamsApi21 {
        @GuardedBy("mWrapperMap")
        public final Map<CameraManager.AvailabilityCallback, CameraManagerCompat.AvailabilityCallbackExecutorWrapper> mWrapperMap = new HashMap();
    }

    public CameraManagerCompatBaseImpl(@NonNull Context context, @Nullable Object obj) {
        this.mCameraManager = (CameraManager) context.getSystemService("camera");
        this.mObject = obj;
    }

    @NonNull
    public CameraManager getCameraManager() {
        return this.mCameraManager;
    }

    @RequiresPermission("android.permission.CAMERA")
    public void openCamera(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(stateCallback);
        this.mCameraManager.openCamera(str, new CameraDeviceCompat.StateCallbackExecutorWrapper(executor, stateCallback), MainThreadAsyncHandler.getInstance());
    }

    public void registerAvailabilityCallback(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        if (executor != null) {
            CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper = null;
            if (availabilityCallback != null) {
                CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (CameraManagerCompatParamsApi21) this.mObject;
                synchronized (cameraManagerCompatParamsApi21.mWrapperMap) {
                    CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper2 = cameraManagerCompatParamsApi21.mWrapperMap.get(availabilityCallback);
                    if (availabilityCallbackExecutorWrapper2 == null) {
                        availabilityCallbackExecutorWrapper2 = new CameraManagerCompat.AvailabilityCallbackExecutorWrapper(executor, availabilityCallback);
                        cameraManagerCompatParamsApi21.mWrapperMap.put(availabilityCallback, availabilityCallbackExecutorWrapper2);
                    }
                    availabilityCallbackExecutorWrapper = availabilityCallbackExecutorWrapper2;
                }
            }
            this.mCameraManager.registerAvailabilityCallback(availabilityCallbackExecutorWrapper, MainThreadAsyncHandler.getInstance());
            return;
        }
        throw new IllegalArgumentException("executor was null");
    }

    public void unregisterAvailabilityCallback(@NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper;
        if (availabilityCallback != null) {
            CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (CameraManagerCompatParamsApi21) this.mObject;
            synchronized (cameraManagerCompatParamsApi21.mWrapperMap) {
                availabilityCallbackExecutorWrapper = cameraManagerCompatParamsApi21.mWrapperMap.remove(availabilityCallback);
            }
        } else {
            availabilityCallbackExecutorWrapper = null;
        }
        this.mCameraManager.unregisterAvailabilityCallback(availabilityCallbackExecutorWrapper);
    }

    public CameraManagerCompatBaseImpl(@NonNull Context context) {
        this.mCameraManager = (CameraManager) context.getSystemService("camera");
        this.mObject = new CameraManagerCompatParamsApi21();
    }
}
