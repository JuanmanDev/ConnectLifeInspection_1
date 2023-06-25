package p040c.p200q.p201a.p219b.p224f0.p232y;

import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.v */
/* compiled from: PsDurationReader */
public final class C2811v {

    /* renamed from: a */
    public final C3146b0 f4331a = new C3146b0(0);

    /* renamed from: b */
    public final C3173t f4332b = new C3173t();

    /* renamed from: c */
    public boolean f4333c;

    /* renamed from: d */
    public boolean f4334d;

    /* renamed from: e */
    public boolean f4335e;

    /* renamed from: f */
    public long f4336f = -9223372036854775807L;

    /* renamed from: g */
    public long f4337g = -9223372036854775807L;

    /* renamed from: h */
    public long f4338h = -9223372036854775807L;

    /* renamed from: a */
    public static boolean m5944a(byte[] bArr) {
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static long m5945l(C3173t tVar) {
        int c = tVar.mo20010c();
        if (tVar.mo20008a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        tVar.mo20015h(bArr, 0, 9);
        tVar.mo20006L(c);
        if (!m5944a(bArr)) {
            return -9223372036854775807L;
        }
        return m5946m(bArr);
    }

    /* renamed from: m */
    public static long m5946m(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* renamed from: b */
    public final int mo18850b(C2675h hVar) {
        this.f4332b.mo20003I(C3152e0.f5824f);
        this.f4333c = true;
        hVar.mo18527f();
        return 0;
    }

    /* renamed from: c */
    public long mo18851c() {
        return this.f4338h;
    }

    /* renamed from: d */
    public C3146b0 mo18852d() {
        return this.f4331a;
    }

    /* renamed from: e */
    public boolean mo18853e() {
        return this.f4333c;
    }

    /* renamed from: f */
    public final int mo18854f(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: g */
    public int mo18855g(C2675h hVar, C2681n nVar) {
        if (!this.f4335e) {
            return mo18858j(hVar, nVar);
        }
        if (this.f4337g == -9223372036854775807L) {
            return mo18850b(hVar);
        }
        if (!this.f4334d) {
            return mo18856h(hVar, nVar);
        }
        long j = this.f4336f;
        if (j == -9223372036854775807L) {
            return mo18850b(hVar);
        }
        this.f4338h = this.f4331a.mo19944b(this.f4337g) - this.f4331a.mo19944b(j);
        return mo18850b(hVar);
    }

    /* renamed from: h */
    public final int mo18856h(C2675h hVar, C2681n nVar) {
        int min = (int) Math.min(20000, hVar.mo18526e());
        long j = (long) 0;
        if (hVar.getPosition() != j) {
            nVar.f3443a = j;
            return 1;
        }
        this.f4332b.mo20002H(min);
        hVar.mo18527f();
        hVar.mo18531i(this.f4332b.f5877a, 0, min);
        this.f4336f = mo18857i(this.f4332b);
        this.f4334d = true;
        return 0;
    }

    /* renamed from: i */
    public final long mo18857i(C3173t tVar) {
        int d = tVar.mo20011d();
        for (int c = tVar.mo20010c(); c < d - 3; c++) {
            if (mo18854f(tVar.f5877a, c) == 442) {
                tVar.mo20006L(c + 4);
                long l = m5945l(tVar);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: j */
    public final int mo18858j(C2675h hVar, C2681n nVar) {
        long e = hVar.mo18526e();
        int min = (int) Math.min(20000, e);
        long j = e - ((long) min);
        if (hVar.getPosition() != j) {
            nVar.f3443a = j;
            return 1;
        }
        this.f4332b.mo20002H(min);
        hVar.mo18527f();
        hVar.mo18531i(this.f4332b.f5877a, 0, min);
        this.f4337g = mo18859k(this.f4332b);
        this.f4335e = true;
        return 0;
    }

    /* renamed from: k */
    public final long mo18859k(C3173t tVar) {
        int c = tVar.mo20010c();
        for (int d = tVar.mo20011d() - 4; d >= c; d--) {
            if (mo18854f(tVar.f5877a, d) == 442) {
                tVar.mo20006L(d + 4);
                long l = m5945l(tVar);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }
}
