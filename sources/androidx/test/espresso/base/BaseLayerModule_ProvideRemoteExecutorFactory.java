package androidx.test.espresso.base;

import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.util.concurrent.ListeningExecutorService;

public final class BaseLayerModule_ProvideRemoteExecutorFactory implements Factory<ListeningExecutorService> {
    public final BaseLayerModule module;

    public BaseLayerModule_ProvideRemoteExecutorFactory(BaseLayerModule baseLayerModule) {
        this.module = baseLayerModule;
    }

    public static BaseLayerModule_ProvideRemoteExecutorFactory create(BaseLayerModule baseLayerModule) {
        return new BaseLayerModule_ProvideRemoteExecutorFactory(baseLayerModule);
    }

    public static ListeningExecutorService provideRemoteExecutor(BaseLayerModule baseLayerModule) {
        return (ListeningExecutorService) Preconditions.checkNotNull(baseLayerModule.provideRemoteExecutor(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public ListeningExecutorService get() {
        return provideRemoteExecutor(this.module);
    }
}
