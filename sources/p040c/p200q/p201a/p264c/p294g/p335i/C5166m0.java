package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.q.a.c.g.i.m0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5166m0 extends C5330x {
    public C5166m0() {
        this.f10245a.add(zzbl.ASSIGN);
        this.f10245a.add(zzbl.CONST);
        this.f10245a.add(zzbl.CREATE_ARRAY);
        this.f10245a.add(zzbl.CREATE_OBJECT);
        this.f10245a.add(zzbl.EXPRESSION_LIST);
        this.f10245a.add(zzbl.zzH);
        this.f10245a.add(zzbl.GET_INDEX);
        this.f10245a.add(zzbl.GET_PROPERTY);
        this.f10245a.add(zzbl.NULL);
        this.f10245a.add(zzbl.SET_PROPERTY);
        this.f10245a.add(zzbl.TYPEOF);
        this.f10245a.add(zzbl.UNDEFINED);
        this.f10245a.add(zzbl.VAR);
    }

    /* renamed from: a */
    public final C5225q mo26909a(String str, C5215p4 p4Var, List list) {
        String str2;
        zzbl zzbl = zzbl.ADD;
        int ordinal = C5216p5.m14635e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            C5216p5.m14638h(zzbl.ASSIGN.name(), 2, list);
            C5225q b = p4Var.mo27496b((C5225q) list.get(0));
            if (!(b instanceof C5285u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{b.getClass().getCanonicalName()}));
            } else if (p4Var.mo27502h(b.mo27208f())) {
                C5225q b2 = p4Var.mo27496b((C5225q) list.get(1));
                p4Var.mo27501g(b.mo27208f(), b2);
                return b2;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{b.mo27208f()}));
            }
        } else if (ordinal == 14) {
            C5216p5.m14639i(zzbl.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                int i2 = 0;
                while (i2 < list.size() - 1) {
                    C5225q b3 = p4Var.mo27496b((C5225q) list.get(i2));
                    if (b3 instanceof C5285u) {
                        p4Var.mo27500f(b3.mo27208f(), p4Var.mo27496b((C5225q) list.get(i2 + 1)));
                        i2 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{b3.getClass().getCanonicalName()}));
                    }
                }
                return C5225q.f10068c;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
        } else if (ordinal == 24) {
            C5216p5.m14639i(zzbl.EXPRESSION_LIST.name(), 1, list);
            C5225q qVar = C5225q.f10068c;
            while (i < list.size()) {
                qVar = p4Var.mo27496b((C5225q) list.get(i));
                if (!(qVar instanceof C5086h)) {
                    i++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return qVar;
        } else if (ordinal == 33) {
            C5216p5.m14638h(zzbl.zzH.name(), 1, list);
            C5225q b4 = p4Var.mo27496b((C5225q) list.get(0));
            if (b4 instanceof C5285u) {
                return p4Var.mo27498d(b4.mo27208f());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{b4.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            C5216p5.m14638h(zzbl.NULL.name(), 0, list);
            return C5225q.f10069d;
        } else if (ordinal == 58) {
            C5216p5.m14638h(zzbl.SET_PROPERTY.name(), 3, list);
            C5225q b5 = p4Var.mo27496b((C5225q) list.get(0));
            C5225q b6 = p4Var.mo27496b((C5225q) list.get(1));
            C5225q b7 = p4Var.mo27496b((C5225q) list.get(2));
            if (b5 == C5225q.f10068c || b5 == C5225q.f10069d) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{b6.mo27208f(), b5.mo27208f()}));
            }
            if ((b5 instanceof C5054f) && (b6 instanceof C5102i)) {
                ((C5054f) b5).mo27203E(b6.mo27206e().intValue(), b7);
            } else if (b5 instanceof C5165m) {
                ((C5165m) b5).mo27214o(b6.mo27208f(), b7);
            }
            return b7;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    C5216p5.m14638h(zzbl.GET_PROPERTY.name(), 2, list);
                    C5225q b8 = p4Var.mo27496b((C5225q) list.get(0));
                    C5225q b9 = p4Var.mo27496b((C5225q) list.get(1));
                    if ((b8 instanceof C5054f) && C5216p5.m14641k(b9)) {
                        return ((C5054f) b8).mo27220v(b9.mo27206e().intValue());
                    }
                    if (b8 instanceof C5165m) {
                        return ((C5165m) b8).mo27215p(b9.mo27208f());
                    }
                    if (b8 instanceof C5285u) {
                        if ("length".equals(b9.mo27208f())) {
                            return new C5102i(Double.valueOf((double) b8.mo27208f().length()));
                        }
                        if (C5216p5.m14641k(b9) && b9.mo27206e().doubleValue() < ((double) b8.mo27208f().length())) {
                            return new C5285u(String.valueOf(b8.mo27208f().charAt(b9.mo27206e().intValue())));
                        }
                    }
                    return C5225q.f10068c;
                }
                switch (ordinal) {
                    case 62:
                        C5216p5.m14638h(zzbl.TYPEOF.name(), 1, list);
                        C5225q b10 = p4Var.mo27496b((C5225q) list.get(0));
                        if (b10 instanceof C5300v) {
                            str2 = "undefined";
                        } else if (b10 instanceof C5070g) {
                            str2 = "boolean";
                        } else if (b10 instanceof C5102i) {
                            str2 = "number";
                        } else if (b10 instanceof C5285u) {
                            str2 = "string";
                        } else if (b10 instanceof C5210p) {
                            str2 = "function";
                        } else if ((b10 instanceof C5240r) || (b10 instanceof C5086h)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{b10}));
                        } else {
                            str2 = "object";
                        }
                        return new C5285u(str2);
                    case 63:
                        C5216p5.m14638h(zzbl.UNDEFINED.name(), 0, list);
                        return C5225q.f10068c;
                    case 64:
                        C5216p5.m14639i(zzbl.VAR.name(), 1, list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C5225q b11 = p4Var.mo27496b((C5225q) it.next());
                            if (b11 instanceof C5285u) {
                                p4Var.mo27499e(b11.mo27208f(), C5225q.f10068c);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{b11.getClass().getCanonicalName()}));
                            }
                        }
                        return C5225q.f10068c;
                    default:
                        super.mo27875b(str);
                        throw null;
                }
            } else if (list.isEmpty()) {
                return new C5180n();
            } else {
                if (list.size() % 2 == 0) {
                    C5180n nVar = new C5180n();
                    while (i < list.size() - 1) {
                        C5225q b12 = p4Var.mo27496b((C5225q) list.get(i));
                        C5225q b13 = p4Var.mo27496b((C5225q) list.get(i + 1));
                        if ((b12 instanceof C5086h) || (b13 instanceof C5086h)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        nVar.mo27214o(b12.mo27208f(), b13);
                        i += 2;
                    }
                    return nVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            }
        } else if (list.isEmpty()) {
            return new C5054f();
        } else {
            C5054f fVar = new C5054f();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C5225q b14 = p4Var.mo27496b((C5225q) it2.next());
                if (!(b14 instanceof C5086h)) {
                    fVar.mo27203E(i, b14);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return fVar;
        }
    }
}
