package p040c.p200q.p353b.p355b;

import java.io.Serializable;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.p2 */
/* compiled from: ReverseOrdering */
public final class C6102p2<T> extends C6205z1<T> implements Serializable {
    public static final long serialVersionUID = 0;

    /* renamed from: e */
    public final C6205z1<? super T> f11707e;

    public C6102p2(C6205z1<? super T> z1Var) {
        C5850m.m16594o(z1Var);
        this.f11707e = z1Var;
    }

    /* renamed from: c */
    public <E extends T> E mo29699c(E e, E e2) {
        return this.f11707e.mo29700d(e, e2);
    }

    public int compare(T t, T t2) {
        return this.f11707e.compare(t2, t);
    }

    /* renamed from: d */
    public <E extends T> E mo29700d(E e, E e2) {
        return this.f11707e.mo29699c(e, e2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6102p2) {
            return this.f11707e.equals(((C6102p2) obj).f11707e);
        }
        return false;
    }

    /* renamed from: h */
    public <S extends T> C6205z1<S> mo29701h() {
        return this.f11707e;
    }

    public int hashCode() {
        return -this.f11707e.hashCode();
    }

    public String toString() {
        return this.f11707e + ".reverse()";
    }
}
