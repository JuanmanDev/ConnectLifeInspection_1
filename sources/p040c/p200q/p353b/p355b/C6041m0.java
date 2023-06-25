package p040c.p200q.p353b.p355b;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p354a.C5851n;

/* renamed from: c.q.b.b.m0 */
/* compiled from: FluentIterable */
public abstract class C6041m0<E> implements Iterable<E> {

    /* renamed from: e */
    public final Optional<Iterable<E>> f11626e;

    /* renamed from: c.q.b.b.m0$a */
    /* compiled from: FluentIterable */
    public static class C6042a extends C6041m0<E> {

        /* renamed from: l */
        public final /* synthetic */ Iterable f11627l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6042a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f11627l = iterable2;
        }

        public Iterator<E> iterator() {
            return this.f11627l.iterator();
        }
    }

    /* renamed from: c.q.b.b.m0$b */
    /* compiled from: FluentIterable */
    public static class C6043b extends C6041m0<T> {

        /* renamed from: l */
        public final /* synthetic */ Iterable[] f11628l;

        /* renamed from: c.q.b.b.m0$b$a */
        /* compiled from: FluentIterable */
        public class C6044a extends C5879b<Iterator<? extends T>> {
            public C6044a(int i) {
                super(i);
            }

            /* renamed from: b */
            public Iterator<? extends T> mo29041a(int i) {
                return C6043b.this.f11628l[i].iterator();
            }
        }

        public C6043b(Iterable[] iterableArr) {
            this.f11628l = iterableArr;
        }

        public Iterator<T> iterator() {
            return C6028l1.m16933e(new C6044a(this.f11628l.length));
        }
    }

    public C6041m0() {
        this.f11626e = Optional.absent();
    }

    /* renamed from: c */
    public static <T> C6041m0<T> m16960c(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return m16961f(iterable, iterable2);
    }

    /* renamed from: f */
    public static <T> C6041m0<T> m16961f(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> o : iterableArr) {
            C5850m.m16594o(o);
        }
        return new C6043b(iterableArr);
    }

    /* renamed from: k */
    public static <E> C6041m0<E> m16962k(Iterable<E> iterable) {
        return iterable instanceof C6041m0 ? (C6041m0) iterable : new C6042a(iterable, iterable);
    }

    /* renamed from: g */
    public final C6041m0<E> mo29630g(C5851n<? super E> nVar) {
        return m16962k(C6020k1.m16917d(mo29631l(), nVar));
    }

    /* renamed from: l */
    public final Iterable<E> mo29631l() {
        return this.f11626e.mo28925or(this);
    }

    /* renamed from: o */
    public final ImmutableSet<E> mo29632o() {
        return ImmutableSet.copyOf(mo29631l());
    }

    public String toString() {
        return C6020k1.m16926m(mo29631l());
    }

    public C6041m0(Iterable<E> iterable) {
        C5850m.m16594o(iterable);
        this.f11626e = Optional.fromNullable(this == iterable ? null : iterable);
    }
}
