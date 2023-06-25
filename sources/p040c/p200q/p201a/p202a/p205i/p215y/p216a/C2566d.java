package p040c.p200q.p201a.p202a.p205i.p215y.p216a;

/* renamed from: c.q.a.a.i.y.a.d */
/* compiled from: Preconditions */
public final class C2566d {
    /* renamed from: a */
    public static <T> void m4598a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: b */
    public static <T> T m4599b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: c */
    public static <T> T m4600c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
