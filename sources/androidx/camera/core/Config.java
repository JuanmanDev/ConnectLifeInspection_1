package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Set;

public interface Config {

    public interface ExtendableBuilder {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        MutableConfig getMutableConfig();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static abstract class Option<T> {
        public static <T> Option<T> create(String str, Class<?> cls) {
            return create(str, cls, (Object) null);
        }

        public abstract String getId();

        @Nullable
        public abstract Object getToken();

        public abstract Class<T> getValueClass();

        public static <T> Option<T> create(String str, Class<?> cls, @Nullable Object obj) {
            return new AutoValue_Config_Option(str, cls, obj);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OptionMatcher {
        boolean onOptionMatched(Option<?> option);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    boolean containsOption(Option<?> option);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    void findOptions(String str, OptionMatcher optionMatcher);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    Set<Option<?>> listOptions();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    <ValueT> ValueT retrieveOption(Option<ValueT> option);

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    <ValueT> ValueT retrieveOption(Option<ValueT> option, @Nullable ValueT valuet);
}
