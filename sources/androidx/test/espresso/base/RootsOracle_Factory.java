package androidx.test.espresso.base;

import android.os.Looper;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import p625h.p626a.C9381a;

public final class RootsOracle_Factory implements Factory<RootsOracle> {
    public final C9381a<Looper> mainLooperProvider;

    public RootsOracle_Factory(C9381a<Looper> aVar) {
        this.mainLooperProvider = aVar;
    }

    public static RootsOracle_Factory create(C9381a<Looper> aVar) {
        return new RootsOracle_Factory(aVar);
    }

    public static RootsOracle newInstance(Looper looper) {
        return new RootsOracle(looper);
    }

    public RootsOracle get() {
        return new RootsOracle(this.mainLooperProvider.get());
    }
}
