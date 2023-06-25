package androidx.test.espresso;

import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import androidx.test.espresso.remote.RemoteInteraction;

public final class ViewInteractionModule_ProvideRemoteInteractionFactory implements Factory<RemoteInteraction> {
    public final ViewInteractionModule module;

    public ViewInteractionModule_ProvideRemoteInteractionFactory(ViewInteractionModule viewInteractionModule) {
        this.module = viewInteractionModule;
    }

    public static ViewInteractionModule_ProvideRemoteInteractionFactory create(ViewInteractionModule viewInteractionModule) {
        return new ViewInteractionModule_ProvideRemoteInteractionFactory(viewInteractionModule);
    }

    public static RemoteInteraction provideRemoteInteraction(ViewInteractionModule viewInteractionModule) {
        return (RemoteInteraction) Preconditions.checkNotNull(viewInteractionModule.provideRemoteInteraction(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public RemoteInteraction get() {
        return provideRemoteInteraction(this.module);
    }
}
