package p040c.p200q.p353b.p355b;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p040c.p200q.p353b.p354a.C5838g;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p354a.C5851n;

/* renamed from: c.q.b.b.k1 */
/* compiled from: Iterables */
public final class C6020k1 {

    /* renamed from: c.q.b.b.k1$a */
    /* compiled from: Iterables */
    public static class C6021a extends C6041m0<T> {

        /* renamed from: l */
        public final /* synthetic */ Iterable f11584l;

        /* renamed from: m */
        public final /* synthetic */ C5851n f11585m;

        public C6021a(Iterable iterable, C5851n nVar) {
            this.f11584l = iterable;
            this.f11585m = nVar;
        }

        public Iterator<T> iterator() {
            return C6028l1.m16939k(this.f11584l.iterator(), this.f11585m);
        }
    }

    /* renamed from: c.q.b.b.k1$b */
    /* compiled from: Iterables */
    public static class C6022b extends C6041m0<T> {

        /* renamed from: l */
        public final /* synthetic */ Iterable f11586l;

        /* renamed from: m */
        public final /* synthetic */ C5838g f11587m;

        public C6022b(Iterable iterable, C5838g gVar) {
            this.f11586l = iterable;
            this.f11587m = gVar;
        }

        public Iterator<T> iterator() {
            return C6028l1.m16951w(this.f11586l.iterator(), this.f11587m);
        }
    }

    /* renamed from: c.q.b.b.k1$c */
    /* compiled from: Iterables */
    public static class C6023c extends C6041m0<T> {

        /* renamed from: l */
        public final /* synthetic */ Iterable f11588l;

        /* renamed from: m */
        public final /* synthetic */ int f11589m;

        /* renamed from: c.q.b.b.k1$c$a */
        /* compiled from: Iterables */
        public class C6024a implements Iterator<T> {

            /* renamed from: e */
            public boolean f11590e = true;

            /* renamed from: l */
            public final /* synthetic */ Iterator f11591l;

            public C6024a(C6023c cVar, Iterator it) {
                this.f11591l = it;
            }

            public boolean hasNext() {
                return this.f11591l.hasNext();
            }

            public T next() {
                T next = this.f11591l.next();
                this.f11590e = false;
                return next;
            }

            public void remove() {
                C6166v.m17279e(!this.f11590e);
                this.f11591l.remove();
            }
        }

        public C6023c(Iterable iterable, int i) {
            this.f11588l = iterable;
            this.f11589m = i;
        }

        public Iterator<T> iterator() {
            Iterable iterable = this.f11588l;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.f11589m), list.size()).iterator();
            }
            Iterator it = iterable.iterator();
            C6028l1.m16930b(it, this.f11589m);
            return new C6024a(this, it);
        }
    }

    /* renamed from: a */
    public static <T> boolean m16914a(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll(C6170w.m17282a(iterable));
        }
        C5850m.m16594o(iterable);
        return C6028l1.m16929a(collection, iterable.iterator());
    }

    /* renamed from: b */
    public static <E> Collection<E> m16915b(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return C6049n1.m16981i(iterable.iterator());
    }

    /* renamed from: c */
    public static <T> Iterable<T> m16916c(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return C6041m0.m16960c(iterable, iterable2);
    }

    /* renamed from: d */
    public static <T> Iterable<T> m16917d(Iterable<T> iterable, C5851n<? super T> nVar) {
        C5850m.m16594o(iterable);
        C5850m.m16594o(nVar);
        return new C6021a(iterable, nVar);
    }

    /* renamed from: e */
    public static <T> T m16918e(Iterable<? extends T> iterable, T t) {
        return C6028l1.m16941m(iterable.iterator(), t);
    }

    /* renamed from: f */
    public static <T> T m16919f(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return C6028l1.m16940l(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return m16920g(list);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: g */
    public static <T> T m16920g(List<T> list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: h */
    public static <T> T m16921h(Iterable<T> iterable) {
        return C6028l1.m16942n(iterable.iterator());
    }

    /* renamed from: i */
    public static boolean m16922i(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    /* renamed from: j */
    public static <T> Iterable<T> m16923j(Iterable<T> iterable, int i) {
        C5850m.m16594o(iterable);
        C5850m.m16584e(i >= 0, "number to skip cannot be negative");
        return new C6023c(iterable, i);
    }

    /* renamed from: k */
    public static Object[] m16924k(Iterable<?> iterable) {
        return m16915b(iterable).toArray();
    }

    /* renamed from: l */
    public static <T> T[] m16925l(Iterable<? extends T> iterable, T[] tArr) {
        return m16915b(iterable).toArray(tArr);
    }

    /* renamed from: m */
    public static String m16926m(Iterable<?> iterable) {
        return C6028l1.m16950v(iterable.iterator());
    }

    /* renamed from: n */
    public static <F, T> Iterable<T> m16927n(Iterable<F> iterable, C5838g<? super F, ? extends T> gVar) {
        C5850m.m16594o(iterable);
        C5850m.m16594o(gVar);
        return new C6022b(iterable, gVar);
    }
}
