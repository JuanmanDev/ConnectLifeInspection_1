package p040c.p200q.p353b.p355b;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C6153t1;
import p040c.p200q.p353b.p358e.C6250c;

/* renamed from: c.q.b.b.f */
/* compiled from: AbstractMapBasedMultiset */
public abstract class C5966f<E> extends C5992i<E> implements Serializable {
    public static final long serialVersionUID = 0;
    public transient C6184x1<E> backingMap;
    public transient long size;

    /* renamed from: c.q.b.b.f$a */
    /* compiled from: AbstractMapBasedMultiset */
    public class C5967a extends C5966f<E>.c<E> {
        public C5967a() {
            super();
        }

        /* renamed from: b */
        public E mo29408b(int i) {
            return C5966f.this.backingMap.mo30110i(i);
        }
    }

    /* renamed from: c.q.b.b.f$b */
    /* compiled from: AbstractMapBasedMultiset */
    public class C5968b extends C5966f<E>.c<C6153t1.C6154a<E>> {
        public C5968b() {
            super();
        }

        /* renamed from: c */
        public C6153t1.C6154a<E> mo29408b(int i) {
            return C5966f.this.backingMap.mo30109g(i);
        }
    }

    /* renamed from: c.q.b.b.f$c */
    /* compiled from: AbstractMapBasedMultiset */
    public abstract class C5969c<T> implements Iterator<T> {

        /* renamed from: e */
        public int f11524e = C5966f.this.backingMap.mo30107e();

        /* renamed from: l */
        public int f11525l = -1;

        /* renamed from: m */
        public int f11526m = C5966f.this.backingMap.f11788d;

        public C5969c() {
        }

        /* renamed from: a */
        public final void mo29410a() {
            if (C5966f.this.backingMap.f11788d != this.f11526m) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: b */
        public abstract T mo29408b(int i);

        public boolean hasNext() {
            mo29410a();
            return this.f11524e >= 0;
        }

        public T next() {
            if (hasNext()) {
                T b = mo29408b(this.f11524e);
                int i = this.f11524e;
                this.f11525l = i;
                this.f11524e = C5966f.this.backingMap.mo30117s(i);
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            mo29410a();
            C6166v.m17279e(this.f11525l != -1);
            C5966f fVar = C5966f.this;
            fVar.size -= (long) fVar.backingMap.mo30122x(this.f11525l);
            this.f11524e = C5966f.this.backingMap.mo30118t(this.f11524e, this.f11525l);
            this.f11525l = -1;
            this.f11526m = C5966f.this.backingMap.f11788d;
        }
    }

    public C5966f(int i) {
        init(i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int h = C6131q2.m17228h(objectInputStream);
        init(3);
        C6131q2.m17227g(this, objectInputStream, h);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C6131q2.m17231k(this, objectOutputStream);
    }

    public final int add(E e, int i) {
        if (i == 0) {
            return count(e);
        }
        boolean z = true;
        C5850m.m16585f(i > 0, "occurrences cannot be negative: %s", i);
        int m = this.backingMap.mo30113m(e);
        if (m == -1) {
            this.backingMap.mo30119u(e, i);
            this.size += (long) i;
            return 0;
        }
        int k = this.backingMap.mo30111k(m);
        long j = (long) i;
        long j2 = ((long) k) + j;
        if (j2 > 2147483647L) {
            z = false;
        }
        C5850m.m16587h(z, "too many occurrences: %s", j2);
        this.backingMap.mo30103B(m, (int) j2);
        this.size += j;
        return k;
    }

    public void addTo(C6153t1<? super E> t1Var) {
        C5850m.m16594o(t1Var);
        int e = this.backingMap.mo30107e();
        while (e >= 0) {
            t1Var.add(this.backingMap.mo30110i(e), this.backingMap.mo30111k(e));
            e = this.backingMap.mo30117s(e);
        }
    }

    public final void clear() {
        this.backingMap.mo30105a();
        this.size = 0;
    }

    public final int count(Object obj) {
        return this.backingMap.mo30108f(obj);
    }

    public final int distinctElements() {
        return this.backingMap.mo30104C();
    }

    public final Iterator<E> elementIterator() {
        return new C5967a();
    }

    public final Iterator<C6153t1.C6154a<E>> entryIterator() {
        return new C5968b();
    }

    public abstract void init(int i);

    public final Iterator<E> iterator() {
        return C6158u1.m17265i(this);
    }

    public final int remove(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        C5850m.m16585f(i > 0, "occurrences cannot be negative: %s", i);
        int m = this.backingMap.mo30113m(obj);
        if (m == -1) {
            return 0;
        }
        int k = this.backingMap.mo30111k(m);
        if (k > i) {
            this.backingMap.mo30103B(m, k - i);
        } else {
            this.backingMap.mo30122x(m);
            i = k;
        }
        this.size -= (long) i;
        return k;
    }

    public final int setCount(E e, int i) {
        C6166v.m17276b(i, "count");
        C6184x1<E> x1Var = this.backingMap;
        int v = i == 0 ? x1Var.mo30120v(e) : x1Var.mo30119u(e, i);
        this.size += (long) (i - v);
        return v;
    }

    public final int size() {
        return C6250c.m17574h(this.size);
    }

    public final boolean setCount(E e, int i, int i2) {
        C6166v.m17276b(i, "oldCount");
        C6166v.m17276b(i2, "newCount");
        int m = this.backingMap.mo30113m(e);
        if (m == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.backingMap.mo30119u(e, i2);
                this.size += (long) i2;
            }
            return true;
        } else if (this.backingMap.mo30111k(m) != i) {
            return false;
        } else {
            if (i2 == 0) {
                this.backingMap.mo30122x(m);
                this.size -= (long) i;
            } else {
                this.backingMap.mo30103B(m, i2);
                this.size += (long) (i2 - i);
            }
            return true;
        }
    }
}
