package p040c.p200q.p406e.p410l;

import com.google.zxing.NotFoundException;
import p040c.p200q.p406e.C7015a;
import p040c.p200q.p406e.C7017c;

/* renamed from: c.q.e.l.g */
/* compiled from: GlobalHistogramBinarizer */
public class C7038g extends C7015a {

    /* renamed from: d */
    public static final byte[] f13472d = new byte[0];

    /* renamed from: b */
    public byte[] f13473b = f13472d;

    /* renamed from: c */
    public final int[] f13474c = new int[32];

    public C7038g(C7017c cVar) {
        super(cVar);
    }

    /* renamed from: f */
    public static int m20863f(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 <= i5) {
            int i10 = i3;
            i3 = i5;
            i5 = i10;
        }
        if (i3 - i5 > length / 16) {
            int i11 = i3 - 1;
            int i12 = -1;
            int i13 = i11;
            while (i11 > i5) {
                int i14 = i11 - i5;
                int i15 = i14 * i14 * (i3 - i11) * (i2 - iArr[i11]);
                if (i15 > i12) {
                    i13 = i11;
                    i12 = i15;
                }
                i11--;
            }
            return i13 << 3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: a */
    public C7033b mo32452a() {
        C7017c d = mo32455d();
        int d2 = d.mo32467d();
        int a = d.mo32464a();
        C7033b bVar = new C7033b(d2, a);
        mo32570g(d2);
        int[] iArr = this.f13474c;
        for (int i = 1; i < 5; i++) {
            byte[] c = d.mo32466c((a * i) / 5, this.f13473b);
            int i2 = (d2 << 2) / 5;
            for (int i3 = d2 / 5; i3 < i2; i3++) {
                int i4 = (c[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int f = m20863f(iArr);
        byte[] b = d.mo32465b();
        for (int i5 = 0; i5 < a; i5++) {
            int i6 = i5 * d2;
            for (int i7 = 0; i7 < d2; i7++) {
                if ((b[i6 + i7] & 255) < f) {
                    bVar.mo32544m(i7, i5);
                }
            }
        }
        return bVar;
    }

    /* renamed from: b */
    public C7032a mo32453b(int i, C7032a aVar) {
        C7017c d = mo32455d();
        int d2 = d.mo32467d();
        if (aVar == null || aVar.mo32523h() < d2) {
            aVar = new C7032a(d2);
        } else {
            aVar.mo32515a();
        }
        mo32570g(d2);
        byte[] c = d.mo32466c(i, this.f13473b);
        int[] iArr = this.f13474c;
        for (int i2 = 0; i2 < d2; i2++) {
            int i3 = (c[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int f = m20863f(iArr);
        if (d2 < 3) {
            for (int i4 = 0; i4 < d2; i4++) {
                if ((c[i4] & 255) < f) {
                    aVar.mo32527l(i4);
                }
            }
        } else {
            int i5 = 1;
            byte b = c[1] & 255;
            byte b2 = c[0] & 255;
            byte b3 = b;
            while (i5 < d2 - 1) {
                int i6 = i5 + 1;
                byte b4 = c[i6] & 255;
                if ((((b3 << 2) - b2) - b4) / 2 < f) {
                    aVar.mo32527l(i5);
                }
                b2 = b3;
                i5 = i6;
                b3 = b4;
            }
        }
        return aVar;
    }

    /* renamed from: g */
    public final void mo32570g(int i) {
        if (this.f13473b.length < i) {
            this.f13473b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f13474c[i2] = 0;
        }
    }
}
