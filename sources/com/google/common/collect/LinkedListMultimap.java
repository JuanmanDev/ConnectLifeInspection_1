package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5882b2;
import p040c.p200q.p353b.p355b.C5978g;
import p040c.p200q.p353b.p355b.C5982g3;
import p040c.p200q.p353b.p355b.C5983h;
import p040c.p200q.p353b.p355b.C6028l1;
import p040c.p200q.p353b.p355b.C6049n1;
import p040c.p200q.p353b.p355b.C6136r1;
import p040c.p200q.p353b.p355b.C6140s1;
import p040c.p200q.p353b.p355b.C6148s2;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p355b.C6166v;
import p040c.p200q.p353b.p355b.C6203z;

public class LinkedListMultimap<K, V> extends C5983h<K, V> implements Object<K, V>, Serializable {
    public static final long serialVersionUID = 0;
    public transient C8166g<K, V> head;
    public transient Map<K, C8165f<K, V>> keyToKeyList;
    public transient int modCount;
    public transient int size;
    public transient C8166g<K, V> tail;

    /* renamed from: com.google.common.collect.LinkedListMultimap$a */
    public class C8159a extends AbstractSequentialList<V> {

        /* renamed from: e */
        public final /* synthetic */ Object f15179e;

        public C8159a(Object obj) {
            this.f15179e = obj;
        }

        public ListIterator<V> listIterator(int i) {
            return new C8168i(this.f15179e, i);
        }

        public int size() {
            C8165f fVar = (C8165f) LinkedListMultimap.this.keyToKeyList.get(this.f15179e);
            if (fVar == null) {
                return 0;
            }
            return fVar.f15192c;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$b */
    public class C8160b extends AbstractSequentialList<Map.Entry<K, V>> {
        public C8160b() {
        }

        public ListIterator<Map.Entry<K, V>> listIterator(int i) {
            return new C8167h(i);
        }

        public int size() {
            return LinkedListMultimap.this.size;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$c */
    public class C8161c extends C6148s2.C6149a<K> {
        public C8161c() {
        }

        public boolean contains(Object obj) {
            return LinkedListMultimap.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C8164e(LinkedListMultimap.this, (C8159a) null);
        }

        public boolean remove(Object obj) {
            return !LinkedListMultimap.this.removeAll(obj).isEmpty();
        }

        public int size() {
            return LinkedListMultimap.this.keyToKeyList.size();
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$d */
    public class C8162d extends AbstractSequentialList<V> {

        /* renamed from: com.google.common.collect.LinkedListMultimap$d$a */
        public class C8163a extends C5982g3<Map.Entry<K, V>, V> {

            /* renamed from: l */
            public final /* synthetic */ C8167h f15184l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C8163a(C8162d dVar, ListIterator listIterator, C8167h hVar) {
                super(listIterator);
                this.f15184l = hVar;
            }

            /* renamed from: c */
            public V mo29448a(Map.Entry<K, V> entry) {
                return entry.getValue();
            }

            public void set(V v) {
                this.f15184l.mo36871f(v);
            }
        }

        public C8162d() {
        }

        public ListIterator<V> listIterator(int i) {
            C8167h hVar = new C8167h(i);
            return new C8163a(this, hVar, hVar);
        }

        public int size() {
            return LinkedListMultimap.this.size;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$f */
    public static class C8165f<K, V> {

        /* renamed from: a */
        public C8166g<K, V> f15190a;

        /* renamed from: b */
        public C8166g<K, V> f15191b;

        /* renamed from: c */
        public int f15192c = 1;

        public C8165f(C8166g<K, V> gVar) {
            this.f15190a = gVar;
            this.f15191b = gVar;
            gVar.f15198p = null;
            gVar.f15197o = null;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$g */
    public static final class C8166g<K, V> extends C5978g<K, V> {

        /* renamed from: e */
        public final K f15193e;

        /* renamed from: l */
        public V f15194l;

        /* renamed from: m */
        public C8166g<K, V> f15195m;

        /* renamed from: n */
        public C8166g<K, V> f15196n;

        /* renamed from: o */
        public C8166g<K, V> f15197o;

        /* renamed from: p */
        public C8166g<K, V> f15198p;

        public C8166g(K k, V v) {
            this.f15193e = k;
            this.f15194l = v;
        }

        public K getKey() {
            return this.f15193e;
        }

        public V getValue() {
            return this.f15194l;
        }

        public V setValue(V v) {
            V v2 = this.f15194l;
            this.f15194l = v;
            return v2;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$h */
    public class C8167h implements ListIterator<Map.Entry<K, V>> {

        /* renamed from: e */
        public int f15199e;

        /* renamed from: l */
        public C8166g<K, V> f15200l;

        /* renamed from: m */
        public C8166g<K, V> f15201m;

        /* renamed from: n */
        public C8166g<K, V> f15202n;

        /* renamed from: o */
        public int f15203o = LinkedListMultimap.this.modCount;

        public C8167h(int i) {
            int size = LinkedListMultimap.this.size();
            C5850m.m16597r(i, size);
            if (i < size / 2) {
                this.f15200l = LinkedListMultimap.this.head;
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i2;
                }
            } else {
                this.f15202n = LinkedListMultimap.this.tail;
                this.f15199e = size;
                while (true) {
                    int i3 = i + 1;
                    if (i >= size) {
                        break;
                    }
                    previous();
                    i = i3;
                }
            }
            this.f15201m = null;
        }

        /* renamed from: a */
        public void mo36865a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ void add(Object obj) {
            mo36865a((Map.Entry) obj);
            throw null;
        }

        /* renamed from: b */
        public final void mo36867b() {
            if (LinkedListMultimap.this.modCount != this.f15203o) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: c */
        public C8166g<K, V> next() {
            mo36867b();
            LinkedListMultimap.checkElement(this.f15200l);
            C8166g<K, V> gVar = this.f15200l;
            this.f15201m = gVar;
            this.f15202n = gVar;
            this.f15200l = gVar.f15195m;
            this.f15199e++;
            return gVar;
        }

        /* renamed from: d */
        public C8166g<K, V> previous() {
            mo36867b();
            LinkedListMultimap.checkElement(this.f15202n);
            C8166g<K, V> gVar = this.f15202n;
            this.f15201m = gVar;
            this.f15200l = gVar;
            this.f15202n = gVar.f15196n;
            this.f15199e--;
            return gVar;
        }

        /* renamed from: e */
        public void mo36870e(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public void mo36871f(V v) {
            C5850m.m16600u(this.f15201m != null);
            this.f15201m.f15194l = v;
        }

        public boolean hasNext() {
            mo36867b();
            return this.f15200l != null;
        }

        public boolean hasPrevious() {
            mo36867b();
            return this.f15202n != null;
        }

        public int nextIndex() {
            return this.f15199e;
        }

        public int previousIndex() {
            return this.f15199e - 1;
        }

        public void remove() {
            mo36867b();
            C6166v.m17279e(this.f15201m != null);
            C8166g<K, V> gVar = this.f15201m;
            if (gVar != this.f15200l) {
                this.f15202n = gVar.f15196n;
                this.f15199e--;
            } else {
                this.f15200l = gVar.f15195m;
            }
            LinkedListMultimap.this.removeNode(this.f15201m);
            this.f15201m = null;
            this.f15203o = LinkedListMultimap.this.modCount;
        }

        public /* bridge */ /* synthetic */ void set(Object obj) {
            mo36870e((Map.Entry) obj);
            throw null;
        }
    }

    public LinkedListMultimap() {
        this(12);
    }

    /* access modifiers changed from: private */
    public C8166g<K, V> addNode(K k, V v, C8166g<K, V> gVar) {
        C8166g<K, V> gVar2 = new C8166g<>(k, v);
        if (this.head == null) {
            this.tail = gVar2;
            this.head = gVar2;
            this.keyToKeyList.put(k, new C8165f(gVar2));
            this.modCount++;
        } else if (gVar == null) {
            C8166g<K, V> gVar3 = this.tail;
            gVar3.f15195m = gVar2;
            gVar2.f15196n = gVar3;
            this.tail = gVar2;
            C8165f fVar = this.keyToKeyList.get(k);
            if (fVar == null) {
                this.keyToKeyList.put(k, new C8165f(gVar2));
                this.modCount++;
            } else {
                fVar.f15192c++;
                C8166g<K, V> gVar4 = fVar.f15191b;
                gVar4.f15197o = gVar2;
                gVar2.f15198p = gVar4;
                fVar.f15191b = gVar2;
            }
        } else {
            this.keyToKeyList.get(k).f15192c++;
            gVar2.f15196n = gVar.f15196n;
            gVar2.f15198p = gVar.f15198p;
            gVar2.f15195m = gVar;
            gVar2.f15197o = gVar;
            C8166g<K, V> gVar5 = gVar.f15198p;
            if (gVar5 == null) {
                this.keyToKeyList.get(k).f15190a = gVar2;
            } else {
                gVar5.f15197o = gVar2;
            }
            C8166g<K, V> gVar6 = gVar.f15196n;
            if (gVar6 == null) {
                this.head = gVar2;
            } else {
                gVar6.f15195m = gVar2;
            }
            gVar.f15196n = gVar2;
            gVar.f15198p = gVar2;
        }
        this.size++;
        return gVar2;
    }

    public static void checkElement(Object obj) {
        if (obj == null) {
            throw new NoSuchElementException();
        }
    }

    public static <K, V> LinkedListMultimap<K, V> create() {
        return new LinkedListMultimap<>();
    }

    private List<V> getCopy(Object obj) {
        return Collections.unmodifiableList(C6049n1.m16981i(new C8168i(obj)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.keyToKeyList = C6203z.m17435I();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* access modifiers changed from: private */
    public void removeAllNodes(Object obj) {
        C6028l1.m16932d(new C8168i(obj));
    }

    /* access modifiers changed from: private */
    public void removeNode(C8166g<K, V> gVar) {
        C8166g<K, V> gVar2 = gVar.f15196n;
        if (gVar2 != null) {
            gVar2.f15195m = gVar.f15195m;
        } else {
            this.head = gVar.f15195m;
        }
        C8166g<K, V> gVar3 = gVar.f15195m;
        if (gVar3 != null) {
            gVar3.f15196n = gVar.f15196n;
        } else {
            this.tail = gVar.f15196n;
        }
        if (gVar.f15198p == null && gVar.f15197o == null) {
            this.keyToKeyList.remove(gVar.f15193e).f15192c = 0;
            this.modCount++;
        } else {
            C8165f fVar = this.keyToKeyList.get(gVar.f15193e);
            fVar.f15192c--;
            C8166g<K, V> gVar4 = gVar.f15198p;
            if (gVar4 == null) {
                fVar.f15190a = gVar.f15197o;
            } else {
                gVar4.f15197o = gVar.f15197o;
            }
            C8166g<K, V> gVar5 = gVar.f15197o;
            if (gVar5 == null) {
                fVar.f15191b = gVar.f15198p;
            } else {
                gVar5.f15198p = gVar.f15198p;
            }
        }
        this.size--;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
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
        this.head = null;
        this.tail = null;
        this.keyToKeyList.clear();
        this.size = 0;
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public boolean containsKey(Object obj) {
        return this.keyToKeyList.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public Map<K, Collection<V>> createAsMap() {
        return new C6140s1.C6141a(this);
    }

    public Set<K> createKeySet() {
        return new C8161c();
    }

    public C6153t1<K> createKeys() {
        return new C6140s1.C6145c(this);
    }

    public Iterator<Map.Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public /* bridge */ /* synthetic */ C6153t1 keys() {
        return super.keys();
    }

    public boolean put(K k, V v) {
        addNode(k, v, (C8166g) null);
        return true;
    }

    public /* bridge */ /* synthetic */ boolean putAll(C6136r1 r1Var) {
        return super.putAll(r1Var);
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public int size() {
        return this.size;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public LinkedListMultimap(int i) {
        this.keyToKeyList = C5882b2.m16641c(i);
    }

    public static <K, V> LinkedListMultimap<K, V> create(int i) {
        return new LinkedListMultimap<>(i);
    }

    public List<Map.Entry<K, V>> createEntries() {
        return new C8160b();
    }

    public List<V> createValues() {
        return new C8162d();
    }

    public List<Map.Entry<K, V>> entries() {
        return (List) super.entries();
    }

    public List<V> get(K k) {
        return new C8159a(k);
    }

    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    public List<V> removeAll(Object obj) {
        List<V> copy = getCopy(obj);
        removeAllNodes(obj);
        return copy;
    }

    public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
        List<V> copy = getCopy(k);
        C8168i iVar = new C8168i(k);
        Iterator<? extends V> it = iterable.iterator();
        while (iVar.hasNext() && it.hasNext()) {
            iVar.next();
            iVar.set(it.next());
        }
        while (iVar.hasNext()) {
            iVar.next();
            iVar.remove();
        }
        while (it.hasNext()) {
            iVar.add(it.next());
        }
        return copy;
    }

    public List<V> values() {
        return (List) super.values();
    }

    public static <K, V> LinkedListMultimap<K, V> create(C6136r1<? extends K, ? extends V> r1Var) {
        return new LinkedListMultimap<>(r1Var);
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$e */
    public class C8164e implements Iterator<K> {

        /* renamed from: e */
        public final Set<K> f15185e;

        /* renamed from: l */
        public C8166g<K, V> f15186l;

        /* renamed from: m */
        public C8166g<K, V> f15187m;

        /* renamed from: n */
        public int f15188n;

        public C8164e() {
            this.f15185e = C6148s2.m17251d(LinkedListMultimap.this.keySet().size());
            this.f15186l = LinkedListMultimap.this.head;
            this.f15188n = LinkedListMultimap.this.modCount;
        }

        /* renamed from: a */
        public final void mo36861a() {
            if (LinkedListMultimap.this.modCount != this.f15188n) {
                throw new ConcurrentModificationException();
            }
        }

        public boolean hasNext() {
            mo36861a();
            return this.f15186l != null;
        }

        public K next() {
            C8166g<K, V> gVar;
            mo36861a();
            LinkedListMultimap.checkElement(this.f15186l);
            C8166g<K, V> gVar2 = this.f15186l;
            this.f15187m = gVar2;
            this.f15185e.add(gVar2.f15193e);
            do {
                gVar = this.f15186l.f15195m;
                this.f15186l = gVar;
                if (gVar == null || this.f15185e.add(gVar.f15193e)) {
                }
                gVar = this.f15186l.f15195m;
                this.f15186l = gVar;
                break;
            } while (this.f15185e.add(gVar.f15193e));
            return this.f15187m.f15193e;
        }

        public void remove() {
            mo36861a();
            C6166v.m17279e(this.f15187m != null);
            LinkedListMultimap.this.removeAllNodes(this.f15187m.f15193e);
            this.f15187m = null;
            this.f15188n = LinkedListMultimap.this.modCount;
        }

        public /* synthetic */ C8164e(LinkedListMultimap linkedListMultimap, C8159a aVar) {
            this();
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$i */
    public class C8168i implements ListIterator<V> {

        /* renamed from: e */
        public final Object f15205e;

        /* renamed from: l */
        public int f15206l;

        /* renamed from: m */
        public C8166g<K, V> f15207m;

        /* renamed from: n */
        public C8166g<K, V> f15208n;

        /* renamed from: o */
        public C8166g<K, V> f15209o;

        public C8168i(Object obj) {
            C8166g<K, V> gVar;
            this.f15205e = obj;
            C8165f fVar = (C8165f) LinkedListMultimap.this.keyToKeyList.get(obj);
            if (fVar == null) {
                gVar = null;
            } else {
                gVar = fVar.f15190a;
            }
            this.f15207m = gVar;
        }

        public void add(V v) {
            this.f15209o = LinkedListMultimap.this.addNode(this.f15205e, v, this.f15207m);
            this.f15206l++;
            this.f15208n = null;
        }

        public boolean hasNext() {
            return this.f15207m != null;
        }

        public boolean hasPrevious() {
            return this.f15209o != null;
        }

        public V next() {
            LinkedListMultimap.checkElement(this.f15207m);
            C8166g<K, V> gVar = this.f15207m;
            this.f15208n = gVar;
            this.f15209o = gVar;
            this.f15207m = gVar.f15197o;
            this.f15206l++;
            return gVar.f15194l;
        }

        public int nextIndex() {
            return this.f15206l;
        }

        public V previous() {
            LinkedListMultimap.checkElement(this.f15209o);
            C8166g<K, V> gVar = this.f15209o;
            this.f15208n = gVar;
            this.f15207m = gVar;
            this.f15209o = gVar.f15198p;
            this.f15206l--;
            return gVar.f15194l;
        }

        public int previousIndex() {
            return this.f15206l - 1;
        }

        public void remove() {
            C6166v.m17279e(this.f15208n != null);
            C8166g<K, V> gVar = this.f15208n;
            if (gVar != this.f15207m) {
                this.f15209o = gVar.f15198p;
                this.f15206l--;
            } else {
                this.f15207m = gVar.f15197o;
            }
            LinkedListMultimap.this.removeNode(this.f15208n);
            this.f15208n = null;
        }

        public void set(V v) {
            C5850m.m16600u(this.f15208n != null);
            this.f15208n.f15194l = v;
        }

        public C8168i(Object obj, int i) {
            int i2;
            C8166g<K, V> gVar;
            C8166g<K, V> gVar2;
            C8165f fVar = (C8165f) LinkedListMultimap.this.keyToKeyList.get(obj);
            if (fVar == null) {
                i2 = 0;
            } else {
                i2 = fVar.f15192c;
            }
            C5850m.m16597r(i, i2);
            if (i < i2 / 2) {
                if (fVar == null) {
                    gVar = null;
                } else {
                    gVar = fVar.f15190a;
                }
                this.f15207m = gVar;
                while (true) {
                    int i3 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i3;
                }
            } else {
                if (fVar == null) {
                    gVar2 = null;
                } else {
                    gVar2 = fVar.f15191b;
                }
                this.f15209o = gVar2;
                this.f15206l = i2;
                while (true) {
                    int i4 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i4;
                }
            }
            this.f15205e = obj;
            this.f15208n = null;
        }
    }

    public LinkedListMultimap(C6136r1<? extends K, ? extends V> r1Var) {
        this(r1Var.keySet().size());
        putAll(r1Var);
    }
}
