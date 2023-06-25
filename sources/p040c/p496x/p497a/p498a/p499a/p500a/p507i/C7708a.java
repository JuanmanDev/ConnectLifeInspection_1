package p040c.p496x.p497a.p498a.p499a.p500a.p507i;

import okhttp3.internal.platform.android.AndroidLog;

/* renamed from: c.x.a.a.a.a.i.a */
public final class C7708a {
    /* renamed from: a */
    public static String m21817a(Object[] objArr, String... strArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (strArr != null) {
            for (String append : strArr) {
                sb.append(append);
            }
        }
        for (Object append2 : objArr) {
            sb.append(append2);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static void m21818b(String str, Object... objArr) {
        String a = m21817a(objArr, "|");
        if (a != null && a.length() > 4000) {
            do {
                a.substring(0, AndroidLog.MAX_LOG_LENGTH);
                a = a.substring(AndroidLog.MAX_LOG_LENGTH);
            } while (a.length() > 4000);
        }
    }

    /* renamed from: c */
    public static void m21819c(String str, Object... objArr) {
        String a = m21817a(objArr, "|");
        if (a != null && a.length() > 4000) {
            do {
                a.substring(0, AndroidLog.MAX_LOG_LENGTH);
                a = a.substring(AndroidLog.MAX_LOG_LENGTH);
            } while (a.length() > 4000);
        }
    }

    /* renamed from: d */
    public static void m21820d(String str, Object... objArr) {
        String a = m21817a(objArr, "|");
        if (a != null && a.length() > 4000) {
            do {
                a.substring(0, AndroidLog.MAX_LOG_LENGTH);
                a = a.substring(AndroidLog.MAX_LOG_LENGTH);
            } while (a.length() > 4000);
        }
    }

    /* renamed from: e */
    public static void m21821e(String str, Throwable th, Object... objArr) {
        String a = m21817a(objArr, "|");
        if (a != null && a.length() > 4000) {
            do {
                a.substring(0, AndroidLog.MAX_LOG_LENGTH);
                a = a.substring(AndroidLog.MAX_LOG_LENGTH);
            } while (a.length() > 4000);
        }
    }
}
