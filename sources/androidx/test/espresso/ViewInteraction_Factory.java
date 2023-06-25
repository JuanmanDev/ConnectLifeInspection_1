package androidx.test.espresso;

import android.view.View;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.guava.util.concurrent.ListeningExecutorService;
import androidx.test.espresso.remote.RemoteInteraction;
import androidx.test.internal.platform.p032os.ControlledLooper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p625h.p626a.C9381a;
import p648m.p657c.C9623e;

public final class ViewInteraction_Factory implements Factory<ViewInteraction> {
    public final C9381a<ControlledLooper> controlledLooperProvider;
    public final C9381a<FailureHandler> failureHandlerProvider;
    public final C9381a<Executor> mainThreadExecutorProvider;
    public final C9381a<AtomicReference<Boolean>> needsActivityProvider;
    public final C9381a<ListeningExecutorService> remoteExecutorProvider;
    public final C9381a<RemoteInteraction> remoteInteractionProvider;
    public final C9381a<AtomicReference<C9623e<Root>>> rootMatcherRefProvider;
    public final C9381a<UiController> uiControllerProvider;
    public final C9381a<ViewFinder> viewFinderProvider;
    public final C9381a<C9623e<View>> viewMatcherProvider;

    public ViewInteraction_Factory(C9381a<UiController> aVar, C9381a<ViewFinder> aVar2, C9381a<Executor> aVar3, C9381a<FailureHandler> aVar4, C9381a<C9623e<View>> aVar5, C9381a<AtomicReference<C9623e<Root>>> aVar6, C9381a<AtomicReference<Boolean>> aVar7, C9381a<RemoteInteraction> aVar8, C9381a<ListeningExecutorService> aVar9, C9381a<ControlledLooper> aVar10) {
        this.uiControllerProvider = aVar;
        this.viewFinderProvider = aVar2;
        this.mainThreadExecutorProvider = aVar3;
        this.failureHandlerProvider = aVar4;
        this.viewMatcherProvider = aVar5;
        this.rootMatcherRefProvider = aVar6;
        this.needsActivityProvider = aVar7;
        this.remoteInteractionProvider = aVar8;
        this.remoteExecutorProvider = aVar9;
        this.controlledLooperProvider = aVar10;
    }

    public static ViewInteraction_Factory create(C9381a<UiController> aVar, C9381a<ViewFinder> aVar2, C9381a<Executor> aVar3, C9381a<FailureHandler> aVar4, C9381a<C9623e<View>> aVar5, C9381a<AtomicReference<C9623e<Root>>> aVar6, C9381a<AtomicReference<Boolean>> aVar7, C9381a<RemoteInteraction> aVar8, C9381a<ListeningExecutorService> aVar9, C9381a<ControlledLooper> aVar10) {
        return new ViewInteraction_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10);
    }

    public static ViewInteraction newInstance(UiController uiController, ViewFinder viewFinder, Executor executor, FailureHandler failureHandler, C9623e<View> eVar, AtomicReference<C9623e<Root>> atomicReference, AtomicReference<Boolean> atomicReference2, RemoteInteraction remoteInteraction, ListeningExecutorService listeningExecutorService, ControlledLooper controlledLooper) {
        return new ViewInteraction(uiController, viewFinder, executor, failureHandler, eVar, atomicReference, atomicReference2, remoteInteraction, listeningExecutorService, controlledLooper);
    }

    public ViewInteraction get() {
        return new ViewInteraction(this.uiControllerProvider.get(), this.viewFinderProvider.get(), this.mainThreadExecutorProvider.get(), this.failureHandlerProvider.get(), this.viewMatcherProvider.get(), this.rootMatcherRefProvider.get(), this.needsActivityProvider.get(), this.remoteInteractionProvider.get(), this.remoteExecutorProvider.get(), this.controlledLooperProvider.get());
    }
}
