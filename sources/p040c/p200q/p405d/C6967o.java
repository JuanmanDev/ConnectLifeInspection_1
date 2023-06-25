package p040c.p200q.p405d;

/* renamed from: c.q.d.o */
/* compiled from: ExtensionRegistryFactory */
public final class C6967o {

    /* renamed from: a */
    public static final Class<?> f13339a = m20430c();

    /* renamed from: a */
    public static C6975p m20428a() {
        C6975p b = m20429b("getEmptyRegistry");
        return b != null ? b : C6975p.f13343d;
    }

    /* renamed from: b */
    public static final C6975p m20429b(String str) {
        Class<?> cls = f13339a;
        if (cls == null) {
            return null;
        }
        try {
            return (C6975p) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Class<?> m20430c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
