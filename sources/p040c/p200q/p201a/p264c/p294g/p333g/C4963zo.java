package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.annotation.Nullable;

/* renamed from: c.q.a.c.g.g.zo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4963zo {
    @Nullable
    /* renamed from: a */
    public static String m13741a(String str) {
        Class<String> cls = String.class;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{cls}).invoke((Object) null, new Object[]{str});
            if (invoke != null && cls.isAssignableFrom(invoke.getClass())) {
                return (String) invoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
