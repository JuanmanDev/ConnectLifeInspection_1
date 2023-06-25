package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p040c.p200q.p353b.p354a.C5841i;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5878a3;
import p040c.p200q.p353b.p355b.C5927d3;
import p040c.p200q.p353b.p355b.C5963e3;
import p040c.p200q.p353b.p355b.C5991h3;
import p040c.p200q.p353b.p355b.C6020k1;
import p040c.p200q.p353b.p355b.C6049n1;
import p040c.p200q.p353b.p355b.C6054n2;
import p040c.p200q.p353b.p355b.C6103q;
import p040c.p200q.p353b.p355b.C6165u2;

public abstract class ImmutableTable<R, C, V> extends C6103q<R, C, V> implements Serializable {

    /* renamed from: com.google.common.collect.ImmutableTable$a */
    public static final class C8152a<R, C, V> {

        /* renamed from: a */
        public final List<C5927d3.C5928a<R, C, V>> f15151a = C6049n1.m16979g();

        /* renamed from: b */
        public Comparator<? super R> f15152b;

        /* renamed from: c */
        public Comparator<? super C> f15153c;

        /* renamed from: a */
        public ImmutableTable<R, C, V> mo36821a() {
            int size = this.f15151a.size();
            if (size == 0) {
                return ImmutableTable.m22339of();
            }
            if (size != 1) {
                return C6054n2.m16987b(this.f15151a, this.f15152b, this.f15153c);
            }
            return new C6165u2((C5927d3.C5928a) C6020k1.m16921h(this.f15151a));
        }

        /* renamed from: b */
        public C8152a<R, C, V> mo36822b(C5927d3.C5928a<? extends R, ? extends C, ? extends V> aVar) {
            if (aVar instanceof C5963e3.C5965b) {
                C5850m.m16595p(aVar.mo29198b(), "row");
                C5850m.m16595p(aVar.mo29197a(), "column");
                C5850m.m16595p(aVar.getValue(), "value");
                this.f15151a.add(aVar);
            } else {
                mo36823c(aVar.mo29198b(), aVar.mo29197a(), aVar.getValue());
            }
            return this;
        }

        /* renamed from: c */
        public C8152a<R, C, V> mo36823c(R r, C c, V v) {
            this.f15151a.add(ImmutableTable.cellOf(r, c, v));
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableTable$b */
    public static final class C8153b implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final Object[] f15154e;

        /* renamed from: l */
        public final Object[] f15155l;

        /* renamed from: m */
        public final Object[] f15156m;

        /* renamed from: n */
        public final int[] f15157n;

        /* renamed from: o */
        public final int[] f15158o;

        public C8153b(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.f15154e = objArr;
            this.f15155l = objArr2;
            this.f15156m = objArr3;
            this.f15157n = iArr;
            this.f15158o = iArr2;
        }

        /* renamed from: a */
        public static C8153b m22344a(ImmutableTable<?, ?, ?> immutableTable, int[] iArr, int[] iArr2) {
            return new C8153b(immutableTable.rowKeySet().toArray(), immutableTable.columnKeySet().toArray(), immutableTable.values().toArray(), iArr, iArr2);
        }

        public Object readResolve() {
            Object[] objArr = this.f15156m;
            if (objArr.length == 0) {
                return ImmutableTable.m22339of();
            }
            int i = 0;
            if (objArr.length == 1) {
                return ImmutableTable.m22340of(this.f15154e[0], this.f15155l[0], objArr[0]);
            }
            ImmutableList.C8100a aVar = new ImmutableList.C8100a(objArr.length);
            while (true) {
                Object[] objArr2 = this.f15156m;
                if (i >= objArr2.length) {
                    return C6054n2.m16989d(aVar.mo36639j(), ImmutableSet.copyOf((E[]) this.f15154e), ImmutableSet.copyOf((E[]) this.f15155l));
                }
                aVar.mo36637h(ImmutableTable.cellOf(this.f15154e[this.f15157n[i]], this.f15155l[this.f15158o[i]], objArr2[i]));
                i++;
            }
        }
    }

    public static <R, C, V> C8152a<R, C, V> builder() {
        return new C8152a<>();
    }

    public static <R, C, V> C5927d3.C5928a<R, C, V> cellOf(R r, C c, V v) {
        C5850m.m16595p(r, "rowKey");
        C5850m.m16595p(c, "columnKey");
        C5850m.m16595p(v, "value");
        return C5963e3.m16820b(r, c, v);
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(C5927d3<? extends R, ? extends C, ? extends V> d3Var) {
        if (d3Var instanceof ImmutableTable) {
            return (ImmutableTable) d3Var;
        }
        return copyOf(d3Var.cellSet());
    }

    /* renamed from: of */
    public static <R, C, V> ImmutableTable<R, C, V> m22339of() {
        return C5878a3.f11400o;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableMap<C, Map<R, V>> columnMap();

    public boolean contains(Object obj, Object obj2) {
        return get(obj, obj2) != null;
    }

    public /* bridge */ /* synthetic */ boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet<C5927d3.C5928a<R, C, V>> createCellSet();

    public abstract C8153b createSerializedForm();

    public abstract ImmutableCollection<V> createValues();

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ Object get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Deprecated
    public final V put(R r, C c, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(C5927d3<? extends R, ? extends C, ? extends V> d3Var) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableMap<R, Map<C, V>> rowMap();

    public abstract /* synthetic */ int size();

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public final Iterator<V> valuesIterator() {
        throw new AssertionError("should never be called");
    }

    public final Object writeReplace() {
        return createSerializedForm();
    }

    /* renamed from: of */
    public static <R, C, V> ImmutableTable<R, C, V> m22340of(R r, C c, V v) {
        return new C6165u2(r, c, v);
    }

    public final C5991h3<C5927d3.C5928a<R, C, V>> cellIterator() {
        throw new AssertionError("should never be called");
    }

    public ImmutableSet<C5927d3.C5928a<R, C, V>> cellSet() {
        return (ImmutableSet) super.cellSet();
    }

    public ImmutableMap<R, V> column(C c) {
        C5850m.m16595p(c, "columnKey");
        return (ImmutableMap) C5841i.m16566a((ImmutableMap) columnMap().get(c), ImmutableMap.m22184of());
    }

    public ImmutableSet<C> columnKeySet() {
        return columnMap().keySet();
    }

    public ImmutableMap<C, V> row(R r) {
        C5850m.m16595p(r, "rowKey");
        return (ImmutableMap) C5841i.m16566a((ImmutableMap) rowMap().get(r), ImmutableMap.m22184of());
    }

    public ImmutableSet<R> rowKeySet() {
        return rowMap().keySet();
    }

    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(Iterable<? extends C5927d3.C5928a<? extends R, ? extends C, ? extends V>> iterable) {
        C8152a builder = builder();
        for (C5927d3.C5928a b : iterable) {
            builder.mo36822b(b);
        }
        return builder.mo36821a();
    }
}
