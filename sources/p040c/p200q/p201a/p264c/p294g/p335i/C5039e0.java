package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* renamed from: c.q.a.c.g.i.e0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5039e0 extends C5330x {
    public C5039e0() {
        this.f10245a.add(zzbl.AND);
        this.f10245a.add(zzbl.NOT);
        this.f10245a.add(zzbl.OR);
    }

    /* renamed from: a */
    public final C5225q mo26909a(String str, C5215p4 p4Var, List list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = C5216p5.m14635e(str).ordinal();
        if (ordinal == 1) {
            C5216p5.m14638h(zzbl.AND.name(), 2, list);
            C5225q b = p4Var.mo27496b((C5225q) list.get(0));
            if (!b.mo27212k().booleanValue()) {
                return b;
            }
            return p4Var.mo27496b((C5225q) list.get(1));
        } else if (ordinal == 47) {
            C5216p5.m14638h(zzbl.NOT.name(), 1, list);
            return new C5070g(Boolean.valueOf(!p4Var.mo27496b((C5225q) list.get(0)).mo27212k().booleanValue()));
        } else if (ordinal == 50) {
            C5216p5.m14638h(zzbl.OR.name(), 2, list);
            C5225q b2 = p4Var.mo27496b((C5225q) list.get(0));
            if (b2.mo27212k().booleanValue()) {
                return b2;
            }
            return p4Var.mo27496b((C5225q) list.get(1));
        } else {
            super.mo27875b(str);
            throw null;
        }
    }
}
