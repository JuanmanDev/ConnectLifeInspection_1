package androidx.test.espresso.base;

import androidx.test.espresso.UiController;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import p625h.p626a.C9381a;

public final class UiControllerModule_ProvideUiControllerFactory implements Factory<UiController> {
    public final UiControllerModule module;
    public final C9381a<UiControllerImpl> uiControllerImplProvider;

    public UiControllerModule_ProvideUiControllerFactory(UiControllerModule uiControllerModule, C9381a<UiControllerImpl> aVar) {
        this.module = uiControllerModule;
        this.uiControllerImplProvider = aVar;
    }

    public static UiControllerModule_ProvideUiControllerFactory create(UiControllerModule uiControllerModule, C9381a<UiControllerImpl> aVar) {
        return new UiControllerModule_ProvideUiControllerFactory(uiControllerModule, aVar);
    }

    public static UiController provideUiController(UiControllerModule uiControllerModule, Object obj) {
        return (UiController) Preconditions.checkNotNull(uiControllerModule.provideUiController((UiControllerImpl) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    public UiController get() {
        return provideUiController(this.module, this.uiControllerImplProvider.get());
    }
}
