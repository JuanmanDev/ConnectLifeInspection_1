package p040c.p200q.p201a.p219b.p224f0.p228u;

import androidx.annotation.Nullable;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.p224f0.C2680m;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2685p;
import p040c.p200q.p201a.p219b.p224f0.p228u.C2712e;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.u.g */
/* compiled from: XingSeeker */
public final class C2715g implements C2712e.C2713a {

    /* renamed from: a */
    public final long f3658a;

    /* renamed from: b */
    public final int f3659b;

    /* renamed from: c */
    public final long f3660c;

    /* renamed from: d */
    public final long f3661d;

    /* renamed from: e */
    public final long f3662e;
    @Nullable

    /* renamed from: f */
    public final long[] f3663f;

    public C2715g(long j, int i, long j2) {
        this(j, i, j2, -1, (long[]) null);
    }

    @Nullable
    /* renamed from: b */
    public static C2715g m5456b(long j, long j2, C2680m mVar, C3173t tVar) {
        int C;
        long j3 = j;
        C2680m mVar2 = mVar;
        int i = mVar2.f3442g;
        int i2 = mVar2.f3439d;
        int j4 = tVar.mo20017j();
        if ((j4 & 1) != 1 || (C = tVar.mo19997C()) == 0) {
            return null;
        }
        long c0 = C3152e0.m7792c0((long) C, ((long) i) * EventLoop_commonKt.MS_TO_NS, (long) i2);
        if ((j4 & 6) != 6) {
            return new C2715g(j2, mVar2.f3438c, c0);
        }
        long C2 = (long) tVar.mo19997C();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) tVar.mo20032y();
        }
        if (j3 != -1) {
            long j5 = j2 + C2;
            if (j3 != j5) {
                C3163m.m7880f("XingSeeker", "XING data size mismatch: " + j3 + ", " + j5);
            }
        }
        return new C2715g(j2, mVar2.f3438c, c0, C2, jArr);
    }

    /* renamed from: a */
    public long mo18635a(long j) {
        long j2;
        long j3 = j - this.f3658a;
        if (!mo18503d() || j3 <= ((long) this.f3659b)) {
            return 0;
        }
        long[] jArr = this.f3663f;
        C3151e.m7757e(jArr);
        long[] jArr2 = jArr;
        double d = (((double) j3) * 256.0d) / ((double) this.f3661d);
        int e = C3152e0.m7795e(jArr2, (long) d, true, true);
        long e2 = mo18642e(e);
        long j4 = jArr2[e];
        int i = e + 1;
        long e3 = mo18642e(i);
        if (e == 99) {
            j2 = 256;
        } else {
            j2 = jArr2[i];
        }
        return e2 + Math.round((j4 == j2 ? 0.0d : (d - ((double) j4)) / ((double) (j2 - j4))) * ((double) (e3 - e2)));
    }

    /* renamed from: c */
    public long mo18636c() {
        return this.f3662e;
    }

    /* renamed from: d */
    public boolean mo18503d() {
        return this.f3663f != null;
    }

    /* renamed from: e */
    public final long mo18642e(int i) {
        return (this.f3660c * ((long) i)) / 100;
    }

    /* renamed from: h */
    public C2682o.C2683a mo18504h(long j) {
        double d;
        if (!mo18503d()) {
            return new C2682o.C2683a(new C2685p(0, this.f3658a + ((long) this.f3659b)));
        }
        long o = C3152e0.m7815o(j, 0, this.f3660c);
        double d2 = (((double) o) * 100.0d) / ((double) this.f3660c);
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = this.f3663f;
                C3151e.m7757e(jArr);
                long[] jArr2 = jArr;
                double d4 = (double) jArr2[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = (double) jArr2[i + 1];
                }
                d3 = d4 + ((d2 - ((double) i)) * (d - d4));
            }
        }
        return new C2682o.C2683a(new C2685p(o, this.f3658a + C3152e0.m7815o(Math.round((d3 / 256.0d) * ((double) this.f3661d)), (long) this.f3659b, this.f3661d - 1)));
    }

    /* renamed from: i */
    public long mo18505i() {
        return this.f3660c;
    }

    public C2715g(long j, int i, long j2, long j3, @Nullable long[] jArr) {
        this.f3658a = j;
        this.f3659b = i;
        this.f3660c = j2;
        this.f3663f = jArr;
        this.f3661d = j3;
        this.f3662e = j3 != -1 ? j + j3 : -1;
    }
}
