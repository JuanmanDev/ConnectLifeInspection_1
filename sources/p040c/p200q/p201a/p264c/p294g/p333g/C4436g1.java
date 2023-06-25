package p040c.p200q.p201a.p264c.p294g.p333g;

/* renamed from: c.q.a.c.g.g.g1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4436g1 implements C4518j2 {

    /* renamed from: a */
    public static final C4436g1 f9241a = new C4436g1();

    /* renamed from: c */
    public static C4436g1 m12013c() {
        return f9241a;
    }

    /* renamed from: a */
    public final C4491i2 mo25842a(Class cls) {
        Class<C4544k1> cls2 = C4544k1.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (C4491i2) C4544k1.m12258z(cls.asSubclass(cls2)).mo25825v(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
    }

    /* renamed from: b */
    public final boolean mo25843b(Class cls) {
        return C4544k1.class.isAssignableFrom(cls);
    }
}
