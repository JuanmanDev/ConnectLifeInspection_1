package androidx.test.espresso;

import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

public final class ViewInteractionModule_ProvideNeedsActivityFactory implements Factory<AtomicReference<Boolean>> {
    public final ViewInteractionModule module;

    public ViewInteractionModule_ProvideNeedsActivityFactory(ViewInteractionModule viewInteractionModule) {
        this.module = viewInteractionModule;
    }

    public static ViewInteractionModule_ProvideNeedsActivityFactory create(ViewInteractionModule viewInteractionModule) {
        return new ViewInteractionModule_ProvideNeedsActivityFactory(viewInteractionModule);
    }

    public static AtomicReference<Boolean> provideNeedsActivity(ViewInteractionModule viewInteractionModule) {
        return (AtomicReference) Preconditions.checkNotNull(viewInteractionModule.provideNeedsActivity(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public AtomicReference<Boolean> get() {
        return provideNeedsActivity(this.module);
    }
}
