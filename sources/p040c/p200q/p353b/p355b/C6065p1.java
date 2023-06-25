package p040c.p200q.p353b.p355b;

import com.google.common.base.Equivalence;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C6065p1.C6078i;
import p040c.p200q.p353b.p355b.C6065p1.C6083n;
import p040c.p200q.p353b.p358e.C6250c;

/* renamed from: c.q.b.b.p1 */
/* compiled from: MapMakerInternalMap */
public class C6065p1<K, V, E extends C6078i<K, V, E>, S extends C6083n<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final long serialVersionUID = 5;

    /* renamed from: t */
    public static final C6069b0<Object, Object, C6074e> f11650t = new C6066a();

    /* renamed from: e */
    public final transient int f11651e;

    /* renamed from: l */
    public final transient int f11652l;

    /* renamed from: m */
    public final transient C6083n<K, V, E, S>[] f11653m;

    /* renamed from: n */
    public final int f11654n;

    /* renamed from: o */
    public final Equivalence<Object> f11655o;

    /* renamed from: p */
    public final transient C6079j<K, V, E, S> f11656p;

    /* renamed from: q */
    public transient Set<K> f11657q;

    /* renamed from: r */
    public transient Collection<V> f11658r;

    /* renamed from: s */
    public transient Set<Map.Entry<K, V>> f11659s;

    /* renamed from: c.q.b.b.p1$a */
    /* compiled from: MapMakerInternalMap */
    public static class C6066a implements C6069b0<Object, Object, C6074e> {
        /* renamed from: a */
        public /* bridge */ /* synthetic */ C6069b0 mo29734a(ReferenceQueue referenceQueue, C6078i iVar) {
            mo29735b(referenceQueue, (C6074e) iVar);
            return this;
        }

        /* renamed from: b */
        public C6069b0<Object, Object, C6074e> mo29735b(ReferenceQueue<Object> referenceQueue, C6074e eVar) {
            return this;
        }

        /* renamed from: c */
        public C6074e getEntry() {
            return null;
        }

        public void clear() {
        }

        public Object get() {
            return null;
        }
    }

    /* renamed from: c.q.b.b.p1$a0 */
    /* compiled from: MapMakerInternalMap */
    public interface C6067a0<K, V, E extends C6078i<K, V, E>> extends C6078i<K, V, E> {
        C6069b0<K, V, E> getValueReference();
    }

    /* renamed from: c.q.b.b.p1$b */
    /* compiled from: MapMakerInternalMap */
    public static abstract class C6068b<K, V> extends C6060o0<K, V> implements Serializable {
        public static final long serialVersionUID = 3;

        /* renamed from: e */
        public final C6085p f11660e;

        /* renamed from: l */
        public final C6085p f11661l;

        /* renamed from: m */
        public final Equivalence<Object> f11662m;

        /* renamed from: n */
        public final int f11663n;

        /* renamed from: o */
        public transient ConcurrentMap<K, V> f11664o;

        public C6068b(C6085p pVar, C6085p pVar2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.f11660e = pVar;
            this.f11661l = pVar2;
            this.f11662m = equivalence;
            this.f11663n = i;
            this.f11664o = concurrentMap;
        }

        /* renamed from: c */
        public ConcurrentMap<K, V> delegate() {
            return this.f11664o;
        }

        /* renamed from: f */
        public void mo29741f(ObjectInputStream objectInputStream) {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject != null) {
                    this.f11664o.put(readObject, objectInputStream.readObject());
                } else {
                    return;
                }
            }
        }

        /* renamed from: g */
        public C6061o1 mo29742g(ObjectInputStream objectInputStream) {
            int readInt = objectInputStream.readInt();
            C6061o1 o1Var = new C6061o1();
            o1Var.mo29692g(readInt);
            o1Var.mo29695j(this.f11660e);
            o1Var.mo29696k(this.f11661l);
            o1Var.mo29693h(this.f11662m);
            o1Var.mo29686a(this.f11663n);
            return o1Var;
        }

        /* renamed from: l */
        public void mo29743l(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeInt(this.f11664o.size());
            for (Map.Entry entry : this.f11664o.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject((Object) null);
        }
    }

    /* renamed from: c.q.b.b.p1$b0 */
    /* compiled from: MapMakerInternalMap */
    public interface C6069b0<K, V, E extends C6078i<K, V, E>> {
        /* renamed from: a */
        C6069b0<K, V, E> mo29734a(ReferenceQueue<V> referenceQueue, E e);

        void clear();

        V get();

        E getEntry();
    }

    /* renamed from: c.q.b.b.p1$c */
    /* compiled from: MapMakerInternalMap */
    public static abstract class C6070c<K, V, E extends C6078i<K, V, E>> implements C6078i<K, V, E> {

        /* renamed from: e */
        public final K f11665e;

        /* renamed from: l */
        public final int f11666l;

        /* renamed from: m */
        public final E f11667m;

        public C6070c(K k, int i, E e) {
            this.f11665e = k;
            this.f11666l = i;
            this.f11667m = e;
        }

        public int getHash() {
            return this.f11666l;
        }

        public K getKey() {
            return this.f11665e;
        }

        public E getNext() {
            return this.f11667m;
        }
    }

    /* renamed from: c.q.b.b.p1$c0 */
    /* compiled from: MapMakerInternalMap */
    public static final class C6071c0<K, V, E extends C6078i<K, V, E>> extends WeakReference<V> implements C6069b0<K, V, E> {

        /* renamed from: e */
        public final E f11668e;

        public C6071c0(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.f11668e = e;
        }

        /* renamed from: a */
        public C6069b0<K, V, E> mo29734a(ReferenceQueue<V> referenceQueue, E e) {
            return new C6071c0(referenceQueue, get(), e);
        }

        public E getEntry() {
            return this.f11668e;
        }
    }

    /* renamed from: c.q.b.b.p1$d */
    /* compiled from: MapMakerInternalMap */
    public static abstract class C6072d<K, V, E extends C6078i<K, V, E>> extends WeakReference<K> implements C6078i<K, V, E> {

        /* renamed from: e */
        public final int f11669e;

        /* renamed from: l */
        public final E f11670l;

        public C6072d(ReferenceQueue<K> referenceQueue, K k, int i, E e) {
            super(k, referenceQueue);
            this.f11669e = i;
            this.f11670l = e;
        }

        public int getHash() {
            return this.f11669e;
        }

        public K getKey() {
            return get();
        }

        public E getNext() {
            return this.f11670l;
        }
    }

    /* renamed from: c.q.b.b.p1$d0 */
    /* compiled from: MapMakerInternalMap */
    public final class C6073d0 extends C5978g<K, V> {

        /* renamed from: e */
        public final K f11671e;

        /* renamed from: l */
        public V f11672l;

        public C6073d0(K k, V v) {
            this.f11671e = k;
            this.f11672l = v;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f11671e.equals(entry.getKey()) || !this.f11672l.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f11671e;
        }

        public V getValue() {
            return this.f11672l;
        }

        public int hashCode() {
            return this.f11671e.hashCode() ^ this.f11672l.hashCode();
        }

        public V setValue(V v) {
            V put = C6065p1.this.put(this.f11671e, v);
            this.f11672l = v;
            return put;
        }
    }

    /* renamed from: c.q.b.b.p1$e */
    /* compiled from: MapMakerInternalMap */
    public static final class C6074e implements C6078i<Object, Object, C6074e> {
        public C6074e() {
            throw new AssertionError();
        }

        /* renamed from: a */
        public C6074e mo29747a() {
            throw new AssertionError();
        }

        public int getHash() {
            throw new AssertionError();
        }

        public Object getKey() {
            throw new AssertionError();
        }

        public /* bridge */ /* synthetic */ C6078i getNext() {
            mo29747a();
            throw null;
        }

        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* renamed from: c.q.b.b.p1$f */
    /* compiled from: MapMakerInternalMap */
    public final class C6075f extends C6065p1<K, V, E, S>.h<Map.Entry<K, V>> {
        public C6075f(C6065p1 p1Var) {
            super();
        }

        /* renamed from: f */
        public Map.Entry<K, V> next() {
            return mo29759c();
        }
    }

    /* renamed from: c.q.b.b.p1$g */
    /* compiled from: MapMakerInternalMap */
    public final class C6076g extends C6082m<Map.Entry<K, V>> {
        public C6076g() {
            super((C6066a) null);
        }

        public void clear() {
            C6065p1.this.clear();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean contains(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x000f
                return r1
            L_0x000f:
                c.q.b.b.p1 r2 = p040c.p200q.p353b.p355b.C6065p1.this
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L_0x0028
                c.q.b.b.p1 r2 = p040c.p200q.p353b.p355b.C6065p1.this
                com.google.common.base.Equivalence r2 = r2.mo29723n()
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.mo36448d(r4, r0)
                if (r4 == 0) goto L_0x0028
                r1 = 1
            L_0x0028:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p353b.p355b.C6065p1.C6076g.contains(java.lang.Object):boolean");
        }

        public boolean isEmpty() {
            return C6065p1.this.isEmpty();
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C6075f(C6065p1.this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 == 0) goto L_0x001b
                c.q.b.b.p1 r2 = p040c.p200q.p353b.p355b.C6065p1.this
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L_0x001b
                r1 = 1
            L_0x001b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p353b.p355b.C6065p1.C6076g.remove(java.lang.Object):boolean");
        }

        public int size() {
            return C6065p1.this.size();
        }
    }

    /* renamed from: c.q.b.b.p1$h */
    /* compiled from: MapMakerInternalMap */
    public abstract class C6077h<T> implements Iterator<T> {

        /* renamed from: e */
        public int f11675e;

        /* renamed from: l */
        public int f11676l = -1;

        /* renamed from: m */
        public C6083n<K, V, E, S> f11677m;

        /* renamed from: n */
        public AtomicReferenceArray<E> f11678n;

        /* renamed from: o */
        public E f11679o;

        /* renamed from: p */
        public C6065p1<K, V, E, S>.d0 f11680p;

        /* renamed from: q */
        public C6065p1<K, V, E, S>.d0 f11681q;

        public C6077h() {
            this.f11675e = C6065p1.this.f11653m.length - 1;
            mo29757a();
        }

        /* renamed from: a */
        public final void mo29757a() {
            this.f11680p = null;
            if (!mo29760d() && !mo29761e()) {
                while (true) {
                    int i = this.f11675e;
                    if (i >= 0) {
                        C6083n<K, V, E, S>[] nVarArr = C6065p1.this.f11653m;
                        this.f11675e = i - 1;
                        C6083n<K, V, E, S> nVar = nVarArr[i];
                        this.f11677m = nVar;
                        if (nVar.f11685l != 0) {
                            AtomicReferenceArray<E> atomicReferenceArray = this.f11677m.f11688o;
                            this.f11678n = atomicReferenceArray;
                            this.f11676l = atomicReferenceArray.length() - 1;
                            if (mo29761e()) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public boolean mo29758b(E e) {
            boolean z;
            try {
                Object key = e.getKey();
                Object d = C6065p1.this.mo29713d(e);
                if (d != null) {
                    this.f11680p = new C6073d0(key, d);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f11677m.mo29803s();
            }
        }

        /* renamed from: c */
        public C6065p1<K, V, E, S>.d0 mo29759c() {
            C6065p1<K, V, E, S>.d0 d0Var = this.f11680p;
            if (d0Var != null) {
                this.f11681q = d0Var;
                mo29757a();
                return this.f11681q;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: d */
        public boolean mo29760d() {
            E e = this.f11679o;
            if (e == null) {
                return false;
            }
            while (true) {
                this.f11679o = e.getNext();
                E e2 = this.f11679o;
                if (e2 == null) {
                    return false;
                }
                if (mo29758b(e2)) {
                    return true;
                }
                e = this.f11679o;
            }
        }

        /* renamed from: e */
        public boolean mo29761e() {
            while (true) {
                int i = this.f11676l;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f11678n;
                this.f11676l = i - 1;
                E e = (C6078i) atomicReferenceArray.get(i);
                this.f11679o = e;
                if (e != null && (mo29758b(e) || mo29760d())) {
                    return true;
                }
            }
        }

        public boolean hasNext() {
            return this.f11680p != null;
        }

        public void remove() {
            C6166v.m17279e(this.f11681q != null);
            C6065p1.this.remove(this.f11681q.getKey());
            this.f11681q = null;
        }
    }

    /* renamed from: c.q.b.b.p1$i */
    /* compiled from: MapMakerInternalMap */
    public interface C6078i<K, V, E extends C6078i<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    /* renamed from: c.q.b.b.p1$j */
    /* compiled from: MapMakerInternalMap */
    public interface C6079j<K, V, E extends C6078i<K, V, E>, S extends C6083n<K, V, E, S>> {
        /* renamed from: a */
        E mo29764a(S s, E e, E e2);

        /* renamed from: b */
        C6085p mo29765b();

        /* renamed from: c */
        C6085p mo29766c();

        /* renamed from: d */
        void mo29767d(S s, E e, V v);

        /* renamed from: e */
        S mo29768e(C6065p1<K, V, E, S> p1Var, int i, int i2);

        /* renamed from: f */
        E mo29769f(S s, K k, int i, E e);
    }

    /* renamed from: c.q.b.b.p1$k */
    /* compiled from: MapMakerInternalMap */
    public final class C6080k extends C6065p1<K, V, E, S>.h<K> {
        public C6080k(C6065p1 p1Var) {
            super();
        }

        public K next() {
            return mo29759c().getKey();
        }
    }

    /* renamed from: c.q.b.b.p1$l */
    /* compiled from: MapMakerInternalMap */
    public final class C6081l extends C6082m<K> {
        public C6081l() {
            super((C6066a) null);
        }

        public void clear() {
            C6065p1.this.clear();
        }

        public boolean contains(Object obj) {
            return C6065p1.this.containsKey(obj);
        }

        public boolean isEmpty() {
            return C6065p1.this.isEmpty();
        }

        public Iterator<K> iterator() {
            return new C6080k(C6065p1.this);
        }

        public boolean remove(Object obj) {
            return C6065p1.this.remove(obj) != null;
        }

        public int size() {
            return C6065p1.this.size();
        }
    }

    /* renamed from: c.q.b.b.p1$m */
    /* compiled from: MapMakerInternalMap */
    public static abstract class C6082m<E> extends AbstractSet<E> {
        public C6082m() {
        }

        public Object[] toArray() {
            return C6065p1.m17018l(this).toArray();
        }

        public /* synthetic */ C6082m(C6066a aVar) {
            this();
        }

        public <T> T[] toArray(T[] tArr) {
            return C6065p1.m17018l(this).toArray(tArr);
        }
    }

    /* renamed from: c.q.b.b.p1$n */
    /* compiled from: MapMakerInternalMap */
    public static abstract class C6083n<K, V, E extends C6078i<K, V, E>, S extends C6083n<K, V, E, S>> extends ReentrantLock {

        /* renamed from: e */
        public final C6065p1<K, V, E, S> f11684e;

        /* renamed from: l */
        public volatile int f11685l;

        /* renamed from: m */
        public int f11686m;

        /* renamed from: n */
        public int f11687n;

        /* renamed from: o */
        public volatile AtomicReferenceArray<E> f11688o;

        /* renamed from: p */
        public final int f11689p;

        /* renamed from: q */
        public final AtomicInteger f11690q = new AtomicInteger();

        public C6083n(C6065p1<K, V, E, S> p1Var, int i, int i2) {
            this.f11684e = p1Var;
            this.f11689p = i2;
            mo29799n(mo29802r(i));
        }

        /* renamed from: o */
        public static <K, V, E extends C6078i<K, V, E>> boolean m17050o(E e) {
            return e.getValue() == null;
        }

        /* renamed from: A */
        public E mo29779A(E e, E e2) {
            int i = this.f11685l;
            E next = e2.getNext();
            while (e != e2) {
                E d = mo29790d(e, next);
                if (d != null) {
                    next = d;
                } else {
                    i--;
                }
                e = e.getNext();
            }
            this.f11685l = i;
            return next;
        }

        /* renamed from: B */
        public V mo29780B(K k, int i, V v) {
            lock();
            try {
                mo29804t();
                AtomicReferenceArray<E> atomicReferenceArray = this.f11688o;
                int length = (atomicReferenceArray.length() - 1) & i;
                C6078i iVar = (C6078i) atomicReferenceArray.get(length);
                C6078i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.getHash() != i || key == null || !this.f11684e.f11655o.mo36448d(k, key)) {
                        iVar2 = iVar2.getNext();
                    } else {
                        V value = iVar2.getValue();
                        if (value == null) {
                            if (m17050o(iVar2)) {
                                this.f11686m++;
                                atomicReferenceArray.set(length, mo29779A(iVar, iVar2));
                                this.f11685l--;
                            }
                            return null;
                        }
                        this.f11686m++;
                        mo29785G(iVar2, v);
                        unlock();
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* renamed from: C */
        public boolean mo29781C(K k, int i, V v, V v2) {
            lock();
            try {
                mo29804t();
                AtomicReferenceArray<E> atomicReferenceArray = this.f11688o;
                int length = (atomicReferenceArray.length() - 1) & i;
                C6078i iVar = (C6078i) atomicReferenceArray.get(length);
                C6078i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.getHash() != i || key == null || !this.f11684e.f11655o.mo36448d(k, key)) {
                        iVar2 = iVar2.getNext();
                    } else {
                        Object value = iVar2.getValue();
                        if (value == null) {
                            if (m17050o(iVar2)) {
                                this.f11686m++;
                                atomicReferenceArray.set(length, mo29779A(iVar, iVar2));
                                this.f11685l--;
                            }
                            return false;
                        } else if (this.f11684e.mo29723n().mo36448d(v, value)) {
                            this.f11686m++;
                            mo29785G(iVar2, v2);
                            unlock();
                            return true;
                        } else {
                            unlock();
                            return false;
                        }
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* renamed from: D */
        public void mo29782D() {
            mo29783E();
        }

        /* renamed from: E */
        public void mo29783E() {
            if (tryLock()) {
                try {
                    mo29801q();
                    this.f11690q.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: F */
        public abstract S mo29784F();

        /* renamed from: G */
        public void mo29785G(E e, V v) {
            this.f11684e.f11656p.mo29767d(mo29784F(), e, v);
        }

        /* renamed from: H */
        public void mo29786H() {
            if (tryLock()) {
                try {
                    mo29801q();
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: a */
        public void mo29787a() {
            if (this.f11685l != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f11688o;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, (Object) null);
                    }
                    mo29800p();
                    this.f11690q.set(0);
                    this.f11686m++;
                    this.f11685l = 0;
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: b */
        public <T> void mo29788b(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        /* renamed from: c */
        public boolean mo29789c(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f11685l != 0) {
                    C6078i l = mo29797l(obj, i);
                    if (!(l == null || l.getValue() == null)) {
                        z = true;
                    }
                    return z;
                }
                mo29803s();
                return false;
            } finally {
                mo29803s();
            }
        }

        /* renamed from: d */
        public E mo29790d(E e, E e2) {
            return this.f11684e.f11656p.mo29764a(mo29784F(), e, e2);
        }

        /* renamed from: e */
        public void mo29791e(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll != null) {
                    this.f11684e.mo29717g((C6078i) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* renamed from: f */
        public void mo29792f(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll != null) {
                    this.f11684e.mo29719h((C6069b0) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* renamed from: g */
        public void mo29793g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f11688o;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.f11685l;
                AtomicReferenceArray<E> r = mo29802r(length << 1);
                this.f11687n = (r.length() * 3) / 4;
                int length2 = r.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    C6078i iVar = (C6078i) atomicReferenceArray.get(i2);
                    if (iVar != null) {
                        C6078i next = iVar.getNext();
                        int hash = iVar.getHash() & length2;
                        if (next == null) {
                            r.set(hash, iVar);
                        } else {
                            C6078i iVar2 = iVar;
                            while (next != null) {
                                int hash2 = next.getHash() & length2;
                                if (hash2 != hash) {
                                    iVar2 = next;
                                    hash = hash2;
                                }
                                next = next.getNext();
                            }
                            r.set(hash, iVar2);
                            while (iVar != iVar2) {
                                int hash3 = iVar.getHash() & length2;
                                C6078i d = mo29790d(iVar, (C6078i) r.get(hash3));
                                if (d != null) {
                                    r.set(hash3, d);
                                } else {
                                    i--;
                                }
                                iVar = iVar.getNext();
                            }
                        }
                    }
                }
                this.f11688o = r;
                this.f11685l = i;
            }
        }

        /* renamed from: h */
        public V mo29794h(Object obj, int i) {
            try {
                C6078i l = mo29797l(obj, i);
                if (l == null) {
                    return null;
                }
                V value = l.getValue();
                if (value == null) {
                    mo29786H();
                }
                mo29803s();
                return value;
            } finally {
                mo29803s();
            }
        }

        /* renamed from: i */
        public E mo29795i(Object obj, int i) {
            if (this.f11685l == 0) {
                return null;
            }
            for (E j = mo29796j(i); j != null; j = j.getNext()) {
                if (j.getHash() == i) {
                    Object key = j.getKey();
                    if (key == null) {
                        mo29786H();
                    } else if (this.f11684e.f11655o.mo36448d(obj, key)) {
                        return j;
                    }
                }
            }
            return null;
        }

        /* renamed from: j */
        public E mo29796j(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.f11688o;
            return (C6078i) atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* renamed from: l */
        public E mo29797l(Object obj, int i) {
            return mo29795i(obj, i);
        }

        /* renamed from: m */
        public V mo29798m(E e) {
            if (e.getKey() == null) {
                mo29786H();
                return null;
            }
            V value = e.getValue();
            if (value != null) {
                return value;
            }
            mo29786H();
            return null;
        }

        /* renamed from: n */
        public void mo29799n(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f11687n = length;
            if (length == this.f11689p) {
                this.f11687n = length + 1;
            }
            this.f11688o = atomicReferenceArray;
        }

        /* renamed from: p */
        public void mo29800p() {
        }

        /* renamed from: q */
        public void mo29801q() {
        }

        /* renamed from: r */
        public AtomicReferenceArray<E> mo29802r(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* renamed from: s */
        public void mo29803s() {
            if ((this.f11690q.incrementAndGet() & 63) == 0) {
                mo29782D();
            }
        }

        /* renamed from: t */
        public void mo29804t() {
            mo29783E();
        }

        /* renamed from: u */
        public V mo29805u(K k, int i, V v, boolean z) {
            lock();
            try {
                mo29804t();
                int i2 = this.f11685l + 1;
                if (i2 > this.f11687n) {
                    mo29793g();
                    i2 = this.f11685l + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f11688o;
                int length = (atomicReferenceArray.length() - 1) & i;
                C6078i iVar = (C6078i) atomicReferenceArray.get(length);
                C6078i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.getHash() != i || key == null || !this.f11684e.f11655o.mo36448d(k, key)) {
                        iVar2 = iVar2.getNext();
                    } else {
                        V value = iVar2.getValue();
                        if (value == null) {
                            this.f11686m++;
                            mo29785G(iVar2, v);
                            this.f11685l = this.f11685l;
                            return null;
                        } else if (z) {
                            unlock();
                            return value;
                        } else {
                            this.f11686m++;
                            mo29785G(iVar2, v);
                            unlock();
                            return value;
                        }
                    }
                }
                this.f11686m++;
                E f = this.f11684e.f11656p.mo29769f(mo29784F(), k, i, iVar);
                mo29785G(f, v);
                atomicReferenceArray.set(length, f);
                this.f11685l = i2;
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* renamed from: w */
        public boolean mo29806w(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f11688o;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = (C6078i) atomicReferenceArray.get(length);
                for (E e3 = e2; e3 != null; e3 = e3.getNext()) {
                    if (e3 == e) {
                        this.f11686m++;
                        atomicReferenceArray.set(length, mo29779A(e2, e3));
                        this.f11685l--;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* renamed from: x */
        public boolean mo29807x(K k, int i, C6069b0<K, V, E> b0Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f11688o;
                int length = (atomicReferenceArray.length() - 1) & i;
                C6078i iVar = (C6078i) atomicReferenceArray.get(length);
                C6078i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.getHash() != i || key == null || !this.f11684e.f11655o.mo36448d(k, key)) {
                        iVar2 = iVar2.getNext();
                    } else if (((C6067a0) iVar2).getValueReference() == b0Var) {
                        this.f11686m++;
                        atomicReferenceArray.set(length, mo29779A(iVar, iVar2));
                        this.f11685l--;
                        return true;
                    } else {
                        unlock();
                        return false;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* renamed from: y */
        public V mo29808y(Object obj, int i) {
            lock();
            try {
                mo29804t();
                AtomicReferenceArray<E> atomicReferenceArray = this.f11688o;
                int length = (atomicReferenceArray.length() - 1) & i;
                C6078i iVar = (C6078i) atomicReferenceArray.get(length);
                C6078i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.getHash() != i || key == null || !this.f11684e.f11655o.mo36448d(obj, key)) {
                        iVar2 = iVar2.getNext();
                    } else {
                        V value = iVar2.getValue();
                        if (value == null) {
                            if (!m17050o(iVar2)) {
                                unlock();
                                return null;
                            }
                        }
                        this.f11686m++;
                        atomicReferenceArray.set(length, mo29779A(iVar, iVar2));
                        this.f11685l--;
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* renamed from: z */
        public boolean mo29809z(Object obj, int i, Object obj2) {
            lock();
            try {
                mo29804t();
                AtomicReferenceArray<E> atomicReferenceArray = this.f11688o;
                int length = (atomicReferenceArray.length() - 1) & i;
                C6078i iVar = (C6078i) atomicReferenceArray.get(length);
                C6078i iVar2 = iVar;
                while (true) {
                    boolean z = false;
                    if (iVar2 != null) {
                        Object key = iVar2.getKey();
                        if (iVar2.getHash() != i || key == null || !this.f11684e.f11655o.mo36448d(obj, key)) {
                            iVar2 = iVar2.getNext();
                        } else {
                            if (this.f11684e.mo29723n().mo36448d(obj2, iVar2.getValue())) {
                                z = true;
                            } else if (!m17050o(iVar2)) {
                                unlock();
                                return false;
                            }
                            this.f11686m++;
                            atomicReferenceArray.set(length, mo29779A(iVar, iVar2));
                            this.f11685l--;
                            return z;
                        }
                    } else {
                        unlock();
                        return false;
                    }
                }
            } finally {
                unlock();
            }
        }
    }

    /* renamed from: c.q.b.b.p1$o */
    /* compiled from: MapMakerInternalMap */
    public static final class C6084o<K, V> extends C6068b<K, V> {
        public static final long serialVersionUID = 3;

        public C6084o(C6085p pVar, C6085p pVar2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(pVar, pVar2, equivalence, equivalence2, i, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.f11664o = mo29742g(objectInputStream).mo29694i();
            mo29741f(objectInputStream);
        }

        private Object readResolve() {
            return this.f11664o;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            mo29743l(objectOutputStream);
        }
    }

    /* renamed from: c.q.b.b.p1$p */
    /* compiled from: MapMakerInternalMap */
    public enum C6085p {
        STRONG {
            /* renamed from: c */
            public Equivalence<Object> mo29810c() {
                return Equivalence.m22050c();
            }
        },
        WEAK {
            /* renamed from: c */
            public Equivalence<Object> mo29810c() {
                return Equivalence.m22051f();
            }
        };

        /* renamed from: c */
        public abstract Equivalence<Object> mo29810c();
    }

    /* renamed from: c.q.b.b.p1$q */
    /* compiled from: MapMakerInternalMap */
    public static final class C6088q<K, V> extends C6070c<K, V, C6088q<K, V>> implements Object<K, V, C6088q<K, V>> {

        /* renamed from: n */
        public volatile V f11694n = null;

        /* renamed from: c.q.b.b.p1$q$a */
        /* compiled from: MapMakerInternalMap */
        public static final class C6089a<K, V> implements C6079j<K, V, C6088q<K, V>, C6090r<K, V>> {

            /* renamed from: a */
            public static final C6089a<?, ?> f11695a = new C6089a<>();

            /* renamed from: h */
            public static <K, V> C6089a<K, V> m17087h() {
                return f11695a;
            }

            /* renamed from: b */
            public C6085p mo29765b() {
                return C6085p.STRONG;
            }

            /* renamed from: c */
            public C6085p mo29766c() {
                return C6085p.STRONG;
            }

            /* renamed from: g */
            public C6088q<K, V> mo29764a(C6090r<K, V> rVar, C6088q<K, V> qVar, C6088q<K, V> qVar2) {
                return qVar.mo29811a(qVar2);
            }

            /* renamed from: i */
            public C6088q<K, V> mo29769f(C6090r<K, V> rVar, K k, int i, C6088q<K, V> qVar) {
                return new C6088q<>(k, i, qVar);
            }

            /* renamed from: j */
            public C6090r<K, V> mo29768e(C6065p1<K, V, C6088q<K, V>, C6090r<K, V>> p1Var, int i, int i2) {
                return new C6090r<>(p1Var, i, i2);
            }

            /* renamed from: k */
            public void mo29767d(C6090r<K, V> rVar, C6088q<K, V> qVar, V v) {
                qVar.mo29812b(v);
            }
        }

        public C6088q(K k, int i, C6088q<K, V> qVar) {
            super(k, i, qVar);
        }

        /* renamed from: a */
        public C6088q<K, V> mo29811a(C6088q<K, V> qVar) {
            C6088q<K, V> qVar2 = new C6088q<>(this.f11665e, this.f11666l, qVar);
            qVar2.f11694n = this.f11694n;
            return qVar2;
        }

        /* renamed from: b */
        public void mo29812b(V v) {
            this.f11694n = v;
        }

        public V getValue() {
            return this.f11694n;
        }
    }

    /* renamed from: c.q.b.b.p1$r */
    /* compiled from: MapMakerInternalMap */
    public static final class C6090r<K, V> extends C6083n<K, V, C6088q<K, V>, C6090r<K, V>> {
        public C6090r(C6065p1<K, V, C6088q<K, V>, C6090r<K, V>> p1Var, int i, int i2) {
            super(p1Var, i, i2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ C6083n mo29784F() {
            mo29817I();
            return this;
        }

        /* renamed from: I */
        public C6090r<K, V> mo29817I() {
            return this;
        }
    }

    /* renamed from: c.q.b.b.p1$s */
    /* compiled from: MapMakerInternalMap */
    public static final class C6091s<K, V> extends C6070c<K, V, C6091s<K, V>> implements C6067a0<K, V, C6091s<K, V>> {

        /* renamed from: n */
        public volatile C6069b0<K, V, C6091s<K, V>> f11696n = C6065p1.m17019m();

        /* renamed from: c.q.b.b.p1$s$a */
        /* compiled from: MapMakerInternalMap */
        public static final class C6092a<K, V> implements C6079j<K, V, C6091s<K, V>, C6093t<K, V>> {

            /* renamed from: a */
            public static final C6092a<?, ?> f11697a = new C6092a<>();

            /* renamed from: h */
            public static <K, V> C6092a<K, V> m17102h() {
                return f11697a;
            }

            /* renamed from: b */
            public C6085p mo29765b() {
                return C6085p.STRONG;
            }

            /* renamed from: c */
            public C6085p mo29766c() {
                return C6085p.WEAK;
            }

            /* renamed from: g */
            public C6091s<K, V> mo29764a(C6093t<K, V> tVar, C6091s<K, V> sVar, C6091s<K, V> sVar2) {
                if (C6083n.m17050o(sVar)) {
                    return null;
                }
                return sVar.mo29818a(tVar.f11698r, sVar2);
            }

            /* renamed from: i */
            public C6091s<K, V> mo29769f(C6093t<K, V> tVar, K k, int i, C6091s<K, V> sVar) {
                return new C6091s<>(k, i, sVar);
            }

            /* renamed from: j */
            public C6093t<K, V> mo29768e(C6065p1<K, V, C6091s<K, V>, C6093t<K, V>> p1Var, int i, int i2) {
                return new C6093t<>(p1Var, i, i2);
            }

            /* renamed from: k */
            public void mo29767d(C6093t<K, V> tVar, C6091s<K, V> sVar, V v) {
                sVar.mo29819b(v, tVar.f11698r);
            }
        }

        public C6091s(K k, int i, C6091s<K, V> sVar) {
            super(k, i, sVar);
        }

        /* renamed from: a */
        public C6091s<K, V> mo29818a(ReferenceQueue<V> referenceQueue, C6091s<K, V> sVar) {
            C6091s<K, V> sVar2 = new C6091s<>(this.f11665e, this.f11666l, sVar);
            sVar2.f11696n = this.f11696n.mo29734a(referenceQueue, sVar2);
            return sVar2;
        }

        /* renamed from: b */
        public void mo29819b(V v, ReferenceQueue<V> referenceQueue) {
            C6069b0<K, V, C6091s<K, V>> b0Var = this.f11696n;
            this.f11696n = new C6071c0(referenceQueue, v, this);
            b0Var.clear();
        }

        public V getValue() {
            return this.f11696n.get();
        }

        public C6069b0<K, V, C6091s<K, V>> getValueReference() {
            return this.f11696n;
        }
    }

    /* renamed from: c.q.b.b.p1$t */
    /* compiled from: MapMakerInternalMap */
    public static final class C6093t<K, V> extends C6083n<K, V, C6091s<K, V>, C6093t<K, V>> {

        /* renamed from: r */
        public final ReferenceQueue<V> f11698r = new ReferenceQueue<>();

        public C6093t(C6065p1<K, V, C6091s<K, V>, C6093t<K, V>> p1Var, int i, int i2) {
            super(p1Var, i, i2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ C6083n mo29784F() {
            mo29824J();
            return this;
        }

        /* renamed from: J */
        public C6093t<K, V> mo29824J() {
            return this;
        }

        /* renamed from: p */
        public void mo29800p() {
            mo29788b(this.f11698r);
        }

        /* renamed from: q */
        public void mo29801q() {
            mo29792f(this.f11698r);
        }
    }

    /* renamed from: c.q.b.b.p1$u */
    /* compiled from: MapMakerInternalMap */
    public final class C6094u extends C6065p1<K, V, E, S>.h<V> {
        public C6094u(C6065p1 p1Var) {
            super();
        }

        public V next() {
            return mo29759c().getValue();
        }
    }

    /* renamed from: c.q.b.b.p1$v */
    /* compiled from: MapMakerInternalMap */
    public final class C6095v extends AbstractCollection<V> {
        public C6095v() {
        }

        public void clear() {
            C6065p1.this.clear();
        }

        public boolean contains(Object obj) {
            return C6065p1.this.containsValue(obj);
        }

        public boolean isEmpty() {
            return C6065p1.this.isEmpty();
        }

        public Iterator<V> iterator() {
            return new C6094u(C6065p1.this);
        }

        public int size() {
            return C6065p1.this.size();
        }

        public Object[] toArray() {
            return C6065p1.m17018l(this).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return C6065p1.m17018l(this).toArray(tArr);
        }
    }

    /* renamed from: c.q.b.b.p1$w */
    /* compiled from: MapMakerInternalMap */
    public static final class C6096w<K, V> extends C6072d<K, V, C6096w<K, V>> implements Object<K, V, C6096w<K, V>> {

        /* renamed from: m */
        public volatile V f11700m = null;

        /* renamed from: c.q.b.b.p1$w$a */
        /* compiled from: MapMakerInternalMap */
        public static final class C6097a<K, V> implements C6079j<K, V, C6096w<K, V>, C6098x<K, V>> {

            /* renamed from: a */
            public static final C6097a<?, ?> f11701a = new C6097a<>();

            /* renamed from: h */
            public static <K, V> C6097a<K, V> m17120h() {
                return f11701a;
            }

            /* renamed from: b */
            public C6085p mo29765b() {
                return C6085p.WEAK;
            }

            /* renamed from: c */
            public C6085p mo29766c() {
                return C6085p.STRONG;
            }

            /* renamed from: g */
            public C6096w<K, V> mo29764a(C6098x<K, V> xVar, C6096w<K, V> wVar, C6096w<K, V> wVar2) {
                if (wVar.getKey() == null) {
                    return null;
                }
                return wVar.mo29833a(xVar.f11702r, wVar2);
            }

            /* renamed from: i */
            public C6096w<K, V> mo29769f(C6098x<K, V> xVar, K k, int i, C6096w<K, V> wVar) {
                return new C6096w<>(xVar.f11702r, k, i, wVar);
            }

            /* renamed from: j */
            public C6098x<K, V> mo29768e(C6065p1<K, V, C6096w<K, V>, C6098x<K, V>> p1Var, int i, int i2) {
                return new C6098x<>(p1Var, i, i2);
            }

            /* renamed from: k */
            public void mo29767d(C6098x<K, V> xVar, C6096w<K, V> wVar, V v) {
                wVar.mo29834b(v);
            }
        }

        public C6096w(ReferenceQueue<K> referenceQueue, K k, int i, C6096w<K, V> wVar) {
            super(referenceQueue, k, i, wVar);
        }

        /* renamed from: a */
        public C6096w<K, V> mo29833a(ReferenceQueue<K> referenceQueue, C6096w<K, V> wVar) {
            C6096w<K, V> wVar2 = new C6096w<>(referenceQueue, getKey(), this.f11669e, wVar);
            wVar2.mo29834b(this.f11700m);
            return wVar2;
        }

        /* renamed from: b */
        public void mo29834b(V v) {
            this.f11700m = v;
        }

        public V getValue() {
            return this.f11700m;
        }
    }

    /* renamed from: c.q.b.b.p1$x */
    /* compiled from: MapMakerInternalMap */
    public static final class C6098x<K, V> extends C6083n<K, V, C6096w<K, V>, C6098x<K, V>> {

        /* renamed from: r */
        public final ReferenceQueue<K> f11702r = new ReferenceQueue<>();

        public C6098x(C6065p1<K, V, C6096w<K, V>, C6098x<K, V>> p1Var, int i, int i2) {
            super(p1Var, i, i2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ C6083n mo29784F() {
            mo29839J();
            return this;
        }

        /* renamed from: J */
        public C6098x<K, V> mo29839J() {
            return this;
        }

        /* renamed from: p */
        public void mo29800p() {
            mo29788b(this.f11702r);
        }

        /* renamed from: q */
        public void mo29801q() {
            mo29791e(this.f11702r);
        }
    }

    /* renamed from: c.q.b.b.p1$y */
    /* compiled from: MapMakerInternalMap */
    public static final class C6099y<K, V> extends C6072d<K, V, C6099y<K, V>> implements C6067a0<K, V, C6099y<K, V>> {

        /* renamed from: m */
        public volatile C6069b0<K, V, C6099y<K, V>> f11703m = C6065p1.m17019m();

        /* renamed from: c.q.b.b.p1$y$a */
        /* compiled from: MapMakerInternalMap */
        public static final class C6100a<K, V> implements C6079j<K, V, C6099y<K, V>, C6101z<K, V>> {

            /* renamed from: a */
            public static final C6100a<?, ?> f11704a = new C6100a<>();

            /* renamed from: h */
            public static <K, V> C6100a<K, V> m17138h() {
                return f11704a;
            }

            /* renamed from: b */
            public C6085p mo29765b() {
                return C6085p.WEAK;
            }

            /* renamed from: c */
            public C6085p mo29766c() {
                return C6085p.WEAK;
            }

            /* renamed from: g */
            public C6099y<K, V> mo29764a(C6101z<K, V> zVar, C6099y<K, V> yVar, C6099y<K, V> yVar2) {
                if (yVar.getKey() != null && !C6083n.m17050o(yVar)) {
                    return yVar.mo29840a(zVar.f11705r, zVar.f11706s, yVar2);
                }
                return null;
            }

            /* renamed from: i */
            public C6099y<K, V> mo29769f(C6101z<K, V> zVar, K k, int i, C6099y<K, V> yVar) {
                return new C6099y<>(zVar.f11705r, k, i, yVar);
            }

            /* renamed from: j */
            public C6101z<K, V> mo29768e(C6065p1<K, V, C6099y<K, V>, C6101z<K, V>> p1Var, int i, int i2) {
                return new C6101z<>(p1Var, i, i2);
            }

            /* renamed from: k */
            public void mo29767d(C6101z<K, V> zVar, C6099y<K, V> yVar, V v) {
                yVar.mo29841b(v, zVar.f11706s);
            }
        }

        public C6099y(ReferenceQueue<K> referenceQueue, K k, int i, C6099y<K, V> yVar) {
            super(referenceQueue, k, i, yVar);
        }

        /* renamed from: a */
        public C6099y<K, V> mo29840a(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, C6099y<K, V> yVar) {
            C6099y<K, V> yVar2 = new C6099y<>(referenceQueue, getKey(), this.f11669e, yVar);
            yVar2.f11703m = this.f11703m.mo29734a(referenceQueue2, yVar2);
            return yVar2;
        }

        /* renamed from: b */
        public void mo29841b(V v, ReferenceQueue<V> referenceQueue) {
            C6069b0<K, V, C6099y<K, V>> b0Var = this.f11703m;
            this.f11703m = new C6071c0(referenceQueue, v, this);
            b0Var.clear();
        }

        public V getValue() {
            return this.f11703m.get();
        }

        public C6069b0<K, V, C6099y<K, V>> getValueReference() {
            return this.f11703m;
        }
    }

    /* renamed from: c.q.b.b.p1$z */
    /* compiled from: MapMakerInternalMap */
    public static final class C6101z<K, V> extends C6083n<K, V, C6099y<K, V>, C6101z<K, V>> {

        /* renamed from: r */
        public final ReferenceQueue<K> f11705r = new ReferenceQueue<>();

        /* renamed from: s */
        public final ReferenceQueue<V> f11706s = new ReferenceQueue<>();

        public C6101z(C6065p1<K, V, C6099y<K, V>, C6101z<K, V>> p1Var, int i, int i2) {
            super(p1Var, i, i2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ C6083n mo29784F() {
            mo29846K();
            return this;
        }

        /* renamed from: K */
        public C6101z<K, V> mo29846K() {
            return this;
        }

        /* renamed from: p */
        public void mo29800p() {
            mo29788b(this.f11705r);
        }

        /* renamed from: q */
        public void mo29801q() {
            mo29791e(this.f11705r);
            mo29792f(this.f11706s);
        }
    }

    public C6065p1(C6061o1 o1Var, C6079j<K, V, E, S> jVar) {
        this.f11654n = Math.min(o1Var.mo29687b(), 65536);
        this.f11655o = o1Var.mo29689d();
        this.f11656p = jVar;
        int min = Math.min(o1Var.mo29688c(), 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.f11654n) {
            i3++;
            i4 <<= 1;
        }
        this.f11652l = 32 - i3;
        this.f11651e = i4 - 1;
        this.f11653m = mo29716f(i4);
        int i5 = min / i4;
        while (i2 < (i4 * i5 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        while (true) {
            C6083n<K, V, E, S>[] nVarArr = this.f11653m;
            if (i < nVarArr.length) {
                nVarArr[i] = mo29709c(i2, -1);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static <K, V> C6065p1<K, V, ? extends C6078i<K, V, ?>, ?> m17016b(C6061o1 o1Var) {
        if (o1Var.mo29690e() == C6085p.STRONG && o1Var.mo29691f() == C6085p.STRONG) {
            return new C6065p1<>(o1Var, C6088q.C6089a.m17087h());
        }
        if (o1Var.mo29690e() == C6085p.STRONG && o1Var.mo29691f() == C6085p.WEAK) {
            return new C6065p1<>(o1Var, C6091s.C6092a.m17102h());
        }
        if (o1Var.mo29690e() == C6085p.WEAK && o1Var.mo29691f() == C6085p.STRONG) {
            return new C6065p1<>(o1Var, C6096w.C6097a.m17120h());
        }
        if (o1Var.mo29690e() == C6085p.WEAK && o1Var.mo29691f() == C6085p.WEAK) {
            return new C6065p1<>(o1Var, C6099y.C6100a.m17138h());
        }
        throw new AssertionError();
    }

    /* renamed from: i */
    public static int m17017i(int i) {
        int i2 = i + ((i << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* renamed from: l */
    public static <E> ArrayList<E> m17018l(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C6028l1.m16929a(arrayList, collection.iterator());
        return arrayList;
    }

    /* renamed from: m */
    public static <K, V, E extends C6078i<K, V, E>> C6069b0<K, V, E> m17019m() {
        return f11650t;
    }

    /* renamed from: c */
    public C6083n<K, V, E, S> mo29709c(int i, int i2) {
        return this.f11656p.mo29768e(this, i, i2);
    }

    public void clear() {
        for (C6083n<K, V, E, S> a : this.f11653m) {
            a.mo29787a();
        }
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int e = mo29714e(obj);
        return mo29721j(e).mo29789c(obj, e);
    }

    public boolean containsValue(Object obj) {
        Object obj2 = obj;
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        C6083n<K, V, E, S>[] nVarArr = this.f11653m;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            int length = nVarArr.length;
            int i2 = z;
            while (i2 < length) {
                C6083n<K, V, E, S> nVar = nVarArr[i2];
                int i3 = nVar.f11685l;
                AtomicReferenceArray<E> atomicReferenceArray = nVar.f11688o;
                for (int i4 = z; i4 < atomicReferenceArray.length(); i4++) {
                    for (C6078i iVar = (C6078i) atomicReferenceArray.get(i4); iVar != null; iVar = iVar.getNext()) {
                        V m = nVar.mo29798m(iVar);
                        if (m != null && mo29723n().mo36448d(obj2, m)) {
                            return true;
                        }
                    }
                }
                j2 += (long) nVar.f11686m;
                i2++;
                z = false;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            z = false;
        }
        return z;
    }

    /* renamed from: d */
    public V mo29713d(E e) {
        if (e.getKey() == null) {
            return null;
        }
        return e.getValue();
    }

    /* renamed from: e */
    public int mo29714e(Object obj) {
        return m17017i(this.f11655o.mo36449e(obj));
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f11659s;
        if (set != null) {
            return set;
        }
        C6076g gVar = new C6076g();
        this.f11659s = gVar;
        return gVar;
    }

    /* renamed from: f */
    public final C6083n<K, V, E, S>[] mo29716f(int i) {
        return new C6083n[i];
    }

    /* renamed from: g */
    public void mo29717g(E e) {
        int hash = e.getHash();
        mo29721j(hash).mo29806w(e, hash);
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int e = mo29714e(obj);
        return mo29721j(e).mo29794h(obj, e);
    }

    /* renamed from: h */
    public void mo29719h(C6069b0<K, V, E> b0Var) {
        E entry = b0Var.getEntry();
        int hash = entry.getHash();
        mo29721j(hash).mo29807x(entry.getKey(), hash, b0Var);
    }

    public boolean isEmpty() {
        C6083n<K, V, E, S>[] nVarArr = this.f11653m;
        long j = 0;
        for (int i = 0; i < nVarArr.length; i++) {
            if (nVarArr[i].f11685l != 0) {
                return false;
            }
            j += (long) nVarArr[i].f11686m;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            if (nVarArr[i2].f11685l != 0) {
                return false;
            }
            j -= (long) nVarArr[i2].f11686m;
        }
        if (j != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public C6083n<K, V, E, S> mo29721j(int i) {
        return this.f11653m[(i >>> this.f11652l) & this.f11651e];
    }

    public Set<K> keySet() {
        Set<K> set = this.f11657q;
        if (set != null) {
            return set;
        }
        C6081l lVar = new C6081l();
        this.f11657q = lVar;
        return lVar;
    }

    /* renamed from: n */
    public Equivalence<Object> mo29723n() {
        return this.f11656p.mo29766c().mo29810c();
    }

    public V put(K k, V v) {
        C5850m.m16594o(k);
        C5850m.m16594o(v);
        int e = mo29714e(k);
        return mo29721j(e).mo29805u(k, e, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public V putIfAbsent(K k, V v) {
        C5850m.m16594o(k);
        C5850m.m16594o(v);
        int e = mo29714e(k);
        return mo29721j(e).mo29805u(k, e, v, true);
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int e = mo29714e(obj);
        return mo29721j(e).mo29808y(obj, e);
    }

    public boolean replace(K k, V v, V v2) {
        C5850m.m16594o(k);
        C5850m.m16594o(v2);
        if (v == null) {
            return false;
        }
        int e = mo29714e(k);
        return mo29721j(e).mo29781C(k, e, v, v2);
    }

    public int size() {
        C6083n<K, V, E, S>[] nVarArr = this.f11653m;
        long j = 0;
        for (C6083n<K, V, E, S> nVar : nVarArr) {
            j += (long) nVar.f11685l;
        }
        return C6250c.m17574h(j);
    }

    public Collection<V> values() {
        Collection<V> collection = this.f11658r;
        if (collection != null) {
            return collection;
        }
        C6095v vVar = new C6095v();
        this.f11658r = vVar;
        return vVar;
    }

    public Object writeReplace() {
        return new C6084o(this.f11656p.mo29765b(), this.f11656p.mo29766c(), this.f11655o, this.f11656p.mo29766c().mo29810c(), this.f11654n, this);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int e = mo29714e(obj);
        return mo29721j(e).mo29809z(obj, e, obj2);
    }

    public V replace(K k, V v) {
        C5850m.m16594o(k);
        C5850m.m16594o(v);
        int e = mo29714e(k);
        return mo29721j(e).mo29780B(k, e, v);
    }
}
