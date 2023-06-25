package p040c.p200q.p201a.p219b.p224f0;

import java.util.Arrays;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.f0.b */
/* compiled from: ChunkIndex */
public final class C2669b implements C2682o {

    /* renamed from: a */
    public final int f3396a;

    /* renamed from: b */
    public final int[] f3397b;

    /* renamed from: c */
    public final long[] f3398c;

    /* renamed from: d */
    public final long[] f3399d;

    /* renamed from: e */
    public final long[] f3400e;

    /* renamed from: f */
    public final long f3401f;

    public C2669b(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f3397b = iArr;
        this.f3398c = jArr;
        this.f3399d = jArr2;
        this.f3400e = jArr3;
        int length = iArr.length;
        this.f3396a = length;
        if (length > 0) {
            this.f3401f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f3401f = 0;
        }
    }

    /* renamed from: b */
    public int mo18518b(long j) {
        return C3152e0.m7795e(this.f3400e, j, true, true);
    }

    /* renamed from: d */
    public boolean mo18503d() {
        return true;
    }

    /* renamed from: h */
    public C2682o.C2683a mo18504h(long j) {
        int b = mo18518b(j);
        C2685p pVar = new C2685p(this.f3400e[b], this.f3398c[b]);
        if (pVar.f3449a >= j || b == this.f3396a - 1) {
            return new C2682o.C2683a(pVar);
        }
        int i = b + 1;
        return new C2682o.C2683a(pVar, new C2685p(this.f3400e[i], this.f3398c[i]));
    }

    /* renamed from: i */
    public long mo18505i() {
        return this.f3401f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f3396a + ", sizes=" + Arrays.toString(this.f3397b) + ", offsets=" + Arrays.toString(this.f3398c) + ", timeUs=" + Arrays.toString(this.f3400e) + ", durationsUs=" + Arrays.toString(this.f3399d) + ")";
    }
}
