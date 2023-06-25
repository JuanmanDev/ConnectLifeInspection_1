package androidx.test.espresso.base;

import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import p625h.p626a.C9381a;

public final class BaseLayerModule_ProvideSdkAsyncTaskMonitorFactory implements Factory<IdleNotifier<Runnable>> {
    public final C9381a<ThreadPoolExecutorExtractor> extractorProvider;
    public final BaseLayerModule module;

    public BaseLayerModule_ProvideSdkAsyncTaskMonitorFactory(BaseLayerModule baseLayerModule, C9381a<ThreadPoolExecutorExtractor> aVar) {
        this.module = baseLayerModule;
        this.extractorProvider = aVar;
    }

    public static BaseLayerModule_ProvideSdkAsyncTaskMonitorFactory create(BaseLayerModule baseLayerModule, C9381a<ThreadPoolExecutorExtractor> aVar) {
        return new BaseLayerModule_ProvideSdkAsyncTaskMonitorFactory(baseLayerModule, aVar);
    }

    public static IdleNotifier<Runnable> provideSdkAsyncTaskMonitor(BaseLayerModule baseLayerModule, Object obj) {
        return (IdleNotifier) Preconditions.checkNotNull(baseLayerModule.provideSdkAsyncTaskMonitor((ThreadPoolExecutorExtractor) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    public IdleNotifier<Runnable> get() {
        return provideSdkAsyncTaskMonitor(this.module, this.extractorProvider.get());
    }
}
