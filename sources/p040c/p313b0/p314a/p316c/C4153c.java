package p040c.p313b0.p314a.p316c;

import android.os.Build;
import android.webkit.WebResourceResponse;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerTriggerResourceType;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.C8770InAppWebView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import okhttp3.Request;
import okhttp3.Response;
import p040c.p313b0.p314a.C4222p;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.b0.a.c.c */
/* compiled from: ContentBlockerHandler */
public class C4153c {

    /* renamed from: a */
    public List<C4151a> f8744a = new ArrayList();

    /* renamed from: c.b0.a.c.c$a */
    /* compiled from: ContentBlockerHandler */
    public class C4154a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ String[] f8745e;

        /* renamed from: l */
        public final /* synthetic */ C8770InAppWebView f8746l;

        /* renamed from: m */
        public final /* synthetic */ CountDownLatch f8747m;

        public C4154a(C4153c cVar, String[] strArr, C8770InAppWebView inAppWebView, CountDownLatch countDownLatch) {
            this.f8745e = strArr;
            this.f8746l = inAppWebView;
            this.f8747m = countDownLatch;
        }

        public void run() {
            this.f8745e[0] = this.f8746l.getUrl();
            this.f8747m.countDown();
        }
    }

    /* renamed from: c.b0.a.c.c$b */
    /* compiled from: ContentBlockerHandler */
    public class C4155b implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C8770InAppWebView f8748e;

        /* renamed from: l */
        public final /* synthetic */ String f8749l;

        public C4155b(C4153c cVar, C8770InAppWebView inAppWebView, String str) {
            this.f8748e = inAppWebView;
            this.f8749l = str;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 19) {
                this.f8748e.mo45784j(this.f8749l, (C9017j.C9022d) null);
                return;
            }
            C8770InAppWebView inAppWebView = this.f8748e;
            inAppWebView.loadUrl("javascript:" + this.f8749l);
        }
    }

    /* renamed from: c.b0.a.c.c$c */
    /* compiled from: ContentBlockerHandler */
    public static /* synthetic */ class C4156c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8750a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerActionType[] r0 = com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8750a = r0
                com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerActionType r1 = com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerActionType.BLOCK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8750a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerActionType r1 = com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerActionType.CSS_DISPLAY_NONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8750a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerActionType r1 = com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerActionType.MAKE_HTTPS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p313b0.p314a.p316c.C4153c.C4156c.<clinit>():void");
        }
    }

    /* renamed from: a */
    public WebResourceResponse mo25480a(C8770InAppWebView inAppWebView, String str) {
        return mo25481b(inAppWebView, str, mo25484e(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00da, code lost:
        r5 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f7  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.webkit.WebResourceResponse mo25481b(com.pichillilorenzo.flutter_inappwebview.InAppWebView.C8770InAppWebView r19, java.lang.String r20, com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerTriggerResourceType r21) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "charset="
            c.b0.a.i.g r0 = r2.f16814w
            java.util.List<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> r0 = r0.f8931o
            r5 = 0
            if (r0 != 0) goto L_0x0010
            return r5
        L_0x0010:
            r6 = 0
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0017 }
            r0.<init>(r3)     // Catch:{ URISyntaxException -> 0x0017 }
            goto L_0x0049
        L_0x0017:
            java.lang.String r0 = ":"
            java.lang.String[] r0 = r3.split(r0)
            r8 = r0[r6]
            java.net.URL r0 = new java.net.URL
            java.lang.String r7 = "https"
            java.lang.String r7 = r3.replace(r8, r7)
            r0.<init>(r7)
            java.net.URI r15 = new java.net.URI
            java.lang.String r9 = r0.getUserInfo()
            java.lang.String r10 = r0.getHost()
            int r11 = r0.getPort()
            java.lang.String r12 = r0.getPath()
            java.lang.String r13 = r0.getQuery()
            java.lang.String r14 = r0.getRef()
            r7 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0 = r15
        L_0x0049:
            java.lang.String r7 = r0.getHost()
            int r8 = r0.getPort()
            java.lang.String r9 = r0.getScheme()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<c.b0.a.c.a> r10 = r1.f8744a
            r0.<init>(r10)
            java.util.Iterator r10 = r0.iterator()
        L_0x0060:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02d4
            java.lang.Object r0 = r10.next()
            c.b0.a.c.a r0 = (p040c.p313b0.p314a.p316c.C4151a) r0
            c.b0.a.c.d r11 = r0.f8740a
            java.util.List<com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerTriggerResourceType> r12 = r11.f8753c
            com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerTriggerResourceType r13 = com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerTriggerResourceType.IMAGE
            boolean r13 = r12.contains(r13)
            if (r13 == 0) goto L_0x0085
            com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerTriggerResourceType r13 = com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerTriggerResourceType.SVG_DOCUMENT
            boolean r13 = r12.contains(r13)
            if (r13 != 0) goto L_0x0085
            com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerTriggerResourceType r13 = com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerTriggerResourceType.SVG_DOCUMENT
            r12.add(r13)
        L_0x0085:
            c.b0.a.c.b r0 = r0.f8741b
            java.util.regex.Pattern r13 = r11.f8752b
            java.util.regex.Matcher r13 = r13.matcher(r3)
            boolean r13 = r13.matches()
            if (r13 == 0) goto L_0x02cc
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L_0x00a2
            r13 = r21
            boolean r12 = r12.contains(r13)
            if (r12 != 0) goto L_0x00a4
            return r5
        L_0x00a2:
            r13 = r21
        L_0x00a4:
            java.util.List<java.lang.String> r12 = r11.f8754d
            boolean r12 = r12.isEmpty()
            java.lang.String r14 = "*"
            java.lang.String r15 = ""
            if (r12 != 0) goto L_0x00e3
            java.util.List<java.lang.String> r12 = r11.f8754d
            java.util.Iterator r12 = r12.iterator()
        L_0x00b6:
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L_0x00de
            java.lang.Object r16 = r12.next()
            r6 = r16
            java.lang.String r6 = (java.lang.String) r6
            boolean r16 = r6.startsWith(r14)
            if (r16 == 0) goto L_0x00d4
            java.lang.String r5 = r6.replace(r14, r15)
            boolean r5 = r7.endsWith(r5)
            if (r5 != 0) goto L_0x00da
        L_0x00d4:
            boolean r5 = r6.equals(r7)
            if (r5 == 0) goto L_0x00dc
        L_0x00da:
            r5 = 1
            goto L_0x00df
        L_0x00dc:
            r5 = 0
            goto L_0x00b6
        L_0x00de:
            r5 = 0
        L_0x00df:
            if (r5 != 0) goto L_0x00e3
            r5 = 0
            return r5
        L_0x00e3:
            java.util.List<java.lang.String> r5 = r11.f8755e
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0115
            java.util.List<java.lang.String> r5 = r11.f8755e
            java.util.Iterator r5 = r5.iterator()
        L_0x00f1:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0115
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r12 = r6.startsWith(r14)
            if (r12 == 0) goto L_0x010d
            java.lang.String r12 = r6.replace(r14, r15)
            boolean r12 = r7.endsWith(r12)
            if (r12 != 0) goto L_0x0113
        L_0x010d:
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00f1
        L_0x0113:
            r2 = 0
            return r2
        L_0x0115:
            r5 = 1
            java.lang.String[] r6 = new java.lang.String[r5]
            java.util.List<java.lang.String> r5 = r11.f8756f
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0130
            java.util.List<java.lang.String> r5 = r11.f8757g
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0130
            java.util.List<java.lang.String> r5 = r11.f8758h
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x014a
        L_0x0130:
            java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch
            r12 = 1
            r5.<init>(r12)
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r14 = android.os.Looper.getMainLooper()
            r12.<init>(r14)
            c.b0.a.c.c$a r14 = new c.b0.a.c.c$a
            r14.<init>(r1, r6, r2, r5)
            r12.post(r14)
            r5.await()
        L_0x014a:
            java.util.List<java.lang.String> r5 = r11.f8756f
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0199
            java.net.URI r5 = new java.net.URI
            r12 = 0
            r14 = r6[r12]
            r5.<init>(r14)
            java.lang.String r12 = r5.getHost()
            int r14 = r5.getPort()
            java.lang.String r5 = r5.getScheme()
            r17 = r10
            java.util.List<java.lang.String> r10 = r11.f8756f
            java.lang.String r13 = "first-party"
            boolean r10 = r10.contains(r13)
            if (r10 == 0) goto L_0x0185
            if (r12 == 0) goto L_0x0185
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x0183
            boolean r5 = r12.equals(r7)
            if (r5 == 0) goto L_0x0183
            if (r14 != r8) goto L_0x0183
            goto L_0x0185
        L_0x0183:
            r2 = 0
            goto L_0x0198
        L_0x0185:
            java.util.List<java.lang.String> r5 = r11.f8756f
            java.lang.String r10 = "third-party"
            boolean r5 = r5.contains(r10)
            if (r5 == 0) goto L_0x019b
            if (r12 == 0) goto L_0x019b
            boolean r5 = r12.equals(r7)
            if (r5 == 0) goto L_0x019b
            goto L_0x0183
        L_0x0198:
            return r2
        L_0x0199:
            r17 = r10
        L_0x019b:
            java.util.List<java.lang.String> r5 = r11.f8757g
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x01c5
            java.util.List<java.lang.String> r5 = r11.f8757g
            java.util.Iterator r5 = r5.iterator()
        L_0x01a9:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x01c0
            java.lang.Object r10 = r5.next()
            java.lang.String r10 = (java.lang.String) r10
            r12 = 0
            r13 = r6[r12]
            boolean r10 = r13.startsWith(r10)
            if (r10 == 0) goto L_0x01a9
            r5 = 1
            goto L_0x01c1
        L_0x01c0:
            r5 = 0
        L_0x01c1:
            if (r5 != 0) goto L_0x01c5
            r5 = 0
            return r5
        L_0x01c5:
            java.util.List<java.lang.String> r5 = r11.f8758h
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x01ea
            java.util.List<java.lang.String> r5 = r11.f8758h
            java.util.Iterator r5 = r5.iterator()
        L_0x01d3:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x01ea
            java.lang.Object r10 = r5.next()
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            r12 = r6[r11]
            boolean r10 = r12.startsWith(r10)
            if (r10 == 0) goto L_0x01d3
            r10 = 0
            return r10
        L_0x01ea:
            int[] r5 = p040c.p313b0.p314a.p316c.C4153c.C4156c.f8750a
            com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerActionType r6 = r0.f8742a
            int r6 = r6.ordinal()
            r5 = r5[r6]
            r6 = 1
            if (r5 == r6) goto L_0x02c5
            r6 = 2
            if (r5 == r6) goto L_0x0299
            r0 = 3
            if (r5 == r0) goto L_0x0201
        L_0x01fd:
            r5 = 0
            r10 = 0
            goto L_0x02cf
        L_0x0201:
            java.lang.String r0 = "http"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0297
            r0 = -1
            if (r8 == r0) goto L_0x0210
            r0 = 80
            if (r8 != r0) goto L_0x01fd
        L_0x0210:
            java.lang.String r0 = "http://"
            java.lang.String r5 = "https://"
            java.lang.String r0 = r3.replace(r0, r5)
            okhttp3.Request$Builder r5 = new okhttp3.Request$Builder
            r5.<init>()
            okhttp3.Request$Builder r0 = r5.url((java.lang.String) r0)
            okhttp3.Request r0 = r0.build()
            okhttp3.OkHttpClient r5 = p040c.p313b0.p314a.C4222p.m11504b()     // Catch:{ Exception -> 0x0281 }
            okhttp3.Call r0 = r5.newCall(r0)     // Catch:{ Exception -> 0x0281 }
            okhttp3.Response r5 = r0.execute()     // Catch:{ Exception -> 0x0281 }
            okhttp3.ResponseBody r0 = r5.body()     // Catch:{ Exception -> 0x027e }
            byte[] r0 = r0.bytes()     // Catch:{ Exception -> 0x027e }
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x027e }
            r6.<init>(r0)     // Catch:{ Exception -> 0x027e }
            java.lang.String r0 = "content-type"
            java.lang.String r10 = "text/plain"
            java.lang.String r0 = r5.header(r0, r10)     // Catch:{ Exception -> 0x027e }
            java.lang.String r10 = ";"
            java.lang.String[] r0 = r0.split(r10)     // Catch:{ Exception -> 0x027e }
            r10 = 0
            r11 = r0[r10]     // Catch:{ Exception -> 0x027c }
            java.lang.String r11 = r11.trim()     // Catch:{ Exception -> 0x027c }
            int r12 = r0.length     // Catch:{ Exception -> 0x027c }
            r13 = 1
            if (r12 <= r13) goto L_0x026a
            r12 = r0[r13]     // Catch:{ Exception -> 0x027c }
            boolean r12 = r12.contains(r4)     // Catch:{ Exception -> 0x027c }
            if (r12 == 0) goto L_0x026a
            r0 = r0[r13]     // Catch:{ Exception -> 0x027c }
            java.lang.String r0 = r0.replace(r4, r15)     // Catch:{ Exception -> 0x027c }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x027c }
            goto L_0x026c
        L_0x026a:
            java.lang.String r0 = "utf-8"
        L_0x026c:
            okhttp3.ResponseBody r12 = r5.body()     // Catch:{ Exception -> 0x027c }
            r12.close()     // Catch:{ Exception -> 0x027c }
            r5.close()     // Catch:{ Exception -> 0x027c }
            android.webkit.WebResourceResponse r12 = new android.webkit.WebResourceResponse     // Catch:{ Exception -> 0x027c }
            r12.<init>(r11, r0, r6)     // Catch:{ Exception -> 0x027c }
            return r12
        L_0x027c:
            r0 = move-exception
            goto L_0x0284
        L_0x027e:
            r0 = move-exception
            r10 = 0
            goto L_0x0284
        L_0x0281:
            r0 = move-exception
            r10 = 0
            r5 = 0
        L_0x0284:
            r0.printStackTrace()
            if (r5 == 0) goto L_0x0293
            okhttp3.ResponseBody r6 = r5.body()
            r6.close()
            r5.close()
        L_0x0293:
            r0.getMessage()
            goto L_0x02c3
        L_0x0297:
            r10 = 0
            goto L_0x02c3
        L_0x0299:
            r10 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "function hide () { document.querySelectorAll('"
            r5.append(r6)
            java.lang.String r0 = r0.f8743b
            r5.append(r0)
            java.lang.String r0 = "').forEach(function (item, index) { item.style.display = \"none\"; }); }; hide(); document.addEventListener(\"DOMContentLoaded\", function(event) { hide(); });"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r5.<init>(r6)
            c.b0.a.c.c$b r6 = new c.b0.a.c.c$b
            r6.<init>(r1, r2, r0)
            r5.post(r6)
        L_0x02c3:
            r5 = 0
            goto L_0x02cf
        L_0x02c5:
            android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse
            r5 = 0
            r0.<init>(r15, r15, r5)
            return r0
        L_0x02cc:
            r17 = r10
            r10 = r6
        L_0x02cf:
            r6 = r10
            r10 = r17
            goto L_0x0060
        L_0x02d4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p313b0.p314a.p316c.C4153c.mo25481b(com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView, java.lang.String, com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerTriggerResourceType):android.webkit.WebResourceResponse");
    }

    /* renamed from: c */
    public WebResourceResponse mo25482c(C8770InAppWebView inAppWebView, String str, String str2) {
        return mo25481b(inAppWebView, str, mo25483d(str2));
    }

    /* renamed from: d */
    public ContentBlockerTriggerResourceType mo25483d(String str) {
        ContentBlockerTriggerResourceType contentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.RAW;
        if (str.equals("text/css")) {
            return ContentBlockerTriggerResourceType.STYLE_SHEET;
        }
        if (str.equals("image/svg+xml")) {
            return ContentBlockerTriggerResourceType.SVG_DOCUMENT;
        }
        if (str.startsWith("image/")) {
            return ContentBlockerTriggerResourceType.IMAGE;
        }
        if (str.startsWith("font/")) {
            return ContentBlockerTriggerResourceType.FONT;
        }
        if (str.startsWith("audio/") || str.startsWith("video/") || str.equals("application/ogg")) {
            return ContentBlockerTriggerResourceType.MEDIA;
        }
        if (str.endsWith("javascript")) {
            return ContentBlockerTriggerResourceType.SCRIPT;
        }
        if (str.startsWith("text/")) {
            return ContentBlockerTriggerResourceType.DOCUMENT;
        }
        return contentBlockerTriggerResourceType;
    }

    /* renamed from: e */
    public ContentBlockerTriggerResourceType mo25484e(String str) {
        ContentBlockerTriggerResourceType contentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.RAW;
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            return contentBlockerTriggerResourceType;
        }
        Response response = null;
        try {
            Response execute = C4222p.m11504b().newCall(new Request.Builder().url(str).head().build()).execute();
            if (execute.header("content-type") == null) {
                return contentBlockerTriggerResourceType;
            }
            String[] split = execute.header("content-type").split(MAPCookie.COOKIE_ATTRIBUTE_SEPERATOR);
            String trim = split[0].trim();
            if (split.length > 1 && split[1].contains("charset=")) {
                split[1].replace("charset=", "").trim();
            }
            execute.body().close();
            execute.close();
            return mo25483d(trim);
        } catch (Exception e) {
            if (response != null) {
                response.body().close();
                response.close();
            }
            e.printStackTrace();
            e.getMessage();
            return contentBlockerTriggerResourceType;
        }
    }

    /* renamed from: f */
    public List<C4151a> mo25485f() {
        return this.f8744a;
    }
}
