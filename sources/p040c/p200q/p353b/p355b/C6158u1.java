package p040c.p200q.p353b.p355b;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C6148s2;
import p040c.p200q.p353b.p355b.C6153t1;

/* renamed from: c.q.b.b.u1 */
/* compiled from: Multisets */
public final class C6158u1 {

    /* renamed from: c.q.b.b.u1$a */
    /* compiled from: Multisets */
    public static class C6159a extends C5977f3<C6153t1.C6154a<E>, E> {
        public C6159a(Iterator it) {
            super(it);
        }

        /* renamed from: b */
        public E mo29448a(C6153t1.C6154a<E> aVar) {
            return aVar.mo29977a();
        }
    }

    /* renamed from: c.q.b.b.u1$b */
    /* compiled from: Multisets */
    public static abstract class C6160b<E> implements C6153t1.C6154a<E> {
        public boolean equals(Object obj) {
            if (!(obj instanceof C6153t1.C6154a)) {
                return false;
            }
            C6153t1.C6154a aVar = (C6153t1.C6154a) obj;
            if (getCount() != aVar.getCount() || !C5845j.m16576a(mo29977a(), aVar.mo29977a())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            Object a = mo29977a();
            if (a == null) {
                i = 0;
            } else {
                i = a.hashCode();
            }
            return i ^ getCount();
        }

        public String toString() {
            String valueOf = String.valueOf(mo29977a());
            int count = getCount();
            if (count == 1) {
                return valueOf;
            }
            return valueOf + " x " + count;
        }
    }

    /* renamed from: c.q.b.b.u1$c */
    /* compiled from: Multisets */
    public static abstract class C6161c<E> extends C6148s2.C6149a<E> {
        public void clear() {
            mo29521k().clear();
        }

        public boolean contains(Object obj) {
            return mo29521k().contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return mo29521k().containsAll(collection);
        }

        public boolean isEmpty() {
            return mo29521k().isEmpty();
        }

        /* renamed from: k */
        public abstract C6153t1<E> mo29521k();

        public boolean remove(Object obj) {
            return mo29521k().remove(obj, Integer.MAX_VALUE) > 0;
        }

        public int size() {
            return mo29521k().entrySet().size();
        }
    }

    /* renamed from: c.q.b.b.u1$d */
    /* compiled from: Multisets */
    public static abstract class C6162d<E> extends C6148s2.C6149a<C6153t1.C6154a<E>> {
        public void clear() {
            mo29499k().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof C6153t1.C6154a)) {
                return false;
            }
            C6153t1.C6154a aVar = (C6153t1.C6154a) obj;
            if (aVar.getCount() > 0 && mo29499k().count(aVar.mo29977a()) == aVar.getCount()) {
                return true;
            }
            return false;
        }

        /* renamed from: k */
        public abstract C6153t1<E> mo29499k();

        public boolean remove(Object obj) {
            if (obj instanceof C6153t1.C6154a) {
                C6153t1.C6154a aVar = (C6153t1.C6154a) obj;
                Object a = aVar.mo29977a();
                int count = aVar.getCount();
                if (count != 0) {
                    return mo29499k().setCount(a, count, 0);
                }
            }
            return false;
        }
    }

    /* renamed from: c.q.b.b.u1$e */
    /* compiled from: Multisets */
    public static class C6163e<E> extends C6160b<E> implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: e */
        public final E f11744e;

        /* renamed from: l */
        public final int f11745l;

        public C6163e(E e, int i) {
            this.f11744e = e;
            this.f11745l = i;
            C6166v.m17276b(i, "count");
        }

        /* renamed from: a */
        public final E mo29977a() {
            return this.f11744e;
        }

        public final int getCount() {
            return this.f11745l;
        }
    }

    /* renamed from: c.q.b.b.u1$f */
    /* compiled from: Multisets */
    public static final class C6164f<E> implements Iterator<E> {

        /* renamed from: e */
        public final C6153t1<E> f11746e;

        /* renamed from: l */
        public final Iterator<C6153t1.C6154a<E>> f11747l;

        /* renamed from: m */
        public C6153t1.C6154a<E> f11748m;

        /* renamed from: n */
        public int f11749n;

        /* renamed from: o */
        public int f11750o;

        /* renamed from: p */
        public boolean f11751p;

        public C6164f(C6153t1<E> t1Var, Iterator<C6153t1.C6154a<E>> it) {
            this.f11746e = t1Var;
            this.f11747l = it;
        }

        public boolean hasNext() {
            return this.f11749n > 0 || this.f11747l.hasNext();
        }

        public E next() {
            if (hasNext()) {
                if (this.f11749n == 0) {
                    C6153t1.C6154a<E> next = this.f11747l.next();
                    this.f11748m = next;
                    int count = next.getCount();
                    this.f11749n = count;
                    this.f11750o = count;
                }
                this.f11749n--;
                this.f11751p = true;
                return this.f11748m.mo29977a();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            C6166v.m17279e(this.f11751p);
            if (this.f11750o == 1) {
                this.f11747l.remove();
            } else {
                this.f11746e.remove(this.f11748m.mo29977a());
            }
            this.f11750o--;
            this.f11751p = false;
        }
    }

    /* renamed from: a */
    public static <E> boolean m17257a(C6153t1<E> t1Var, C5966f<? extends E> fVar) {
        if (fVar.isEmpty()) {
            return false;
        }
        fVar.addTo(t1Var);
        return true;
    }

    /* renamed from: b */
    public static <E> boolean m17258b(C6153t1<E> t1Var, C6153t1<? extends E> t1Var2) {
        if (t1Var2 instanceof C5966f) {
            return m17257a(t1Var, (C5966f) t1Var2);
        }
        if (t1Var2.isEmpty()) {
            return false;
        }
        for (C6153t1.C6154a next : t1Var2.entrySet()) {
            t1Var.add(next.mo29977a(), next.getCount());
        }
        return true;
    }

    /* renamed from: c */
    public static <E> boolean m17259c(C6153t1<E> t1Var, Collection<? extends E> collection) {
        C5850m.m16594o(t1Var);
        C5850m.m16594o(collection);
        if (collection instanceof C6153t1) {
            return m17258b(t1Var, m17260d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return C6028l1.m16929a(t1Var, collection.iterator());
    }

    /* renamed from: d */
    public static <T> C6153t1<T> m17260d(Iterable<T> iterable) {
        return (C6153t1) iterable;
    }

    /* renamed from: e */
    public static <E> Iterator<E> m17261e(Iterator<C6153t1.C6154a<E>> it) {
        return new C6159a(it);
    }

    /* renamed from: f */
    public static boolean m17262f(C6153t1<?> t1Var, Object obj) {
        if (obj == t1Var) {
            return true;
        }
        if (obj instanceof C6153t1) {
            C6153t1 t1Var2 = (C6153t1) obj;
            if (t1Var.size() == t1Var2.size() && t1Var.entrySet().size() == t1Var2.entrySet().size()) {
                for (C6153t1.C6154a aVar : t1Var2.entrySet()) {
                    if (t1Var.count(aVar.mo29977a()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static <E> C6153t1.C6154a<E> m17263g(E e, int i) {
        return new C6163e(e, i);
    }

    /* renamed from: h */
    public static int m17264h(Iterable<?> iterable) {
        if (iterable instanceof C6153t1) {
            return ((C6153t1) iterable).elementSet().size();
        }
        return 11;
    }

    /* renamed from: i */
    public static <E> Iterator<E> m17265i(C6153t1<E> t1Var) {
        return new C6164f(t1Var, t1Var.entrySet().iterator());
    }

    /* renamed from: j */
    public static boolean m17266j(C6153t1<?> t1Var, Collection<?> collection) {
        if (collection instanceof C6153t1) {
            collection = ((C6153t1) collection).elementSet();
        }
        return t1Var.elementSet().removeAll(collection);
    }

    /* renamed from: k */
    public static boolean m17267k(C6153t1<?> t1Var, Collection<?> collection) {
        C5850m.m16594o(collection);
        if (collection instanceof C6153t1) {
            collection = ((C6153t1) collection).elementSet();
        }
        return t1Var.elementSet().retainAll(collection);
    }

    /* renamed from: l */
    public static <E> int m17268l(C6153t1<E> t1Var, E e, int i) {
        C6166v.m17276b(i, "count");
        int count = t1Var.count(e);
        int i2 = i - count;
        if (i2 > 0) {
            t1Var.add(e, i2);
        } else if (i2 < 0) {
            t1Var.remove(e, -i2);
        }
        return count;
    }

    /* renamed from: m */
    public static <E> boolean m17269m(C6153t1<E> t1Var, E e, int i, int i2) {
        C6166v.m17276b(i, "oldCount");
        C6166v.m17276b(i2, "newCount");
        if (t1Var.count(e) != i) {
            return false;
        }
        t1Var.setCount(e, i2);
        return true;
    }
}
