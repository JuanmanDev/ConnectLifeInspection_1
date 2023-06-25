package androidx.test.espresso.base;

import android.os.Looper;
import androidx.test.espresso.core.internal.deps.dagger.internal.Factory;
import p625h.p626a.C9381a;

public final class ThreadPoolExecutorExtractor_Factory implements Factory<ThreadPoolExecutorExtractor> {
    public final C9381a<Looper> looperProvider;

    public ThreadPoolExecutorExtractor_Factory(C9381a<Looper> aVar) {
        this.looperProvider = aVar;
    }

    public static ThreadPoolExecutorExtractor_Factory create(C9381a<Looper> aVar) {
        return new ThreadPoolExecutorExtractor_Factory(aVar);
    }

    public static ThreadPoolExecutorExtractor newInstance(Looper looper) {
        return new ThreadPoolExecutorExtractor(looper);
    }

    public ThreadPoolExecutorExtractor get() {
        return new ThreadPoolExecutorExtractor(this.looperProvider.get());
    }
}
