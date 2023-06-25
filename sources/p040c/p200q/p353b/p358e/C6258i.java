package p040c.p200q.p353b.p358e;

import java.math.BigInteger;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.e.i */
/* compiled from: UnsignedLongs */
public final class C6258i {

    /* renamed from: c.q.b.e.i$a */
    /* compiled from: UnsignedLongs */
    public static final class C6259a {

        /* renamed from: a */
        public static final long[] f11875a = new long[37];

        /* renamed from: b */
        public static final int[] f11876b = new int[37];

        /* renamed from: c */
        public static final int[] f11877c = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i = 2; i <= 36; i++) {
                long j = (long) i;
                f11875a[i] = C6258i.m17605b(-1, j);
                f11876b[i] = (int) C6258i.m17608e(-1, j);
                f11877c[i] = bigInteger.toString(i).length() - 1;
            }
        }

        /* renamed from: a */
        public static boolean m17611a(long j, int i, int i2) {
            if (j < 0) {
                return true;
            }
            long[] jArr = f11875a;
            if (j < jArr[i2]) {
                return false;
            }
            if (j <= jArr[i2] && i <= f11876b[i2]) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static int m17604a(long j, long j2) {
        return C6252d.m17581c(m17606c(j), m17606c(j2));
    }

    /* renamed from: b */
    public static long m17605b(long j, long j2) {
        if (j2 < 0) {
            return m17604a(j, j2) < 0 ? 0 : 1;
        }
        if (j >= 0) {
            return j / j2;
        }
        int i = 1;
        long j3 = ((j >>> 1) / j2) << 1;
        if (m17604a(j - (j3 * j2), j2) < 0) {
            i = 0;
        }
        return j3 + ((long) i);
    }

    /* renamed from: c */
    public static long m17606c(long j) {
        return j ^ Long.MIN_VALUE;
    }

    /* renamed from: d */
    public static long m17607d(String str, int i) {
        C5850m.m16594o(str);
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        } else if (i < 2 || i > 36) {
            throw new NumberFormatException("illegal radix: " + i);
        } else {
            int i2 = C6259a.f11877c[i] - 1;
            long j = 0;
            int i3 = 0;
            while (i3 < str.length()) {
                int digit = Character.digit(str.charAt(i3), i);
                if (digit == -1) {
                    throw new NumberFormatException(str);
                } else if (i3 <= i2 || !C6259a.m17611a(j, digit, i)) {
                    j = (j * ((long) i)) + ((long) digit);
                    i3++;
                } else {
                    throw new NumberFormatException("Too large for unsigned long: " + str);
                }
            }
            return j;
        }
    }

    /* renamed from: e */
    public static long m17608e(long j, long j2) {
        if (j2 < 0) {
            return m17604a(j, j2) < 0 ? j : j - j2;
        }
        if (j >= 0) {
            return j % j2;
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (m17604a(j3, j2) < 0) {
            j2 = 0;
        }
        return j3 - j2;
    }

    /* renamed from: f */
    public static String m17609f(long j) {
        return m17610g(j, 10);
    }

    /* renamed from: g */
    public static String m17610g(long j, int i) {
        long j2;
        C5850m.m16585f(i >= 2 && i <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i);
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i2 == 0) {
            return "0";
        }
        if (i2 > 0) {
            return Long.toString(j, i);
        }
        int i3 = 64;
        char[] cArr = new char[64];
        int i4 = i - 1;
        if ((i & i4) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i3--;
                cArr[i3] = Character.forDigit(((int) j) & i4, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            if ((i & 1) == 0) {
                j2 = (j >>> 1) / ((long) (i >>> 1));
            } else {
                j2 = m17605b(j, (long) i);
            }
            long j3 = (long) i;
            cArr[63] = Character.forDigit((int) (j - (j2 * j3)), i);
            i3 = 63;
            while (j2 > 0) {
                i3--;
                cArr[i3] = Character.forDigit((int) (j2 % j3), i);
                j2 /= j3;
            }
        }
        return new String(cArr, i3, 64 - i3);
    }
}
