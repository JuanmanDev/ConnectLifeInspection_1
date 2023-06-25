package p040c.p313b0.p314a;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.b0.a.m */
/* compiled from: MyCookieManager */
public class C4213m implements C9017j.C9021c {

    /* renamed from: e */
    public static C9017j f8983e;

    /* renamed from: l */
    public static CookieManager f8984l;

    /* renamed from: c.b0.a.m$a */
    /* compiled from: MyCookieManager */
    public class C4214a implements ValueCallback<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ C9017j.C9022d f8985a;

        public C4214a(C9017j.C9022d dVar) {
            this.f8985a = dVar;
        }

        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
            this.f8985a.success(Boolean.TRUE);
        }
    }

    /* renamed from: c.b0.a.m$b */
    /* compiled from: MyCookieManager */
    public class C4215b implements ValueCallback<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ C9017j.C9022d f8986a;

        public C4215b(C9017j.C9022d dVar) {
            this.f8986a = dVar;
        }

        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
            this.f8986a.success(Boolean.TRUE);
        }
    }

    /* renamed from: c.b0.a.m$c */
    /* compiled from: MyCookieManager */
    public class C4216c implements ValueCallback<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ C9017j.C9022d f8987a;

        public C4216c(C9017j.C9022d dVar) {
            this.f8987a = dVar;
        }

        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
            this.f8987a.success(Boolean.TRUE);
        }
    }

    public C4213m(C9003c cVar) {
        C9017j jVar = new C9017j(cVar, "com.pichillilorenzo/flutter_inappwebview_cookiemanager");
        f8983e = jVar;
        jVar.mo46575e(this);
        f8984l = CookieManager.getInstance();
    }

    /* renamed from: a */
    public static void m11486a(C9017j.C9022d dVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            f8984l.removeAllCookies(new C4216c(dVar));
            f8984l.flush();
            return;
        }
        CookieSyncManager createInstance = CookieSyncManager.createInstance(C4221o.f8993a);
        createInstance.startSync();
        f8984l.removeAllCookie();
        dVar.success(Boolean.TRUE);
        createInstance.stopSync();
        createInstance.sync();
    }

    /* renamed from: b */
    public static void m11487b(String str, String str2, String str3, String str4, C9017j.C9022d dVar) {
        String str5 = str2 + "=; Path=" + str4 + "; Domain=" + str3 + "; Max-Age=-1;";
        if (Build.VERSION.SDK_INT >= 21) {
            f8984l.setCookie(str, str5, new C4215b(dVar));
            f8984l.flush();
            return;
        }
        CookieSyncManager createInstance = CookieSyncManager.createInstance(C4221o.f8993a);
        createInstance.startSync();
        f8984l.setCookie(str, str5);
        dVar.success(Boolean.TRUE);
        createInstance.stopSync();
        createInstance.sync();
    }

    /* renamed from: c */
    public static void m11488c(String str, String str2, String str3, C9017j.C9022d dVar) {
        CookieSyncManager cookieSyncManager;
        String cookie = f8984l.getCookie(str);
        if (cookie != null) {
            if (Build.VERSION.SDK_INT < 21) {
                cookieSyncManager = CookieSyncManager.createInstance(C4221o.f8993a);
                cookieSyncManager.startSync();
            } else {
                cookieSyncManager = null;
            }
            for (String split : cookie.split(MAPCookie.COOKIE_ATTRIBUTE_SEPERATOR)) {
                String str4 = split.split(MAPCookie.COOKIE_NAME_VALUE_SEPERATOR, 2)[0].trim() + "=; Path=" + str3 + "; Domain=" + str2 + "; Max-Age=-1;";
                if (Build.VERSION.SDK_INT >= 21) {
                    f8984l.setCookie(str, str4, (ValueCallback) null);
                } else {
                    f8984l.setCookie(str, str4);
                }
            }
            if (cookieSyncManager != null) {
                cookieSyncManager.stopSync();
                cookieSyncManager.sync();
            } else if (Build.VERSION.SDK_INT >= 21) {
                f8984l.flush();
            }
        }
        dVar.success(Boolean.TRUE);
    }

    /* renamed from: e */
    public static String m11489e(Long l) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy hh:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(MAPCookie.GMT));
        return simpleDateFormat.format(new Date(l.longValue()));
    }

    /* renamed from: f */
    public static List<Map<String, Object>> m11490f(String str) {
        ArrayList arrayList = new ArrayList();
        String cookie = f8984l.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(MAPCookie.COOKIE_ATTRIBUTE_SEPERATOR)) {
                String[] split2 = split.split(MAPCookie.COOKIE_NAME_VALUE_SEPERATOR, 2);
                String trim = split2[0].trim();
                String trim2 = split2[1].trim();
                HashMap hashMap = new HashMap();
                hashMap.put("name", trim);
                hashMap.put("value", trim2);
                hashMap.put("expiresDate", (Object) null);
                hashMap.put("isSessionOnly", (Object) null);
                hashMap.put("domain", (Object) null);
                hashMap.put("sameSite", (Object) null);
                hashMap.put("isSecure", (Object) null);
                hashMap.put("isHttpOnly", (Object) null);
                hashMap.put("path", (Object) null);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static void m11491g(String str, String str2, String str3, String str4, String str5, Long l, Integer num, Boolean bool, Boolean bool2, String str6, C9017j.C9022d dVar) {
        String str7 = str2 + MAPCookie.COOKIE_NAME_VALUE_SEPERATOR + str3 + "; Domain=" + str4 + "; Path=" + str5;
        if (l != null) {
            str7 = str7 + "; Expires=" + m11489e(l);
        }
        if (num != null) {
            str7 = str7 + "; Max-Age=" + num.toString();
        }
        if (bool != null && bool.booleanValue()) {
            str7 = str7 + "; Secure";
        }
        if (bool2 != null && bool2.booleanValue()) {
            str7 = str7 + "; HttpOnly";
        }
        if (str6 != null) {
            str7 = str7 + "; SameSite=" + str6;
        }
        String str8 = str7 + MAPCookie.COOKIE_ATTRIBUTE_SEPERATOR;
        if (Build.VERSION.SDK_INT >= 21) {
            f8984l.setCookie(str, str8, new C4214a(dVar));
            f8984l.flush();
            return;
        }
        CookieSyncManager createInstance = CookieSyncManager.createInstance(C4221o.f8993a);
        createInstance.startSync();
        f8984l.setCookie(str, str8);
        dVar.success(Boolean.TRUE);
        createInstance.stopSync();
        createInstance.sync();
    }

    /* renamed from: d */
    public void mo25633d() {
        f8983e.mo46575e((C9017j.C9021c) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r13, p553f.p554a.p570e.p571a.C9017j.C9022d r14) {
        /*
            r12 = this;
            java.lang.String r1 = r13.f17687a
            int r2 = r1.hashCode()
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1222815761: goto L_0x0036;
                case 126640486: goto L_0x002c;
                case 747417188: goto L_0x0022;
                case 822411705: goto L_0x0018;
                case 1989049945: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0040
        L_0x000e:
            java.lang.String r2 = "getCookies"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0040
            r1 = r6
            goto L_0x0041
        L_0x0018:
            java.lang.String r2 = "deleteAllCookies"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0040
            r1 = r3
            goto L_0x0041
        L_0x0022:
            java.lang.String r2 = "deleteCookies"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0040
            r1 = r4
            goto L_0x0041
        L_0x002c:
            java.lang.String r2 = "setCookie"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0040
            r1 = 0
            goto L_0x0041
        L_0x0036:
            java.lang.String r2 = "deleteCookie"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0040
            r1 = r5
            goto L_0x0041
        L_0x0040:
            r1 = -1
        L_0x0041:
            java.lang.String r2 = "name"
            java.lang.String r7 = "path"
            java.lang.String r8 = "domain"
            java.lang.String r9 = "url"
            if (r1 == 0) goto L_0x009f
            if (r1 == r6) goto L_0x0091
            if (r1 == r5) goto L_0x0074
            if (r1 == r4) goto L_0x005d
            if (r1 == r3) goto L_0x0058
            r14.notImplemented()
            goto L_0x0100
        L_0x0058:
            m11486a(r14)
            goto L_0x0100
        L_0x005d:
            java.lang.Object r1 = r13.mo46571a(r9)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r13.mo46571a(r8)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r13.mo46571a(r7)
            java.lang.String r0 = (java.lang.String) r0
            m11488c(r1, r2, r0, r14)
            goto L_0x0100
        L_0x0074:
            java.lang.Object r1 = r13.mo46571a(r9)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r13.mo46571a(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r13.mo46571a(r8)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r13.mo46571a(r7)
            java.lang.String r0 = (java.lang.String) r0
            m11487b(r1, r2, r3, r0, r14)
            goto L_0x0100
        L_0x0091:
            java.lang.Object r0 = r13.mo46571a(r9)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = m11490f(r0)
            r14.success(r0)
            goto L_0x0100
        L_0x009f:
            java.lang.Object r1 = r13.mo46571a(r9)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r13.mo46571a(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "value"
            java.lang.Object r3 = r13.mo46571a(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r13.mo46571a(r8)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r13.mo46571a(r7)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "expiresDate"
            java.lang.Object r6 = r13.mo46571a(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00d0
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r6)
            r6 = r7
            goto L_0x00d1
        L_0x00d0:
            r6 = 0
        L_0x00d1:
            java.lang.String r7 = "maxAge"
            java.lang.Object r7 = r13.mo46571a(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.String r8 = "isSecure"
            java.lang.Object r8 = r13.mo46571a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            java.lang.String r9 = "isHttpOnly"
            java.lang.Object r9 = r13.mo46571a(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.lang.String r11 = "sameSite"
            java.lang.Object r0 = r13.mo46571a(r11)
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r10 = r14
            m11491g(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p313b0.p314a.C4213m.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }
}
