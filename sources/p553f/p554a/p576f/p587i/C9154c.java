package p553f.p554a.p576f.p587i;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.hisense.connect_life.core.global.HtmlPaths;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p575e.C9055e;

/* renamed from: f.a.f.i.c */
/* compiled from: FlutterWebView */
public class C9154c implements C9055e, C9017j.C9021c {

    /* renamed from: e */
    public final C9160e f17931e;

    /* renamed from: l */
    public final C9017j f17932l;

    /* renamed from: m */
    public final C9156d f17933m = new C9156d(this.f17932l);

    /* renamed from: n */
    public final Handler f17934n;

    /* renamed from: f.a.f.i.c$a */
    /* compiled from: FlutterWebView */
    public class C9155a implements ValueCallback<String> {

        /* renamed from: a */
        public final /* synthetic */ C9017j.C9022d f17935a;

        public C9155a(C9154c cVar, C9017j.C9022d dVar) {
            this.f17935a = dVar;
        }

        /* renamed from: a */
        public void onReceiveValue(String str) {
            this.f17935a.success(str);
        }
    }

    @TargetApi(17)
    public C9154c(Context context, C9003c cVar, int i, Map<String, Object> map, View view) {
        C9150a aVar = new C9150a();
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        aVar.mo46882b(displayManager);
        this.f17931e = new C9160e(context, view);
        aVar.mo46881a(displayManager);
        this.f17934n = new Handler(context.getMainLooper());
        this.f17931e.getSettings().setDomStorageEnabled(true);
        this.f17931e.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        C9017j jVar = new C9017j(cVar, "plugins.flutter.io/webview_" + i);
        this.f17932l = jVar;
        jVar.mo46575e(this);
        mo46890b((Map) map.get(HtmlPaths.DEVICE_SETTINGS));
        if (map.containsKey("javascriptChannelNames")) {
            mo46902n((List) map.get("javascriptChannelNames"));
        }
        mo46907s(((Integer) map.get("autoMediaPlaybackPolicy")).intValue());
        if (map.containsKey("userAgent")) {
            mo46910v((String) map.get("userAgent"));
        }
        if (map.containsKey("initialUrl")) {
            this.f17931e.loadUrl((String) map.get("initialUrl"));
        }
    }

    /* renamed from: a */
    public final void mo46889a(C9016i iVar, C9017j.C9022d dVar) {
        mo46902n((List) iVar.f17688b);
        dVar.success((Object) null);
    }

    /* renamed from: b */
    public final void mo46890b(Map<String, Object> map) {
        for (String next : map.keySet()) {
            char c = 65535;
            switch (next.hashCode()) {
                case -1151668596:
                    if (next.equals("jsMode")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1069908877:
                    if (next.equals("debuggingEnabled")) {
                        c = 2;
                        break;
                    }
                    break;
                case 311430650:
                    if (next.equals("userAgent")) {
                        c = 4;
                        break;
                    }
                    break;
                case 858297331:
                    if (next.equals("hasNavigationDelegate")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1670862916:
                    if (next.equals("gestureNavigationEnabled")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                mo46908t(((Integer) map.get(next)).intValue());
            } else if (c == 1) {
                this.f17931e.setWebViewClient(this.f17933m.mo46913f(((Boolean) map.get(next)).booleanValue()));
            } else if (c == 2) {
                WebView.setWebContentsDebuggingEnabled(((Boolean) map.get(next)).booleanValue());
            } else if (c == 3) {
                continue;
            } else if (c == 4) {
                mo46910v((String) map.get(next));
            } else {
                throw new IllegalArgumentException("Unknown WebView setting: " + next);
            }
        }
    }

    /* renamed from: c */
    public final void mo46891c(C9017j.C9022d dVar) {
        dVar.success(Boolean.valueOf(this.f17931e.canGoBack()));
    }

    /* renamed from: d */
    public final void mo46892d(C9017j.C9022d dVar) {
        dVar.success(Boolean.valueOf(this.f17931e.canGoForward()));
    }

    public void dispose() {
        this.f17932l.mo46575e((C9017j.C9021c) null);
        this.f17931e.mo46934b();
        this.f17931e.destroy();
    }

    /* renamed from: e */
    public final void mo46893e(C9017j.C9022d dVar) {
        this.f17931e.clearCache(true);
        WebStorage.getInstance().deleteAllData();
        dVar.success((Object) null);
    }

    /* renamed from: f */
    public final void mo46894f(C9017j.C9022d dVar) {
        dVar.success(this.f17931e.getUrl());
    }

    @TargetApi(19)
    /* renamed from: g */
    public final void mo46895g(C9016i iVar, C9017j.C9022d dVar) {
        String str = (String) iVar.f17688b;
        if (str != null) {
            this.f17931e.evaluateJavascript(str, new C9155a(this, dVar));
            return;
        }
        throw new UnsupportedOperationException("JavaScript string cannot be null");
    }

    public View getView() {
        return this.f17931e;
    }

    /* renamed from: h */
    public final void mo46896h(C9017j.C9022d dVar) {
        dVar.success(Integer.valueOf(this.f17931e.getScrollX()));
    }

    /* renamed from: i */
    public final void mo46897i(C9017j.C9022d dVar) {
        dVar.success(Integer.valueOf(this.f17931e.getScrollY()));
    }

    /* renamed from: j */
    public final void mo46898j(C9017j.C9022d dVar) {
        dVar.success(this.f17931e.getTitle());
    }

    /* renamed from: k */
    public final void mo46899k(C9017j.C9022d dVar) {
        if (this.f17931e.canGoBack()) {
            this.f17931e.goBack();
        }
        dVar.success((Object) null);
    }

    /* renamed from: l */
    public final void mo46900l(C9017j.C9022d dVar) {
        if (this.f17931e.canGoForward()) {
            this.f17931e.goForward();
        }
        dVar.success((Object) null);
    }

    /* renamed from: m */
    public final void mo46901m(C9016i iVar, C9017j.C9022d dVar) {
        Map map = (Map) iVar.f17688b;
        String str = (String) map.get("url");
        Map map2 = (Map) map.get("headers");
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        this.f17931e.loadUrl(str, map2);
        dVar.success((Object) null);
    }

    /* renamed from: n */
    public final void mo46902n(List<String> list) {
        for (String next : list) {
            this.f17931e.addJavascriptInterface(new C9162f(this.f17932l, next, this.f17934n), next);
        }
    }

    /* renamed from: o */
    public final void mo46903o(C9017j.C9022d dVar) {
        this.f17931e.reload();
        dVar.success((Object) null);
    }

    public void onFlutterViewAttached(View view) {
        this.f17931e.mo46940f(view);
    }

    public void onFlutterViewDetached() {
        this.f17931e.mo46940f((View) null);
    }

    public void onInputConnectionLocked() {
        this.f17931e.mo46938d();
    }

    public void onInputConnectionUnlocked() {
        this.f17931e.mo46942h();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r3, p553f.p554a.p570e.p571a.C9017j.C9022d r4) {
        /*
            r2 = this;
            java.lang.String r0 = r3.f17687a
            int r1 = r0.hashCode()
            switch(r1) {
                case -1990164468: goto L_0x00bb;
                case -1707388194: goto L_0x00b0;
                case -1331417355: goto L_0x00a5;
                case -1331417354: goto L_0x009a;
                case -1241591313: goto L_0x0090;
                case -1088982730: goto L_0x0086;
                case -1067273523: goto L_0x007c;
                case -934641255: goto L_0x0072;
                case -759238347: goto L_0x0067;
                case -402165756: goto L_0x005c;
                case -402165208: goto L_0x0050;
                case -318289731: goto L_0x0045;
                case -317054497: goto L_0x003a;
                case 336631465: goto L_0x002f;
                case 651673601: goto L_0x0023;
                case 1937913574: goto L_0x0017;
                case 1966196898: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x00c5
        L_0x000b:
            java.lang.String r1 = "getTitle"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 12
            goto L_0x00c6
        L_0x0017:
            java.lang.String r1 = "evaluateJavascript"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 8
            goto L_0x00c6
        L_0x0023:
            java.lang.String r1 = "removeJavascriptChannels"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 10
            goto L_0x00c6
        L_0x002f:
            java.lang.String r1 = "loadUrl"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 0
            goto L_0x00c6
        L_0x003a:
            java.lang.String r1 = "canGoBack"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 2
            goto L_0x00c6
        L_0x0045:
            java.lang.String r1 = "goForward"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 5
            goto L_0x00c6
        L_0x0050:
            java.lang.String r1 = "scrollTo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 13
            goto L_0x00c6
        L_0x005c:
            java.lang.String r1 = "scrollBy"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 14
            goto L_0x00c6
        L_0x0067:
            java.lang.String r1 = "clearCache"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 11
            goto L_0x00c6
        L_0x0072:
            java.lang.String r1 = "reload"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 6
            goto L_0x00c6
        L_0x007c:
            java.lang.String r1 = "canGoForward"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 3
            goto L_0x00c6
        L_0x0086:
            java.lang.String r1 = "currentUrl"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 7
            goto L_0x00c6
        L_0x0090:
            java.lang.String r1 = "goBack"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 4
            goto L_0x00c6
        L_0x009a:
            java.lang.String r1 = "getScrollY"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 16
            goto L_0x00c6
        L_0x00a5:
            java.lang.String r1 = "getScrollX"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 15
            goto L_0x00c6
        L_0x00b0:
            java.lang.String r1 = "addJavascriptChannels"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 9
            goto L_0x00c6
        L_0x00bb:
            java.lang.String r1 = "updateSettings"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 1
            goto L_0x00c6
        L_0x00c5:
            r0 = -1
        L_0x00c6:
            switch(r0) {
                case 0: goto L_0x010d;
                case 1: goto L_0x0109;
                case 2: goto L_0x0105;
                case 3: goto L_0x0101;
                case 4: goto L_0x00fd;
                case 5: goto L_0x00f9;
                case 6: goto L_0x00f5;
                case 7: goto L_0x00f1;
                case 8: goto L_0x00ed;
                case 9: goto L_0x00e9;
                case 10: goto L_0x00e5;
                case 11: goto L_0x00e1;
                case 12: goto L_0x00dd;
                case 13: goto L_0x00d9;
                case 14: goto L_0x00d5;
                case 15: goto L_0x00d1;
                case 16: goto L_0x00cd;
                default: goto L_0x00c9;
            }
        L_0x00c9:
            r4.notImplemented()
            goto L_0x0110
        L_0x00cd:
            r2.mo46897i(r4)
            goto L_0x0110
        L_0x00d1:
            r2.mo46896h(r4)
            goto L_0x0110
        L_0x00d5:
            r2.mo46905q(r3, r4)
            goto L_0x0110
        L_0x00d9:
            r2.mo46906r(r3, r4)
            goto L_0x0110
        L_0x00dd:
            r2.mo46898j(r4)
            goto L_0x0110
        L_0x00e1:
            r2.mo46893e(r4)
            goto L_0x0110
        L_0x00e5:
            r2.mo46904p(r3, r4)
            goto L_0x0110
        L_0x00e9:
            r2.mo46889a(r3, r4)
            goto L_0x0110
        L_0x00ed:
            r2.mo46895g(r3, r4)
            goto L_0x0110
        L_0x00f1:
            r2.mo46894f(r4)
            goto L_0x0110
        L_0x00f5:
            r2.mo46903o(r4)
            goto L_0x0110
        L_0x00f9:
            r2.mo46900l(r4)
            goto L_0x0110
        L_0x00fd:
            r2.mo46899k(r4)
            goto L_0x0110
        L_0x0101:
            r2.mo46892d(r4)
            goto L_0x0110
        L_0x0105:
            r2.mo46891c(r4)
            goto L_0x0110
        L_0x0109:
            r2.mo46909u(r3, r4)
            goto L_0x0110
        L_0x010d:
            r2.mo46901m(r3, r4)
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p554a.p576f.p587i.C9154c.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }

    /* renamed from: p */
    public final void mo46904p(C9016i iVar, C9017j.C9022d dVar) {
        for (String removeJavascriptInterface : (List) iVar.f17688b) {
            this.f17931e.removeJavascriptInterface(removeJavascriptInterface);
        }
        dVar.success((Object) null);
    }

    /* renamed from: q */
    public final void mo46905q(C9016i iVar, C9017j.C9022d dVar) {
        Map map = (Map) iVar.f17688b;
        this.f17931e.scrollBy(((Integer) map.get("x")).intValue(), ((Integer) map.get("y")).intValue());
        dVar.success((Object) null);
    }

    /* renamed from: r */
    public final void mo46906r(C9016i iVar, C9017j.C9022d dVar) {
        Map map = (Map) iVar.f17688b;
        this.f17931e.scrollTo(((Integer) map.get("x")).intValue(), ((Integer) map.get("y")).intValue());
        dVar.success((Object) null);
    }

    /* renamed from: s */
    public final void mo46907s(int i) {
        boolean z = true;
        if (i == 1) {
            z = false;
        }
        this.f17931e.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    /* renamed from: t */
    public final void mo46908t(int i) {
        if (i == 0) {
            this.f17931e.getSettings().setJavaScriptEnabled(false);
        } else if (i == 1) {
            this.f17931e.getSettings().setJavaScriptEnabled(true);
        } else {
            throw new IllegalArgumentException("Trying to set unknown JavaScript mode: " + i);
        }
    }

    /* renamed from: u */
    public final void mo46909u(C9016i iVar, C9017j.C9022d dVar) {
        mo46890b((Map) iVar.f17688b);
        dVar.success((Object) null);
    }

    /* renamed from: v */
    public final void mo46910v(String str) {
        this.f17931e.getSettings().setUserAgentString(str);
    }
}
