package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.o8 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5204o8 extends C5118j {

    /* renamed from: m */
    public final C5006c f10040m;

    public C5204o8(C5006c cVar) {
        super("internal.eventLogger");
        this.f10040m = cVar;
    }

    /* renamed from: a */
    public final C5225q mo27025a(C5215p4 p4Var, List list) {
        Map map;
        C5216p5.m14638h(this.f9952e, 3, list);
        String f = p4Var.mo27496b((C5225q) list.get(0)).mo27208f();
        long a = (long) C5216p5.m14631a(p4Var.mo27496b((C5225q) list.get(1)).mo27206e().doubleValue());
        C5225q b = p4Var.mo27496b((C5225q) list.get(2));
        if (b instanceof C5180n) {
            map = C5216p5.m14637g((C5180n) b);
        } else {
            map = new HashMap();
        }
        this.f10040m.mo27031e(f, a, map);
        return C5225q.f10068c;
    }
}
