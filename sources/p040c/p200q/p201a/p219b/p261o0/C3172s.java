package p040c.p200q.p201a.p219b.p261o0;

/* renamed from: c.q.a.b.o0.s */
/* compiled from: ParsableBitArray */
public final class C3172s {

    /* renamed from: a */
    public byte[] f5873a;

    /* renamed from: b */
    public int f5874b;

    /* renamed from: c */
    public int f5875c;

    /* renamed from: d */
    public int f5876d;

    public C3172s() {
        this.f5873a = C3152e0.f5824f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f5876d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19978a() {
        /*
            r2 = this;
            int r0 = r2.f5874b
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f5876d
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f5875c
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
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p261o0.C3172s.mo19978a():void");
    }

    /* renamed from: b */
    public int mo19979b() {
        return ((this.f5876d - this.f5874b) * 8) - this.f5875c;
    }

    /* renamed from: c */
    public void mo19980c() {
        if (this.f5875c != 0) {
            this.f5875c = 0;
            this.f5874b++;
            mo19978a();
        }
    }

    /* renamed from: d */
    public int mo19981d() {
        C3151e.m7759g(this.f5875c == 0);
        return this.f5874b;
    }

    /* renamed from: e */
    public int mo19982e() {
        return (this.f5874b * 8) + this.f5875c;
    }

    /* renamed from: f */
    public void mo19983f(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f5875c, i2);
        int i3 = this.f5875c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.f5873a;
        int i5 = this.f5874b;
        bArr[i5] = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        int i6 = i2 - min;
        bArr[i5] = (byte) (((i >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f5873a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f5873a;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | bArr2[i7]);
        mo19993p(i2);
        mo19978a();
    }

    /* renamed from: g */
    public boolean mo19984g() {
        boolean z = (this.f5873a[this.f5874b] & (128 >> this.f5875c)) != 0;
        mo19992o();
        return z;
    }

    /* renamed from: h */
    public int mo19985h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f5875c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f5875c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f5875c = i4;
            byte[] bArr = this.f5873a;
            int i5 = this.f5874b;
            this.f5874b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f5873a;
        int i6 = this.f5874b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f5875c = 0;
            this.f5874b = i6 + 1;
        }
        mo19978a();
        return i7;
    }

    /* renamed from: i */
    public void mo19986i(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f5873a;
            int i4 = this.f5874b;
            int i5 = i4 + 1;
            this.f5874b = i5;
            byte b = bArr2[i4];
            int i6 = this.f5875c;
            bArr[i] = (byte) (b << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 != 0) {
            bArr[i3] = (byte) (bArr[i3] & (255 >> i7));
            int i8 = this.f5875c;
            if (i8 + i7 > 8) {
                byte b2 = bArr[i3];
                byte[] bArr3 = this.f5873a;
                int i9 = this.f5874b;
                this.f5874b = i9 + 1;
                bArr[i3] = (byte) (b2 | ((bArr3[i9] & 255) << i8));
                this.f5875c = i8 - 8;
            }
            int i10 = this.f5875c + i7;
            this.f5875c = i10;
            byte[] bArr4 = this.f5873a;
            int i11 = this.f5874b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
            if (i10 == 8) {
                this.f5875c = 0;
                this.f5874b = i11 + 1;
            }
            mo19978a();
        }
    }

    /* renamed from: j */
    public void mo19987j(byte[] bArr, int i, int i2) {
        C3151e.m7759g(this.f5875c == 0);
        System.arraycopy(this.f5873a, this.f5874b, bArr, i, i2);
        this.f5874b += i2;
        mo19978a();
    }

    /* renamed from: k */
    public void mo19988k(C3173t tVar) {
        mo19990m(tVar.f5877a, tVar.mo20011d());
        mo19991n(tVar.mo20010c() * 8);
    }

    /* renamed from: l */
    public void mo19989l(byte[] bArr) {
        mo19990m(bArr, bArr.length);
    }

    /* renamed from: m */
    public void mo19990m(byte[] bArr, int i) {
        this.f5873a = bArr;
        this.f5874b = 0;
        this.f5875c = 0;
        this.f5876d = i;
    }

    /* renamed from: n */
    public void mo19991n(int i) {
        int i2 = i / 8;
        this.f5874b = i2;
        this.f5875c = i - (i2 * 8);
        mo19978a();
    }

    /* renamed from: o */
    public void mo19992o() {
        int i = this.f5875c + 1;
        this.f5875c = i;
        if (i == 8) {
            this.f5875c = 0;
            this.f5874b++;
        }
        mo19978a();
    }

    /* renamed from: p */
    public void mo19993p(int i) {
        int i2 = i / 8;
        int i3 = this.f5874b + i2;
        this.f5874b = i3;
        int i4 = this.f5875c + (i - (i2 * 8));
        this.f5875c = i4;
        if (i4 > 7) {
            this.f5874b = i3 + 1;
            this.f5875c = i4 - 8;
        }
        mo19978a();
    }

    /* renamed from: q */
    public void mo19994q(int i) {
        C3151e.m7759g(this.f5875c == 0);
        this.f5874b += i;
        mo19978a();
    }

    public C3172s(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C3172s(byte[] bArr, int i) {
        this.f5873a = bArr;
        this.f5876d = i;
    }
}
