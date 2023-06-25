package androidx.test.espresso.base;

import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import p625h.p626a.C9381a;

public final class BaseLayerModule_ProvideCompatAsyncTaskMonitorFactory implements Factory<IdleNotifier<Runnable>> {
    public final C9381a<ThreadPoolExecutorExtractor> extractorProvider;
    public final BaseLayerModule module;

    public BaseLayerModule_ProvideCompatAsyncTaskMonitorFactory(BaseLayerModule baseLayerModule, C9381a<ThreadPoolExecutorExtractor> aVar) {
        this.module = baseLayerModule;
        this.extractorProvider = aVar;
    }

    public static BaseLayerModule_ProvideCompatAsyncTaskMonitorFactory create(BaseLayerModule baseLayerModule, C9381a<ThreadPoolExecutorExtractor> aVar) {
        return new BaseLayerModule_ProvideCompatAsyncTaskMonitorFactory(baseLayerModule, aVar);
    }

    public static IdleNotifier<Runnable> provideCompatAsyncTaskMonitor(BaseLayerModule baseLayerModule, Object obj) {
        return (IdleNotifier) Preconditions.checkNotNull(baseLayerModule.provideCompatAsyncTaskMonitor((ThreadPoolExecutorExtractor) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    public IdleNotifier<Runnable> get() {
        return provideCompatAsyncTaskMonitor(this.module, this.extractorProvider.get());
    }
}
