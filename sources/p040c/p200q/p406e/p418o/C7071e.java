package p040c.p200q.p406e.p418o;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.e */
/* compiled from: EAN13Reader */
public final class C7071e extends C7082p {

    /* renamed from: i */
    public static final int[] f13576i = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: h */
    public final int[] f13577h = new int[4];

    /* renamed from: r */
    public static void m21003r(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f13576i[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: l */
    public int mo32647l(C7032a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f13577h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int h = aVar.mo32523h();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < h; i3++) {
            int j = C7082p.m21047j(aVar, iArr2, i, C7082p.f13600g);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m21003r(sb, i2);
        int i5 = C7082p.m21048n(aVar, i, true, C7082p.f13598e)[1];
        for (int i6 = 0; i6 < 6 && i5 < h; i6++) {
            sb.append((char) (C7082p.m21047j(aVar, iArr2, i5, C7082p.f13599f) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    /* renamed from: q */
    public BarcodeFormat mo32648q() {
        return BarcodeFormat.EAN_13;
    }
}
