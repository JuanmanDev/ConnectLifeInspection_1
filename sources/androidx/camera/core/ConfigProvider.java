package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraX;
import androidx.camera.core.Config;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ConfigProvider<C extends Config> {
    C getConfig(CameraX.LensFacing lensFacing);
}
