package p620g.p621a;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: g.a.a */
/* compiled from: Maps */
public final class C9334a {
    /* renamed from: a */
    public static <K, V> V m25183a(Map<K, V> map, K k, V v) {
        C9335b.m25184a(map);
        if (map instanceof ConcurrentMap) {
            return ((ConcurrentMap) map).putIfAbsent(k, v);
        }
        V v2 = map.get(k);
        return v2 == null ? map.put(k, v) : v2;
    }
}
