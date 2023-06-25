package p040c.p200q.p406e.p418o;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.Map;
import p040c.p200q.p406e.C7022h;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.C7024j;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.p */
/* compiled from: UPCEANReader */
public abstract class C7082p extends C7077k {

    /* renamed from: d */
    public static final int[] f13597d = {1, 1, 1};

    /* renamed from: e */
    public static final int[] f13598e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    public static final int[][] f13599f;

    /* renamed from: g */
    public static final int[][] f13600g;

    /* renamed from: a */
    public final StringBuilder f13601a = new StringBuilder(20);

    /* renamed from: b */
    public final C7081o f13602b = new C7081o();

    /* renamed from: c */
    public final C7073g f13603c = new C7073g();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f13599f = iArr;
        int[][] iArr2 = new int[20][];
        f13600g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f13599f[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f13600g[i] = iArr4;
        }
    }

    /* renamed from: i */
    public static boolean m21046i(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.getFormatInstance();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.getFormatInstance();
            }
            i3 += charAt2;
        }
        if (i3 % 10 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static int m21047j(C7032a aVar, int[] iArr, int i, int[][] iArr2) {
        C7077k.m21024f(aVar, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float e = C7077k.m21023e(iArr, iArr2[i3], 0.7f);
            if (e < f) {
                i2 = i3;
                f = e;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: n */
    public static int[] m21048n(C7032a aVar, int i, boolean z, int[] iArr) {
        return m21049o(aVar, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: o */
    public static int[] m21049o(C7032a aVar, int i, boolean z, int[] iArr, int[] iArr2) {
        int h = aVar.mo32523h();
        int f = z ? aVar.mo32522f(i) : aVar.mo32520e(i);
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = f;
        while (f < h) {
            if (aVar.mo32517c(f) ^ z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                int i4 = length - 1;
                if (i2 != i4) {
                    i2++;
                } else if (C7077k.m21023e(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i3, f};
                } else {
                    i3 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i2--;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            f++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: p */
    public static int[] m21050p(C7032a aVar) {
        int[] iArr = new int[f13597d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            Arrays.fill(iArr, 0, f13597d.length, 0);
            iArr2 = m21049o(aVar, i, false, f13597d, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = aVar.mo32525i(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* renamed from: c */
    public C7022h mo32640c(int i, C7032a aVar, Map<DecodeHintType, ?> map) {
        return mo32656m(i, aVar, m21050p(aVar), map);
    }

    /* renamed from: h */
    public boolean mo32662h(String str) {
        return m21046i(str);
    }

    /* renamed from: k */
    public int[] mo32663k(C7032a aVar, int i) {
        return m21048n(aVar, i, false, f13597d);
    }

    /* renamed from: l */
    public abstract int mo32647l(C7032a aVar, int[] iArr, StringBuilder sb);

    /* renamed from: m */
    public C7022h mo32656m(int i, C7032a aVar, int[] iArr, Map<DecodeHintType, ?> map) {
        C7024j jVar;
        int i2;
        String c;
        int[] iArr2 = null;
        if (map == null) {
            jVar = null;
        } else {
            jVar = (C7024j) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        }
        boolean z = true;
        if (jVar != null) {
            jVar.mo32491a(new C7023i(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
        }
        StringBuilder sb = this.f13601a;
        sb.setLength(0);
        int l = mo32647l(aVar, iArr, sb);
        if (jVar != null) {
            jVar.mo32491a(new C7023i((float) l, (float) i));
        }
        int[] k = mo32663k(aVar, l);
        if (jVar != null) {
            jVar.mo32491a(new C7023i(((float) (k[0] + k[1])) / 2.0f, (float) i));
        }
        int i3 = k[1];
        int i4 = (i3 - k[0]) + i3;
        if (i4 >= aVar.mo32523h() || !aVar.mo32525i(i3, i4, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw FormatException.getFormatInstance();
        } else if (mo32662h(sb2)) {
            BarcodeFormat q = mo32648q();
            float f = (float) i;
            C7022h hVar = new C7022h(sb2, (byte[]) null, new C7023i[]{new C7023i(((float) (iArr[1] + iArr[0])) / 2.0f, f), new C7023i(((float) (k[1] + k[0])) / 2.0f, f)}, q);
            try {
                C7022h a = this.f13602b.mo32661a(i, aVar, k[1]);
                hVar.mo32484h(ResultMetadataType.UPC_EAN_EXTENSION, a.mo32482f());
                hVar.mo32483g(a.mo32480d());
                hVar.mo32477a(a.mo32481e());
                i2 = a.mo32482f().length();
            } catch (ReaderException unused) {
                i2 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = false;
                        break;
                    } else if (i2 == iArr2[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
            if ((q == BarcodeFormat.EAN_13 || q == BarcodeFormat.UPC_A) && (c = this.f13603c.mo32651c(sb2)) != null) {
                hVar.mo32484h(ResultMetadataType.POSSIBLE_COUNTRY, c);
            }
            return hVar;
        } else {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* renamed from: q */
    public abstract BarcodeFormat mo32648q();
}
