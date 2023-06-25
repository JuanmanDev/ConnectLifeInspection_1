package p040c.p200q.p353b.p357d;

import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.d.b */
/* compiled from: DoubleUtils */
public final class C6235b {
    /* renamed from: a */
    public static double m17533a(double d) {
        C5850m.m16583d(!Double.isNaN(d));
        if (d > 0.0d) {
            return d;
        }
        return 0.0d;
    }

    /* renamed from: b */
    public static long m17534b(double d) {
        C5850m.m16584e(m17535c(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    /* renamed from: c */
    public static boolean m17535c(double d) {
        return Math.getExponent(d) <= 1023;
    }
}
