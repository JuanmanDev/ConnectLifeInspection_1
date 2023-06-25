package com.gigya.android.sdk.p309ui.plugin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.gigya.android.sdk.network.adapter.RestAdapter;
import com.gigya.android.sdk.p309ui.plugin.GigyaPluginFragment;
import com.google.gson.Gson;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.HtmlPaths;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import p040c.p151o.p152a.p153a.C2098a;
import p040c.p151o.p152a.p153a.C2101d;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.C2104g;
import p040c.p151o.p152a.p153a.C2105h;
import p040c.p151o.p152a.p153a.p154i.C2107b;
import p040c.p151o.p152a.p153a.p154i.p155d.C2109a;
import p040c.p151o.p152a.p153a.p156j.C2125e;
import p040c.p151o.p152a.p153a.p156j.C2128h;
import p040c.p151o.p152a.p153a.p164n.C2148a;
import p040c.p151o.p152a.p153a.p167p.C2155a;
import p040c.p151o.p152a.p153a.p171s.C2184a;
import p040c.p151o.p152a.p153a.p171s.C2185b;
import p040c.p151o.p152a.p153a.p171s.C2186c;
import p040c.p151o.p152a.p153a.p172t.p173c.C2192a;
import p040c.p151o.p152a.p153a.p172t.p173c.C2197f;
import p040c.p151o.p152a.p153a.p174u.C2204e;
import p040c.p151o.p152a.p153a.p174u.C2207h;

/* renamed from: com.gigya.android.sdk.ui.plugin.GigyaWebBridge */
public class GigyaWebBridge<A extends C2109a> implements C2197f<A> {

    /* renamed from: a */
    public final Context f7232a;

    /* renamed from: b */
    public final C2098a f7233b;

    /* renamed from: c */
    public final C2184a f7234c;

    /* renamed from: d */
    public final C2128h<A> f7235d;

    /* renamed from: e */
    public final C2107b<A> f7236e;

    /* renamed from: f */
    public final C2185b f7237f;

    /* renamed from: g */
    public final C2155a f7238g;

    /* renamed from: h */
    public GigyaPluginFragment.C3962d<A> f7239h;

    /* renamed from: i */
    public boolean f7240i;

    /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaWebBridge$Feature */
    public enum Feature {
        IS_SESSION_VALID("IS_SESSION_VALID"),
        SEND_REQUEST("SEND_REQUEST"),
        SEND_OAUTH_REQUEST("SEND_OAUTH_REQUEST"),
        GET_IDS("GET_IDS"),
        ON_PLUGIN_EVENT("ON_PLUGIN_EVENT"),
        ON_CUSTOM_EVENT("ON_CUSTOM_EVENT"),
        REGISTER_FOR_NAMESPACE_EVENTS("REGISTER_FOR_NAMESPACE_EVENTS"),
        ON_JS_EXCEPTION("ON_JS_EXCEPTION");
        
        public String value;

        /* access modifiers changed from: public */
        Feature(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }

        @NonNull
        public String toString() {
            return getValue();
        }
    }

    /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaWebBridge$a */
    public class C3963a extends C2104g<A> {

        /* renamed from: a */
        public final /* synthetic */ String f7241a;

        public C3963a(String str) {
            this.f7241a = str;
        }

        /* renamed from: a */
        public void mo16860a(C2148a aVar) {
            GigyaWebBridge.this.mo23458t(this.f7241a, aVar.mo16955f());
        }

        /* renamed from: c */
        public void mo16862c() {
            GigyaWebBridge.this.mo23458t(this.f7241a, C2148a.m3190b().mo16955f());
            if (GigyaWebBridge.this.f7239h != null) {
                GigyaWebBridge.this.f7239h.mo23448b("canceled", null);
            }
        }

        /* renamed from: k */
        public void mo16863d(A a) {
            C2103f.m3056b("GigyaWebBridge", "sendOAuthRequest: onSuccess with:\n" + a.toString());
            GigyaWebBridge.this.mo23458t(this.f7241a, "{\"errorCode\":" + a.mo16954a() + ",\"userInfo\":" + new Gson().toJson((Object) a) + "}");
            if (GigyaWebBridge.this.f7239h != null) {
                GigyaWebBridge.this.f7239h.mo23448b(EventBusConstKt.LOGIN, a);
            }
        }
    }

    /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaWebBridge$b */
    public class C3964b extends C2101d<C2125e> {

        /* renamed from: a */
        public final /* synthetic */ String f7243a;

        public C3964b(String str) {
            this.f7243a = str;
        }

        /* renamed from: a */
        public void mo16860a(C2148a aVar) {
            GigyaWebBridge.this.mo23458t(this.f7243a, aVar.mo16955f());
        }

        /* renamed from: e */
        public void mo16863d(C2125e eVar) {
            if (eVar.mo16924d() == 0) {
                if (eVar.mo16922b("sessionInfo.sessionSecret")) {
                    C2109a aVar = (C2109a) eVar.mo16927g(GigyaWebBridge.this.f7236e.mo16892h());
                    GigyaWebBridge.this.f7234c.mo17020d((C2186c) eVar.mo16926f("sessionInfo", C2186c.class));
                    GigyaWebBridge.this.f7236e.mo16893i(eVar.mo16921a());
                    if (GigyaWebBridge.this.f7239h != null) {
                        GigyaWebBridge.this.f7239h.mo23448b(EventBusConstKt.LOGIN, aVar);
                    }
                }
                GigyaWebBridge.this.mo23458t(this.f7243a, eVar.mo16921a());
                return;
            }
            mo16860a(C2148a.m3192d(eVar));
        }
    }

    /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaWebBridge$c */
    public class C3965c extends C2101d<C2125e> {

        /* renamed from: a */
        public final /* synthetic */ String f7245a;

        public C3965c(String str) {
            this.f7245a = str;
        }

        /* renamed from: a */
        public void mo16860a(C2148a aVar) {
            GigyaWebBridge.this.mo23458t(this.f7245a, aVar.mo16955f());
        }

        /* renamed from: e */
        public void mo16863d(C2125e eVar) {
            if (eVar.mo16924d() == 0) {
                GigyaWebBridge.this.mo23458t(this.f7245a, eVar.mo16921a());
                if (GigyaWebBridge.this.f7239h != null) {
                    GigyaWebBridge.this.f7239h.mo23448b("logout", null);
                }
                GigyaWebBridge.this.f7234c.mo17021e();
                GigyaWebBridge.this.f7234c.mo17019c(true);
                GigyaWebBridge.this.f7238g.mo16976a();
                GigyaWebBridge.this.f7237f.stop();
                GigyaWebBridge.this.mo23453o();
                return;
            }
            mo16860a(C2148a.m3192d(eVar));
        }
    }

    /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaWebBridge$d */
    public class C3966d extends C2101d<C2125e> {

        /* renamed from: a */
        public final /* synthetic */ String f7247a;

        public C3966d(String str) {
            this.f7247a = str;
        }

        /* renamed from: a */
        public void mo16860a(C2148a aVar) {
            GigyaWebBridge.this.mo23458t(this.f7247a, aVar.mo16955f());
        }

        /* renamed from: e */
        public void mo16863d(C2125e eVar) {
            if (eVar.mo16924d() == 0) {
                GigyaWebBridge.this.mo23458t(this.f7247a, eVar.mo16921a());
                if (GigyaWebBridge.this.f7239h != null) {
                    GigyaWebBridge.this.f7239h.mo23448b("removeConnection", null);
                    return;
                }
                return;
            }
            mo16860a(C2148a.m3192d(eVar));
        }
    }

    /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaWebBridge$e */
    public class C3967e extends C2104g<A> {

        /* renamed from: a */
        public final /* synthetic */ String f7249a;

        public C3967e(String str) {
            this.f7249a = str;
        }

        /* renamed from: a */
        public void mo16860a(C2148a aVar) {
            GigyaWebBridge.this.mo23458t(this.f7249a, aVar.mo16955f());
        }

        /* renamed from: k */
        public void mo16863d(A a) {
            GigyaWebBridge.this.mo23456r(this.f7249a);
            if (GigyaWebBridge.this.f7239h != null) {
                GigyaWebBridge.this.f7239h.mo23448b("addConnection", a);
            }
        }
    }

    /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaWebBridge$f */
    public class C3968f extends C2101d<C2125e> {

        /* renamed from: a */
        public final /* synthetic */ String f7251a;

        public C3968f(String str) {
            this.f7251a = str;
        }

        /* renamed from: a */
        public void mo16860a(C2148a aVar) {
            GigyaWebBridge.this.mo23458t(this.f7251a, aVar.mo16955f());
        }

        /* renamed from: e */
        public void mo16863d(C2125e eVar) {
            GigyaWebBridge.this.mo23458t(this.f7251a, eVar.mo16921a());
        }
    }

    /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaWebBridge$g */
    public class C3969g {
        public C3969g() {
        }

        @JavascriptInterface
        public String getAPIKey() {
            return GigyaWebBridge.this.f7233b.mo16854c();
        }

        @JavascriptInterface
        public String getAdapterName() {
            return "mobile";
        }

        @JavascriptInterface
        public String getFeatures() {
            JSONArray jSONArray = new JSONArray();
            for (Feature feature : Feature.values()) {
                jSONArray.put(feature.toString().toLowerCase(Locale.ENGLISH));
            }
            return jSONArray.toString();
        }

        @JavascriptInterface
        public String getObfuscationStrategy() {
            return GigyaWebBridge.this.f7240i ? "base64" : "";
        }

        @JavascriptInterface
        public boolean sendToMobile(String str, String str2, String str3) {
            return GigyaWebBridge.this.mo23457s(str, str2, str3);
        }
    }

    /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h */
    public class C3970h implements GigyaPluginFragment.C3962d<A> {

        /* renamed from: a */
        public final /* synthetic */ WebView f7254a;

        /* renamed from: b */
        public final /* synthetic */ View f7255b;

        /* renamed from: c */
        public final /* synthetic */ C2105h f7256c;

        /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h$a */
        public class C3971a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ String f7257e;

            /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h$a$a */
            public class C3972a implements ValueCallback<String> {
                public C3972a(C3971a aVar) {
                }

                /* renamed from: a */
                public void onReceiveValue(String str) {
                    C2103f.m3056b("evaluateJavascript Callback", str);
                }
            }

            public C3971a(String str) {
                this.f7257e = str;
            }

            public void run() {
                if (Build.VERSION.SDK_INT > 18) {
                    C3970h.this.f7254a.evaluateJavascript(this.f7257e, new C3972a(this));
                } else {
                    C3970h.this.f7254a.loadUrl(this.f7257e);
                }
            }
        }

        /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h$b */
        public class C3973b implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ String f7259e;

            /* renamed from: l */
            public final /* synthetic */ C2192a f7260l;

            public C3973b(String str, C2192a aVar) {
                this.f7259e = str;
                this.f7260l = aVar;
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r4 = this;
                    java.lang.String r0 = r4.f7259e
                    int r1 = r0.hashCode()
                    r2 = 0
                    r3 = 4
                    switch(r1) {
                        case -1076237231: goto L_0x0075;
                        case -891535336: goto L_0x006b;
                        case -759422354: goto L_0x0061;
                        case -702197416: goto L_0x0057;
                        case -385382539: goto L_0x004d;
                        case 3202370: goto L_0x0042;
                        case 3327206: goto L_0x0038;
                        case 75993207: goto L_0x002e;
                        case 96784904: goto L_0x0023;
                        case 227237140: goto L_0x0018;
                        case 866593882: goto L_0x000d;
                        default: goto L_0x000b;
                    }
                L_0x000b:
                    goto L_0x007f
                L_0x000d:
                    java.lang.String r1 = "fieldChanged"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x007f
                    r0 = 3
                    goto L_0x0080
                L_0x0018:
                    java.lang.String r1 = "afterSubmit"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x007f
                    r0 = 8
                    goto L_0x0080
                L_0x0023:
                    java.lang.String r1 = "error"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x007f
                    r0 = 10
                    goto L_0x0080
                L_0x002e:
                    java.lang.String r1 = "beforeSubmit"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x007f
                    r0 = 6
                    goto L_0x0080
                L_0x0038:
                    java.lang.String r1 = "load"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x007f
                    r0 = 1
                    goto L_0x0080
                L_0x0042:
                    java.lang.String r1 = "hide"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x007f
                    r0 = 9
                    goto L_0x0080
                L_0x004d:
                    java.lang.String r1 = "afterValidation"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x007f
                    r0 = 5
                    goto L_0x0080
                L_0x0057:
                    java.lang.String r1 = "beforeValidation"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x007f
                    r0 = r3
                    goto L_0x0080
                L_0x0061:
                    java.lang.String r1 = "afterScreenLoad"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x007f
                    r0 = 2
                    goto L_0x0080
                L_0x006b:
                    java.lang.String r1 = "submit"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x007f
                    r0 = 7
                    goto L_0x0080
                L_0x0075:
                    java.lang.String r1 = "beforeScreenLoad"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x007f
                    r0 = r2
                    goto L_0x0080
                L_0x007f:
                    r0 = -1
                L_0x0080:
                    switch(r0) {
                        case 0: goto L_0x0102;
                        case 1: goto L_0x00f8;
                        case 2: goto L_0x00e5;
                        case 3: goto L_0x00db;
                        case 4: goto L_0x00d1;
                        case 5: goto L_0x00c7;
                        case 6: goto L_0x00bd;
                        case 7: goto L_0x00b3;
                        case 8: goto L_0x00a9;
                        case 9: goto L_0x0090;
                        case 10: goto L_0x0085;
                        default: goto L_0x0083;
                    }
                L_0x0083:
                    goto L_0x0114
                L_0x0085:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    c.o.a.a.h r0 = r0.f7256c
                    c.o.a.a.t.c.a r1 = r4.f7260l
                    r0.mo16881j(r1)
                    goto L_0x0114
                L_0x0090:
                    c.o.a.a.t.c.a r0 = r4.f7260l
                    java.util.Map r0 = r0.mo17035b()
                    java.lang.String r1 = "reason"
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.String r0 = (java.lang.String) r0
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r1 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    c.o.a.a.h r1 = r1.f7256c
                    c.o.a.a.t.c.a r2 = r4.f7260l
                    r1.mo16883l(r2, r0)
                    goto L_0x0114
                L_0x00a9:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    c.o.a.a.h r0 = r0.f7256c
                    c.o.a.a.t.c.a r1 = r4.f7260l
                    r0.mo16873b(r1)
                    goto L_0x0114
                L_0x00b3:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    c.o.a.a.h r0 = r0.f7256c
                    c.o.a.a.t.c.a r1 = r4.f7260l
                    r0.mo16886o(r1)
                    goto L_0x0114
                L_0x00bd:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    c.o.a.a.h r0 = r0.f7256c
                    c.o.a.a.t.c.a r1 = r4.f7260l
                    r0.mo16876e(r1)
                    goto L_0x0114
                L_0x00c7:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    c.o.a.a.h r0 = r0.f7256c
                    c.o.a.a.t.c.a r1 = r4.f7260l
                    r0.mo16874c(r1)
                    goto L_0x0114
                L_0x00d1:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    c.o.a.a.h r0 = r0.f7256c
                    c.o.a.a.t.c.a r1 = r4.f7260l
                    r0.mo16877f(r1)
                    goto L_0x0114
                L_0x00db:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    c.o.a.a.h r0 = r0.f7256c
                    c.o.a.a.t.c.a r1 = r4.f7260l
                    r0.mo16882k(r1)
                    goto L_0x0114
                L_0x00e5:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    android.view.View r0 = r0.f7255b
                    if (r0 == 0) goto L_0x00ee
                    r0.setVisibility(r3)
                L_0x00ee:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    c.o.a.a.h r0 = r0.f7256c
                    c.o.a.a.t.c.a r1 = r4.f7260l
                    r0.mo16872a(r1)
                    goto L_0x0114
                L_0x00f8:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    android.view.View r0 = r0.f7255b
                    if (r0 == 0) goto L_0x0114
                    r0.setVisibility(r3)
                    goto L_0x0114
                L_0x0102:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    android.view.View r0 = r0.f7255b
                    if (r0 == 0) goto L_0x010b
                    r0.setVisibility(r2)
                L_0x010b:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    c.o.a.a.h r0 = r0.f7256c
                    c.o.a.a.t.c.a r1 = r4.f7260l
                    r0.mo16875d(r1)
                L_0x0114:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.C3973b.run():void");
            }
        }

        /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h$c */
        public class C3974c implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ String f7262e;

            /* renamed from: l */
            public final /* synthetic */ C2109a f7263l;

            public C3974c(String str, C2109a aVar) {
                this.f7262e = str;
                this.f7263l = aVar;
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r8 = this;
                    java.lang.String r0 = r8.f7262e
                    int r1 = r0.hashCode()
                    r2 = 0
                    r3 = 5
                    r4 = 3
                    r5 = 2
                    r6 = 1
                    r7 = 4
                    switch(r1) {
                        case -1097329270: goto L_0x0042;
                        case -755614113: goto L_0x0038;
                        case -531407445: goto L_0x002e;
                        case -123173735: goto L_0x0024;
                        case 103149417: goto L_0x001a;
                        case 259489410: goto L_0x0010;
                        default: goto L_0x000f;
                    }
                L_0x000f:
                    goto L_0x004c
                L_0x0010:
                    java.lang.String r1 = "removeConnection"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x004c
                    r0 = r7
                    goto L_0x004d
                L_0x001a:
                    java.lang.String r1 = "login"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x004c
                    r0 = r6
                    goto L_0x004d
                L_0x0024:
                    java.lang.String r1 = "canceled"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x004c
                    r0 = r3
                    goto L_0x004d
                L_0x002e:
                    java.lang.String r1 = "login_started"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x004c
                    r0 = r2
                    goto L_0x004d
                L_0x0038:
                    java.lang.String r1 = "addConnection"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x004c
                    r0 = r4
                    goto L_0x004d
                L_0x0042:
                    java.lang.String r1 = "logout"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x004c
                    r0 = r5
                    goto L_0x004d
                L_0x004c:
                    r0 = -1
                L_0x004d:
                    if (r0 == 0) goto L_0x0098
                    if (r0 == r6) goto L_0x0083
                    if (r0 == r5) goto L_0x007b
                    if (r0 == r4) goto L_0x0073
                    if (r0 == r7) goto L_0x006b
                    if (r0 == r3) goto L_0x005a
                    goto L_0x00a1
                L_0x005a:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    android.view.View r0 = r0.f7255b
                    if (r0 == 0) goto L_0x0063
                    r0.setVisibility(r7)
                L_0x0063:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    c.o.a.a.h r0 = r0.f7256c
                    r0.mo16878g()
                    goto L_0x00a1
                L_0x006b:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    c.o.a.a.h r0 = r0.f7256c
                    r0.mo16880i()
                    goto L_0x00a1
                L_0x0073:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    c.o.a.a.h r0 = r0.f7256c
                    r0.mo16879h()
                    goto L_0x00a1
                L_0x007b:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    c.o.a.a.h r0 = r0.f7256c
                    r0.mo16885n()
                    goto L_0x00a1
                L_0x0083:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    android.view.View r0 = r0.f7255b
                    if (r0 == 0) goto L_0x008c
                    r0.setVisibility(r7)
                L_0x008c:
                    c.o.a.a.i.d.a r0 = r8.f7263l
                    if (r0 == 0) goto L_0x00a1
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r1 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    c.o.a.a.h r1 = r1.f7256c
                    r1.mo16884m(r0)
                    goto L_0x00a1
                L_0x0098:
                    com.gigya.android.sdk.ui.plugin.GigyaWebBridge$h r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.this
                    android.view.View r0 = r0.f7255b
                    if (r0 == 0) goto L_0x00a1
                    r0.setVisibility(r2)
                L_0x00a1:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3970h.C3974c.run():void");
            }
        }

        public C3970h(GigyaWebBridge gigyaWebBridge, WebView webView, View view, C2105h hVar) {
            this.f7254a = webView;
            this.f7255b = view;
            this.f7256c = hVar;
        }

        /* renamed from: a */
        public void mo23447a(C2192a aVar, String str) {
            String a = aVar.mo17034a();
            if (a != null) {
                this.f7254a.post(new C3973b(a, aVar));
            }
        }

        /* renamed from: b */
        public void mo23448b(String str, @Nullable A a) {
            this.f7254a.post(new C3974c(str, a));
        }

        /* renamed from: c */
        public void mo23449c(String str) {
            this.f7254a.post(new C3971a(str));
        }
    }

    /* renamed from: com.gigya.android.sdk.ui.plugin.GigyaWebBridge$i */
    public static /* synthetic */ class C3975i {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7265a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.gigya.android.sdk.ui.plugin.GigyaWebBridge$Feature[] r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.Feature.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7265a = r0
                com.gigya.android.sdk.ui.plugin.GigyaWebBridge$Feature r1 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.Feature.GET_IDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7265a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.gigya.android.sdk.ui.plugin.GigyaWebBridge$Feature r1 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.Feature.IS_SESSION_VALID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7265a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.gigya.android.sdk.ui.plugin.GigyaWebBridge$Feature r1 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.Feature.SEND_REQUEST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7265a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.gigya.android.sdk.ui.plugin.GigyaWebBridge$Feature r1 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.Feature.SEND_OAUTH_REQUEST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7265a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.gigya.android.sdk.ui.plugin.GigyaWebBridge$Feature r1 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.Feature.ON_PLUGIN_EVENT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.C3975i.<clinit>():void");
        }
    }

    /* renamed from: A */
    public void mo23450A(String str, String str2, Map<String, Object> map) {
        C2103f.m3056b("GigyaWebBridge", "sendOAuthRequest with api: " + str2 + " and params:\n<<<<" + map.toString() + "\n>>>>");
        String str3 = (String) C2204e.m3351a((String) map.get("provider"), "");
        if (!str3.isEmpty()) {
            GigyaPluginFragment.C3962d<A> dVar = this.f7239h;
            if (dVar != null) {
                dVar.mo23448b("login_started", null);
            }
            this.f7235d.mo16903f(str3, map, new C3963a(str));
        }
    }

    /* renamed from: B */
    public void mo23451B(String str, String str2, Map<String, Object> map) {
        this.f7235d.mo16901d(str2, map, RestAdapter.f7202c, C2125e.class, new C3964b(str));
    }

    /* renamed from: a */
    public C2197f<A> mo17052a(boolean z) {
        this.f7240i = z;
        return this;
    }

    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: b */
    public void mo17053b(@NonNull WebView webView, @NonNull C2105h<A> hVar, @Nullable View view) {
        if (Build.VERSION.SDK_INT < 17) {
            C2103f.m3057c("GigyaWebBridge", "WebBridge invocation is only available for Android >= 17");
            return;
        }
        webView.addJavascriptInterface(new C3969g(), "__gigAPIAdapterSettings");
        this.f7239h = new C3970h(this, webView, view, hVar);
    }

    /* renamed from: c */
    public boolean mo17054c(String str) {
        Uri parse = Uri.parse(str);
        if (parse == null || !C2207h.m3361c(parse.getScheme()) || parse.getPath() == null) {
            return false;
        }
        return mo23457s(parse.getHost(), parse.getPath().replace("/", ""), parse.getEncodedQuery());
    }

    /* renamed from: d */
    public void mo17055d(@NonNull WebView webView) {
        webView.loadUrl("about:blank");
        webView.setWebViewClient((WebViewClient) null);
        webView.setWebChromeClient((WebChromeClient) null);
        if (this.f7239h != null) {
            this.f7239h = null;
        }
    }

    /* renamed from: n */
    public final void mo23452n(String str, String str2) {
        C2103f.m3056b("GigyaWebBridge", "Sending addConnection api request with provider: " + str2);
        this.f7235d.mo16905h(str2, new C3967e(str));
    }

    /* renamed from: o */
    public final void mo23453o() {
        CookieManager instance = CookieManager.getInstance();
        if (Build.VERSION.SDK_INT >= 21) {
            instance.flush();
            return;
        }
        CookieSyncManager.createInstance(this.f7232a);
        instance.removeAllCookie();
    }

    /* renamed from: p */
    public final String mo23454p(String str) {
        if (this.f7240i && str != null) {
            try {
                return new String(Base64.decode(str, 2), "UTF-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    /* renamed from: q */
    public void mo23455q(String str) {
        String str2 = "{\"ucid\":\"" + this.f7233b.mo16858g() + "\", \"gmid\":\"" + this.f7233b.mo16856e() + "\"}";
        C2103f.m3056b("GigyaWebBridge", "getIds: " + str2);
        mo23458t(str, str2);
    }

    /* renamed from: r */
    public final void mo23456r(String str) {
        this.f7235d.mo16901d("socialize.getUserInfo", (Map<String, Object>) null, RestAdapter.f7202c, C2125e.class, new C3968f(str));
    }

    /* renamed from: s */
    public boolean mo23457s(String str, String str2, String str3) {
        if (str == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        C2207h.m3363e(hashMap, str3);
        HashMap hashMap2 = new HashMap();
        C2207h.m3363e(hashMap2, mo23454p((String) hashMap.get("params")));
        C2207h.m3363e(new HashMap(), (String) hashMap.get(HtmlPaths.DEVICE_SETTINGS));
        Feature valueOf = Feature.valueOf(str.toUpperCase(Locale.ENGLISH));
        String str4 = (String) hashMap.get("callbackID");
        int i = C3975i.f7265a[valueOf.ordinal()];
        if (i == 1) {
            mo23455q(str4);
        } else if (i == 2) {
            mo23459u(str4);
        } else if (i == 3 || i == 4) {
            mo23461w(valueOf, str4, str2, hashMap2);
        } else if (i == 5) {
            mo23463y(hashMap2);
        }
        return true;
    }

    /* renamed from: t */
    public void mo23458t(String str, String str2) {
        C2103f.m3056b("GigyaWebBridge", "evaluateJS: " + str2);
        String format = String.format("javascript:%s['%s'](%s);", new Object[]{"gigya._.apiAdapters.mobile.mobileCallbacks", str, mo23462x(str2, true)});
        GigyaPluginFragment.C3962d<A> dVar = this.f7239h;
        if (dVar != null) {
            dVar.mo23449c(format);
        }
    }

    /* renamed from: u */
    public void mo23459u(String str) {
        boolean a = this.f7234c.mo17017a();
        C2103f.m3056b("GigyaWebBridge", "isSessionValid: " + a);
        mo23458t(str, String.valueOf(a));
    }

    /* renamed from: v */
    public final void mo23460v(String str) {
        C2103f.m3056b("GigyaWebBridge", "Sending logout request");
        this.f7235d.mo16902e(new C3965c(str));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23461w(com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.Feature r6, java.lang.String r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mapApisToRequests with api: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " and params:\n<<<<"
            r0.append(r1)
            java.lang.String r1 = r9.toString()
            r0.append(r1)
            java.lang.String r1 = "\n>>>>"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GigyaWebBridge"
            p040c.p151o.p152a.p153a.C2103f.m3056b(r1, r0)
            int r0 = r8.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -713605256: goto L_0x005b;
                case 342649431: goto L_0x0051;
                case 349106322: goto L_0x0047;
                case 1216425617: goto L_0x003d;
                case 1909865161: goto L_0x0033;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x0065
        L_0x0033:
            java.lang.String r0 = "socialize.removeConnection"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0065
            r0 = r1
            goto L_0x0066
        L_0x003d:
            java.lang.String r0 = "socialize.logout"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0065
            r0 = 0
            goto L_0x0066
        L_0x0047:
            java.lang.String r0 = "accounts.logout"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0065
            r0 = r4
            goto L_0x0066
        L_0x0051:
            java.lang.String r0 = "accounts.addConnection"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0065
            r0 = r2
            goto L_0x0066
        L_0x005b:
            java.lang.String r0 = "socialize.addConnection"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0065
            r0 = r3
            goto L_0x0066
        L_0x0065:
            r0 = -1
        L_0x0066:
            if (r0 == 0) goto L_0x009e
            if (r0 == r4) goto L_0x009e
            java.lang.String r4 = "provider"
            if (r0 == r3) goto L_0x0094
            if (r0 == r2) goto L_0x0094
            if (r0 == r1) goto L_0x008a
            com.gigya.android.sdk.ui.plugin.GigyaWebBridge$Feature r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.Feature.SEND_REQUEST
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x007e
            r5.mo23451B(r7, r8, r9)
            goto L_0x00a1
        L_0x007e:
            com.gigya.android.sdk.ui.plugin.GigyaWebBridge$Feature r0 = com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.Feature.SEND_OAUTH_REQUEST
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00a1
            r5.mo23450A(r7, r8, r9)
            goto L_0x00a1
        L_0x008a:
            java.lang.Object r6 = r9.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            r5.mo23464z(r7, r6)
            goto L_0x00a1
        L_0x0094:
            java.lang.Object r6 = r9.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            r5.mo23452n(r7, r6)
            goto L_0x00a1
        L_0x009e:
            r5.mo23460v(r7)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gigya.android.sdk.p309ui.plugin.GigyaWebBridge.mo23461w(com.gigya.android.sdk.ui.plugin.GigyaWebBridge$Feature, java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* renamed from: x */
    public final String mo23462x(String str, boolean z) {
        if (this.f7240i && str != null) {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 2);
                if (!z) {
                    return encodeToString;
                }
                return "\"" + encodeToString + "\"";
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    /* renamed from: y */
    public void mo23463y(Map<String, Object> map) {
        GigyaPluginFragment.C3962d<A> dVar;
        String str = (String) map.get("sourceContainerID");
        if (str != null && (dVar = this.f7239h) != null) {
            dVar.mo23447a(new C2192a(map), str);
        }
    }

    /* renamed from: z */
    public final void mo23464z(String str, String str2) {
        C2103f.m3056b("GigyaWebBridge", "Sending removeConnection api request with provider: " + str2);
        this.f7235d.mo16898a(str2, new C3966d(str));
    }
}
