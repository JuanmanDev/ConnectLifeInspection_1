package p040c.p200q.p201a.p219b.p241k0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import p040c.p200q.p201a.p219b.C3030l;
import p040c.p200q.p201a.p219b.C3216y;
import p040c.p200q.p201a.p219b.p222d0.C2634e;
import p040c.p200q.p201a.p219b.p241k0.C3012t;
import p040c.p200q.p201a.p219b.p259m0.C3107e;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3166p;

/* renamed from: c.q.a.b.k0.m */
/* compiled from: ClippingMediaPeriod */
public final class C2997m implements C3012t, C3012t.C3013a {

    /* renamed from: e */
    public final C3012t f5194e;

    /* renamed from: l */
    public C3012t.C3013a f5195l;

    /* renamed from: m */
    public C2998a[] f5196m = new C2998a[0];

    /* renamed from: n */
    public long f5197n;

    /* renamed from: o */
    public long f5198o;

    /* renamed from: p */
    public long f5199p;

    /* renamed from: c.q.a.b.k0.m$a */
    /* compiled from: ClippingMediaPeriod */
    public final class C2998a implements C3027y {

        /* renamed from: e */
        public final C3027y f5200e;

        /* renamed from: l */
        public boolean f5201l;

        public C2998a(C3027y yVar) {
            this.f5200e = yVar;
        }

        /* renamed from: a */
        public void mo19097a() {
            this.f5200e.mo19097a();
        }

        /* renamed from: b */
        public void mo19483b() {
            this.f5201l = false;
        }

        /* renamed from: c */
        public boolean mo19099c() {
            return !C2997m.this.mo19481k() && this.f5200e.mo19099c();
        }

        /* renamed from: i */
        public int mo19105i(C3030l lVar, C2634e eVar, boolean z) {
            if (C2997m.this.mo19481k()) {
                return -3;
            }
            if (this.f5201l) {
                eVar.mo18392q(4);
                return -4;
            }
            int i = this.f5200e.mo19105i(lVar, eVar, z);
            if (i == -5) {
                Format format = lVar.f5333a;
                if (!(format.f7554G == 0 && format.f7555H == 0)) {
                    int i2 = 0;
                    int i3 = C2997m.this.f5198o != 0 ? 0 : format.f7554G;
                    if (C2997m.this.f5199p == Long.MIN_VALUE) {
                        i2 = format.f7555H;
                    }
                    lVar.f5333a = format.mo23916d(i3, i2);
                }
                return -5;
            }
            long j = C2997m.this.f5199p;
            if (j == Long.MIN_VALUE || ((i != -4 || eVar.f3308n < j) && (i != -3 || C2997m.this.mo19102f() != Long.MIN_VALUE))) {
                return i;
            }
            eVar.mo18386i();
            eVar.mo18392q(4);
            this.f5201l = true;
            return -4;
        }

        /* renamed from: o */
        public int mo19108o(long j) {
            if (C2997m.this.mo19481k()) {
                return -3;
            }
            return this.f5200e.mo19108o(j);
        }
    }

    public C2997m(C3012t tVar, boolean z, long j, long j2) {
        this.f5194e = tVar;
        this.f5197n = z ? j : -9223372036854775807L;
        this.f5198o = j;
        this.f5199p = j2;
    }

    /* renamed from: s */
    public static boolean m6917s(long j, C3107e[] eVarArr) {
        if (j != 0) {
            for (C3107e eVar : eVarArr) {
                if (eVar != null && !C3166p.m7899k(eVar.mo19829l().f7566q)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public long mo19098b() {
        long b = this.f5194e.mo19098b();
        if (b != Long.MIN_VALUE) {
            long j = this.f5199p;
            if (j == Long.MIN_VALUE || b < j) {
                return b;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: c */
    public final C3216y mo19480c(long j, C3216y yVar) {
        long o = C3152e0.m7815o(yVar.f6050a, 0, j - this.f5198o);
        long j2 = yVar.f6051b;
        long j3 = this.f5199p;
        long o2 = C3152e0.m7815o(j2, 0, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (o == yVar.f6050a && o2 == yVar.f6051b) {
            return yVar;
        }
        return new C3216y(o, o2);
    }

    /* renamed from: d */
    public boolean mo19100d(long j) {
        return this.f5194e.mo19100d(j);
    }

    /* renamed from: e */
    public long mo19139e(long j, C3216y yVar) {
        long j2 = this.f5198o;
        if (j == j2) {
            return j2;
        }
        return this.f5194e.mo19139e(j, mo19480c(j, yVar));
    }

    /* renamed from: f */
    public long mo19102f() {
        long f = this.f5194e.mo19102f();
        if (f != Long.MIN_VALUE) {
            long j = this.f5199p;
            if (j == Long.MIN_VALUE || f < j) {
                return f;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: g */
    public void mo19103g(long j) {
        this.f5194e.mo19103g(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r2 > r4) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo19140j(p040c.p200q.p201a.p219b.p259m0.C3107e[] r13, boolean[] r14, p040c.p200q.p201a.p219b.p241k0.C3027y[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            c.q.a.b.k0.m$a[] r2 = new p040c.p200q.p201a.p219b.p241k0.C2997m.C2998a[r2]
            r0.f5196m = r2
            int r2 = r1.length
            c.q.a.b.k0.y[] r9 = new p040c.p200q.p201a.p219b.p241k0.C3027y[r2]
            r10 = 0
            r2 = r10
        L_0x000c:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L_0x0025
            c.q.a.b.k0.m$a[] r3 = r0.f5196m
            r4 = r1[r2]
            c.q.a.b.k0.m$a r4 = (p040c.p200q.p201a.p219b.p241k0.C2997m.C2998a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L_0x0020
            r3 = r3[r2]
            c.q.a.b.k0.y r11 = r3.f5200e
        L_0x0020:
            r9[r2] = r11
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0025:
            c.q.a.b.k0.t r2 = r0.f5194e
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.mo19140j(r3, r4, r5, r6, r7)
            boolean r4 = r12.mo19481k()
            if (r4 == 0) goto L_0x0047
            long r4 = r0.f5198o
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0047
            r6 = r13
            boolean r4 = m6917s(r4, r13)
            if (r4 == 0) goto L_0x0047
            r4 = r2
            goto L_0x004c
        L_0x0047:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x004c:
            r0.f5197n = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0067
            long r4 = r0.f5198o
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0065
            long r4 = r0.f5199p
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0067
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r4 = r10
            goto L_0x0068
        L_0x0067:
            r4 = 1
        L_0x0068:
            p040c.p200q.p201a.p219b.p261o0.C3151e.m7759g(r4)
        L_0x006b:
            int r4 = r1.length
            if (r10 >= r4) goto L_0x0099
            r4 = r9[r10]
            if (r4 != 0) goto L_0x0077
            c.q.a.b.k0.m$a[] r4 = r0.f5196m
            r4[r10] = r11
            goto L_0x0090
        L_0x0077:
            r4 = r1[r10]
            if (r4 == 0) goto L_0x0085
            c.q.a.b.k0.m$a[] r4 = r0.f5196m
            r4 = r4[r10]
            c.q.a.b.k0.y r4 = r4.f5200e
            r5 = r9[r10]
            if (r4 == r5) goto L_0x0090
        L_0x0085:
            c.q.a.b.k0.m$a[] r4 = r0.f5196m
            c.q.a.b.k0.m$a r5 = new c.q.a.b.k0.m$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L_0x0090:
            c.q.a.b.k0.m$a[] r4 = r0.f5196m
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L_0x006b
        L_0x0099:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.C2997m.mo19140j(c.q.a.b.m0.e[], boolean[], c.q.a.b.k0.y[], boolean[], long):long");
    }

    /* renamed from: k */
    public boolean mo19481k() {
        return this.f5197n != -9223372036854775807L;
    }

    /* renamed from: l */
    public void mo19001l(C3012t tVar) {
        this.f5195l.mo19001l(this);
    }

    /* renamed from: m */
    public void mo19141m() {
        this.f5194e.mo19141m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r6) goto L_0x0035;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo19142n(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f5197n = r0
            c.q.a.b.k0.m$a[] r0 = r5.f5196m
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.mo19483b()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            c.q.a.b.k0.t r0 = r5.f5194e
            long r0 = r0.mo19142n(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0034
            long r6 = r5.f5198o
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0035
            long r6 = r5.f5199p
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            p040c.p200q.p201a.p219b.p261o0.C3151e.m7759g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p241k0.C2997m.mo19142n(long):long");
    }

    /* renamed from: o */
    public void mo18995i(C3012t tVar) {
        this.f5195l.mo18995i(this);
    }

    /* renamed from: p */
    public long mo19143p() {
        if (mo19481k()) {
            long j = this.f5197n;
            this.f5197n = -9223372036854775807L;
            long p = mo19143p();
            return p != -9223372036854775807L ? p : j;
        }
        long p2 = this.f5194e.mo19143p();
        if (p2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C3151e.m7759g(p2 >= this.f5198o);
        long j2 = this.f5199p;
        if (j2 != Long.MIN_VALUE && p2 > j2) {
            z = false;
        }
        C3151e.m7759g(z);
        return p2;
    }

    /* renamed from: q */
    public void mo19144q(C3012t.C3013a aVar, long j) {
        this.f5195l = aVar;
        this.f5194e.mo19144q(this, j);
    }

    /* renamed from: r */
    public TrackGroupArray mo19145r() {
        return this.f5194e.mo19145r();
    }

    /* renamed from: t */
    public void mo19147t(long j, boolean z) {
        this.f5194e.mo19147t(j, z);
    }
}
