package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.p5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5216p5 {
    /* renamed from: a */
    public static double m14631a(double d) {
        int i;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || i == 0) {
            return d;
        }
        return ((double) (i > 0 ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    /* renamed from: b */
    public static int m14632b(double d) {
        int i;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((long) ((((double) (i > 0 ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d));
    }

    /* renamed from: c */
    public static int m14633c(C5215p4 p4Var) {
        int b = m14632b(p4Var.mo27498d("runtime.counter").mo27206e().doubleValue() + 1.0d);
        if (b <= 1000000) {
            p4Var.mo27501g("runtime.counter", new C5102i(Double.valueOf((double) b)));
            return b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m14634d(double d) {
        return ((long) m14632b(d)) & 4294967295L;
    }

    /* renamed from: e */
    public static zzbl m14635e(String str) {
        zzbl zzbl = null;
        if (str != null && !str.isEmpty()) {
            zzbl = zzbl.zza(Integer.parseInt(str));
        }
        if (zzbl != null) {
            return zzbl;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    /* renamed from: f */
    public static Object m14636f(C5225q qVar) {
        if (C5225q.f10069d.equals(qVar)) {
            return null;
        }
        if (C5225q.f10068c.equals(qVar)) {
            return "";
        }
        if (qVar instanceof C5180n) {
            return m14637g((C5180n) qVar);
        }
        if (qVar instanceof C5054f) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((C5054f) qVar).iterator();
            while (it.hasNext()) {
                Object f = m14636f((C5225q) it.next());
                if (f != null) {
                    arrayList.add(f);
                }
            }
            return arrayList;
        } else if (!qVar.mo27206e().isNaN()) {
            return qVar.mo27206e();
        } else {
            return qVar.mo27208f();
        }
    }

    /* renamed from: g */
    public static Map m14637g(C5180n nVar) {
        HashMap hashMap = new HashMap();
        for (String str : nVar.mo27439a()) {
            Object f = m14636f(nVar.mo27215p(str));
            if (f != null) {
                hashMap.put(str, f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m14638h(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: i */
    public static void m14639i(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: j */
    public static void m14640j(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: k */
    public static boolean m14641k(C5225q qVar) {
        if (qVar == null) {
            return false;
        }
        Double e = qVar.mo27206e();
        if (e.isNaN() || e.doubleValue() < 0.0d || !e.equals(Double.valueOf(Math.floor(e.doubleValue())))) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m14642l(C5225q qVar, C5225q qVar2) {
        if (!qVar.getClass().equals(qVar2.getClass())) {
            return false;
        }
        if ((qVar instanceof C5300v) || (qVar instanceof C5195o)) {
            return true;
        }
        if (qVar instanceof C5102i) {
            if (Double.isNaN(qVar.mo27206e().doubleValue()) || Double.isNaN(qVar2.mo27206e().doubleValue())) {
                return false;
            }
            return qVar.mo27206e().equals(qVar2.mo27206e());
        } else if (qVar instanceof C5285u) {
            return qVar.mo27208f().equals(qVar2.mo27208f());
        } else {
            if (qVar instanceof C5070g) {
                return qVar.mo27212k().equals(qVar2.mo27212k());
            }
            if (qVar == qVar2) {
                return true;
            }
            return false;
        }
    }
}
