package p040c.p200q.p406e.p422p.p423d;

import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.hisense.connect_life.core.global.KeyConst;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import p040c.p200q.p406e.p410l.C7035d;
import p040c.p200q.p406e.p422p.C7116c;

/* renamed from: c.q.e.p.d.e */
/* compiled from: DecodedBitStreamParser */
public final class C7121e {

    /* renamed from: a */
    public static final char[] f13695a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    public static final char[] f13696b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    public static final Charset f13697c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final BigInteger[] f13698d;

    /* renamed from: c.q.e.p.d.e$a */
    /* compiled from: DecodedBitStreamParser */
    public static /* synthetic */ class C7122a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13699a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                c.q.e.p.d.e$b[] r0 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13699a = r0
                c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.ALPHA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13699a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13699a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13699a     // Catch:{ NoSuchFieldError -> 0x0033 }
                c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13699a     // Catch:{ NoSuchFieldError -> 0x003e }
                c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.ALPHA_SHIFT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f13699a     // Catch:{ NoSuchFieldError -> 0x0049 }
                c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.PUNCT_SHIFT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p406e.p422p.p423d.C7121e.C7122a.<clinit>():void");
        }
    }

    /* renamed from: c.q.e.p.d.e$b */
    /* compiled from: DecodedBitStreamParser */
    public enum C7123b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f13698d = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        f13698d[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f13698d;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static int m21227a(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        int i3;
        int i4;
        int i5 = i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i6 = 922;
        int i7 = 923;
        int i8 = 928;
        int i9 = KeyConst.MSG_DEL_WINE;
        long j = 900;
        if (i5 == 901) {
            int[] iArr2 = new int[6];
            i3 = i2 + 1;
            int i10 = iArr[i2];
            long j2 = 0;
            boolean z = false;
            int i11 = 0;
            while (i3 < iArr[0] && !z) {
                int i12 = i11 + 1;
                iArr2[i11] = i10;
                j2 = (j2 * j) + ((long) i10);
                int i13 = i3 + 1;
                i10 = iArr[i3];
                if (i10 == 900 || i10 == 901 || i10 == 902 || i10 == 924 || i10 == 928 || i10 == i7 || i10 == i6) {
                    i3 = i13 - 1;
                    i11 = i12;
                    i6 = 922;
                    i7 = 923;
                    j = 900;
                    z = true;
                } else if (i12 % 5 != 0 || i12 <= 0) {
                    i3 = i13;
                    i11 = i12;
                    i6 = 922;
                    i7 = 923;
                    j = 900;
                } else {
                    int i14 = 0;
                    while (i14 < 6) {
                        byteArrayOutputStream.write((byte) ((int) (j2 >> ((5 - i14) * 8))));
                        i14++;
                        i6 = 922;
                        i7 = 923;
                    }
                    i3 = i13;
                    i11 = 0;
                    j = 900;
                    j2 = 0;
                }
            }
            if (i3 != iArr[0] || i10 >= 900) {
                i4 = i11;
            } else {
                i4 = i11 + 1;
                iArr2[i11] = i10;
            }
            for (int i15 = 0; i15 < i4; i15++) {
                byteArrayOutputStream.write((byte) iArr2[i15]);
            }
        } else if (i5 == 924) {
            int i16 = i2;
            boolean z2 = false;
            int i17 = 0;
            long j3 = 0;
            while (i16 < iArr[0] && !z2) {
                int i18 = i16 + 1;
                int i19 = iArr[i16];
                if (i19 < 900) {
                    i17++;
                    j3 = (j3 * 900) + ((long) i19);
                    i16 = i18;
                } else {
                    if (i19 != 900 && i19 != 901 && i19 != i9 && i19 != 924 && i19 != i8) {
                        if (!(i19 == 923 || i19 == 922)) {
                            i16 = i18;
                        }
                    }
                    i16 = i18 - 1;
                    z2 = true;
                }
                if (i17 % 5 == 0 && i17 > 0) {
                    for (int i20 = 0; i20 < 6; i20++) {
                        byteArrayOutputStream.write((byte) ((int) (j3 >> ((5 - i20) * 8))));
                    }
                    i17 = 0;
                    j3 = 0;
                }
                i8 = 928;
                i9 = KeyConst.MSG_DEL_WINE;
            }
            i3 = i16;
        } else {
            i3 = i2;
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i3;
    }

    /* renamed from: b */
    public static C7035d m21228b(int[] iArr, String str) {
        int i;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charset = f13697c;
        int i2 = iArr[1];
        C7116c cVar = new C7116c();
        int i3 = 2;
        while (i3 < iArr[0]) {
            if (i2 != 913) {
                switch (i2) {
                    case 900:
                        i = m21233g(iArr, i3, sb);
                        break;
                    case KeyConst.MSG_ADD_WINE /*901*/:
                        i = m21227a(i2, iArr, charset, i3, sb);
                        break;
                    case KeyConst.MSG_DEL_WINE /*902*/:
                        i = m21232f(iArr, i3, sb);
                        break;
                    default:
                        switch (i2) {
                            case 922:
                            case 923:
                                throw FormatException.getFormatInstance();
                            case 924:
                                break;
                            case 925:
                                i = i3 + 1;
                                break;
                            case 926:
                                i = i3 + 2;
                                break;
                            case 927:
                                i = i3 + 1;
                                charset = Charset.forName(CharacterSetECI.getCharacterSetECIByValue(iArr[i3]).name());
                                break;
                            case 928:
                                i = m21230d(iArr, i3, cVar);
                                break;
                            default:
                                i = m21233g(iArr, i3 - 1, sb);
                                break;
                        }
                        i = m21227a(i2, iArr, charset, i3, sb);
                        break;
                }
            } else {
                i = i3 + 1;
                sb.append((char) iArr[i3]);
            }
            if (i < iArr.length) {
                i3 = i + 1;
                i2 = iArr[i];
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (sb.length() != 0) {
            C7035d dVar = new C7035d((byte[]) null, sb.toString(), (List<byte[]>) null, str);
            dVar.mo32565m(cVar);
            return dVar;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: c */
    public static String m21229c(int[] iArr, int i) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f13698d[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: d */
    public static int m21230d(int[] iArr, int i, C7116c cVar) {
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i2 = 0;
            while (i2 < 2) {
                iArr2[i2] = iArr[i];
                i2++;
                i++;
            }
            cVar.mo32759d(Integer.parseInt(m21229c(iArr2, 2)));
            StringBuilder sb = new StringBuilder();
            int g = m21233g(iArr, i, sb);
            cVar.mo32756a(sb.toString());
            if (iArr[g] == 923) {
                int i3 = g + 1;
                int[] iArr3 = new int[(iArr[0] - i3)];
                boolean z = false;
                int i4 = 0;
                while (i3 < iArr[0] && !z) {
                    int i5 = i3 + 1;
                    int i6 = iArr[i3];
                    if (i6 < 900) {
                        iArr3[i4] = i6;
                        i3 = i5;
                        i4++;
                    } else if (i6 == 922) {
                        cVar.mo32757b(true);
                        i3 = i5 + 1;
                        z = true;
                    } else {
                        throw FormatException.getFormatInstance();
                    }
                }
                cVar.mo32758c(Arrays.copyOf(iArr3, i4));
                return i3;
            } else if (iArr[g] != 922) {
                return g;
            } else {
                cVar.mo32757b(true);
                return g + 1;
            }
        } else {
            throw FormatException.getFormatInstance();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b6, code lost:
        r10 = 0;
        r15 = r3;
        r3 = r1;
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d7, code lost:
        r10 = (char) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f9, code lost:
        if (r10 == 0) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fb, code lost:
        r0.append(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00fe, code lost:
        r5 = r5 + 1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m21231e(int[] r16, int[] r17, int r18, java.lang.StringBuilder r19) {
        /*
            r0 = r19
            c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.ALPHA
            r2 = 0
            r4 = r18
            r3 = r1
            r5 = r2
        L_0x0009:
            if (r5 >= r4) goto L_0x0102
            r6 = r16[r5]
            int[] r7 = p040c.p200q.p406e.p422p.p423d.C7121e.C7122a.f13699a
            int r8 = r1.ordinal()
            r7 = r7[r8]
            r8 = 28
            r9 = 27
            r10 = 32
            r11 = 913(0x391, float:1.28E-42)
            r12 = 900(0x384, float:1.261E-42)
            r13 = 29
            r14 = 26
            switch(r7) {
                case 1: goto L_0x00d3;
                case 2: goto L_0x00aa;
                case 3: goto L_0x0075;
                case 4: goto L_0x0057;
                case 5: goto L_0x0044;
                case 6: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x00f8
        L_0x0028:
            if (r6 >= r13) goto L_0x002f
            char[] r1 = f13695a
            char r10 = r1[r6]
            goto L_0x0049
        L_0x002f:
            if (r6 != r13) goto L_0x0035
            c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.ALPHA
            goto L_0x00f8
        L_0x0035:
            if (r6 != r11) goto L_0x003e
            r1 = r17[r5]
            char r1 = (char) r1
            r0.append(r1)
            goto L_0x0055
        L_0x003e:
            if (r6 != r12) goto L_0x0055
            c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.ALPHA
            goto L_0x00f8
        L_0x0044:
            if (r6 >= r14) goto L_0x004c
            int r6 = r6 + 65
            char r10 = (char) r6
        L_0x0049:
            r1 = r3
            goto L_0x00f9
        L_0x004c:
            if (r6 != r14) goto L_0x004f
            goto L_0x0049
        L_0x004f:
            if (r6 != r12) goto L_0x0055
            c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.ALPHA
            goto L_0x00f8
        L_0x0055:
            r10 = r2
            goto L_0x0049
        L_0x0057:
            if (r6 >= r13) goto L_0x005f
            char[] r7 = f13695a
            char r10 = r7[r6]
            goto L_0x00f9
        L_0x005f:
            if (r6 != r13) goto L_0x0065
            c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.ALPHA
            goto L_0x00f8
        L_0x0065:
            if (r6 != r11) goto L_0x006f
            r6 = r17[r5]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00f8
        L_0x006f:
            if (r6 != r12) goto L_0x00f8
            c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.ALPHA
            goto L_0x00f8
        L_0x0075:
            r7 = 25
            if (r6 >= r7) goto L_0x007f
            char[] r7 = f13696b
            char r10 = r7[r6]
            goto L_0x00f9
        L_0x007f:
            if (r6 != r7) goto L_0x0085
            c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.PUNCT
            goto L_0x00f8
        L_0x0085:
            if (r6 != r14) goto L_0x0089
            goto L_0x00f9
        L_0x0089:
            if (r6 != r9) goto L_0x008f
            c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.LOWER
            goto L_0x00f8
        L_0x008f:
            if (r6 != r8) goto L_0x0095
            c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.ALPHA
            goto L_0x00f8
        L_0x0095:
            if (r6 != r13) goto L_0x009a
            c.q.e.p.d.e$b r3 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.PUNCT_SHIFT
            goto L_0x00b6
        L_0x009a:
            if (r6 != r11) goto L_0x00a4
            r6 = r17[r5]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00f8
        L_0x00a4:
            if (r6 != r12) goto L_0x00f8
            c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.ALPHA
            goto L_0x00f8
        L_0x00aa:
            if (r6 >= r14) goto L_0x00af
            int r6 = r6 + 97
            goto L_0x00d7
        L_0x00af:
            if (r6 != r14) goto L_0x00b2
            goto L_0x00f9
        L_0x00b2:
            if (r6 != r9) goto L_0x00bb
            c.q.e.p.d.e$b r3 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.ALPHA_SHIFT
        L_0x00b6:
            r10 = r2
            r15 = r3
            r3 = r1
            r1 = r15
            goto L_0x00f9
        L_0x00bb:
            if (r6 != r8) goto L_0x00c0
            c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.MIXED
            goto L_0x00f8
        L_0x00c0:
            if (r6 != r13) goto L_0x00c5
            c.q.e.p.d.e$b r3 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.PUNCT_SHIFT
            goto L_0x00b6
        L_0x00c5:
            if (r6 != r11) goto L_0x00ce
            r6 = r17[r5]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00f8
        L_0x00ce:
            if (r6 != r12) goto L_0x00f8
            c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.ALPHA
            goto L_0x00f8
        L_0x00d3:
            if (r6 >= r14) goto L_0x00d9
            int r6 = r6 + 65
        L_0x00d7:
            char r10 = (char) r6
            goto L_0x00f9
        L_0x00d9:
            if (r6 != r14) goto L_0x00dc
            goto L_0x00f9
        L_0x00dc:
            if (r6 != r9) goto L_0x00e1
            c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.LOWER
            goto L_0x00f8
        L_0x00e1:
            if (r6 != r8) goto L_0x00e6
            c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.MIXED
            goto L_0x00f8
        L_0x00e6:
            if (r6 != r13) goto L_0x00eb
            c.q.e.p.d.e$b r3 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.PUNCT_SHIFT
            goto L_0x00b6
        L_0x00eb:
            if (r6 != r11) goto L_0x00f4
            r6 = r17[r5]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00f8
        L_0x00f4:
            if (r6 != r12) goto L_0x00f8
            c.q.e.p.d.e$b r1 = p040c.p200q.p406e.p422p.p423d.C7121e.C7123b.ALPHA
        L_0x00f8:
            r10 = r2
        L_0x00f9:
            if (r10 == 0) goto L_0x00fe
            r0.append(r10)
        L_0x00fe:
            int r5 = r5 + 1
            goto L_0x0009
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p406e.p422p.p423d.C7121e.m21231e(int[], int[], int, java.lang.StringBuilder):void");
    }

    /* renamed from: f */
    public static int m21232f(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i3 == iArr[0]) {
                z = true;
            }
            if (i4 < 900) {
                iArr2[i2] = i4;
                i2++;
            } else if (i4 == 900 || i4 == 901 || i4 == 924 || i4 == 928 || i4 == 923 || i4 == 922) {
                i3--;
                z = true;
            }
            if ((i2 % 15 == 0 || i4 == 902 || z) && i2 > 0) {
                sb.append(m21229c(iArr2, i2));
                i2 = 0;
            }
            i = i3;
        }
        return i;
    }

    /* renamed from: g */
    public static int m21233g(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[((iArr[0] - i) << 1)];
        int[] iArr3 = new int[((iArr[0] - i) << 1)];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i4 < 900) {
                iArr2[i2] = i4 / 30;
                iArr2[i2 + 1] = i4 % 30;
                i2 += 2;
            } else if (i4 != 913) {
                if (i4 != 928) {
                    switch (i4) {
                        case 900:
                            iArr2[i2] = 900;
                            i2++;
                            break;
                        case KeyConst.MSG_ADD_WINE /*901*/:
                        case KeyConst.MSG_DEL_WINE /*902*/:
                            break;
                        default:
                            switch (i4) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                            }
                    }
                }
                i = i3 - 1;
                z = true;
            } else {
                iArr2[i2] = 913;
                i = i3 + 1;
                iArr3[i2] = iArr[i3];
                i2++;
            }
            i = i3;
        }
        m21231e(iArr2, iArr3, i2, sb);
        return i;
    }
}
