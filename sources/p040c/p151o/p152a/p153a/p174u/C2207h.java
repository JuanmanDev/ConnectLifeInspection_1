package p040c.p151o.p152a.p153a.p174u;

import androidx.annotation.NonNull;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;

/* renamed from: c.o.a.a.u.h */
/* compiled from: UrlUtils */
public class C2207h {
    /* renamed from: a */
    public static String m3359a(@NonNull Map<String, Object> map) {
        if (map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            String str = (String) next.getKey();
            if (value != null) {
                sb.append(str);
                sb.append('=');
                sb.append(m3364f(String.valueOf(next.getValue())));
                sb.append(Typography.amp);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m3360b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        String[] split = str.split("\\.");
        sb.append("https://");
        sb.append(split[0]);
        sb.append(MAPCookie.DOT);
        sb.append(str2);
        sb.append("/");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    public static boolean m3361c(String str) {
        return C2204e.m3353c(str, "gsapi");
    }

    /* renamed from: d */
    public static Map<String, Object> m3362d(String str) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            String[] split = str.split("\\?");
            String[] split2 = str.split("#");
            if (split.length > 1) {
                m3363e(hashMap, split[1]);
            } else if (split2.length > 1) {
                m3363e(hashMap, split2[1]);
            }
        }
        return hashMap;
    }

    /* renamed from: e */
    public static void m3363e(Map<String, Object> map, String str) {
        if (str != null) {
            for (String split : str.split("&")) {
                String[] split2 = split.split(MAPCookie.COOKIE_NAME_VALUE_SEPERATOR);
                try {
                    if (split2.length > 1) {
                        map.put(split2[0], URLDecoder.decode(split2[1], "UTF8"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: f */
    public static String m3364f(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
        } catch (Exception unused) {
            return null;
        }
    }
}
