package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.Map;
import p040c.p200q.p353b.p355b.C5981g2;
import p040c.p200q.p353b.p355b.C6151t;
import p040c.p200q.p353b.p355b.C6166v;

public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements C6151t<K, V> {

    /* renamed from: com.google.common.collect.ImmutableBiMap$a */
    public static final class C8094a<K, V> extends ImmutableMap.C8107b<K, V> {
        public C8094a() {
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ ImmutableMap.C8107b mo36595c(Object obj, Object obj2) {
            mo36600i(obj, obj2);
            return this;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ ImmutableMap.C8107b mo36596d(Map.Entry entry) {
            mo36601j(entry);
            return this;
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ ImmutableMap.C8107b mo36597e(Iterable iterable) {
            mo36602k(iterable);
            return this;
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ ImmutableMap.C8107b mo36598f(Map map) {
            mo36603l(map);
            return this;
        }

        /* renamed from: h */
        public ImmutableBiMap<K, V> mo36594a() {
            if (this.f15067c == 0) {
                return ImmutableBiMap.m22123of();
            }
            mo36673g();
            this.f15068d = true;
            return new C5981g2(this.f15066b, this.f15067c);
        }

        /* renamed from: i */
        public C8094a<K, V> mo36600i(K k, V v) {
            super.mo36595c(k, v);
            return this;
        }

        /* renamed from: j */
        public C8094a<K, V> mo36601j(Map.Entry<? extends K, ? extends V> entry) {
            super.mo36596d(entry);
            return this;
        }

        /* renamed from: k */
        public C8094a<K, V> mo36602k(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo36597e(iterable);
            return this;
        }

        /* renamed from: l */
        public C8094a<K, V> mo36603l(Map<? extends K, ? extends V> map) {
            super.mo36598f(map);
            return this;
        }

        public C8094a(int i) {
            super(i);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableBiMap$b */
    public static class C8095b extends ImmutableMap.C8113e {
        public static final long serialVersionUID = 0;

        public C8095b(ImmutableBiMap<?, ?> immutableBiMap) {
            super(immutableBiMap);
        }

        public Object readResolve() {
            return mo36680a(new C8094a());
        }
    }

    public static <K, V> C8094a<K, V> builder() {
        return new C8094a<>();
    }

    public static <K, V> C8094a<K, V> builderWithExpectedSize(int i) {
        C6166v.m17276b(i, "expectedSize");
        return new C8094a<>(i);
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof ImmutableBiMap) {
            ImmutableBiMap<K, V> immutableBiMap = (ImmutableBiMap) map;
            if (!immutableBiMap.isPartialView()) {
                return immutableBiMap;
            }
        }
        return copyOf(map.entrySet());
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m22123of() {
        return C5981g2.f11539p;
    }

    @Deprecated
    public V forcePut(K k, V v) {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableBiMap<V, K> inverse();

    public Object writeReplace() {
        return new C8095b(this);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m22124of(K k, V v) {
        C6166v.m17275a(k, v);
        return new C5981g2(new Object[]{k, v}, 1);
    }

    public final ImmutableSet<V> createValues() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m22125of(K k, V v, K k2, V v2) {
        C6166v.m17275a(k, v);
        C6166v.m17275a(k2, v2);
        return new C5981g2(new Object[]{k, v, k2, v2}, 2);
    }

    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C8094a aVar = new C8094a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.mo36602k(iterable);
        return aVar.mo36594a();
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m22126of(K k, V v, K k2, V v2, K k3, V v3) {
        C6166v.m17275a(k, v);
        C6166v.m17275a(k2, v2);
        C6166v.m17275a(k3, v3);
        return new C5981g2(new Object[]{k, v, k2, v2, k3, v3}, 3);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m22127of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C6166v.m17275a(k, v);
        C6166v.m17275a(k2, v2);
        C6166v.m17275a(k3, v3);
        C6166v.m17275a(k4, v4);
        return new C5981g2(new Object[]{k, v, k2, v2, k3, v3, k4, v4}, 4);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m22128of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C6166v.m17275a(k, v);
        C6166v.m17275a(k2, v2);
        C6166v.m17275a(k3, v3);
        C6166v.m17275a(k4, v4);
        C6166v.m17275a(k5, v5);
        return new C5981g2(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5}, 5);
    }
}
