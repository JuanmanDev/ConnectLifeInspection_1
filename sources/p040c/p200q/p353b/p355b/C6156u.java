package p040c.p200q.p353b.p355b;

import java.io.Serializable;
import p040c.p200q.p353b.p354a.C5838g;
import p040c.p200q.p353b.p354a.C5845j;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.u */
/* compiled from: ByFunctionOrdering */
public final class C6156u<F, T> extends C6205z1<F> implements Serializable {
    public static final long serialVersionUID = 0;

    /* renamed from: e */
    public final C5838g<F, ? extends T> f11742e;

    /* renamed from: l */
    public final C6205z1<T> f11743l;

    public C6156u(C5838g<F, ? extends T> gVar, C6205z1<T> z1Var) {
        C5850m.m16594o(gVar);
        this.f11742e = gVar;
        C5850m.m16594o(z1Var);
        this.f11743l = z1Var;
    }

    public int compare(F f, F f2) {
        return this.f11743l.compare(this.f11742e.apply(f), this.f11742e.apply(f2));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6156u)) {
            return false;
        }
        C6156u uVar = (C6156u) obj;
        if (!this.f11742e.equals(uVar.f11742e) || !this.f11743l.equals(uVar.f11743l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C5845j.m16577b(this.f11742e, this.f11743l);
    }

    public String toString() {
        return this.f11743l + ".onResultOf(" + this.f11742e + ")";
    }
}
