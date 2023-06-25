package p040c.p200q.p201a.p219b.p224f0.p232y;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.p224f0.C2670c;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3172s;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.g */
/* compiled from: AdtsExtractor */
public final class C2788g implements C2674g {

    /* renamed from: n */
    public static final int f4119n = C3152e0.m7764D("ID3");

    /* renamed from: a */
    public final int f4120a;

    /* renamed from: b */
    public final C2790h f4121b;

    /* renamed from: c */
    public final C3173t f4122c;

    /* renamed from: d */
    public final C3173t f4123d;

    /* renamed from: e */
    public final C3172s f4124e;

    /* renamed from: f */
    public final long f4125f;
    @Nullable

    /* renamed from: g */
    public C2676i f4126g;

    /* renamed from: h */
    public long f4127h;

    /* renamed from: i */
    public long f4128i;

    /* renamed from: j */
    public int f4129j;

    /* renamed from: k */
    public boolean f4130k;

    /* renamed from: l */
    public boolean f4131l;

    /* renamed from: m */
    public boolean f4132m;

    static {
        C2771b bVar = C2771b.f4049a;
    }

    public C2788g() {
        this(0);
    }

    /* renamed from: c */
    public static int m5794c(int i, long j) {
        return (int) ((((long) (i * 8)) * EventLoop_commonKt.MS_TO_NS) / j);
    }

    /* renamed from: h */
    public static /* synthetic */ C2674g[] m5795h() {
        return new C2674g[]{new C2788g()};
    }

    /* renamed from: a */
    public final void mo18773a(C2675h hVar) {
        if (!this.f4130k) {
            this.f4129j = -1;
            hVar.mo18527f();
            long j = 0;
            if (hVar.getPosition() == 0) {
                mo18776j(hVar);
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!hVar.mo18523b(this.f4123d.f5877a, 0, 2, true)) {
                    break;
                }
                this.f4123d.mo20006L(0);
                if (!C2790h.m5806l(this.f4123d.mo19999E())) {
                    break;
                } else if (!hVar.mo18523b(this.f4123d.f5877a, 0, 4, true)) {
                    break;
                } else {
                    this.f4124e.mo19991n(14);
                    int h = this.f4124e.mo19985h(13);
                    if (h > 6) {
                        j += (long) h;
                        i2++;
                        if (i2 != 1000) {
                            if (!hVar.mo18530h(h - 6, true)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        this.f4130k = true;
                        throw new ParserException("Malformed ADTS stream");
                    }
                }
            }
            i = i2;
            hVar.mo18527f();
            if (i > 0) {
                this.f4129j = (int) (j / ((long) i));
            } else {
                this.f4129j = -1;
            }
            this.f4130k = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r9.mo18527f();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if ((r3 - r0) < 8192) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo18547b(p040c.p200q.p201a.p219b.p224f0.C2675h r9) {
        /*
            r8 = this;
            int r0 = r8.mo18776j(r9)
            r1 = 0
            r3 = r0
        L_0x0006:
            r2 = r1
            r4 = r2
        L_0x0008:
            c.q.a.b.o0.t r5 = r8.f4123d
            byte[] r5 = r5.f5877a
            r6 = 2
            r9.mo18531i(r5, r1, r6)
            c.q.a.b.o0.t r5 = r8.f4123d
            r5.mo20006L(r1)
            c.q.a.b.o0.t r5 = r8.f4123d
            int r5 = r5.mo19999E()
            boolean r5 = p040c.p200q.p201a.p219b.p224f0.p232y.C2790h.m5806l(r5)
            if (r5 != 0) goto L_0x0031
            r9.mo18527f()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 < r4) goto L_0x002d
            return r1
        L_0x002d:
            r9.mo18525d(r3)
            goto L_0x0006
        L_0x0031:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L_0x003b
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L_0x003b
            return r5
        L_0x003b:
            c.q.a.b.o0.t r5 = r8.f4123d
            byte[] r5 = r5.f5877a
            r9.mo18531i(r5, r1, r6)
            c.q.a.b.o0.s r5 = r8.f4124e
            r6 = 14
            r5.mo19991n(r6)
            c.q.a.b.o0.s r5 = r8.f4124e
            r6 = 13
            int r5 = r5.mo19985h(r6)
            r6 = 6
            if (r5 > r6) goto L_0x0055
            return r1
        L_0x0055:
            int r6 = r5 + -6
            r9.mo18525d(r6)
            int r4 = r4 + r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p224f0.p232y.C2788g.mo18547b(c.q.a.b.f0.h):boolean");
    }

    /* renamed from: d */
    public final C2682o mo18774d(long j) {
        return new C2670c(j, this.f4128i, m5794c(this.f4129j, this.f4121b.mo18783j()), this.f4129j);
    }

    /* renamed from: e */
    public int mo18548e(C2675h hVar, C2681n nVar) {
        long e = hVar.mo18526e();
        boolean z = ((this.f4120a & 1) == 0 || e == -1) ? false : true;
        if (z) {
            mo18773a(hVar);
        }
        int read = hVar.read(this.f4122c.f5877a, 0, 2048);
        boolean z2 = read == -1;
        mo18775i(e, z, z2);
        if (z2) {
            return -1;
        }
        this.f4122c.mo20006L(0);
        this.f4122c.mo20005K(read);
        if (!this.f4131l) {
            this.f4121b.mo18770f(this.f4127h, 4);
            this.f4131l = true;
        }
        this.f4121b.mo18766b(this.f4122c);
        return 0;
    }

    /* renamed from: f */
    public void mo18549f(C2676i iVar) {
        this.f4126g = iVar;
        this.f4121b.mo18769e(iVar, new C2781e0.C2785d(0, 1));
        iVar.mo18554o();
    }

    /* renamed from: g */
    public void mo18550g(long j, long j2) {
        this.f4131l = false;
        this.f4121b.mo18767c();
        this.f4127h = this.f4125f + j2;
    }

    /* renamed from: i */
    public final void mo18775i(long j, boolean z, boolean z2) {
        if (!this.f4132m) {
            boolean z3 = z && this.f4129j > 0;
            if (!z3 || this.f4121b.mo18783j() != -9223372036854775807L || z2) {
                C2676i iVar = this.f4126g;
                C3151e.m7757e(iVar);
                C2676i iVar2 = iVar;
                if (!z3 || this.f4121b.mo18783j() == -9223372036854775807L) {
                    iVar2.mo18553c(new C2682o.C2684b(-9223372036854775807L));
                } else {
                    iVar2.mo18553c(mo18774d(j));
                }
                this.f4132m = true;
            }
        }
    }

    /* renamed from: j */
    public final int mo18776j(C2675h hVar) {
        int i = 0;
        while (true) {
            hVar.mo18531i(this.f4123d.f5877a, 0, 10);
            this.f4123d.mo20006L(0);
            if (this.f4123d.mo19996B() != f4119n) {
                break;
            }
            this.f4123d.mo20007M(3);
            int x = this.f4123d.mo20031x();
            i += x + 10;
            hVar.mo18525d(x);
        }
        hVar.mo18527f();
        hVar.mo18525d(i);
        if (this.f4128i == -1) {
            this.f4128i = (long) i;
        }
        return i;
    }

    public void release() {
    }

    public C2788g(long j) {
        this(j, 0);
    }

    public C2788g(long j, int i) {
        this.f4125f = j;
        this.f4127h = j;
        this.f4120a = i;
        this.f4121b = new C2790h(true);
        this.f4122c = new C3173t(2048);
        this.f4129j = -1;
        this.f4128i = -1;
        C3173t tVar = new C3173t(10);
        this.f4123d = tVar;
        this.f4124e = new C3172s(tVar.f5877a);
    }
}
