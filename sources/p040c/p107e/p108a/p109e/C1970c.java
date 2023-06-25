package p040c.p107e.p108a.p109e;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.platform.Platform;
import p040c.p107e.p108a.p109e.p110d.C1975d;
import p040c.p107e.p108a.p109e.p110d.C1976e;
import p040c.p107e.p108a.p109e.p110d.C1978g;
import p040c.p107e.p108a.p109e.p110d.C1982j;
import p040c.p107e.p108a.p109e.p110d.C1983k;

/* renamed from: c.e.a.e.c */
/* compiled from: DigestAuthenticator */
public class C1970c implements C1968a {

    /* renamed from: j */
    public static final char[] f1652j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public AtomicReference<Map<String, String>> f1653a = new AtomicReference<>();

    /* renamed from: b */
    public Charset f1654b = StandardCharsets.US_ASCII;

    /* renamed from: c */
    public final C1969b f1655c;

    /* renamed from: d */
    public String f1656d;

    /* renamed from: e */
    public long f1657e;

    /* renamed from: f */
    public String f1658f;

    /* renamed from: g */
    public String f1659g;

    /* renamed from: h */
    public String f1660h;

    /* renamed from: i */
    public boolean f1661i;

    /* renamed from: c.e.a.e.c$a */
    /* compiled from: DigestAuthenticator */
    public static class C1971a extends IllegalStateException {
        public static final long serialVersionUID = 1;

        public C1971a(String str) {
            super(str);
        }

        public C1971a(String str, Exception exc) {
            super(str, exc);
        }
    }

    public C1970c(C1969b bVar) {
        this.f1655c = bVar;
    }

    /* renamed from: d */
    public static String m2611d() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        return m2613g(bArr);
    }

    /* renamed from: f */
    public static MessageDigest m2612f(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception e) {
            throw new IllegalArgumentException("Unsupported algorithm in HTTP Digest authentication: " + str, e);
        }
    }

    /* renamed from: g */
    public static String m2613g(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length * 2)];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            char[] cArr2 = f1652j;
            cArr[i2] = cArr2[(bArr[i] & 240) >> 4];
            cArr[i2 + 1] = cArr2[bArr[i] & 15];
        }
        return new String(cArr);
    }

    /* renamed from: i */
    public static byte[] m2614i(String str) {
        if (str != null) {
            return str.getBytes(StandardCharsets.US_ASCII);
        }
        throw new IllegalArgumentException("Parameter may not be null");
    }

    /* renamed from: a */
    public Request mo16459a(Route route, Request request) {
        Map map = this.f1653a.get();
        return mo16462b(route, request, map == null ? new ConcurrentHashMap() : new ConcurrentHashMap(map));
    }

    public synchronized Request authenticate(Route route, Response response) {
        String h = mo16465h(response.headers(), mo16469m(response.code()));
        if (h == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        mo16472p(h, 7, h.length() - 7, concurrentHashMap);
        mo16463c(response.headers(), concurrentHashMap);
        this.f1653a.set(Collections.unmodifiableMap(concurrentHashMap));
        if (concurrentHashMap.get("nonce") != null) {
            return mo16462b(route, response.request(), concurrentHashMap);
        }
        throw new IllegalArgumentException("missing nonce in challenge header: " + h);
    }

    /* renamed from: b */
    public final Request mo16462b(Route route, Request request, Map<String, String> map) {
        if (map.get("realm") == null) {
            return null;
        }
        String str = map.get("nonce");
        if (str == null) {
            throw new IllegalArgumentException("missing nonce in challenge");
        } else if (mo16470n(request, str, "true".equalsIgnoreCase(map.get("stale")))) {
            Platform.get().log("Previous digest authentication with same nonce failed, returning null", 5, (Throwable) null);
            return null;
        } else {
            if (route == null || !route.requiresTunnel()) {
                String method = request.method();
                String requestPath = RequestLine.INSTANCE.requestPath(request.url());
                map.put("methodname", method);
                map.put("uri", requestPath);
            } else {
                map.put("methodname", "CONNECT");
                map.put("uri", request.url().host() + ':' + request.url().port());
            }
            if (map.get("charset") == null) {
                map.put("charset", mo16467k(request));
            }
            C1982j e = mo16464e(this.f1655c, request, map);
            return request.newBuilder().header(e.getName(), e.getValue()).build();
        }
    }

    /* renamed from: c */
    public final void mo16463c(Headers headers, Map<String, String> map) {
        for (int i = 0; i < headers.size(); i++) {
            map.put(headers.name(i), headers.value(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0340 A[Catch:{ UnsupportedDigestAlgorithmException -> 0x0354, IOException -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0342 A[Catch:{ UnsupportedDigestAlgorithmException -> 0x0354, IOException -> 0x01ee }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p040c.p107e.p108a.p109e.p110d.C1982j mo16464e(p040c.p107e.p108a.p109e.C1969b r19, okhttp3.Request r20, java.util.Map<java.lang.String, java.lang.String> r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r21
            monitor-enter(r18)
            java.lang.String r2 = "uri"
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0384 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0384 }
            java.lang.String r3 = "realm"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0384 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0384 }
            java.lang.String r4 = "nonce"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x0384 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0384 }
            java.lang.String r5 = "opaque"
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0384 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0384 }
            java.lang.String r6 = "methodname"
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x0384 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0384 }
            java.lang.String r7 = "algorithm"
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0384 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0384 }
            if (r7 != 0) goto L_0x0039
            java.lang.String r7 = "MD5"
        L_0x0039:
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x0384 }
            r9 = 8
            r8.<init>(r9)     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = "qop"
            java.lang.Object r9 = r0.get(r9)     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0384 }
            r10 = -1
            if (r9 == 0) goto L_0x0086
            java.util.StringTokenizer r14 = new java.util.StringTokenizer     // Catch:{ all -> 0x0384 }
            java.lang.String r15 = ","
            r14.<init>(r9, r15)     // Catch:{ all -> 0x0384 }
        L_0x0052:
            boolean r15 = r14.hasMoreTokens()     // Catch:{ all -> 0x0384 }
            if (r15 == 0) goto L_0x006a
            java.lang.String r15 = r14.nextToken()     // Catch:{ all -> 0x0384 }
            java.lang.String r15 = r15.trim()     // Catch:{ all -> 0x0384 }
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ all -> 0x0384 }
            java.lang.String r11 = r15.toLowerCase(r11)     // Catch:{ all -> 0x0384 }
            r8.add(r11)     // Catch:{ all -> 0x0384 }
            goto L_0x0052
        L_0x006a:
            okhttp3.RequestBody r11 = r20.body()     // Catch:{ all -> 0x0384 }
            if (r11 == 0) goto L_0x007a
            java.lang.String r11 = "auth-int"
            boolean r11 = r8.contains(r11)     // Catch:{ all -> 0x0384 }
            if (r11 == 0) goto L_0x007a
            r11 = 1
            goto L_0x0087
        L_0x007a:
            java.lang.String r11 = "auth"
            boolean r11 = r8.contains(r11)     // Catch:{ all -> 0x0384 }
            if (r11 == 0) goto L_0x0084
            r11 = 2
            goto L_0x0087
        L_0x0084:
            r11 = r10
            goto L_0x0087
        L_0x0086:
            r11 = 0
        L_0x0087:
            if (r11 == r10) goto L_0x036d
            java.lang.String r9 = "charset"
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0384 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0384 }
            if (r0 != 0) goto L_0x0095
            java.lang.String r0 = "ISO-8859-1"
        L_0x0095:
            java.lang.String r9 = "MD5-sess"
            boolean r9 = r9.equalsIgnoreCase(r7)     // Catch:{ all -> 0x0384 }
            if (r9 == 0) goto L_0x00a0
            java.lang.String r9 = "MD5"
            goto L_0x00a1
        L_0x00a0:
            r9 = r7
        L_0x00a1:
            java.security.MessageDigest r9 = m2612f(r9)     // Catch:{ UnsupportedDigestAlgorithmException -> 0x0354 }
            java.lang.String r10 = r19.mo16461b()     // Catch:{ all -> 0x0384 }
            java.lang.String r14 = r19.mo16460a()     // Catch:{ all -> 0x0384 }
            java.lang.String r15 = r1.f1656d     // Catch:{ all -> 0x0384 }
            boolean r15 = r4.equals(r15)     // Catch:{ all -> 0x0384 }
            r19 = r14
            r13 = 1
            r12 = 0
            if (r15 == 0) goto L_0x00c3
            r15 = r5
            r16 = r6
            long r5 = r1.f1657e     // Catch:{ all -> 0x0384 }
            long r5 = r5 + r13
            r1.f1657e = r5     // Catch:{ all -> 0x0384 }
            goto L_0x00cc
        L_0x00c3:
            r15 = r5
            r16 = r6
            r1.f1657e = r13     // Catch:{ all -> 0x0384 }
            r1.f1658f = r12     // Catch:{ all -> 0x0384 }
            r1.f1656d = r4     // Catch:{ all -> 0x0384 }
        L_0x00cc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0384 }
            r6 = 256(0x100, float:3.59E-43)
            r5.<init>(r6)     // Catch:{ all -> 0x0384 }
            java.util.Formatter r6 = new java.util.Formatter     // Catch:{ all -> 0x0384 }
            java.util.Locale r13 = java.util.Locale.US     // Catch:{ all -> 0x0384 }
            r6.<init>(r5, r13)     // Catch:{ all -> 0x0384 }
            java.lang.String r13 = "%08x"
            r14 = 1
            java.lang.Object[] r12 = new java.lang.Object[r14]     // Catch:{ all -> 0x0384 }
            r17 = r15
            long r14 = r1.f1657e     // Catch:{ all -> 0x0384 }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0384 }
            r15 = 0
            r12[r15] = r14     // Catch:{ all -> 0x0384 }
            r6.format(r13, r12)     // Catch:{ all -> 0x0384 }
            r6.close()     // Catch:{ all -> 0x0384 }
            java.lang.String r6 = r5.toString()     // Catch:{ all -> 0x0384 }
            java.lang.String r12 = r1.f1658f     // Catch:{ all -> 0x0384 }
            if (r12 != 0) goto L_0x00fe
            java.lang.String r12 = m2611d()     // Catch:{ all -> 0x0384 }
            r1.f1658f = r12     // Catch:{ all -> 0x0384 }
        L_0x00fe:
            r12 = 0
            r1.f1659g = r12     // Catch:{ all -> 0x0384 }
            r1.f1660h = r12     // Catch:{ all -> 0x0384 }
            java.lang.String r12 = "MD5-sess"
            boolean r12 = r12.equalsIgnoreCase(r7)     // Catch:{ all -> 0x0384 }
            r13 = 58
            if (r12 == 0) goto L_0x014e
            r12 = 0
            r5.setLength(r12)     // Catch:{ all -> 0x0384 }
            r5.append(r10)     // Catch:{ all -> 0x0384 }
            r5.append(r13)     // Catch:{ all -> 0x0384 }
            r5.append(r3)     // Catch:{ all -> 0x0384 }
            r5.append(r13)     // Catch:{ all -> 0x0384 }
            r12 = r19
            r5.append(r12)     // Catch:{ all -> 0x0384 }
            java.lang.String r12 = r5.toString()     // Catch:{ all -> 0x0384 }
            byte[] r12 = r1.mo16466j(r12, r0)     // Catch:{ all -> 0x0384 }
            byte[] r12 = r9.digest(r12)     // Catch:{ all -> 0x0384 }
            java.lang.String r12 = m2613g(r12)     // Catch:{ all -> 0x0384 }
            r14 = 0
            r5.setLength(r14)     // Catch:{ all -> 0x0384 }
            r5.append(r12)     // Catch:{ all -> 0x0384 }
            r5.append(r13)     // Catch:{ all -> 0x0384 }
            r5.append(r4)     // Catch:{ all -> 0x0384 }
            r5.append(r13)     // Catch:{ all -> 0x0384 }
            java.lang.String r12 = r1.f1658f     // Catch:{ all -> 0x0384 }
            r5.append(r12)     // Catch:{ all -> 0x0384 }
            java.lang.String r12 = r5.toString()     // Catch:{ all -> 0x0384 }
            r1.f1659g = r12     // Catch:{ all -> 0x0384 }
            goto L_0x0169
        L_0x014e:
            r12 = r19
            r14 = 0
            r5.setLength(r14)     // Catch:{ all -> 0x0384 }
            r5.append(r10)     // Catch:{ all -> 0x0384 }
            r5.append(r13)     // Catch:{ all -> 0x0384 }
            r5.append(r3)     // Catch:{ all -> 0x0384 }
            r5.append(r13)     // Catch:{ all -> 0x0384 }
            r5.append(r12)     // Catch:{ all -> 0x0384 }
            java.lang.String r12 = r5.toString()     // Catch:{ all -> 0x0384 }
            r1.f1659g = r12     // Catch:{ all -> 0x0384 }
        L_0x0169:
            java.lang.String r12 = r1.f1659g     // Catch:{ all -> 0x0384 }
            byte[] r12 = r1.mo16466j(r12, r0)     // Catch:{ all -> 0x0384 }
            byte[] r12 = r9.digest(r12)     // Catch:{ all -> 0x0384 }
            java.lang.String r12 = m2613g(r12)     // Catch:{ all -> 0x0384 }
            r14 = 2
            if (r11 != r14) goto L_0x0192
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0384 }
            r8.<init>()     // Catch:{ all -> 0x0384 }
            r15 = r16
            r8.append(r15)     // Catch:{ all -> 0x0384 }
            r8.append(r13)     // Catch:{ all -> 0x0384 }
            r8.append(r2)     // Catch:{ all -> 0x0384 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0384 }
            r1.f1660h = r8     // Catch:{ all -> 0x0384 }
            goto L_0x020c
        L_0x0192:
            r15 = r16
            r14 = 1
            if (r11 != r14) goto L_0x01f8
            okhttp3.RequestBody r14 = r20.body()     // Catch:{ all -> 0x0384 }
            if (r14 == 0) goto L_0x01c3
            java.lang.String r11 = "auth"
            boolean r8 = r8.contains(r11)     // Catch:{ all -> 0x0384 }
            if (r8 == 0) goto L_0x01bb
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0384 }
            r8.<init>()     // Catch:{ all -> 0x0384 }
            r8.append(r15)     // Catch:{ all -> 0x0384 }
            r8.append(r13)     // Catch:{ all -> 0x0384 }
            r8.append(r2)     // Catch:{ all -> 0x0384 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0384 }
            r1.f1660h = r8     // Catch:{ all -> 0x0384 }
            r11 = 2
            goto L_0x020c
        L_0x01bb:
            c.e.a.e.c$a r0 = new c.e.a.e.c$a     // Catch:{ all -> 0x0384 }
            java.lang.String r2 = "Qop auth-int cannot be used with a non-repeatable entity"
            r0.<init>(r2)     // Catch:{ all -> 0x0384 }
            throw r0     // Catch:{ all -> 0x0384 }
        L_0x01c3:
            c.e.a.e.d.h r8 = new c.e.a.e.d.h     // Catch:{ all -> 0x0384 }
            r8.<init>(r9)     // Catch:{ all -> 0x0384 }
            r8.close()     // Catch:{ IOException -> 0x01ee }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0384 }
            r14.<init>()     // Catch:{ all -> 0x0384 }
            r14.append(r15)     // Catch:{ all -> 0x0384 }
            r14.append(r13)     // Catch:{ all -> 0x0384 }
            r14.append(r2)     // Catch:{ all -> 0x0384 }
            r14.append(r13)     // Catch:{ all -> 0x0384 }
            byte[] r8 = r8.mo16497b()     // Catch:{ all -> 0x0384 }
            java.lang.String r8 = m2613g(r8)     // Catch:{ all -> 0x0384 }
            r14.append(r8)     // Catch:{ all -> 0x0384 }
            java.lang.String r8 = r14.toString()     // Catch:{ all -> 0x0384 }
            r1.f1660h = r8     // Catch:{ all -> 0x0384 }
            goto L_0x020c
        L_0x01ee:
            r0 = move-exception
            r2 = r0
            c.e.a.e.c$a r0 = new c.e.a.e.c$a     // Catch:{ all -> 0x0384 }
            java.lang.String r3 = "I/O error reading entity content"
            r0.<init>(r3, r2)     // Catch:{ all -> 0x0384 }
            throw r0     // Catch:{ all -> 0x0384 }
        L_0x01f8:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0384 }
            r8.<init>()     // Catch:{ all -> 0x0384 }
            r8.append(r15)     // Catch:{ all -> 0x0384 }
            r8.append(r13)     // Catch:{ all -> 0x0384 }
            r8.append(r2)     // Catch:{ all -> 0x0384 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0384 }
            r1.f1660h = r8     // Catch:{ all -> 0x0384 }
        L_0x020c:
            java.lang.String r8 = r1.f1660h     // Catch:{ all -> 0x0384 }
            byte[] r0 = r1.mo16466j(r8, r0)     // Catch:{ all -> 0x0384 }
            byte[] r0 = r9.digest(r0)     // Catch:{ all -> 0x0384 }
            java.lang.String r0 = m2613g(r0)     // Catch:{ all -> 0x0384 }
            if (r11 != 0) goto L_0x0235
            r8 = 0
            r5.setLength(r8)     // Catch:{ all -> 0x0384 }
            r5.append(r12)     // Catch:{ all -> 0x0384 }
            r5.append(r13)     // Catch:{ all -> 0x0384 }
            r5.append(r4)     // Catch:{ all -> 0x0384 }
            r5.append(r13)     // Catch:{ all -> 0x0384 }
            r5.append(r0)     // Catch:{ all -> 0x0384 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0384 }
            r14 = 0
            goto L_0x0268
        L_0x0235:
            r14 = 0
            r5.setLength(r14)     // Catch:{ all -> 0x0384 }
            r5.append(r12)     // Catch:{ all -> 0x0384 }
            r5.append(r13)     // Catch:{ all -> 0x0384 }
            r5.append(r4)     // Catch:{ all -> 0x0384 }
            r5.append(r13)     // Catch:{ all -> 0x0384 }
            r5.append(r6)     // Catch:{ all -> 0x0384 }
            r5.append(r13)     // Catch:{ all -> 0x0384 }
            java.lang.String r8 = r1.f1658f     // Catch:{ all -> 0x0384 }
            r5.append(r8)     // Catch:{ all -> 0x0384 }
            r5.append(r13)     // Catch:{ all -> 0x0384 }
            r8 = 1
            if (r11 != r8) goto L_0x0259
            java.lang.String r8 = "auth-int"
            goto L_0x025b
        L_0x0259:
            java.lang.String r8 = "auth"
        L_0x025b:
            r5.append(r8)     // Catch:{ all -> 0x0384 }
            r5.append(r13)     // Catch:{ all -> 0x0384 }
            r5.append(r0)     // Catch:{ all -> 0x0384 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0384 }
        L_0x0268:
            byte[] r0 = m2614i(r0)     // Catch:{ all -> 0x0384 }
            byte[] r0 = r9.digest(r0)     // Catch:{ all -> 0x0384 }
            java.lang.String r0 = m2613g(r0)     // Catch:{ all -> 0x0384 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0384 }
            r8 = 128(0x80, float:1.794E-43)
            r5.<init>(r8)     // Catch:{ all -> 0x0384 }
            boolean r8 = r18.mo16471o()     // Catch:{ all -> 0x0384 }
            if (r8 == 0) goto L_0x0284
            java.lang.String r8 = "Proxy-Authorization"
            goto L_0x0286
        L_0x0284:
            java.lang.String r8 = "Authorization"
        L_0x0286:
            java.lang.String r9 = "Digest "
            r5.append(r9)     // Catch:{ all -> 0x0384 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0384 }
            r12 = 20
            r9.<init>(r12)     // Catch:{ all -> 0x0384 }
            com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair r12 = new com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair     // Catch:{ all -> 0x0384 }
            java.lang.String r13 = "username"
            r12.<init>(r13, r10)     // Catch:{ all -> 0x0384 }
            r9.add(r12)     // Catch:{ all -> 0x0384 }
            com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair r10 = new com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair     // Catch:{ all -> 0x0384 }
            java.lang.String r12 = "realm"
            r10.<init>(r12, r3)     // Catch:{ all -> 0x0384 }
            r9.add(r10)     // Catch:{ all -> 0x0384 }
            com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair r3 = new com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair     // Catch:{ all -> 0x0384 }
            java.lang.String r10 = "nonce"
            r3.<init>(r10, r4)     // Catch:{ all -> 0x0384 }
            r9.add(r3)     // Catch:{ all -> 0x0384 }
            com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair r3 = new com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair     // Catch:{ all -> 0x0384 }
            java.lang.String r4 = "uri"
            r3.<init>(r4, r2)     // Catch:{ all -> 0x0384 }
            r9.add(r3)     // Catch:{ all -> 0x0384 }
            com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair r2 = new com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair     // Catch:{ all -> 0x0384 }
            java.lang.String r3 = "response"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0384 }
            r9.add(r2)     // Catch:{ all -> 0x0384 }
            if (r11 == 0) goto L_0x02ef
            com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair r0 = new com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair     // Catch:{ all -> 0x0384 }
            java.lang.String r2 = "qop"
            r3 = 1
            if (r11 != r3) goto L_0x02d0
            java.lang.String r4 = "auth-int"
            goto L_0x02d2
        L_0x02d0:
            java.lang.String r4 = "auth"
        L_0x02d2:
            r0.<init>(r2, r4)     // Catch:{ all -> 0x0384 }
            r9.add(r0)     // Catch:{ all -> 0x0384 }
            com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair r0 = new com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair     // Catch:{ all -> 0x0384 }
            java.lang.String r2 = "nc"
            r0.<init>(r2, r6)     // Catch:{ all -> 0x0384 }
            r9.add(r0)     // Catch:{ all -> 0x0384 }
            com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair r0 = new com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair     // Catch:{ all -> 0x0384 }
            java.lang.String r2 = "cnonce"
            java.lang.String r4 = r1.f1658f     // Catch:{ all -> 0x0384 }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x0384 }
            r9.add(r0)     // Catch:{ all -> 0x0384 }
            goto L_0x02f0
        L_0x02ef:
            r3 = 1
        L_0x02f0:
            com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair r0 = new com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair     // Catch:{ all -> 0x0384 }
            java.lang.String r2 = "algorithm"
            r0.<init>(r2, r7)     // Catch:{ all -> 0x0384 }
            r9.add(r0)     // Catch:{ all -> 0x0384 }
            if (r17 == 0) goto L_0x0308
            com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair r0 = new com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair     // Catch:{ all -> 0x0384 }
            java.lang.String r2 = "opaque"
            r4 = r17
            r0.<init>(r2, r4)     // Catch:{ all -> 0x0384 }
            r9.add(r0)     // Catch:{ all -> 0x0384 }
        L_0x0308:
            r15 = r14
        L_0x0309:
            int r0 = r9.size()     // Catch:{ all -> 0x0384 }
            if (r15 >= r0) goto L_0x0349
            java.lang.Object r0 = r9.get(r15)     // Catch:{ all -> 0x0384 }
            c.e.a.e.d.j r0 = (p040c.p107e.p108a.p109e.p110d.C1982j) r0     // Catch:{ all -> 0x0384 }
            if (r15 <= 0) goto L_0x031c
            java.lang.String r2 = ", "
            r5.append(r2)     // Catch:{ all -> 0x0384 }
        L_0x031c:
            java.lang.String r2 = r0.getName()     // Catch:{ all -> 0x0384 }
            java.lang.String r4 = "nc"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0384 }
            if (r4 != 0) goto L_0x033b
            java.lang.String r4 = "qop"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0384 }
            if (r4 != 0) goto L_0x033b
            java.lang.String r4 = "algorithm"
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0384 }
            if (r2 == 0) goto L_0x0339
            goto L_0x033b
        L_0x0339:
            r2 = r14
            goto L_0x033c
        L_0x033b:
            r2 = r3
        L_0x033c:
            c.e.a.e.d.c r4 = p040c.p107e.p108a.p109e.p110d.C1974c.f1665a     // Catch:{ all -> 0x0384 }
            if (r2 != 0) goto L_0x0342
            r2 = r3
            goto L_0x0343
        L_0x0342:
            r2 = r14
        L_0x0343:
            r4.mo16481b(r5, r0, r2)     // Catch:{ all -> 0x0384 }
            int r15 = r15 + 1
            goto L_0x0309
        L_0x0349:
            com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair r0 = new com.burgstaller.okhttp.digest.fromhttpclient.BasicNameValuePair     // Catch:{ all -> 0x0384 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0384 }
            r0.<init>(r8, r2)     // Catch:{ all -> 0x0384 }
            monitor-exit(r18)
            return r0
        L_0x0354:
            r0 = move-exception
            r2 = r0
            c.e.a.e.c$a r0 = new c.e.a.e.c$a     // Catch:{ all -> 0x0384 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0384 }
            r3.<init>()     // Catch:{ all -> 0x0384 }
            java.lang.String r4 = "Unsuppported digest algorithm: "
            r3.append(r4)     // Catch:{ all -> 0x0384 }
            r3.append(r9)     // Catch:{ all -> 0x0384 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0384 }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x0384 }
            throw r0     // Catch:{ all -> 0x0384 }
        L_0x036d:
            c.e.a.e.c$a r0 = new c.e.a.e.c$a     // Catch:{ all -> 0x0384 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0384 }
            r2.<init>()     // Catch:{ all -> 0x0384 }
            java.lang.String r3 = "None of the qop methods is supported: "
            r2.append(r3)     // Catch:{ all -> 0x0384 }
            r2.append(r9)     // Catch:{ all -> 0x0384 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0384 }
            r0.<init>(r2)     // Catch:{ all -> 0x0384 }
            throw r0     // Catch:{ all -> 0x0384 }
        L_0x0384:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p107e.p108a.p109e.C1970c.mo16464e(c.e.a.e.b, okhttp3.Request, java.util.Map):c.e.a.e.d.j");
    }

    /* renamed from: h */
    public final String mo16465h(Headers headers, String str) {
        List<String> values = headers.values(str);
        for (String next : values) {
            if (next.startsWith("Digest")) {
                return next;
            }
        }
        if (values.contains("OkHttp-Preemptive")) {
            return null;
        }
        throw new IllegalArgumentException("unsupported auth scheme: " + values);
    }

    /* renamed from: j */
    public final byte[] mo16466j(String str, String str2) {
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    /* renamed from: k */
    public String mo16467k(Request request) {
        String header = request.header("http.auth.credential-charset");
        return header == null ? mo16468l().name() : header;
    }

    /* renamed from: l */
    public Charset mo16468l() {
        return this.f1654b;
    }

    /* renamed from: m */
    public final String mo16469m(int i) {
        if (i == 401) {
            mo16473q(false);
            return "WWW-Authenticate";
        } else if (i != 407) {
            return "";
        } else {
            mo16473q(true);
            return "Proxy-Authenticate";
        }
    }

    /* renamed from: n */
    public final boolean mo16470n(Request request, String str, boolean z) {
        String header = request.header(mo16471o() ? "Proxy-Authorization" : "Authorization");
        if (header == null || !header.startsWith("Digest")) {
            return false;
        }
        return !z;
    }

    /* renamed from: o */
    public boolean mo16471o() {
        return this.f1661i;
    }

    /* renamed from: p */
    public void mo16472p(String str, int i, int i2, Map<String, String> map) {
        C1975d dVar = C1975d.f1666a;
        C1983k kVar = new C1983k(i, str.length());
        C1976e eVar = new C1976e(i2);
        eVar.mo16491a(str);
        C1978g[] d = dVar.mo16486d(eVar, kVar);
        if (d.length != 0) {
            for (C1978g gVar : d) {
                map.put(gVar.getName(), gVar.getValue());
            }
            return;
        }
        throw new IllegalArgumentException("Authentication challenge is empty");
    }

    /* renamed from: q */
    public void mo16473q(boolean z) {
        this.f1661i = z;
    }
}
