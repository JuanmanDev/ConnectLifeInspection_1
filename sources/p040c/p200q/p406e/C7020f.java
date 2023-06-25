package p040c.p200q.p406e;

/* renamed from: c.q.e.f */
/* compiled from: RGBLuminanceSource */
public final class C7020f extends C7017c {

    /* renamed from: c */
    public final byte[] f13415c;

    /* renamed from: d */
    public final int f13416d;

    /* renamed from: e */
    public final int f13417e;

    /* renamed from: f */
    public final int f13418f = 0;

    /* renamed from: g */
    public final int f13419g = 0;

    public C7020f(int i, int i2, int[] iArr) {
        super(i, i2);
        this.f13416d = i;
        this.f13417e = i2;
        int i3 = i * i2;
        this.f13415c = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = iArr[i4];
            this.f13415c[i4] = (byte) (((((i5 >> 16) & 255) + ((i5 >> 7) & 510)) + (i5 & 255)) / 4);
        }
    }

    /* renamed from: b */
    public byte[] mo32465b() {
        int d = mo32467d();
        int a = mo32464a();
        if (d == this.f13416d && a == this.f13417e) {
            return this.f13415c;
        }
        int i = d * a;
        byte[] bArr = new byte[i];
        int i2 = this.f13419g;
        int i3 = this.f13416d;
        int i4 = (i2 * i3) + this.f13418f;
        if (d == i3) {
            System.arraycopy(this.f13415c, i4, bArr, 0, i);
            return bArr;
        }
        for (int i5 = 0; i5 < a; i5++) {
            System.arraycopy(this.f13415c, i4, bArr, i5 * d, d);
            i4 += this.f13416d;
        }
        return bArr;
    }

    /* renamed from: c */
    public byte[] mo32466c(int i, byte[] bArr) {
        if (i < 0 || i >= mo32464a()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + i);
        }
        int d = mo32467d();
        if (bArr == null || bArr.length < d) {
            bArr = new byte[d];
        }
        System.arraycopy(this.f13415c, ((i + this.f13419g) * this.f13416d) + this.f13418f, bArr, 0, d);
        return bArr;
    }
}
