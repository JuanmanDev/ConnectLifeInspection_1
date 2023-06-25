package p040c.p200q.p353b.p354a;

/* renamed from: c.q.b.a.m */
/* compiled from: Preconditions */
public final class C5850m {
    /* renamed from: a */
    public static String m16580a(int i, int i2, String str) {
        if (i < 0) {
            return C5864q.m16615b("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C5864q.m16615b("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }

    /* renamed from: b */
    public static String m16581b(int i, int i2, String str) {
        if (i < 0) {
            return C5864q.m16615b("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C5864q.m16615b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }

    /* renamed from: c */
    public static String m16582c(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m16581b(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return m16581b(i2, i3, "end index");
        }
        return C5864q.m16615b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: d */
    public static void m16583d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m16584e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m16585f(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(C5864q.m16615b(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: g */
    public static void m16586g(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(C5864q.m16615b(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* renamed from: h */
    public static void m16587h(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(C5864q.m16615b(str, Long.valueOf(j)));
        }
    }

    /* renamed from: i */
    public static void m16588i(boolean z, String str, long j, long j2) {
        if (!z) {
            throw new IllegalArgumentException(C5864q.m16615b(str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    /* renamed from: j */
    public static void m16589j(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C5864q.m16615b(str, obj));
        }
    }

    /* renamed from: k */
    public static void m16590k(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(C5864q.m16615b(str, obj, obj2));
        }
    }

    /* renamed from: l */
    public static void m16591l(boolean z, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z) {
            throw new IllegalArgumentException(C5864q.m16615b(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: m */
    public static int m16592m(int i, int i2) {
        m16593n(i, i2, "index");
        return i;
    }

    /* renamed from: n */
    public static int m16593n(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m16580a(i, i2, str));
    }

    /* renamed from: o */
    public static <T> T m16594o(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: p */
    public static <T> T m16595p(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: q */
    public static <T> T m16596q(T t, String str, Object obj, Object obj2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C5864q.m16615b(str, obj, obj2));
    }

    /* renamed from: r */
    public static int m16597r(int i, int i2) {
        m16598s(i, i2, "index");
        return i;
    }

    /* renamed from: s */
    public static int m16598s(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m16581b(i, i2, str));
    }

    /* renamed from: t */
    public static void m16599t(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m16582c(i, i2, i3));
        }
    }

    /* renamed from: u */
    public static void m16600u(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: v */
    public static void m16601v(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: w */
    public static void m16602w(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(C5864q.m16615b(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: x */
    public static void m16603x(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(C5864q.m16615b(str, obj));
        }
    }
}
