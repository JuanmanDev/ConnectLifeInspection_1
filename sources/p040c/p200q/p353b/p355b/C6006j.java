package p040c.p200q.p353b.p355b;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import p040c.p200q.p353b.p355b.C6108q1;

/* renamed from: c.q.b.b.j */
/* compiled from: AbstractNavigableMap */
public abstract class C6006j<K, V> extends C6108q1.C6123l<K, V> implements NavigableMap<K, V> {

    /* renamed from: c.q.b.b.j$b */
    /* compiled from: AbstractNavigableMap */
    public final class C6008b extends C6108q1.C6116h<K, V> {
        public C6008b() {
        }

        /* renamed from: f */
        public Iterator<Map.Entry<K, V>> mo29577f() {
            return C6006j.this.mo29555b();
        }

        /* renamed from: g */
        public NavigableMap<K, V> mo29578g() {
            return C6006j.this;
        }
    }

    /* renamed from: b */
    public abstract Iterator<Map.Entry<K, V>> mo29555b();

    public Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    public K ceilingKey(K k) {
        return C6108q1.m17177m(ceilingEntry(k));
    }

    public NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    public NavigableMap<K, V> descendingMap() {
        return new C6008b();
    }

    public Map.Entry<K, V> firstEntry() {
        return (Map.Entry) C6028l1.m16941m(mo29135a(), null);
    }

    public K firstKey() {
        Map.Entry firstEntry = firstEntry();
        if (firstEntry != null) {
            return firstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    public Map.Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    public K floorKey(K k) {
        return C6108q1.m17177m(floorEntry(k));
    }

    public SortedMap<K, V> headMap(K k) {
        return headMap(k, false);
    }

    public Map.Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    public K higherKey(K k) {
        return C6108q1.m17177m(higherEntry(k));
    }

    public Set<K> keySet() {
        return navigableKeySet();
    }

    public Map.Entry<K, V> lastEntry() {
        return (Map.Entry) C6028l1.m16941m(mo29555b(), null);
    }

    public K lastKey() {
        Map.Entry lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    public Map.Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    public K lowerKey(K k) {
        return C6108q1.m17177m(lowerEntry(k));
    }

    public NavigableSet<K> navigableKeySet() {
        return new C6108q1.C6126n(this);
    }

    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) C6028l1.m16945q(mo29135a());
    }

    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) C6028l1.m16945q(mo29555b());
    }

    public SortedMap<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    public SortedMap<K, V> tailMap(K k) {
        return tailMap(k, true);
    }
}
