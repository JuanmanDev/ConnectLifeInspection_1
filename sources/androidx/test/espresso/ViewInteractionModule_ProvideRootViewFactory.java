package androidx.test.espresso;

import android.view.View;
import androidx.test.espresso.base.RootViewPicker;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import p625h.p626a.C9381a;

public final class ViewInteractionModule_ProvideRootViewFactory implements Factory<View> {
    public final ViewInteractionModule module;
    public final C9381a<RootViewPicker> rootViewPickerProvider;

    public ViewInteractionModule_ProvideRootViewFactory(ViewInteractionModule viewInteractionModule, C9381a<RootViewPicker> aVar) {
        this.module = viewInteractionModule;
        this.rootViewPickerProvider = aVar;
    }

    public static ViewInteractionModule_ProvideRootViewFactory create(ViewInteractionModule viewInteractionModule, C9381a<RootViewPicker> aVar) {
        return new ViewInteractionModule_ProvideRootViewFactory(viewInteractionModule, aVar);
    }

    public static View provideRootView(ViewInteractionModule viewInteractionModule, RootViewPicker rootViewPicker) {
        return (View) Preconditions.checkNotNull(viewInteractionModule.provideRootView(rootViewPicker), "Cannot return null from a non-@Nullable @Provides method");
    }

    public View get() {
        return provideRootView(this.module, this.rootViewPickerProvider.get());
    }
}
