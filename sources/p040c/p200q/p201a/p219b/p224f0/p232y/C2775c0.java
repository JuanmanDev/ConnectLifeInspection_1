package p040c.p200q.p201a.p219b.p224f0.p232y;

import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.c0 */
/* compiled from: TsDurationReader */
public final class C2775c0 {

    /* renamed from: a */
    public final C3146b0 f4054a = new C3146b0(0);

    /* renamed from: b */
    public final C3173t f4055b = new C3173t();

    /* renamed from: c */
    public boolean f4056c;

    /* renamed from: d */
    public boolean f4057d;

    /* renamed from: e */
    public boolean f4058e;

    /* renamed from: f */
    public long f4059f = -9223372036854775807L;

    /* renamed from: g */
    public long f4060g = -9223372036854775807L;

    /* renamed from: h */
    public long f4061h = -9223372036854775807L;

    /* renamed from: a */
    public final int mo18741a(C2675h hVar) {
        this.f4055b.mo20003I(C3152e0.f5824f);
        this.f4056c = true;
        hVar.mo18527f();
        return 0;
    }

    /* renamed from: b */
    public long mo18742b() {
        return this.f4061h;
    }

    /* renamed from: c */
    public C3146b0 mo18743c() {
        return this.f4054a;
    }

    /* renamed from: d */
    public boolean mo18744d() {
        return this.f4056c;
    }

    /* renamed from: e */
    public int mo18745e(C2675h hVar, C2681n nVar, int i) {
        if (i <= 0) {
            return mo18741a(hVar);
        }
        if (!this.f4058e) {
            return mo18748h(hVar, nVar, i);
        }
        if (this.f4060g == -9223372036854775807L) {
            return mo18741a(hVar);
        }
        if (!this.f4057d) {
            return mo18746f(hVar, nVar, i);
        }
        long j = this.f4059f;
        if (j == -9223372036854775807L) {
            return mo18741a(hVar);
        }
        this.f4061h = this.f4054a.mo19944b(this.f4060g) - this.f4054a.mo19944b(j);
        return mo18741a(hVar);
    }

    /* renamed from: f */
    public final int mo18746f(C2675h hVar, C2681n nVar, int i) {
        int min = (int) Math.min(112800, hVar.mo18526e());
        long j = (long) 0;
        if (hVar.getPosition() != j) {
            nVar.f3443a = j;
            return 1;
        }
        this.f4055b.mo20002H(min);
        hVar.mo18527f();
        hVar.mo18531i(this.f4055b.f5877a, 0, min);
        this.f4059f = mo18747g(this.f4055b, i);
        this.f4057d = true;
        return 0;
    }

    /* renamed from: g */
    public final long mo18747g(C3173t tVar, int i) {
        int d = tVar.mo20011d();
        for (int c = tVar.mo20010c(); c < d; c++) {
            if (tVar.f5877a[c] == 71) {
                long b = C2787f0.m5792b(tVar, c, i);
                if (b != -9223372036854775807L) {
                    return b;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    public final int mo18748h(C2675h hVar, C2681n nVar, int i) {
        long e = hVar.mo18526e();
        int min = (int) Math.min(112800, e);
        long j = e - ((long) min);
        if (hVar.getPosition() != j) {
            nVar.f3443a = j;
            return 1;
        }
        this.f4055b.mo20002H(min);
        hVar.mo18527f();
        hVar.mo18531i(this.f4055b.f5877a, 0, min);
        this.f4060g = mo18749i(this.f4055b, i);
        this.f4058e = true;
        return 0;
    }

    /* renamed from: i */
    public final long mo18749i(C3173t tVar, int i) {
        int c = tVar.mo20010c();
        int d = tVar.mo20011d();
        while (true) {
            d--;
            if (d < c) {
                return -9223372036854775807L;
            }
            if (tVar.f5877a[d] == 71) {
                long b = C2787f0.m5792b(tVar, d, i);
                if (b != -9223372036854775807L) {
                    return b;
                }
            }
        }
    }
}
