package p040c.p200q.p353b.p355b;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import p040c.p200q.p353b.p355b.C5929e;

/* renamed from: c.q.b.b.p */
/* compiled from: AbstractSortedSetMultimap */
public abstract class C6063p<K, V> extends C6040m<K, V> implements Object<K, V> {
    public static final long serialVersionUID = 430848587173315748L;

    public C6063p(Map<K, Collection<V>> map) {
        super(map);
    }

    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    public abstract /* bridge */ /* synthetic */ Collection createCollection();

    public abstract /* bridge */ /* synthetic */ Set createCollection();

    public abstract SortedSet<V> createCollection();

    public abstract /* bridge */ /* synthetic */ Collection get(Object obj);

    public abstract /* bridge */ /* synthetic */ Set get(Object obj);

    public SortedSet<V> get(K k) {
        return (SortedSet) super.get((Object) k);
    }

    public Collection<V> values() {
        return super.values();
    }

    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        if (collection instanceof NavigableSet) {
            return new C5929e.C5947m(k, (NavigableSet) collection, (C5929e<K, V>.k) null);
        }
        return new C5929e.C5949o(k, (SortedSet) collection, (C5929e<K, V>.k) null);
    }

    public <E> SortedSet<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        if (collection instanceof NavigableSet) {
            return C6148s2.m17254g((NavigableSet) collection);
        }
        return Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    public SortedSet<V> createUnmodifiableEmptyCollection() {
        return unmodifiableCollectionSubclass((Collection) createCollection());
    }

    public SortedSet<V> removeAll(Object obj) {
        return (SortedSet) super.removeAll(obj);
    }

    public SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (SortedSet) super.replaceValues((Object) k, (Iterable) iterable);
    }
}
