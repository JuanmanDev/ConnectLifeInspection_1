package androidx.camera.camera2.impl;

import androidx.annotation.RestrictTo;
import androidx.camera.core.CaptureConfig;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class CameraEventCallback {
    public CaptureConfig onDisableSession() {
        return null;
    }

    public CaptureConfig onEnableSession() {
        return null;
    }

    public CaptureConfig onPresetSession() {
        return null;
    }

    public CaptureConfig onRepeating() {
        return null;
    }
}
