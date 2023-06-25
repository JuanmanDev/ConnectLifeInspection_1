package p040c.p200q.p353b.p357d;

import java.math.RoundingMode;

/* renamed from: c.q.b.d.f */
/* compiled from: MathPreconditions */
public final class C6245f {
    /* renamed from: a */
    public static void m17544a(boolean z, double d, RoundingMode roundingMode) {
        if (!z) {
            throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
        }
    }

    /* renamed from: b */
    public static void m17545b(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new ArithmeticException("overflow: " + str + "(" + i + ", " + i2 + ")");
        }
    }

    /* renamed from: c */
    public static void m17546c(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
