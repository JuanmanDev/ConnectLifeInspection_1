package p040c.p313b0.p314a.p319i;

import android.app.Activity;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Message;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.C8770InAppWebView;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Http2ExchangeCodec;
import p040c.p313b0.p314a.C4221o;
import p040c.p313b0.p314a.C4222p;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p575e.C9055e;

/* renamed from: c.b0.a.i.c */
/* compiled from: FlutterWebView */
public class C4171c implements C9055e, C9017j.C9021c {

    /* renamed from: e */
    public C8770InAppWebView f8793e;

    /* renamed from: l */
    public final C9017j f8794l;

    /* renamed from: c.b0.a.i.c$a */
    /* compiled from: FlutterWebView */
    public class C4172a implements ValueCallback<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ C9017j.C9022d f8795a;

        public C4172a(C4171c cVar, C9017j.C9022d dVar) {
            this.f8795a = dVar;
        }

        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
            this.f8795a.success(bool);
        }
    }

    /* renamed from: c.b0.a.i.c$b */
    /* compiled from: FlutterWebView */
    public class C4173b implements ValueCallback<String> {

        /* renamed from: a */
        public final /* synthetic */ C9017j.C9022d f8796a;

        public C4173b(C4171c cVar, C9017j.C9022d dVar) {
            this.f8796a = dVar;
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
            this.f8796a.success(str);
        }
    }

    /* renamed from: c.b0.a.i.c$c */
    /* compiled from: FlutterWebView */
    public class C4174c extends WebViewClient {
        public C4174c() {
        }

        public void onPageFinished(WebView webView, String str) {
            C4171c.this.f8793e.mo45774a();
            C4171c.this.f8793e.destroy();
            C4171c.this.f8793e = null;
        }
    }

    public C4171c(C9003c cVar, Context context, Object obj, HashMap<String, Object> hashMap, View view) {
        String str;
        Context context2 = context;
        HashMap<String, Object> hashMap2 = hashMap;
        C9017j jVar = new C9017j(cVar, "com.pichillilorenzo/flutter_inappwebview_" + obj);
        this.f8794l = jVar;
        jVar.mo46575e(this);
        C4169b bVar = new C4169b();
        DisplayManager displayManager = (DisplayManager) context2.getSystemService("display");
        bVar.mo25523b(displayManager);
        String str2 = (String) hashMap2.get("initialFile");
        Map map = (Map) hashMap2.get("initialData");
        Integer num = (Integer) hashMap2.get("windowId");
        C4202g gVar = new C4202g();
        gVar.mo25610c((Map) hashMap2.get("initialOptions"));
        Activity activity = C4221o.f8998f;
        String str3 = (String) hashMap2.get("initialUrl");
        C8770InAppWebView inAppWebView = r1;
        Integer num2 = num;
        Map map2 = (Map) hashMap2.get("initialHeaders");
        C8770InAppWebView inAppWebView2 = new C8770InAppWebView(C4221o.f8998f, this, obj, num, gVar, (Map) hashMap2.get("contextMenu"), view);
        this.f8793e = inAppWebView;
        bVar.mo25522a(displayManager);
        try {
            Class superclass = this.f8793e.getClass().getSuperclass();
            while (!superclass.getName().equals("android.view.View")) {
                superclass = superclass.getSuperclass();
            }
            Field declaredField = superclass.getDeclaredField("mContext");
            declaredField.setAccessible(true);
            declaredField.set(this.f8793e, context2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f8793e.mo45764C();
        if (num2 != null) {
            Message message = C4176e.f8800s.get(num2);
            if (message != null) {
                ((WebView.WebViewTransport) message.obj).setWebView(this.f8793e);
                message.sendToTarget();
            }
        } else {
            if (str2 != null) {
                try {
                    str = C4222p.m11505c(str2);
                } catch (IOException e2) {
                    e2.printStackTrace();
                    str2 + " asset file cannot be found!";
                    return;
                }
            } else {
                str = str3;
            }
            if (map != null) {
                this.f8793e.loadDataWithBaseURL((String) map.get("baseUrl"), (String) map.get("data"), (String) map.get("mimeType"), (String) map.get(Http2ExchangeCodec.ENCODING), (String) map.get("historyUrl"));
            } else {
                this.f8793e.loadUrl(str, map2);
            }
        }
        if (view == null) {
            Object obj2 = obj;
            if (obj2 instanceof String) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("uuid", obj2);
                this.f8794l.mo46573c("onHeadlessWebViewCreated", hashMap3);
            }
        }
    }

    public void dispose() {
        this.f8794l.mo46575e((C9017j.C9021c) null);
        C8770InAppWebView inAppWebView = this.f8793e;
        if (inAppWebView != null) {
            inAppWebView.f16811t.mo25544j();
            this.f8793e.f16810s.mo25587n();
            this.f8793e.f16813v.mo25630a();
            this.f8793e.setWebChromeClient(new WebChromeClient());
            this.f8793e.setWebViewClient(new C4174c());
            this.f8793e.getSettings().setJavaScriptEnabled(false);
            this.f8793e.loadUrl("about:blank");
        }
    }

    public View getView() {
        return this.f8793e;
    }

    public void onFlutterViewAttached(View view) {
        C8770InAppWebView inAppWebView = this.f8793e;
        if (inAppWebView != null) {
            inAppWebView.setContainerView(view);
        }
    }

    public void onFlutterViewDetached() {
        C8770InAppWebView inAppWebView = this.f8793e;
        if (inAppWebView != null) {
            inAppWebView.setContainerView((View) null);
        }
    }

    public void onInputConnectionLocked() {
        C8770InAppWebView inAppWebView = this.f8793e;
        if (inAppWebView != null && inAppWebView.f16805n == null) {
            inAppWebView.mo45837c();
        }
    }

    public void onInputConnectionUnlocked() {
        C8770InAppWebView inAppWebView = this.f8793e;
        if (inAppWebView != null && inAppWebView.f16805n == null) {
            inAppWebView.mo45841e();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r17, p553f.p554a.p570e.p571a.C9017j.C9022d r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r7 = r18
            java.lang.String r2 = r1.f17687a
            int r3 = r2.hashCode()
            r4 = 27
            r5 = 19
            r6 = 21
            switch(r3) {
                case -1787354268: goto L_0x028c;
                case -1773179062: goto L_0x0281;
                case -1624396757: goto L_0x0276;
                case -1331417355: goto L_0x026b;
                case -1331417354: goto L_0x0260;
                case -1309347773: goto L_0x0255;
                case -1249348039: goto L_0x024b;
                case -1241591313: goto L_0x0240;
                case -1067273523: goto L_0x0235;
                case -995752566: goto L_0x0229;
                case -948122918: goto L_0x021d;
                case -934641255: goto L_0x0211;
                case -934426579: goto L_0x0205;
                case -759238347: goto L_0x01f9;
                case -756050293: goto L_0x01ed;
                case -696286326: goto L_0x01e1;
                case -696286120: goto L_0x01d5;
                case -679382964: goto L_0x01c9;
                case -678975813: goto L_0x01bd;
                case -402165756: goto L_0x01b1;
                case -402165208: goto L_0x01a5;
                case -391221073: goto L_0x019a;
                case -318289731: goto L_0x018e;
                case -317054497: goto L_0x0182;
                case -243128142: goto L_0x0177;
                case -212614552: goto L_0x016b;
                case -127960866: goto L_0x015f;
                case -110027141: goto L_0x0153;
                case -53272641: goto L_0x0147;
                case -32598479: goto L_0x013b;
                case -17750794: goto L_0x012f;
                case 106440182: goto L_0x0123;
                case 194959693: goto L_0x0117;
                case 336631465: goto L_0x010c;
                case 492688268: goto L_0x0100;
                case 740366903: goto L_0x00f4;
                case 817048102: goto L_0x00e8;
                case 858987473: goto L_0x00dc;
                case 1042858233: goto L_0x00d0;
                case 1076821923: goto L_0x00c5;
                case 1091267752: goto L_0x00b9;
                case 1246613238: goto L_0x00ad;
                case 1312131169: goto L_0x00a1;
                case 1520566363: goto L_0x0095;
                case 1724190684: goto L_0x008a;
                case 1729408231: goto L_0x007e;
                case 1779894764: goto L_0x0072;
                case 1810715187: goto L_0x0066;
                case 1845118384: goto L_0x005b;
                case 1845185410: goto L_0x0050;
                case 1916929588: goto L_0x0045;
                case 1925083019: goto L_0x0039;
                case 1937913574: goto L_0x002e;
                case 1965076372: goto L_0x0022;
                case 1966196898: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0297
        L_0x0017:
            java.lang.String r3 = "getTitle"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 1
            goto L_0x0298
        L_0x0022:
            java.lang.String r3 = "getScale"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 40
            goto L_0x0298
        L_0x002e:
            java.lang.String r3 = "evaluateJavascript"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 7
            goto L_0x0298
        L_0x0039:
            java.lang.String r3 = "injectJavascriptFileFromUrl"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 8
            goto L_0x0298
        L_0x0045:
            java.lang.String r3 = "findAllAsync"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = r4
            goto L_0x0298
        L_0x0050:
            java.lang.String r3 = "loadFile"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 6
            goto L_0x0298
        L_0x005b:
            java.lang.String r3 = "loadData"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 5
            goto L_0x0298
        L_0x0066:
            java.lang.String r3 = "goBackOrForward"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 16
            goto L_0x0298
        L_0x0072:
            java.lang.String r3 = "setContextMenu"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 49
            goto L_0x0298
        L_0x007e:
            java.lang.String r3 = "requestImageRef"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 51
            goto L_0x0298
        L_0x008a:
            java.lang.String r3 = "setOptions"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = r6
            goto L_0x0298
        L_0x0095:
            java.lang.String r3 = "resumeTimers"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 35
            goto L_0x0298
        L_0x00a1:
            java.lang.String r3 = "getCertificate"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 54
            goto L_0x0298
        L_0x00ad:
            java.lang.String r3 = "requestFocusNodeHref"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 50
            goto L_0x0298
        L_0x00b9:
            java.lang.String r3 = "getOriginalUrl"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 39
            goto L_0x0298
        L_0x00c5:
            java.lang.String r3 = "getProgress"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 2
            goto L_0x0298
        L_0x00d0:
            java.lang.String r3 = "clearSslPreferences"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 26
            goto L_0x0298
        L_0x00dc:
            java.lang.String r3 = "pageDown"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 43
            goto L_0x0298
        L_0x00e8:
            java.lang.String r3 = "clearMatches"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 29
            goto L_0x0298
        L_0x00f4:
            java.lang.String r3 = "injectCSSFileFromUrl"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 10
            goto L_0x0298
        L_0x0100:
            java.lang.String r3 = "getHitTestResult"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 42
            goto L_0x0298
        L_0x010c:
            java.lang.String r3 = "loadUrl"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 3
            goto L_0x0298
        L_0x0117:
            java.lang.String r3 = "takeScreenshot"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 20
            goto L_0x0298
        L_0x0123:
            java.lang.String r3 = "pause"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 32
            goto L_0x0298
        L_0x012f:
            java.lang.String r3 = "startSafeBrowsing"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 24
            goto L_0x0298
        L_0x013b:
            java.lang.String r3 = "getCopyBackForwardList"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 23
            goto L_0x0298
        L_0x0147:
            java.lang.String r3 = "injectCSSCode"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 9
            goto L_0x0298
        L_0x0153:
            java.lang.String r3 = "zoomOut"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 47
            goto L_0x0298
        L_0x015f:
            java.lang.String r3 = "getSelectedText"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 41
            goto L_0x0298
        L_0x016b:
            java.lang.String r3 = "getOptions"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 22
            goto L_0x0298
        L_0x0177:
            java.lang.String r3 = "isLoading"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = r5
            goto L_0x0298
        L_0x0182:
            java.lang.String r3 = "canGoBack"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 13
            goto L_0x0298
        L_0x018e:
            java.lang.String r3 = "goForward"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 14
            goto L_0x0298
        L_0x019a:
            java.lang.String r3 = "postUrl"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 4
            goto L_0x0298
        L_0x01a5:
            java.lang.String r3 = "scrollTo"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 30
            goto L_0x0298
        L_0x01b1:
            java.lang.String r3 = "scrollBy"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 31
            goto L_0x0298
        L_0x01bd:
            java.lang.String r3 = "printCurrentPage"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 36
            goto L_0x0298
        L_0x01c9:
            java.lang.String r3 = "findNext"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 28
            goto L_0x0298
        L_0x01d5:
            java.lang.String r3 = "zoomIn"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 46
            goto L_0x0298
        L_0x01e1:
            java.lang.String r3 = "zoomBy"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 38
            goto L_0x0298
        L_0x01ed:
            java.lang.String r3 = "clearFocus"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 48
            goto L_0x0298
        L_0x01f9:
            java.lang.String r3 = "clearCache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 25
            goto L_0x0298
        L_0x0205:
            java.lang.String r3 = "resume"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 33
            goto L_0x0298
        L_0x0211:
            java.lang.String r3 = "reload"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 11
            goto L_0x0298
        L_0x021d:
            java.lang.String r3 = "stopLoading"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 18
            goto L_0x0298
        L_0x0229:
            java.lang.String r3 = "pageUp"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 44
            goto L_0x0298
        L_0x0235:
            java.lang.String r3 = "canGoForward"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 15
            goto L_0x0298
        L_0x0240:
            java.lang.String r3 = "goBack"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 12
            goto L_0x0298
        L_0x024b:
            java.lang.String r3 = "getUrl"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 0
            goto L_0x0298
        L_0x0255:
            java.lang.String r3 = "canGoBackOrForward"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 17
            goto L_0x0298
        L_0x0260:
            java.lang.String r3 = "getScrollY"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 53
            goto L_0x0298
        L_0x026b:
            java.lang.String r3 = "getScrollX"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 52
            goto L_0x0298
        L_0x0276:
            java.lang.String r3 = "saveWebArchive"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 45
            goto L_0x0298
        L_0x0281:
            java.lang.String r3 = "getContentHeight"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 37
            goto L_0x0298
        L_0x028c:
            java.lang.String r3 = "pauseTimers"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0297
            r2 = 34
            goto L_0x0298
        L_0x0297:
            r2 = -1
        L_0x0298:
            java.lang.String r3 = "animated"
            java.lang.String r10 = "y"
            java.lang.String r11 = "x"
            java.lang.String r12 = "steps"
            java.lang.String r13 = "urlFile"
            java.lang.String r14 = "source"
            java.lang.String r15 = "headers"
            java.lang.String r8 = "url"
            r9 = 0
            switch(r2) {
                case 0: goto L_0x07bc;
                case 1: goto L_0x07b0;
                case 2: goto L_0x07a0;
                case 3: goto L_0x0786;
                case 4: goto L_0x076a;
                case 5: goto L_0x0731;
                case 6: goto L_0x0715;
                case 7: goto L_0x06fd;
                case 8: goto L_0x06e7;
                case 9: goto L_0x06d1;
                case 10: goto L_0x06bb;
                case 11: goto L_0x06ad;
                case 12: goto L_0x069f;
                case 13: goto L_0x0689;
                case 14: goto L_0x067b;
                case 15: goto L_0x0665;
                case 16: goto L_0x064d;
                case 17: goto L_0x062d;
                case 18: goto L_0x061f;
                case 19: goto L_0x0609;
                case 20: goto L_0x05fb;
                case 21: goto L_0x05db;
                case 22: goto L_0x05ce;
                case 23: goto L_0x05c1;
                case 24: goto L_0x059a;
                case 25: goto L_0x058c;
                case 26: goto L_0x057e;
                case 27: goto L_0x0566;
                case 28: goto L_0x0543;
                case 29: goto L_0x052e;
                case 30: goto L_0x050c;
                case 31: goto L_0x04ea;
                case 32: goto L_0x04d5;
                case 33: goto L_0x04c0;
                case 34: goto L_0x04ab;
                case 35: goto L_0x0496;
                case 36: goto L_0x047d;
                case 37: goto L_0x046c;
                case 38: goto L_0x0444;
                case 39: goto L_0x0437;
                case 40: goto L_0x042a;
                case 41: goto L_0x0418;
                case 42: goto L_0x03eb;
                case 43: goto L_0x03c5;
                case 44: goto L_0x039f;
                case 45: goto L_0x0376;
                case 46: goto L_0x035e;
                case 47: goto L_0x0346;
                case 48: goto L_0x0331;
                case 49: goto L_0x0313;
                case 50: goto L_0x0301;
                case 51: goto L_0x02ef;
                case 52: goto L_0x02d9;
                case 53: goto L_0x02c3;
                case 54: goto L_0x02b1;
                default: goto L_0x02ac;
            }
        L_0x02ac:
            r18.notImplemented()
            goto L_0x07c7
        L_0x02b1:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x02be
            java.util.Map r1 = r1.getCertificateMap()
            r7.success(r1)
            goto L_0x07c7
        L_0x02be:
            r7.success(r9)
            goto L_0x07c7
        L_0x02c3:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x02d4
            int r1 = r1.getScrollY()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.success(r1)
            goto L_0x07c7
        L_0x02d4:
            r7.success(r9)
            goto L_0x07c7
        L_0x02d9:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x02ea
            int r1 = r1.getScrollX()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.success(r1)
            goto L_0x07c7
        L_0x02ea:
            r7.success(r9)
            goto L_0x07c7
        L_0x02ef:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x02fc
            java.util.Map r1 = r1.mo45768G()
            r7.success(r1)
            goto L_0x07c7
        L_0x02fc:
            r7.success(r9)
            goto L_0x07c7
        L_0x0301:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x030e
            java.util.Map r1 = r1.mo45767F()
            r7.success(r1)
            goto L_0x07c7
        L_0x030e:
            r7.success(r9)
            goto L_0x07c7
        L_0x0313:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x032a
            java.lang.String r2 = "contextMenu"
            java.lang.Object r1 = r1.mo46571a(r2)
            java.util.Map r1 = (java.util.Map) r1
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            r2.f16796D = r1
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x032a:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x0331:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x033f
            r1.clearFocus()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x033f:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x0346:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x0357
            boolean r1 = r1.zoomOut()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7.success(r1)
            goto L_0x07c7
        L_0x0357:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x035e:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x036f
            boolean r1 = r1.zoomIn()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7.success(r1)
            goto L_0x07c7
        L_0x036f:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x0376:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x039a
            java.lang.String r2 = "basename"
            java.lang.Object r2 = r1.mo46571a(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "autoname"
            java.lang.Object r1 = r1.mo46571a(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r3 = r0.f8793e
            c.b0.a.i.c$b r4 = new c.b0.a.i.c$b
            r4.<init>(r0, r7)
            r3.saveWebArchive(r2, r1, r4)
            goto L_0x07c7
        L_0x039a:
            r7.success(r9)
            goto L_0x07c7
        L_0x039f:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x03be
            java.lang.String r2 = "top"
            java.lang.Object r1 = r1.mo46571a(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            boolean r1 = r2.pageUp(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7.success(r1)
            goto L_0x07c7
        L_0x03be:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x03c5:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x03e4
            java.lang.String r2 = "bottom"
            java.lang.Object r1 = r1.mo46571a(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            boolean r1 = r2.pageDown(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7.success(r1)
            goto L_0x07c7
        L_0x03e4:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x03eb:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x0413
            android.webkit.WebView$HitTestResult r1 = r1.getHitTestResult()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            int r3 = r1.getType()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "type"
            r2.put(r4, r3)
            java.lang.String r1 = r1.getExtra()
            java.lang.String r3 = "extra"
            r2.put(r3, r1)
            r7.success(r2)
            goto L_0x07c7
        L_0x0413:
            r7.success(r9)
            goto L_0x07c7
        L_0x0418:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x0425
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r5) goto L_0x0425
            r1.mo45786m(r7)
            goto L_0x07c7
        L_0x0425:
            r7.success(r9)
            goto L_0x07c7
        L_0x042a:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x0432
            java.lang.Float r9 = r1.getUpdatedScale()
        L_0x0432:
            r7.success(r9)
            goto L_0x07c7
        L_0x0437:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x043f
            java.lang.String r9 = r1.getOriginalUrl()
        L_0x043f:
            r7.success(r9)
            goto L_0x07c7
        L_0x0444:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x0465
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r6) goto L_0x0465
            java.lang.String r2 = "zoomFactor"
            java.lang.Object r1 = r1.mo46571a(r2)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r3 = r0.f8793e
            float r1 = (float) r1
            r3.zoomBy(r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x0465:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x046c:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x0478
            int r1 = r1.getContentHeight()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
        L_0x0478:
            r7.success(r9)
            goto L_0x07c7
        L_0x047d:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x048f
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r6) goto L_0x048f
            r1.mo45765D()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x048f:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x0496:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x04a4
            r1.resumeTimers()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x04a4:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x04ab:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x04b9
            r1.pauseTimers()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x04b9:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x04c0:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x04ce
            r1.onResume()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x04ce:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x04d5:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x04e3
            r1.onPause()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x04e3:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x04ea:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x0505
            java.lang.Object r2 = r1.mo46571a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r1.mo46571a(r10)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r1 = r1.mo46571a(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r3 = r0.f8793e
            r3.mo45769H(r2, r4, r1)
        L_0x0505:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x050c:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x0527
            java.lang.Object r2 = r1.mo46571a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r1.mo46571a(r10)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r1 = r1.mo46571a(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r3 = r0.f8793e
            r3.mo45770I(r2, r4, r1)
        L_0x0527:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x052e:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x053c
            r1.clearMatches()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x053c:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x0543:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x055f
            java.lang.String r2 = "forward"
            java.lang.Object r1 = r1.mo46571a(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            boolean r1 = r1.booleanValue()
            r2.findNext(r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x055f:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x0566:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x0577
            java.lang.String r2 = "find"
            java.lang.Object r1 = r1.mo46571a(r2)
            java.lang.String r1 = (java.lang.String) r1
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            r2.findAllAsync(r1)
        L_0x0577:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x057e:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x0585
            r1.clearSslPreferences()
        L_0x0585:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x058c:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x0593
            r1.mo45782h()
        L_0x0593:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x059a:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x05ba
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r4) goto L_0x05ba
            java.lang.String r1 = "START_SAFE_BROWSING"
            boolean r1 = androidx.webkit.WebViewFeature.isFeatureSupported(r1)
            if (r1 == 0) goto L_0x05ba
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            android.content.Context r1 = r1.getContext()
            c.b0.a.i.c$a r2 = new c.b0.a.i.c$a
            r2.<init>(r0, r7)
            androidx.webkit.WebViewCompat.startSafeBrowsing(r1, r2)
            goto L_0x07c7
        L_0x05ba:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x05c1:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x05c9
            java.util.HashMap r9 = r1.getCopyBackForwardList()
        L_0x05c9:
            r7.success(r9)
            goto L_0x07c7
        L_0x05ce:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x05d6
            java.util.Map r9 = r1.getOptions()
        L_0x05d6:
            r7.success(r9)
            goto L_0x07c7
        L_0x05db:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x05f4
            c.b0.a.i.g r2 = new c.b0.a.i.g
            r2.<init>()
            java.lang.String r3 = "options"
            java.lang.Object r1 = r1.mo46571a(r3)
            java.util.HashMap r1 = (java.util.HashMap) r1
            r2.mo25610c(r1)
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r3 = r0.f8793e
            r3.mo45772K(r2, r1)
        L_0x05f4:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x05fb:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x0604
            r1.mo45773L(r7)
            goto L_0x07c7
        L_0x0604:
            r7.success(r9)
            goto L_0x07c7
        L_0x0609:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x0615
            boolean r1 = r1.mo45797s()
            if (r1 == 0) goto L_0x0615
            r8 = 1
            goto L_0x0616
        L_0x0615:
            r8 = 0
        L_0x0616:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            r7.success(r1)
            goto L_0x07c7
        L_0x061f:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x0626
            r1.stopLoading()
        L_0x0626:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x062d:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x0643
            java.lang.Object r1 = r1.mo46571a(r12)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            boolean r1 = r2.canGoBackOrForward(r1)
            if (r1 == 0) goto L_0x0643
            r8 = 1
            goto L_0x0644
        L_0x0643:
            r8 = 0
        L_0x0644:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            r7.success(r1)
            goto L_0x07c7
        L_0x064d:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x065e
            java.lang.Object r1 = r1.mo46571a(r12)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.goBackOrForward(r1)
        L_0x065e:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x0665:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x0671
            boolean r1 = r1.canGoForward()
            if (r1 == 0) goto L_0x0671
            r8 = 1
            goto L_0x0672
        L_0x0671:
            r8 = 0
        L_0x0672:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            r7.success(r1)
            goto L_0x07c7
        L_0x067b:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x0682
            r1.goForward()
        L_0x0682:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x0689:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x0695
            boolean r1 = r1.canGoBack()
            if (r1 == 0) goto L_0x0695
            r8 = 1
            goto L_0x0696
        L_0x0695:
            r8 = 0
        L_0x0696:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            r7.success(r1)
            goto L_0x07c7
        L_0x069f:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x06a6
            r1.goBack()
        L_0x06a6:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x06ad:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x06b4
            r1.reload()
        L_0x06b4:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x06bb:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x06ca
            java.lang.Object r1 = r1.mo46571a(r13)
            java.lang.String r1 = (java.lang.String) r1
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            r2.mo45793p(r1)
        L_0x06ca:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x06d1:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x06e0
            java.lang.Object r1 = r1.mo46571a(r14)
            java.lang.String r1 = (java.lang.String) r1
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            r2.mo45788o(r1)
        L_0x06e0:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x06e7:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x06f6
            java.lang.Object r1 = r1.mo46571a(r13)
            java.lang.String r1 = (java.lang.String) r1
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            r2.mo45795r(r1)
        L_0x06f6:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.success(r1)
            goto L_0x07c7
        L_0x06fd:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x070e
            java.lang.Object r1 = r1.mo46571a(r14)
            java.lang.String r1 = (java.lang.String) r1
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            r2.mo45784j(r1, r7)
            goto L_0x07c7
        L_0x070e:
            java.lang.String r1 = ""
            r7.success(r1)
            goto L_0x07c7
        L_0x0715:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x072a
            java.lang.Object r3 = r1.mo46571a(r8)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.mo46571a(r15)
            java.util.Map r1 = (java.util.Map) r1
            r2.mo45805v(r3, r1, r7)
            goto L_0x07c7
        L_0x072a:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x0731:
            java.lang.String r2 = "data"
            java.lang.Object r2 = r1.mo46571a(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "mimeType"
            java.lang.Object r3 = r1.mo46571a(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "encoding"
            java.lang.Object r4 = r1.mo46571a(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "baseUrl"
            java.lang.Object r5 = r1.mo46571a(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "historyUrl"
            java.lang.Object r1 = r1.mo46571a(r6)
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x0764
            r7 = r18
            r1.mo45803t(r2, r3, r4, r5, r6, r7)
            goto L_0x07c7
        L_0x0764:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x076a:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x0780
            java.lang.Object r3 = r1.mo46571a(r8)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "postData"
            java.lang.Object r1 = r1.mo46571a(r4)
            byte[] r1 = (byte[]) r1
            r2.mo45763B(r3, r1, r7)
            goto L_0x07c7
        L_0x0780:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x0786:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r2 = r0.f8793e
            if (r2 == 0) goto L_0x079a
            java.lang.Object r3 = r1.mo46571a(r8)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.mo46571a(r15)
            java.util.Map r1 = (java.util.Map) r1
            r2.mo45807x(r3, r1, r7)
            goto L_0x07c7
        L_0x079a:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.success(r1)
            goto L_0x07c7
        L_0x07a0:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x07ac
            int r1 = r1.getProgress()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
        L_0x07ac:
            r7.success(r9)
            goto L_0x07c7
        L_0x07b0:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x07b8
            java.lang.String r9 = r1.getTitle()
        L_0x07b8:
            r7.success(r9)
            goto L_0x07c7
        L_0x07bc:
            com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView r1 = r0.f8793e
            if (r1 == 0) goto L_0x07c4
            java.lang.String r9 = r1.getUrl()
        L_0x07c4:
            r7.success(r9)
        L_0x07c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p313b0.p314a.p319i.C4171c.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }
}
