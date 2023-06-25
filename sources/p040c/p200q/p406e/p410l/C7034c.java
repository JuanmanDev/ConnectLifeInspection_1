package p040c.p200q.p406e.p410l;

/* renamed from: c.q.e.l.c */
/* compiled from: BitSource */
public final class C7034c {

    /* renamed from: a */
    public final byte[] f13459a;

    /* renamed from: b */
    public int f13460b;

    /* renamed from: c */
    public int f13461c;

    public C7034c(byte[] bArr) {
        this.f13459a = bArr;
    }

    /* renamed from: a */
    public int mo32549a() {
        return ((this.f13459a.length - this.f13460b) * 8) - this.f13461c;
    }

    /* renamed from: b */
    public int mo32550b() {
        return this.f13461c;
    }

    /* renamed from: c */
    public int mo32551c() {
        return this.f13460b;
    }

    /* renamed from: d */
    public int mo32552d(int i) {
        if (i <= 0 || i > 32 || i > mo32549a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.f13461c;
        byte b = 0;
        if (i2 > 0) {
            int i3 = 8 - i2;
            int i4 = i < i3 ? i : i3;
            int i5 = i3 - i4;
            byte[] bArr = this.f13459a;
            int i6 = this.f13460b;
            int i7 = (((255 >> (8 - i4)) << i5) & bArr[i6]) >> i5;
            i -= i4;
            int i8 = this.f13461c + i4;
            this.f13461c = i8;
            if (i8 == 8) {
                this.f13461c = 0;
                this.f13460b = i6 + 1;
            }
            b = i7;
        }
        if (i <= 0) {
            return b;
        }
        while (i >= 8) {
            int i9 = b << 8;
            byte[] bArr2 = this.f13459a;
            int i10 = this.f13460b;
            b = (bArr2[i10] & 255) | i9;
            this.f13460b = i10 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b;
        }
        int i11 = 8 - i;
        int i12 = (b << i) | ((((255 >> i11) << i11) & this.f13459a[this.f13460b]) >> i11);
        this.f13461c += i;
        return i12;
    }
}
