package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5865r;
import p040c.p200q.p353b.p355b.C5895c3;
import p040c.p200q.p353b.p355b.C5927d3;
import p040c.p200q.p353b.p355b.C6108q1;
import p040c.p200q.p353b.p355b.C6166v;

public class HashBasedTable<R, C, V> extends C5895c3<R, C, V> {
    public static final long serialVersionUID = 0;

    /* renamed from: com.google.common.collect.HashBasedTable$a */
    public static class C8084a<C, V> implements C5865r<Map<C, V>>, Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final int f15036e;

        public C8084a(int i) {
            this.f15036e = i;
        }

        /* renamed from: a */
        public Map<C, V> get() {
            return C6108q1.m17182r(this.f15036e);
        }
    }

    public HashBasedTable(Map<R, Map<C, V>> map, C8084a<C, V> aVar) {
        super(map, aVar);
    }

    public static <R, C, V> HashBasedTable<R, C, V> create() {
        return new HashBasedTable<>(new LinkedHashMap(), new C8084a(0));
    }

    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    public boolean contains(Object obj, Object obj2) {
        return super.contains(obj, obj2);
    }

    public boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    public boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public V get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    public /* bridge */ /* synthetic */ void putAll(C5927d3 d3Var) {
        super.putAll(d3Var);
    }

    public V remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public /* bridge */ /* synthetic */ Map row(Object obj) {
        return super.row(obj);
    }

    public /* bridge */ /* synthetic */ Set rowKeySet() {
        return super.rowKeySet();
    }

    public /* bridge */ /* synthetic */ Map rowMap() {
        return super.rowMap();
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <R, C, V> HashBasedTable<R, C, V> create(int i, int i2) {
        C6166v.m17276b(i2, "expectedCellsPerRow");
        return new HashBasedTable<>(C6108q1.m17182r(i), new C8084a(i2));
    }

    public static <R, C, V> HashBasedTable<R, C, V> create(C5927d3<? extends R, ? extends C, ? extends V> d3Var) {
        HashBasedTable<R, C, V> create = create();
        create.putAll(d3Var);
        return create;
    }
}
