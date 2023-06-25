package p040c.p200q.p353b.p355b;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p354a.C5865r;
import p040c.p200q.p353b.p355b.C6108q1;

/* renamed from: c.q.b.b.b3 */
/* compiled from: StandardRowSortedTable */
public class C5883b3<R, C, V> extends C5895c3<R, C, V> implements Object<R, C, V> {
    public static final long serialVersionUID = 0;

    /* renamed from: c.q.b.b.b3$b */
    /* compiled from: StandardRowSortedTable */
    public class C5885b extends C5895c3<R, C, V>.h implements SortedMap<R, Map<C, V>> {
        public C5885b() {
            super();
        }

        public Comparator<? super R> comparator() {
            return C5883b3.this.sortedBackingMap().comparator();
        }

        /* renamed from: f */
        public SortedSet<R> mo29057b() {
            return new C6108q1.C6127o(this);
        }

        public R firstKey() {
            return C5883b3.this.sortedBackingMap().firstKey();
        }

        /* renamed from: g */
        public SortedSet<R> keySet() {
            return (SortedSet) super.keySet();
        }

        public SortedMap<R, Map<C, V>> headMap(R r) {
            C5850m.m16594o(r);
            return new C5883b3(C5883b3.this.sortedBackingMap().headMap(r), C5883b3.this.factory).rowMap();
        }

        public R lastKey() {
            return C5883b3.this.sortedBackingMap().lastKey();
        }

        public SortedMap<R, Map<C, V>> subMap(R r, R r2) {
            C5850m.m16594o(r);
            C5850m.m16594o(r2);
            return new C5883b3(C5883b3.this.sortedBackingMap().subMap(r, r2), C5883b3.this.factory).rowMap();
        }

        public SortedMap<R, Map<C, V>> tailMap(R r) {
            C5850m.m16594o(r);
            return new C5883b3(C5883b3.this.sortedBackingMap().tailMap(r), C5883b3.this.factory).rowMap();
        }
    }

    public C5883b3(SortedMap<R, Map<C, V>> sortedMap, C5865r<? extends Map<C, V>> rVar) {
        super(sortedMap, rVar);
    }

    /* access modifiers changed from: private */
    public SortedMap<R, Map<C, V>> sortedBackingMap() {
        return (SortedMap) this.backingMap;
    }

    public SortedMap<R, Map<C, V>> createRowMap() {
        return new C5885b();
    }

    public SortedSet<R> rowKeySet() {
        return (SortedSet) rowMap().keySet();
    }

    public SortedMap<R, Map<C, V>> rowMap() {
        return (SortedMap) super.rowMap();
    }
}
