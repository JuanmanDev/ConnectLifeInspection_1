package p630io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p553f.p594c.p601r.C9218f;

/* renamed from: io.reactivex.internal.util.ArrayListSupplier */
public enum ArrayListSupplier implements Callable<List<Object>>, C9218f<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> C9218f<O, List<T>> asFunction() {
        return INSTANCE;
    }

    public List<Object> apply(Object obj) {
        return new ArrayList();
    }

    public List<Object> call() {
        return new ArrayList();
    }
}
