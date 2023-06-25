package p040c.p200q.p406e.p410l;

import java.util.Arrays;

/* renamed from: c.q.e.l.b */
/* compiled from: BitMatrix */
public final class C7033b implements Cloneable {

    /* renamed from: e */
    public final int f13455e;

    /* renamed from: l */
    public final int f13456l;

    /* renamed from: m */
    public final int f13457m;

    /* renamed from: n */
    public final int[] f13458n;

    public C7033b(int i) {
        this(i, i);
    }

    /* renamed from: a */
    public final String mo32530a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f13456l * (this.f13455e + 1));
        for (int i = 0; i < this.f13456l; i++) {
            for (int i2 = 0; i2 < this.f13455e; i2++) {
                sb.append(mo32534d(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public C7033b clone() {
        return new C7033b(this.f13455e, this.f13456l, this.f13457m, (int[]) this.f13458n.clone());
    }

    /* renamed from: c */
    public void mo32532c(int i, int i2) {
        int i3 = (i2 * this.f13457m) + (i / 32);
        int[] iArr = this.f13458n;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: d */
    public boolean mo32534d(int i, int i2) {
        return ((this.f13458n[(i2 * this.f13457m) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: e */
    public int[] mo32535e() {
        int length = this.f13458n.length - 1;
        while (length >= 0 && this.f13458n[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f13457m;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f13458n[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7033b)) {
            return false;
        }
        C7033b bVar = (C7033b) obj;
        if (this.f13455e == bVar.f13455e && this.f13456l == bVar.f13456l && this.f13457m == bVar.f13457m && Arrays.equals(this.f13458n, bVar.f13458n)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int[] mo32537f() {
        int i = this.f13455e;
        int i2 = this.f13456l;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f13456l; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f13457m;
                if (i6 >= i7) {
                    break;
                }
                int i8 = this.f13458n[(i7 * i5) + i6];
                if (i8 != 0) {
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    if (i5 > i4) {
                        i4 = i5;
                    }
                    int i9 = i6 << 5;
                    if (i9 < i) {
                        int i10 = 0;
                        while ((i8 << (31 - i10)) == 0) {
                            i10++;
                        }
                        int i11 = i10 + i9;
                        if (i11 < i) {
                            i = i11;
                        }
                    }
                    if (i9 + 31 > i3) {
                        int i12 = 31;
                        while ((i8 >>> i12) == 0) {
                            i12--;
                        }
                        int i13 = i9 + i12;
                        if (i13 > i3) {
                            i3 = i13;
                        }
                    }
                }
                i6++;
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    /* renamed from: h */
    public int mo32538h() {
        return this.f13456l;
    }

    public int hashCode() {
        int i = this.f13455e;
        return (((((((i * 31) + i) * 31) + this.f13456l) * 31) + this.f13457m) * 31) + Arrays.hashCode(this.f13458n);
    }

    /* renamed from: i */
    public C7032a mo32540i(int i, C7032a aVar) {
        if (aVar == null || aVar.mo32523h() < this.f13455e) {
            aVar = new C7032a(this.f13455e);
        } else {
            aVar.mo32515a();
        }
        int i2 = i * this.f13457m;
        for (int i3 = 0; i3 < this.f13457m; i3++) {
            aVar.mo32528m(i3 << 5, this.f13458n[i2 + i3]);
        }
        return aVar;
    }

    /* renamed from: j */
    public int[] mo32541j() {
        int i = 0;
        while (true) {
            int[] iArr = this.f13458n;
            if (i >= iArr.length || iArr[i] != 0) {
                int[] iArr2 = this.f13458n;
            } else {
                i++;
            }
        }
        int[] iArr22 = this.f13458n;
        if (i == iArr22.length) {
            return null;
        }
        int i2 = this.f13457m;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr22[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: k */
    public int mo32542k() {
        return this.f13455e;
    }

    /* renamed from: l */
    public void mo32543l() {
        int k = mo32542k();
        int h = mo32538h();
        C7032a aVar = new C7032a(k);
        C7032a aVar2 = new C7032a(k);
        for (int i = 0; i < (h + 1) / 2; i++) {
            aVar = mo32540i(i, aVar);
            int i2 = (h - 1) - i;
            aVar2 = mo32540i(i2, aVar2);
            aVar.mo32526k();
            aVar2.mo32526k();
            mo32546p(i, aVar2);
            mo32546p(i2, aVar);
        }
    }

    /* renamed from: m */
    public void mo32544m(int i, int i2) {
        int i3 = (i2 * this.f13457m) + (i / 32);
        int[] iArr = this.f13458n;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: n */
    public void mo32545n(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f13456l || i5 > this.f13455e) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f13457m * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f13458n;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    /* renamed from: p */
    public void mo32546p(int i, C7032a aVar) {
        int[] d = aVar.mo32519d();
        int[] iArr = this.f13458n;
        int i2 = this.f13457m;
        System.arraycopy(d, 0, iArr, i * i2, i2);
    }

    /* renamed from: q */
    public String mo32547q(String str, String str2) {
        return mo32530a(str, str2, "\n");
    }

    public String toString() {
        return mo32547q("X ", "  ");
    }

    public C7033b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f13455e = i;
        this.f13456l = i2;
        int i3 = (i + 31) / 32;
        this.f13457m = i3;
        this.f13458n = new int[(i3 * i2)];
    }

    public C7033b(int i, int i2, int i3, int[] iArr) {
        this.f13455e = i;
        this.f13456l = i2;
        this.f13457m = i3;
        this.f13458n = iArr;
    }
}
