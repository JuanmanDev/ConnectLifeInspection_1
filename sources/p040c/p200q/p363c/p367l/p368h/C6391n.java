package p040c.p200q.p363c.p367l.p368h;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.p527firebaseauthapi.zzqx;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p284k.C3537a;
import p040c.p200q.p201a.p264c.p276d.p289n.C3552c;
import p040c.p200q.p201a.p264c.p294g.p333g.C4303b3;

/* renamed from: c.q.c.l.h.n */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6391n {

    /* renamed from: a */
    public static final C3537a f12065a = new C3537a("JSONParser", new String[0]);

    /* renamed from: a */
    public static List m17918a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m17918a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m17921d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: b */
    public static Map m17919b(String str) {
        C3495o.m8904f(str);
        List d = C4303b3.m11701b('.').mo25808d(str);
        if (d.size() < 2) {
            f12065a.mo20807c("Invalid idToken ".concat(String.valueOf(str)), new Object[0]);
            return new HashMap();
        }
        try {
            Map c = m17920c(new String(C3552c.m9055b((String) d.get(1)), "UTF-8"));
            return c == null ? new HashMap() : c;
        } catch (UnsupportedEncodingException e) {
            f12065a.mo20806b("Unable to decode token", e, new Object[0]);
            return new HashMap();
        }
    }

    @Nullable
    /* renamed from: c */
    public static Map m17920c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m17921d(jSONObject);
            }
            return null;
        } catch (Exception e) {
            throw new zzqx(e);
        }
    }

    /* renamed from: d */
    public static Map m17921d(JSONObject jSONObject) {
        ArrayMap arrayMap = new ArrayMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m17918a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m17921d((JSONObject) obj);
            }
            arrayMap.put(next, obj);
        }
        return arrayMap;
    }
}
