package p553f.p554a.p576f.p587i;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.KeyEvent;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import androidx.core.p028os.EnvironmentCompat;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import androidx.versionedparcelable.VersionedParcel;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebViewClientCompat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: f.a.f.i.d */
/* compiled from: FlutterWebViewClient */
public class C9156d {

    /* renamed from: a */
    public final C9017j f17936a;

    /* renamed from: b */
    public boolean f17937b;

    /* renamed from: f.a.f.i.d$b */
    /* compiled from: FlutterWebViewClient */
    public class C9158b extends WebViewClientCompat {
        public C9158b() {
        }

        public void onPageFinished(WebView webView, String str) {
            C9156d.this.mo46917k(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C9156d.this.mo46918l(webView, str);
        }

        @RequiresApi(api = 21)
        @SuppressLint({"RequiresFeature"})
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceErrorCompat webResourceErrorCompat) {
            C9156d.this.mo46919m(webResourceErrorCompat.getErrorCode(), webResourceErrorCompat.getDescription().toString(), webResourceRequest.getUrl().toString());
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return C9156d.this.mo46920n(webView, webResourceRequest);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return C9156d.this.mo46921o(webView, str);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            C9156d.this.mo46919m(i, str, str2);
        }
    }

    /* renamed from: f.a.f.i.d$c */
    /* compiled from: FlutterWebViewClient */
    public static class C9159c implements C9017j.C9022d {

        /* renamed from: a */
        public final String f17940a;

        /* renamed from: b */
        public final Map<String, String> f17941b;

        /* renamed from: c */
        public final WebView f17942c;

        public /* synthetic */ C9159c(String str, Map map, WebView webView, C9157a aVar) {
            this(str, map, webView);
        }

        /* renamed from: a */
        public final void mo46933a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f17942c.loadUrl(this.f17940a, this.f17941b);
            } else {
                this.f17942c.loadUrl(this.f17940a);
            }
        }

        public void error(String str, String str2, Object obj) {
            throw new IllegalStateException("navigationRequest calls must succeed");
        }

        public void notImplemented() {
            throw new IllegalStateException("navigationRequest must be implemented by the webview method channel");
        }

        public void success(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                mo46933a();
            }
        }

        public C9159c(String str, Map<String, String> map, WebView webView) {
            this.f17940a = str;
            this.f17941b = map;
            this.f17942c = webView;
        }
    }

    public C9156d(C9017j jVar) {
        this.f17936a = jVar;
    }

    /* renamed from: g */
    public static String m24847g(int i) {
        switch (i) {
            case -16:
                return "unsafeResource";
            case -15:
                return "tooManyRequests";
            case -14:
                return "fileNotFound";
            case -13:
                return "file";
            case -12:
                return "badUrl";
            case -11:
                return "failedSslHandshake";
            case -10:
                return "unsupportedScheme";
            case VersionedParcel.EX_PARCELABLE:
                return "redirectLoop";
            case -8:
                return "timeout";
            case -7:
                return "io";
            case -6:
                return "connect";
            case -5:
                return "proxyAuthentication";
            case -4:
                return "authentication";
            case -3:
                return "unsupportedAuthScheme";
            case -2:
                return "hostLookup";
            case -1:
                return EnvironmentCompat.MEDIA_UNKNOWN;
            default:
                throw new IllegalArgumentException(String.format(Locale.getDefault(), "Could not find a string for errorCode: %d", new Object[]{Integer.valueOf(i)}));
        }
    }

    /* renamed from: f */
    public WebViewClient mo46913f(boolean z) {
        this.f17937b = z;
        if (!z || Build.VERSION.SDK_INT >= 24) {
            return mo46914h();
        }
        return mo46915i();
    }

    /* renamed from: h */
    public final WebViewClient mo46914h() {
        return new C9157a();
    }

    /* renamed from: i */
    public final WebViewClientCompat mo46915i() {
        return new C9158b();
    }

    /* renamed from: j */
    public final void mo46916j(String str, Map<String, String> map, WebView webView, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("isForMainFrame", Boolean.valueOf(z));
        if (z) {
            this.f17936a.mo46574d("navigationRequest", hashMap, new C9159c(str, map, webView, (C9157a) null));
        } else {
            this.f17936a.mo46573c("navigationRequest", hashMap);
        }
    }

    /* renamed from: k */
    public final void mo46917k(WebView webView, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        this.f17936a.mo46573c("onPageFinished", hashMap);
    }

    /* renamed from: l */
    public final void mo46918l(WebView webView, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        this.f17936a.mo46573c("onPageStarted", hashMap);
    }

    /* renamed from: m */
    public final void mo46919m(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i));
        hashMap.put(BundleJUnitUtils.KEY_DESCRIPTION, str);
        hashMap.put("errorType", m24847g(i));
        hashMap.put("failingUrl", str2);
        this.f17936a.mo46573c("onWebResourceError", hashMap);
    }

    @TargetApi(21)
    /* renamed from: n */
    public final boolean mo46920n(WebView webView, WebResourceRequest webResourceRequest) {
        if (!this.f17937b) {
            return false;
        }
        mo46916j(webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders(), webView, webResourceRequest.isForMainFrame());
        return webResourceRequest.isForMainFrame();
    }

    /* renamed from: o */
    public final boolean mo46921o(WebView webView, String str) {
        if (!this.f17937b) {
            return false;
        }
        mo46916j(str, (Map<String, String>) null, webView, true);
        return true;
    }

    /* renamed from: f.a.f.i.d$a */
    /* compiled from: FlutterWebViewClient */
    public class C9157a extends WebViewClient {
        public C9157a() {
        }

        public void onPageFinished(WebView webView, String str) {
            C9156d.this.mo46917k(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C9156d.this.mo46918l(webView, str);
        }

        @TargetApi(23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            C9156d.this.mo46919m(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return C9156d.this.mo46920n(webView, webResourceRequest);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            C9156d.this.mo46919m(i, str, str2);
        }
    }
}
