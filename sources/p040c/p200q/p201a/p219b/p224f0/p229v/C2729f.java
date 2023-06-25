package p040c.p200q.p201a.p219b.p224f0.p229v;

import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.f0.v.f */
/* compiled from: FixedSampleSizeRechunker */
public final class C2729f {

    /* renamed from: c.q.a.b.f0.v.f$b */
    /* compiled from: FixedSampleSizeRechunker */
    public static final class C2731b {

        /* renamed from: a */
        public final long[] f3807a;

        /* renamed from: b */
        public final int[] f3808b;

        /* renamed from: c */
        public final int f3809c;

        /* renamed from: d */
        public final long[] f3810d;

        /* renamed from: e */
        public final int[] f3811e;

        /* renamed from: f */
        public final long f3812f;

        public C2731b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f3807a = jArr;
            this.f3808b = iArr;
            this.f3809c = i;
            this.f3810d = jArr2;
            this.f3811e = iArr2;
            this.f3812f = j;
        }
    }

    /* renamed from: a */
    public static C2731b m5510a(int i, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i2 = 8192 / i;
        int i3 = 0;
        for (int h : iArr2) {
            i3 += C3152e0.m7801h(h, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr3 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr4 = new int[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            int i8 = iArr2[i7];
            long j2 = jArr[i7];
            while (i8 > 0) {
                int min = Math.min(i2, i8);
                jArr2[i5] = j2;
                iArr3[i5] = i * min;
                i6 = Math.max(i6, iArr3[i5]);
                jArr3[i5] = ((long) i4) * j;
                iArr4[i5] = 1;
                j2 += (long) iArr3[i5];
                i4 += min;
                i8 -= min;
                i5++;
            }
        }
        return new C2731b(jArr2, iArr3, i6, jArr3, iArr4, j * ((long) i4));
    }
}
