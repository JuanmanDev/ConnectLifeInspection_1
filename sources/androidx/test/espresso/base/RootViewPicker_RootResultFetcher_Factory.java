package androidx.test.espresso.base;

import androidx.test.espresso.Root;
import androidx.test.espresso.base.RootViewPicker;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import java.util.concurrent.atomic.AtomicReference;
import p625h.p626a.C9381a;
import p648m.p657c.C9623e;

public final class RootViewPicker_RootResultFetcher_Factory implements Factory<RootViewPicker.RootResultFetcher> {
    public final C9381a<ActiveRootLister> activeRootListerProvider;
    public final C9381a<AtomicReference<C9623e<Root>>> rootMatcherRefProvider;

    public RootViewPicker_RootResultFetcher_Factory(C9381a<ActiveRootLister> aVar, C9381a<AtomicReference<C9623e<Root>>> aVar2) {
        this.activeRootListerProvider = aVar;
        this.rootMatcherRefProvider = aVar2;
    }

    public static RootViewPicker_RootResultFetcher_Factory create(C9381a<ActiveRootLister> aVar, C9381a<AtomicReference<C9623e<Root>>> aVar2) {
        return new RootViewPicker_RootResultFetcher_Factory(aVar, aVar2);
    }

    public static RootViewPicker.RootResultFetcher newInstance(ActiveRootLister activeRootLister, AtomicReference<C9623e<Root>> atomicReference) {
        return new RootViewPicker.RootResultFetcher(activeRootLister, atomicReference);
    }

    public RootViewPicker.RootResultFetcher get() {
        return new RootViewPicker.RootResultFetcher(this.activeRootListerProvider.get(), this.rootMatcherRefProvider.get());
    }
}
