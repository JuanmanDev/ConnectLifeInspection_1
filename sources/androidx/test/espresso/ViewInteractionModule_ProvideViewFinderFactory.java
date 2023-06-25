package androidx.test.espresso;

import androidx.test.espresso.base.ViewFinderImpl;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import p625h.p626a.C9381a;

public final class ViewInteractionModule_ProvideViewFinderFactory implements Factory<ViewFinder> {
    public final C9381a<ViewFinderImpl> implProvider;
    public final ViewInteractionModule module;

    public ViewInteractionModule_ProvideViewFinderFactory(ViewInteractionModule viewInteractionModule, C9381a<ViewFinderImpl> aVar) {
        this.module = viewInteractionModule;
        this.implProvider = aVar;
    }

    public static ViewInteractionModule_ProvideViewFinderFactory create(ViewInteractionModule viewInteractionModule, C9381a<ViewFinderImpl> aVar) {
        return new ViewInteractionModule_ProvideViewFinderFactory(viewInteractionModule, aVar);
    }

    public static ViewFinder provideViewFinder(ViewInteractionModule viewInteractionModule, ViewFinderImpl viewFinderImpl) {
        return (ViewFinder) Preconditions.checkNotNull(viewInteractionModule.provideViewFinder(viewFinderImpl), "Cannot return null from a non-@Nullable @Provides method");
    }

    public ViewFinder get() {
        return provideViewFinder(this.module, this.implProvider.get());
    }
}
