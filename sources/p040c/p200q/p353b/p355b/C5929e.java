package p040c.p200q.p353b.p355b;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import k.a;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5983h;
import p040c.p200q.p353b.p355b.C6108q1;
import p040c.p200q.p353b.p355b.C6140s1;

/* renamed from: c.q.b.b.e */
/* compiled from: AbstractMapBasedMultimap */
public abstract class C5929e<K, V> extends C5983h<K, V> implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;
    public transient Map<K, Collection<V>> map;
    public transient int totalSize;

    /* renamed from: c.q.b.b.e$a */
    /* compiled from: AbstractMapBasedMultimap */
    public class C5930a extends C5929e<K, V>.d<V> {
        public C5930a(C5929e eVar) {
            super();
        }

        /* renamed from: a */
        public V mo29218a(K k, V v) {
            return v;
        }
    }

    /* renamed from: c.q.b.b.e$b */
    /* compiled from: AbstractMapBasedMultimap */
    public class C5931b extends C5929e<K, V>.d<Map.Entry<K, V>> {
        public C5931b(C5929e eVar) {
            super();
        }

        /* renamed from: b */
        public Map.Entry<K, V> mo29218a(K k, V v) {
            return C6108q1.m17173i(k, v);
        }
    }

    /* renamed from: c.q.b.b.e$c */
    /* compiled from: AbstractMapBasedMultimap */
    public class C5932c extends C6108q1.C6130r<K, Collection<V>> {

        /* renamed from: n */
        public final transient Map<K, Collection<V>> f11462n;

        /* renamed from: c.q.b.b.e$c$a */
        /* compiled from: AbstractMapBasedMultimap */
        public class C5933a extends C6108q1.C6121j<K, Collection<V>> {
            public C5933a() {
            }

            public boolean contains(Object obj) {
                return C6170w.m17285d(C5932c.this.f11462n.entrySet(), obj);
            }

            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C5934b();
            }

            /* renamed from: k */
            public Map<K, Collection<V>> mo29233k() {
                return C5932c.this;
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                C5929e.this.removeValuesForKey(((Map.Entry) obj).getKey());
                return true;
            }
        }

        /* renamed from: c.q.b.b.e$c$b */
        /* compiled from: AbstractMapBasedMultimap */
        public class C5934b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: e */
            public final Iterator<Map.Entry<K, Collection<V>>> f11465e = C5932c.this.f11462n.entrySet().iterator();

            /* renamed from: l */
            public Collection<V> f11466l;

            public C5934b() {
            }

            /* renamed from: a */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry next = this.f11465e.next();
                this.f11466l = (Collection) next.getValue();
                return C5932c.this.mo29225f(next);
            }

            public boolean hasNext() {
                return this.f11465e.hasNext();
            }

            public void remove() {
                C6166v.m17279e(this.f11466l != null);
                this.f11465e.remove();
                C5929e eVar = C5929e.this;
                int unused = eVar.totalSize = eVar.totalSize - this.f11466l.size();
                this.f11466l.clear();
                this.f11466l = null;
            }
        }

        public C5932c(Map<K, Collection<V>> map) {
            this.f11462n = map;
        }

        /* renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo29100a() {
            return new C5933a();
        }

        public void clear() {
            if (this.f11462n == C5929e.this.map) {
                C5929e.this.clear();
            } else {
                C6028l1.m16932d(new C5934b());
            }
        }

        public boolean containsKey(Object obj) {
            return C6108q1.m17184t(this.f11462n, obj);
        }

        /* renamed from: d */
        public Collection<V> get(Object obj) {
            Collection collection = (Collection) C6108q1.m17185u(this.f11462n, obj);
            if (collection == null) {
                return null;
            }
            return C5929e.this.wrapCollection(obj, collection);
        }

        /* renamed from: e */
        public Collection<V> remove(Object obj) {
            Collection remove = this.f11462n.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> createCollection = C5929e.this.createCollection();
            createCollection.addAll(remove);
            C5929e eVar = C5929e.this;
            int unused = eVar.totalSize = eVar.totalSize - remove.size();
            remove.clear();
            return createCollection;
        }

        public boolean equals(Object obj) {
            return this == obj || this.f11462n.equals(obj);
        }

        /* renamed from: f */
        public Map.Entry<K, Collection<V>> mo29225f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return C6108q1.m17173i(key, C5929e.this.wrapCollection(key, entry.getValue()));
        }

        public int hashCode() {
            return this.f11462n.hashCode();
        }

        public Set<K> keySet() {
            return C5929e.this.keySet();
        }

        public int size() {
            return this.f11462n.size();
        }

        public String toString() {
            return this.f11462n.toString();
        }
    }

    /* renamed from: c.q.b.b.e$d */
    /* compiled from: AbstractMapBasedMultimap */
    public abstract class C5935d<T> implements Iterator<T> {

        /* renamed from: e */
        public final Iterator<Map.Entry<K, Collection<V>>> f11468e;

        /* renamed from: l */
        public K f11469l = null;

        /* renamed from: m */
        public Collection<V> f11470m = null;

        /* renamed from: n */
        public Iterator<V> f11471n = C6028l1.m16938j();

        public C5935d() {
            this.f11468e = C5929e.this.map.entrySet().iterator();
        }

        /* renamed from: a */
        public abstract T mo29218a(K k, V v);

        public boolean hasNext() {
            return this.f11468e.hasNext() || this.f11471n.hasNext();
        }

        public T next() {
            if (!this.f11471n.hasNext()) {
                Map.Entry next = this.f11468e.next();
                this.f11469l = next.getKey();
                Collection<V> collection = (Collection) next.getValue();
                this.f11470m = collection;
                this.f11471n = collection.iterator();
            }
            return mo29218a(this.f11469l, this.f11471n.next());
        }

        public void remove() {
            this.f11471n.remove();
            if (this.f11470m.isEmpty()) {
                this.f11468e.remove();
            }
            C5929e.access$210(C5929e.this);
        }
    }

    /* renamed from: c.q.b.b.e$e */
    /* compiled from: AbstractMapBasedMultimap */
    public class C5936e extends C6108q1.C6125m<K, Collection<V>> {

        /* renamed from: c.q.b.b.e$e$a */
        /* compiled from: AbstractMapBasedMultimap */
        public class C5937a implements Iterator<K> {

            /* renamed from: e */
            public Map.Entry<K, Collection<V>> f11474e;

            /* renamed from: l */
            public final /* synthetic */ Iterator f11475l;

            public C5937a(Iterator it) {
                this.f11475l = it;
            }

            public boolean hasNext() {
                return this.f11475l.hasNext();
            }

            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f11475l.next();
                this.f11474e = entry;
                return entry.getKey();
            }

            public void remove() {
                C6166v.m17279e(this.f11474e != null);
                Collection value = this.f11474e.getValue();
                this.f11475l.remove();
                C5929e eVar = C5929e.this;
                int unused = eVar.totalSize = eVar.totalSize - value.size();
                value.clear();
                this.f11474e = null;
            }
        }

        public C5936e(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            C6028l1.m16932d(iterator());
        }

        public boolean containsAll(Collection<?> collection) {
            return mo29919k().keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            return this == obj || mo29919k().keySet().equals(obj);
        }

        public int hashCode() {
            return mo29919k().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            return new C5937a(mo29919k().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) mo29919k().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                C5929e eVar = C5929e.this;
                int unused = eVar.totalSize = eVar.totalSize - i;
            } else {
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: c.q.b.b.e$f */
    /* compiled from: AbstractMapBasedMultimap */
    public class C5938f extends C5929e<K, V>.i implements NavigableMap<K, Collection<V>> {
        public C5938f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry ceilingEntry = mo29263i().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return mo29225f(ceilingEntry);
        }

        public K ceilingKey(K k) {
            return mo29263i().ceilingKey(k);
        }

        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public NavigableMap<K, Collection<V>> descendingMap() {
            return new C5938f(mo29263i().descendingMap());
        }

        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry firstEntry = mo29263i().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return mo29225f(firstEntry);
        }

        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry floorEntry = mo29263i().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return mo29225f(floorEntry);
        }

        public K floorKey(K k) {
            return mo29263i().floorKey(k);
        }

        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry higherEntry = mo29263i().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return mo29225f(higherEntry);
        }

        public K higherKey(K k) {
            return mo29263i().higherKey(k);
        }

        /* renamed from: j */
        public NavigableSet<K> mo29257g() {
            return new C5939g(mo29263i());
        }

        /* renamed from: k */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        /* renamed from: l */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry lastEntry = mo29263i().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return mo29225f(lastEntry);
        }

        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry lowerEntry = mo29263i().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return mo29225f(lowerEntry);
        }

        public K lowerKey(K k) {
            return mo29263i().lowerKey(k);
        }

        /* renamed from: m */
        public Map.Entry<K, Collection<V>> mo29270m(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry next = it.next();
            Collection createCollection = C5929e.this.createCollection();
            createCollection.addAll((Collection) next.getValue());
            it.remove();
            return C6108q1.m17173i(next.getKey(), C5929e.this.unmodifiableCollectionSubclass(createCollection));
        }

        /* renamed from: n */
        public NavigableMap<K, Collection<V>> mo29263i() {
            return (NavigableMap) super.mo29263i();
        }

        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        /* renamed from: o */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        /* renamed from: p */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return mo29270m(entrySet().iterator());
        }

        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return mo29270m(descendingMap().entrySet().iterator());
        }

        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C5938f(mo29263i().headMap(k, z));
        }

        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C5938f(mo29263i().subMap(k, z, k2, z2));
        }

        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C5938f(mo29263i().tailMap(k, z));
        }
    }

    /* renamed from: c.q.b.b.e$g */
    /* compiled from: AbstractMapBasedMultimap */
    public class C5939g extends C5929e<K, V>.j implements NavigableSet<K> {
        public C5939g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public K ceiling(K k) {
            return mo29289o().ceilingKey(k);
        }

        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<K> descendingSet() {
            return new C5939g(mo29289o().descendingMap());
        }

        public K floor(K k) {
            return mo29289o().floorKey(k);
        }

        public K higher(K k) {
            return mo29289o().higherKey(k);
        }

        public K lower(K k) {
            return mo29289o().lowerKey(k);
        }

        /* renamed from: p */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        public K pollFirst() {
            return C6028l1.m16945q(iterator());
        }

        public K pollLast() {
            return C6028l1.m16945q(descendingIterator());
        }

        /* renamed from: s */
        public NavigableMap<K, Collection<V>> mo29289o() {
            return (NavigableMap) super.mo29289o();
        }

        /* renamed from: t */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        /* renamed from: u */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        public NavigableSet<K> headSet(K k, boolean z) {
            return new C5939g(mo29289o().headMap(k, z));
        }

        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C5939g(mo29289o().subMap(k, z, k2, z2));
        }

        public NavigableSet<K> tailSet(K k, boolean z) {
            return new C5939g(mo29289o().tailMap(k, z));
        }
    }

    /* renamed from: c.q.b.b.e$h */
    /* compiled from: AbstractMapBasedMultimap */
    public class C5940h extends C5929e<K, V>.l implements RandomAccess {
        public C5940h(C5929e eVar, K k, List<V> list, C5929e<K, V>.k kVar) {
            super(k, list, kVar);
        }
    }

    /* renamed from: c.q.b.b.e$i */
    /* compiled from: AbstractMapBasedMultimap */
    public class C5941i extends C5929e<K, V>.c implements SortedMap<K, Collection<V>> {

        /* renamed from: p */
        public SortedSet<K> f11479p;

        public C5941i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo29263i().comparator();
        }

        public K firstKey() {
            return mo29263i().firstKey();
        }

        /* renamed from: g */
        public SortedSet<K> mo29057b() {
            return new C5942j(mo29263i());
        }

        /* renamed from: h */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f11479p;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> g = mo29057b();
            this.f11479p = g;
            return g;
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C5941i(mo29263i().headMap(k));
        }

        /* renamed from: i */
        public SortedMap<K, Collection<V>> mo29263i() {
            return (SortedMap) this.f11462n;
        }

        public K lastKey() {
            return mo29263i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C5941i(mo29263i().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C5941i(mo29263i().tailMap(k));
        }
    }

    /* renamed from: c.q.b.b.e$j */
    /* compiled from: AbstractMapBasedMultimap */
    public class C5942j extends C5929e<K, V>.e implements SortedSet<K> {
        public C5942j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo29289o().comparator();
        }

        public K first() {
            return mo29289o().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C5942j(mo29289o().headMap(k));
        }

        public K last() {
            return mo29289o().lastKey();
        }

        /* renamed from: o */
        public SortedMap<K, Collection<V>> mo29289o() {
            return (SortedMap) super.mo29919k();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C5942j(mo29289o().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C5942j(mo29289o().tailMap(k));
        }
    }

    /* renamed from: c.q.b.b.e$m */
    /* compiled from: AbstractMapBasedMultimap */
    public class C5947m extends C5929e<K, V>.o implements NavigableSet<V> {
        public C5947m(K k, NavigableSet<V> navigableSet, C5929e<K, V>.k kVar) {
            super(k, navigableSet, kVar);
        }

        public V ceiling(V v) {
            return mo29355p().ceiling(v);
        }

        public Iterator<V> descendingIterator() {
            return new C5943k.C5944a(mo29355p().descendingIterator());
        }

        public NavigableSet<V> descendingSet() {
            return mo29360t(mo29355p().descendingSet());
        }

        public V floor(V v) {
            return mo29355p().floor(v);
        }

        public NavigableSet<V> headSet(V v, boolean z) {
            return mo29360t(mo29355p().headSet(v, z));
        }

        public V higher(V v) {
            return mo29355p().higher(v);
        }

        public V lower(V v) {
            return mo29355p().lower(v);
        }

        public V pollFirst() {
            return C6028l1.m16945q(iterator());
        }

        public V pollLast() {
            return C6028l1.m16945q(descendingIterator());
        }

        /* renamed from: s */
        public NavigableSet<V> mo29355p() {
            return (NavigableSet) super.mo29355p();
        }

        public NavigableSet<V> subSet(V v, boolean z, V v2, boolean z2) {
            return mo29360t(mo29355p().subSet(v, z, v2, z2));
        }

        /* renamed from: t */
        public final NavigableSet<V> mo29360t(NavigableSet<V> navigableSet) {
            return new C5947m(this.f11482e, navigableSet, mo29313f() == null ? this : mo29313f());
        }

        public NavigableSet<V> tailSet(V v, boolean z) {
            return mo29360t(mo29355p().tailSet(v, z));
        }
    }

    /* renamed from: c.q.b.b.e$n */
    /* compiled from: AbstractMapBasedMultimap */
    public class C5948n extends C5929e<K, V>.k implements Set<V> {
        public C5948n(K k, Set<V> set) {
            super(k, set, (C5929e<K, V>.k) null);
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean e = C6148s2.m17252e((Set) this.f11483l, collection);
            if (e) {
                int size2 = this.f11483l.size();
                C5929e eVar = C5929e.this;
                int unused = eVar.totalSize = eVar.totalSize + (size2 - size);
                mo29319o();
            }
            return e;
        }
    }

    /* renamed from: c.q.b.b.e$o */
    /* compiled from: AbstractMapBasedMultimap */
    public class C5949o extends C5929e<K, V>.k implements SortedSet<V> {
        public C5949o(K k, SortedSet<V> sortedSet, C5929e<K, V>.k kVar) {
            super(k, sortedSet, kVar);
        }

        public Comparator<? super V> comparator() {
            return mo29355p().comparator();
        }

        public V first() {
            mo29318l();
            return mo29355p().first();
        }

        public SortedSet<V> headSet(V v) {
            mo29318l();
            return new C5949o(mo29317k(), mo29355p().headSet(v), mo29313f() == null ? this : mo29313f());
        }

        public V last() {
            mo29318l();
            return mo29355p().last();
        }

        /* renamed from: p */
        public SortedSet<V> mo29355p() {
            return (SortedSet) mo29314g();
        }

        public SortedSet<V> subSet(V v, V v2) {
            mo29318l();
            return new C5949o(mo29317k(), mo29355p().subSet(v, v2), mo29313f() == null ? this : mo29313f());
        }

        public SortedSet<V> tailSet(V v) {
            mo29318l();
            return new C5949o(mo29317k(), mo29355p().tailSet(v), mo29313f() == null ? this : mo29313f());
        }
    }

    public C5929e(Map<K, Collection<V>> map2) {
        C5850m.m16583d(map2.isEmpty());
        this.map = map2;
    }

    public static /* synthetic */ int access$208(C5929e eVar) {
        int i = eVar.totalSize;
        eVar.totalSize = i + 1;
        return i;
    }

    public static /* synthetic */ int access$210(C5929e eVar) {
        int i = eVar.totalSize;
        eVar.totalSize = i - 1;
        return i;
    }

    private Collection<V> getOrCreateCollection(K k) {
        Collection<V> collection = this.map.get(k);
        if (collection != null) {
            return collection;
        }
        Collection<V> createCollection = createCollection(k);
        this.map.put(k, createCollection);
        return createCollection;
    }

    public static <E> Iterator<E> iteratorOrListIterator(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* access modifiers changed from: private */
    public void removeValuesForKey(Object obj) {
        Collection collection = (Collection) C6108q1.m17186v(this.map, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    public Map<K, Collection<V>> backingMap() {
        return this.map;
    }

    public void clear() {
        for (Collection<V> clear : this.map.values()) {
            clear.clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    public Map<K, Collection<V>> createAsMap() {
        return new C5932c(this.map);
    }

    public abstract Collection<V> createCollection();

    public Collection<V> createCollection(K k) {
        return createCollection();
    }

    public Collection<Map.Entry<K, V>> createEntries() {
        if (this instanceof C6137r2) {
            return new C5983h.C5985b(this);
        }
        return new C5983h.C5984a();
    }

    public Set<K> createKeySet() {
        return new C5936e(this.map);
    }

    public C6153t1<K> createKeys() {
        return new C6140s1.C6145c(this);
    }

    public final Map<K, Collection<V>> createMaybeNavigableAsMap() {
        Map<K, Collection<V>> map2 = this.map;
        if (map2 instanceof NavigableMap) {
            return new C5938f((NavigableMap) this.map);
        }
        if (map2 instanceof SortedMap) {
            return new C5941i((SortedMap) this.map);
        }
        return new C5932c(this.map);
    }

    public final Set<K> createMaybeNavigableKeySet() {
        Map<K, Collection<V>> map2 = this.map;
        if (map2 instanceof NavigableMap) {
            return new C5939g((NavigableMap) this.map);
        }
        if (map2 instanceof SortedMap) {
            return new C5942j((SortedMap) this.map);
        }
        return new C5936e(this.map);
    }

    public abstract Collection<V> createUnmodifiableEmptyCollection();

    public Collection<V> createValues() {
        return new C5983h.C5986c();
    }

    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new C5931b(this);
    }

    public Collection<V> get(K k) {
        Collection collection = this.map.get(k);
        if (collection == null) {
            collection = createCollection(k);
        }
        return wrapCollection(k, collection);
    }

    public boolean put(K k, V v) {
        Collection collection = this.map.get(k);
        if (collection == null) {
            Collection createCollection = createCollection(k);
            if (createCollection.add(v)) {
                this.totalSize++;
                this.map.put(k, createCollection);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.totalSize++;
            return true;
        }
    }

    public Collection<V> removeAll(Object obj) {
        Collection remove = this.map.remove(obj);
        if (remove == null) {
            return createUnmodifiableEmptyCollection();
        }
        Collection createCollection = createCollection();
        createCollection.addAll(remove);
        this.totalSize -= remove.size();
        remove.clear();
        return unmodifiableCollectionSubclass(createCollection);
    }

    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k);
        }
        Collection orCreateCollection = getOrCreateCollection(k);
        Collection createCollection = createCollection();
        createCollection.addAll(orCreateCollection);
        this.totalSize -= orCreateCollection.size();
        orCreateCollection.clear();
        while (it.hasNext()) {
            if (orCreateCollection.add(it.next())) {
                this.totalSize++;
            }
        }
        return unmodifiableCollectionSubclass(createCollection);
    }

    public final void setMap(Map<K, Collection<V>> map2) {
        this.map = map2;
        this.totalSize = 0;
        for (Collection next : map2.values()) {
            C5850m.m16583d(!next.isEmpty());
            this.totalSize += next.size();
        }
    }

    public int size() {
        return this.totalSize;
    }

    public abstract <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection);

    public Iterator<V> valueIterator() {
        return new C5930a(this);
    }

    public Collection<V> values() {
        return super.values();
    }

    public abstract Collection<V> wrapCollection(K k, Collection<V> collection);

    public final List<V> wrapList(K k, List<V> list, C5929e<K, V>.k kVar) {
        return list instanceof RandomAccess ? new C5940h(this, k, list, kVar) : new C5945l(k, list, kVar);
    }

    /* renamed from: c.q.b.b.e$k */
    /* compiled from: AbstractMapBasedMultimap */
    public class C5943k extends AbstractCollection<V> {

        /* renamed from: e */
        public final K f11482e;

        /* renamed from: l */
        public Collection<V> f11483l;

        /* renamed from: m */
        public final C5929e<K, V>.k f11484m;

        /* renamed from: n */
        public final Collection<V> f11485n;

        public C5943k(K k, Collection<V> collection, C5929e<K, V>.k kVar) {
            Collection<V> collection2;
            this.f11482e = k;
            this.f11483l = collection;
            this.f11484m = kVar;
            if (kVar == null) {
                collection2 = null;
            } else {
                collection2 = kVar.mo29314g();
            }
            this.f11485n = collection2;
        }

        public boolean add(V v) {
            mo29318l();
            boolean isEmpty = this.f11483l.isEmpty();
            boolean add = this.f11483l.add(v);
            if (add) {
                C5929e.access$208(C5929e.this);
                if (isEmpty) {
                    mo29308c();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f11483l.addAll(collection);
            if (addAll) {
                int size2 = this.f11483l.size();
                C5929e eVar = C5929e.this;
                int unused = eVar.totalSize = eVar.totalSize + (size2 - size);
                if (size == 0) {
                    mo29308c();
                }
            }
            return addAll;
        }

        /* renamed from: c */
        public void mo29308c() {
            C5929e<K, V>.k kVar = this.f11484m;
            if (kVar != null) {
                kVar.mo29308c();
            } else {
                C5929e.this.map.put(this.f11482e, this.f11483l);
            }
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f11483l.clear();
                C5929e eVar = C5929e.this;
                int unused = eVar.totalSize = eVar.totalSize - size;
                mo29319o();
            }
        }

        public boolean contains(Object obj) {
            mo29318l();
            return this.f11483l.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            mo29318l();
            return this.f11483l.containsAll(collection);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            mo29318l();
            return this.f11483l.equals(obj);
        }

        /* renamed from: f */
        public C5929e<K, V>.k mo29313f() {
            return this.f11484m;
        }

        /* renamed from: g */
        public Collection<V> mo29314g() {
            return this.f11483l;
        }

        public int hashCode() {
            mo29318l();
            return this.f11483l.hashCode();
        }

        public Iterator<V> iterator() {
            mo29318l();
            return new C5944a();
        }

        /* renamed from: k */
        public K mo29317k() {
            return this.f11482e;
        }

        /* renamed from: l */
        public void mo29318l() {
            Collection<V> collection;
            C5929e<K, V>.k kVar = this.f11484m;
            if (kVar != null) {
                kVar.mo29318l();
                if (this.f11484m.mo29314g() != this.f11485n) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f11483l.isEmpty() && (collection = (Collection) C5929e.this.map.get(this.f11482e)) != null) {
                this.f11483l = collection;
            }
        }

        /* renamed from: o */
        public void mo29319o() {
            C5929e<K, V>.k kVar = this.f11484m;
            if (kVar != null) {
                kVar.mo29319o();
            } else if (this.f11483l.isEmpty()) {
                C5929e.this.map.remove(this.f11482e);
            }
        }

        public boolean remove(Object obj) {
            mo29318l();
            boolean remove = this.f11483l.remove(obj);
            if (remove) {
                C5929e.access$210(C5929e.this);
                mo29319o();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f11483l.removeAll(collection);
            if (removeAll) {
                int size2 = this.f11483l.size();
                C5929e eVar = C5929e.this;
                int unused = eVar.totalSize = eVar.totalSize + (size2 - size);
                mo29319o();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            C5850m.m16594o(collection);
            int size = size();
            boolean retainAll = this.f11483l.retainAll(collection);
            if (retainAll) {
                int size2 = this.f11483l.size();
                C5929e eVar = C5929e.this;
                int unused = eVar.totalSize = eVar.totalSize + (size2 - size);
                mo29319o();
            }
            return retainAll;
        }

        public int size() {
            mo29318l();
            return this.f11483l.size();
        }

        public String toString() {
            mo29318l();
            return this.f11483l.toString();
        }

        /* renamed from: c.q.b.b.e$k$a */
        /* compiled from: AbstractMapBasedMultimap */
        public class C5944a implements Iterator<V> {

            /* renamed from: e */
            public final Iterator<V> f11487e;

            /* renamed from: l */
            public final Collection<V> f11488l = C5943k.this.f11483l;

            public C5944a() {
                this.f11487e = C5929e.iteratorOrListIterator(C5943k.this.f11483l);
            }

            /* renamed from: a */
            public Iterator<V> mo29325a() {
                mo29326b();
                return this.f11487e;
            }

            /* renamed from: b */
            public void mo29326b() {
                C5943k.this.mo29318l();
                if (C5943k.this.f11483l != this.f11488l) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                mo29326b();
                return this.f11487e.hasNext();
            }

            public V next() {
                mo29326b();
                return this.f11487e.next();
            }

            public void remove() {
                this.f11487e.remove();
                C5929e.access$210(C5929e.this);
                C5943k.this.mo29319o();
            }

            public C5944a(Iterator<V> it) {
                this.f11487e = it;
            }
        }
    }

    /* renamed from: c.q.b.b.e$l */
    /* compiled from: AbstractMapBasedMultimap */
    public class C5945l extends C5929e<K, V>.k implements List<V> {

        /* renamed from: c.q.b.b.e$l$a */
        /* compiled from: AbstractMapBasedMultimap */
        public class C5946a extends C5929e<K, V>.a implements ListIterator<V> {
            public C5946a() {
                super();
            }

            public void add(V v) {
                boolean isEmpty = C5945l.this.isEmpty();
                mo29342c().add(v);
                C5929e.access$208(C5929e.this);
                if (isEmpty) {
                    C5945l.this.mo29308c();
                }
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [c.q.b.b.e$l$a, c.q.b.b.e$k$a] */
            /* renamed from: c */
            public final ListIterator<V> mo29342c() {
                return (ListIterator) mo29325a();
            }

            public boolean hasPrevious() {
                return mo29342c().hasPrevious();
            }

            public int nextIndex() {
                return mo29342c().nextIndex();
            }

            public V previous() {
                return mo29342c().previous();
            }

            public int previousIndex() {
                return mo29342c().previousIndex();
            }

            public void set(V v) {
                mo29342c().set(v);
            }

            public C5946a(int i) {
                super(C5945l.this.mo29337p().listIterator(i));
            }
        }

        public C5945l(K k, List<V> list, C5929e<K, V>.k kVar) {
            super(k, list, kVar);
        }

        public void add(int i, V v) {
            mo29318l();
            boolean isEmpty = mo29314g().isEmpty();
            mo29337p().add(i, v);
            C5929e.access$208(C5929e.this);
            if (isEmpty) {
                mo29308c();
            }
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = mo29337p().addAll(i, collection);
            if (addAll) {
                int size2 = mo29314g().size();
                C5929e eVar = C5929e.this;
                int unused = eVar.totalSize = eVar.totalSize + (size2 - size);
                if (size == 0) {
                    mo29308c();
                }
            }
            return addAll;
        }

        public V get(int i) {
            mo29318l();
            return mo29337p().get(i);
        }

        public int indexOf(Object obj) {
            mo29318l();
            return mo29337p().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            mo29318l();
            return mo29337p().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            mo29318l();
            return new C5946a();
        }

        /* renamed from: p */
        public List<V> mo29337p() {
            return (List) mo29314g();
        }

        public V remove(int i) {
            mo29318l();
            V remove = mo29337p().remove(i);
            C5929e.access$210(C5929e.this);
            mo29319o();
            return remove;
        }

        public V set(int i, V v) {
            mo29318l();
            return mo29337p().set(i, v);
        }

        public List<V> subList(int i, int i2) {
            mo29318l();
            return C5929e.this.wrapList(mo29317k(), mo29337p().subList(i, i2), mo29313f() == null ? this : mo29313f());
        }

        public ListIterator<V> listIterator(int i) {
            mo29318l();
            return new C5946a(i);
        }
    }
}
