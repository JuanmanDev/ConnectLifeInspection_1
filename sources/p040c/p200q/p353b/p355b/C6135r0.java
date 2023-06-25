package p040c.p200q.p353b.p355b;

import java.util.Map;
import p040c.p200q.p353b.p354a.C5845j;

/* renamed from: c.q.b.b.r0 */
/* compiled from: ForwardingMapEntry */
public abstract class C6135r0<K, V> extends C6152t0 implements Map.Entry<K, V> {
    /* renamed from: c */
    public abstract Map.Entry<K, V> mo28998c();

    public boolean equals(Object obj) {
        return mo28998c().equals(obj);
    }

    public K getKey() {
        return mo28998c().getKey();
    }

    public V getValue() {
        return mo28998c().getValue();
    }

    public int hashCode() {
        return mo28998c().hashCode();
    }

    public V setValue(V v) {
        return mo28998c().setValue(v);
    }

    public boolean standardEquals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!C5845j.m16576a(getKey(), entry.getKey()) || !C5845j.m16576a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }
}
