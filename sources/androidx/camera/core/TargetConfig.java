package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Config;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface TargetConfig<T> {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.Option<Class<?>> OPTION_TARGET_CLASS = Config.Option.create("camerax.core.target.class", Class.class);
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.Option<String> OPTION_TARGET_NAME = Config.Option.create("camerax.core.target.name", String.class);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface Builder<T, B> {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        B setTargetClass(Class<T> cls);

        B setTargetName(String str);
    }

    Class<T> getTargetClass();

    @Nullable
    Class<T> getTargetClass(@Nullable Class<T> cls);

    String getTargetName();

    @Nullable
    String getTargetName(@Nullable String str);
}
