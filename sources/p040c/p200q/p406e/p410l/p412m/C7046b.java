package p040c.p200q.p406e.p410l.p412m;

/* renamed from: c.q.e.l.m.b */
/* compiled from: GenericGFPoly */
public final class C7046b {

    /* renamed from: a */
    public final C7045a f13510a;

    /* renamed from: b */
    public final int[] f13511b;

    public C7046b(C7045a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f13510a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f13511b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f13511b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f13511b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C7046b mo32588a(C7046b bVar) {
        if (!this.f13510a.equals(bVar.f13510a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo32592e()) {
            return bVar;
        } else {
            if (bVar.mo32592e()) {
                return this;
            }
            int[] iArr = this.f13511b;
            int[] iArr2 = bVar.f13511b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = C7045a.m20891a(iArr2[i - length], iArr[i]);
            }
            return new C7046b(this.f13510a, iArr4);
        }
    }

    /* renamed from: b */
    public int mo32589b(int i) {
        if (i == 0) {
            return mo32590c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f13511b) {
                i2 = C7045a.m20891a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f13511b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            i3 = C7045a.m20891a(this.f13510a.mo32586j(i, i3), this.f13511b[i4]);
        }
        return i3;
    }

    /* renamed from: c */
    public int mo32590c(int i) {
        int[] iArr = this.f13511b;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: d */
    public int mo32591d() {
        return this.f13511b.length - 1;
    }

    /* renamed from: e */
    public boolean mo32592e() {
        return this.f13511b[0] == 0;
    }

    /* renamed from: f */
    public C7046b mo32593f(int i) {
        if (i == 0) {
            return this.f13510a.mo32583g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f13511b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f13510a.mo32586j(this.f13511b[i2], i);
        }
        return new C7046b(this.f13510a, iArr);
    }

    /* renamed from: g */
    public C7046b mo32594g(C7046b bVar) {
        if (!this.f13510a.equals(bVar.f13510a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo32592e() || bVar.mo32592e()) {
            return this.f13510a.mo32583g();
        } else {
            int[] iArr = this.f13511b;
            int length = iArr.length;
            int[] iArr2 = bVar.f13511b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C7045a.m20891a(iArr3[i4], this.f13510a.mo32586j(i2, iArr2[i3]));
                }
            }
            return new C7046b(this.f13510a, iArr3);
        }
    }

    /* renamed from: h */
    public C7046b mo32595h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f13510a.mo32583g();
        } else {
            int length = this.f13511b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f13510a.mo32586j(this.f13511b[i3], i2);
            }
            return new C7046b(this.f13510a, iArr);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo32591d() * 8);
        for (int d = mo32591d(); d >= 0; d--) {
            int c = mo32590c(d);
            if (c != 0) {
                if (c < 0) {
                    sb.append(" - ");
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c != 1) {
                    int i = this.f13510a.mo32585i(c);
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (d != 0) {
                    if (d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(d);
                    }
                }
            }
        }
        return sb.toString();
    }
}
