package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* renamed from: c.q.a.c.g.i.z */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5360z extends C5330x {
    public C5360z() {
        this.f10245a.add(zzbl.EQUALS);
        this.f10245a.add(zzbl.GREATER_THAN);
        this.f10245a.add(zzbl.GREATER_THAN_EQUALS);
        this.f10245a.add(zzbl.IDENTITY_EQUALS);
        this.f10245a.add(zzbl.IDENTITY_NOT_EQUALS);
        this.f10245a.add(zzbl.LESS_THAN);
        this.f10245a.add(zzbl.LESS_THAN_EQUALS);
        this.f10245a.add(zzbl.NOT_EQUALS);
    }

    /* renamed from: c */
    public static boolean m15389c(C5225q qVar, C5225q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof C5300v) || (qVar instanceof C5195o)) {
                return true;
            }
            if (qVar instanceof C5102i) {
                return !Double.isNaN(qVar.mo27206e().doubleValue()) && !Double.isNaN(qVar2.mo27206e().doubleValue()) && qVar.mo27206e().doubleValue() == qVar2.mo27206e().doubleValue();
            }
            if (qVar instanceof C5285u) {
                return qVar.mo27208f().equals(qVar2.mo27208f());
            }
            if (qVar instanceof C5070g) {
                return qVar.mo27212k().equals(qVar2.mo27212k());
            }
            return qVar == qVar2;
        } else if (((qVar instanceof C5300v) || (qVar instanceof C5195o)) && ((qVar2 instanceof C5300v) || (qVar2 instanceof C5195o))) {
            return true;
        } else {
            boolean z = qVar instanceof C5102i;
            if (z && (qVar2 instanceof C5285u)) {
                return m15389c(qVar, new C5102i(qVar2.mo27206e()));
            }
            boolean z2 = qVar instanceof C5285u;
            if (z2 && (qVar2 instanceof C5102i)) {
                return m15389c(new C5102i(qVar.mo27206e()), qVar2);
            }
            if (qVar instanceof C5070g) {
                return m15389c(new C5102i(qVar.mo27206e()), qVar2);
            }
            if (qVar2 instanceof C5070g) {
                return m15389c(qVar, new C5102i(qVar2.mo27206e()));
            }
            if ((z2 || z) && (qVar2 instanceof C5165m)) {
                return m15389c(qVar, new C5285u(qVar2.mo27208f()));
            }
            if (!(qVar instanceof C5165m) || (!(qVar2 instanceof C5285u) && !(qVar2 instanceof C5102i))) {
                return false;
            }
            return m15389c(new C5285u(qVar.mo27208f()), qVar2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r0 = (r3 > 0.0d ? 1 : (r3 == 0.0d ? 0 : -1));
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m15390d(p040c.p200q.p201a.p264c.p294g.p335i.C5225q r8, p040c.p200q.p201a.p264c.p294g.p335i.C5225q r9) {
        /*
            boolean r0 = r8 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5165m
            if (r0 == 0) goto L_0x000e
            c.q.a.c.g.i.u r0 = new c.q.a.c.g.i.u
            java.lang.String r8 = r8.mo27208f()
            r0.<init>(r8)
            r8 = r0
        L_0x000e:
            boolean r0 = r9 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5165m
            if (r0 == 0) goto L_0x001c
            c.q.a.c.g.i.u r0 = new c.q.a.c.g.i.u
            java.lang.String r9 = r9.mo27208f()
            r0.<init>(r9)
            r9 = r0
        L_0x001c:
            boolean r0 = r8 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5285u
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0037
            boolean r0 = r9 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5285u
            if (r0 != 0) goto L_0x0027
            goto L_0x0037
        L_0x0027:
            java.lang.String r8 = r8.mo27208f()
            java.lang.String r9 = r9.mo27208f()
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x0036
            return r1
        L_0x0036:
            return r2
        L_0x0037:
            java.lang.Double r8 = r8.mo27206e()
            double r3 = r8.doubleValue()
            java.lang.Double r8 = r9.mo27206e()
            double r8 = r8.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L_0x006d
            boolean r0 = java.lang.Double.isNaN(r8)
            if (r0 == 0) goto L_0x0054
            goto L_0x006d
        L_0x0054:
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0065
        L_0x005e:
            if (r0 != 0) goto L_0x0066
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            return r2
        L_0x0066:
            int r8 = java.lang.Double.compare(r3, r8)
            if (r8 >= 0) goto L_0x006d
            return r1
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5360z.m15390d(c.q.a.c.g.i.q, c.q.a.c.g.i.q):boolean");
    }

    /* renamed from: e */
    public static boolean m15391e(C5225q qVar, C5225q qVar2) {
        if (qVar instanceof C5165m) {
            qVar = new C5285u(qVar.mo27208f());
        }
        if (qVar2 instanceof C5165m) {
            qVar2 = new C5285u(qVar2.mo27208f());
        }
        if (((!(qVar instanceof C5285u) || !(qVar2 instanceof C5285u)) && (Double.isNaN(qVar.mo27206e().doubleValue()) || Double.isNaN(qVar2.mo27206e().doubleValue()))) || m15390d(qVar2, qVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C5225q mo26909a(String str, C5215p4 p4Var, List list) {
        boolean z;
        boolean c;
        C5216p5.m14638h(C5216p5.m14635e(str).name(), 2, list);
        C5225q b = p4Var.mo27496b((C5225q) list.get(0));
        C5225q b2 = p4Var.mo27496b((C5225q) list.get(1));
        int ordinal = C5216p5.m14635e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c = m15389c(b, b2);
            } else if (ordinal == 42) {
                z = m15390d(b, b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z = m15390d(b2, b);
                        break;
                    case 38:
                        z = m15391e(b2, b);
                        break;
                    case 39:
                        z = C5216p5.m14642l(b, b2);
                        break;
                    case 40:
                        c = C5216p5.m14642l(b, b2);
                        break;
                    default:
                        super.mo27875b(str);
                        throw null;
                }
            } else {
                z = m15391e(b, b2);
            }
            z = !c;
        } else {
            z = m15389c(b, b2);
        }
        return z ? C5225q.f10073i : C5225q.f10074j;
    }
}
