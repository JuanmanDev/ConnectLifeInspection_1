package androidx.test.espresso.base;

import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;

public final class BaseLayerModule_ProvideEventInjectorFactory implements Factory<EventInjector> {
    public final BaseLayerModule module;

    public BaseLayerModule_ProvideEventInjectorFactory(BaseLayerModule baseLayerModule) {
        this.module = baseLayerModule;
    }

    public static BaseLayerModule_ProvideEventInjectorFactory create(BaseLayerModule baseLayerModule) {
        return new BaseLayerModule_ProvideEventInjectorFactory(baseLayerModule);
    }

    public static EventInjector provideEventInjector(BaseLayerModule baseLayerModule) {
        return (EventInjector) Preconditions.checkNotNull(baseLayerModule.provideEventInjector(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public EventInjector get() {
        return provideEventInjector(this.module);
    }
}
