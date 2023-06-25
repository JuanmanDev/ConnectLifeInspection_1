package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.Map;
import p040c.p200q.p353b.p354a.C5838g;

/* renamed from: c.q.b.b.z1 */
/* compiled from: Ordering */
public abstract class C6205z1<T> implements Comparator<T> {
    /* renamed from: a */
    public static <T> C6205z1<T> m17454a(Comparator<T> comparator) {
        return comparator instanceof C6205z1 ? (C6205z1) comparator : new C5880b0(comparator);
    }

    /* renamed from: e */
    public static <C extends Comparable> C6205z1<C> m17455e() {
        return C6168v1.f11755e;
    }

    /* renamed from: b */
    public <E extends T> ImmutableList<E> mo30152b(Iterable<E> iterable) {
        return ImmutableList.sortedCopyOf(this, iterable);
    }

    /* renamed from: c */
    public <E extends T> E mo29699c(E e, E e2) {
        return compare(e, e2) >= 0 ? e : e2;
    }

    public abstract int compare(T t, T t2);

    /* renamed from: d */
    public <E extends T> E mo29700d(E e, E e2) {
        return compare(e, e2) <= 0 ? e : e2;
    }

    /* renamed from: f */
    public <T2 extends T> C6205z1<Map.Entry<T2, ?>> mo30153f() {
        return mo30154g(C6108q1.m17175k());
    }

    /* renamed from: g */
    public <F> C6205z1<F> mo30154g(C5838g<F, ? extends T> gVar) {
        return new C6156u(gVar, this);
    }

    /* renamed from: h */
    public <S extends T> C6205z1<S> mo29701h() {
        return new C6102p2(this);
    }
}
