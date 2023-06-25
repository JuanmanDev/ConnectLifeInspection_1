package p040c.p200q.p201a.p264c.p340i.p342b;

import java.util.Map;
import p040c.p200q.p201a.p264c.p294g.p335i.C5099hc;

/* renamed from: c.q.a.c.i.b.k4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5540k4 implements C5099hc {

    /* renamed from: a */
    public final /* synthetic */ String f10605a;

    /* renamed from: b */
    public final /* synthetic */ C5552l4 f10606b;

    public C5540k4(C5552l4 l4Var, String str) {
        this.f10606b = l4Var;
        this.f10605a = str;
    }

    /* renamed from: c */
    public final String mo27308c(String str) {
        Map map = (Map) this.f10606b.f10638d.get(this.f10605a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
