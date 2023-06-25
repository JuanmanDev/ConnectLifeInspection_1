package androidx.test.espresso.base;

import androidx.test.espresso.base.IdlingResourceRegistry;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import p625h.p626a.C9381a;

public final class BaseLayerModule_ProvideDynamicNotiferFactory implements Factory<IdleNotifier<IdlingResourceRegistry.IdleNotificationCallback>> {
    public final C9381a<IdlingResourceRegistry> dynamicRegistryProvider;
    public final BaseLayerModule module;

    public BaseLayerModule_ProvideDynamicNotiferFactory(BaseLayerModule baseLayerModule, C9381a<IdlingResourceRegistry> aVar) {
        this.module = baseLayerModule;
        this.dynamicRegistryProvider = aVar;
    }

    public static BaseLayerModule_ProvideDynamicNotiferFactory create(BaseLayerModule baseLayerModule, C9381a<IdlingResourceRegistry> aVar) {
        return new BaseLayerModule_ProvideDynamicNotiferFactory(baseLayerModule, aVar);
    }

    public static IdleNotifier<IdlingResourceRegistry.IdleNotificationCallback> provideDynamicNotifer(BaseLayerModule baseLayerModule, IdlingResourceRegistry idlingResourceRegistry) {
        return (IdleNotifier) Preconditions.checkNotNull(baseLayerModule.provideDynamicNotifer(idlingResourceRegistry), "Cannot return null from a non-@Nullable @Provides method");
    }

    public IdleNotifier<IdlingResourceRegistry.IdleNotificationCallback> get() {
        return provideDynamicNotifer(this.module, this.dynamicRegistryProvider.get());
    }
}
