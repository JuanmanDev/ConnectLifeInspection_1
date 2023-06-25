package androidx.test.espresso.base;

import androidx.test.espresso.FailureHandler;
import androidx.test.espresso.base.BaseLayerModule;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import p625h.p626a.C9381a;

public final class BaseLayerModule_FailureHandlerHolder_Factory implements Factory<BaseLayerModule.FailureHandlerHolder> {
    public final C9381a<FailureHandler> defaultHandlerProvider;

    public BaseLayerModule_FailureHandlerHolder_Factory(C9381a<FailureHandler> aVar) {
        this.defaultHandlerProvider = aVar;
    }

    public static BaseLayerModule_FailureHandlerHolder_Factory create(C9381a<FailureHandler> aVar) {
        return new BaseLayerModule_FailureHandlerHolder_Factory(aVar);
    }

    public static BaseLayerModule.FailureHandlerHolder newInstance(FailureHandler failureHandler) {
        return new BaseLayerModule.FailureHandlerHolder(failureHandler);
    }

    public BaseLayerModule.FailureHandlerHolder get() {
        return new BaseLayerModule.FailureHandlerHolder(this.defaultHandlerProvider.get());
    }
}
