package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCaptureSession;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraCaptureCallback;

public final class CaptureCallbackContainer extends CameraCaptureCallback {
    public final CameraCaptureSession.CaptureCallback mCaptureCallback;

    public CaptureCallbackContainer(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.mCaptureCallback = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }

    public static CaptureCallbackContainer create(CameraCaptureSession.CaptureCallback captureCallback) {
        return new CaptureCallbackContainer(captureCallback);
    }

    @NonNull
    public CameraCaptureSession.CaptureCallback getCaptureCallback() {
        return this.mCaptureCallback;
    }
}
