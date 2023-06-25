package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* renamed from: c.q.a.c.g.i.k0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5135k0 extends C5330x {
    public C5135k0() {
        this.f10245a.add(zzbl.ADD);
        this.f10245a.add(zzbl.DIVIDE);
        this.f10245a.add(zzbl.MODULUS);
        this.f10245a.add(zzbl.MULTIPLY);
        this.f10245a.add(zzbl.NEGATE);
        this.f10245a.add(zzbl.POST_DECREMENT);
        this.f10245a.add(zzbl.POST_INCREMENT);
        this.f10245a.add(zzbl.PRE_DECREMENT);
        this.f10245a.add(zzbl.PRE_INCREMENT);
        this.f10245a.add(zzbl.SUBTRACT);
    }

    /* renamed from: a */
    public final C5225q mo26909a(String str, C5215p4 p4Var, List list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = C5216p5.m14635e(str).ordinal();
        if (ordinal == 0) {
            C5216p5.m14638h(zzbl.ADD.name(), 2, list);
            C5225q b = p4Var.mo27496b((C5225q) list.get(0));
            C5225q b2 = p4Var.mo27496b((C5225q) list.get(1));
            if ((b instanceof C5165m) || (b instanceof C5285u) || (b2 instanceof C5165m) || (b2 instanceof C5285u)) {
                return new C5285u(String.valueOf(b.mo27208f()).concat(String.valueOf(b2.mo27208f())));
            }
            return new C5102i(Double.valueOf(b.mo27206e().doubleValue() + b2.mo27206e().doubleValue()));
        } else if (ordinal == 21) {
            C5216p5.m14638h(zzbl.DIVIDE.name(), 2, list);
            return new C5102i(Double.valueOf(p4Var.mo27496b((C5225q) list.get(0)).mo27206e().doubleValue() / p4Var.mo27496b((C5225q) list.get(1)).mo27206e().doubleValue()));
        } else if (ordinal == 59) {
            C5216p5.m14638h(zzbl.SUBTRACT.name(), 2, list);
            return new C5102i(Double.valueOf(p4Var.mo27496b((C5225q) list.get(0)).mo27206e().doubleValue() + new C5102i(Double.valueOf(-p4Var.mo27496b((C5225q) list.get(1)).mo27206e().doubleValue())).mo27206e().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            C5216p5.m14638h(str, 2, list);
            C5225q b3 = p4Var.mo27496b((C5225q) list.get(0));
            p4Var.mo27496b((C5225q) list.get(1));
            return b3;
        } else if (ordinal == 55 || ordinal == 56) {
            C5216p5.m14638h(str, 1, list);
            return p4Var.mo27496b((C5225q) list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    C5216p5.m14638h(zzbl.MODULUS.name(), 2, list);
                    return new C5102i(Double.valueOf(p4Var.mo27496b((C5225q) list.get(0)).mo27206e().doubleValue() % p4Var.mo27496b((C5225q) list.get(1)).mo27206e().doubleValue()));
                case 45:
                    C5216p5.m14638h(zzbl.MULTIPLY.name(), 2, list);
                    return new C5102i(Double.valueOf(p4Var.mo27496b((C5225q) list.get(0)).mo27206e().doubleValue() * p4Var.mo27496b((C5225q) list.get(1)).mo27206e().doubleValue()));
                case 46:
                    C5216p5.m14638h(zzbl.NEGATE.name(), 1, list);
                    return new C5102i(Double.valueOf(-p4Var.mo27496b((C5225q) list.get(0)).mo27206e().doubleValue()));
                default:
                    super.mo27875b(str);
                    throw null;
            }
        }
    }
}
