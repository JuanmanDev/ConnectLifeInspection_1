package p040c.p313b0.p314a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.C8770InAppWebView;
import java.util.HashMap;
import java.util.Map;
import p040c.p313b0.p314a.p319i.C4171c;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.b0.a.l */
/* compiled from: JavaScriptBridgeInterface */
public class C4209l {

    /* renamed from: a */
    public C4171c f8973a;

    /* renamed from: b */
    public InAppBrowserActivity f8974b;

    /* renamed from: c */
    public C9017j f8975c;

    /* renamed from: c.b0.a.l$a */
    /* compiled from: JavaScriptBridgeInterface */
    public class C4210a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C8770InAppWebView f8976e;

        public C4210a(C4209l lVar, C8770InAppWebView inAppWebView) {
            this.f8976e = inAppWebView;
        }

        public void run() {
            C8770InAppWebView inAppWebView = this.f8976e;
            if (inAppWebView != null && inAppWebView.f16795C != null) {
                inAppWebView.mo45787n();
            }
        }
    }

    /* renamed from: c.b0.a.l$b */
    /* compiled from: JavaScriptBridgeInterface */
    public class C4211b implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ String f8977e;

        /* renamed from: l */
        public final /* synthetic */ C8770InAppWebView f8978l;

        /* renamed from: m */
        public final /* synthetic */ Map f8979m;

        /* renamed from: n */
        public final /* synthetic */ String f8980n;

        /* renamed from: c.b0.a.l$b$a */
        /* compiled from: JavaScriptBridgeInterface */
        public class C4212a implements C9017j.C9022d {
            public C4212a() {
            }

            public void error(String str, String str2, Object obj) {
                "ERROR: " + str + " " + str2;
            }

            public void notImplemented() {
            }

            public void success(Object obj) {
                C8770InAppWebView inAppWebView = C4211b.this.f8978l;
                if (inAppWebView != null) {
                    if (Build.VERSION.SDK_INT >= 19) {
                        inAppWebView.evaluateJavascript("if(window.flutter_inappwebview[" + C4211b.this.f8980n + "] != null) {window." + "flutter_inappwebview" + "[" + C4211b.this.f8980n + "](" + obj + "); delete window." + "flutter_inappwebview" + "[" + C4211b.this.f8980n + "];}", (ValueCallback) null);
                        return;
                    }
                    inAppWebView.loadUrl("javascript:if(window.flutter_inappwebview[" + C4211b.this.f8980n + "] != null) {window." + "flutter_inappwebview" + "[" + C4211b.this.f8980n + "](" + obj + "); delete window." + "flutter_inappwebview" + "[" + C4211b.this.f8980n + "];}");
                }
            }
        }

        public C4211b(String str, C8770InAppWebView inAppWebView, Map map, String str2) {
            this.f8977e = str;
            this.f8978l = inAppWebView;
            this.f8979m = map;
            this.f8980n = str2;
        }

        public void run() {
            if (this.f8977e.equals("onPrint") && Build.VERSION.SDK_INT >= 21) {
                this.f8978l.mo45765D();
            }
            C4209l.this.f8975c.mo46574d("onCallJsHandler", this.f8979m, new C4212a());
        }
    }

    public C4209l(Object obj) {
        if (obj instanceof InAppBrowserActivity) {
            this.f8974b = (InAppBrowserActivity) obj;
        } else if (obj instanceof C4171c) {
            this.f8973a = (C4171c) obj;
        }
        InAppBrowserActivity inAppBrowserActivity = this.f8974b;
        this.f8975c = inAppBrowserActivity != null ? inAppBrowserActivity.f16773e : this.f8973a.f8794l;
    }

    @JavascriptInterface
    public void _callHandler(String str, String str2, String str3) {
        if (this.f8973a != null || this.f8974b != null) {
            InAppBrowserActivity inAppBrowserActivity = this.f8974b;
            C8770InAppWebView inAppWebView = inAppBrowserActivity != null ? inAppBrowserActivity.f16776n : this.f8973a.f8793e;
            HashMap hashMap = new HashMap();
            InAppBrowserActivity inAppBrowserActivity2 = this.f8974b;
            if (inAppBrowserActivity2 != null) {
                hashMap.put("uuid", inAppBrowserActivity2.f16775m);
            }
            hashMap.put("handlerName", str);
            hashMap.put("args", str3);
            new Handler(Looper.getMainLooper()).post(new C4211b(str, inAppWebView, hashMap, str2));
        }
    }

    @JavascriptInterface
    public void _hideContextMenu() {
        if (this.f8973a != null || this.f8974b != null) {
            InAppBrowserActivity inAppBrowserActivity = this.f8974b;
            new Handler(Looper.getMainLooper()).post(new C4210a(this, inAppBrowserActivity != null ? inAppBrowserActivity.f16776n : this.f8973a.f8793e));
        }
    }

    /* renamed from: a */
    public void mo25630a() {
        this.f8975c.mo46575e((C9017j.C9021c) null);
        if (this.f8974b != null) {
            this.f8974b = null;
        }
        if (this.f8973a != null) {
            this.f8973a = null;
        }
    }
}
