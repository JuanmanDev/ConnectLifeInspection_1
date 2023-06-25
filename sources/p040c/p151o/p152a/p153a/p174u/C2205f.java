package p040c.p151o.p152a.p153a.p174u;

import android.util.Base64;
import java.net.URL;
import java.util.Locale;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.p170r.C2181c;

/* renamed from: c.o.a.a.u.f */
/* compiled from: SigUtils */
public class C2205f {
    /* renamed from: a */
    public static String m3356a(String str, String str2) {
        byte[] decode = Base64.decode(str2, 0);
        byte[] bytes = str.getBytes("UTF-8");
        SecretKeySpec secretKeySpec = new SecretKeySpec(decode, "HmacSHA1");
        Mac instance = Mac.getInstance("HmacSHA1");
        instance.init(secretKeySpec);
        return Base64.encodeToString(instance.doFinal(bytes), 10);
    }

    /* renamed from: b */
    public static String m3357b(String str, String str2, String str3, TreeMap<String, Object> treeMap) {
        if (!(treeMap == null || str3 == null || str2 == null || str == null)) {
            try {
                StringBuilder sb = new StringBuilder();
                URL url = new URL(str3);
                sb.append(url.getProtocol().toLowerCase(Locale.ENGLISH));
                sb.append("://");
                sb.append(url.getHost().toLowerCase(Locale.ENGLISH));
                if (!((!url.getProtocol().toUpperCase(Locale.ENGLISH).equals("HTTP") || url.getPort() == 80 || url.getPort() == -1) && (!url.getProtocol().toUpperCase(Locale.ENGLISH).equals("HTTPS") || url.getPort() == 443 || url.getPort() == -1))) {
                    sb.append(':');
                    sb.append(url.getPort());
                }
                sb.append(url.getPath());
                return m3356a(str2.toUpperCase(Locale.ENGLISH) + "&" + C2207h.m3364f(sb.toString()) + "&" + C2207h.m3364f(C2207h.m3359a(treeMap)), str);
            } catch (Exception e) {
                e.printStackTrace();
                C2181c.m3296b().mo17013a("5.1.5", "core", "Exception while generating signature");
                C2103f.m3057c("SigUtils", "getSignature: Exception while generating signature");
            }
        }
        return null;
    }
}
