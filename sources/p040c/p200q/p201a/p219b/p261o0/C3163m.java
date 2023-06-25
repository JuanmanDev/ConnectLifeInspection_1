package p040c.p200q.p201a.p219b.p261o0;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* renamed from: c.q.a.b.o0.m */
/* compiled from: Log */
public final class C3163m {

    /* renamed from: a */
    public static int f5845a = 0;

    /* renamed from: b */
    public static boolean f5846b = true;

    /* renamed from: a */
    public static String m7875a(String str, @Nullable Throwable th) {
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return str;
        }
        return str + " - " + message;
    }

    /* renamed from: b */
    public static void m7876b(String str, String str2) {
        int i = f5845a;
    }

    /* renamed from: c */
    public static void m7877c(String str, String str2) {
        int i = f5845a;
    }

    /* renamed from: d */
    public static void m7878d(String str, String str2, @Nullable Throwable th) {
        if (!f5846b) {
            m7877c(str, m7875a(str2, th));
        }
        int i = f5845a;
    }

    /* renamed from: e */
    public static void m7879e(String str, String str2) {
        int i = f5845a;
    }

    /* renamed from: f */
    public static void m7880f(String str, String str2) {
        int i = f5845a;
    }

    /* renamed from: g */
    public static void m7881g(String str, String str2, @Nullable Throwable th) {
        if (!f5846b) {
            m7880f(str, m7875a(str2, th));
        }
        int i = f5845a;
    }
}
