package p040c.p200q.p353b.p355b;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import kotlin.text.Typography;
import p040c.p200q.p353b.p354a.C5838g;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p354a.C5851n;
import p040c.p200q.p353b.p358e.C6250c;

/* renamed from: c.q.b.b.l1 */
/* compiled from: Iterators */
public final class C6028l1 {

    /* renamed from: c.q.b.b.l1$a */
    /* compiled from: Iterators */
    public static class C6029a extends C5991h3<T> {

        /* renamed from: e */
        public final /* synthetic */ Iterator f11600e;

        public C6029a(Iterator it) {
            this.f11600e = it;
        }

        public boolean hasNext() {
            return this.f11600e.hasNext();
        }

        public T next() {
            return this.f11600e.next();
        }
    }

    /* renamed from: c.q.b.b.l1$b */
    /* compiled from: Iterators */
    public static class C6030b extends C5886c<T> {

        /* renamed from: m */
        public final /* synthetic */ Iterator f11601m;

        /* renamed from: n */
        public final /* synthetic */ C5851n f11602n;

        public C6030b(Iterator it, C5851n nVar) {
            this.f11601m = it;
            this.f11602n = nVar;
        }

        /* renamed from: a */
        public T mo29067a() {
            while (this.f11601m.hasNext()) {
                T next = this.f11601m.next();
                if (this.f11602n.apply(next)) {
                    return next;
                }
            }
            return mo29068b();
        }
    }

    /* renamed from: c.q.b.b.l1$c */
    /* compiled from: Iterators */
    public static class C6031c extends C5977f3<F, T> {

        /* renamed from: l */
        public final /* synthetic */ C5838g f11603l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6031c(Iterator it, C5838g gVar) {
            super(it);
            this.f11603l = gVar;
        }

        /* renamed from: a */
        public T mo29448a(F f) {
            return this.f11603l.apply(f);
        }
    }

    /* renamed from: c.q.b.b.l1$d */
    /* compiled from: Iterators */
    public static class C6032d extends C5991h3<T> {

        /* renamed from: e */
        public boolean f11604e;

        /* renamed from: l */
        public final /* synthetic */ Object f11605l;

        public C6032d(Object obj) {
            this.f11605l = obj;
        }

        public boolean hasNext() {
            return !this.f11604e;
        }

        public T next() {
            if (!this.f11604e) {
                this.f11604e = true;
                return this.f11605l;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: c.q.b.b.l1$e */
    /* compiled from: Iterators */
    public static final class C6033e<T> extends C5879b<T> {

        /* renamed from: o */
        public static final C6005i3<Object> f11606o = new C6033e(new Object[0], 0, 0, 0);

        /* renamed from: m */
        public final T[] f11607m;

        /* renamed from: n */
        public final int f11608n;

        public C6033e(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.f11607m = tArr;
            this.f11608n = i;
        }

        /* renamed from: a */
        public T mo29041a(int i) {
            return this.f11607m[this.f11608n + i];
        }
    }

    /* renamed from: c.q.b.b.l1$f */
    /* compiled from: Iterators */
    public static class C6034f<T> implements Iterator<T> {

        /* renamed from: e */
        public Iterator<? extends T> f11609e;

        /* renamed from: l */
        public Iterator<? extends T> f11610l = C6028l1.m16936h();

        /* renamed from: m */
        public Iterator<? extends Iterator<? extends T>> f11611m;

        /* renamed from: n */
        public Deque<Iterator<? extends Iterator<? extends T>>> f11612n;

        public C6034f(Iterator<? extends Iterator<? extends T>> it) {
            C5850m.m16594o(it);
            this.f11611m = it;
        }

        /* renamed from: a */
        public final Iterator<? extends Iterator<? extends T>> mo29615a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f11611m;
                if (it != null && it.hasNext()) {
                    return this.f11611m;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f11612n;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f11611m = this.f11612n.removeFirst();
            }
        }

        public boolean hasNext() {
            while (true) {
                Iterator<? extends T> it = this.f11610l;
                C5850m.m16594o(it);
                if (it.hasNext()) {
                    return true;
                }
                Iterator<? extends Iterator<? extends T>> a = mo29615a();
                this.f11611m = a;
                if (a == null) {
                    return false;
                }
                Iterator<? extends T> it2 = (Iterator) a.next();
                this.f11610l = it2;
                if (it2 instanceof C6034f) {
                    C6034f fVar = (C6034f) it2;
                    this.f11610l = fVar.f11610l;
                    if (this.f11612n == null) {
                        this.f11612n = new ArrayDeque();
                    }
                    this.f11612n.addFirst(this.f11611m);
                    if (fVar.f11612n != null) {
                        while (!fVar.f11612n.isEmpty()) {
                            this.f11612n.addFirst(fVar.f11612n.removeLast());
                        }
                    }
                    this.f11611m = fVar.f11611m;
                }
            }
        }

        public T next() {
            if (hasNext()) {
                Iterator<? extends T> it = this.f11610l;
                this.f11609e = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            C6166v.m17279e(this.f11609e != null);
            this.f11609e.remove();
            this.f11609e = null;
        }
    }

    /* renamed from: c.q.b.b.l1$g */
    /* compiled from: Iterators */
    public enum C6035g implements Iterator<Object> {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            C6166v.m17279e(false);
        }
    }

    /* renamed from: c.q.b.b.l1$h */
    /* compiled from: Iterators */
    public static class C6036h<T> extends C5991h3<T> {

        /* renamed from: e */
        public final Queue<C5877a2<T>> f11615e;

        /* renamed from: c.q.b.b.l1$h$a */
        /* compiled from: Iterators */
        public class C6037a implements Comparator<C5877a2<T>> {

            /* renamed from: e */
            public final /* synthetic */ Comparator f11616e;

            public C6037a(C6036h hVar, Comparator comparator) {
                this.f11616e = comparator;
            }

            /* renamed from: a */
            public int compare(C5877a2<T> a2Var, C5877a2<T> a2Var2) {
                return this.f11616e.compare(a2Var.peek(), a2Var2.peek());
            }
        }

        public C6036h(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
            this.f11615e = new PriorityQueue(2, new C6037a(this, comparator));
            for (Iterator it : iterable) {
                if (it.hasNext()) {
                    this.f11615e.add(C6028l1.m16944p(it));
                }
            }
        }

        public boolean hasNext() {
            return !this.f11615e.isEmpty();
        }

        public T next() {
            C5877a2 remove = this.f11615e.remove();
            T next = remove.next();
            if (remove.hasNext()) {
                this.f11615e.add(remove);
            }
            return next;
        }
    }

    /* renamed from: c.q.b.b.l1$i */
    /* compiled from: Iterators */
    public static class C6038i<E> implements C5877a2<E> {

        /* renamed from: e */
        public final Iterator<? extends E> f11617e;

        /* renamed from: l */
        public boolean f11618l;

        /* renamed from: m */
        public E f11619m;

        public C6038i(Iterator<? extends E> it) {
            C5850m.m16594o(it);
            this.f11617e = it;
        }

        public boolean hasNext() {
            return this.f11618l || this.f11617e.hasNext();
        }

        public E next() {
            if (!this.f11618l) {
                return this.f11617e.next();
            }
            E e = this.f11619m;
            this.f11618l = false;
            this.f11619m = null;
            return e;
        }

        public E peek() {
            if (!this.f11618l) {
                this.f11619m = this.f11617e.next();
                this.f11618l = true;
            }
            return this.f11619m;
        }

        public void remove() {
            C5850m.m16601v(!this.f11618l, "Can't remove after you've peeked at next");
            this.f11617e.remove();
        }
    }

    /* renamed from: a */
    public static <T> boolean m16929a(Collection<T> collection, Iterator<? extends T> it) {
        C5850m.m16594o(collection);
        C5850m.m16594o(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: b */
    public static int m16930b(Iterator<?> it, int i) {
        C5850m.m16594o(it);
        int i2 = 0;
        C5850m.m16584e(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    /* renamed from: c */
    public static <T> ListIterator<T> m16931c(Iterator<T> it) {
        return (ListIterator) it;
    }

    /* renamed from: d */
    public static void m16932d(Iterator<?> it) {
        C5850m.m16594o(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: e */
    public static <T> Iterator<T> m16933e(Iterator<? extends Iterator<? extends T>> it) {
        return new C6034f(it);
    }

    /* renamed from: f */
    public static boolean m16934f(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m16935g(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = p040c.p200q.p353b.p354a.C5845j.m16576a(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p353b.p355b.C6028l1.m16935g(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* renamed from: h */
    public static <T> C5991h3<T> m16936h() {
        return m16937i();
    }

    /* renamed from: i */
    public static <T> C6005i3<T> m16937i() {
        return C6033e.f11606o;
    }

    /* renamed from: j */
    public static <T> Iterator<T> m16938j() {
        return C6035g.INSTANCE;
    }

    /* renamed from: k */
    public static <T> C5991h3<T> m16939k(Iterator<T> it, C5851n<? super T> nVar) {
        C5850m.m16594o(it);
        C5850m.m16594o(nVar);
        return new C6030b(it, nVar);
    }

    /* renamed from: l */
    public static <T> T m16940l(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: m */
    public static <T> T m16941m(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    /* renamed from: n */
    public static <T> T m16942n(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append(Typography.greater);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: o */
    public static <T> C5991h3<T> m16943o(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        C5850m.m16595p(iterable, "iterators");
        C5850m.m16595p(comparator, "comparator");
        return new C6036h(iterable, comparator);
    }

    /* renamed from: p */
    public static <T> C5877a2<T> m16944p(Iterator<? extends T> it) {
        if (it instanceof C6038i) {
            return (C6038i) it;
        }
        return new C6038i(it);
    }

    /* renamed from: q */
    public static <T> T m16945q(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: r */
    public static boolean m16946r(Iterator<?> it, Collection<?> collection) {
        C5850m.m16594o(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: s */
    public static boolean m16947s(Iterator<?> it, Collection<?> collection) {
        C5850m.m16594o(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: t */
    public static <T> C5991h3<T> m16948t(T t) {
        return new C6032d(t);
    }

    /* renamed from: u */
    public static int m16949u(Iterator<?> it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return C6250c.m17574h(j);
    }

    /* renamed from: v */
    public static String m16950v(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(it.next());
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: w */
    public static <F, T> Iterator<T> m16951w(Iterator<F> it, C5838g<? super F, ? extends T> gVar) {
        C5850m.m16594o(gVar);
        return new C6031c(it, gVar);
    }

    /* renamed from: x */
    public static <T> C5991h3<T> m16952x(Iterator<? extends T> it) {
        C5850m.m16594o(it);
        if (it instanceof C5991h3) {
            return (C5991h3) it;
        }
        return new C6029a(it);
    }
}
