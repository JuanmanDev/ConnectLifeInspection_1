package p040c.p200q.p353b.p355b;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: c.q.b.b.n */
/* compiled from: AbstractSortedKeySortedSetMultimap */
public abstract class C6047n<K, V> extends C6063p<K, V> {
    public C6047n(SortedMap<K, Collection<V>> sortedMap) {
        super(sortedMap);
    }

    public abstract /* bridge */ /* synthetic */ Map asMap();

    public SortedMap<K, Collection<V>> asMap() {
        return (SortedMap) super.asMap();
    }

    public Set<K> createKeySet() {
        return createMaybeNavigableKeySet();
    }

    public abstract /* bridge */ /* synthetic */ Set keySet();

    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }

    public SortedMap<K, Collection<V>> backingMap() {
        return (SortedMap) super.backingMap();
    }
}
