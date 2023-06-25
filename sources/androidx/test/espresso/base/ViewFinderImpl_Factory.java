package androidx.test.espresso.base;

import android.view.View;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import p625h.p626a.C9381a;
import p648m.p657c.C9623e;

public final class ViewFinderImpl_Factory implements Factory<ViewFinderImpl> {
    public final C9381a<View> rootViewProvider;
    public final C9381a<C9623e<View>> viewMatcherProvider;

    public ViewFinderImpl_Factory(C9381a<C9623e<View>> aVar, C9381a<View> aVar2) {
        this.viewMatcherProvider = aVar;
        this.rootViewProvider = aVar2;
    }

    public static ViewFinderImpl_Factory create(C9381a<C9623e<View>> aVar, C9381a<View> aVar2) {
        return new ViewFinderImpl_Factory(aVar, aVar2);
    }

    public static ViewFinderImpl newInstance(C9623e<View> eVar, C9381a<View> aVar) {
        return new ViewFinderImpl(eVar, aVar);
    }

    public ViewFinderImpl get() {
        return new ViewFinderImpl(this.viewMatcherProvider.get(), this.rootViewProvider);
    }
}
