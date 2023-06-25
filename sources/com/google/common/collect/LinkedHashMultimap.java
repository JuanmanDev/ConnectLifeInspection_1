package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p355b.C5881b1;
import p040c.p200q.p353b.p355b.C5882b2;
import p040c.p200q.p353b.p355b.C6045m1;
import p040c.p200q.p353b.p355b.C6108q1;
import p040c.p200q.p353b.p355b.C6136r1;
import p040c.p200q.p353b.p355b.C6148s2;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p355b.C6166v;
import p040c.p200q.p353b.p355b.C6204z0;

public final class LinkedHashMultimap<K, V> extends C6045m1<K, V> {
    public static final int DEFAULT_KEY_CAPACITY = 16;
    public static final int DEFAULT_VALUE_SET_CAPACITY = 2;
    public static final double VALUE_SET_LOAD_FACTOR = 1.0d;
    public static final long serialVersionUID = 1;
    public transient C8155b<K, V> multimapHeaderEntry;
    public transient int valueSetCapacity = 2;

    /* renamed from: com.google.common.collect.LinkedHashMultimap$a */
    public class C8154a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: e */
        public C8155b<K, V> f15159e = LinkedHashMultimap.this.multimapHeaderEntry.f15167r;

        /* renamed from: l */
        public C8155b<K, V> f15160l;

        public C8154a() {
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                C8155b<K, V> bVar = this.f15159e;
                this.f15160l = bVar;
                this.f15159e = bVar.f15167r;
                return bVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f15159e != LinkedHashMultimap.this.multimapHeaderEntry;
        }

        public void remove() {
            C6166v.m17279e(this.f15160l != null);
            LinkedHashMultimap.this.remove(this.f15160l.getKey(), this.f15160l.getValue());
            this.f15160l = null;
        }
    }

    /* renamed from: com.google.common.collect.LinkedHashMultimap$b */
    public static final class C8155b<K, V> extends C5881b1<K, V> implements C8158d<K, V> {

        /* renamed from: m */
        public final int f15162m;

        /* renamed from: n */
        public C8155b<K, V> f15163n;

        /* renamed from: o */
        public C8158d<K, V> f15164o;

        /* renamed from: p */
        public C8158d<K, V> f15165p;

        /* renamed from: q */
        public C8155b<K, V> f15166q;

        /* renamed from: r */
        public C8155b<K, V> f15167r;

        public C8155b(K k, V v, int i, C8155b<K, V> bVar) {
            super(k, v);
            this.f15162m = i;
            this.f15163n = bVar;
        }

        /* renamed from: a */
        public C8155b<K, V> mo36829a() {
            return this.f15166q;
        }

        /* renamed from: b */
        public C8155b<K, V> mo36830b() {
            return this.f15167r;
        }

        /* renamed from: c */
        public void mo36831c(C8158d<K, V> dVar) {
            this.f15165p = dVar;
        }

        /* renamed from: d */
        public boolean mo36832d(Object obj, int i) {
            return this.f15162m == i && C5845j.m16576a(getValue(), obj);
        }

        /* renamed from: e */
        public void mo36833e(C8155b<K, V> bVar) {
            this.f15166q = bVar;
        }

        /* renamed from: f */
        public C8158d<K, V> mo36834f() {
            return this.f15164o;
        }

        /* renamed from: g */
        public C8158d<K, V> mo36835g() {
            return this.f15165p;
        }

        /* renamed from: h */
        public void mo36836h(C8155b<K, V> bVar) {
            this.f15167r = bVar;
        }

        /* renamed from: l */
        public void mo36837l(C8158d<K, V> dVar) {
            this.f15164o = dVar;
        }
    }

    /* renamed from: com.google.common.collect.LinkedHashMultimap$c */
    public final class C8156c extends C6148s2.C6149a<V> implements C8158d<K, V> {

        /* renamed from: e */
        public final K f15168e;

        /* renamed from: l */
        public C8155b<K, V>[] f15169l;

        /* renamed from: m */
        public int f15170m = 0;

        /* renamed from: n */
        public int f15171n = 0;

        /* renamed from: o */
        public C8158d<K, V> f15172o;

        /* renamed from: p */
        public C8158d<K, V> f15173p;

        /* renamed from: com.google.common.collect.LinkedHashMultimap$c$a */
        public class C8157a implements Iterator<V> {

            /* renamed from: e */
            public C8158d<K, V> f15175e = C8156c.this.f15172o;

            /* renamed from: l */
            public C8155b<K, V> f15176l;

            /* renamed from: m */
            public int f15177m = C8156c.this.f15171n;

            public C8157a() {
            }

            /* renamed from: a */
            public final void mo36846a() {
                if (C8156c.this.f15171n != this.f15177m) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                mo36846a();
                return this.f15175e != C8156c.this;
            }

            public V next() {
                if (hasNext()) {
                    C8155b<K, V> bVar = (C8155b) this.f15175e;
                    V value = bVar.getValue();
                    this.f15176l = bVar;
                    this.f15175e = bVar.mo36835g();
                    return value;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                mo36846a();
                C6166v.m17279e(this.f15176l != null);
                C8156c.this.remove(this.f15176l.getValue());
                this.f15177m = C8156c.this.f15171n;
                this.f15176l = null;
            }
        }

        public C8156c(K k, int i) {
            this.f15168e = k;
            this.f15172o = this;
            this.f15173p = this;
            this.f15169l = new C8155b[C6204z0.m17450a(i, 1.0d)];
        }

        public boolean add(V v) {
            int d = C6204z0.m17453d(v);
            int p = mo36842p() & d;
            C8155b<K, V> bVar = this.f15169l[p];
            for (C8155b<K, V> bVar2 = bVar; bVar2 != null; bVar2 = bVar2.f15163n) {
                if (bVar2.mo36832d(v, d)) {
                    return false;
                }
            }
            C8155b<K, V> bVar3 = new C8155b<>(this.f15168e, v, d, bVar);
            LinkedHashMultimap.succeedsInValueSet(this.f15173p, bVar3);
            LinkedHashMultimap.succeedsInValueSet(bVar3, this);
            LinkedHashMultimap.succeedsInMultimap(LinkedHashMultimap.this.multimapHeaderEntry.mo36829a(), bVar3);
            LinkedHashMultimap.succeedsInMultimap(bVar3, LinkedHashMultimap.this.multimapHeaderEntry);
            this.f15169l[p] = bVar3;
            this.f15170m++;
            this.f15171n++;
            mo36844s();
            return true;
        }

        /* renamed from: c */
        public void mo36831c(C8158d<K, V> dVar) {
            this.f15172o = dVar;
        }

        public void clear() {
            Arrays.fill(this.f15169l, (Object) null);
            this.f15170m = 0;
            for (C8158d<K, V> dVar = this.f15172o; dVar != this; dVar = dVar.mo36835g()) {
                LinkedHashMultimap.deleteFromMultimap((C8155b) dVar);
            }
            LinkedHashMultimap.succeedsInValueSet(this, this);
            this.f15171n++;
        }

        public boolean contains(Object obj) {
            int d = C6204z0.m17453d(obj);
            for (C8155b<K, V> bVar = this.f15169l[mo36842p() & d]; bVar != null; bVar = bVar.f15163n) {
                if (bVar.mo36832d(obj, d)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public C8158d<K, V> mo36834f() {
            return this.f15173p;
        }

        /* renamed from: g */
        public C8158d<K, V> mo36835g() {
            return this.f15172o;
        }

        public Iterator<V> iterator() {
            return new C8157a();
        }

        /* renamed from: l */
        public void mo36837l(C8158d<K, V> dVar) {
            this.f15173p = dVar;
        }

        /* renamed from: p */
        public final int mo36842p() {
            return this.f15169l.length - 1;
        }

        public boolean remove(Object obj) {
            int d = C6204z0.m17453d(obj);
            int p = mo36842p() & d;
            C8155b<K, V> bVar = null;
            for (C8155b<K, V> bVar2 = this.f15169l[p]; bVar2 != null; bVar2 = bVar2.f15163n) {
                if (bVar2.mo36832d(obj, d)) {
                    if (bVar == null) {
                        this.f15169l[p] = bVar2.f15163n;
                    } else {
                        bVar.f15163n = bVar2.f15163n;
                    }
                    LinkedHashMultimap.deleteFromValueSet(bVar2);
                    LinkedHashMultimap.deleteFromMultimap(bVar2);
                    this.f15170m--;
                    this.f15171n++;
                    return true;
                }
                bVar = bVar2;
            }
            return false;
        }

        /* renamed from: s */
        public final void mo36844s() {
            if (C6204z0.m17451b(this.f15170m, this.f15169l.length, 1.0d)) {
                int length = this.f15169l.length * 2;
                C8155b<K, V>[] bVarArr = new C8155b[length];
                this.f15169l = bVarArr;
                int i = length - 1;
                for (C8158d dVar = this.f15172o; dVar != this; dVar = dVar.mo36835g()) {
                    C8155b<K, V> bVar = (C8155b) dVar;
                    int i2 = bVar.f15162m & i;
                    bVar.f15163n = bVarArr[i2];
                    bVarArr[i2] = bVar;
                }
            }
        }

        public int size() {
            return this.f15170m;
        }
    }

    /* renamed from: com.google.common.collect.LinkedHashMultimap$d */
    public interface C8158d<K, V> {
        /* renamed from: c */
        void mo36831c(C8158d<K, V> dVar);

        /* renamed from: f */
        C8158d<K, V> mo36834f();

        /* renamed from: g */
        C8158d<K, V> mo36835g();

        /* renamed from: l */
        void mo36837l(C8158d<K, V> dVar);
    }

    public LinkedHashMultimap(int i, int i2) {
        super(C5882b2.m16643e(i));
        C6166v.m17276b(i2, "expectedValuesPerKey");
        this.valueSetCapacity = i2;
        C8155b<K, V> bVar = new C8155b<>(null, null, 0, (C8155b) null);
        this.multimapHeaderEntry = bVar;
        succeedsInMultimap(bVar, bVar);
    }

    public static <K, V> LinkedHashMultimap<K, V> create() {
        return new LinkedHashMultimap<>(16, 2);
    }

    public static <K, V> void deleteFromMultimap(C8155b<K, V> bVar) {
        succeedsInMultimap(bVar.mo36829a(), bVar.mo36830b());
    }

    public static <K, V> void deleteFromValueSet(C8158d<K, V> dVar) {
        succeedsInValueSet(dVar.mo36834f(), dVar.mo36835g());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        C8155b<K, V> bVar = new C8155b<>(null, null, 0, (C8155b) null);
        this.multimapHeaderEntry = bVar;
        succeedsInMultimap(bVar, bVar);
        this.valueSetCapacity = 2;
        int readInt = objectInputStream.readInt();
        Map e = C5882b2.m16643e(12);
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            e.put(readObject, createCollection(readObject));
        }
        int readInt2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            ((Collection) e.get(objectInputStream.readObject())).add(objectInputStream.readObject());
        }
        setMap(e);
    }

    public static <K, V> void succeedsInMultimap(C8155b<K, V> bVar, C8155b<K, V> bVar2) {
        bVar.mo36836h(bVar2);
        bVar2.mo36833e(bVar);
    }

    public static <K, V> void succeedsInValueSet(C8158d<K, V> dVar, C8158d<K, V> dVar2) {
        dVar.mo36831c(dVar2);
        dVar2.mo36837l(dVar);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(keySet().size());
        for (Object writeObject : keySet()) {
            objectOutputStream.writeObject(writeObject);
        }
        objectOutputStream.writeInt(size());
        for (Map.Entry entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    public void clear() {
        super.clear();
        C8155b<K, V> bVar = this.multimapHeaderEntry;
        succeedsInMultimap(bVar, bVar);
    }

    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new C8154a();
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ Set get(Object obj) {
        return super.get(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public Set<K> keySet() {
        return super.keySet();
    }

    public /* bridge */ /* synthetic */ C6153t1 keys() {
        return super.keys();
    }

    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean putAll(C6136r1 r1Var) {
        return super.putAll(r1Var);
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public /* bridge */ /* synthetic */ Set removeAll(Object obj) {
        return super.removeAll(obj);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public Iterator<V> valueIterator() {
        return C6108q1.m17162C(entryIterator());
    }

    public Collection<V> values() {
        return super.values();
    }

    public static <K, V> LinkedHashMultimap<K, V> create(int i, int i2) {
        return new LinkedHashMultimap<>(C6108q1.m17168d(i), C6108q1.m17168d(i2));
    }

    public Set<V> createCollection() {
        return C5882b2.m16644f(this.valueSetCapacity);
    }

    public Set<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return super.replaceValues((Object) k, (Iterable) iterable);
    }

    public Collection<V> createCollection(K k) {
        return new C8156c(k, this.valueSetCapacity);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(C6136r1<? extends K, ? extends V> r1Var) {
        LinkedHashMultimap<K, V> create = create(r1Var.keySet().size(), 2);
        create.putAll(r1Var);
        return create;
    }
}
