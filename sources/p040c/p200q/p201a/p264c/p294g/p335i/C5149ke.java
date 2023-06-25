package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.Collections;
import java.util.TreeMap;

/* renamed from: c.q.a.c.g.i.ke */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5149ke {

    /* renamed from: a */
    public final TreeMap f9982a = new TreeMap();

    /* renamed from: b */
    public final TreeMap f9983b = new TreeMap();

    /* renamed from: c */
    public static final int m14418c(C5215p4 p4Var, C5210p pVar, C5225q qVar) {
        C5225q a = pVar.mo27025a(p4Var, Collections.singletonList(qVar));
        if (a instanceof C5102i) {
            return C5216p5.m14632b(a.mo27206e().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo27379a(String str, int i, C5210p pVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f9983b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f9982a;
        } else {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), pVar);
    }

    /* renamed from: b */
    public final void mo27380b(C5215p4 p4Var, C5006c cVar) {
        C5112i9 i9Var = new C5112i9(cVar);
        for (Integer num : this.f9982a.keySet()) {
            C4990b b = cVar.mo27027b().clone();
            int c = m14418c(p4Var, (C5210p) this.f9982a.get(num), i9Var);
            if (c == 2 || c == -1) {
                cVar.mo27032f(b);
            }
        }
        for (Integer num2 : this.f9983b.keySet()) {
            m14418c(p4Var, (C5210p) this.f9983b.get(num2), i9Var);
        }
    }
}
