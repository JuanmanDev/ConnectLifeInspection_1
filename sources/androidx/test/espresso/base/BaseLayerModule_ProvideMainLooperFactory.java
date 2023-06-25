package androidx.test.espresso.base;

import android.os.Looper;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;

public final class BaseLayerModule_ProvideMainLooperFactory implements Factory<Looper> {
    public final BaseLayerModule module;

    public BaseLayerModule_ProvideMainLooperFactory(BaseLayerModule baseLayerModule) {
        this.module = baseLayerModule;
    }

    public static BaseLayerModule_ProvideMainLooperFactory create(BaseLayerModule baseLayerModule) {
        return new BaseLayerModule_ProvideMainLooperFactory(baseLayerModule);
    }

    public static Looper provideMainLooper(BaseLayerModule baseLayerModule) {
        return (Looper) Preconditions.checkNotNull(baseLayerModule.provideMainLooper(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public Looper get() {
        return provideMainLooper(this.module);
    }
}
