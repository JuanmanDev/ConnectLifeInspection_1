package p040c.p200q.p353b.p355b;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: c.q.b.b.d */
/* compiled from: AbstractListMultimap */
public abstract class C5917d<K, V> extends C5929e<K, V> implements Object<K, V> {
    public static final long serialVersionUID = 6588350623831699109L;

    public C5917d(Map<K, Collection<V>> map) {
        super(map);
    }

    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    public abstract /* bridge */ /* synthetic */ Collection createCollection();

    public abstract List<V> createCollection();

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean put(K k, V v) {
        return super.put(k, v);
    }

    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return wrapList(k, (List) collection, (C5929e<K, V>.k) null);
    }

    public List<V> createUnmodifiableEmptyCollection() {
        return Collections.emptyList();
    }

    public List<V> get(K k) {
        return (List) super.get(k);
    }

    public List<V> removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (List) super.replaceValues(k, iterable);
    }
}
