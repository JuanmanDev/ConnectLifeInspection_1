package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraX;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface UseCaseConfigFactory {
    @Nullable
    <C extends UseCaseConfig<?>> C getConfig(Class<C> cls, CameraX.LensFacing lensFacing);
}
