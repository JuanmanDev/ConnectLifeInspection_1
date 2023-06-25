package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import p040c.p200q.p353b.p354a.C5838g;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p354a.C5865r;
import p040c.p200q.p353b.p355b.C5883b3;
import p040c.p200q.p353b.p355b.C5886c;
import p040c.p200q.p353b.p355b.C5895c3;
import p040c.p200q.p353b.p355b.C5927d3;
import p040c.p200q.p353b.p355b.C6020k1;
import p040c.p200q.p353b.p355b.C6028l1;
import p040c.p200q.p353b.p355b.C6108q1;
import p040c.p200q.p353b.p355b.C6205z1;

public class TreeBasedTable<R, C, V> extends C5883b3<R, C, V> {
    public static final long serialVersionUID = 0;
    public final Comparator<? super C> columnComparator;

    /* renamed from: com.google.common.collect.TreeBasedTable$a */
    public class C8177a implements C5838g<Map<C, V>, Iterator<C>> {
        public C8177a(TreeBasedTable treeBasedTable) {
        }

        /* renamed from: a */
        public Iterator<C> apply(Map<C, V> map) {
            return map.keySet().iterator();
        }
    }

    /* renamed from: com.google.common.collect.TreeBasedTable$b */
    public class C8178b extends C5886c<C> {

        /* renamed from: m */
        public C f15218m;

        /* renamed from: n */
        public final /* synthetic */ Iterator f15219n;

        /* renamed from: o */
        public final /* synthetic */ Comparator f15220o;

        public C8178b(TreeBasedTable treeBasedTable, Iterator it, Comparator comparator) {
            this.f15219n = it;
            this.f15220o = comparator;
        }

        /* renamed from: a */
        public C mo29067a() {
            boolean z;
            while (this.f15219n.hasNext()) {
                C next = this.f15219n.next();
                C c = this.f15218m;
                if (c == null || this.f15220o.compare(next, c) != 0) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    this.f15218m = next;
                    return next;
                }
            }
            this.f15218m = null;
            return mo29068b();
        }
    }

    /* renamed from: com.google.common.collect.TreeBasedTable$c */
    public static class C8179c<C, V> implements C5865r<TreeMap<C, V>>, Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final Comparator<? super C> f15221e;

        public C8179c(Comparator<? super C> comparator) {
            this.f15221e = comparator;
        }

        /* renamed from: a */
        public TreeMap<C, V> get() {
            return new TreeMap<>(this.f15221e);
        }
    }

    /* renamed from: com.google.common.collect.TreeBasedTable$d */
    public class C8180d extends C5895c3<R, C, V>.g implements SortedMap<C, V> {

        /* renamed from: n */
        public final C f15222n;

        /* renamed from: o */
        public final C f15223o;

        /* renamed from: p */
        public transient SortedMap<C, V> f15224p;

        public C8180d(TreeBasedTable treeBasedTable, R r) {
            this(r, (Object) null, (Object) null);
        }

        public Comparator<? super C> comparator() {
            return TreeBasedTable.this.columnComparator();
        }

        public boolean containsKey(Object obj) {
            return mo36927j(obj) && super.containsKey(obj);
        }

        /* renamed from: d */
        public void mo29140d() {
            if (mo36928k() != null && this.f15224p.isEmpty()) {
                TreeBasedTable.this.backingMap.remove(this.f11446e);
                this.f15224p = null;
                this.f11447l = null;
            }
        }

        /* renamed from: f */
        public SortedMap<C, V> mo29136b() {
            return (SortedMap) super.mo29136b();
        }

        public C firstKey() {
            if (mo29136b() != null) {
                return mo29136b().firstKey();
            }
            throw new NoSuchElementException();
        }

        /* renamed from: g */
        public int mo36923g(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        /* renamed from: h */
        public SortedMap<C, V> mo29137c() {
            SortedMap<C, V> k = mo36928k();
            if (k == null) {
                return null;
            }
            C c = this.f15222n;
            if (c != null) {
                k = k.tailMap(c);
            }
            C c2 = this.f15223o;
            return c2 != null ? k.headMap(c2) : k;
        }

        public SortedMap<C, V> headMap(C c) {
            C5850m.m16594o(c);
            C5850m.m16583d(mo36927j(c));
            return new C8180d(this.f11446e, this.f15222n, c);
        }

        /* renamed from: i */
        public SortedSet<C> keySet() {
            return new C6108q1.C6127o(this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r0 = r1.f15222n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
            r0 = r1.f15223o;
         */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo36927j(java.lang.Object r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L_0x0018
                C r0 = r1.f15222n
                if (r0 == 0) goto L_0x000c
                int r0 = r1.mo36923g(r0, r2)
                if (r0 > 0) goto L_0x0018
            L_0x000c:
                C r0 = r1.f15223o
                if (r0 == 0) goto L_0x0016
                int r2 = r1.mo36923g(r0, r2)
                if (r2 <= 0) goto L_0x0018
            L_0x0016:
                r2 = 1
                goto L_0x0019
            L_0x0018:
                r2 = 0
            L_0x0019:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeBasedTable.C8180d.mo36927j(java.lang.Object):boolean");
        }

        /* renamed from: k */
        public SortedMap<C, V> mo36928k() {
            SortedMap<C, V> sortedMap = this.f15224p;
            if (sortedMap == null || (sortedMap.isEmpty() && TreeBasedTable.this.backingMap.containsKey(this.f11446e))) {
                this.f15224p = (SortedMap) TreeBasedTable.this.backingMap.get(this.f11446e);
            }
            return this.f15224p;
        }

        public C lastKey() {
            if (mo29136b() != null) {
                return mo29136b().lastKey();
            }
            throw new NoSuchElementException();
        }

        public V put(C c, V v) {
            C5850m.m16594o(c);
            C5850m.m16583d(mo36927j(c));
            return super.put(c, v);
        }

        public SortedMap<C, V> subMap(C c, C c2) {
            boolean z;
            C5850m.m16594o(c);
            if (mo36927j(c)) {
                C5850m.m16594o(c2);
                if (mo36927j(c2)) {
                    z = true;
                    C5850m.m16583d(z);
                    return new C8180d(this.f11446e, c, c2);
                }
            }
            z = false;
            C5850m.m16583d(z);
            return new C8180d(this.f11446e, c, c2);
        }

        public SortedMap<C, V> tailMap(C c) {
            C5850m.m16594o(c);
            C5850m.m16583d(mo36927j(c));
            return new C8180d(this.f11446e, c, this.f15223o);
        }

        public C8180d(R r, C c, C c2) {
            super(r);
            this.f15222n = c;
            this.f15223o = c2;
            C5850m.m16583d(c == null || c2 == null || mo36923g(c, c2) <= 0);
        }
    }

    public TreeBasedTable(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        super(new TreeMap(comparator), new C8179c(comparator2));
        this.columnComparator = comparator2;
    }

    public static <R extends Comparable, C extends Comparable, V> TreeBasedTable<R, C, V> create() {
        return new TreeBasedTable<>(C6205z1.m17455e(), C6205z1.m17455e());
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

    @Deprecated
    public Comparator<? super C> columnComparator() {
        return this.columnComparator;
    }

    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj, Object obj2) {
        return super.contains(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public Iterator<C> createColumnKeyIterator() {
        Comparator columnComparator2 = columnComparator();
        return new C8178b(this, C6028l1.m16943o(C6020k1.m16927n(this.backingMap.values(), new C8177a(this)), columnComparator2), columnComparator2);
    }

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

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    public /* bridge */ /* synthetic */ void putAll(C5927d3 d3Var) {
        super.putAll(d3Var);
    }

    public /* bridge */ /* synthetic */ Object remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Deprecated
    public Comparator<? super R> rowComparator() {
        return rowKeySet().comparator();
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

    public static <R, C, V> TreeBasedTable<R, C, V> create(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        C5850m.m16594o(comparator);
        C5850m.m16594o(comparator2);
        return new TreeBasedTable<>(comparator, comparator2);
    }

    public SortedMap<C, V> row(R r) {
        return new C8180d(this, r);
    }

    public SortedSet<R> rowKeySet() {
        return super.rowKeySet();
    }

    public SortedMap<R, Map<C, V>> rowMap() {
        return super.rowMap();
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(TreeBasedTable<R, C, ? extends V> treeBasedTable) {
        TreeBasedTable<R, C, V> treeBasedTable2 = new TreeBasedTable<>(treeBasedTable.rowComparator(), treeBasedTable.columnComparator());
        treeBasedTable2.putAll(treeBasedTable);
        return treeBasedTable2;
    }
}
