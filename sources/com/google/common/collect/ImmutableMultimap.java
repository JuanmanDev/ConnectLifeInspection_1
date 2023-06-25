package com.google.common.collect;

import androidx.test.internal.runner.RunnerArgs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p353b.p355b.C5882b2;
import p040c.p200q.p353b.p355b.C5991h3;
import p040c.p200q.p353b.p355b.C6028l1;
import p040c.p200q.p353b.p355b.C6108q1;
import p040c.p200q.p353b.p355b.C6131q2;
import p040c.p200q.p353b.p355b.C6136r1;
import p040c.p200q.p353b.p355b.C6138s;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p355b.C6158u1;
import p040c.p200q.p353b.p355b.C6166v;
import p040c.p200q.p353b.p355b.C6205z1;

public abstract class ImmutableMultimap<K, V> extends C6138s<K, V> implements Serializable {
    public static final long serialVersionUID = 0;
    public final transient ImmutableMap<K, ? extends ImmutableCollection<V>> map;
    public final transient int size;

    /* renamed from: com.google.common.collect.ImmutableMultimap$a */
    public class C8114a extends C5991h3<Map.Entry<K, V>> {

        /* renamed from: e */
        public final Iterator<? extends Map.Entry<K, ? extends ImmutableCollection<V>>> f15075e = ImmutableMultimap.this.map.entrySet().iterator();

        /* renamed from: l */
        public K f15076l = null;

        /* renamed from: m */
        public Iterator<V> f15077m = C6028l1.m16936h();

        public C8114a() {
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (!this.f15077m.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f15075e.next();
                this.f15076l = entry.getKey();
                this.f15077m = ((ImmutableCollection) entry.getValue()).iterator();
            }
            return C6108q1.m17173i(this.f15076l, this.f15077m.next());
        }

        public boolean hasNext() {
            return this.f15077m.hasNext() || this.f15075e.hasNext();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$b */
    public class C8115b extends C5991h3<V> {

        /* renamed from: e */
        public Iterator<? extends ImmutableCollection<V>> f15079e = ImmutableMultimap.this.map.values().iterator();

        /* renamed from: l */
        public Iterator<V> f15080l = C6028l1.m16936h();

        public C8115b() {
        }

        public boolean hasNext() {
            return this.f15080l.hasNext() || this.f15079e.hasNext();
        }

        public V next() {
            if (!this.f15080l.hasNext()) {
                this.f15080l = ((ImmutableCollection) this.f15079e.next()).iterator();
            }
            return this.f15080l.next();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$c */
    public static class C8116c<K, V> {

        /* renamed from: a */
        public Map<K, Collection<V>> f15082a = C5882b2.m16646h();

        /* renamed from: b */
        public Comparator<? super K> f15083b;

        /* renamed from: c */
        public Comparator<? super V> f15084c;

        /* renamed from: a */
        public ImmutableMultimap<K, V> mo36687a() {
            Collection entrySet = this.f15082a.entrySet();
            Comparator comparator = this.f15083b;
            if (comparator != null) {
                entrySet = C6205z1.m17454a(comparator).mo30153f().mo30152b(entrySet);
            }
            return ImmutableListMultimap.fromMapEntries(entrySet, this.f15084c);
        }

        /* renamed from: b */
        public Collection<V> mo36688b() {
            return new ArrayList();
        }

        /* renamed from: c */
        public C8116c<K, V> mo36648c(K k, V v) {
            C6166v.m17275a(k, v);
            Collection collection = this.f15082a.get(k);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f15082a;
                Collection b = mo36688b();
                map.put(k, b);
                collection = b;
            }
            collection.add(v);
            return this;
        }

        /* renamed from: d */
        public C8116c<K, V> mo36649d(Map.Entry<? extends K, ? extends V> entry) {
            return mo36648c(entry.getKey(), entry.getValue());
        }

        /* renamed from: e */
        public C8116c<K, V> mo36689e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            for (Map.Entry d : iterable) {
                mo36649d(d);
            }
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$d */
    public static class C8117d<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final ImmutableMultimap<K, V> f15085e;

        public C8117d(ImmutableMultimap<K, V> immutableMultimap) {
            this.f15085e = immutableMultimap;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f15085e.containsEntry(entry.getKey(), entry.getValue());
        }

        public boolean isPartialView() {
            return this.f15085e.isPartialView();
        }

        public int size() {
            return this.f15085e.size();
        }

        public C5991h3<Map.Entry<K, V>> iterator() {
            return this.f15085e.entryIterator();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$e */
    public static class C8118e {

        /* renamed from: a */
        public static final C6131q2.C6133b<ImmutableMultimap> f15086a = C6131q2.m17221a(ImmutableMultimap.class, "map");

        /* renamed from: b */
        public static final C6131q2.C6133b<ImmutableMultimap> f15087b = C6131q2.m17221a(ImmutableMultimap.class, RunnerArgs.ARGUMENT_TEST_SIZE);
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$f */
    public class C8119f extends ImmutableMultiset<K> {
        public C8119f() {
        }

        public boolean contains(Object obj) {
            return ImmutableMultimap.this.containsKey(obj);
        }

        public int count(Object obj) {
            Collection collection = (Collection) ImmutableMultimap.this.map.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        public C6153t1.C6154a<K> getEntry(int i) {
            Map.Entry entry = ImmutableMultimap.this.map.entrySet().asList().get(i);
            return C6158u1.m17263g(entry.getKey(), ((Collection) entry.getValue()).size());
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return ImmutableMultimap.this.size();
        }

        public Object writeReplace() {
            return new C8120g(ImmutableMultimap.this);
        }

        public ImmutableSet<K> elementSet() {
            return ImmutableMultimap.this.keySet();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$g */
    public static final class C8120g implements Serializable {

        /* renamed from: e */
        public final ImmutableMultimap<?, ?> f15089e;

        public C8120g(ImmutableMultimap<?, ?> immutableMultimap) {
            this.f15089e = immutableMultimap;
        }

        public Object readResolve() {
            return this.f15089e.keys();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$h */
    public static final class C8121h<K, V> extends ImmutableCollection<V> {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final transient ImmutableMultimap<K, V> f15090e;

        public C8121h(ImmutableMultimap<K, V> immutableMultimap) {
            this.f15090e = immutableMultimap;
        }

        public boolean contains(Object obj) {
            return this.f15090e.containsValue(obj);
        }

        public int copyIntoArray(Object[] objArr, int i) {
            C5991h3<? extends ImmutableCollection<V>> it = this.f15090e.map.values().iterator();
            while (it.hasNext()) {
                i = ((ImmutableCollection) it.next()).copyIntoArray(objArr, i);
            }
            return i;
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.f15090e.size();
        }

        public C5991h3<V> iterator() {
            return this.f15090e.valueIterator();
        }
    }

    public ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i) {
        this.map = immutableMap;
        this.size = i;
    }

    public static <K, V> C8116c<K, V> builder() {
        return new C8116c<>();
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(C6136r1<? extends K, ? extends V> r1Var) {
        if (r1Var instanceof ImmutableMultimap) {
            ImmutableMultimap<K, V> immutableMultimap = (ImmutableMultimap) r1Var;
            if (!immutableMultimap.isPartialView()) {
                return immutableMultimap;
            }
        }
        return ImmutableListMultimap.copyOf(r1Var);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m22204of() {
        return ImmutableListMultimap.m22172of();
    }

    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    public Map<K, Collection<V>> createAsMap() {
        throw new AssertionError("should never be called");
    }

    public Set<K> createKeySet() {
        throw new AssertionError("unreachable");
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public abstract ImmutableCollection<V> get(K k);

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public abstract ImmutableMultimap<V, K> inverse();

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public boolean isPartialView() {
        return this.map.isPartialView();
    }

    @Deprecated
    public boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public boolean putAll(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.size;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m22205of(K k, V v) {
        return ImmutableListMultimap.m22173of(k, v);
    }

    public ImmutableMap<K, Collection<V>> asMap() {
        return this.map;
    }

    public ImmutableCollection<Map.Entry<K, V>> createEntries() {
        return new C8117d(this);
    }

    public ImmutableMultiset<K> createKeys() {
        return new C8119f();
    }

    public ImmutableCollection<V> createValues() {
        return new C8121h(this);
    }

    public ImmutableCollection<Map.Entry<K, V>> entries() {
        return (ImmutableCollection) super.entries();
    }

    public C5991h3<Map.Entry<K, V>> entryIterator() {
        return new C8114a();
    }

    public ImmutableSet<K> keySet() {
        return this.map.keySet();
    }

    public ImmutableMultiset<K> keys() {
        return (ImmutableMultiset) super.keys();
    }

    @Deprecated
    public boolean putAll(C6136r1<? extends K, ? extends V> r1Var) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public ImmutableCollection<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public ImmutableCollection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public C5991h3<V> valueIterator() {
        return new C8115b();
    }

    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m22206of(K k, V v, K k2, V v2) {
        return ImmutableListMultimap.m22174of(k, v, k2, v2);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m22207of(K k, V v, K k2, V v2, K k3, V v3) {
        return ImmutableListMultimap.m22175of(k, v, k2, v2, k3, v3);
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return ImmutableListMultimap.copyOf(iterable);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m22208of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return ImmutableListMultimap.m22176of(k, v, k2, v2, k3, v3, k4, v4);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m22209of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return ImmutableListMultimap.m22177of(k, v, k2, v2, k3, v3, k4, v4, k5, v5);
    }
}
