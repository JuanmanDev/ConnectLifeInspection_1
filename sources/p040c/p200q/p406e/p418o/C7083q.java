package p040c.p200q.p406e.p418o;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.q */
/* compiled from: UPCEReader */
public final class C7083q extends C7082p {

    /* renamed from: i */
    public static final int[] f13604i = {1, 1, 1, 1, 1, 1};

    /* renamed from: j */
    public static final int[][] f13605j = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: h */
    public final int[] f13606h = new int[4];

    /* renamed from: r */
    public static String m21057r(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        sb.append(str.charAt(7));
        return sb.toString();
    }

    /* renamed from: s */
    public static void m21058s(StringBuilder sb, int i) {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f13605j[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: h */
    public boolean mo32662h(String str) {
        return super.mo32662h(m21057r(str));
    }

    /* renamed from: k */
    public int[] mo32663k(C7032a aVar, int i) {
        return C7082p.m21048n(aVar, i, true, f13604i);
    }

    /* renamed from: l */
    public int mo32647l(C7032a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f13606h;
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
        m21058s(sb, i2);
        return i;
    }

    /* renamed from: q */
    public BarcodeFormat mo32648q() {
        return BarcodeFormat.UPC_E;
    }
}
