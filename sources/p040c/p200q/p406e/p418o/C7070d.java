package p040c.p200q.p406e.p418o;

import com.facebook.stetho.server.http.HttpStatus;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import okhttp3.internal.http.StatusLine;
import p040c.p200q.p406e.C7022h;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.d */
/* compiled from: Code93Reader */
public final class C7070d extends C7077k {

    /* renamed from: c */
    public static final char[] f13571c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    public static final int[] f13572d;

    /* renamed from: e */
    public static final int f13573e;

    /* renamed from: a */
    public final StringBuilder f13574a = new StringBuilder(20);

    /* renamed from: b */
    public final int[] f13575b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, HttpStatus.HTTP_NOT_FOUND, 402, 394, 360, 356, 354, StatusLine.HTTP_PERM_REDIRECT, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, FloatingActionButton.AUTO_MINI_LARGEST_SCREEN_WIDTH, 306, 350};
        f13572d = iArr;
        f13573e = iArr[47];
    }

    /* renamed from: h */
    public static void m20996h(CharSequence charSequence) {
        int length = charSequence.length();
        m20997i(charSequence, length - 2, 20);
        m20997i(charSequence, length - 1, 15);
    }

    /* renamed from: i */
    public static void m20997i(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f13571c[i3 % 47]) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m20998j(java.lang.CharSequence r9) {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        L_0x000b:
            if (r3 >= r0) goto L_0x009f
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto L_0x0098
            r5 = 100
            if (r4 > r5) goto L_0x0098
            int r5 = r0 + -1
            if (r3 >= r5) goto L_0x0093
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L_0x0082;
                case 98: goto L_0x004c;
                case 99: goto L_0x003b;
                case 100: goto L_0x002f;
                default: goto L_0x002c;
            }
        L_0x002c:
            r4 = r2
            goto L_0x008f
        L_0x002f:
            if (r5 < r8) goto L_0x0036
            if (r5 > r7) goto L_0x0036
            int r5 = r5 + 32
            goto L_0x0088
        L_0x0036:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L_0x003b:
            if (r5 < r8) goto L_0x0042
            if (r5 > r6) goto L_0x0042
            int r5 = r5 + -32
            goto L_0x0088
        L_0x0042:
            if (r5 != r7) goto L_0x0047
            r4 = 58
            goto L_0x008f
        L_0x0047:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L_0x004c:
            if (r5 < r8) goto L_0x0055
            r4 = 69
            if (r5 > r4) goto L_0x0055
            int r5 = r5 + -38
            goto L_0x0088
        L_0x0055:
            r4 = 70
            if (r5 < r4) goto L_0x0060
            r4 = 74
            if (r5 > r4) goto L_0x0060
            int r5 = r5 + -11
            goto L_0x0088
        L_0x0060:
            r4 = 75
            if (r5 < r4) goto L_0x0069
            if (r5 > r6) goto L_0x0069
            int r5 = r5 + 16
            goto L_0x0088
        L_0x0069:
            r4 = 80
            if (r5 < r4) goto L_0x0074
            r4 = 83
            if (r5 > r4) goto L_0x0074
            int r5 = r5 + 43
            goto L_0x0088
        L_0x0074:
            r4 = 84
            if (r5 < r4) goto L_0x007d
            if (r5 > r7) goto L_0x007d
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x008f
        L_0x007d:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L_0x0082:
            if (r5 < r8) goto L_0x008a
            if (r5 > r7) goto L_0x008a
            int r5 = r5 + -64
        L_0x0088:
            char r4 = (char) r5
            goto L_0x008f
        L_0x008a:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L_0x008f:
            r1.append(r4)
            goto L_0x009b
        L_0x0093:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L_0x0098:
            r1.append(r4)
        L_0x009b:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x009f:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p406e.p418o.C7070d.m20998j(java.lang.CharSequence):java.lang.String");
    }

    /* renamed from: l */
    public static char m20999l(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f13572d;
            if (i2 >= iArr.length) {
                throw NotFoundException.getNotFoundInstance();
            } else if (iArr[i2] == i) {
                return f13571c[i2];
            } else {
                i2++;
            }
        }
    }

    /* renamed from: m */
    public static int m21000m(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((((float) iArr[i4]) * 9.0f) / ((float) i));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    /* renamed from: c */
    public C7022h mo32640c(int i, C7032a aVar, Map<DecodeHintType, ?> map) {
        int[] k = mo32646k(aVar);
        int e = aVar.mo32520e(k[1]);
        int h = aVar.mo32523h();
        int[] iArr = this.f13575b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f13574a;
        sb.setLength(0);
        while (true) {
            C7077k.m21024f(aVar, e, iArr);
            int m = m21000m(iArr);
            if (m >= 0) {
                char l = m20999l(m);
                sb.append(l);
                int i2 = e;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int e2 = aVar.mo32520e(i2);
                if (l == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (e2 == h || !aVar.mo32517c(e2)) {
                        throw NotFoundException.getNotFoundInstance();
                    } else if (sb.length() >= 2) {
                        m20996h(sb);
                        sb.setLength(sb.length() - 2);
                        float f = (float) i;
                        return new C7022h(m20998j(sb), (byte[]) null, new C7023i[]{new C7023i(((float) (k[1] + k[0])) / 2.0f, f), new C7023i(((float) e) + (((float) i4) / 2.0f), f)}, BarcodeFormat.CODE_93);
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else {
                    e = e2;
                }
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    /* renamed from: k */
    public final int[] mo32646k(C7032a aVar) {
        int h = aVar.mo32523h();
        int e = aVar.mo32520e(0);
        Arrays.fill(this.f13575b, 0);
        int[] iArr = this.f13575b;
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
                } else if (m21000m(iArr) == f13573e) {
                    return new int[]{i2, e};
                } else {
                    i2 += iArr[0] + iArr[1];
                    int i4 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i4);
                    iArr[i4] = 0;
                    iArr[i3] = 0;
                    i--;
                }
                iArr[i] = 1;
                z = !z;
            }
            e++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
