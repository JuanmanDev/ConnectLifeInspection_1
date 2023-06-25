package androidx.test.espresso;

import android.view.View;
import androidx.test.espresso.base.RootViewPicker;
import androidx.test.espresso.base.ViewFinderImpl;
import androidx.test.espresso.matcher.RootMatchers;
import androidx.test.espresso.remote.RemoteInteraction;
import androidx.test.espresso.remote.RemoteInteractionRegistry;
import java.util.concurrent.atomic.AtomicReference;
import p648m.p657c.C9623e;

public class ViewInteractionModule {
    public final AtomicReference<Boolean> needsActivity = new AtomicReference<>(Boolean.TRUE);
    public final AtomicReference<C9623e<Root>> rootMatcher = new AtomicReference<>(RootMatchers.DEFAULT);
    public final C9623e<View> viewMatcher;

    /* JADX WARNING: type inference failed for: r3v0, types: [m.c.e<android.view.View>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ViewInteractionModule(p648m.p657c.C9623e<android.view.View> r3) {
        /*
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            m.c.e<androidx.test.espresso.Root> r1 = androidx.test.espresso.matcher.RootMatchers.DEFAULT
            r0.<init>(r1)
            r2.rootMatcher = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.<init>(r1)
            r2.needsActivity = r0
            java.lang.Object r3 = androidx.test.espresso.core.internal.deps.guava.base.Preconditions.checkNotNull(r3)
            m.c.e r3 = (p648m.p657c.C9623e) r3
            r2.viewMatcher = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.espresso.ViewInteractionModule.<init>(m.c.e):void");
    }

    public AtomicReference<Boolean> provideNeedsActivity() {
        return this.needsActivity;
    }

    public RemoteInteraction provideRemoteInteraction() {
        return RemoteInteractionRegistry.getInstance();
    }

    public AtomicReference<C9623e<Root>> provideRootMatcher() {
        return this.rootMatcher;
    }

    public View provideRootView(RootViewPicker rootViewPicker) {
        return rootViewPicker.get();
    }

    public ViewFinder provideViewFinder(ViewFinderImpl viewFinderImpl) {
        return viewFinderImpl;
    }

    public C9623e<View> provideViewMatcher() {
        return this.viewMatcher;
    }
}
