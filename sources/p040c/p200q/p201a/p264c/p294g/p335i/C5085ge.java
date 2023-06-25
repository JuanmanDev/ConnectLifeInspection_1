package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.List;

/* renamed from: c.q.a.c.g.i.ge */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5085ge extends C5118j {

    /* renamed from: m */
    public final C5149ke f9919m;

    public C5085ge(C5149ke keVar) {
        super("internal.registerCallback");
        this.f9919m = keVar;
    }

    /* renamed from: a */
    public final C5225q mo27025a(C5215p4 p4Var, List list) {
        C5216p5.m14638h(this.f9952e, 3, list);
        String f = p4Var.mo27496b((C5225q) list.get(0)).mo27208f();
        C5225q b = p4Var.mo27496b((C5225q) list.get(1));
        if (b instanceof C5210p) {
            C5225q b2 = p4Var.mo27496b((C5225q) list.get(2));
            if (b2 instanceof C5180n) {
                C5180n nVar = (C5180n) b2;
                if (nVar.mo27209g("type")) {
                    this.f9919m.mo27379a(f, nVar.mo27209g("priority") ? C5216p5.m14632b(nVar.mo27215p("priority").mo27206e().doubleValue()) : 1000, (C5210p) b, nVar.mo27215p("type").mo27208f());
                    return C5225q.f10068c;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
