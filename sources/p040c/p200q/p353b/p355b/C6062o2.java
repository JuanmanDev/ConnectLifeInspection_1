package p040c.p200q.p353b.p355b;

import java.io.Serializable;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.o2 */
/* compiled from: ReverseNaturalOrdering */
public final class C6062o2 extends C6205z1<Comparable> implements Serializable {

    /* renamed from: e */
    public static final C6062o2 f11649e = new C6062o2();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return f11649e;
    }

    /* renamed from: h */
    public <S extends Comparable> C6205z1<S> mo29701h() {
        return C6205z1.m17455e();
    }

    /* renamed from: i */
    public int compare(Comparable comparable, Comparable comparable2) {
        C5850m.m16594o(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    /* renamed from: j */
    public <E extends Comparable> E mo29699c(E e, E e2) {
        return (Comparable) C6168v1.f11755e.mo29700d(e, e2);
    }

    /* renamed from: l */
    public <E extends Comparable> E mo29700d(E e, E e2) {
        return (Comparable) C6168v1.f11755e.mo29699c(e, e2);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
