package p040c.p151o.p152a.p153a.p172t.p173c;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import java.util.HashMap;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.p174u.C2204e;
import p040c.p151o.p152a.p153a.p174u.C2207h;

/* renamed from: c.o.a.a.t.c.c */
/* compiled from: GigyaPluginWebViewClient */
public class C2194c extends WebViewClient {

    /* renamed from: a */
    public final C2196e f2182a;

    public C2194c(@NonNull C2196e eVar) {
        this.f2182a = eVar;
    }

    /* renamed from: a */
    public final boolean mo17041a(Uri uri) {
        return C2207h.m3361c(uri.getScheme()) && C2204e.m3353c(uri.getHost(), "on_js_exception");
    }

    /* renamed from: b */
    public final boolean mo17042b(Uri uri) {
        return C2207h.m3361c(uri.getScheme()) && C2204e.m3353c(uri.getHost(), "on_js_load_error");
    }

    /* renamed from: c */
    public final void mo17043c(Uri uri) {
        HashMap hashMap = new HashMap();
        String uri2 = uri.toString();
        if (mo17042b(uri)) {
            hashMap.put("eventName", "error");
            hashMap.put(BundleJUnitUtils.KEY_DESCRIPTION, "Failed loading socialize.js");
            hashMap.put("errorCode", 500032);
            hashMap.put("dismiss", Boolean.TRUE);
            this.f2182a.mo17049b(new C2192a(hashMap));
        } else if (mo17041a(uri)) {
            hashMap.put("eventName", "error");
            hashMap.put("errorCode", 405001);
            hashMap.put(BundleJUnitUtils.KEY_DESCRIPTION, "Javascript error while loading plugin. Please make sure the plugin name is correct.");
            hashMap.put("dismiss", Boolean.TRUE);
            this.f2182a.mo17049b(new C2192a(hashMap));
        } else if (!this.f2182a.mo17051d(uri2)) {
            this.f2182a.mo17050c(uri);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f2182a.mo17048a();
    }

    @RequiresApi(api = 23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "error");
        hashMap.put("errorCode", Integer.valueOf(webResourceError.getErrorCode()));
        hashMap.put(BundleJUnitUtils.KEY_DESCRIPTION, webResourceError.getDescription());
        hashMap.put("dismiss", Boolean.TRUE);
        C2103f.m3056b("GigyaPluginWebViewClient", "onReceivedError: " + hashMap.toString());
    }

    @RequiresApi(api = 21)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        mo17043c(webResourceRequest.getUrl());
        return true;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        mo17043c(Uri.parse(str));
        return true;
    }
}
