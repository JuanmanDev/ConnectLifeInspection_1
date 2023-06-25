package p040c.p200q.p201a.p219b.p224f0.p230w;

/* renamed from: c.q.a.b.f0.w.j */
/* compiled from: VorbisBitArray */
public final class C2760j {

    /* renamed from: a */
    public final byte[] f4016a;

    /* renamed from: b */
    public final int f4017b;

    /* renamed from: c */
    public int f4018c;

    /* renamed from: d */
    public int f4019d;

    public C2760j(byte[] bArr) {
        this.f4016a = bArr;
        this.f4017b = bArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f4017b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18729a() {
        /*
            r2 = this;
            int r0 = r2.f4018c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f4017b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f4019d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            p040c.p200q.p201a.p219b.p261o0.C3151e.m7759g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p224f0.p230w.C2760j.mo18729a():void");
    }

    /* renamed from: b */
    public int mo18730b() {
        return (this.f4018c * 8) + this.f4019d;
    }

    /* renamed from: c */
    public boolean mo18731c() {
        boolean z = (((this.f4016a[this.f4018c] & 255) >> this.f4019d) & 1) == 1;
        mo18733e(1);
        return z;
    }

    /* renamed from: d */
    public int mo18732d(int i) {
        int i2 = this.f4018c;
        int min = Math.min(i, 8 - this.f4019d);
        int i3 = i2 + 1;
        int i4 = ((this.f4016a[i2] & 255) >> this.f4019d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f4016a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        mo18733e(i);
        return i5;
    }

    /* renamed from: e */
    public void mo18733e(int i) {
        int i2 = i / 8;
        int i3 = this.f4018c + i2;
        this.f4018c = i3;
        int i4 = this.f4019d + (i - (i2 * 8));
        this.f4019d = i4;
        if (i4 > 7) {
            this.f4018c = i3 + 1;
            this.f4019d = i4 - 8;
        }
        mo18729a();
    }
}
