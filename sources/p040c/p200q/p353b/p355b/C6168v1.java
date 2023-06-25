package p040c.p200q.p353b.p355b;

import java.io.Serializable;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.v1 */
/* compiled from: NaturalOrdering */
public final class C6168v1 extends C6205z1<Comparable> implements Serializable {

    /* renamed from: e */
    public static final C6168v1 f11755e = new C6168v1();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return f11755e;
    }

    /* renamed from: h */
    public <S extends Comparable> C6205z1<S> mo29701h() {
        return C6062o2.f11649e;
    }

    /* renamed from: i */
    public int compare(Comparable comparable, Comparable comparable2) {
        C5850m.m16594o(comparable);
        C5850m.m16594o(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
