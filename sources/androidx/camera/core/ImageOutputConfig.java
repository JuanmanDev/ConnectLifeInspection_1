package androidx.camera.core;

import android.util.Rational;
import android.util.Size;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Config;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ImageOutputConfig {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int INVALID_ROTATION = -1;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.Option<Size> OPTION_MAX_RESOLUTION = Config.Option.create("camerax.core.imageOutput.maxResolution", Size.class);
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.Option<Rational> OPTION_TARGET_ASPECT_RATIO = Config.Option.create("camerax.core.imageOutput.targetAspectRatio", Rational.class);
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.Option<Size> OPTION_TARGET_RESOLUTION = Config.Option.create("camerax.core.imageOutput.targetResolution", Size.class);
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.Option<Integer> OPTION_TARGET_ROTATION = Config.Option.create("camerax.core.imageOutput.targetRotation", Integer.TYPE);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface Builder<B> {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        B setMaxResolution(Size size);

        B setTargetAspectRatio(Rational rational);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        B setTargetResolution(Size size);

        B setTargetRotation(int i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RotationValue {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    Size getMaxResolution();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    Size getMaxResolution(Size size);

    Rational getTargetAspectRatio();

    @Nullable
    Rational getTargetAspectRatio(@Nullable Rational rational);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    Size getTargetResolution();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    Size getTargetResolution(Size size);

    int getTargetRotation();

    int getTargetRotation(int i);
}
