package p553f.p554a.p570e.p571a;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p630io.flutter.plugin.common.FlutterException;

/* renamed from: f.a.e.a.f */
/* compiled from: JSONMethodCodec */
public final class C9013f implements C9023k {

    /* renamed from: a */
    public static final C9013f f17686a = new C9013f();

    /* renamed from: a */
    public C9016i mo46564a(ByteBuffer byteBuffer) {
        try {
            Object b = C9012e.f17685a.mo46563b(byteBuffer);
            if (b instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) b;
                Object obj = jSONObject.get("method");
                Object g = mo46570g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new C9016i((String) obj, g);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + b);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    /* renamed from: b */
    public ByteBuffer mo46565b(C9016i iVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", iVar.f17687a);
            jSONObject.put("args", C9014g.m24401a(iVar.f17688b));
            return C9012e.f17685a.mo46562a(jSONObject);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    /* renamed from: c */
    public ByteBuffer mo46566c(Object obj) {
        return C9012e.f17685a.mo46562a(new JSONArray().put(C9014g.m24401a(obj)));
    }

    /* renamed from: d */
    public ByteBuffer mo46567d(String str, String str2, Object obj, String str3) {
        return C9012e.f17685a.mo46562a(new JSONArray().put(str).put(C9014g.m24401a(str2)).put(C9014g.m24401a(obj)).put(C9014g.m24401a(str3)));
    }

    /* renamed from: e */
    public ByteBuffer mo46568e(String str, String str2, Object obj) {
        return C9012e.f17685a.mo46562a(new JSONArray().put(str).put(C9014g.m24401a(str2)).put(C9014g.m24401a(obj)));
    }

    /* renamed from: f */
    public Object mo46569f(ByteBuffer byteBuffer) {
        try {
            Object b = C9012e.f17685a.mo46563b(byteBuffer);
            if (b instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) b;
                if (jSONArray.length() == 1) {
                    return mo46570g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object g = mo46570g(jSONArray.opt(1));
                    Object g2 = mo46570g(jSONArray.opt(2));
                    if ((obj instanceof String) && (g == null || (g instanceof String))) {
                        throw new FlutterException((String) obj, (String) g, g2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + b);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    /* renamed from: g */
    public Object mo46570g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
