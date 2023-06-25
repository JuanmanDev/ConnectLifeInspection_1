package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.q6 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5232q6 {
    /* renamed from: a */
    public static C5225q m14672a(C5186n5 n5Var) {
        if (n5Var == null) {
            return C5225q.f10068c;
        }
        int M = n5Var.mo27457M() - 1;
        if (M != 1) {
            if (M != 2) {
                if (M != 3) {
                    if (M == 4) {
                        List<C5186n5> H = n5Var.mo27452H();
                        ArrayList arrayList = new ArrayList();
                        for (C5186n5 a : H) {
                            arrayList.add(m14672a(a));
                        }
                        return new C5240r(n5Var.mo27450F(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                } else if (n5Var.mo27454J()) {
                    return new C5070g(Boolean.valueOf(n5Var.mo27453I()));
                } else {
                    return new C5070g((Boolean) null);
                }
            } else if (n5Var.mo27455K()) {
                return new C5102i(Double.valueOf(n5Var.mo27449D()));
            } else {
                return new C5102i((Double) null);
            }
        } else if (n5Var.mo27456L()) {
            return new C5285u(n5Var.mo27451G());
        } else {
            return C5225q.f10075k;
        }
    }

    /* renamed from: b */
    public static C5225q m14673b(Object obj) {
        if (obj == null) {
            return C5225q.f10069d;
        }
        if (obj instanceof String) {
            return new C5285u((String) obj);
        }
        if (obj instanceof Double) {
            return new C5102i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C5102i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C5102i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C5070g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C5180n nVar = new C5180n();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                C5225q b = m14673b(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    nVar.mo27214o((String) next, b);
                }
            }
            return nVar;
        } else if (obj instanceof List) {
            C5054f fVar = new C5054f();
            for (Object b2 : (List) obj) {
                fVar.mo27203E(fVar.mo27219u(), m14673b(b2));
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
