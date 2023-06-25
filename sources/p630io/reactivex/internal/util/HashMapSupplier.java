package p630io.reactivex.internal.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.util.HashMapSupplier */
public enum HashMapSupplier implements Callable<Map<Object, Object>> {
    INSTANCE;

    public static <K, V> Callable<Map<K, V>> asCallable() {
        return INSTANCE;
    }

    public Map<Object, Object> call() {
        return new HashMap();
    }
}
