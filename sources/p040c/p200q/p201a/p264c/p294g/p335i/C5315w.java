package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* renamed from: c.q.a.c.g.i.w */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5315w extends C5330x {
    public C5315w() {
        this.f10245a.add(zzbl.BITWISE_AND);
        this.f10245a.add(zzbl.BITWISE_LEFT_SHIFT);
        this.f10245a.add(zzbl.BITWISE_NOT);
        this.f10245a.add(zzbl.BITWISE_OR);
        this.f10245a.add(zzbl.BITWISE_RIGHT_SHIFT);
        this.f10245a.add(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f10245a.add(zzbl.BITWISE_XOR);
    }

    /* renamed from: a */
    public final C5225q mo26909a(String str, C5215p4 p4Var, List list) {
        zzbl zzbl = zzbl.ADD;
        switch (C5216p5.m14635e(str).ordinal()) {
            case 4:
                C5216p5.m14638h(zzbl.BITWISE_AND.name(), 2, list);
                return new C5102i(Double.valueOf((double) (C5216p5.m14632b(p4Var.mo27496b((C5225q) list.get(0)).mo27206e().doubleValue()) & C5216p5.m14632b(p4Var.mo27496b((C5225q) list.get(1)).mo27206e().doubleValue()))));
            case 5:
                C5216p5.m14638h(zzbl.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C5102i(Double.valueOf((double) (C5216p5.m14632b(p4Var.mo27496b((C5225q) list.get(0)).mo27206e().doubleValue()) << ((int) (C5216p5.m14634d(p4Var.mo27496b((C5225q) list.get(1)).mo27206e().doubleValue()) & 31)))));
            case 6:
                C5216p5.m14638h(zzbl.BITWISE_NOT.name(), 1, list);
                return new C5102i(Double.valueOf((double) (~C5216p5.m14632b(p4Var.mo27496b((C5225q) list.get(0)).mo27206e().doubleValue()))));
            case 7:
                C5216p5.m14638h(zzbl.BITWISE_OR.name(), 2, list);
                return new C5102i(Double.valueOf((double) (C5216p5.m14632b(p4Var.mo27496b((C5225q) list.get(0)).mo27206e().doubleValue()) | C5216p5.m14632b(p4Var.mo27496b((C5225q) list.get(1)).mo27206e().doubleValue()))));
            case 8:
                C5216p5.m14638h(zzbl.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C5102i(Double.valueOf((double) (C5216p5.m14632b(p4Var.mo27496b((C5225q) list.get(0)).mo27206e().doubleValue()) >> ((int) (C5216p5.m14634d(p4Var.mo27496b((C5225q) list.get(1)).mo27206e().doubleValue()) & 31)))));
            case 9:
                C5216p5.m14638h(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C5102i(Double.valueOf((double) (C5216p5.m14634d(p4Var.mo27496b((C5225q) list.get(0)).mo27206e().doubleValue()) >>> ((int) (C5216p5.m14634d(p4Var.mo27496b((C5225q) list.get(1)).mo27206e().doubleValue()) & 31)))));
            case 10:
                C5216p5.m14638h(zzbl.BITWISE_XOR.name(), 2, list);
                return new C5102i(Double.valueOf((double) (C5216p5.m14632b(p4Var.mo27496b((C5225q) list.get(0)).mo27206e().doubleValue()) ^ C5216p5.m14632b(p4Var.mo27496b((C5225q) list.get(1)).mo27206e().doubleValue()))));
            default:
                super.mo27875b(str);
                throw null;
        }
    }
}
