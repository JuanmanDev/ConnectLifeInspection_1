package p040c.p200q.p201a.p219b.p224f0.p228u;

import androidx.annotation.Nullable;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.p224f0.C2680m;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2685p;
import p040c.p200q.p201a.p219b.p224f0.p228u.C2712e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.u.f */
/* compiled from: VbriSeeker */
public final class C2714f implements C2712e.C2713a {

    /* renamed from: a */
    public final long[] f3654a;

    /* renamed from: b */
    public final long[] f3655b;

    /* renamed from: c */
    public final long f3656c;

    /* renamed from: d */
    public final long f3657d;

    public C2714f(long[] jArr, long[] jArr2, long j, long j2) {
        this.f3654a = jArr;
        this.f3655b = jArr2;
        this.f3656c = j;
        this.f3657d = j2;
    }

    @Nullable
    /* renamed from: b */
    public static C2714f m5450b(long j, long j2, C2680m mVar, C3173t tVar) {
        int i;
        long j3 = j;
        C2680m mVar2 = mVar;
        C3173t tVar2 = tVar;
        tVar2.mo20007M(10);
        int j4 = tVar.mo20017j();
        if (j4 <= 0) {
            return null;
        }
        int i2 = mVar2.f3439d;
        long c0 = C3152e0.m7792c0((long) j4, EventLoop_commonKt.MS_TO_NS * ((long) (i2 >= 32000 ? 1152 : 576)), (long) i2);
        int E = tVar.mo19999E();
        int E2 = tVar.mo19999E();
        int E3 = tVar.mo19999E();
        tVar2.mo20007M(2);
        long j5 = j2 + ((long) mVar2.f3438c);
        long[] jArr = new long[E];
        long[] jArr2 = new long[E];
        int i3 = 0;
        long j6 = j2;
        while (i3 < E) {
            int i4 = E2;
            jArr[i3] = (((long) i3) * c0) / ((long) E);
            long j7 = j5;
            jArr2[i3] = Math.max(j6, j7);
            if (E3 == 1) {
                i = tVar.mo20032y();
            } else if (E3 == 2) {
                i = tVar.mo19999E();
            } else if (E3 == 3) {
                i = tVar.mo19996B();
            } else if (E3 != 4) {
                return null;
            } else {
                i = tVar.mo19997C();
            }
            j6 += (long) (i * i4);
            i3++;
            j5 = j7;
            E2 = i4;
        }
        if (!(j3 == -1 || j3 == j6)) {
            C3163m.m7880f("VbriSeeker", "VBRI data size mismatch: " + j3 + ", " + j6);
        }
        return new C2714f(jArr, jArr2, c0, j6);
    }

    /* renamed from: a */
    public long mo18635a(long j) {
        return this.f3654a[C3152e0.m7795e(this.f3655b, j, true, true)];
    }

    /* renamed from: c */
    public long mo18636c() {
        return this.f3657d;
    }

    /* renamed from: d */
    public boolean mo18503d() {
        return true;
    }

    /* renamed from: h */
    public C2682o.C2683a mo18504h(long j) {
        int e = C3152e0.m7795e(this.f3654a, j, true, true);
        C2685p pVar = new C2685p(this.f3654a[e], this.f3655b[e]);
        if (pVar.f3449a >= j || e == this.f3654a.length - 1) {
            return new C2682o.C2683a(pVar);
        }
        int i = e + 1;
        return new C2682o.C2683a(pVar, new C2685p(this.f3654a[i], this.f3655b[i]));
    }

    /* renamed from: i */
    public long mo18505i() {
        return this.f3656c;
    }
}
