package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5886c;
import p040c.p200q.p353b.p355b.C5992i;
import p040c.p200q.p353b.p355b.C6020k1;
import p040c.p200q.p353b.p355b.C6028l1;
import p040c.p200q.p353b.p355b.C6049n1;
import p040c.p200q.p353b.p355b.C6064p0;
import p040c.p200q.p353b.p355b.C6108q1;
import p040c.p200q.p353b.p355b.C6131q2;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p355b.C6158u1;
import p040c.p200q.p353b.p355b.C6166v;
import p040c.p200q.p353b.p355b.C6167v0;
import p040c.p200q.p353b.p355b.C6170w;
import p040c.p200q.p353b.p358e.C6250c;

public final class ConcurrentHashMultiset<E> extends C5992i<E> implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient ConcurrentMap<E, AtomicInteger> countMap;

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$b */
    public class C8076b extends C5886c<C6153t1.C6154a<E>> {

        /* renamed from: m */
        public final Iterator<Map.Entry<E, AtomicInteger>> f15022m = ConcurrentHashMultiset.this.countMap.entrySet().iterator();

        public C8076b() {
        }

        /* renamed from: d */
        public C6153t1.C6154a<E> mo29067a() {
            while (this.f15022m.hasNext()) {
                Map.Entry next = this.f15022m.next();
                int i = ((AtomicInteger) next.getValue()).get();
                if (i != 0) {
                    return C6158u1.m17263g(next.getKey(), i);
                }
            }
            return (C6153t1.C6154a) mo29068b();
        }
    }

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$c */
    public class C8077c extends C6064p0<C6153t1.C6154a<E>> {

        /* renamed from: e */
        public C6153t1.C6154a<E> f15024e;

        /* renamed from: l */
        public final /* synthetic */ Iterator f15025l;

        public C8077c(Iterator it) {
            this.f15025l = it;
        }

        /* renamed from: c */
        public Iterator<C6153t1.C6154a<E>> delegate() {
            return this.f15025l;
        }

        /* renamed from: f */
        public C6153t1.C6154a<E> next() {
            C6153t1.C6154a<E> aVar = (C6153t1.C6154a) super.next();
            this.f15024e = aVar;
            return aVar;
        }

        public void remove() {
            C6166v.m17279e(this.f15024e != null);
            ConcurrentHashMultiset.this.setCount(this.f15024e.mo29977a(), 0);
            this.f15024e = null;
        }
    }

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$d */
    public class C8078d extends C5992i<E>.b {
        public C8078d() {
            super();
        }

        /* renamed from: o */
        public ConcurrentHashMultiset<E> mo29499k() {
            return ConcurrentHashMultiset.this;
        }

        /* renamed from: p */
        public final List<C6153t1.C6154a<E>> mo36500p() {
            ArrayList k = C6049n1.m16983k(size());
            C6028l1.m16929a(k, iterator());
            return k;
        }

        public Object[] toArray() {
            return mo36500p().toArray();
        }

        public /* synthetic */ C8078d(ConcurrentHashMultiset concurrentHashMultiset, C8075a aVar) {
            this();
        }

        public <T> T[] toArray(T[] tArr) {
            return mo36500p().toArray(tArr);
        }
    }

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$e */
    public static class C8079e {

        /* renamed from: a */
        public static final C6131q2.C6133b<ConcurrentHashMultiset> f15028a = C6131q2.m17221a(ConcurrentHashMultiset.class, "countMap");
    }

    public ConcurrentHashMultiset(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        C5850m.m16589j(concurrentMap.isEmpty(), "the backing map (%s) must be empty", concurrentMap);
        this.countMap = concurrentMap;
    }

    public static <E> ConcurrentHashMultiset<E> create() {
        return new ConcurrentHashMultiset<>(new ConcurrentHashMap());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        C8079e.f15028a.mo29955b(this, (ConcurrentMap) objectInputStream.readObject());
    }

    private List<E> snapshot() {
        ArrayList k = C6049n1.m16983k(size());
        for (C6153t1.C6154a aVar : entrySet()) {
            Object a = aVar.mo29977a();
            for (int count = aVar.getCount(); count > 0; count--) {
                k.add(a);
            }
        }
        return k;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.countMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r4.countMap.putIfAbsent(r5, r2) == null) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int add(E r5, int r6) {
        /*
            r4 = this;
            p040c.p200q.p353b.p354a.C5850m.m16594o(r5)
            if (r6 != 0) goto L_0x000a
            int r5 = r4.count(r5)
            return r5
        L_0x000a:
            java.lang.String r0 = "occurences"
            p040c.p200q.p353b.p355b.C6166v.m17278d(r6, r0)
        L_0x000f:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.countMap
            java.lang.Object r0 = p040c.p200q.p353b.p355b.C6108q1.m17185u(r0, r5)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 != 0) goto L_0x002a
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.countMap
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.lang.Object r0 = r0.putIfAbsent(r5, r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 != 0) goto L_0x002a
            return r1
        L_0x002a:
            int r2 = r0.get()
            if (r2 == 0) goto L_0x005a
            int r3 = p040c.p200q.p353b.p357d.C6236c.m17536a(r2, r6)     // Catch:{ ArithmeticException -> 0x003b }
            boolean r3 = r0.compareAndSet(r2, r3)     // Catch:{ ArithmeticException -> 0x003b }
            if (r3 == 0) goto L_0x002a
            return r2
        L_0x003b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Overflow adding "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " occurrences to a count of "
            r0.append(r6)
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L_0x005a:
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.countMap
            java.lang.Object r3 = r3.putIfAbsent(r5, r2)
            if (r3 == 0) goto L_0x006f
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.countMap
            boolean r0 = r3.replace(r5, r0, r2)
            if (r0 == 0) goto L_0x000f
        L_0x006f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentHashMultiset.add(java.lang.Object, int):int");
    }

    public void clear() {
        this.countMap.clear();
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public int count(Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) C6108q1.m17185u(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    public Set<E> createElementSet() {
        return new C8075a(this, this.countMap.keySet());
    }

    @Deprecated
    public Set<C6153t1.C6154a<E>> createEntrySet() {
        return new C8078d(this, (C8075a) null);
    }

    public int distinctElements() {
        return this.countMap.size();
    }

    public Iterator<E> elementIterator() {
        throw new AssertionError("should never be called");
    }

    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    public Iterator<C6153t1.C6154a<E>> entryIterator() {
        return new C8077c(new C8076b());
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public boolean isEmpty() {
        return this.countMap.isEmpty();
    }

    public Iterator<E> iterator() {
        return C6158u1.m17265i(this);
    }

    public int remove(Object obj, int i) {
        int i2;
        int max;
        if (i == 0) {
            return count(obj);
        }
        C6166v.m17278d(i, "occurences");
        AtomicInteger atomicInteger = (AtomicInteger) C6108q1.m17185u(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 == 0) {
                return 0;
            }
            max = Math.max(0, i2 - i);
        } while (!atomicInteger.compareAndSet(i2, max));
        if (max == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return i2;
    }

    public boolean removeExactly(Object obj, int i) {
        int i2;
        int i3;
        if (i == 0) {
            return true;
        }
        C6166v.m17278d(i, "occurences");
        AtomicInteger atomicInteger = (AtomicInteger) C6108q1.m17185u(this.countMap, obj);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 < i) {
                return false;
            }
            i3 = i2 - i;
        } while (!atomicInteger.compareAndSet(i2, i3));
        if (i3 == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r6 != 0) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r4.countMap.putIfAbsent(r5, r2) == null) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int setCount(E r5, int r6) {
        /*
            r4 = this;
            p040c.p200q.p353b.p354a.C5850m.m16594o(r5)
            java.lang.String r0 = "count"
            p040c.p200q.p353b.p355b.C6166v.m17276b(r6, r0)
        L_0x0008:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.countMap
            java.lang.Object r0 = p040c.p200q.p353b.p355b.C6108q1.m17185u(r0, r5)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 != 0) goto L_0x0026
            if (r6 != 0) goto L_0x0016
            return r1
        L_0x0016:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.countMap
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.lang.Object r0 = r0.putIfAbsent(r5, r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 != 0) goto L_0x0026
            return r1
        L_0x0026:
            int r2 = r0.get()
            if (r2 != 0) goto L_0x0045
            if (r6 != 0) goto L_0x002f
            return r1
        L_0x002f:
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.countMap
            java.lang.Object r3 = r3.putIfAbsent(r5, r2)
            if (r3 == 0) goto L_0x0044
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.countMap
            boolean r0 = r3.replace(r5, r0, r2)
            if (r0 == 0) goto L_0x0008
        L_0x0044:
            return r1
        L_0x0045:
            boolean r3 = r0.compareAndSet(r2, r6)
            if (r3 == 0) goto L_0x0026
            if (r6 != 0) goto L_0x0052
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r6 = r4.countMap
            r6.remove(r5, r0)
        L_0x0052:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentHashMultiset.setCount(java.lang.Object, int):int");
    }

    public int size() {
        long j = 0;
        for (AtomicInteger atomicInteger : this.countMap.values()) {
            j += (long) atomicInteger.get();
        }
        return C6250c.m17574h(j);
    }

    public Object[] toArray() {
        return snapshot().toArray();
    }

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$a */
    public class C8075a extends C6167v0<E> {

        /* renamed from: e */
        public final /* synthetic */ Set f15021e;

        public C8075a(ConcurrentHashMultiset concurrentHashMultiset, Set set) {
            this.f15021e = set;
        }

        public boolean contains(Object obj) {
            return obj != null && C6170w.m17285d(this.f15021e, obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        public boolean remove(Object obj) {
            return obj != null && C6170w.m17286e(this.f15021e, obj);
        }

        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        public Set<E> delegate() {
            return this.f15021e;
        }
    }

    public static <E> ConcurrentHashMultiset<E> create(Iterable<? extends E> iterable) {
        ConcurrentHashMultiset<E> create = create();
        C6020k1.m16914a(create, iterable);
        return create;
    }

    public <T> T[] toArray(T[] tArr) {
        return snapshot().toArray(tArr);
    }

    public static <E> ConcurrentHashMultiset<E> create(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        return new ConcurrentHashMultiset<>(concurrentMap);
    }

    public boolean setCount(E e, int i, int i2) {
        C5850m.m16594o(e);
        C6166v.m17276b(i, "oldCount");
        C6166v.m17276b(i2, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) C6108q1.m17185u(this.countMap, e);
        if (atomicInteger != null) {
            int i3 = atomicInteger.get();
            if (i3 == i) {
                if (i3 == 0) {
                    if (i2 == 0) {
                        this.countMap.remove(e, atomicInteger);
                        return true;
                    }
                    AtomicInteger atomicInteger2 = new AtomicInteger(i2);
                    if (this.countMap.putIfAbsent(e, atomicInteger2) == null || this.countMap.replace(e, atomicInteger, atomicInteger2)) {
                        return true;
                    }
                    return false;
                } else if (atomicInteger.compareAndSet(i3, i2)) {
                    if (i2 == 0) {
                        this.countMap.remove(e, atomicInteger);
                    }
                    return true;
                }
            }
            return false;
        } else if (i != 0) {
            return false;
        } else {
            if (i2 == 0) {
                return true;
            }
            if (this.countMap.putIfAbsent(e, new AtomicInteger(i2)) == null) {
                return true;
            }
            return false;
        }
    }
}
