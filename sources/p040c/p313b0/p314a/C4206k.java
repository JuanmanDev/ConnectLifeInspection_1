package p040c.p313b0.p314a;

import android.content.pm.PackageInfo;
import android.webkit.ValueCallback;
import java.util.HashMap;
import java.util.Map;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.b0.a.k */
/* compiled from: InAppWebViewStatic */
public class C4206k implements C9017j.C9021c {

    /* renamed from: e */
    public C9017j f8970e;

    /* renamed from: c.b0.a.k$a */
    /* compiled from: InAppWebViewStatic */
    public class C4207a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C9017j.C9022d f8971e;

        public C4207a(C4206k kVar, C9017j.C9022d dVar) {
            this.f8971e = dVar;
        }

        public void run() {
            this.f8971e.success(Boolean.TRUE);
        }
    }

    /* renamed from: c.b0.a.k$b */
    /* compiled from: InAppWebViewStatic */
    public class C4208b implements ValueCallback<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ C9017j.C9022d f8972a;

        public C4208b(C4206k kVar, C9017j.C9022d dVar) {
            this.f8972a = dVar;
        }

        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
            this.f8972a.success(bool);
        }
    }

    public C4206k(C9003c cVar) {
        C9017j jVar = new C9017j(cVar, "com.pichillilorenzo/flutter_inappwebview_static");
        this.f8970e = jVar;
        jVar.mo46575e(this);
    }

    /* renamed from: a */
    public Map<String, Object> mo25623a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("versionName", packageInfo.versionName);
        hashMap.put("packageName", packageInfo.packageName);
        return hashMap;
    }

    /* renamed from: b */
    public void mo25624b() {
        this.f8970e.mo46575e((C9017j.C9021c) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r7, p553f.p554a.p570e.p571a.C9017j.C9022d r8) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f17687a
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1600358415: goto L_0x0036;
                case -436220260: goto L_0x002c;
                case 258673215: goto L_0x0022;
                case 643643439: goto L_0x0018;
                case 1586319888: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0040
        L_0x000e:
            java.lang.String r1 = "getCurrentWebViewPackage"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = r2
            goto L_0x0041
        L_0x0018:
            java.lang.String r1 = "getDefaultUserAgent"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 0
            goto L_0x0041
        L_0x0022:
            java.lang.String r1 = "getSafeBrowsingPrivacyPolicyUrl"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = r4
            goto L_0x0041
        L_0x002c:
            java.lang.String r1 = "clearClientCertPreferences"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = r5
            goto L_0x0041
        L_0x0036:
            java.lang.String r1 = "setSafeBrowsingWhitelist"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = r3
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            if (r0 == 0) goto L_0x00bf
            if (r0 == r5) goto L_0x00aa
            r1 = 0
            r5 = 27
            if (r0 == r4) goto L_0x008e
            if (r0 == r3) goto L_0x006b
            if (r0 == r2) goto L_0x0053
            r8.notImplemented()
            goto L_0x00c8
        L_0x0053:
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r7 < r0) goto L_0x0067
            android.app.Activity r7 = p040c.p313b0.p314a.C4221o.f8998f
            android.content.pm.PackageInfo r7 = androidx.webkit.WebViewCompat.getCurrentWebViewPackage(r7)
            java.util.Map r7 = r6.mo25623a(r7)
            r8.success(r7)
            goto L_0x00c8
        L_0x0067:
            r8.success(r1)
            goto L_0x00c8
        L_0x006b:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r5) goto L_0x0088
            java.lang.String r0 = "SAFE_BROWSING_WHITELIST"
            boolean r0 = androidx.webkit.WebViewFeature.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = "hosts"
            java.lang.Object r7 = r7.mo46571a(r0)
            java.util.List r7 = (java.util.List) r7
            c.b0.a.k$b r0 = new c.b0.a.k$b
            r0.<init>(r6, r8)
            androidx.webkit.WebViewCompat.setSafeBrowsingWhitelist(r7, r0)
            goto L_0x00c8
        L_0x0088:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r8.success(r7)
            goto L_0x00c8
        L_0x008e:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r5) goto L_0x00a6
            java.lang.String r7 = "SAFE_BROWSING_PRIVACY_POLICY_URL"
            boolean r7 = androidx.webkit.WebViewFeature.isFeatureSupported(r7)
            if (r7 == 0) goto L_0x00a6
            android.net.Uri r7 = androidx.webkit.WebViewCompat.getSafeBrowsingPrivacyPolicyUrl()
            java.lang.String r7 = r7.toString()
            r8.success(r7)
            goto L_0x00c8
        L_0x00a6:
            r8.success(r1)
            goto L_0x00c8
        L_0x00aa:
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r7 < r0) goto L_0x00b9
            c.b0.a.k$a r7 = new c.b0.a.k$a
            r7.<init>(r6, r8)
            android.webkit.WebView.clearClientCertPreferences(r7)
            goto L_0x00c8
        L_0x00b9:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r8.success(r7)
            goto L_0x00c8
        L_0x00bf:
            android.content.Context r7 = p040c.p313b0.p314a.C4221o.f8993a
            java.lang.String r7 = android.webkit.WebSettings.getDefaultUserAgent(r7)
            r8.success(r7)
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p313b0.p314a.C4206k.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }
}
