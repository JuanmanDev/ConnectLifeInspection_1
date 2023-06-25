package p040c.p200q.p405d;

/* renamed from: c.q.d.s */
/* compiled from: ExtensionSchemas */
public final class C6984s {

    /* renamed from: a */
    public static final C6979q<?> f13372a = new C6981r();

    /* renamed from: b */
    public static final C6979q<?> f13373b = m20623c();

    /* renamed from: a */
    public static C6979q<?> m20621a() {
        C6979q<?> qVar = f13373b;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static C6979q<?> m20622b() {
        return f13372a;
    }

    /* renamed from: c */
    public static C6979q<?> m20623c() {
        try {
            return (C6979q) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
