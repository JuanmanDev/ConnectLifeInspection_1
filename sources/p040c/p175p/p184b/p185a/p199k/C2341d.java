package p040c.p175p.p184b.p185a.p199k;

import p040c.p175p.p184b.p185a.p199k.C2343f;

/* renamed from: c.p.b.a.k.d */
/* compiled from: MPPointD */
public class C2341d extends C2343f.C2344a {

    /* renamed from: e */
    public static C2343f<C2341d> f2534e;

    /* renamed from: c */
    public double f2535c;

    /* renamed from: d */
    public double f2536d;

    static {
        C2343f<C2341d> a = C2343f.m3929a(64, new C2341d(0.0d, 0.0d));
        f2534e = a;
        a.mo17587g(0.5f);
    }

    public C2341d(double d, double d2) {
        this.f2535c = d;
        this.f2536d = d2;
    }

    /* renamed from: b */
    public static C2341d m3921b(double d, double d2) {
        C2341d b = f2534e.mo17582b();
        b.f2535c = d;
        b.f2536d = d2;
        return b;
    }

    /* renamed from: c */
    public static void m3922c(C2341d dVar) {
        f2534e.mo17583c(dVar);
    }

    /* renamed from: a */
    public C2343f.C2344a mo17577a() {
        return new C2341d(0.0d, 0.0d);
    }

    public String toString() {
        return "MPPointD, x: " + this.f2535c + ", y: " + this.f2536d;
    }
}
