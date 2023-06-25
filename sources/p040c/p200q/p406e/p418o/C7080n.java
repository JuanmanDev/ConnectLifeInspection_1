package p040c.p200q.p406e.p418o;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;
import p040c.p200q.p406e.C7022h;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.n */
/* compiled from: UPCEANExtension5Support */
public final class C7080n {

    /* renamed from: c */
    public static final int[] f13591c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    public final int[] f13592a = new int[4];

    /* renamed from: b */
    public final StringBuilder f13593b = new StringBuilder();

    /* renamed from: c */
    public static int m21039c(int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f13591c[i2]) {
                return i2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: d */
    public static int m21040d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* renamed from: e */
    public static String m21041e(String str) {
        String str2;
        char charAt = str.charAt(0);
        String str3 = "";
        if (charAt == '0') {
            str3 = "£";
        } else if (charAt == '5') {
            str3 = "$";
        } else if (charAt == '9') {
            if ("90000".equals(str)) {
                return null;
            }
            if ("99991".equals(str)) {
                return "0.00";
            }
            if ("99990".equals(str)) {
                return "Used";
            }
        }
        int parseInt = Integer.parseInt(str.substring(1));
        String valueOf = String.valueOf(parseInt / 100);
        int i = parseInt % 100;
        if (i < 10) {
            str2 = "0" + i;
        } else {
            str2 = String.valueOf(i);
        }
        return str3 + valueOf + '.' + str2;
    }

    /* renamed from: f */
    public static Map<ResultMetadataType, Object> m21042f(String str) {
        String e;
        if (str.length() != 5 || (e = m21041e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.SUGGESTED_PRICE, e);
        return enumMap;
    }

    /* renamed from: a */
    public final int mo32659a(C7032a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f13592a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int h = aVar.mo32523h();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < h; i3++) {
            int j = C7082p.m21047j(aVar, iArr2, i, C7082p.f13600g);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = aVar.mo32522f(aVar.mo32520e(i));
            }
        }
        if (sb.length() == 5) {
            if (m21040d(sb.toString()) == m21039c(i2)) {
                return i;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: b */
    public C7022h mo32660b(int i, C7032a aVar, int[] iArr) {
        StringBuilder sb = this.f13593b;
        sb.setLength(0);
        int a = mo32659a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<ResultMetadataType, Object> f = m21042f(sb2);
        float f2 = (float) i;
        C7022h hVar = new C7022h(sb2, (byte[]) null, new C7023i[]{new C7023i(((float) (iArr[0] + iArr[1])) / 2.0f, f2), new C7023i((float) a, f2)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (f != null) {
            hVar.mo32483g(f);
        }
        return hVar;
    }
}
