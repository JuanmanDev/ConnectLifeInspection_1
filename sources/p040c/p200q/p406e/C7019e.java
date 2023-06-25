package p040c.p200q.p406e;

/* renamed from: c.q.e.e */
/* compiled from: PlanarYUVLuminanceSource */
public final class C7019e extends C7017c {

    /* renamed from: c */
    public final byte[] f13410c;

    /* renamed from: d */
    public final int f13411d;

    /* renamed from: e */
    public final int f13412e;

    /* renamed from: f */
    public final int f13413f;

    /* renamed from: g */
    public final int f13414g;

    public C7019e(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f13410c = bArr;
        this.f13411d = i;
        this.f13412e = i2;
        this.f13413f = i3;
        this.f13414g = i4;
        if (z) {
            mo32476g(i5, i6);
        }
    }

    /* renamed from: b */
    public byte[] mo32465b() {
        int d = mo32467d();
        int a = mo32464a();
        if (d == this.f13411d && a == this.f13412e) {
            return this.f13410c;
        }
        int i = d * a;
        byte[] bArr = new byte[i];
        int i2 = this.f13414g;
        int i3 = this.f13411d;
        int i4 = (i2 * i3) + this.f13413f;
        if (d == i3) {
            System.arraycopy(this.f13410c, i4, bArr, 0, i);
            return bArr;
        }
        for (int i5 = 0; i5 < a; i5++) {
            System.arraycopy(this.f13410c, i4, bArr, i5 * d, d);
            i4 += this.f13411d;
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
        System.arraycopy(this.f13410c, ((i + this.f13414g) * this.f13411d) + this.f13413f, bArr, 0, d);
        return bArr;
    }

    /* renamed from: g */
    public final void mo32476g(int i, int i2) {
        byte[] bArr = this.f13410c;
        int i3 = (this.f13414g * this.f13411d) + this.f13413f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f13411d;
        }
    }
}
