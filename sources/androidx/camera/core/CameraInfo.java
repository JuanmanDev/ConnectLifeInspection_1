package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraX;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface CameraInfo {
    @Nullable
    CameraX.LensFacing getLensFacing();

    int getSensorRotationDegrees();

    int getSensorRotationDegrees(int i);
}
