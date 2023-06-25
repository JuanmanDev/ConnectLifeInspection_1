package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: c.q.a.c.g.i.he */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5101he extends C5118j {

    /* renamed from: m */
    public final C5233q7 f9937m;

    /* renamed from: n */
    public final Map f9938n = new HashMap();

    public C5101he(C5233q7 q7Var) {
        super("require");
        this.f9937m = q7Var;
    }

    /* renamed from: a */
    public final C5225q mo27025a(C5215p4 p4Var, List list) {
        C5225q qVar;
        C5216p5.m14638h("require", 1, list);
        String f = p4Var.mo27496b((C5225q) list.get(0)).mo27208f();
        if (this.f9938n.containsKey(f)) {
            return (C5225q) this.f9938n.get(f);
        }
        C5233q7 q7Var = this.f9937m;
        if (q7Var.f10095a.containsKey(f)) {
            try {
                qVar = (C5225q) ((Callable) q7Var.f10095a.get(f)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(f)));
            }
        } else {
            qVar = C5225q.f10068c;
        }
        if (qVar instanceof C5118j) {
            this.f9938n.put(f, (C5118j) qVar);
        }
        return qVar;
    }
}
