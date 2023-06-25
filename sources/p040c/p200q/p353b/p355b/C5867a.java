package p040c.p200q.p353b.p355b;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.a */
/* compiled from: AbstractBiMap */
public abstract class C5867a<K, V> extends C6107q0<K, V> implements C6151t<K, V>, Serializable {
    public static final long serialVersionUID = 0;
    public transient Map<K, V> delegate;
    public transient Set<Map.Entry<K, V>> entrySet;
    public transient C5867a<V, K> inverse;
    public transient Set<K> keySet;
    public transient Set<V> valueSet;

    /* renamed from: c.q.b.b.a$a */
    /* compiled from: AbstractBiMap */
    public class C5868a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: e */
        public Map.Entry<K, V> f11385e;

        /* renamed from: l */
        public final /* synthetic */ Iterator f11386l;

        public C5868a(Iterator it) {
            this.f11386l = it;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry = (Map.Entry) this.f11386l.next();
            this.f11385e = entry;
            return new C5869b(entry);
        }

        public boolean hasNext() {
            return this.f11386l.hasNext();
        }

        public void remove() {
            C6166v.m17279e(this.f11385e != null);
            V value = this.f11385e.getValue();
            this.f11386l.remove();
            C5867a.this.removeFromInverseMap(value);
            this.f11385e = null;
        }
    }

    /* renamed from: c.q.b.b.a$b */
    /* compiled from: AbstractBiMap */
    public class C5869b extends C6135r0<K, V> {

        /* renamed from: e */
        public final Map.Entry<K, V> f11388e;

        public C5869b(Map.Entry<K, V> entry) {
            this.f11388e = entry;
        }

        /* renamed from: c */
        public Map.Entry<K, V> delegate() {
            return this.f11388e;
        }

        public V setValue(V v) {
            C5867a.this.checkValue(v);
            C5850m.m16601v(C5867a.this.entrySet().contains(this), "entry no longer in map");
            if (C5845j.m16576a(v, getValue())) {
                return v;
            }
            C5850m.m16589j(!C5867a.this.containsValue(v), "value already present: %s", v);
            V value = this.f11388e.setValue(v);
            C5850m.m16601v(C5845j.m16576a(v, C5867a.this.get(getKey())), "entry no longer in map");
            C5867a.this.updateInverseMap(getKey(), true, value, v);
            return value;
        }
    }

    /* renamed from: c.q.b.b.a$c */
    /* compiled from: AbstractBiMap */
    public class C5870c extends C6167v0<Map.Entry<K, V>> {

        /* renamed from: e */
        public final Set<Map.Entry<K, V>> f11390e;

        public C5870c() {
            this.f11390e = C5867a.this.delegate.entrySet();
        }

        public void clear() {
            C5867a.this.clear();
        }

        public boolean contains(Object obj) {
            return C6108q1.m17169e(delegate(), obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return C5867a.this.entrySetIterator();
        }

        public boolean remove(Object obj) {
            if (!this.f11390e.contains(obj)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            C5867a.this.inverse.delegate.remove(entry.getValue());
            this.f11390e.remove(entry);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        public Object[] toArray() {
            return standardToArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return standardToArray(tArr);
        }

        public /* synthetic */ C5870c(C5867a aVar, C5868a aVar2) {
            this();
        }

        public Set<Map.Entry<K, V>> delegate() {
            return this.f11390e;
        }
    }

    /* renamed from: c.q.b.b.a$d */
    /* compiled from: AbstractBiMap */
    public static class C5871d<K, V> extends C5867a<K, V> {
        public static final long serialVersionUID = 0;

        public C5871d(Map<K, V> map, C5867a<V, K> aVar) {
            super(map, aVar, (C5868a) null);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            setInverse((C5867a) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(inverse());
        }

        public K checkKey(K k) {
            return this.inverse.checkValue(k);
        }

        public V checkValue(V v) {
            return this.inverse.checkKey(v);
        }

        public /* bridge */ /* synthetic */ Object delegate() {
            return C5867a.super.delegate();
        }

        public Object readResolve() {
            return inverse().inverse();
        }

        public /* bridge */ /* synthetic */ Collection values() {
            return C5867a.super.values();
        }
    }

    /* renamed from: c.q.b.b.a$e */
    /* compiled from: AbstractBiMap */
    public class C5872e extends C6167v0<K> {
        public C5872e() {
        }

        public void clear() {
            C5867a.this.clear();
        }

        public Iterator<K> iterator() {
            return C6108q1.m17176l(C5867a.this.entrySet().iterator());
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            Object unused = C5867a.this.removeFromBothMaps(obj);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        public /* synthetic */ C5872e(C5867a aVar, C5868a aVar2) {
            this();
        }

        public Set<K> delegate() {
            return C5867a.this.delegate.keySet();
        }
    }

    /* renamed from: c.q.b.b.a$f */
    /* compiled from: AbstractBiMap */
    public class C5873f extends C6167v0<V> {

        /* renamed from: e */
        public final Set<V> f11393e;

        public C5873f() {
            this.f11393e = C5867a.this.inverse.keySet();
        }

        public Iterator<V> iterator() {
            return C6108q1.m17162C(C5867a.this.entrySet().iterator());
        }

        public Object[] toArray() {
            return standardToArray();
        }

        public String toString() {
            return standardToString();
        }

        public <T> T[] toArray(T[] tArr) {
            return standardToArray(tArr);
        }

        public /* synthetic */ C5873f(C5867a aVar, C5868a aVar2) {
            this();
        }

        public Set<V> delegate() {
            return this.f11393e;
        }
    }

    public /* synthetic */ C5867a(Map map, C5867a aVar, C5868a aVar2) {
        this(map, aVar);
    }

    private V putInBothMaps(K k, V v, boolean z) {
        checkKey(k);
        checkValue(v);
        boolean containsKey = containsKey(k);
        if (containsKey && C5845j.m16576a(v, get(k))) {
            return v;
        }
        if (z) {
            inverse().remove(v);
        } else {
            C5850m.m16589j(!containsValue(v), "value already present: %s", v);
        }
        V put = this.delegate.put(k, v);
        updateInverseMap(k, containsKey, put, v);
        return put;
    }

    /* access modifiers changed from: private */
    public V removeFromBothMaps(Object obj) {
        V remove = this.delegate.remove(obj);
        removeFromInverseMap(remove);
        return remove;
    }

    /* access modifiers changed from: private */
    public void removeFromInverseMap(V v) {
        this.inverse.delegate.remove(v);
    }

    /* access modifiers changed from: private */
    public void updateInverseMap(K k, boolean z, V v, V v2) {
        if (z) {
            removeFromInverseMap(v);
        }
        this.inverse.delegate.put(v2, k);
    }

    public K checkKey(K k) {
        return k;
    }

    public V checkValue(V v) {
        return v;
    }

    public void clear() {
        this.delegate.clear();
        this.inverse.delegate.clear();
    }

    public boolean containsValue(Object obj) {
        return this.inverse.containsKey(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        C5870c cVar = new C5870c(this, (C5868a) null);
        this.entrySet = cVar;
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        return new C5868a(this.delegate.entrySet().iterator());
    }

    public V forcePut(K k, V v) {
        return putInBothMaps(k, v, true);
    }

    public C6151t<V, K> inverse() {
        return this.inverse;
    }

    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        C5872e eVar = new C5872e(this, (C5868a) null);
        this.keySet = eVar;
        return eVar;
    }

    public C5867a<V, K> makeInverse(Map<V, K> map) {
        return new C5871d(map, this);
    }

    public V put(K k, V v) {
        return putInBothMaps(k, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public V remove(Object obj) {
        if (containsKey(obj)) {
            return removeFromBothMaps(obj);
        }
        return null;
    }

    public void setDelegates(Map<K, V> map, Map<V, K> map2) {
        boolean z = true;
        C5850m.m16600u(this.delegate == null);
        C5850m.m16600u(this.inverse == null);
        C5850m.m16583d(map.isEmpty());
        C5850m.m16583d(map2.isEmpty());
        if (map == map2) {
            z = false;
        }
        C5850m.m16583d(z);
        this.delegate = map;
        this.inverse = makeInverse(map2);
    }

    public void setInverse(C5867a<V, K> aVar) {
        this.inverse = aVar;
    }

    public C5867a(Map<K, V> map, Map<V, K> map2) {
        setDelegates(map, map2);
    }

    public Map<K, V> delegate() {
        return this.delegate;
    }

    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        C5873f fVar = new C5873f(this, (C5868a) null);
        this.valueSet = fVar;
        return fVar;
    }

    public C5867a(Map<K, V> map, C5867a<V, K> aVar) {
        this.delegate = map;
        this.inverse = aVar;
    }
}
