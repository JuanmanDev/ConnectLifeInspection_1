package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import p040c.p200q.p353b.p355b.C5991h3;
import p040c.p200q.p353b.p355b.C6019k0;
import p040c.p200q.p353b.p355b.C6131q2;
import p040c.p200q.p353b.p355b.C6136r1;

public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements Object<K, V> {
    public static final long serialVersionUID = 0;
    public transient ImmutableListMultimap<V, K> inverse;

    /* renamed from: com.google.common.collect.ImmutableListMultimap$a */
    public static final class C8105a<K, V> extends ImmutableMultimap.C8116c<K, V> {
        /* renamed from: c */
        public /* bridge */ /* synthetic */ ImmutableMultimap.C8116c mo36648c(Object obj, Object obj2) {
            mo36651g(obj, obj2);
            return this;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ ImmutableMultimap.C8116c mo36649d(Map.Entry entry) {
            mo36652h(entry);
            return this;
        }

        /* renamed from: f */
        public ImmutableListMultimap<K, V> mo36650f() {
            return (ImmutableListMultimap) super.mo36687a();
        }

        /* renamed from: g */
        public C8105a<K, V> mo36651g(K k, V v) {
            super.mo36648c(k, v);
            return this;
        }

        /* renamed from: h */
        public C8105a<K, V> mo36652h(Map.Entry<? extends K, ? extends V> entry) {
            super.mo36649d(entry);
            return this;
        }

        /* renamed from: i */
        public C8105a<K, V> mo36653i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo36689e(iterable);
            return this;
        }
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    public static <K, V> C8105a<K, V> builder() {
        return new C8105a<>();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(C6136r1<? extends K, ? extends V> r1Var) {
        if (r1Var.isEmpty()) {
            return m22172of();
        }
        if (r1Var instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) r1Var;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(r1Var.asMap().entrySet(), (Comparator) null);
    }

    public static <K, V> ImmutableListMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        ImmutableList<E> immutableList;
        if (collection.isEmpty()) {
            return m22172of();
        }
        ImmutableMap.C8107b bVar = new ImmutableMap.C8107b(collection.size());
        int i = 0;
        for (Map.Entry entry : collection) {
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                immutableList = ImmutableList.copyOf(collection2);
            } else {
                immutableList = ImmutableList.sortedCopyOf(comparator, collection2);
            }
            if (!immutableList.isEmpty()) {
                bVar.mo36595c(key, immutableList);
                i += immutableList.size();
            }
        }
        return new ImmutableListMultimap<>(bVar.mo36594a(), i);
    }

    private ImmutableListMultimap<V, K> invert() {
        C8105a builder = builder();
        C5991h3 it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.mo36651g(entry.getValue(), entry.getKey());
        }
        ImmutableListMultimap<V, K> f = builder.mo36650f();
        f.inverse = this;
        return f;
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m22172of() {
        return C6019k0.f11583e;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ImmutableMap.C8107b builder = ImmutableMap.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    ImmutableList.C8100a builder2 = ImmutableList.builder();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        builder2.mo36637h(objectInputStream.readObject());
                    }
                    builder.mo36595c(readObject, builder2.mo36639j());
                    i2 += readInt2;
                    i++;
                } else {
                    throw new InvalidObjectException("Invalid value count " + readInt2);
                }
            }
            try {
                ImmutableMultimap.C8118e.f15086a.mo29955b(this, builder.mo36594a());
                ImmutableMultimap.C8118e.f15087b.mo29954a(this, i2);
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C6131q2.m17230j(this, objectOutputStream);
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m22173of(K k, V v) {
        C8105a builder = builder();
        builder.mo36651g(k, v);
        return builder.mo36650f();
    }

    public ImmutableListMultimap<V, K> inverse() {
        ImmutableListMultimap<V, K> immutableListMultimap = this.inverse;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        ImmutableListMultimap<V, K> invert = invert();
        this.inverse = invert;
        return invert;
    }

    public ImmutableList<V> get(K k) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k);
        return immutableList == null ? ImmutableList.m22152of() : immutableList;
    }

    @Deprecated
    public ImmutableList<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public ImmutableList<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m22174of(K k, V v, K k2, V v2) {
        C8105a builder = builder();
        builder.mo36651g(k, v);
        builder.mo36651g(k2, v2);
        return builder.mo36650f();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C8105a aVar = new C8105a();
        aVar.mo36653i(iterable);
        return aVar.mo36650f();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m22175of(K k, V v, K k2, V v2, K k3, V v3) {
        C8105a builder = builder();
        builder.mo36651g(k, v);
        builder.mo36651g(k2, v2);
        builder.mo36651g(k3, v3);
        return builder.mo36650f();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m22176of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C8105a builder = builder();
        builder.mo36651g(k, v);
        builder.mo36651g(k2, v2);
        builder.mo36651g(k3, v3);
        builder.mo36651g(k4, v4);
        return builder.mo36650f();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m22177of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C8105a builder = builder();
        builder.mo36651g(k, v);
        builder.mo36651g(k2, v2);
        builder.mo36651g(k3, v3);
        builder.mo36651g(k4, v4);
        builder.mo36651g(k5, v5);
        return builder.mo36650f();
    }
}
