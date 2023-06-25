package p040c.p200q.p406e.p422p.p423d.p424k;

/* renamed from: c.q.e.p.d.k.c */
/* compiled from: ModulusPoly */
public final class C7131c {

    /* renamed from: a */
    public final C7130b f13723a;

    /* renamed from: b */
    public final int[] f13724b;

    public C7131c(C7130b bVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f13723a = bVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f13724b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f13724b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f13724b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C7131c mo32833a(C7131c cVar) {
        if (!this.f13723a.equals(cVar.f13723a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo32837e()) {
            return cVar;
        } else {
            if (cVar.mo32837e()) {
                return this;
            }
            int[] iArr = this.f13724b;
            int[] iArr2 = cVar.f13724b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = this.f13723a.mo32823a(iArr2[i - length], iArr[i]);
            }
            return new C7131c(this.f13723a, iArr4);
        }
    }

    /* renamed from: b */
    public int mo32834b(int i) {
        if (i == 0) {
            return mo32835c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f13724b) {
                i2 = this.f13723a.mo32823a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f13724b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            C7130b bVar = this.f13723a;
            i3 = bVar.mo32823a(bVar.mo32831i(i, i3), this.f13724b[i4]);
        }
        return i3;
    }

    /* renamed from: c */
    public int mo32835c(int i) {
        int[] iArr = this.f13724b;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: d */
    public int mo32836d() {
        return this.f13724b.length - 1;
    }

    /* renamed from: e */
    public boolean mo32837e() {
        return this.f13724b[0] == 0;
    }

    /* renamed from: f */
    public C7131c mo32838f(int i) {
        if (i == 0) {
            return this.f13723a.mo32828f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f13724b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f13723a.mo32831i(this.f13724b[i2], i);
        }
        return new C7131c(this.f13723a, iArr);
    }

    /* renamed from: g */
    public C7131c mo32839g(C7131c cVar) {
        if (!this.f13723a.equals(cVar.f13723a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo32837e() || cVar.mo32837e()) {
            return this.f13723a.mo32828f();
        } else {
            int[] iArr = this.f13724b;
            int length = iArr.length;
            int[] iArr2 = cVar.f13724b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    C7130b bVar = this.f13723a;
                    iArr3[i4] = bVar.mo32823a(iArr3[i4], bVar.mo32831i(i2, iArr2[i3]));
                }
            }
            return new C7131c(this.f13723a, iArr3);
        }
    }

    /* renamed from: h */
    public C7131c mo32840h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f13723a.mo32828f();
        } else {
            int length = this.f13724b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f13723a.mo32831i(this.f13724b[i3], i2);
            }
            return new C7131c(this.f13723a, iArr);
        }
    }

    /* renamed from: i */
    public C7131c mo32841i() {
        int length = this.f13724b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f13723a.mo32832j(0, this.f13724b[i]);
        }
        return new C7131c(this.f13723a, iArr);
    }

    /* renamed from: j */
    public C7131c mo32842j(C7131c cVar) {
        if (!this.f13723a.equals(cVar.f13723a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (cVar.mo32837e()) {
            return this;
        } else {
            return mo32833a(cVar.mo32841i());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo32836d() * 8);
        for (int d = mo32836d(); d >= 0; d--) {
            int c = mo32835c(d);
            if (c != 0) {
                if (c < 0) {
                    sb.append(" - ");
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c != 1) {
                    sb.append(c);
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
