package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.k */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final /* synthetic */ class C5134k {
    /* renamed from: a */
    public static C5225q m14393a(C5165m mVar, C5225q qVar, C5215p4 p4Var, List list) {
        if (mVar.mo27209g(qVar.mo27208f())) {
            C5225q p = mVar.mo27215p(qVar.mo27208f());
            if (p instanceof C5118j) {
                return ((C5118j) p).mo27025a(p4Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{qVar.mo27208f()}));
        } else if ("hasOwnProperty".equals(qVar.mo27208f())) {
            C5216p5.m14638h("hasOwnProperty", 1, list);
            if (mVar.mo27209g(p4Var.mo27496b((C5225q) list.get(0)).mo27208f())) {
                return C5225q.f10073i;
            }
            return C5225q.f10074j;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{qVar.mo27208f()}));
        }
    }

    /* renamed from: b */
    public static Iterator m14394b(Map map) {
        return new C5150l(map.keySet().iterator());
    }
}
