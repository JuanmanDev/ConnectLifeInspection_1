package androidx.test.espresso.base;

import android.content.Context;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;

public final class BaseLayerModule_ProvideTargetContextFactory implements Factory<Context> {
    public final BaseLayerModule module;

    public BaseLayerModule_ProvideTargetContextFactory(BaseLayerModule baseLayerModule) {
        this.module = baseLayerModule;
    }

    public static BaseLayerModule_ProvideTargetContextFactory create(BaseLayerModule baseLayerModule) {
        return new BaseLayerModule_ProvideTargetContextFactory(baseLayerModule);
    }

    public static Context provideTargetContext(BaseLayerModule baseLayerModule) {
        return (Context) Preconditions.checkNotNull(baseLayerModule.provideTargetContext(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public Context get() {
        return provideTargetContext(this.module);
    }
}
