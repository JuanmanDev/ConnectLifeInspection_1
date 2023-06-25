package p040c.p200q.p353b.p355b;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C6140s1;

/* renamed from: c.q.b.b.h */
/* compiled from: AbstractMultimap */
public abstract class C5983h<K, V> implements C6136r1<K, V> {
    public transient Map<K, Collection<V>> asMap;
    public transient Collection<Map.Entry<K, V>> entries;
    public transient Set<K> keySet;
    public transient C6153t1<K> keys;
    public transient Collection<V> values;

    /* renamed from: c.q.b.b.h$a */
    /* compiled from: AbstractMultimap */
    public class C5984a extends C6140s1.C6144b<K, V> {
        public C5984a() {
        }

        /* renamed from: c */
        public C6136r1<K, V> mo29481c() {
            return C5983h.this;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return C5983h.this.entryIterator();
        }
    }

    /* renamed from: c.q.b.b.h$b */
    /* compiled from: AbstractMultimap */
    public class C5985b extends C5983h<K, V>.a implements Set<Map.Entry<K, V>> {
        public C5985b(C5983h hVar) {
            super();
        }

        public boolean equals(Object obj) {
            return C6148s2.m17248a(this, obj);
        }

        public int hashCode() {
            return C6148s2.m17249b(this);
        }
    }

    /* renamed from: c.q.b.b.h$c */
    /* compiled from: AbstractMultimap */
    public class C5986c extends AbstractCollection<V> {
        public C5986c() {
        }

        public void clear() {
            C5983h.this.clear();
        }

        public boolean contains(Object obj) {
            return C5983h.this.containsValue(obj);
        }

        public Iterator<V> iterator() {
            return C5983h.this.valueIterator();
        }

        public int size() {
            return C5983h.this.size();
        }
    }

    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> createAsMap = createAsMap();
        this.asMap = createAsMap;
        return createAsMap;
    }

    public boolean containsEntry(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean containsValue(Object obj) {
        for (Collection contains : asMap().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> createAsMap();

    public abstract Collection<Map.Entry<K, V>> createEntries();

    public abstract Set<K> createKeySet();

    public abstract C6153t1<K> createKeys();

    public abstract Collection<V> createValues();

    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.entries;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> createEntries = createEntries();
        this.entries = createEntries;
        return createEntries;
    }

    public abstract Iterator<Map.Entry<K, V>> entryIterator();

    public boolean equals(Object obj) {
        return C6140s1.m17236a(this, obj);
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        Set<K> createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    public C6153t1<K> keys() {
        C6153t1<K> t1Var = this.keys;
        if (t1Var != null) {
            return t1Var;
        }
        C6153t1<K> createKeys = createKeys();
        this.keys = createKeys;
        return createKeys;
    }

    public abstract boolean put(K k, V v);

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        C5850m.m16594o(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty() || !get(k).addAll(collection)) {
                return false;
            }
            return true;
        }
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext() || !C6028l1.m16929a(get(k), it)) {
            return false;
        }
        return true;
    }

    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public abstract Collection<V> replaceValues(K k, Iterable<? extends V> iterable);

    public String toString() {
        return asMap().toString();
    }

    public Iterator<V> valueIterator() {
        return C6108q1.m17162C(entries().iterator());
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

    public boolean putAll(C6136r1<? extends K, ? extends V> r1Var) {
        boolean z = false;
        for (Map.Entry next : r1Var.entries()) {
            z |= put(next.getKey(), next.getValue());
        }
        return z;
    }
}
