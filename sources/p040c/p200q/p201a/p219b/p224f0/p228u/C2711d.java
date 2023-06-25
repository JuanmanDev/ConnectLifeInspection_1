package p040c.p200q.p201a.p219b.p224f0.p228u;

import android.util.Pair;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import p040c.p200q.p201a.p219b.C2627d;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2685p;
import p040c.p200q.p201a.p219b.p224f0.p228u.C2712e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.f0.u.d */
/* compiled from: MlltSeeker */
public final class C2711d implements C2712e.C2713a {

    /* renamed from: a */
    public final long[] f3633a;

    /* renamed from: b */
    public final long[] f3634b;

    /* renamed from: c */
    public final long f3635c;

    public C2711d(long[] jArr, long[] jArr2) {
        this.f3633a = jArr;
        this.f3634b = jArr2;
        this.f3635c = C2627d.m5057a(jArr2[jArr2.length - 1]);
    }

    /* renamed from: b */
    public static C2711d m5427b(long j, MlltFrame mlltFrame) {
        int length = mlltFrame.f7768o.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j2 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (mlltFrame.f7766m + mlltFrame.f7768o[i3]);
            j2 += (long) (mlltFrame.f7767n + mlltFrame.f7769p[i3]);
            jArr[i2] = j;
            jArr2[i2] = j2;
        }
        return new C2711d(jArr, jArr2);
    }

    /* renamed from: e */
    public static Pair<Long, Long> m5428e(long j, long[] jArr, long[] jArr2) {
        int e = C3152e0.m7795e(jArr, j, true, true);
        long j2 = jArr[e];
        long j3 = jArr2[e];
        int i = e + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (((double) j) - ((double) j2)) / ((double) (j4 - j2))) * ((double) (jArr2[i] - j3)))) + j3));
    }

    /* renamed from: a */
    public long mo18635a(long j) {
        return C2627d.m5057a(((Long) m5428e(j, this.f3633a, this.f3634b).second).longValue());
    }

    /* renamed from: c */
    public long mo18636c() {
        return -1;
    }

    /* renamed from: d */
    public boolean mo18503d() {
        return true;
    }

    /* renamed from: h */
    public C2682o.C2683a mo18504h(long j) {
        Pair<Long, Long> e = m5428e(C2627d.m5058b(C3152e0.m7815o(j, 0, this.f3635c)), this.f3634b, this.f3633a);
        return new C2682o.C2683a(new C2685p(C2627d.m5057a(((Long) e.first).longValue()), ((Long) e.second).longValue()));
    }

    /* renamed from: i */
    public long mo18505i() {
        return this.f3635c;
    }
}
