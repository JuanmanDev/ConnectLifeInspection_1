package p040c.p200q.p363c.p370n.p371h.p378m;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: c.q.c.n.h.m.a */
/* compiled from: HttpGetRequest */
public class C6669a {

    /* renamed from: a */
    public final String f12745a;

    /* renamed from: b */
    public final Map<String, String> f12746b;

    /* renamed from: c */
    public final Map<String, String> f12747c = new HashMap();

    public C6669a(String str, Map<String, String> map) {
        this.f12745a = str;
        this.f12746b = map;
    }

    /* renamed from: a */
    public final String mo31251a(Map<String, String> map) {
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry next = it.next();
        sb.append((String) next.getKey());
        sb.append(MAPCookie.COOKIE_NAME_VALUE_SEPERATOR);
        sb.append(next.getValue() != null ? URLEncoder.encode((String) next.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry next2 = it.next();
            sb.append("&");
            sb.append((String) next2.getKey());
            sb.append(MAPCookie.COOKIE_NAME_VALUE_SEPERATOR);
            if (next2.getValue() != null) {
                str = URLEncoder.encode((String) next2.getValue(), "UTF-8");
            } else {
                str = "";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo31252b(String str, Map<String, String> map) {
        String a = mo31251a(map);
        if (a.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                a = "&" + a;
            }
            return str + a;
        }
        return str + "?" + a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p040c.p200q.p363c.p370n.p371h.p378m.C6671c mo31253c() {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r5.f12745a     // Catch:{ all -> 0x0086 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.f12746b     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = r5.mo31252b(r1, r2)     // Catch:{ all -> 0x0086 }
            c.q.c.n.h.f r2 = p040c.p200q.p363c.p370n.p371h.C6479f.m18125f()     // Catch:{ all -> 0x0086 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r3.<init>()     // Catch:{ all -> 0x0086 }
            java.lang.String r4 = "GET Request URL: "
            r3.append(r4)     // Catch:{ all -> 0x0086 }
            r3.append(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0086 }
            r2.mo30647i(r3)     // Catch:{ all -> 0x0086 }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0086 }
            r2.<init>(r1)     // Catch:{ all -> 0x0086 }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ all -> 0x0086 }
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ all -> 0x0086 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setReadTimeout(r2)     // Catch:{ all -> 0x0084 }
            r1.setConnectTimeout(r2)     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch:{ all -> 0x0084 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.f12747c     // Catch:{ all -> 0x0084 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0084 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0084 }
        L_0x0043:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0084 }
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0084 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0084 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x0084 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0084 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0084 }
            r1.addRequestProperty(r4, r3)     // Catch:{ all -> 0x0084 }
            goto L_0x0043
        L_0x005f:
            r1.connect()     // Catch:{ all -> 0x0084 }
            int r2 = r1.getResponseCode()     // Catch:{ all -> 0x0084 }
            java.io.InputStream r3 = r1.getInputStream()     // Catch:{ all -> 0x0084 }
            if (r3 == 0) goto L_0x0074
            java.lang.String r0 = r5.mo31255e(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0074
        L_0x0071:
            r2 = move-exception
            r0 = r3
            goto L_0x0088
        L_0x0074:
            if (r3 == 0) goto L_0x0079
            r3.close()
        L_0x0079:
            if (r1 == 0) goto L_0x007e
            r1.disconnect()
        L_0x007e:
            c.q.c.n.h.m.c r1 = new c.q.c.n.h.m.c
            r1.<init>(r2, r0)
            return r1
        L_0x0084:
            r2 = move-exception
            goto L_0x0088
        L_0x0086:
            r2 = move-exception
            r1 = r0
        L_0x0088:
            if (r0 == 0) goto L_0x008d
            r0.close()
        L_0x008d:
            if (r1 == 0) goto L_0x0092
            r1.disconnect()
        L_0x0092:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p370n.p371h.p378m.C6669a.mo31253c():c.q.c.n.h.m.c");
    }

    /* renamed from: d */
    public C6669a mo31254d(String str, String str2) {
        this.f12747c.put(str, str2);
        return this;
    }

    /* renamed from: e */
    public final String mo31255e(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }
}
