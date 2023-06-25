package p040c.p325e0.p326a.p332c;

import java.util.Locale;

/* renamed from: c.e0.a.c.g */
/* compiled from: BUGLY */
public final class C4270g {

    /* renamed from: a */
    public static boolean f9106a = false;

    /* renamed from: a */
    public static boolean m11648a(int i, String str, Object... objArr) {
        if (!f9106a) {
            return false;
        }
        if (!(str == null || objArr == null || objArr.length == 0)) {
            String.format(Locale.US, str, objArr);
        }
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m11649b(String str, Object... objArr) {
        return m11648a(0, str, objArr);
    }

    /* renamed from: c */
    public static boolean m11650c(Throwable th) {
        if (!f9106a) {
            return false;
        }
        return m11648a(2, C4271h.m11656c(th), new Object[0]);
    }

    /* renamed from: d */
    public static boolean m11651d(String str, Object... objArr) {
        return m11648a(1, str, objArr);
    }

    /* renamed from: e */
    public static boolean m11652e(String str, Object... objArr) {
        return m11648a(2, str, objArr);
    }

    /* renamed from: f */
    public static boolean m11653f(String str, Object... objArr) {
        return m11648a(3, str, objArr);
    }
}
