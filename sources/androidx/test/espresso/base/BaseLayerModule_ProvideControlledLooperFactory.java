package androidx.test.espresso.base;

import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import androidx.test.internal.platform.p032os.ControlledLooper;

public final class BaseLayerModule_ProvideControlledLooperFactory implements Factory<ControlledLooper> {
    public final BaseLayerModule module;

    public BaseLayerModule_ProvideControlledLooperFactory(BaseLayerModule baseLayerModule) {
        this.module = baseLayerModule;
    }

    public static BaseLayerModule_ProvideControlledLooperFactory create(BaseLayerModule baseLayerModule) {
        return new BaseLayerModule_ProvideControlledLooperFactory(baseLayerModule);
    }

    public static ControlledLooper provideControlledLooper(BaseLayerModule baseLayerModule) {
        return (ControlledLooper) Preconditions.checkNotNull(baseLayerModule.provideControlledLooper(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public ControlledLooper get() {
        return provideControlledLooper(this.module);
    }
}
