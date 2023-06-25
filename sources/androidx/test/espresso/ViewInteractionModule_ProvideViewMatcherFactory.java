package androidx.test.espresso;

import android.view.View;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import p648m.p657c.C9623e;

public final class ViewInteractionModule_ProvideViewMatcherFactory implements Factory<C9623e<View>> {
    public final ViewInteractionModule module;

    public ViewInteractionModule_ProvideViewMatcherFactory(ViewInteractionModule viewInteractionModule) {
        this.module = viewInteractionModule;
    }

    public static ViewInteractionModule_ProvideViewMatcherFactory create(ViewInteractionModule viewInteractionModule) {
        return new ViewInteractionModule_ProvideViewMatcherFactory(viewInteractionModule);
    }

    public static C9623e<View> provideViewMatcher(ViewInteractionModule viewInteractionModule) {
        return (C9623e) Preconditions.checkNotNull(viewInteractionModule.provideViewMatcher(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public C9623e<View> get() {
        return provideViewMatcher(this.module);
    }
}
