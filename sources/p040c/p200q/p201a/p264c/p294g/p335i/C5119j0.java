package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.q.a.c.g.i.j0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5119j0 extends C5330x {
    public C5119j0() {
        this.f10245a.add(zzbl.FOR_IN);
        this.f10245a.add(zzbl.FOR_IN_CONST);
        this.f10245a.add(zzbl.FOR_IN_LET);
        this.f10245a.add(zzbl.FOR_LET);
        this.f10245a.add(zzbl.FOR_OF);
        this.f10245a.add(zzbl.FOR_OF_CONST);
        this.f10245a.add(zzbl.FOR_OF_LET);
        this.f10245a.add(zzbl.WHILE);
    }

    /* renamed from: c */
    public static C5225q m14363c(C5087h0 h0Var, Iterator it, C5225q qVar) {
        if (it != null) {
            while (it.hasNext()) {
                C5225q c = h0Var.mo27224a((C5225q) it.next()).mo27497c((C5054f) qVar);
                if (c instanceof C5086h) {
                    C5086h hVar = (C5086h) c;
                    if ("break".equals(hVar.mo27282b())) {
                        return C5225q.f10068c;
                    }
                    if ("return".equals(hVar.mo27282b())) {
                        return hVar;
                    }
                }
            }
        }
        return C5225q.f10068c;
    }

    /* renamed from: d */
    public static C5225q m14364d(C5087h0 h0Var, C5225q qVar, C5225q qVar2) {
        return m14363c(h0Var, qVar.mo27213l(), qVar2);
    }

    /* renamed from: e */
    public static C5225q m14365e(C5087h0 h0Var, C5225q qVar, C5225q qVar2) {
        if (qVar instanceof Iterable) {
            return m14363c(h0Var, ((Iterable) qVar).iterator(), qVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* renamed from: a */
    public final C5225q mo26909a(String str, C5215p4 p4Var, List list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = C5216p5.m14635e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    C5216p5.m14638h(zzbl.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C5285u) {
                        return m14364d(new C5103i0(p4Var, ((C5225q) list.get(0)).mo27208f()), p4Var.mo27496b((C5225q) list.get(1)), p4Var.mo27496b((C5225q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    C5216p5.m14638h(zzbl.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C5285u) {
                        return m14364d(new C5055f0(p4Var, ((C5225q) list.get(0)).mo27208f()), p4Var.mo27496b((C5225q) list.get(1)), p4Var.mo27496b((C5225q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    C5216p5.m14638h(zzbl.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C5285u) {
                        return m14364d(new C5071g0(p4Var, ((C5225q) list.get(0)).mo27208f()), p4Var.mo27496b((C5225q) list.get(1)), p4Var.mo27496b((C5225q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    C5216p5.m14638h(zzbl.FOR_LET.name(), 4, list);
                    C5225q b = p4Var.mo27496b((C5225q) list.get(0));
                    if (b instanceof C5054f) {
                        C5054f fVar = (C5054f) b;
                        C5225q qVar = (C5225q) list.get(1);
                        C5225q qVar2 = (C5225q) list.get(2);
                        C5225q b2 = p4Var.mo27496b((C5225q) list.get(3));
                        C5215p4 a = p4Var.mo27495a();
                        for (int i = 0; i < fVar.mo27219u(); i++) {
                            String f = fVar.mo27220v(i).mo27208f();
                            a.mo27501g(f, p4Var.mo27498d(f));
                        }
                        while (p4Var.mo27496b(qVar).mo27212k().booleanValue()) {
                            C5225q c = p4Var.mo27497c((C5054f) b2);
                            if (c instanceof C5086h) {
                                C5086h hVar = (C5086h) c;
                                if ("break".equals(hVar.mo27282b())) {
                                    return C5225q.f10068c;
                                }
                                if ("return".equals(hVar.mo27282b())) {
                                    return hVar;
                                }
                            }
                            C5215p4 a2 = p4Var.mo27495a();
                            for (int i2 = 0; i2 < fVar.mo27219u(); i2++) {
                                String f2 = fVar.mo27220v(i2).mo27208f();
                                a2.mo27501g(f2, a.mo27498d(f2));
                            }
                            a2.mo27496b(qVar2);
                            a = a2;
                        }
                        return C5225q.f10068c;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    C5216p5.m14638h(zzbl.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C5285u) {
                        return m14365e(new C5103i0(p4Var, ((C5225q) list.get(0)).mo27208f()), p4Var.mo27496b((C5225q) list.get(1)), p4Var.mo27496b((C5225q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    C5216p5.m14638h(zzbl.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C5285u) {
                        return m14365e(new C5055f0(p4Var, ((C5225q) list.get(0)).mo27208f()), p4Var.mo27496b((C5225q) list.get(1)), p4Var.mo27496b((C5225q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    C5216p5.m14638h(zzbl.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C5285u) {
                        return m14365e(new C5071g0(p4Var, ((C5225q) list.get(0)).mo27208f()), p4Var.mo27496b((C5225q) list.get(1)), p4Var.mo27496b((C5225q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    super.mo27875b(str);
                    throw null;
            }
        } else {
            C5216p5.m14638h(zzbl.WHILE.name(), 4, list);
            C5225q qVar3 = (C5225q) list.get(0);
            C5225q qVar4 = (C5225q) list.get(1);
            C5225q b3 = p4Var.mo27496b((C5225q) list.get(3));
            if (p4Var.mo27496b((C5225q) list.get(2)).mo27212k().booleanValue()) {
                C5225q c2 = p4Var.mo27497c((C5054f) b3);
                if (c2 instanceof C5086h) {
                    C5086h hVar2 = (C5086h) c2;
                    if ("break".equals(hVar2.mo27282b())) {
                        return C5225q.f10068c;
                    }
                    if ("return".equals(hVar2.mo27282b())) {
                        return hVar2;
                    }
                }
            }
            while (p4Var.mo27496b(qVar3).mo27212k().booleanValue()) {
                C5225q c3 = p4Var.mo27497c((C5054f) b3);
                if (c3 instanceof C5086h) {
                    C5086h hVar3 = (C5086h) c3;
                    if ("break".equals(hVar3.mo27282b())) {
                        return C5225q.f10068c;
                    }
                    if ("return".equals(hVar3.mo27282b())) {
                        return hVar3;
                    }
                }
                p4Var.mo27496b(qVar4);
            }
            return C5225q.f10068c;
        }
    }
}
