package p040c.p126i.p127a.p129f;

import java.util.HashMap;
import java.util.Map;
import p040c.p126i.p127a.C2022d;

/* renamed from: c.i.a.f.h */
/* compiled from: SqlErrorInfo */
public class C2033h {
    /* renamed from: a */
    public static Map<String, Object> m2767a(C2031f fVar) {
        C2022d b = fVar.mo16630b();
        if (b == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", b.mo16619e());
        hashMap.put("arguments", b.mo16618d());
        return hashMap;
    }
}
