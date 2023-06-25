package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraX;
import androidx.camera.core.Config;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface CameraDeviceConfig {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.Option<CameraX.LensFacing> OPTION_LENS_FACING = Config.Option.create("camerax.core.camera.lensFacing", CameraX.LensFacing.class);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface Builder<B> {
        B setLensFacing(CameraX.LensFacing lensFacing);
    }

    CameraX.LensFacing getLensFacing();

    @Nullable
    CameraX.LensFacing getLensFacing(@Nullable CameraX.LensFacing lensFacing);
}
