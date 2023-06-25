package p040c.p200q.p353b.p355b;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p353b.p355b.C5929e;

/* renamed from: c.q.b.b.m */
/* compiled from: AbstractSetMultimap */
public abstract class C6040m<K, V> extends C5929e<K, V> implements C6137r2<K, V> {
    public static final long serialVersionUID = 7431625294878419160L;

    public C6040m(Map<K, Collection<V>> map) {
        super(map);
    }

    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    public abstract /* bridge */ /* synthetic */ Collection createCollection();

    public abstract Set<V> createCollection();

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean put(K k, V v) {
        return super.put(k, v);
    }

    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return new C5929e.C5948n(k, (Set) collection);
    }

    public Set<V> createUnmodifiableEmptyCollection() {
        return Collections.emptySet();
    }

    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    public Set<V> get(K k) {
        return (Set) super.get(k);
    }

    public Set<V> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues(k, iterable);
    }
}
