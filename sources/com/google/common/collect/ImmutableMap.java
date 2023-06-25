package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import p040c.p200q.p353b.p355b.C5892c1;
import p040c.p200q.p353b.p355b.C5924d1;
import p040c.p200q.p353b.p355b.C5958e1;
import p040c.p200q.p353b.p355b.C5978g;
import p040c.p200q.p353b.p355b.C5991h3;
import p040c.p200q.p353b.p355b.C6000i2;
import p040c.p200q.p353b.p355b.C6108q1;
import p040c.p200q.p353b.p355b.C6148s2;
import p040c.p200q.p353b.p355b.C6166v;
import p040c.p200q.p353b.p355b.C6205z1;

public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    public static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    public transient ImmutableSet<Map.Entry<K, V>> entrySet;
    public transient ImmutableSet<K> keySet;
    public transient ImmutableSetMultimap<K, V> multimapView;
    public transient ImmutableCollection<V> values;

    /* renamed from: com.google.common.collect.ImmutableMap$a */
    public class C8106a extends C5991h3<K> {

        /* renamed from: e */
        public final /* synthetic */ C5991h3 f15064e;

        public C8106a(ImmutableMap immutableMap, C5991h3 h3Var) {
            this.f15064e = h3Var;
        }

        public boolean hasNext() {
            return this.f15064e.hasNext();
        }

        public K next() {
            return ((Map.Entry) this.f15064e.next()).getKey();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMap$b */
    public static class C8107b<K, V> {

        /* renamed from: a */
        public Comparator<? super V> f15065a;

        /* renamed from: b */
        public Object[] f15066b;

        /* renamed from: c */
        public int f15067c;

        /* renamed from: d */
        public boolean f15068d;

        public C8107b() {
            this(4);
        }

        /* renamed from: a */
        public ImmutableMap<K, V> mo36594a() {
            mo36673g();
            this.f15068d = true;
            return C6000i2.m16901a(this.f15067c, this.f15066b);
        }

        /* renamed from: b */
        public final void mo36672b(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f15066b;
            if (i2 > objArr.length) {
                this.f15066b = Arrays.copyOf(objArr, ImmutableCollection.C8099b.m22147e(objArr.length, i2));
                this.f15068d = false;
            }
        }

        /* renamed from: c */
        public C8107b<K, V> mo36595c(K k, V v) {
            mo36672b(this.f15067c + 1);
            C6166v.m17275a(k, v);
            Object[] objArr = this.f15066b;
            int i = this.f15067c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f15067c = i + 1;
            return this;
        }

        /* renamed from: d */
        public C8107b<K, V> mo36596d(Map.Entry<? extends K, ? extends V> entry) {
            return mo36595c(entry.getKey(), entry.getValue());
        }

        /* renamed from: e */
        public C8107b<K, V> mo36597e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                mo36672b(this.f15067c + ((Collection) iterable).size());
            }
            for (Map.Entry d : iterable) {
                mo36596d(d);
            }
            return this;
        }

        /* renamed from: f */
        public C8107b<K, V> mo36598f(Map<? extends K, ? extends V> map) {
            return mo36597e(map.entrySet());
        }

        /* renamed from: g */
        public void mo36673g() {
            int i;
            if (this.f15065a != null) {
                if (this.f15068d) {
                    this.f15066b = Arrays.copyOf(this.f15066b, this.f15067c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f15067c];
                int i2 = 0;
                while (true) {
                    i = this.f15067c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.f15066b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new AbstractMap.SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, C6205z1.m17454a(this.f15065a).mo30154g(C6108q1.m17161B()));
                for (int i4 = 0; i4 < this.f15067c; i4++) {
                    int i5 = i4 * 2;
                    this.f15066b[i5] = entryArr[i4].getKey();
                    this.f15066b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }

        public C8107b(int i) {
            this.f15066b = new Object[(i * 2)];
            this.f15067c = 0;
            this.f15068d = false;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMap$c */
    public static abstract class C8108c<K, V> extends ImmutableMap<K, V> {

        /* renamed from: com.google.common.collect.ImmutableMap$c$a */
        public class C8109a extends C5892c1<K, V> {
            public C8109a() {
            }

            /* renamed from: c */
            public ImmutableMap<K, V> mo29075c() {
                return C8108c.this;
            }

            public C5991h3<Map.Entry<K, V>> iterator() {
                return C8108c.this.mo29372a();
            }
        }

        /* renamed from: a */
        public abstract C5991h3<Map.Entry<K, V>> mo29372a();

        public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
            return new C8109a();
        }

        public ImmutableSet<K> createKeySet() {
            return new C5924d1(this);
        }

        public ImmutableCollection<V> createValues() {
            return new C5958e1(this);
        }

        public /* bridge */ /* synthetic */ Set entrySet() {
            return ImmutableMap.super.entrySet();
        }

        public /* bridge */ /* synthetic */ Set keySet() {
            return ImmutableMap.super.keySet();
        }

        public /* bridge */ /* synthetic */ Collection values() {
            return ImmutableMap.super.values();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMap$d */
    public final class C8110d extends C8108c<K, ImmutableSet<V>> {

        /* renamed from: com.google.common.collect.ImmutableMap$d$a */
        public class C8111a extends C5991h3<Map.Entry<K, ImmutableSet<V>>> {

            /* renamed from: e */
            public final /* synthetic */ Iterator f15071e;

            /* renamed from: com.google.common.collect.ImmutableMap$d$a$a */
            public class C8112a extends C5978g<K, ImmutableSet<V>> {

                /* renamed from: e */
                public final /* synthetic */ Map.Entry f15072e;

                public C8112a(C8111a aVar, Map.Entry entry) {
                    this.f15072e = entry;
                }

                /* renamed from: a */
                public ImmutableSet<V> getValue() {
                    return ImmutableSet.m22255of(this.f15072e.getValue());
                }

                public K getKey() {
                    return this.f15072e.getKey();
                }
            }

            public C8111a(C8110d dVar, Iterator it) {
                this.f15071e = it;
            }

            /* renamed from: a */
            public Map.Entry<K, ImmutableSet<V>> next() {
                return new C8112a(this, (Map.Entry) this.f15071e.next());
            }

            public boolean hasNext() {
                return this.f15071e.hasNext();
            }
        }

        public C8110d() {
        }

        /* renamed from: a */
        public C5991h3<Map.Entry<K, ImmutableSet<V>>> mo29372a() {
            return new C8111a(this, ImmutableMap.this.entrySet().iterator());
        }

        /* renamed from: b */
        public ImmutableSet<V> get(Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.m22255of(obj2);
        }

        public boolean containsKey(Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        public ImmutableSet<K> createKeySet() {
            return ImmutableMap.this.keySet();
        }

        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        public boolean isHashCodeFast() {
            return ImmutableMap.this.isHashCodeFast();
        }

        public boolean isPartialView() {
            return ImmutableMap.this.isPartialView();
        }

        public int size() {
            return ImmutableMap.this.size();
        }

        public /* synthetic */ C8110d(ImmutableMap immutableMap, C8106a aVar) {
            this();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMap$e */
    public static class C8113e implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final Object[] f15073e;

        /* renamed from: l */
        public final Object[] f15074l;

        public C8113e(ImmutableMap<?, ?> immutableMap) {
            this.f15073e = new Object[immutableMap.size()];
            this.f15074l = new Object[immutableMap.size()];
            C5991h3<Map.Entry<?, ?>> it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry next = it.next();
                this.f15073e[i] = next.getKey();
                this.f15074l[i] = next.getValue();
                i++;
            }
        }

        /* renamed from: a */
        public Object mo36680a(C8107b<Object, Object> bVar) {
            int i = 0;
            while (true) {
                Object[] objArr = this.f15073e;
                if (i >= objArr.length) {
                    return bVar.mo36594a();
                }
                bVar.mo36595c(objArr[i], this.f15074l[i]);
                i++;
            }
        }

        public Object readResolve() {
            return mo36680a(new C8107b(this.f15073e.length));
        }
    }

    public static <K, V> C8107b<K, V> builder() {
        return new C8107b<>();
    }

    public static <K, V> C8107b<K, V> builderWithExpectedSize(int i) {
        C6166v.m17276b(i, "expectedSize");
        return new C8107b<>(i);
    }

    public static void checkNoConflict(boolean z, String str, Map.Entry<?, ?> entry, Map.Entry<?, ?> entry2) {
        if (!z) {
            throw conflictException(str, entry, entry2);
        }
    }

    public static IllegalArgumentException conflictException(String str, Object obj, Object obj2) {
        return new IllegalArgumentException("Multiple entries with same " + str + ": " + obj + " and " + obj2);
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> Map.Entry<K, V> entryOf(K k, V v) {
        C6166v.m17275a(k, v);
        return new AbstractMap.SimpleImmutableEntry(k, v);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m22184of() {
        return C6000i2.f11559n;
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.m22267of();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.multimapView;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new C8110d(this, (C8106a) null), size(), (Comparator) null);
        this.multimapView = immutableSetMultimap2;
        return immutableSetMultimap2;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    public abstract ImmutableSet<K> createKeySet();

    public abstract ImmutableCollection<V> createValues();

    public boolean equals(Object obj) {
        return C6108q1.m17172h(this, obj);
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public int hashCode() {
        return C6148s2.m17249b(entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract boolean isPartialView();

    public C5991h3<K> keyIterator() {
        return new C8106a(this, entrySet().iterator());
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C6108q1.m17187w(this);
    }

    public Object writeReplace() {
        return new C8113e(this);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m22185of(K k, V v) {
        C6166v.m17275a(k, v);
        return C6000i2.m16901a(1, new Object[]{k, v});
    }

    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m22186of(K k, V v, K k2, V v2) {
        C6166v.m17275a(k, v);
        C6166v.m17275a(k2, v2);
        return C6000i2.m16901a(2, new Object[]{k, v, k2, v2});
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C8107b bVar = new C8107b(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        bVar.mo36597e(iterable);
        return bVar.mo36594a();
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m22187of(K k, V v, K k2, V v2, K k3, V v3) {
        C6166v.m17275a(k, v);
        C6166v.m17275a(k2, v2);
        C6166v.m17275a(k3, v3);
        return C6000i2.m16901a(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m22188of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C6166v.m17275a(k, v);
        C6166v.m17275a(k2, v2);
        C6166v.m17275a(k3, v3);
        C6166v.m17275a(k4, v4);
        return C6000i2.m16901a(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m22189of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C6166v.m17275a(k, v);
        C6166v.m17275a(k2, v2);
        C6166v.m17275a(k3, v3);
        C6166v.m17275a(k4, v4);
        C6166v.m17275a(k5, v5);
        return C6000i2.m16901a(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }
}
