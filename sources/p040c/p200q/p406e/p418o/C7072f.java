package p040c.p200q.p406e.p418o;

import com.google.zxing.BarcodeFormat;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.f */
/* compiled from: EAN8Reader */
public final class C7072f extends C7082p {

    /* renamed from: h */
    public final int[] f13578h = new int[4];

    /* renamed from: l */
    public int mo32647l(C7032a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f13578h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int h = aVar.mo32523h();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < h; i2++) {
            sb.append((char) (C7082p.m21047j(aVar, iArr2, i, C7082p.f13599f) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = C7082p.m21048n(aVar, i, true, C7082p.f13598e)[1];
        for (int i5 = 0; i5 < 4 && i4 < h; i5++) {
            sb.append((char) (C7082p.m21047j(aVar, iArr2, i4, C7082p.f13599f) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    /* renamed from: q */
    public BarcodeFormat mo32648q() {
        return BarcodeFormat.EAN_8;
    }
}
