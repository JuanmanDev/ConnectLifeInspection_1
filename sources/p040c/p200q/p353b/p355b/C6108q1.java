package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableMap;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p040c.p200q.p353b.p354a.C5838g;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p354a.C5851n;
import p040c.p200q.p353b.p354a.C5852o;
import p040c.p200q.p353b.p355b.C6148s2;

/* renamed from: c.q.b.b.q1 */
/* compiled from: Maps */
public final class C6108q1 {

    /* renamed from: c.q.b.b.q1$a */
    /* compiled from: Maps */
    public static class C6109a extends C5978g<K, V2> {

        /* renamed from: e */
        public final /* synthetic */ Map.Entry f11710e;

        /* renamed from: l */
        public final /* synthetic */ C6122k f11711l;

        public C6109a(Map.Entry entry, C6122k kVar) {
            this.f11710e = entry;
            this.f11711l = kVar;
        }

        public K getKey() {
            return this.f11710e.getKey();
        }

        public V2 getValue() {
            return this.f11711l.mo29884a(this.f11710e.getKey(), this.f11710e.getValue());
        }
    }

    /* renamed from: c.q.b.b.q1$b */
    /* compiled from: Maps */
    public static class C6110b implements C5838g<Map.Entry<K, V1>, Map.Entry<K, V2>> {

        /* renamed from: e */
        public final /* synthetic */ C6122k f11712e;

        public C6110b(C6122k kVar) {
            this.f11712e = kVar;
        }

        /* renamed from: a */
        public Map.Entry<K, V2> apply(Map.Entry<K, V1> entry) {
            return C6108q1.m17189y(this.f11712e, entry);
        }
    }

    /* renamed from: c.q.b.b.q1$c */
    /* compiled from: Maps */
    public static class C6111c extends C5977f3<Map.Entry<K, V>, K> {
        public C6111c(Iterator it) {
            super(it);
        }

        /* renamed from: b */
        public K mo29448a(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* renamed from: c.q.b.b.q1$d */
    /* compiled from: Maps */
    public static class C6112d extends C5977f3<Map.Entry<K, V>, V> {
        public C6112d(Iterator it) {
            super(it);
        }

        /* renamed from: b */
        public V mo29448a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* renamed from: c.q.b.b.q1$e */
    /* compiled from: Maps */
    public static class C6113e extends C5977f3<K, Map.Entry<K, V>> {

        /* renamed from: l */
        public final /* synthetic */ C5838g f11713l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6113e(Iterator it, C5838g gVar) {
            super(it);
            this.f11713l = gVar;
        }

        /* renamed from: b */
        public Map.Entry<K, V> mo29448a(K k) {
            return C6108q1.m17173i(k, this.f11713l.apply(k));
        }
    }

    /* renamed from: c.q.b.b.q1$f */
    /* compiled from: Maps */
    public static class C6114f extends C5978g<K, V> {

        /* renamed from: e */
        public final /* synthetic */ Map.Entry f11714e;

        public C6114f(Map.Entry entry) {
            this.f11714e = entry;
        }

        public K getKey() {
            return this.f11714e.getKey();
        }

        public V getValue() {
            return this.f11714e.getValue();
        }
    }

    /* renamed from: c.q.b.b.q1$g */
    /* compiled from: Maps */
    public static class C6115g implements C6122k<K, V1, V2> {

        /* renamed from: a */
        public final /* synthetic */ C5838g f11715a;

        public C6115g(C5838g gVar) {
            this.f11715a = gVar;
        }

        /* renamed from: a */
        public V2 mo29884a(K k, V1 v1) {
            return this.f11715a.apply(v1);
        }
    }

    /* renamed from: c.q.b.b.q1$h */
    /* compiled from: Maps */
    public static abstract class C6116h<K, V> extends C6107q0<K, V> implements NavigableMap<K, V> {

        /* renamed from: e */
        public transient Comparator<? super K> f11716e;

        /* renamed from: l */
        public transient Set<Map.Entry<K, V>> f11717l;

        /* renamed from: m */
        public transient NavigableSet<K> f11718m;

        /* renamed from: c.q.b.b.q1$h$a */
        /* compiled from: Maps */
        public class C6117a extends C6121j<K, V> {
            public C6117a() {
            }

            public Iterator<Map.Entry<K, V>> iterator() {
                return C6116h.this.mo29577f();
            }

            /* renamed from: k */
            public Map<K, V> mo29233k() {
                return C6116h.this;
            }
        }

        /* renamed from: l */
        public static <T> C6205z1<T> m17199l(Comparator<T> comparator) {
            return C6205z1.m17454a(comparator).mo29701h();
        }

        /* renamed from: c */
        public Set<Map.Entry<K, V>> mo29885c() {
            return new C6117a();
        }

        public Map.Entry<K, V> ceilingEntry(K k) {
            return mo29578g().floorEntry(k);
        }

        public K ceilingKey(K k) {
            return mo29578g().floorKey(k);
        }

        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f11716e;
            if (comparator != null) {
                return comparator;
            }
            Comparator comparator2 = mo29578g().comparator();
            if (comparator2 == null) {
                comparator2 = C6205z1.m17455e();
            }
            C6205z1 l = m17199l(comparator2);
            this.f11716e = l;
            return l;
        }

        public NavigableSet<K> descendingKeySet() {
            return mo29578g().navigableKeySet();
        }

        public NavigableMap<K, V> descendingMap() {
            return mo29578g();
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f11717l;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> c = mo29885c();
            this.f11717l = c;
            return c;
        }

        /* renamed from: f */
        public abstract Iterator<Map.Entry<K, V>> mo29577f();

        public Map.Entry<K, V> firstEntry() {
            return mo29578g().lastEntry();
        }

        public K firstKey() {
            return mo29578g().lastKey();
        }

        public Map.Entry<K, V> floorEntry(K k) {
            return mo29578g().ceilingEntry(k);
        }

        public K floorKey(K k) {
            return mo29578g().ceilingKey(k);
        }

        /* renamed from: g */
        public abstract NavigableMap<K, V> mo29578g();

        public NavigableMap<K, V> headMap(K k, boolean z) {
            return mo29578g().tailMap(k, z).descendingMap();
        }

        public Map.Entry<K, V> higherEntry(K k) {
            return mo29578g().lowerEntry(k);
        }

        public K higherKey(K k) {
            return mo29578g().lowerKey(k);
        }

        public Set<K> keySet() {
            return navigableKeySet();
        }

        public Map.Entry<K, V> lastEntry() {
            return mo29578g().firstEntry();
        }

        public K lastKey() {
            return mo29578g().firstKey();
        }

        public Map.Entry<K, V> lowerEntry(K k) {
            return mo29578g().higherEntry(k);
        }

        public K lowerKey(K k) {
            return mo29578g().higherKey(k);
        }

        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f11718m;
            if (navigableSet != null) {
                return navigableSet;
            }
            C6126n nVar = new C6126n(this);
            this.f11718m = nVar;
            return nVar;
        }

        public Map.Entry<K, V> pollFirstEntry() {
            return mo29578g().pollLastEntry();
        }

        public Map.Entry<K, V> pollLastEntry() {
            return mo29578g().pollFirstEntry();
        }

        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return mo29578g().subMap(k2, z2, k, z).descendingMap();
        }

        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return mo29578g().headMap(k, z).descendingMap();
        }

        public String toString() {
            return standardToString();
        }

        public Collection<V> values() {
            return new C6129q(this);
        }

        public final Map<K, V> delegate() {
            return mo29578g();
        }

        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }
    }

    /* renamed from: c.q.b.b.q1$i */
    /* compiled from: Maps */
    public enum C6118i implements C5838g<Map.Entry<?, ?>, Object> {
        KEY {
            /* renamed from: c */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            /* renamed from: c */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
    }

    /* renamed from: c.q.b.b.q1$j */
    /* compiled from: Maps */
    public static abstract class C6121j<K, V> extends C6148s2.C6149a<Map.Entry<K, V>> {
        public void clear() {
            mo29233k().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object u = C6108q1.m17185u(mo29233k(), key);
            if (!C5845j.m16576a(u, entry.getValue())) {
                return false;
            }
            if (u != null || mo29233k().containsKey(key)) {
                return true;
            }
            return false;
        }

        public boolean isEmpty() {
            return mo29233k().isEmpty();
        }

        /* renamed from: k */
        public abstract Map<K, V> mo29233k();

        public boolean remove(Object obj) {
            if (contains(obj)) {
                return mo29233k().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                C5850m.m16594o(collection);
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                return C6148s2.m17253f(this, collection.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                C5850m.m16594o(collection);
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet d = C6148s2.m17251d(collection.size());
                for (Object next : collection) {
                    if (contains(next)) {
                        d.add(((Map.Entry) next).getKey());
                    }
                }
                return mo29233k().keySet().retainAll(d);
            }
        }

        public int size() {
            return mo29233k().size();
        }
    }

    /* renamed from: c.q.b.b.q1$k */
    /* compiled from: Maps */
    public interface C6122k<K, V1, V2> {
        /* renamed from: a */
        V2 mo29884a(K k, V1 v1);
    }

    /* renamed from: c.q.b.b.q1$l */
    /* compiled from: Maps */
    public static abstract class C6123l<K, V> extends AbstractMap<K, V> {

        /* renamed from: c.q.b.b.q1$l$a */
        /* compiled from: Maps */
        public class C6124a extends C6121j<K, V> {
            public C6124a() {
            }

            public Iterator<Map.Entry<K, V>> iterator() {
                return C6123l.this.mo29135a();
            }

            /* renamed from: k */
            public Map<K, V> mo29233k() {
                return C6123l.this;
            }
        }

        /* renamed from: a */
        public abstract Iterator<Map.Entry<K, V>> mo29135a();

        public void clear() {
            C6028l1.m16932d(mo29135a());
        }

        public Set<Map.Entry<K, V>> entrySet() {
            return new C6124a();
        }
    }

    /* renamed from: c.q.b.b.q1$m */
    /* compiled from: Maps */
    public static class C6125m<K, V> extends C6148s2.C6149a<K> {

        /* renamed from: e */
        public final Map<K, V> f11724e;

        public C6125m(Map<K, V> map) {
            C5850m.m16594o(map);
            this.f11724e = map;
        }

        public void clear() {
            mo29919k().clear();
        }

        public boolean contains(Object obj) {
            return mo29919k().containsKey(obj);
        }

        public boolean isEmpty() {
            return mo29919k().isEmpty();
        }

        public Iterator<K> iterator() {
            return C6108q1.m17176l(mo29919k().entrySet().iterator());
        }

        /* renamed from: k */
        public Map<K, V> mo29919k() {
            return this.f11724e;
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            mo29919k().remove(obj);
            return true;
        }

        public int size() {
            return mo29919k().size();
        }
    }

    /* renamed from: c.q.b.b.q1$n */
    /* compiled from: Maps */
    public static class C6126n<K, V> extends C6127o<K, V> implements NavigableSet<K> {
        public C6126n(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        public K ceiling(K k) {
            return mo29929o().ceilingKey(k);
        }

        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<K> descendingSet() {
            return mo29929o().descendingKeySet();
        }

        public K floor(K k) {
            return mo29929o().floorKey(k);
        }

        public NavigableSet<K> headSet(K k, boolean z) {
            return mo29929o().headMap(k, z).navigableKeySet();
        }

        public K higher(K k) {
            return mo29929o().higherKey(k);
        }

        public K lower(K k) {
            return mo29929o().lowerKey(k);
        }

        /* renamed from: p */
        public NavigableMap<K, V> mo29929o() {
            return (NavigableMap) this.f11724e;
        }

        public K pollFirst() {
            return C6108q1.m17177m(mo29929o().pollFirstEntry());
        }

        public K pollLast() {
            return C6108q1.m17177m(mo29929o().pollLastEntry());
        }

        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return mo29929o().subMap(k, z, k2, z2).navigableKeySet();
        }

        public NavigableSet<K> tailSet(K k, boolean z) {
            return mo29929o().tailMap(k, z).navigableKeySet();
        }

        public SortedSet<K> headSet(K k) {
            return headSet(k, false);
        }

        public SortedSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        public SortedSet<K> tailSet(K k) {
            return tailSet(k, true);
        }
    }

    /* renamed from: c.q.b.b.q1$o */
    /* compiled from: Maps */
    public static class C6127o<K, V> extends C6125m<K, V> implements SortedSet<K> {
        public C6127o(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo29919k().comparator();
        }

        public K first() {
            return mo29919k().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C6127o(mo29919k().headMap(k));
        }

        public K last() {
            return mo29919k().lastKey();
        }

        /* renamed from: o */
        public SortedMap<K, V> mo29919k() {
            return (SortedMap) super.mo29919k();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C6127o(mo29919k().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C6127o(mo29919k().tailMap(k));
        }
    }

    /* renamed from: c.q.b.b.q1$p */
    /* compiled from: Maps */
    public static class C6128p<K, V1, V2> extends C6123l<K, V2> {

        /* renamed from: e */
        public final Map<K, V1> f11725e;

        /* renamed from: l */
        public final C6122k<? super K, ? super V1, V2> f11726l;

        public C6128p(Map<K, V1> map, C6122k<? super K, ? super V1, V2> kVar) {
            C5850m.m16594o(map);
            this.f11725e = map;
            C5850m.m16594o(kVar);
            this.f11726l = kVar;
        }

        /* renamed from: a */
        public Iterator<Map.Entry<K, V2>> mo29135a() {
            return C6028l1.m16951w(this.f11725e.entrySet().iterator(), C6108q1.m17165a(this.f11726l));
        }

        public void clear() {
            this.f11725e.clear();
        }

        public boolean containsKey(Object obj) {
            return this.f11725e.containsKey(obj);
        }

        public V2 get(Object obj) {
            V1 v1 = this.f11725e.get(obj);
            if (v1 != null || this.f11725e.containsKey(obj)) {
                return this.f11726l.mo29884a(obj, v1);
            }
            return null;
        }

        public Set<K> keySet() {
            return this.f11725e.keySet();
        }

        public V2 remove(Object obj) {
            if (this.f11725e.containsKey(obj)) {
                return this.f11726l.mo29884a(obj, this.f11725e.remove(obj));
            }
            return null;
        }

        public int size() {
            return this.f11725e.size();
        }

        public Collection<V2> values() {
            return new C6129q(this);
        }
    }

    /* renamed from: c.q.b.b.q1$q */
    /* compiled from: Maps */
    public static class C6129q<K, V> extends AbstractCollection<V> {

        /* renamed from: e */
        public final Map<K, V> f11727e;

        public C6129q(Map<K, V> map) {
            C5850m.m16594o(map);
            this.f11727e = map;
        }

        /* renamed from: c */
        public final Map<K, V> mo29946c() {
            return this.f11727e;
        }

        public void clear() {
            mo29946c().clear();
        }

        public boolean contains(Object obj) {
            return mo29946c().containsValue(obj);
        }

        public boolean isEmpty() {
            return mo29946c().isEmpty();
        }

        public Iterator<V> iterator() {
            return C6108q1.m17162C(mo29946c().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : mo29946c().entrySet()) {
                    if (C5845j.m16576a(obj, entry.getValue())) {
                        mo29946c().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                C5850m.m16594o(collection);
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet c = C6148s2.m17250c();
                for (Map.Entry entry : mo29946c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        c.add(entry.getKey());
                    }
                }
                return mo29946c().keySet().removeAll(c);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                C5850m.m16594o(collection);
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet c = C6148s2.m17250c();
                for (Map.Entry entry : mo29946c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        c.add(entry.getKey());
                    }
                }
                return mo29946c().keySet().retainAll(c);
            }
        }

        public int size() {
            return mo29946c().size();
        }
    }

    /* renamed from: c.q.b.b.q1$r */
    /* compiled from: Maps */
    public static abstract class C6130r<K, V> extends AbstractMap<K, V> {

        /* renamed from: e */
        public transient Set<Map.Entry<K, V>> f11728e;

        /* renamed from: l */
        public transient Set<K> f11729l;

        /* renamed from: m */
        public transient Collection<V> f11730m;

        /* renamed from: a */
        public abstract Set<Map.Entry<K, V>> mo29100a();

        /* renamed from: b */
        public Set<K> mo29057b() {
            return new C6125m(this);
        }

        /* renamed from: c */
        public Collection<V> mo29101c() {
            return new C6129q(this);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f11728e;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a = mo29100a();
            this.f11728e = a;
            return a;
        }

        public Set<K> keySet() {
            Set<K> set = this.f11729l;
            if (set != null) {
                return set;
            }
            Set<K> b = mo29057b();
            this.f11729l = b;
            return b;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f11730m;
            if (collection != null) {
                return collection;
            }
            Collection<V> c = mo29101c();
            this.f11730m = c;
            return c;
        }
    }

    /* renamed from: A */
    public static <K, V> Map.Entry<K, V> m17160A(Map.Entry<? extends K, ? extends V> entry) {
        C5850m.m16594o(entry);
        return new C6114f(entry);
    }

    /* renamed from: B */
    public static <V> C5838g<Map.Entry<?, V>, V> m17161B() {
        return C6118i.VALUE;
    }

    /* renamed from: C */
    public static <K, V> Iterator<V> m17162C(Iterator<Map.Entry<K, V>> it) {
        return new C6112d(it);
    }

    /* renamed from: D */
    public static <V> V m17163D(Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    /* renamed from: E */
    public static <V> C5851n<Map.Entry<?, V>> m17164E(C5851n<? super V> nVar) {
        return C5852o.m16605b(nVar, m17161B());
    }

    /* renamed from: a */
    public static <K, V1, V2> C5838g<Map.Entry<K, V1>, Map.Entry<K, V2>> m17165a(C6122k<? super K, ? super V1, V2> kVar) {
        C5850m.m16594o(kVar);
        return new C6110b(kVar);
    }

    /* renamed from: b */
    public static <K, V1, V2> C6122k<K, V1, V2> m17166b(C5838g<? super V1, V2> gVar) {
        C5850m.m16594o(gVar);
        return new C6115g(gVar);
    }

    /* renamed from: c */
    public static <K, V> Iterator<Map.Entry<K, V>> m17167c(Set<K> set, C5838g<? super K, V> gVar) {
        return new C6113e(set.iterator(), gVar);
    }

    /* renamed from: d */
    public static int m17168d(int i) {
        if (i < 3) {
            C6166v.m17276b(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: e */
    public static <K, V> boolean m17169e(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return collection.contains(m17160A((Map.Entry) obj));
    }

    /* renamed from: f */
    public static boolean m17170f(Map<?, ?> map, Object obj) {
        return C6028l1.m16934f(m17176l(map.entrySet().iterator()), obj);
    }

    /* renamed from: g */
    public static boolean m17171g(Map<?, ?> map, Object obj) {
        return C6028l1.m16934f(m17162C(map.entrySet().iterator()), obj);
    }

    /* renamed from: h */
    public static boolean m17172h(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: i */
    public static <K, V> Map.Entry<K, V> m17173i(K k, V v) {
        return new C5881b1(k, v);
    }

    /* renamed from: j */
    public static <E> ImmutableMap<E, Integer> m17174j(Collection<E> collection) {
        ImmutableMap.C8107b bVar = new ImmutableMap.C8107b(collection.size());
        int i = 0;
        for (E c : collection) {
            bVar.mo36595c(c, Integer.valueOf(i));
            i++;
        }
        return bVar.mo36594a();
    }

    /* renamed from: k */
    public static <K> C5838g<Map.Entry<K, ?>, K> m17175k() {
        return C6118i.KEY;
    }

    /* renamed from: l */
    public static <K, V> Iterator<K> m17176l(Iterator<Map.Entry<K, V>> it) {
        return new C6111c(it);
    }

    /* renamed from: m */
    public static <K> K m17177m(Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* renamed from: n */
    public static <K> C5851n<Map.Entry<K, ?>> m17178n(C5851n<? super K> nVar) {
        return C5852o.m16605b(nVar, m17175k());
    }

    /* renamed from: o */
    public static <K, V> HashMap<K, V> m17179o() {
        return new HashMap<>();
    }

    /* renamed from: p */
    public static <K, V> HashMap<K, V> m17180p(int i) {
        return new HashMap<>(m17168d(i));
    }

    /* renamed from: q */
    public static <K, V> LinkedHashMap<K, V> m17181q() {
        return new LinkedHashMap<>();
    }

    /* renamed from: r */
    public static <K, V> LinkedHashMap<K, V> m17182r(int i) {
        return new LinkedHashMap<>(m17168d(i));
    }

    /* renamed from: s */
    public static <K, V> void m17183s(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry next : map2.entrySet()) {
            map.put(next.getKey(), next.getValue());
        }
    }

    /* renamed from: t */
    public static boolean m17184t(Map<?, ?> map, Object obj) {
        C5850m.m16594o(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: u */
    public static <V> V m17185u(Map<?, V> map, Object obj) {
        C5850m.m16594o(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: v */
    public static <V> V m17186v(Map<?, V> map, Object obj) {
        C5850m.m16594o(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: w */
    public static String m17187w(Map<?, ?> map) {
        StringBuilder c = C6170w.m17284c(map.size());
        c.append('{');
        boolean z = true;
        for (Map.Entry next : map.entrySet()) {
            if (!z) {
                c.append(", ");
            }
            z = false;
            c.append(next.getKey());
            c.append('=');
            c.append(next.getValue());
        }
        c.append('}');
        return c.toString();
    }

    /* renamed from: x */
    public static <K, V1, V2> Map<K, V2> m17188x(Map<K, V1> map, C6122k<? super K, ? super V1, V2> kVar) {
        return new C6128p(map, kVar);
    }

    /* renamed from: y */
    public static <V2, K, V1> Map.Entry<K, V2> m17189y(C6122k<? super K, ? super V1, V2> kVar, Map.Entry<K, V1> entry) {
        C5850m.m16594o(kVar);
        C5850m.m16594o(entry);
        return new C6109a(entry, kVar);
    }

    /* renamed from: z */
    public static <K, V1, V2> Map<K, V2> m17190z(Map<K, V1> map, C5838g<? super V1, V2> gVar) {
        return m17188x(map, m17166b(gVar));
    }
}
