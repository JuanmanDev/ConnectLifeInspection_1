package p040c.p200q.p406e.p413m.p414b;

import com.google.zxing.FormatException;
import p040c.p200q.p406e.p410l.C7033b;

/* renamed from: c.q.e.m.b.a */
/* compiled from: BitMatrixParser */
public final class C7049a {

    /* renamed from: a */
    public final C7033b f13515a;

    /* renamed from: b */
    public final C7033b f13516b;

    /* renamed from: c */
    public final C7055e f13517c;

    public C7049a(C7033b bVar) {
        int h = bVar.mo32538h();
        if (h < 8 || h > 144 || (h & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        this.f13517c = m20917j(bVar);
        C7033b a = mo32601a(bVar);
        this.f13515a = a;
        this.f13516b = new C7033b(a.mo32542k(), this.f13515a.mo32538h());
    }

    /* renamed from: j */
    public static C7055e m20917j(C7033b bVar) {
        return C7055e.m20942h(bVar.mo32538h(), bVar.mo32542k());
    }

    /* renamed from: a */
    public final C7033b mo32601a(C7033b bVar) {
        int f = this.f13517c.mo32618f();
        int e = this.f13517c.mo32617e();
        if (bVar.mo32538h() == f) {
            int c = this.f13517c.mo32615c();
            int b = this.f13517c.mo32614b();
            int i = f / c;
            int i2 = e / b;
            C7033b bVar2 = new C7033b(i2 * b, i * c);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * c;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * b;
                    for (int i7 = 0; i7 < c; i7++) {
                        int i8 = ((c + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < b; i10++) {
                            if (bVar.mo32534d(((b + 2) * i5) + 1 + i10, i8)) {
                                bVar2.mo32544m(i6 + i10, i9);
                            }
                        }
                        C7033b bVar3 = bVar;
                    }
                    C7033b bVar4 = bVar;
                }
                C7033b bVar5 = bVar;
            }
            return bVar2;
        }
        throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
    }

    /* renamed from: b */
    public C7055e mo32602b() {
        return this.f13517c;
    }

    /* renamed from: c */
    public byte[] mo32603c() {
        byte[] bArr = new byte[this.f13517c.mo32619g()];
        int h = this.f13515a.mo32538h();
        int k = this.f13515a.mo32542k();
        int i = 0;
        int i2 = 4;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            if (i2 == h && i == 0 && !z) {
                bArr[i3] = (byte) mo32604d(h, k);
                i2 -= 2;
                i += 2;
                i3++;
                z = true;
            } else {
                int i4 = h - 2;
                if (i2 == i4 && i == 0 && (k & 3) != 0 && !z2) {
                    bArr[i3] = (byte) mo32605e(h, k);
                    i2 -= 2;
                    i += 2;
                    i3++;
                    z2 = true;
                } else if (i2 == h + 4 && i == 2 && (k & 7) == 0 && !z3) {
                    bArr[i3] = (byte) mo32606f(h, k);
                    i2 -= 2;
                    i += 2;
                    i3++;
                    z3 = true;
                } else if (i2 == i4 && i == 0 && (k & 7) == 4 && !z4) {
                    bArr[i3] = (byte) mo32607g(h, k);
                    i2 -= 2;
                    i += 2;
                    i3++;
                    z4 = true;
                } else {
                    do {
                        if (i2 < h && i >= 0 && !this.f13516b.mo32534d(i, i2)) {
                            bArr[i3] = (byte) mo32609i(i2, i, h, k);
                            i3++;
                        }
                        i2 -= 2;
                        i += 2;
                        if (i2 < 0) {
                            break;
                        }
                    } while (i < k);
                    int i5 = i2 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < k && !this.f13516b.mo32534d(i6, i5)) {
                            bArr[i3] = (byte) mo32609i(i5, i6, h, k);
                            i3++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= h) {
                            break;
                        }
                    } while (i6 >= 0);
                    i2 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i2 >= h && i >= k) {
                break;
            }
        }
        if (i3 == this.f13517c.mo32619g()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: d */
    public final int mo32604d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (mo32608h(i3, 0, i, i2) ? 1 : 0) << true;
        if (mo32608h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (mo32608h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (mo32608h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (mo32608h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (mo32608h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (mo32608h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return mo32608h(3, i8, i, i2) ? i11 | 1 : i11;
    }

    /* renamed from: e */
    public final int mo32605e(int i, int i2) {
        int i3 = (mo32608h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (mo32608h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (mo32608h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (mo32608h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (mo32608h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (mo32608h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (mo32608h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return mo32608h(1, i9, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: f */
    public final int mo32606f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (mo32608h(i3, 0, i, i2) ? 1 : 0) << true;
        int i5 = i2 - 1;
        if (mo32608h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (mo32608h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (mo32608h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (mo32608h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (mo32608h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (mo32608h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return mo32608h(1, i5, i, i2) ? i13 | 1 : i13;
    }

    /* renamed from: g */
    public final int mo32607g(int i, int i2) {
        int i3 = (mo32608h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (mo32608h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (mo32608h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (mo32608h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (mo32608h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (mo32608h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (mo32608h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return mo32608h(3, i7, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: h */
    public final boolean mo32608h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f13516b.mo32544m(i2, i);
        return this.f13515a.mo32534d(i2, i);
    }

    /* renamed from: i */
    public final int mo32609i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (mo32608h(i5, i6, i3, i4) ? 1 : 0) << true;
        int i8 = i2 - 1;
        if (mo32608h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (mo32608h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (mo32608h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (mo32608h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (mo32608h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (mo32608h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return mo32608h(i, i2, i3, i4) ? i15 | 1 : i15;
    }
}
