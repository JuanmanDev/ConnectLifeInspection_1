package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Config;
import androidx.camera.core.UseCase;

public interface UseCaseEventConfig {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.Option<UseCase.EventListener> OPTION_USE_CASE_EVENT_LISTENER = Config.Option.create("camerax.core.useCaseEventListener", UseCase.EventListener.class);

    public interface Builder<B> {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        B setUseCaseEventListener(UseCase.EventListener eventListener);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    UseCase.EventListener getUseCaseEventListener();

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    UseCase.EventListener getUseCaseEventListener(@Nullable UseCase.EventListener eventListener);
}
