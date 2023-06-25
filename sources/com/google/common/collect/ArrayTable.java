package com.google.common.collect;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5879b;
import p040c.p200q.p353b.p355b.C5927d3;
import p040c.p200q.p353b.p355b.C5963e3;
import p040c.p200q.p353b.p355b.C5978g;
import p040c.p200q.p353b.p355b.C6103q;
import p040c.p200q.p353b.p355b.C6108q1;

public final class ArrayTable<R, C, V> extends C6103q<R, C, V> implements Serializable {
    public static final long serialVersionUID = 0;
    public final V[][] array;
    public final ImmutableMap<C, Integer> columnKeyToIndex;
    public final ImmutableList<C> columnList;
    public transient ArrayTable<R, C, V>.f columnMap;
    public final ImmutableMap<R, Integer> rowKeyToIndex;
    public final ImmutableList<R> rowList;
    public transient ArrayTable<R, C, V>.h rowMap;

    /* renamed from: com.google.common.collect.ArrayTable$a */
    public class C8065a extends C5879b<C5927d3.C5928a<R, C, V>> {
        public C8065a(int i) {
            super(i);
        }

        /* renamed from: b */
        public C5927d3.C5928a<R, C, V> mo29041a(int i) {
            return ArrayTable.this.getCell(i);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$b */
    public class C8066b extends C5963e3.C5964a<R, C, V> {

        /* renamed from: e */
        public final int f15006e = (this.f15008m / ArrayTable.this.columnList.size());

        /* renamed from: l */
        public final int f15007l = (this.f15008m % ArrayTable.this.columnList.size());

        /* renamed from: m */
        public final /* synthetic */ int f15008m;

        public C8066b(int i) {
            this.f15008m = i;
        }

        /* renamed from: a */
        public C mo29197a() {
            return ArrayTable.this.columnList.get(this.f15007l);
        }

        /* renamed from: b */
        public R mo29198b() {
            return ArrayTable.this.rowList.get(this.f15006e);
        }

        public V getValue() {
            return ArrayTable.this.mo36462at(this.f15006e, this.f15007l);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$c */
    public class C8067c extends C5879b<V> {
        public C8067c(int i) {
            super(i);
        }

        /* renamed from: a */
        public V mo29041a(int i) {
            return ArrayTable.this.getValue(i);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$d */
    public static abstract class C8068d<K, V> extends C6108q1.C6123l<K, V> {

        /* renamed from: e */
        public final ImmutableMap<K, Integer> f15011e;

        /* renamed from: com.google.common.collect.ArrayTable$d$a */
        public class C8069a extends C5978g<K, V> {

            /* renamed from: e */
            public final /* synthetic */ int f15012e;

            public C8069a(int i) {
                this.f15012e = i;
            }

            public K getKey() {
                return C8068d.this.mo36473c(this.f15012e);
            }

            public V getValue() {
                return C8068d.this.mo36476e(this.f15012e);
            }

            public V setValue(V v) {
                return C8068d.this.mo36477f(this.f15012e, v);
            }
        }

        /* renamed from: com.google.common.collect.ArrayTable$d$b */
        public class C8070b extends C5879b<Map.Entry<K, V>> {
            public C8070b(int i) {
                super(i);
            }

            /* renamed from: b */
            public Map.Entry<K, V> mo29041a(int i) {
                return C8068d.this.mo36472b(i);
            }
        }

        public /* synthetic */ C8068d(ImmutableMap immutableMap, C8065a aVar) {
            this(immutableMap);
        }

        /* renamed from: a */
        public Iterator<Map.Entry<K, V>> mo29135a() {
            return new C8070b(size());
        }

        /* renamed from: b */
        public Map.Entry<K, V> mo36472b(int i) {
            C5850m.m16592m(i, size());
            return new C8069a(i);
        }

        /* renamed from: c */
        public K mo36473c(int i) {
            return this.f15011e.keySet().asList().get(i);
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public boolean containsKey(Object obj) {
            return this.f15011e.containsKey(obj);
        }

        /* renamed from: d */
        public abstract String mo36475d();

        /* renamed from: e */
        public abstract V mo36476e(int i);

        /* renamed from: f */
        public abstract V mo36477f(int i, V v);

        public V get(Object obj) {
            Integer num = this.f15011e.get(obj);
            if (num == null) {
                return null;
            }
            return mo36476e(num.intValue());
        }

        public boolean isEmpty() {
            return this.f15011e.isEmpty();
        }

        public Set<K> keySet() {
            return this.f15011e.keySet();
        }

        public V put(K k, V v) {
            Integer num = this.f15011e.get(k);
            if (num != null) {
                return mo36477f(num.intValue(), v);
            }
            throw new IllegalArgumentException(mo36475d() + " " + k + " not in " + this.f15011e.keySet());
        }

        public V remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return this.f15011e.size();
        }

        public C8068d(ImmutableMap<K, Integer> immutableMap) {
            this.f15011e = immutableMap;
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$e */
    public class C8071e extends C8068d<R, V> {

        /* renamed from: l */
        public final int f15015l;

        public C8071e(int i) {
            super(ArrayTable.this.rowKeyToIndex, (C8065a) null);
            this.f15015l = i;
        }

        /* renamed from: d */
        public String mo36475d() {
            return "Row";
        }

        /* renamed from: e */
        public V mo36476e(int i) {
            return ArrayTable.this.mo36462at(i, this.f15015l);
        }

        /* renamed from: f */
        public V mo36477f(int i, V v) {
            return ArrayTable.this.set(i, this.f15015l, v);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$f */
    public class C8072f extends C8068d<C, Map<R, V>> {
        public /* synthetic */ C8072f(ArrayTable arrayTable, C8065a aVar) {
            this();
        }

        /* renamed from: d */
        public String mo36475d() {
            return "Column";
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo36477f(int i, Object obj) {
            mo36487i(i, (Map) obj);
            throw null;
        }

        /* renamed from: g */
        public Map<R, V> mo36476e(int i) {
            return new C8071e(i);
        }

        /* renamed from: h */
        public Map<R, V> mo36486h(C c, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public Map<R, V> mo36487i(int i, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            mo36486h(obj, (Map) obj2);
            throw null;
        }

        public C8072f() {
            super(ArrayTable.this.columnKeyToIndex, (C8065a) null);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$g */
    public class C8073g extends C8068d<C, V> {

        /* renamed from: l */
        public final int f15018l;

        public C8073g(int i) {
            super(ArrayTable.this.columnKeyToIndex, (C8065a) null);
            this.f15018l = i;
        }

        /* renamed from: d */
        public String mo36475d() {
            return "Column";
        }

        /* renamed from: e */
        public V mo36476e(int i) {
            return ArrayTable.this.mo36462at(this.f15018l, i);
        }

        /* renamed from: f */
        public V mo36477f(int i, V v) {
            return ArrayTable.this.set(this.f15018l, i, v);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$h */
    public class C8074h extends C8068d<R, Map<C, V>> {
        public /* synthetic */ C8074h(ArrayTable arrayTable, C8065a aVar) {
            this();
        }

        /* renamed from: d */
        public String mo36475d() {
            return "Row";
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo36477f(int i, Object obj) {
            mo36490i(i, (Map) obj);
            throw null;
        }

        /* renamed from: g */
        public Map<C, V> mo36476e(int i) {
            return new C8073g(i);
        }

        /* renamed from: h */
        public Map<C, V> mo36489h(R r, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public Map<C, V> mo36490i(int i, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            mo36489h(obj, (Map) obj2);
            throw null;
        }

        public C8074h() {
            super(ArrayTable.this.rowKeyToIndex, (C8065a) null);
        }
    }

    public ArrayTable(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        this.rowList = ImmutableList.copyOf(iterable);
        this.columnList = ImmutableList.copyOf(iterable2);
        C5850m.m16583d(this.rowList.isEmpty() == this.columnList.isEmpty());
        this.rowKeyToIndex = C6108q1.m17174j(this.rowList);
        this.columnKeyToIndex = C6108q1.m17174j(this.columnList);
        int size = this.rowList.size();
        int[] iArr = new int[2];
        iArr[1] = this.columnList.size();
        iArr[0] = size;
        this.array = (Object[][]) Array.newInstance(Object.class, iArr);
        eraseAll();
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        return new ArrayTable<>(iterable, iterable2);
    }

    /* access modifiers changed from: private */
    public C5927d3.C5928a<R, C, V> getCell(int i) {
        return new C8066b(i);
    }

    /* access modifiers changed from: private */
    public V getValue(int i) {
        return mo36462at(i / this.columnList.size(), i % this.columnList.size());
    }

    /* renamed from: at */
    public V mo36462at(int i, int i2) {
        C5850m.m16592m(i, this.rowList.size());
        C5850m.m16592m(i2, this.columnList.size());
        return this.array[i][i2];
    }

    public Iterator<C5927d3.C5928a<R, C, V>> cellIterator() {
        return new C8065a(size());
    }

    public Set<C5927d3.C5928a<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public Map<R, V> column(C c) {
        C5850m.m16594o(c);
        Integer num = this.columnKeyToIndex.get(c);
        return num == null ? ImmutableMap.m22184of() : new C8071e(num.intValue());
    }

    public ImmutableList<C> columnKeyList() {
        return this.columnList;
    }

    public Map<C, Map<R, V>> columnMap() {
        ArrayTable<R, C, V>.f fVar = this.columnMap;
        if (fVar != null) {
            return fVar;
        }
        ArrayTable<R, C, V>.f fVar2 = new C8072f(this, (C8065a) null);
        this.columnMap = fVar2;
        return fVar2;
    }

    public boolean contains(Object obj, Object obj2) {
        return containsRow(obj) && containsColumn(obj2);
    }

    public boolean containsColumn(Object obj) {
        return this.columnKeyToIndex.containsKey(obj);
    }

    public boolean containsRow(Object obj) {
        return this.rowKeyToIndex.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        for (V[] vArr : this.array) {
            for (V a : r0[r3]) {
                if (C5845j.m16576a(obj, a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public V erase(Object obj, Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return set(num.intValue(), num2.intValue(), (Object) null);
    }

    public void eraseAll() {
        for (V[] fill : this.array) {
            Arrays.fill(fill, (Object) null);
        }
    }

    public V get(Object obj, Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return mo36462at(num.intValue(), num2.intValue());
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public boolean isEmpty() {
        return this.rowList.isEmpty() || this.columnList.isEmpty();
    }

    public V put(R r, C c, V v) {
        C5850m.m16594o(r);
        C5850m.m16594o(c);
        Integer num = this.rowKeyToIndex.get(r);
        boolean z = true;
        C5850m.m16590k(num != null, "Row %s not in %s", r, this.rowList);
        Integer num2 = this.columnKeyToIndex.get(c);
        if (num2 == null) {
            z = false;
        }
        C5850m.m16590k(z, "Column %s not in %s", c, this.columnList);
        return set(num.intValue(), num2.intValue(), v);
    }

    public void putAll(C5927d3<? extends R, ? extends C, ? extends V> d3Var) {
        super.putAll(d3Var);
    }

    @Deprecated
    public V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public Map<C, V> row(R r) {
        C5850m.m16594o(r);
        Integer num = this.rowKeyToIndex.get(r);
        return num == null ? ImmutableMap.m22184of() : new C8073g(num.intValue());
    }

    public ImmutableList<R> rowKeyList() {
        return this.rowList;
    }

    public Map<R, Map<C, V>> rowMap() {
        ArrayTable<R, C, V>.h hVar = this.rowMap;
        if (hVar != null) {
            return hVar;
        }
        ArrayTable<R, C, V>.h hVar2 = new C8074h(this, (C8065a) null);
        this.rowMap = hVar2;
        return hVar2;
    }

    public V set(int i, int i2, V v) {
        C5850m.m16592m(i, this.rowList.size());
        C5850m.m16592m(i2, this.columnList.size());
        V[][] vArr = this.array;
        V v2 = vArr[i][i2];
        vArr[i][i2] = v;
        return v2;
    }

    public int size() {
        return this.rowList.size() * this.columnList.size();
    }

    public V[][] toArray(Class<V> cls) {
        V[][] vArr = (Object[][]) Array.newInstance(cls, new int[]{this.rowList.size(), this.columnList.size()});
        for (int i = 0; i < this.rowList.size(); i++) {
            V[][] vArr2 = this.array;
            System.arraycopy(vArr2[i], 0, vArr[i], 0, vArr2[i].length);
        }
        return vArr;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public Collection<V> values() {
        return super.values();
    }

    public Iterator<V> valuesIterator() {
        return new C8067c(size());
    }

    public static <R, C, V> ArrayTable<R, C, V> create(C5927d3<R, C, V> d3Var) {
        return d3Var instanceof ArrayTable ? new ArrayTable<>((ArrayTable) d3Var) : new ArrayTable<>(d3Var);
    }

    public ImmutableSet<C> columnKeySet() {
        return this.columnKeyToIndex.keySet();
    }

    public ImmutableSet<R> rowKeySet() {
        return this.rowKeyToIndex.keySet();
    }

    public ArrayTable(C5927d3<R, C, V> d3Var) {
        this(d3Var.rowKeySet(), d3Var.columnKeySet());
        putAll(d3Var);
    }

    public ArrayTable(ArrayTable<R, C, V> arrayTable) {
        ImmutableList<R> immutableList = arrayTable.rowList;
        this.rowList = immutableList;
        this.columnList = arrayTable.columnList;
        this.rowKeyToIndex = arrayTable.rowKeyToIndex;
        this.columnKeyToIndex = arrayTable.columnKeyToIndex;
        int size = immutableList.size();
        int[] iArr = new int[2];
        iArr[1] = this.columnList.size();
        iArr[0] = size;
        V[][] vArr = (Object[][]) Array.newInstance(Object.class, iArr);
        this.array = vArr;
        for (int i = 0; i < this.rowList.size(); i++) {
            V[][] vArr2 = arrayTable.array;
            System.arraycopy(vArr2[i], 0, vArr[i], 0, vArr2[i].length);
        }
    }
}
