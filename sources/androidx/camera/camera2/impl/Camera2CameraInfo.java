package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraOrientationUtil;
import androidx.camera.core.CameraX;
import androidx.core.util.Preconditions;

public final class Camera2CameraInfo implements CameraInfo {
    public static final String TAG = "Camera2CameraInfo";
    public final CameraCharacteristics mCameraCharacteristics;

    public Camera2CameraInfo(CameraManager cameraManager, String str) {
        try {
            this.mCameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            checkCharacteristicAvailable(CameraCharacteristics.SENSOR_ORIENTATION, "Sensor orientation");
            checkCharacteristicAvailable(CameraCharacteristics.LENS_FACING, "Lens facing direction");
            checkCharacteristicAvailable(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, "Supported hardware level");
            logDeviceInfo();
        } catch (CameraAccessException e) {
            throw new CameraInfoUnavailableException("Unable to retrieve info for camera " + str, e);
        }
    }

    private void checkCharacteristicAvailable(CameraCharacteristics.Key<?> key, String str) {
        if (this.mCameraCharacteristics.get(key) == null) {
            throw new CameraInfoUnavailableException("Camera characteristics map is missing value for characteristic: " + str);
        }
    }

    private void logDeviceInfo() {
        logDeviceLevel();
    }

    private void logDeviceLevel() {
        String str;
        int supportedHardwareLevel = getSupportedHardwareLevel();
        if (supportedHardwareLevel == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (supportedHardwareLevel == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (supportedHardwareLevel == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (supportedHardwareLevel == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (supportedHardwareLevel != 4) {
            str = "Unknown value: " + supportedHardwareLevel;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        "Device Level: " + str;
    }

    @Nullable
    public CameraX.LensFacing getLensFacing() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        Preconditions.checkNotNull(num);
        int intValue = num.intValue();
        if (intValue == 0) {
            return CameraX.LensFacing.FRONT;
        }
        if (intValue != 1) {
            return null;
        }
        return CameraX.LensFacing.BACK;
    }

    public int getSensorRotationDegrees(int i) {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Preconditions.checkNotNull(num);
        return CameraOrientationUtil.getRelativeImageRotation(CameraOrientationUtil.surfaceRotationToDegrees(i), num.intValue(), CameraX.LensFacing.BACK.equals(getLensFacing()));
    }

    public int getSupportedHardwareLevel() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Preconditions.checkNotNull(num);
        return num.intValue();
    }

    public int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }
}
