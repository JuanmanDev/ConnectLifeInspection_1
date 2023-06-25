package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: c.q.a.c.g.i.ca */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5017ca {

    /* renamed from: c */
    public static final C5017ca f9845c = new C5017ca();

    /* renamed from: a */
    public final C5081ga f9846a = new C5190n9();

    /* renamed from: b */
    public final ConcurrentMap f9847b = new ConcurrentHashMap();

    /* renamed from: a */
    public static C5017ca m13951a() {
        return f9845c;
    }

    /* renamed from: b */
    public final C5065fa mo27133b(Class cls) {
        C5369z8.m15426f(cls, "messageType");
        C5065fa faVar = (C5065fa) this.f9847b.get(cls);
        if (faVar == null) {
            faVar = this.f9846a.mo27274e(cls);
            C5369z8.m15426f(cls, "messageType");
            C5369z8.m15426f(faVar, "schema");
            C5065fa faVar2 = (C5065fa) this.f9847b.putIfAbsent(cls, faVar);
            return faVar2 == null ? faVar : faVar2;
        }
    }
}
