package p040c.p048b.p049a.p050a.p051a.p067t;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.t.a */
/* compiled from: JSONUtils */
public class C1471a {

    /* renamed from: a */
    public static final String f647a = "c.b.a.a.a.t.a";

    /* renamed from: a */
    public static String[] m793a(JSONObject jSONObject, String str) {
        List<String> b = m794b(jSONObject, str);
        if (b == null) {
            return null;
        }
        return (String[]) b.toArray(new String[b.size()]);
    }

    /* renamed from: b */
    public static List<String> m794b(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        int i = 0;
        while (i < optJSONArray.length()) {
            try {
                arrayList.add(optJSONArray.getString(i));
                i++;
            } catch (JSONException unused) {
                String str2 = f647a;
                C1485a.m832e(str2, str + " has no mapping in json, returning null array");
                return null;
            }
        }
        return arrayList;
    }
}
