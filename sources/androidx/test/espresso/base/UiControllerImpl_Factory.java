package androidx.test.espresso.base;

import android.os.Looper;
import androidx.test.espresso.base.IdlingResourceRegistry;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import p625h.p626a.C9381a;

public final class UiControllerImpl_Factory implements Factory<UiControllerImpl> {
    public final C9381a<IdleNotifier<Runnable>> asyncIdleProvider;
    public final C9381a<IdleNotifier<Runnable>> compatIdleProvider;
    public final C9381a<IdleNotifier<IdlingResourceRegistry.IdleNotificationCallback>> dynamicIdleProvider;
    public final C9381a<EventInjector> eventInjectorProvider;
    public final C9381a<IdlingResourceRegistry> idlingResourceRegistryProvider;
    public final C9381a<Looper> mainLooperProvider;

    public UiControllerImpl_Factory(C9381a<EventInjector> aVar, C9381a<IdleNotifier<Runnable>> aVar2, C9381a<IdleNotifier<Runnable>> aVar3, C9381a<IdleNotifier<IdlingResourceRegistry.IdleNotificationCallback>> aVar4, C9381a<Looper> aVar5, C9381a<IdlingResourceRegistry> aVar6) {
        this.eventInjectorProvider = aVar;
        this.asyncIdleProvider = aVar2;
        this.compatIdleProvider = aVar3;
        this.dynamicIdleProvider = aVar4;
        this.mainLooperProvider = aVar5;
        this.idlingResourceRegistryProvider = aVar6;
    }

    public static UiControllerImpl_Factory create(C9381a<EventInjector> aVar, C9381a<IdleNotifier<Runnable>> aVar2, C9381a<IdleNotifier<Runnable>> aVar3, C9381a<IdleNotifier<IdlingResourceRegistry.IdleNotificationCallback>> aVar4, C9381a<Looper> aVar5, C9381a<IdlingResourceRegistry> aVar6) {
        return new UiControllerImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static UiControllerImpl newInstance(Object obj, Object obj2, Object obj3, C9381a<IdleNotifier<IdlingResourceRegistry.IdleNotificationCallback>> aVar, Looper looper, IdlingResourceRegistry idlingResourceRegistry) {
        return new UiControllerImpl((EventInjector) obj, (IdleNotifier) obj2, (IdleNotifier) obj3, aVar, looper, idlingResourceRegistry);
    }

    public UiControllerImpl get() {
        return new UiControllerImpl(this.eventInjectorProvider.get(), this.asyncIdleProvider.get(), this.compatIdleProvider.get(), this.dynamicIdleProvider, this.mainLooperProvider.get(), this.idlingResourceRegistryProvider.get());
    }
}
