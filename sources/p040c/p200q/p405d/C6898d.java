package p040c.p200q.p405d;

/* renamed from: c.q.d.d */
/* compiled from: Android */
public final class C6898d {

    /* renamed from: a */
    public static final Class<?> f13204a = m19664a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f13205b = (m19664a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    public static <T> Class<T> m19664a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class<?> m19665b() {
        return f13204a;
    }

    /* renamed from: c */
    public static boolean m19666c() {
        return f13204a != null && !f13205b;
    }
}
