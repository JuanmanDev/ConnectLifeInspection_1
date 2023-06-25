package androidx.test.espresso.base;

import android.content.Context;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import p625h.p626a.C9381a;

public final class DefaultFailureHandler_Factory implements Factory<DefaultFailureHandler> {
    public final C9381a<Context> appContextProvider;

    public DefaultFailureHandler_Factory(C9381a<Context> aVar) {
        this.appContextProvider = aVar;
    }

    public static DefaultFailureHandler_Factory create(C9381a<Context> aVar) {
        return new DefaultFailureHandler_Factory(aVar);
    }

    public static DefaultFailureHandler newInstance(Context context) {
        return new DefaultFailureHandler(context);
    }

    public DefaultFailureHandler get() {
        return new DefaultFailureHandler(this.appContextProvider.get());
    }
}
