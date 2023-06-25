package androidx.test.espresso.base;

import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import androidx.test.runner.lifecycle.ActivityLifecycleMonitor;

public final class BaseLayerModule_ProvideLifecycleMonitorFactory implements Factory<ActivityLifecycleMonitor> {
    public final BaseLayerModule module;

    public BaseLayerModule_ProvideLifecycleMonitorFactory(BaseLayerModule baseLayerModule) {
        this.module = baseLayerModule;
    }

    public static BaseLayerModule_ProvideLifecycleMonitorFactory create(BaseLayerModule baseLayerModule) {
        return new BaseLayerModule_ProvideLifecycleMonitorFactory(baseLayerModule);
    }

    public static ActivityLifecycleMonitor provideLifecycleMonitor(BaseLayerModule baseLayerModule) {
        return (ActivityLifecycleMonitor) Preconditions.checkNotNull(baseLayerModule.provideLifecycleMonitor(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public ActivityLifecycleMonitor get() {
        return provideLifecycleMonitor(this.module);
    }
}
