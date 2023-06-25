package p040c.p072c.p073a.p074a;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c.c.a.a.j */
/* compiled from: JsonUtils */
public final class C1503j {
    /* renamed from: a */
    public static String m932a(String str) {
        return m933b(str, 4);
    }

    /* renamed from: b */
    public static String m933b(String str, int i) {
        try {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt == '{') {
                    return new JSONObject(str).toString(i);
                }
                if (charAt == '[') {
                    return new JSONArray(str).toString(i);
                }
                if (!Character.isWhitespace(charAt)) {
                    return str;
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return str;
    }
}
