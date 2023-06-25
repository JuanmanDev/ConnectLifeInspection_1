package p040c.p200q.p201a.p264c.p294g.p335i;

import java.util.List;

/* renamed from: c.q.a.c.g.i.l0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5151l0 extends C5330x {
    /* renamed from: a */
    public final C5225q mo26909a(String str, C5215p4 p4Var, List list) {
        if (str == null || str.isEmpty() || !p4Var.mo27502h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        C5225q d = p4Var.mo27498d(str);
        if (d instanceof C5118j) {
            return ((C5118j) d).mo27025a(p4Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
