package p040c.p200q.p353b.p355b;

import java.util.concurrent.ConcurrentMap;

/* renamed from: c.q.b.b.o0 */
/* compiled from: ForwardingConcurrentMap */
public abstract class C6060o0<K, V> extends C6107q0<K, V> implements ConcurrentMap<K, V> {
    /* renamed from: c */
    public abstract ConcurrentMap<K, V> mo29681c();

    public V putIfAbsent(K k, V v) {
        return mo29681c().putIfAbsent(k, v);
    }

    public boolean remove(Object obj, Object obj2) {
        return mo29681c().remove(obj, obj2);
    }

    public V replace(K k, V v) {
        return mo29681c().replace(k, v);
    }

    public boolean replace(K k, V v, V v2) {
        return mo29681c().replace(k, v, v2);
    }
}
