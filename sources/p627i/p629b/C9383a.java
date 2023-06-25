package p627i.p629b;

import junit.framework.AssertionFailedError;

@Deprecated
/* renamed from: i.b.a */
/* compiled from: Assert */
public class C9383a {
    /* renamed from: a */
    public static void m25311a(String str, boolean z) {
        m25313c(str, !z);
    }

    /* renamed from: b */
    public static void m25312b(String str, Object obj) {
        m25313c(str, obj != null);
    }

    /* renamed from: c */
    public static void m25313c(String str, boolean z) {
        if (!z) {
            m25314d(str);
            throw null;
        }
    }

    /* renamed from: d */
    public static void m25314d(String str) {
        if (str == null) {
            throw new AssertionFailedError();
        }
        throw new AssertionFailedError(str);
    }

    /* renamed from: e */
    public static String m25315e(String str, Object obj, Object obj2) {
        String str2;
        if (str == null || str.length() <= 0) {
            str2 = "";
        } else {
            str2 = str + " ";
        }
        return str2 + "expected:<" + obj + "> but was:<" + obj2 + ">";
    }
}
