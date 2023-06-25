package p040c.p200q.p201a.p219b.p224f0.p229v;

import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.f0.v.o */
/* compiled from: TrackSampleTable */
public final class C2744o {

    /* renamed from: a */
    public final C2741l f3952a;

    /* renamed from: b */
    public final int f3953b;

    /* renamed from: c */
    public final long[] f3954c;

    /* renamed from: d */
    public final int[] f3955d;

    /* renamed from: e */
    public final int f3956e;

    /* renamed from: f */
    public final long[] f3957f;

    /* renamed from: g */
    public final int[] f3958g;

    /* renamed from: h */
    public final long f3959h;

    public C2744o(C2741l lVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = false;
        C3151e.m7753a(iArr.length == jArr2.length);
        C3151e.m7753a(jArr.length == jArr2.length);
        C3151e.m7753a(iArr2.length == jArr2.length ? true : z);
        this.f3952a = lVar;
        this.f3954c = jArr;
        this.f3955d = iArr;
        this.f3956e = i;
        this.f3957f = jArr2;
        this.f3958g = iArr2;
        this.f3959h = j;
        this.f3953b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public int mo18691a(long j) {
        for (int e = C3152e0.m7795e(this.f3957f, j, true, false); e >= 0; e--) {
            if ((this.f3958g[e] & 1) != 0) {
                return e;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int mo18692b(long j) {
        for (int c = C3152e0.m7791c(this.f3957f, j, true, false); c < this.f3957f.length; c++) {
            if ((this.f3958g[c] & 1) != 0) {
                return c;
            }
        }
        return -1;
    }
}
