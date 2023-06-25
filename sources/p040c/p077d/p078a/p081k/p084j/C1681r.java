package p040c.p077d.p078a.p081k.p084j;

import java.util.HashMap;
import java.util.Map;
import p040c.p077d.p078a.p081k.C1567c;

/* renamed from: c.d.a.k.j.r */
/* compiled from: Jobs */
public final class C1681r {

    /* renamed from: a */
    public final Map<C1567c, C1669l<?>> f1183a = new HashMap();

    /* renamed from: b */
    public final Map<C1567c, C1669l<?>> f1184b = new HashMap();

    /* renamed from: a */
    public C1669l<?> mo15876a(C1567c cVar, boolean z) {
        return mo15877b(z).get(cVar);
    }

    /* renamed from: b */
    public final Map<C1567c, C1669l<?>> mo15877b(boolean z) {
        return z ? this.f1184b : this.f1183a;
    }

    /* renamed from: c */
    public void mo15878c(C1567c cVar, C1669l<?> lVar) {
        mo15877b(lVar.mo15846p()).put(cVar, lVar);
    }

    /* renamed from: d */
    public void mo15879d(C1567c cVar, C1669l<?> lVar) {
        Map<C1567c, C1669l<?>> b = mo15877b(lVar.mo15846p());
        if (lVar.equals(b.get(cVar))) {
            b.remove(cVar);
        }
    }
}
