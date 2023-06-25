package androidx.test.espresso.base;

import androidx.test.espresso.UiController;
import androidx.test.espresso.base.RootViewPicker;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.internal.platform.p032os.ControlledLooper;
import androidx.test.runner.lifecycle.ActivityLifecycleMonitor;
import java.util.concurrent.atomic.AtomicReference;
import p625h.p626a.C9381a;

public final class RootViewPicker_Factory implements Factory<RootViewPicker> {
    public final C9381a<ActivityLifecycleMonitor> activityLifecycleMonitorProvider;
    public final C9381a<ControlledLooper> controlledLooperProvider;
    public final C9381a<AtomicReference<Boolean>> needsActivityProvider;
    public final C9381a<RootViewPicker.RootResultFetcher> rootResultFetcherProvider;
    public final C9381a<UiController> uiControllerProvider;

    public RootViewPicker_Factory(C9381a<UiController> aVar, C9381a<RootViewPicker.RootResultFetcher> aVar2, C9381a<ActivityLifecycleMonitor> aVar3, C9381a<AtomicReference<Boolean>> aVar4, C9381a<ControlledLooper> aVar5) {
        this.uiControllerProvider = aVar;
        this.rootResultFetcherProvider = aVar2;
        this.activityLifecycleMonitorProvider = aVar3;
        this.needsActivityProvider = aVar4;
        this.controlledLooperProvider = aVar5;
    }

    public static RootViewPicker_Factory create(C9381a<UiController> aVar, C9381a<RootViewPicker.RootResultFetcher> aVar2, C9381a<ActivityLifecycleMonitor> aVar3, C9381a<AtomicReference<Boolean>> aVar4, C9381a<ControlledLooper> aVar5) {
        return new RootViewPicker_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static RootViewPicker newInstance(UiController uiController, Object obj, ActivityLifecycleMonitor activityLifecycleMonitor, AtomicReference<Boolean> atomicReference, ControlledLooper controlledLooper) {
        return new RootViewPicker(uiController, (RootViewPicker.RootResultFetcher) obj, activityLifecycleMonitor, atomicReference, controlledLooper);
    }

    public RootViewPicker get() {
        return new RootViewPicker(this.uiControllerProvider.get(), this.rootResultFetcherProvider.get(), this.activityLifecycleMonitorProvider.get(), this.needsActivityProvider.get(), this.controlledLooperProvider.get());
    }
}
