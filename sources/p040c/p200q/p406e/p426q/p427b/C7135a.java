package p040c.p200q.p406e.p426q.p427b;

import com.google.zxing.FormatException;
import p040c.p200q.p406e.p410l.C7033b;

/* renamed from: c.q.e.q.b.a */
/* compiled from: BitMatrixParser */
public final class C7135a {

    /* renamed from: a */
    public final C7033b f13733a;

    /* renamed from: b */
    public C7150h f13734b;

    /* renamed from: c */
    public C7148f f13735c;

    /* renamed from: d */
    public boolean f13736d;

    public C7135a(C7033b bVar) {
        int h = bVar.mo32538h();
        if (h < 21 || (h & 3) != 1) {
            throw FormatException.getFormatInstance();
        }
        this.f13733a = bVar;
    }

    /* renamed from: a */
    public final int mo32846a(int i, int i2, int i3) {
        return this.f13736d ? this.f13733a.mo32534d(i2, i) : this.f13733a.mo32534d(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* renamed from: b */
    public void mo32847b() {
        int i = 0;
        while (i < this.f13733a.mo32542k()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f13733a.mo32538h(); i3++) {
                if (this.f13733a.mo32534d(i, i3) != this.f13733a.mo32534d(i3, i)) {
                    this.f13733a.mo32532c(i3, i);
                    this.f13733a.mo32532c(i, i3);
                }
            }
            i = i2;
        }
    }

    /* renamed from: c */
    public byte[] mo32848c() {
        C7148f d = mo32849d();
        C7150h e = mo32850e();
        C7137c cVar = C7137c.values()[d.mo32860c()];
        int h = this.f13733a.mo32538h();
        cVar.mo32856d(this.f13733a, h);
        C7033b a = e.mo32865a();
        byte[] bArr = new byte[e.mo32869h()];
        int i = h - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < h; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!a.mo32534d(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.f13733a.mo32534d(i9, i7)) {
                            i5 |= 1;
                        }
                        if (i4 == 8) {
                            bArr[i3] = (byte) i5;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == e.mo32869h()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: d */
    public C7148f mo32849d() {
        C7148f fVar = this.f13735c;
        if (fVar != null) {
            return fVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = mo32846a(i3, 8, i2);
        }
        int a = mo32846a(8, 7, mo32846a(8, 8, mo32846a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = mo32846a(8, i4, a);
        }
        int h = this.f13733a.mo32538h();
        int i5 = h - 7;
        for (int i6 = h - 1; i6 >= i5; i6--) {
            i = mo32846a(8, i6, i);
        }
        for (int i7 = h - 8; i7 < h; i7++) {
            i = mo32846a(i7, 8, i);
        }
        C7148f a2 = C7148f.m21360a(a, i);
        this.f13735c = a2;
        if (a2 != null) {
            return a2;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: e */
    public C7150h mo32850e() {
        C7150h hVar = this.f13734b;
        if (hVar != null) {
            return hVar;
        }
        int h = this.f13733a.mo32538h();
        int i = (h - 17) / 4;
        if (i <= 6) {
            return C7150h.m21369i(i);
        }
        int i2 = h - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = h - 9; i6 >= i2; i6--) {
                i4 = mo32846a(i6, i5, i4);
            }
        }
        C7150h c = C7150h.m21367c(i4);
        if (c == null || c.mo32867e() != h) {
            for (int i7 = 5; i7 >= 0; i7--) {
                for (int i8 = h - 9; i8 >= i2; i8--) {
                    i3 = mo32846a(i7, i8, i3);
                }
            }
            C7150h c2 = C7150h.m21367c(i3);
            if (c2 == null || c2.mo32867e() != h) {
                throw FormatException.getFormatInstance();
            }
            this.f13734b = c2;
            return c2;
        }
        this.f13734b = c;
        return c;
    }

    /* renamed from: f */
    public void mo32851f() {
        if (this.f13735c != null) {
            C7137c.values()[this.f13735c.mo32860c()].mo32856d(this.f13733a, this.f13733a.mo32538h());
        }
    }

    /* renamed from: g */
    public void mo32852g(boolean z) {
        this.f13734b = null;
        this.f13735c = null;
        this.f13736d = z;
    }
}
