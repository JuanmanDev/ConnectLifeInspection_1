package p040c.p429r.p430a.p439c.p459d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: c.r.a.c.d.a */
/* compiled from: JsonUtil */
public class C7480a {
    /* renamed from: a */
    public static Map<String, String> m21439a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.get(next).toString());
        }
        return hashMap;
    }
}
