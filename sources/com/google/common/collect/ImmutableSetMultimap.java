package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import p040c.p200q.p353b.p354a.C5841i;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5882b2;
import p040c.p200q.p353b.p355b.C5991h3;
import p040c.p200q.p353b.p355b.C6027l0;
import p040c.p200q.p353b.p355b.C6131q2;
import p040c.p200q.p353b.p355b.C6136r1;
import p040c.p200q.p353b.p355b.C6137r2;
import p040c.p200q.p353b.p355b.C6205z1;

public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements C6137r2<K, V> {
    public static final long serialVersionUID = 0;
    public final transient ImmutableSet<V> emptySet;
    public transient ImmutableSet<Map.Entry<K, V>> entries;
    public transient ImmutableSetMultimap<V, K> inverse;

    /* renamed from: com.google.common.collect.ImmutableSetMultimap$a */
    public static final class C8140a<K, V> extends ImmutableMultimap.C8116c<K, V> {
        /* renamed from: b */
        public Collection<V> mo36688b() {
            return C5882b2.m16645g();
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ ImmutableMultimap.C8116c mo36648c(Object obj, Object obj2) {
            mo36762g(obj, obj2);
            return this;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ ImmutableMultimap.C8116c mo36649d(Map.Entry entry) {
            mo36763h(entry);
            return this;
        }

        /* renamed from: f */
        public ImmutableSetMultimap<K, V> mo36761f() {
            Collection entrySet = this.f15082a.entrySet();
            Comparator comparator = this.f15083b;
            if (comparator != null) {
                entrySet = C6205z1.m17454a(comparator).mo30153f().mo30152b(entrySet);
            }
            return ImmutableSetMultimap.fromMapEntries(entrySet, this.f15084c);
        }

        /* renamed from: g */
        public C8140a<K, V> mo36762g(K k, V v) {
            super.mo36648c(k, v);
            return this;
        }

        /* renamed from: h */
        public C8140a<K, V> mo36763h(Map.Entry<? extends K, ? extends V> entry) {
            super.mo36649d(entry);
            return this;
        }

        /* renamed from: i */
        public C8140a<K, V> mo36764i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo36689e(iterable);
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSetMultimap$b */
    public static final class C8141b<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* renamed from: e */
        public final transient ImmutableSetMultimap<K, V> f15131e;

        public C8141b(ImmutableSetMultimap<K, V> immutableSetMultimap) {
            this.f15131e = immutableSetMultimap;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f15131e.containsEntry(entry.getKey(), entry.getValue());
        }

        public boolean isPartialView() {
            return false;
        }

        public int size() {
            return this.f15131e.size();
        }

        public C5991h3<Map.Entry<K, V>> iterator() {
            return this.f15131e.entryIterator();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSetMultimap$c */
    public static final class C8142c {

        /* renamed from: a */
        public static final C6131q2.C6133b<ImmutableSetMultimap> f15132a = C6131q2.m17221a(ImmutableSetMultimap.class, "emptySet");
    }

    public ImmutableSetMultimap(ImmutableMap<K, ImmutableSet<V>> immutableMap, int i, Comparator<? super V> comparator) {
        super(immutableMap, i);
        this.emptySet = emptySet(comparator);
    }

    public static <K, V> C8140a<K, V> builder() {
        return new C8140a<>();
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(C6136r1<? extends K, ? extends V> r1Var) {
        return copyOf(r1Var, (Comparator) null);
    }

    public static <V> ImmutableSet<V> emptySet(Comparator<? super V> comparator) {
        if (comparator == null) {
            return ImmutableSet.m22254of();
        }
        return ImmutableSortedSet.emptySet(comparator);
    }

    public static <K, V> ImmutableSetMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m22267of();
        }
        ImmutableMap.C8107b bVar = new ImmutableMap.C8107b(collection.size());
        int i = 0;
        for (Map.Entry entry : collection) {
            Object key = entry.getKey();
            ImmutableSet<V> valueSet = valueSet(comparator, (Collection) entry.getValue());
            if (!valueSet.isEmpty()) {
                bVar.mo36595c(key, valueSet);
                i += valueSet.size();
            }
        }
        return new ImmutableSetMultimap<>(bVar.mo36594a(), i, comparator);
    }

    private ImmutableSetMultimap<V, K> invert() {
        C8140a builder = builder();
        C5991h3 it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.mo36762g(entry.getValue(), entry.getKey());
        }
        ImmutableSetMultimap<V, K> f = builder.mo36761f();
        f.inverse = this;
        return f;
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m22267of() {
        return C6027l0.f11599e;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ImmutableMap.C8107b builder = ImmutableMap.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    ImmutableSet.C8138a valuesBuilder = valuesBuilder(comparator);
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        valuesBuilder.mo36621a(objectInputStream.readObject());
                    }
                    ImmutableSet l = valuesBuilder.mo36758l();
                    if (l.size() == readInt2) {
                        builder.mo36595c(readObject, l);
                        i2 += readInt2;
                        i++;
                    } else {
                        throw new InvalidObjectException("Duplicate key-value pairs exist for key " + readObject);
                    }
                } else {
                    throw new InvalidObjectException("Invalid value count " + readInt2);
                }
            }
            try {
                ImmutableMultimap.C8118e.f15086a.mo29955b(this, builder.mo36594a());
                ImmutableMultimap.C8118e.f15087b.mo29954a(this, i2);
                C8142c.f15132a.mo29955b(this, emptySet(comparator));
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
    }

    public static <V> ImmutableSet<V> valueSet(Comparator<? super V> comparator, Collection<? extends V> collection) {
        if (comparator == null) {
            return ImmutableSet.copyOf(collection);
        }
        return ImmutableSortedSet.copyOf(comparator, collection);
    }

    public static <V> ImmutableSet.C8138a<V> valuesBuilder(Comparator<? super V> comparator) {
        return comparator == null ? new ImmutableSet.C8138a<>() : new ImmutableSortedSet.C8150a(comparator);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        C6131q2.m17230j(this, objectOutputStream);
    }

    public Comparator<? super V> valueComparator() {
        ImmutableSet<V> immutableSet = this.emptySet;
        if (immutableSet instanceof ImmutableSortedSet) {
            return ((ImmutableSortedSet) immutableSet).comparator();
        }
        return null;
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(C6136r1<? extends K, ? extends V> r1Var, Comparator<? super V> comparator) {
        C5850m.m16594o(r1Var);
        if (r1Var.isEmpty() && comparator == null) {
            return m22267of();
        }
        if (r1Var instanceof ImmutableSetMultimap) {
            ImmutableSetMultimap<K, V> immutableSetMultimap = (ImmutableSetMultimap) r1Var;
            if (!immutableSetMultimap.isPartialView()) {
                return immutableSetMultimap;
            }
        }
        return fromMapEntries(r1Var.asMap().entrySet(), comparator);
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m22268of(K k, V v) {
        C8140a builder = builder();
        builder.mo36762g(k, v);
        return builder.mo36761f();
    }

    public ImmutableSetMultimap<V, K> inverse() {
        ImmutableSetMultimap<V, K> immutableSetMultimap = this.inverse;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<V, K> invert = invert();
        this.inverse = invert;
        return invert;
    }

    public ImmutableSet<Map.Entry<K, V>> entries() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entries;
        if (immutableSet != null) {
            return immutableSet;
        }
        C8141b bVar = new C8141b(this);
        this.entries = bVar;
        return bVar;
    }

    public ImmutableSet<V> get(K k) {
        return (ImmutableSet) C5841i.m16566a((ImmutableSet) this.map.get(k), this.emptySet);
    }

    @Deprecated
    public ImmutableSet<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public ImmutableSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m22269of(K k, V v, K k2, V v2) {
        C8140a builder = builder();
        builder.mo36762g(k, v);
        builder.mo36762g(k2, v2);
        return builder.mo36761f();
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C8140a aVar = new C8140a();
        aVar.mo36764i(iterable);
        return aVar.mo36761f();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m22270of(K k, V v, K k2, V v2, K k3, V v3) {
        C8140a builder = builder();
        builder.mo36762g(k, v);
        builder.mo36762g(k2, v2);
        builder.mo36762g(k3, v3);
        return builder.mo36761f();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m22271of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C8140a builder = builder();
        builder.mo36762g(k, v);
        builder.mo36762g(k2, v2);
        builder.mo36762g(k3, v3);
        builder.mo36762g(k4, v4);
        return builder.mo36761f();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m22272of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C8140a builder = builder();
        builder.mo36762g(k, v);
        builder.mo36762g(k2, v2);
        builder.mo36762g(k3, v3);
        builder.mo36762g(k4, v4);
        builder.mo36762g(k5, v5);
        return builder.mo36761f();
    }
}
