package androidx.test.espresso.base;

import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions;
import p625h.p626a.C9381a;

public final class BaseLayerModule_ProvideActiveRootListerFactory implements Factory<ActiveRootLister> {
    public final BaseLayerModule module;
    public final C9381a<RootsOracle> rootsOracleProvider;

    public BaseLayerModule_ProvideActiveRootListerFactory(BaseLayerModule baseLayerModule, C9381a<RootsOracle> aVar) {
        this.module = baseLayerModule;
        this.rootsOracleProvider = aVar;
    }

    public static BaseLayerModule_ProvideActiveRootListerFactory create(BaseLayerModule baseLayerModule, C9381a<RootsOracle> aVar) {
        return new BaseLayerModule_ProvideActiveRootListerFactory(baseLayerModule, aVar);
    }

    public static ActiveRootLister provideActiveRootLister(BaseLayerModule baseLayerModule, Object obj) {
        return (ActiveRootLister) Preconditions.checkNotNull(baseLayerModule.provideActiveRootLister((RootsOracle) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    public ActiveRootLister get() {
        return provideActiveRootLister(this.module, this.rootsOracleProvider.get());
    }
}
