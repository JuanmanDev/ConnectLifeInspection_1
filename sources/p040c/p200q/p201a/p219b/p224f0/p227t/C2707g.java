package p040c.p200q.p201a.p219b.p224f0.p227t;

import p040c.p200q.p201a.p219b.p224f0.C2675h;

/* renamed from: c.q.a.b.f0.t.g */
/* compiled from: VarintReader */
public final class C2707g {

    /* renamed from: d */
    public static final long[] f3627d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f3628a = new byte[8];

    /* renamed from: b */
    public int f3629b;

    /* renamed from: c */
    public int f3630c;

    /* renamed from: a */
    public static long m5418a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f3627d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: c */
    public static int m5419c(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f3627d;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    /* renamed from: b */
    public int mo18631b() {
        return this.f3630c;
    }

    /* renamed from: d */
    public long mo18632d(C2675h hVar, boolean z, boolean z2, int i) {
        if (this.f3629b == 0) {
            if (!hVar.mo18522a(this.f3628a, 0, 1, z)) {
                return -1;
            }
            int c = m5419c(this.f3628a[0] & 255);
            this.f3630c = c;
            if (c != -1) {
                this.f3629b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f3630c;
        if (i2 > i) {
            this.f3629b = 0;
            return -2;
        }
        if (i2 != 1) {
            hVar.readFully(this.f3628a, 1, i2 - 1);
        }
        this.f3629b = 0;
        return m5418a(this.f3628a, this.f3630c, z2);
    }

    /* renamed from: e */
    public void mo18633e() {
        this.f3629b = 0;
        this.f3630c = 0;
    }
}
