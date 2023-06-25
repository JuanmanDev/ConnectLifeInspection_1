package p040c.p151o.p152a.p153a.p167p.p168c;

import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.gigya.android.sdk.p309ui.HostActivity;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p040c.p151o.p152a.p153a.p174u.C2203d;

/* renamed from: c.o.a.a.p.c.a */
/* compiled from: FacebookProvider */
public class C2157a extends C2168e {

    /* renamed from: h */
    public static final String[] f2127h = {"email"};

    /* renamed from: g */
    public final CallbackManager f2128g;

    /* renamed from: c.o.a.a.p.c.a$a */
    /* compiled from: FacebookProvider */
    public class C2158a extends HostActivity.C3954a {

        /* renamed from: a */
        public final /* synthetic */ Map f2129a;

        /* renamed from: b */
        public final /* synthetic */ List f2130b;

        /* renamed from: c.o.a.a.p.c.a$a$a */
        /* compiled from: FacebookProvider */
        public class C2159a implements FacebookCallback<LoginResult> {
            public C2159a(C2158a aVar, LoginManager loginManager, AppCompatActivity appCompatActivity) {
            }
        }

        public C2158a(Map map, String str, List list) {
            this.f2129a = map;
            this.f2130b = list;
        }

        /* renamed from: a */
        public void mo16986a(AppCompatActivity appCompatActivity, int i, int i2, @Nullable Intent intent) {
            C2157a.this.f2128g.onActivityResult(i, i2, intent);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.facebook.login.LoginBehavior} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo16987b(androidx.appcompat.app.AppCompatActivity r4, @androidx.annotation.Nullable android.os.Bundle r5) {
            /*
                r3 = this;
                com.facebook.login.LoginManager r5 = com.facebook.login.LoginManager.getInstance()
                com.facebook.login.LoginBehavior r0 = com.facebook.login.LoginBehavior.NATIVE_WITH_FALLBACK
                java.util.Map r1 = r3.f2129a
                if (r1 == 0) goto L_0x001f
                java.lang.String r2 = "facebookLoginBehavior"
                boolean r1 = r1.containsKey(r2)
                if (r1 == 0) goto L_0x001f
                java.util.Map r1 = r3.f2129a
                java.lang.Object r1 = r1.get(r2)
                boolean r2 = r1 instanceof com.facebook.login.LoginBehavior
                if (r2 == 0) goto L_0x001f
                r0 = r1
                com.facebook.login.LoginBehavior r0 = (com.facebook.login.LoginBehavior) r0
            L_0x001f:
                r5.setLoginBehavior(r0)
                c.o.a.a.p.c.a r0 = p040c.p151o.p152a.p153a.p167p.p168c.C2157a.this
                com.facebook.CallbackManager r0 = r0.f2128g
                c.o.a.a.p.c.a$a$a r1 = new c.o.a.a.p.c.a$a$a
                r1.<init>(r3, r5, r4)
                r5.registerCallback(r0, r1)
                java.util.List r0 = r3.f2130b
                r5.logInWithReadPermissions(r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p151o.p152a.p153a.p167p.p168c.C2157a.C2158a.mo16987b(androidx.appcompat.app.AppCompatActivity, android.os.Bundle):void");
        }
    }

    /* renamed from: m */
    public static boolean m3234m(C2203d dVar) {
        try {
            String b = dVar.mo17059b("com.facebook.sdk.ApplicationId");
            Class.forName("com.facebook.login.LoginManager");
            if (b != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo16980a() {
        super.mo16980a();
        if (AccessToken.getCurrentAccessToken() != null) {
            LoginManager.getInstance().logOut();
        }
    }

    /* renamed from: c */
    public void mo16981c(Map<String, Object> map, String str) {
        if (!this.f2146c) {
            boolean z = true;
            this.f2146c = true;
            this.f2147d = str;
            List<String> l = mo16984l(map);
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            if (currentAccessToken == null || currentAccessToken.isExpired() || !mo16985n(l)) {
                z = false;
            }
            if (z) {
                mo17002i(map, mo16983k(currentAccessToken.getToken(), currentAccessToken.getExpires().getTime() / 1000, (String) null), str);
            } else {
                HostActivity.m9833q(this.f2144a, new C2158a(map, str, l));
            }
        }
    }

    public String getName() {
        return "facebook";
    }

    /* renamed from: k */
    public String mo16983k(String str, long j, String str2) {
        try {
            return new JSONObject().put("facebook", new JSONObject().put("authToken", str).put("tokenExpiration", j)).toString();
        } catch (Exception e) {
            this.f2146c = false;
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r4 = (java.lang.String) r4.get("facebookReadPermissions");
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo16984l(java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r3 = this;
            java.lang.String[] r0 = f2127h
            java.util.List r0 = java.util.Arrays.asList(r0)
            if (r4 == 0) goto L_0x0026
            java.lang.String r1 = "facebookReadPermissions"
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L_0x0026
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0026
            java.lang.String r1 = ","
            java.lang.String[] r4 = r4.split(r1)
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.util.List r0 = p040c.p151o.p152a.p153a.p174u.C2204e.m3352b(r0, r4)
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p151o.p152a.p153a.p167p.p168c.C2157a.mo16984l(java.util.Map):java.util.List");
    }

    /* renamed from: n */
    public final boolean mo16985n(List<String> list) {
        Set permissions = AccessToken.getCurrentAccessToken().getPermissions();
        for (String contains : list) {
            if (!permissions.contains(contains)) {
                return false;
            }
        }
        return true;
    }
}
