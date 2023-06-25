package p040c.p151o.p152a.p153a.p156j;

import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.p174u.C2200a;
import p040c.p151o.p152a.p153a.p174u.C2204e;

/* renamed from: c.o.a.a.j.e */
/* compiled from: GigyaApiResponse */
public class C2125e {

    /* renamed from: a */
    public String f2094a;

    /* renamed from: b */
    public Map<String, Object> f2095b;

    /* renamed from: c */
    public Gson f2096c = new Gson();

    public C2125e(String str) {
        this.f2094a = str;
        try {
            this.f2095b = C2204e.m3355e(new JSONObject(str));
            C2103f.m3056b("GigyaApiResponse", "json mapped!");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public String mo16921a() {
        return this.f2094a;
    }

    /* renamed from: b */
    public boolean mo16922b(String str) {
        String[] split = str.split("\\.");
        if (split.length == 1) {
            return this.f2095b.containsKey(str);
        }
        Map<String, Object> map = this.f2095b;
        for (int i = 0; i < split.length; i++) {
            Object obj = map.get(split[i]);
            if (obj == null) {
                return false;
            }
            if (obj instanceof Map) {
                map = (Map) obj;
            } else if (i < split.length - 1) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    /* renamed from: c */
    public String mo16923c() {
        if (this.f2095b.containsKey("callId")) {
            return (String) this.f2095b.get("callId");
        }
        return null;
    }

    /* renamed from: d */
    public int mo16924d() {
        try {
            return ((Integer) this.f2095b.get("errorCode")).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Nullable
    /* renamed from: e */
    public String mo16925e() {
        if (this.f2095b.containsKey("errorDetails")) {
            return (String) this.f2095b.get("errorDetails");
        }
        return null;
    }

    @Nullable
    /* renamed from: f */
    public <T> T mo16926f(String str, Class<T> cls) {
        String[] split = str.split("\\.");
        if (split.length != 1 || !this.f2095b.containsKey(str)) {
            if (mo16922b(str)) {
                Map<String, Object> map = this.f2095b;
                T t = null;
                for (int i = 0; i < split.length; i++) {
                    t = map.get(split[i]);
                    if (i < split.length - 1) {
                        map = (Map) t;
                    }
                }
                if (t != null && t.getClass() == cls) {
                    return t;
                }
            }
            return null;
        }
        return this.f2096c.fromJson(this.f2096c.toJson(this.f2095b.get(str)), cls);
    }

    @Nullable
    /* renamed from: g */
    public <A> A mo16927g(Class<A> cls) {
        try {
            return new GsonBuilder().registerTypeAdapter(cls, new C2200a()).create().fromJson(mo16921a(), cls);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
