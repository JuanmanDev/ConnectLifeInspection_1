package p040c.p200q.p406e.p418o;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;
import p040c.p200q.p406e.C7022h;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.m */
/* compiled from: UPCEANExtension2Support */
public final class C7079m {

    /* renamed from: a */
    public final int[] f13589a = new int[4];

    /* renamed from: b */
    public final StringBuilder f13590b = new StringBuilder();

    /* renamed from: c */
    public static Map<ResultMetadataType, Object> m21036c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    /* renamed from: a */
    public final int mo32657a(C7032a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f13589a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int h = aVar.mo32523h();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < h; i3++) {
            int j = C7082p.m21047j(aVar, iArr2, i, C7082p.f13600g);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = aVar.mo32522f(aVar.mo32520e(i));
            }
        }
        if (sb.length() != 2) {
            throw NotFoundException.getNotFoundInstance();
        } else if (Integer.parseInt(sb.toString()) % 4 == i2) {
            return i;
        } else {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    /* renamed from: b */
    public C7022h mo32658b(int i, C7032a aVar, int[] iArr) {
        StringBuilder sb = this.f13590b;
        sb.setLength(0);
        int a = mo32657a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<ResultMetadataType, Object> c = m21036c(sb2);
        float f = (float) i;
        C7022h hVar = new C7022h(sb2, (byte[]) null, new C7023i[]{new C7023i(((float) (iArr[0] + iArr[1])) / 2.0f, f), new C7023i((float) a, f)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (c != null) {
            hVar.mo32483g(c);
        }
        return hVar;
    }
}
