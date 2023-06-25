package com.google.common.collect;

import androidx.core.app.Person;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5892c1;
import p040c.p200q.p353b.p355b.C5980g1;
import p040c.p200q.p353b.p355b.C5991h3;
import p040c.p200q.p353b.p355b.C6020k1;
import p040c.p200q.p353b.p355b.C6046m2;
import p040c.p200q.p353b.p355b.C6108q1;
import p040c.p200q.p353b.p355b.C6166v;
import p040c.p200q.p353b.p355b.C6205z1;

public final class ImmutableSortedMap<K, V> extends C5980g1<K, V> implements NavigableMap<K, V> {
    public static final ImmutableSortedMap<Comparable, Object> NATURAL_EMPTY_MAP = new ImmutableSortedMap<>(ImmutableSortedSet.emptySet(C6205z1.m17455e()), ImmutableList.m22152of());
    public static final Comparator<Comparable> NATURAL_ORDER = C6205z1.m17455e();
    public static final long serialVersionUID = 0;
    public transient ImmutableSortedMap<K, V> descendingMap;
    public final transient C6046m2<K> keySet;
    public final transient ImmutableList<V> valueList;

    /* renamed from: com.google.common.collect.ImmutableSortedMap$a */
    public static class C8143a implements Comparator<Map.Entry<K, V>> {

        /* renamed from: e */
        public final /* synthetic */ Comparator f15133e;

        public C8143a(Comparator comparator) {
            this.f15133e = comparator;
        }

        /* renamed from: a */
        public int compare(Map.Entry<K, V> entry, Map.Entry<K, V> entry2) {
            return this.f15133e.compare(entry.getKey(), entry2.getKey());
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSortedMap$b */
    public class C8144b extends C5892c1<K, V> {

        /* renamed from: com.google.common.collect.ImmutableSortedMap$b$a */
        public class C8145a extends ImmutableList<Map.Entry<K, V>> {
            public C8145a() {
            }

            /* renamed from: c */
            public Map.Entry<K, V> get(int i) {
                return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.keySet.asList().get(i), ImmutableSortedMap.this.valueList.get(i));
            }

            public boolean isPartialView() {
                return true;
            }

            public int size() {
                return ImmutableSortedMap.this.size();
            }
        }

        public C8144b() {
        }

        /* renamed from: c */
        public ImmutableMap<K, V> mo29075c() {
            return ImmutableSortedMap.this;
        }

        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return new C8145a();
        }

        public C5991h3<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSortedMap$c */
    public static class C8146c<K, V> extends ImmutableMap.C8107b<K, V> {

        /* renamed from: e */
        public transient Object[] f15136e;

        /* renamed from: f */
        public transient Object[] f15137f;

        /* renamed from: g */
        public final Comparator<? super K> f15138g;

        public C8146c(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        /* renamed from: b */
        private void m22290b(int i) {
            Object[] objArr = this.f15136e;
            if (i > objArr.length) {
                int e = ImmutableCollection.C8099b.m22147e(objArr.length, i);
                this.f15136e = Arrays.copyOf(this.f15136e, e);
                this.f15137f = Arrays.copyOf(this.f15137f, e);
            }
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ ImmutableMap.C8107b mo36595c(Object obj, Object obj2) {
            mo36797i(obj, obj2);
            return this;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ ImmutableMap.C8107b mo36596d(Map.Entry entry) {
            mo36798j(entry);
            return this;
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ ImmutableMap.C8107b mo36597e(Iterable iterable) {
            mo36799k(iterable);
            return this;
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ ImmutableMap.C8107b mo36598f(Map map) {
            mo36800l(map);
            return this;
        }

        /* renamed from: h */
        public ImmutableSortedMap<K, V> mo36594a() {
            int i = this.f15067c;
            if (i == 0) {
                return ImmutableSortedMap.emptyMap(this.f15138g);
            }
            if (i == 1) {
                return ImmutableSortedMap.m22286of(this.f15138g, this.f15136e[0], this.f15137f[0]);
            }
            Object[] copyOf = Arrays.copyOf(this.f15136e, i);
            Arrays.sort(copyOf, this.f15138g);
            Object[] objArr = new Object[this.f15067c];
            for (int i2 = 0; i2 < this.f15067c; i2++) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (this.f15138g.compare(copyOf[i3], copyOf[i2]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + copyOf[i3] + " and " + copyOf[i2]);
                    }
                }
                objArr[Arrays.binarySearch(copyOf, this.f15136e[i2], this.f15138g)] = this.f15137f[i2];
            }
            return new ImmutableSortedMap<>(new C6046m2(ImmutableList.asImmutableList(copyOf), this.f15138g), ImmutableList.asImmutableList(objArr));
        }

        /* renamed from: i */
        public C8146c<K, V> mo36797i(K k, V v) {
            m22290b(this.f15067c + 1);
            C6166v.m17275a(k, v);
            Object[] objArr = this.f15136e;
            int i = this.f15067c;
            objArr[i] = k;
            this.f15137f[i] = v;
            this.f15067c = i + 1;
            return this;
        }

        /* renamed from: j */
        public C8146c<K, V> mo36798j(Map.Entry<? extends K, ? extends V> entry) {
            super.mo36596d(entry);
            return this;
        }

        /* renamed from: k */
        public C8146c<K, V> mo36799k(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo36597e(iterable);
            return this;
        }

        /* renamed from: l */
        public C8146c<K, V> mo36800l(Map<? extends K, ? extends V> map) {
            super.mo36598f(map);
            return this;
        }

        public C8146c(Comparator<? super K> comparator, int i) {
            C5850m.m16594o(comparator);
            this.f15138g = comparator;
            this.f15136e = new Object[i];
            this.f15137f = new Object[i];
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSortedMap$d */
    public static class C8147d extends ImmutableMap.C8113e {
        public static final long serialVersionUID = 0;

        /* renamed from: m */
        public final Comparator<Object> f15139m;

        public C8147d(ImmutableSortedMap<?, ?> immutableSortedMap) {
            super(immutableSortedMap);
            this.f15139m = immutableSortedMap.comparator();
        }

        public Object readResolve() {
            return mo36680a(new C8146c(this.f15139m));
        }
    }

    public ImmutableSortedMap(C6046m2<K> m2Var, ImmutableList<V> immutableList) {
        this(m2Var, immutableList, (ImmutableSortedMap) null);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return copyOfInternal(map, (C6205z1) NATURAL_ORDER);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOfInternal(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        boolean z;
        boolean z2 = false;
        if (map instanceof SortedMap) {
            Comparator comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                z = comparator.equals(comparator2);
            } else if (comparator == NATURAL_ORDER) {
                z = true;
            }
            z2 = z;
        }
        if (z2 && (map instanceof ImmutableSortedMap)) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) map;
            if (!immutableSortedMap.isPartialView()) {
                return immutableSortedMap;
            }
        }
        return fromEntries(comparator, z2, map.entrySet());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.SortedMap<K, ? extends V>, java.util.SortedMap] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOfSorted(java.util.SortedMap<K, ? extends V> r3) {
        /*
            java.util.Comparator r0 = r3.comparator()
            if (r0 != 0) goto L_0x0008
            java.util.Comparator<java.lang.Comparable> r0 = NATURAL_ORDER
        L_0x0008:
            boolean r1 = r3 instanceof com.google.common.collect.ImmutableSortedMap
            if (r1 == 0) goto L_0x0016
            r1 = r3
            com.google.common.collect.ImmutableSortedMap r1 = (com.google.common.collect.ImmutableSortedMap) r1
            boolean r2 = r1.isPartialView()
            if (r2 != 0) goto L_0x0016
            return r1
        L_0x0016:
            r1 = 1
            java.util.Set r3 = r3.entrySet()
            com.google.common.collect.ImmutableSortedMap r3 = fromEntries(r0, r1, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSortedMap.copyOfSorted(java.util.SortedMap):com.google.common.collect.ImmutableSortedMap");
    }

    public static <K, V> ImmutableSortedMap<K, V> emptyMap(Comparator<? super K> comparator) {
        if (C6205z1.m17455e().equals(comparator)) {
            return m22280of();
        }
        return new ImmutableSortedMap<>(ImmutableSortedSet.emptySet(comparator), ImmutableList.m22152of());
    }

    public static <K, V> ImmutableSortedMap<K, V> fromEntries(Comparator<? super K> comparator, boolean z, Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) C6020k1.m16925l(iterable, ImmutableMap.EMPTY_ENTRY_ARRAY);
        return fromEntries(comparator, z, entryArr, entryArr.length);
    }

    private ImmutableSortedMap<K, V> getSubMap(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i == i2) {
            return emptyMap(comparator());
        }
        return new ImmutableSortedMap<>(this.keySet.mo29637c(i, i2), this.valueList.subList(i, i2));
    }

    public static <K extends Comparable<?>, V> C8146c<K, V> naturalOrder() {
        return new C8146c<>(C6205z1.m17455e());
    }

    /* renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m22280of() {
        return NATURAL_EMPTY_MAP;
    }

    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> ofEntries(Map.Entry<K, V>... entryArr) {
        return fromEntries(C6205z1.m17455e(), false, entryArr, entryArr.length);
    }

    public static <K, V> C8146c<K, V> orderedBy(Comparator<K> comparator) {
        return new C8146c<>(comparator);
    }

    public static <K extends Comparable<?>, V> C8146c<K, V> reverseOrder() {
        return new C8146c<>(C6205z1.m17455e().mo29701h());
    }

    public Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    public K ceilingKey(K k) {
        return C6108q1.m17177m(ceilingEntry(k));
    }

    public Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return isEmpty() ? ImmutableSet.m22254of() : new C8144b();
    }

    public ImmutableSet<K> createKeySet() {
        throw new AssertionError("should never be called");
    }

    public ImmutableCollection<V> createValues() {
        throw new AssertionError("should never be called");
    }

    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().asList().get(0);
    }

    public K firstKey() {
        return keySet().first();
    }

    public Map.Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    public K floorKey(K k) {
        return C6108q1.m17177m(floorEntry(k));
    }

    public V get(Object obj) {
        int indexOf = this.keySet.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.valueList.get(indexOf);
    }

    public Map.Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    public K higherKey(K k) {
        return C6108q1.m17177m(higherEntry(k));
    }

    public boolean isPartialView() {
        return this.keySet.isPartialView() || this.valueList.isPartialView();
    }

    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().asList().get(size() - 1);
    }

    public K lastKey() {
        return keySet().last();
    }

    public Map.Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    public K lowerKey(K k) {
        return C6108q1.m17177m(lowerEntry(k));
    }

    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.valueList.size();
    }

    public Object writeReplace() {
        return new C8147d(this);
    }

    public ImmutableSortedMap(C6046m2<K> m2Var, ImmutableList<V> immutableList, ImmutableSortedMap<K, V> immutableSortedMap) {
        this.keySet = m2Var;
        this.valueList = immutableList;
        this.descendingMap = immutableSortedMap;
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m22281of(K k, V v) {
        return m22286of(C6205z1.m17455e(), k, v);
    }

    public ImmutableSortedSet<K> descendingKeySet() {
        return this.keySet.descendingSet();
    }

    public ImmutableSortedMap<K, V> descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.descendingMap;
        if (immutableSortedMap != null) {
            return immutableSortedMap;
        }
        if (isEmpty()) {
            return emptyMap(C6205z1.m17454a(comparator()).mo29701h());
        }
        return new ImmutableSortedMap<>((C6046m2) this.keySet.descendingSet(), this.valueList.reverse(), this);
    }

    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    public ImmutableSortedSet<K> navigableKeySet() {
        return this.keySet;
    }

    public ImmutableCollection<V> values() {
        return this.valueList;
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        C5850m.m16594o(comparator);
        return copyOfInternal(map, comparator);
    }

    public static <K, V> ImmutableSortedMap<K, V> fromEntries(Comparator<? super K> comparator, boolean z, Map.Entry<K, V>[] entryArr, int i) {
        if (i == 0) {
            return emptyMap(comparator);
        }
        if (i == 1) {
            return m22286of(comparator, entryArr[0].getKey(), entryArr[0].getValue());
        }
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        if (z) {
            for (int i2 = 0; i2 < i; i2++) {
                K key = entryArr[i2].getKey();
                V value = entryArr[i2].getValue();
                C6166v.m17275a(key, value);
                objArr[i2] = key;
                objArr2[i2] = value;
            }
        } else {
            Arrays.sort(entryArr, 0, i, new C8143a(comparator));
            K key2 = entryArr[0].getKey();
            objArr[0] = key2;
            objArr2[0] = entryArr[0].getValue();
            C6166v.m17275a(objArr[0], objArr2[0]);
            int i3 = 1;
            while (i3 < i) {
                K key3 = entryArr[i3].getKey();
                V value2 = entryArr[i3].getValue();
                C6166v.m17275a(key3, value2);
                objArr[i3] = key3;
                objArr2[i3] = value2;
                ImmutableMap.checkNoConflict(comparator.compare(key2, key3) != 0, Person.KEY_KEY, entryArr[i3 - 1], entryArr[i3]);
                i3++;
                key2 = key3;
            }
        }
        return new ImmutableSortedMap<>(new C6046m2(ImmutableList.asImmutableList(objArr), comparator), ImmutableList.asImmutableList(objArr2));
    }

    /* renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m22286of(Comparator<? super K> comparator, K k, V v) {
        ImmutableList of = ImmutableList.m22153of(k);
        C5850m.m16594o(comparator);
        return new ImmutableSortedMap<>(new C6046m2(of, comparator), ImmutableList.m22153of(v));
    }

    public ImmutableSortedMap<K, V> headMap(K k) {
        return headMap(k, false);
    }

    public ImmutableSortedSet<K> keySet() {
        return this.keySet;
    }

    public ImmutableSortedMap<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    public ImmutableSortedMap<K, V> tailMap(K k) {
        return tailMap(k, true);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return copyOf(iterable, (C6205z1) NATURAL_ORDER);
    }

    public ImmutableSortedMap<K, V> headMap(K k, boolean z) {
        C6046m2<K> m2Var = this.keySet;
        C5850m.m16594o(k);
        return getSubMap(0, m2Var.mo29639f(k, z));
    }

    public ImmutableSortedMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        C5850m.m16594o(k);
        C5850m.m16594o(k2);
        C5850m.m16590k(comparator().compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", k, k2);
        return headMap(k2, z2).tailMap(k, z);
    }

    public ImmutableSortedMap<K, V> tailMap(K k, boolean z) {
        C6046m2<K> m2Var = this.keySet;
        C5850m.m16594o(k);
        return getSubMap(m2Var.mo29640g(k, z), size());
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable, Comparator<? super K> comparator) {
        C5850m.m16594o(comparator);
        return fromEntries(comparator, false, iterable);
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m22282of(K k, V v, K k2, V v2) {
        return ofEntries(ImmutableMap.entryOf(k, v), ImmutableMap.entryOf(k2, v2));
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m22283of(K k, V v, K k2, V v2, K k3, V v3) {
        return ofEntries(ImmutableMap.entryOf(k, v), ImmutableMap.entryOf(k2, v2), ImmutableMap.entryOf(k3, v3));
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m22284of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return ofEntries(ImmutableMap.entryOf(k, v), ImmutableMap.entryOf(k2, v2), ImmutableMap.entryOf(k3, v3), ImmutableMap.entryOf(k4, v4));
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m22285of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return ofEntries(ImmutableMap.entryOf(k, v), ImmutableMap.entryOf(k2, v2), ImmutableMap.entryOf(k3, v3), ImmutableMap.entryOf(k4, v4), ImmutableMap.entryOf(k5, v5));
    }
}
