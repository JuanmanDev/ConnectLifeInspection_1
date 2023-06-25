package p040c.p151o.p152a.p153a.p174u;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: c.o.a.a.u.e */
/* compiled from: ObjectUtils */
public class C2204e {
    /* renamed from: a */
    public static <T> T m3351a(@Nullable T t, @NonNull T t2) {
        return t != null ? t : t2;
    }

    /* renamed from: b */
    public static List<String> m3352b(List<String> list, List<String> list2) {
        HashSet hashSet = new HashSet(list);
        hashSet.addAll(list2);
        return new ArrayList(hashSet);
    }

    /* renamed from: c */
    public static <T, V> boolean m3353c(T t, V v) {
        if (t == null || v == null) {
            return false;
        }
        return t.equals(v);
    }

    /* renamed from: d */
    public static List<Object> m3354d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m3354d((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m3355e((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: e */
    public static Map<String, Object> m3355e(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m3354d((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m3355e((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }
}
