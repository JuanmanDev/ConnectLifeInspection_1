package p040c.p496x.p497a.p498a.p499a.p500a.p505g;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7669e;

/* renamed from: c.x.a.a.a.a.g.e */
public class C7694e {
    /* renamed from: a */
    public static boolean m21790a(String str) {
        return Pattern.compile("^((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]|[*])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]|[*])$").matcher(str).matches();
    }

    /* renamed from: b */
    public static C7669e m21791b(String str, String str2) {
        return m21792c(str, new JSONObject(str2), -1);
    }

    /* renamed from: c */
    public static C7669e m21792c(String str, JSONObject jSONObject, long j) {
        JSONArray optJSONArray;
        long optLong = jSONObject.optLong("ttl");
        if (optLong <= 0 || (optJSONArray = jSONObject.optJSONArray("ips")) == null || optJSONArray.length() <= 0) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            String string = optJSONArray.getString(i);
            if (m21790a(string)) {
                linkedHashSet.add(string);
            }
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(optJSONArray.length());
        JSONArray optJSONArray2 = jSONObject.optJSONArray("proxy");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                String string2 = optJSONArray2.getString(i2);
                if (m21790a(string2)) {
                    linkedHashSet2.add(string2);
                }
            }
        }
        if (j <= 0) {
            j = jSONObject.optLong("time", j);
            if (j <= 0) {
                j = SystemClock.elapsedRealtime();
            }
        }
        C7669e.C7671b bVar = new C7669e.C7671b();
        bVar.mo33158j(str);
        bVar.mo33159k(optLong);
        bVar.mo33157i(j);
        bVar.mo33154f(linkedHashSet);
        bVar.mo33155g(linkedHashSet2);
        return bVar.mo33156h();
    }

    /* renamed from: d */
    public static List<C7669e> m21793d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (!"0".equals(jSONObject.getString("retCode"))) {
            return Collections.emptyList();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        Iterator<String> keys = jSONObject2.keys();
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (keys.hasNext()) {
            String next = keys.next();
            C7669e c = m21792c(next, jSONObject2.getJSONObject(next), elapsedRealtime);
            if (c != null) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static String m21794e(C7669e eVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ttl", eVar.mo33151k());
        jSONObject.put("time", eVar.mo33150j());
        List<String> g = eVar.mo33147g();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < g.size(); i++) {
            jSONArray.put(i, g.get(i));
        }
        jSONObject.put("ips", jSONArray);
        return jSONObject.toString();
    }
}
