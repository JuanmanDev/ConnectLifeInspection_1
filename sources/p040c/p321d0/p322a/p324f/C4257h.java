package p040c.p321d0.p322a.p324f;

import java.util.HashMap;
import java.util.Map;
import p040c.p321d0.p322a.C4246d;

/* renamed from: c.d0.a.f.h */
/* compiled from: SqlErrorInfo */
public class C4257h {
    /* renamed from: a */
    public static Map<String, Object> m11600a(C4255f fVar) {
        C4246d b = fVar.mo25712b();
        if (b == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", b.mo25701e());
        hashMap.put("arguments", b.mo25700d());
        return hashMap;
    }
}
