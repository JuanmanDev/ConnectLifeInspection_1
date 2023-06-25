package p040c.p200q.p353b.p355b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5845j;

/* renamed from: c.q.b.b.q0 */
/* compiled from: ForwardingMap */
public abstract class C6107q0<K, V> extends C6152t0 implements Map<K, V> {
    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    public abstract /* bridge */ /* synthetic */ Object delegate();

    public abstract Map<K, V> delegate();

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public V get(Object obj) {
        return delegate().get(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public V put(K k, V v) {
        return delegate().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    public V remove(Object obj) {
        return delegate().remove(obj);
    }

    public int size() {
        return delegate().size();
    }

    public void standardClear() {
        C6028l1.m16932d(entrySet().iterator());
    }

    public boolean standardContainsKey(Object obj) {
        return C6108q1.m17170f(this, obj);
    }

    public boolean standardContainsValue(Object obj) {
        return C6108q1.m17171g(this, obj);
    }

    public boolean standardEquals(Object obj) {
        return C6108q1.m17172h(this, obj);
    }

    public int standardHashCode() {
        return C6148s2.m17249b(entrySet());
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public void standardPutAll(Map<? extends K, ? extends V> map) {
        C6108q1.m17183s(this, map);
    }

    public V standardRemove(Object obj) {
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (C5845j.m16576a(entry.getKey(), obj)) {
                V value = entry.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public String standardToString() {
        return C6108q1.m17187w(this);
    }

    public Collection<V> values() {
        return delegate().values();
    }
}
