package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraX;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface CameraFactory {
    @Nullable
    String cameraIdForLensFacing(CameraX.LensFacing lensFacing);

    Set<String> getAvailableCameraIds();

    BaseCamera getCamera(String str);
}
