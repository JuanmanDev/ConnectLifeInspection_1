package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.y */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5345y {

    /* renamed from: a */
    public final Map f10275a = new HashMap();

    /* renamed from: b */
    public final C5151l0 f10276b = new C5151l0();

    public C5345y() {
        mo27939b(new C5315w());
        mo27939b(new C5360z());
        mo27939b(new C4975a0());
        mo27939b(new C5039e0());
        mo27939b(new C5119j0());
        mo27939b(new C5135k0());
        mo27939b(new C5166m0());
    }

    /* renamed from: a */
    public final C5225q mo27938a(C5215p4 p4Var, C5225q qVar) {
        C5330x xVar;
        C5216p5.m14633c(p4Var);
        if (!(qVar instanceof C5240r)) {
            return qVar;
        }
        C5240r rVar = (C5240r) qVar;
        ArrayList b = rVar.mo27529b();
        String a = rVar.mo27528a();
        if (this.f10275a.containsKey(a)) {
            xVar = (C5330x) this.f10275a.get(a);
        } else {
            xVar = this.f10276b;
        }
        return xVar.mo26909a(a, p4Var, b);
    }

    /* renamed from: b */
    public final void mo27939b(C5330x xVar) {
        for (zzbl zzb : xVar.f10245a) {
            this.f10275a.put(zzb.zzb().toString(), xVar);
        }
    }
}
