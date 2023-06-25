package p040c.p048b.p049a.p050a.p051a.p060m;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.m.h */
/* compiled from: HttpResponse */
public class C1433h {

    /* renamed from: d */
    public static final String f583d = "h";

    /* renamed from: a */
    public final int f584a;

    /* renamed from: b */
    public final String f585b;

    /* renamed from: c */
    public final Map<String, String> f586c;

    public C1433h(int i, String str, Map<String, String> map) {
        this.f584a = i;
        this.f585b = str;
        this.f586c = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044 A[SYNTHETIC, Splitter:B:24:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0060 A[SYNTHETIC, Splitter:B:36:0x0060] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x002d=Splitter:B:14:0x002d, B:28:0x004e=Splitter:B:28:0x004e} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m647d(java.io.InputStream r8) {
        /*
            java.lang.String r0 = "Cannot close BufferedReader"
            java.lang.String r1 = "Cannot close response stream"
            r2 = 0
            if (r8 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0037, all -> 0x0033 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0037, all -> 0x0033 }
            java.lang.String r6 = "UTF-8"
            r5.<init>(r8, r6)     // Catch:{ IOException -> 0x0037, all -> 0x0033 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0037, all -> 0x0033 }
        L_0x0019:
            java.lang.String r2 = r4.readLine()     // Catch:{ IOException -> 0x0031 }
            if (r2 == 0) goto L_0x0023
            r3.append(r2)     // Catch:{ IOException -> 0x0031 }
            goto L_0x0019
        L_0x0023:
            r4.close()     // Catch:{ IOException -> 0x0027 }
            goto L_0x002d
        L_0x0027:
            r2 = move-exception
            java.lang.String r4 = f583d
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m830c(r4, r0, r2)
        L_0x002d:
            r8.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0058
        L_0x0031:
            r2 = move-exception
            goto L_0x003b
        L_0x0033:
            r3 = move-exception
            r4 = r2
            r2 = r3
            goto L_0x005e
        L_0x0037:
            r4 = move-exception
            r7 = r4
            r4 = r2
            r2 = r7
        L_0x003b:
            java.lang.String r5 = f583d     // Catch:{ all -> 0x005d }
            java.lang.String r6 = "Cannot parse response stream"
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m830c(r5, r6, r2)     // Catch:{ all -> 0x005d }
            if (r4 == 0) goto L_0x004e
            r4.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x004e
        L_0x0048:
            r2 = move-exception
            java.lang.String r4 = f583d
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m830c(r4, r0, r2)
        L_0x004e:
            r8.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0058
        L_0x0052:
            r8 = move-exception
            java.lang.String r0 = f583d
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m830c(r0, r1, r8)
        L_0x0058:
            java.lang.String r8 = r3.toString()
            return r8
        L_0x005d:
            r2 = move-exception
        L_0x005e:
            if (r4 == 0) goto L_0x006a
            r4.close()     // Catch:{ IOException -> 0x0064 }
            goto L_0x006a
        L_0x0064:
            r3 = move-exception
            java.lang.String r4 = f583d
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m830c(r4, r0, r3)
        L_0x006a:
            r8.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x0074
        L_0x006e:
            r8 = move-exception
            java.lang.String r0 = f583d
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m830c(r0, r1, r8)
        L_0x0074:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p048b.p049a.p050a.p051a.p060m.C1433h.m647d(java.io.InputStream):java.lang.String");
    }

    /* renamed from: e */
    public static C1433h m648e(HttpsURLConnection httpsURLConnection) {
        try {
            return new C1433h(C1432g.m642k(httpsURLConnection), m649f(httpsURLConnection), m650g(httpsURLConnection));
        } finally {
            httpsURLConnection.disconnect();
        }
    }

    /* renamed from: f */
    public static String m649f(HttpsURLConnection httpsURLConnection) {
        InputStream inputStream;
        try {
            inputStream = httpsURLConnection.getInputStream();
        } catch (IOException unused) {
            inputStream = httpsURLConnection.getErrorStream();
        }
        if (inputStream == null) {
            return null;
        }
        String d = m647d(inputStream);
        C1485a.m836i(f583d, "Response received", String.format("Request to %s received response %s", new Object[]{httpsURLConnection.getURL().toString(), d}));
        return d;
    }

    /* renamed from: g */
    public static Map<String, String> m650g(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            String join = TextUtils.join(", ", (Iterable) entry.getValue());
            hashMap.put(entry.getKey(), join);
            C1485a.m836i(f583d, "Header from response: name=" + ((String) entry.getKey()), "val=" + join);
        }
        return hashMap;
    }

    /* renamed from: a */
    public String mo15257a() {
        return this.f585b;
    }

    /* renamed from: b */
    public int mo15258b() {
        return this.f584a;
    }

    /* renamed from: c */
    public Map<String, String> mo15259c() {
        return this.f586c;
    }
}
