package p040c.p142n.p143a.p144a.p147j;

import java.util.Arrays;

/* renamed from: c.n.a.a.j.a */
/* compiled from: CharTypes */
public final class C2072a {

    /* renamed from: a */
    public static final char[] f1929a;

    /* renamed from: b */
    public static final byte[] f1930b;

    /* renamed from: c */
    public static final int[] f1931c;

    /* renamed from: d */
    public static final int[] f1932d;

    /* renamed from: e */
    public static final int[] f1933e;

    /* renamed from: f */
    public static final int[] f1934f;

    /* renamed from: g */
    public static final int[] f1935g;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f1929a = charArray;
        int length = charArray.length;
        f1930b = new byte[length];
        for (int i = 0; i < length; i++) {
            f1930b[i] = (byte) f1929a[i];
        }
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 32; i2++) {
            iArr[i2] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f1931c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i3 = 128; i3 < 256; i3++) {
            iArr2[i3] = (i3 & 224) == 192 ? 2 : (i3 & 240) == 224 ? 3 : (i3 & 248) == 240 ? 4 : -1;
        }
        f1932d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i4 = 33; i4 < 256; i4++) {
            if (Character.isJavaIdentifierPart((char) i4)) {
                iArr3[i4] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f1933e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        int[] iArr5 = new int[256];
        System.arraycopy(f1932d, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        int[] iArr6 = new int[256];
        System.arraycopy(f1932d, 128, iArr6, 128, 128);
        Arrays.fill(iArr6, 0, 32, -1);
        iArr6[32] = 1;
        iArr6[9] = 1;
        iArr6[10] = 10;
        iArr6[13] = 13;
        iArr6[47] = 47;
        iArr6[35] = 35;
        int[] iArr7 = new int[128];
        for (int i5 = 0; i5 < 32; i5++) {
            iArr7[i5] = -1;
        }
        iArr7[34] = 34;
        iArr7[92] = 92;
        iArr7[8] = 98;
        iArr7[9] = 116;
        iArr7[12] = 102;
        iArr7[10] = 110;
        iArr7[13] = 114;
        f1934f = iArr7;
        int[] iArr8 = new int[128];
        f1935g = iArr8;
        Arrays.fill(iArr8, -1);
        for (int i6 = 0; i6 < 10; i6++) {
            f1935g[i6 + 48] = i6;
        }
        for (int i7 = 0; i7 < 6; i7++) {
            int[] iArr9 = f1935g;
            int i8 = i7 + 10;
            iArr9[i7 + 97] = i8;
            iArr9[i7 + 65] = i8;
        }
    }

    /* renamed from: a */
    public static void m2897a(StringBuilder sb, String str) {
        int[] iArr = f1934f;
        int length = iArr.length;
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            if (charAt >= length || iArr[charAt] == 0) {
                sb.append(charAt);
            } else {
                sb.append('\\');
                int i2 = iArr[charAt];
                if (i2 < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    sb.append(f1929a[charAt >> 4]);
                    sb.append(f1929a[charAt & 15]);
                } else {
                    sb.append((char) i2);
                }
            }
        }
    }

    /* renamed from: b */
    public static byte[] m2898b() {
        return (byte[]) f1930b.clone();
    }

    /* renamed from: c */
    public static char[] m2899c() {
        return (char[]) f1929a.clone();
    }

    /* renamed from: d */
    public static int[] m2900d() {
        return f1934f;
    }

    /* renamed from: e */
    public static int[] m2901e() {
        return f1931c;
    }

    /* renamed from: f */
    public static int[] m2902f() {
        return f1932d;
    }
}
