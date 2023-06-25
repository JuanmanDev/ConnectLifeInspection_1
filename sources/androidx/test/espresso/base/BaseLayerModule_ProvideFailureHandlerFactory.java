package androidx.test.espresso.base;

import androidx.test.espresso.FailureHandler;
import androidx.test.espresso.base.BaseLayerModule;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import p625h.p626a.C9381a;

public final class BaseLayerModule_ProvideFailureHandlerFactory implements Factory<FailureHandler> {
    public final C9381a<BaseLayerModule.FailureHandlerHolder> holderProvider;
    public final BaseLayerModule module;

    public BaseLayerModule_ProvideFailureHandlerFactory(BaseLayerModule baseLayerModule, C9381a<BaseLayerModule.FailureHandlerHolder> aVar) {
        this.module = baseLayerModule;
        this.holderProvider = aVar;
    }

    public static BaseLayerModule_ProvideFailureHandlerFactory create(BaseLayerModule baseLayerModule, C9381a<BaseLayerModule.FailureHandlerHolder> aVar) {
        return new BaseLayerModule_ProvideFailureHandlerFactory(baseLayerModule, aVar);
    }

    public static FailureHandler provideFailureHandler(BaseLayerModule baseLayerModule, BaseLayerModule.FailureHandlerHolder failureHandlerHolder) {
        return (FailureHandler) Preconditions.checkNotNull(baseLayerModule.provideFailureHandler(failureHandlerHolder), "Cannot return null from a non-@Nullable @Provides method");
    }

    public FailureHandler get() {
        return provideFailureHandler(this.module, this.holderProvider.get());
    }
}
