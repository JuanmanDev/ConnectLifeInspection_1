package androidx.test.espresso.base;

import androidx.test.espresso.FailureHandler;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import p625h.p626a.C9381a;

public final class BaseLayerModule_ProvideFailureHanderFactory implements Factory<FailureHandler> {
    public final C9381a<DefaultFailureHandler> implProvider;
    public final BaseLayerModule module;

    public BaseLayerModule_ProvideFailureHanderFactory(BaseLayerModule baseLayerModule, C9381a<DefaultFailureHandler> aVar) {
        this.module = baseLayerModule;
        this.implProvider = aVar;
    }

    public static BaseLayerModule_ProvideFailureHanderFactory create(BaseLayerModule baseLayerModule, C9381a<DefaultFailureHandler> aVar) {
        return new BaseLayerModule_ProvideFailureHanderFactory(baseLayerModule, aVar);
    }

    public static FailureHandler provideFailureHander(BaseLayerModule baseLayerModule, DefaultFailureHandler defaultFailureHandler) {
        return (FailureHandler) Preconditions.checkNotNull(baseLayerModule.provideFailureHander(defaultFailureHandler), "Cannot return null from a non-@Nullable @Provides method");
    }

    public FailureHandler get() {
        return provideFailureHander(this.module, this.implProvider.get());
    }
}
