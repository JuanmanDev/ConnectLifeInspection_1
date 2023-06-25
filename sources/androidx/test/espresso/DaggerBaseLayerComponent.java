package androidx.test.espresso;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.test.espresso.base.ActiveRootLister;
import androidx.test.espresso.base.BaseLayerModule;
import androidx.test.espresso.base.BaseLayerModule_FailureHandlerHolder_Factory;
import androidx.test.espresso.base.BaseLayerModule_ProvideActiveRootListerFactory;
import androidx.test.espresso.base.BaseLayerModule_ProvideCompatAsyncTaskMonitorFactory;
import androidx.test.espresso.base.BaseLayerModule_ProvideControlledLooperFactory;
import androidx.test.espresso.base.BaseLayerModule_ProvideDefaultFailureHanderFactory;
import androidx.test.espresso.base.BaseLayerModule_ProvideDynamicNotiferFactory;
import androidx.test.espresso.base.BaseLayerModule_ProvideEventInjectorFactory;
import androidx.test.espresso.base.BaseLayerModule_ProvideFailureHanderFactory;
import androidx.test.espresso.base.BaseLayerModule_ProvideFailureHandlerFactory;
import androidx.test.espresso.base.BaseLayerModule_ProvideLifecycleMonitorFactory;
import androidx.test.espresso.base.BaseLayerModule_ProvideMainLooperFactory;
import androidx.test.espresso.base.BaseLayerModule_ProvideMainThreadExecutorFactory;
import androidx.test.espresso.base.BaseLayerModule_ProvideRemoteExecutorFactory;
import androidx.test.espresso.base.BaseLayerModule_ProvideSdkAsyncTaskMonitorFactory;
import androidx.test.espresso.base.BaseLayerModule_ProvideTargetContextFactory;
import androidx.test.espresso.base.DefaultFailureHandler;
import androidx.test.espresso.base.IdlingResourceRegistry;
import androidx.test.espresso.base.IdlingResourceRegistry_Factory;
import androidx.test.espresso.base.RootViewPicker;
import androidx.test.espresso.base.RootViewPicker_Factory;
import androidx.test.espresso.base.RootViewPicker_RootResultFetcher_Factory;
import androidx.test.espresso.base.RootsOracle_Factory;
import androidx.test.espresso.base.ThreadPoolExecutorExtractor_Factory;
import androidx.test.espresso.base.UiControllerImpl_Factory;
import androidx.test.espresso.base.UiControllerModule;
import androidx.test.espresso.base.UiControllerModule_ProvideUiControllerFactory;
import androidx.test.espresso.base.ViewFinderImpl;
import androidx.test.espresso.base.ViewFinderImpl_Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.DoubleCheck;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.util.concurrent.ListeningExecutorService;
import androidx.test.internal.platform.p032os.ControlledLooper;
import androidx.test.runner.lifecycle.ActivityLifecycleMonitor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p625h.p626a.C9381a;
import p648m.p657c.C9623e;

public final class DaggerBaseLayerComponent implements BaseLayerComponent {
    public final BaseLayerModule baseLayerModule;
    public C9381a<BaseLayerModule.FailureHandlerHolder> failureHandlerHolderProvider;
    public C9381a<IdlingResourceRegistry> idlingResourceRegistryProvider;
    public C9381a<ActiveRootLister> provideActiveRootListerProvider;
    public C9381a provideCompatAsyncTaskMonitorProvider;
    public C9381a<ControlledLooper> provideControlledLooperProvider;
    public C9381a<DefaultFailureHandler> provideDefaultFailureHanderProvider;
    public C9381a provideDynamicNotiferProvider;
    public C9381a provideEventInjectorProvider;
    public C9381a<FailureHandler> provideFailureHanderProvider;
    public C9381a<ActivityLifecycleMonitor> provideLifecycleMonitorProvider;
    public C9381a<Looper> provideMainLooperProvider;
    public C9381a<Executor> provideMainThreadExecutorProvider;
    public C9381a<ListeningExecutorService> provideRemoteExecutorProvider;
    public C9381a provideSdkAsyncTaskMonitorProvider;
    public C9381a<Context> provideTargetContextProvider;
    public C9381a<UiController> provideUiControllerProvider;
    public C9381a rootsOracleProvider;
    public C9381a threadPoolExecutorExtractorProvider;
    public C9381a uiControllerImplProvider;

    public static final class Builder {
        public BaseLayerModule baseLayerModule;
        public UiControllerModule uiControllerModule;

        public Builder baseLayerModule(BaseLayerModule baseLayerModule2) {
            this.baseLayerModule = (BaseLayerModule) Preconditions.checkNotNull(baseLayerModule2);
            return this;
        }

        public BaseLayerComponent build() {
            if (this.baseLayerModule == null) {
                this.baseLayerModule = new BaseLayerModule();
            }
            if (this.uiControllerModule == null) {
                this.uiControllerModule = new UiControllerModule();
            }
            return new DaggerBaseLayerComponent(this.baseLayerModule, this.uiControllerModule);
        }

        public Builder uiControllerModule(UiControllerModule uiControllerModule2) {
            this.uiControllerModule = (UiControllerModule) Preconditions.checkNotNull(uiControllerModule2);
            return this;
        }

        public Builder() {
        }
    }

    public final class ViewInteractionComponentImpl implements ViewInteractionComponent {
        public C9381a<AtomicReference<Boolean>> provideNeedsActivityProvider;
        public C9381a<AtomicReference<C9623e<Root>>> provideRootMatcherProvider;
        public C9381a<View> provideRootViewProvider;
        public C9381a rootResultFetcherProvider;
        public C9381a<RootViewPicker> rootViewPickerProvider;
        public final ViewInteractionModule viewInteractionModule;

        private ViewFinder getViewFinder() {
            return ViewInteractionModule_ProvideViewFinderFactory.provideViewFinder(this.viewInteractionModule, getViewFinderImpl());
        }

        private ViewFinderImpl getViewFinderImpl() {
            return ViewFinderImpl_Factory.newInstance(ViewInteractionModule_ProvideViewMatcherFactory.provideViewMatcher(this.viewInteractionModule), this.provideRootViewProvider);
        }

        private void initialize(ViewInteractionModule viewInteractionModule2) {
            this.provideRootMatcherProvider = ViewInteractionModule_ProvideRootMatcherFactory.create(viewInteractionModule2);
            this.rootResultFetcherProvider = RootViewPicker_RootResultFetcher_Factory.create(DaggerBaseLayerComponent.this.provideActiveRootListerProvider, this.provideRootMatcherProvider);
            this.provideNeedsActivityProvider = ViewInteractionModule_ProvideNeedsActivityFactory.create(viewInteractionModule2);
            C9381a<RootViewPicker> provider = DoubleCheck.provider(RootViewPicker_Factory.create(DaggerBaseLayerComponent.this.provideUiControllerProvider, this.rootResultFetcherProvider, DaggerBaseLayerComponent.this.provideLifecycleMonitorProvider, this.provideNeedsActivityProvider, DaggerBaseLayerComponent.this.provideControlledLooperProvider));
            this.rootViewPickerProvider = provider;
            this.provideRootViewProvider = ViewInteractionModule_ProvideRootViewFactory.create(viewInteractionModule2, provider);
        }

        public ViewInteraction viewInteraction() {
            return new ViewInteraction((UiController) DaggerBaseLayerComponent.this.provideUiControllerProvider.get(), getViewFinder(), (Executor) DaggerBaseLayerComponent.this.provideMainThreadExecutorProvider.get(), DaggerBaseLayerComponent.this.failureHandler(), ViewInteractionModule_ProvideViewMatcherFactory.provideViewMatcher(this.viewInteractionModule), ViewInteractionModule_ProvideRootMatcherFactory.provideRootMatcher(this.viewInteractionModule), ViewInteractionModule_ProvideNeedsActivityFactory.provideNeedsActivity(this.viewInteractionModule), ViewInteractionModule_ProvideRemoteInteractionFactory.provideRemoteInteraction(this.viewInteractionModule), (ListeningExecutorService) DaggerBaseLayerComponent.this.provideRemoteExecutorProvider.get(), (ControlledLooper) DaggerBaseLayerComponent.this.provideControlledLooperProvider.get());
        }

        public ViewInteractionComponentImpl(ViewInteractionModule viewInteractionModule2) {
            this.viewInteractionModule = viewInteractionModule2;
            initialize(viewInteractionModule2);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BaseLayerComponent create() {
        return new Builder().build();
    }

    private Object getRootsOracle() {
        return RootsOracle_Factory.newInstance(this.provideMainLooperProvider.get());
    }

    private void initialize(BaseLayerModule baseLayerModule2, UiControllerModule uiControllerModule) {
        BaseLayerModule_ProvideTargetContextFactory create = BaseLayerModule_ProvideTargetContextFactory.create(baseLayerModule2);
        this.provideTargetContextProvider = create;
        BaseLayerModule_ProvideDefaultFailureHanderFactory create2 = BaseLayerModule_ProvideDefaultFailureHanderFactory.create(baseLayerModule2, create);
        this.provideDefaultFailureHanderProvider = create2;
        BaseLayerModule_ProvideFailureHanderFactory create3 = BaseLayerModule_ProvideFailureHanderFactory.create(baseLayerModule2, create2);
        this.provideFailureHanderProvider = create3;
        this.failureHandlerHolderProvider = DoubleCheck.provider(BaseLayerModule_FailureHandlerHolder_Factory.create(create3));
        C9381a<Looper> provider = DoubleCheck.provider(BaseLayerModule_ProvideMainLooperFactory.create(baseLayerModule2));
        this.provideMainLooperProvider = provider;
        this.idlingResourceRegistryProvider = DoubleCheck.provider(IdlingResourceRegistry_Factory.create(provider));
        this.provideEventInjectorProvider = DoubleCheck.provider(BaseLayerModule_ProvideEventInjectorFactory.create(baseLayerModule2));
        C9381a provider2 = DoubleCheck.provider(ThreadPoolExecutorExtractor_Factory.create(this.provideMainLooperProvider));
        this.threadPoolExecutorExtractorProvider = provider2;
        this.provideSdkAsyncTaskMonitorProvider = DoubleCheck.provider(BaseLayerModule_ProvideSdkAsyncTaskMonitorFactory.create(baseLayerModule2, provider2));
        this.provideCompatAsyncTaskMonitorProvider = DoubleCheck.provider(BaseLayerModule_ProvideCompatAsyncTaskMonitorFactory.create(baseLayerModule2, this.threadPoolExecutorExtractorProvider));
        BaseLayerModule_ProvideDynamicNotiferFactory create4 = BaseLayerModule_ProvideDynamicNotiferFactory.create(baseLayerModule2, this.idlingResourceRegistryProvider);
        this.provideDynamicNotiferProvider = create4;
        C9381a provider3 = DoubleCheck.provider(UiControllerImpl_Factory.create(this.provideEventInjectorProvider, this.provideSdkAsyncTaskMonitorProvider, this.provideCompatAsyncTaskMonitorProvider, create4, this.provideMainLooperProvider, this.idlingResourceRegistryProvider));
        this.uiControllerImplProvider = provider3;
        this.provideUiControllerProvider = DoubleCheck.provider(UiControllerModule_ProvideUiControllerFactory.create(uiControllerModule, provider3));
        this.provideMainThreadExecutorProvider = DoubleCheck.provider(BaseLayerModule_ProvideMainThreadExecutorFactory.create(baseLayerModule2, this.provideMainLooperProvider));
        this.provideControlledLooperProvider = DoubleCheck.provider(BaseLayerModule_ProvideControlledLooperFactory.create(baseLayerModule2));
        RootsOracle_Factory create5 = RootsOracle_Factory.create(this.provideMainLooperProvider);
        this.rootsOracleProvider = create5;
        this.provideActiveRootListerProvider = BaseLayerModule_ProvideActiveRootListerFactory.create(baseLayerModule2, create5);
        this.provideLifecycleMonitorProvider = BaseLayerModule_ProvideLifecycleMonitorFactory.create(baseLayerModule2);
        this.provideRemoteExecutorProvider = DoubleCheck.provider(BaseLayerModule_ProvideRemoteExecutorFactory.create(baseLayerModule2));
    }

    public ActiveRootLister activeRootLister() {
        return BaseLayerModule_ProvideActiveRootListerFactory.provideActiveRootLister(this.baseLayerModule, getRootsOracle());
    }

    public ControlledLooper controlledLooper() {
        return this.provideControlledLooperProvider.get();
    }

    public FailureHandler failureHandler() {
        return BaseLayerModule_ProvideFailureHandlerFactory.provideFailureHandler(this.baseLayerModule, this.failureHandlerHolderProvider.get());
    }

    public BaseLayerModule.FailureHandlerHolder failureHolder() {
        return this.failureHandlerHolderProvider.get();
    }

    public IdlingResourceRegistry idlingResourceRegistry() {
        return this.idlingResourceRegistryProvider.get();
    }

    public Executor mainThreadExecutor() {
        return this.provideMainThreadExecutorProvider.get();
    }

    public ViewInteractionComponent plus(ViewInteractionModule viewInteractionModule) {
        Preconditions.checkNotNull(viewInteractionModule);
        return new ViewInteractionComponentImpl(viewInteractionModule);
    }

    public UiController uiController() {
        return this.provideUiControllerProvider.get();
    }

    public DaggerBaseLayerComponent(BaseLayerModule baseLayerModule2, UiControllerModule uiControllerModule) {
        this.baseLayerModule = baseLayerModule2;
        initialize(baseLayerModule2, uiControllerModule);
    }
}
