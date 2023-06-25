package com.pichillilorenzo.flutter_inappwebview.InAppWebView;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavInflater;
import androidx.webkit.WebViewFeature;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;
import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import java.util.HashMap;
import java.util.Map;
import p040c.p313b0.p314a.p319i.C4171c;
import p553f.p554a.p570e.p571a.C9017j;

public class InAppWebViewRenderProcessClient extends WebViewRenderProcessClient {

    /* renamed from: a */
    public C4171c f16852a;

    /* renamed from: b */
    public InAppBrowserActivity f16853b;

    /* renamed from: c */
    public C9017j f16854c;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebViewRenderProcessClient$a */
    public class C8792a implements C9017j.C9022d {

        /* renamed from: a */
        public final /* synthetic */ WebViewRenderProcess f16855a;

        public C8792a(InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient, WebViewRenderProcess webViewRenderProcess) {
            this.f16855a = webViewRenderProcess;
        }

        public void error(String str, @Nullable String str2, @Nullable Object obj) {
            "ERROR: " + str + " " + str2;
        }

        public void notImplemented() {
        }

        public void success(@Nullable Object obj) {
            Integer num = (Integer) ((Map) obj).get(NavInflater.TAG_ACTION);
            if (num != null && this.f16855a != null && num.intValue() == 0 && WebViewFeature.isFeatureSupported(WebViewFeature.WEB_VIEW_RENDERER_TERMINATE)) {
                this.f16855a.terminate();
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebViewRenderProcessClient$b */
    public class C8793b implements C9017j.C9022d {

        /* renamed from: a */
        public final /* synthetic */ WebViewRenderProcess f16856a;

        public C8793b(InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient, WebViewRenderProcess webViewRenderProcess) {
            this.f16856a = webViewRenderProcess;
        }

        public void error(String str, @Nullable String str2, @Nullable Object obj) {
            "ERROR: " + str + " " + str2;
        }

        public void notImplemented() {
        }

        public void success(@Nullable Object obj) {
            Integer num = (Integer) ((Map) obj).get(NavInflater.TAG_ACTION);
            if (num != null && this.f16856a != null && num.intValue() == 0 && WebViewFeature.isFeatureSupported(WebViewFeature.WEB_VIEW_RENDERER_TERMINATE)) {
                this.f16856a.terminate();
            }
        }
    }

    public InAppWebViewRenderProcessClient(Object obj) {
        if (obj instanceof InAppBrowserActivity) {
            this.f16853b = (InAppBrowserActivity) obj;
        } else if (obj instanceof C4171c) {
            this.f16852a = (C4171c) obj;
        }
        InAppBrowserActivity inAppBrowserActivity = this.f16853b;
        this.f16854c = inAppBrowserActivity != null ? inAppBrowserActivity.f16773e : this.f16852a.f8794l;
    }

    public void onRenderProcessResponsive(@NonNull WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f16853b;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        hashMap.put("url", webView.getUrl());
        this.f16854c.mo46574d("onRenderProcessResponsive", hashMap, new C8793b(this, webViewRenderProcess));
    }

    public void onRenderProcessUnresponsive(@NonNull WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess) {
        HashMap hashMap = new HashMap();
        InAppBrowserActivity inAppBrowserActivity = this.f16853b;
        if (inAppBrowserActivity != null) {
            hashMap.put("uuid", inAppBrowserActivity.f16775m);
        }
        hashMap.put("url", webView.getUrl());
        this.f16854c.mo46574d("onRenderProcessUnresponsive", hashMap, new C8792a(this, webViewRenderProcess));
    }
}
