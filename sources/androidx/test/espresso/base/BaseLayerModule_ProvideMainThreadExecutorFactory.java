package androidx.test.espresso.base;

import android.os.Looper;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import java.util.concurrent.Executor;
import p625h.p626a.C9381a;

public final class BaseLayerModule_ProvideMainThreadExecutorFactory implements Factory<Executor> {
    public final C9381a<Looper> mainLooperProvider;
    public final BaseLayerModule module;

    public BaseLayerModule_ProvideMainThreadExecutorFactory(BaseLayerModule baseLayerModule, C9381a<Looper> aVar) {
        this.module = baseLayerModule;
        this.mainLooperProvider = aVar;
    }

    public static BaseLayerModule_ProvideMainThreadExecutorFactory create(BaseLayerModule baseLayerModule, C9381a<Looper> aVar) {
        return new BaseLayerModule_ProvideMainThreadExecutorFactory(baseLayerModule, aVar);
    }

    public static Executor provideMainThreadExecutor(BaseLayerModule baseLayerModule, Looper looper) {
        return (Executor) Preconditions.checkNotNull(baseLayerModule.provideMainThreadExecutor(looper), "Cannot return null from a non-@Nullable @Provides method");
    }

    public Executor get() {
        return provideMainThreadExecutor(this.module, this.mainLooperProvider.get());
    }
}
