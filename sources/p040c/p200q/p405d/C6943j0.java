package p040c.p200q.p405d;

/* renamed from: c.q.d.j0 */
/* compiled from: MapFieldSchemas */
public final class C6943j0 {

    /* renamed from: a */
    public static final C6930h0 f13303a = m20116c();

    /* renamed from: b */
    public static final C6930h0 f13304b = new C6933i0();

    /* renamed from: a */
    public static C6930h0 m20114a() {
        return f13303a;
    }

    /* renamed from: b */
    public static C6930h0 m20115b() {
        return f13304b;
    }

    /* renamed from: c */
    public static C6930h0 m20116c() {
        try {
            return (C6930h0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
