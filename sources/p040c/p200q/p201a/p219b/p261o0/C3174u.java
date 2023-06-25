package p040c.p200q.p201a.p219b.p261o0;

/* renamed from: c.q.a.b.o0.u */
/* compiled from: ParsableNalUnitBitArray */
public final class C3174u {

    /* renamed from: a */
    public byte[] f5880a;

    /* renamed from: b */
    public int f5881b;

    /* renamed from: c */
    public int f5882c;

    /* renamed from: d */
    public int f5883d;

    public C3174u(byte[] bArr, int i, int i2) {
        mo20042i(bArr, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f5881b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20034a() {
        /*
            r2 = this;
            int r0 = r2.f5882c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f5881b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f5883d
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
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p261o0.C3174u.mo20034a():void");
    }

    /* renamed from: b */
    public boolean mo20035b(int i) {
        int i2 = this.f5882c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f5883d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f5881b) {
                int i6 = this.f5881b;
            } else if (mo20043j(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f5881b;
        if (i4 < i62) {
            return true;
        }
        if (i4 == i62 && i5 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo20036c() {
        int i = this.f5882c;
        int i2 = this.f5883d;
        int i3 = 0;
        while (this.f5882c < this.f5881b && !mo20037d()) {
            i3++;
        }
        boolean z = this.f5882c == this.f5881b;
        this.f5882c = i;
        this.f5883d = i2;
        if (z || !mo20035b((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo20037d() {
        boolean z = (this.f5880a[this.f5882c] & (128 >> this.f5883d)) != 0;
        mo20044k();
        return z;
    }

    /* renamed from: e */
    public int mo20038e(int i) {
        int i2;
        int i3;
        this.f5883d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f5883d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f5883d = i5;
            byte[] bArr = this.f5880a;
            int i6 = this.f5882c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!mo20043j(i6 + 1)) {
                i3 = 1;
            }
            this.f5882c = i6 + i3;
        }
        byte[] bArr2 = this.f5880a;
        int i7 = this.f5882c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f5883d = 0;
            if (!mo20043j(i7 + 1)) {
                i3 = 1;
            }
            this.f5882c = i7 + i3;
        }
        mo20034a();
        return i8;
    }

    /* renamed from: f */
    public final int mo20039f() {
        int i = 0;
        int i2 = 0;
        while (!mo20037d()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo20038e(i2);
        }
        return i3 + i;
    }

    /* renamed from: g */
    public int mo20040g() {
        int f = mo20039f();
        return (f % 2 == 0 ? -1 : 1) * ((f + 1) / 2);
    }

    /* renamed from: h */
    public int mo20041h() {
        return mo20039f();
    }

    /* renamed from: i */
    public void mo20042i(byte[] bArr, int i, int i2) {
        this.f5880a = bArr;
        this.f5882c = i;
        this.f5881b = i2;
        this.f5883d = 0;
        mo20034a();
    }

    /* renamed from: j */
    public final boolean mo20043j(int i) {
        if (2 <= i && i < this.f5881b) {
            byte[] bArr = this.f5880a;
            return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
        }
    }

    /* renamed from: k */
    public void mo20044k() {
        int i = 1;
        int i2 = this.f5883d + 1;
        this.f5883d = i2;
        if (i2 == 8) {
            this.f5883d = 0;
            int i3 = this.f5882c;
            if (mo20043j(i3 + 1)) {
                i = 2;
            }
            this.f5882c = i3 + i;
        }
        mo20034a();
    }

    /* renamed from: l */
    public void mo20045l(int i) {
        int i2 = this.f5882c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f5882c = i4;
        int i5 = this.f5883d + (i - (i3 * 8));
        this.f5883d = i5;
        if (i5 > 7) {
            this.f5882c = i4 + 1;
            this.f5883d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f5882c) {
                mo20034a();
                return;
            } else if (mo20043j(i2)) {
                this.f5882c++;
                i2 += 2;
            }
        }
    }
}
