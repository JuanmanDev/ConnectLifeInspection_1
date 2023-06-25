package androidx.test.espresso.base;

import android.content.Context;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import p625h.p626a.C9381a;

public final class BaseLayerModule_ProvideDefaultFailureHanderFactory implements Factory<DefaultFailureHandler> {
    public final C9381a<Context> contextProvider;
    public final BaseLayerModule module;

    public BaseLayerModule_ProvideDefaultFailureHanderFactory(BaseLayerModule baseLayerModule, C9381a<Context> aVar) {
        this.module = baseLayerModule;
        this.contextProvider = aVar;
    }

    public static BaseLayerModule_ProvideDefaultFailureHanderFactory create(BaseLayerModule baseLayerModule, C9381a<Context> aVar) {
        return new BaseLayerModule_ProvideDefaultFailureHanderFactory(baseLayerModule, aVar);
    }

    public static DefaultFailureHandler provideDefaultFailureHander(BaseLayerModule baseLayerModule, Context context) {
        return (DefaultFailureHandler) Preconditions.checkNotNull(baseLayerModule.provideDefaultFailureHander(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public DefaultFailureHandler get() {
        return provideDefaultFailureHander(this.module, this.contextProvider.get());
    }
}
