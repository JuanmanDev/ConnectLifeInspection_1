package p040c.p200q.p406e.p418o;

import androidx.core.location.GpsStatusWrapper;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import p040c.p200q.p406e.C7022h;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.c */
/* compiled from: Code39Reader */
public final class C7069c extends C7077k {

    /* renamed from: e */
    public static final int[] f13565e;

    /* renamed from: f */
    public static final int f13566f;

    /* renamed from: a */
    public final boolean f13567a;

    /* renamed from: b */
    public final boolean f13568b;

    /* renamed from: c */
    public final StringBuilder f13569c;

    /* renamed from: d */
    public final int[] f13570d;

    static {
        int[] iArr = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, GpsStatusWrapper.QZSS_SVID_MIN, 448, 145, 400, 208, 133, 388, 196, 148, 168, 162, 138, 42};
        f13565e = iArr;
        f13566f = iArr[39];
    }

    public C7069c() {
        this(false);
    }

    /* renamed from: h */
    public static String m20991h(CharSequence charSequence) {
        char c;
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt != '/') {
                                c = 0;
                            } else if (charAt2 >= 'A' && charAt2 <= 'O') {
                                i = charAt2 - ' ';
                            } else if (charAt2 == 'Z') {
                                c = ':';
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            sb.append(c);
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw FormatException.getFormatInstance();
                        } else {
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 < 'F' || charAt2 > 'W') {
                        throw FormatException.getFormatInstance();
                    } else {
                        i = charAt2 - 11;
                    }
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw FormatException.getFormatInstance();
                } else {
                    i = charAt2 - '@';
                }
                c = (char) i;
                sb.append(c);
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: i */
    public static int[] m20992i(C7032a aVar, int[] iArr) {
        int h = aVar.mo32523h();
        int e = aVar.mo32520e(0);
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = e;
        while (e < h) {
            if (aVar.mo32517c(e) ^ z) {
                iArr[i] = iArr[i] + 1;
            } else {
                int i3 = length - 1;
                if (i != i3) {
                    i++;
                } else if (m20994k(iArr) != f13566f || !aVar.mo32525i(Math.max(0, i2 - ((e - i2) / 2)), i2, false)) {
                    i2 += iArr[0] + iArr[1];
                    int i4 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i4);
                    iArr[i4] = 0;
                    iArr[i3] = 0;
                    i--;
                } else {
                    return new int[]{i2, e};
                }
                iArr[i] = 1;
                z = !z;
            }
            e++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: j */
    public static char m20993j(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f13565e;
            if (i2 >= iArr.length) {
                throw NotFoundException.getNotFoundInstance();
            } else if (iArr[i2] == i) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".charAt(i2);
            } else {
                i2++;
            }
        }
    }

    /* renamed from: k */
    public static int m20994k(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: c */
    public C7022h mo32640c(int i, C7032a aVar, Map<DecodeHintType, ?> map) {
        String str;
        int[] iArr = this.f13570d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f13569c;
        sb.setLength(0);
        int[] i2 = m20992i(aVar, iArr);
        int e = aVar.mo32520e(i2[1]);
        int h = aVar.mo32523h();
        while (true) {
            C7077k.m21024f(aVar, e, iArr);
            int k = m20994k(iArr);
            if (k >= 0) {
                char j = m20993j(k);
                sb.append(j);
                int i3 = e;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int e2 = aVar.mo32520e(i3);
                if (j == '*') {
                    sb.setLength(sb.length() - 1);
                    int i5 = 0;
                    for (int i6 : iArr) {
                        i5 += i6;
                    }
                    int i7 = (e2 - e) - i5;
                    if (e2 == h || (i7 << 1) >= i5) {
                        if (this.f13567a) {
                            int length = sb.length() - 1;
                            int i8 = 0;
                            for (int i9 = 0; i9 < length; i9++) {
                                i8 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f13569c.charAt(i9));
                            }
                            if (sb.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i8 % 43)) {
                                sb.setLength(length);
                            } else {
                                throw ChecksumException.getChecksumInstance();
                            }
                        }
                        if (sb.length() != 0) {
                            if (this.f13568b) {
                                str = m20991h(sb);
                            } else {
                                str = sb.toString();
                            }
                            float f = (float) i;
                            return new C7022h(str, (byte[]) null, new C7023i[]{new C7023i(((float) (i2[1] + i2[0])) / 2.0f, f), new C7023i(((float) e) + (((float) i5) / 2.0f), f)}, BarcodeFormat.CODE_39);
                        }
                        throw NotFoundException.getNotFoundInstance();
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                e = e2;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    public C7069c(boolean z) {
        this(z, false);
    }

    public C7069c(boolean z, boolean z2) {
        this.f13567a = z;
        this.f13568b = z2;
        this.f13569c = new StringBuilder(20);
        this.f13570d = new int[9];
    }
}
