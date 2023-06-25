package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureResult;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraCaptureResult;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Camera2CameraCaptureResultConverter {
    public static CaptureResult getCaptureResult(CameraCaptureResult cameraCaptureResult) {
        if (cameraCaptureResult instanceof Camera2CameraCaptureResult) {
            return ((Camera2CameraCaptureResult) cameraCaptureResult).getCaptureResult();
        }
        return null;
    }
}
