package p040c.p200q.p201a.p202a.p205i.p206a0;

import android.os.Build;
import android.util.Log;

/* renamed from: c.q.a.a.i.a0.a */
/* compiled from: Logging */
public final class C2396a {
    /* renamed from: a */
    public static String m4207a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* renamed from: b */
    public static void m4208b(String str, String str2, Object obj) {
        if (Log.isLoggable(m4211e(str), 3)) {
            String.format(str2, new Object[]{obj});
        }
    }

    /* renamed from: c */
    public static void m4209c(String str, String str2, Object... objArr) {
        if (Log.isLoggable(m4211e(str), 3)) {
            String.format(str2, objArr);
        }
    }

    /* renamed from: d */
    public static void m4210d(String str, String str2, Throwable th) {
        boolean isLoggable = Log.isLoggable(m4211e(str), 6);
    }

    /* renamed from: e */
    public static String m4211e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m4207a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: f */
    public static void m4212f(String str, String str2, Object obj) {
        if (Log.isLoggable(m4211e(str), 4)) {
            String.format(str2, new Object[]{obj});
        }
    }

    /* renamed from: g */
    public static void m4213g(String str, String str2, Object obj) {
        if (Log.isLoggable(m4211e(str), 5)) {
            String.format(str2, new Object[]{obj});
        }
    }
}
