package androidx.test.espresso.base;

import android.os.Looper;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import p625h.p626a.C9381a;

public final class IdlingResourceRegistry_Factory implements Factory<IdlingResourceRegistry> {
    public final C9381a<Looper> looperProvider;

    public IdlingResourceRegistry_Factory(C9381a<Looper> aVar) {
        this.looperProvider = aVar;
    }

    public static IdlingResourceRegistry_Factory create(C9381a<Looper> aVar) {
        return new IdlingResourceRegistry_Factory(aVar);
    }

    public static IdlingResourceRegistry newInstance(Looper looper) {
        return new IdlingResourceRegistry(looper);
    }

    public IdlingResourceRegistry get() {
        return new IdlingResourceRegistry(this.looperProvider.get());
    }
}
