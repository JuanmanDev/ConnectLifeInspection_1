package p040c.p200q.p201a.p219b.p261o0;

import java.util.Arrays;

/* renamed from: c.q.a.b.o0.n */
/* compiled from: LongArray */
public final class C3164n {

    /* renamed from: a */
    public int f5847a;

    /* renamed from: b */
    public long[] f5848b;

    public C3164n() {
        this(32);
    }

    /* renamed from: a */
    public void mo19974a(long j) {
        int i = this.f5847a;
        long[] jArr = this.f5848b;
        if (i == jArr.length) {
            this.f5848b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f5848b;
        int i2 = this.f5847a;
        this.f5847a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public long mo19975b(int i) {
        if (i >= 0 && i < this.f5847a) {
            return this.f5848b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f5847a);
    }

    /* renamed from: c */
    public int mo19976c() {
        return this.f5847a;
    }

    /* renamed from: d */
    public long[] mo19977d() {
        return Arrays.copyOf(this.f5848b, this.f5847a);
    }

    public C3164n(int i) {
        this.f5848b = new long[i];
    }
}
