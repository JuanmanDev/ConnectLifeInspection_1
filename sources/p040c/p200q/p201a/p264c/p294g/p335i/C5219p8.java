package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.p8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5219p8 implements C5265s9 {

    /* renamed from: a */
    public static final C5219p8 f10060a = new C5219p8();

    /* renamed from: c */
    public static C5219p8 m14645c() {
        return f10060a;
    }

    /* renamed from: a */
    public final C5250r9 mo27401a(Class cls) {
        Class<C5279t8> cls2 = C5279t8.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (C5250r9) C5279t8.m14954B(cls.asSubclass(cls2)).mo26916C(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
    }

    /* renamed from: b */
    public final boolean mo27402b(Class cls) {
        return C5279t8.class.isAssignableFrom(cls);
    }
}
