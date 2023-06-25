package androidx.camera.core;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CameraCaptureFailure {
    public final Reason mReason;

    public enum Reason {
        ERROR
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraCaptureFailure(Reason reason) {
        this.mReason = reason;
    }

    public Reason getReason() {
        return this.mReason;
    }
}
