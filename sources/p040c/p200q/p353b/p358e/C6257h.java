package p040c.p200q.p353b.p358e;

import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.e.h */
/* compiled from: UnsignedInts */
public final class C6257h {
    /* renamed from: a */
    public static int m17597a(int i, int i2) {
        return C6250c.m17570d(m17599c(i), m17599c(i2));
    }

    /* renamed from: b */
    public static int m17598b(int i, int i2) {
        return (int) (m17602f(i) / m17602f(i2));
    }

    /* renamed from: c */
    public static int m17599c(int i) {
        return i ^ Integer.MIN_VALUE;
    }

    /* renamed from: d */
    public static int m17600d(String str, int i) {
        C5850m.m16594o(str);
        long parseLong = Long.parseLong(str, i);
        if ((4294967295L & parseLong) == parseLong) {
            return (int) parseLong;
        }
        throw new NumberFormatException("Input " + str + " in base " + i + " is not in the range of an unsigned integer");
    }

    /* renamed from: e */
    public static int m17601e(int i, int i2) {
        return (int) (m17602f(i) % m17602f(i2));
    }

    /* renamed from: f */
    public static long m17602f(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: g */
    public static String m17603g(int i, int i2) {
        return Long.toString(((long) i) & 4294967295L, i2);
    }
}
