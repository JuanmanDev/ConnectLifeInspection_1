package p040c.p200q.p353b.p355b;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p353b.p355b.C5927d3;

/* renamed from: c.q.b.b.q */
/* compiled from: AbstractTable */
public abstract class C6103q<R, C, V> implements C5927d3<R, C, V> {
    public transient Set<C5927d3.C5928a<R, C, V>> cellSet;
    public transient Collection<V> values;

    /* renamed from: c.q.b.b.q$a */
    /* compiled from: AbstractTable */
    public class C6104a extends C5977f3<C5927d3.C5928a<R, C, V>, V> {
        public C6104a(C6103q qVar, Iterator it) {
            super(it);
        }

        /* renamed from: b */
        public V mo29448a(C5927d3.C5928a<R, C, V> aVar) {
            return aVar.getValue();
        }
    }

    /* renamed from: c.q.b.b.q$b */
    /* compiled from: AbstractTable */
    public class C6105b extends AbstractSet<C5927d3.C5928a<R, C, V>> {
        public C6105b() {
        }

        public void clear() {
            C6103q.this.clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof C5927d3.C5928a)) {
                return false;
            }
            C5927d3.C5928a aVar = (C5927d3.C5928a) obj;
            Map map = (Map) C6108q1.m17185u(C6103q.this.rowMap(), aVar.mo29198b());
            if (map == null || !C6170w.m17285d(map.entrySet(), C6108q1.m17173i(aVar.mo29197a(), aVar.getValue()))) {
                return false;
            }
            return true;
        }

        public Iterator<C5927d3.C5928a<R, C, V>> iterator() {
            return C6103q.this.cellIterator();
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof C5927d3.C5928a)) {
                return false;
            }
            C5927d3.C5928a aVar = (C5927d3.C5928a) obj;
            Map map = (Map) C6108q1.m17185u(C6103q.this.rowMap(), aVar.mo29198b());
            if (map == null || !C6170w.m17286e(map.entrySet(), C6108q1.m17173i(aVar.mo29197a(), aVar.getValue()))) {
                return false;
            }
            return true;
        }

        public int size() {
            return C6103q.this.size();
        }
    }

    /* renamed from: c.q.b.b.q$c */
    /* compiled from: AbstractTable */
    public class C6106c extends AbstractCollection<V> {
        public C6106c() {
        }

        public void clear() {
            C6103q.this.clear();
        }

        public boolean contains(Object obj) {
            return C6103q.this.containsValue(obj);
        }

        public Iterator<V> iterator() {
            return C6103q.this.valuesIterator();
        }

        public int size() {
            return C6103q.this.size();
        }
    }

    public abstract Iterator<C5927d3.C5928a<R, C, V>> cellIterator();

    public Set<C5927d3.C5928a<R, C, V>> cellSet() {
        Set<C5927d3.C5928a<R, C, V>> set = this.cellSet;
        if (set != null) {
            return set;
        }
        Set<C5927d3.C5928a<R, C, V>> createCellSet = createCellSet();
        this.cellSet = createCellSet;
        return createCellSet;
    }

    public abstract void clear();

    public abstract Set<C> columnKeySet();

    public boolean contains(Object obj, Object obj2) {
        Map map = (Map) C6108q1.m17185u(rowMap(), obj);
        return map != null && C6108q1.m17184t(map, obj2);
    }

    public boolean containsColumn(Object obj) {
        return C6108q1.m17184t(columnMap(), obj);
    }

    public boolean containsRow(Object obj) {
        return C6108q1.m17184t(rowMap(), obj);
    }

    public boolean containsValue(Object obj) {
        for (Map containsValue : rowMap().values()) {
            if (containsValue.containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public Set<C5927d3.C5928a<R, C, V>> createCellSet() {
        return new C6105b();
    }

    public Collection<V> createValues() {
        return new C6106c();
    }

    public boolean equals(Object obj) {
        return C5963e3.m16819a(this, obj);
    }

    public V get(Object obj, Object obj2) {
        Map map = (Map) C6108q1.m17185u(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return C6108q1.m17185u(map, obj2);
    }

    public int hashCode() {
        return cellSet().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract V put(R r, C c, V v);

    public void putAll(C5927d3<? extends R, ? extends C, ? extends V> d3Var) {
        for (C5927d3.C5928a next : d3Var.cellSet()) {
            put(next.mo29198b(), next.mo29197a(), next.getValue());
        }
    }

    public abstract V remove(Object obj, Object obj2);

    public abstract Set<R> rowKeySet();

    public String toString() {
        return rowMap().toString();
    }

    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection<V> createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    public Iterator<V> valuesIterator() {
        return new C6104a(this, cellSet().iterator());
    }
}
