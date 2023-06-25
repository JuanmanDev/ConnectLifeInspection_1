package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: c.q.a.c.g.g.t2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4785t2 {

    /* renamed from: c */
    public static final C4785t2 f9632c = new C4785t2();

    /* renamed from: a */
    public final C4915y2 f9633a = new C4383e2();

    /* renamed from: b */
    public final ConcurrentMap f9634b = new ConcurrentHashMap();

    /* renamed from: a */
    public static C4785t2 m13132a() {
        return f9632c;
    }

    /* renamed from: b */
    public final C4889x2 mo26659b(Class cls) {
        C4706q1.m12869f(cls, "messageType");
        C4889x2 x2Var = (C4889x2) this.f9634b.get(cls);
        if (x2Var == null) {
            x2Var = this.f9633a.mo25931e(cls);
            C4706q1.m12869f(cls, "messageType");
            C4706q1.m12869f(x2Var, "schema");
            C4889x2 x2Var2 = (C4889x2) this.f9634b.putIfAbsent(cls, x2Var);
            return x2Var2 == null ? x2Var : x2Var2;
        }
    }
}
