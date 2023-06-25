package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Config;

public interface MutableConfig extends Config {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    <ValueT> void insertOption(Config.Option<ValueT> option, ValueT valuet);

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    <ValueT> ValueT removeOption(Config.Option<ValueT> option);
}
