package p040c.p200q.p405d;

/* renamed from: c.q.d.t0 */
/* compiled from: NewInstanceSchemas */
public final class C6987t0 {

    /* renamed from: a */
    public static final C6983r0 f13374a = m20639c();

    /* renamed from: b */
    public static final C6983r0 f13375b = new C6985s0();

    /* renamed from: a */
    public static C6983r0 m20637a() {
        return f13374a;
    }

    /* renamed from: b */
    public static C6983r0 m20638b() {
        return f13375b;
    }

    /* renamed from: c */
    public static C6983r0 m20639c() {
        try {
            return (C6983r0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
