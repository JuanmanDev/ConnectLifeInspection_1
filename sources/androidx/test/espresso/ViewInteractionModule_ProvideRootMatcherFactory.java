package androidx.test.espresso;

import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;
import p648m.p657c.C9623e;

public final class ViewInteractionModule_ProvideRootMatcherFactory implements Factory<AtomicReference<C9623e<Root>>> {
    public final ViewInteractionModule module;

    public ViewInteractionModule_ProvideRootMatcherFactory(ViewInteractionModule viewInteractionModule) {
        this.module = viewInteractionModule;
    }

    public static ViewInteractionModule_ProvideRootMatcherFactory create(ViewInteractionModule viewInteractionModule) {
        return new ViewInteractionModule_ProvideRootMatcherFactory(viewInteractionModule);
    }

    public static AtomicReference<C9623e<Root>> provideRootMatcher(ViewInteractionModule viewInteractionModule) {
        return (AtomicReference) Preconditions.checkNotNull(viewInteractionModule.provideRootMatcher(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public AtomicReference<C9623e<Root>> get() {
        return provideRootMatcher(this.module);
    }
}
