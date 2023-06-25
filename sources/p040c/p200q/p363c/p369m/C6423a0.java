package p040c.p200q.p363c.p369m;

/* renamed from: c.q.c.m.a0 */
/* compiled from: Preconditions */
public final class C6423a0 {
    /* renamed from: a */
    public static void m17951a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m17952b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: c */
    public static <T> T m17953c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m17954d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
