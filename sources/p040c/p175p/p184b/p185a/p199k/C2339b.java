package p040c.p175p.p184b.p185a.p199k;

import p040c.p175p.p184b.p185a.p199k.C2343f;

/* renamed from: c.p.b.a.k.b */
/* compiled from: FSize */
public final class C2339b extends C2343f.C2344a {

    /* renamed from: e */
    public static C2343f<C2339b> f2531e;

    /* renamed from: c */
    public float f2532c;

    /* renamed from: d */
    public float f2533d;

    static {
        C2343f<C2339b> a = C2343f.m3929a(256, new C2339b(0.0f, 0.0f));
        f2531e = a;
        a.mo17587g(0.5f);
    }

    public C2339b() {
    }

    /* renamed from: b */
    public static C2339b m3918b(float f, float f2) {
        C2339b b = f2531e.mo17582b();
        b.f2532c = f;
        b.f2533d = f2;
        return b;
    }

    /* renamed from: c */
    public static void m3919c(C2339b bVar) {
        f2531e.mo17583c(bVar);
    }

    /* renamed from: a */
    public C2343f.C2344a mo17577a() {
        return new C2339b(0.0f, 0.0f);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2339b)) {
            return false;
        }
        C2339b bVar = (C2339b) obj;
        if (this.f2532c == bVar.f2532c && this.f2533d == bVar.f2533d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f2532c) ^ Float.floatToIntBits(this.f2533d);
    }

    public String toString() {
        return this.f2532c + "x" + this.f2533d;
    }

    public C2339b(float f, float f2) {
        this.f2532c = f;
        this.f2533d = f2;
    }
}
