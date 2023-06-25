package p040c.p048b.p049a.p050a.p051a.p056j;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.InsufficientScopeAuthError;
import com.amazon.identity.auth.device.InvalidTokenAuthError;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$BUNDLE_KEY;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import com.amazon.identity.auth.device.dataobject.Profile;
import com.amazon.identity.auth.device.dataobject.RequestedScope;
import com.amazon.identity.auth.device.utils.LWAConstants$PROFILE_BUNDLE_KEY;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p048b.p049a.p050a.p051a.p055i.C1378d;
import p040c.p048b.p049a.p050a.p051a.p059l.C1423h;
import p040c.p048b.p049a.p050a.p051a.p059l.C1424i;
import p040c.p048b.p049a.p050a.p051a.p059l.C1425j;
import p040c.p048b.p049a.p050a.p051a.p060m.C1442q;
import p040c.p048b.p049a.p050a.p051a.p064q.C1462a;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.j.j */
/* compiled from: ProfileHelper */
public class C1397j {

    /* renamed from: a */
    public static final String f467a = "c.b.a.a.a.j.j";

    /* renamed from: b */
    public static C1442q f468b = new C1442q();

    /* renamed from: c.b.a.a.a.j.j$a */
    /* compiled from: ProfileHelper */
    public static class C1398a implements C1462a {

        /* renamed from: e */
        public final /* synthetic */ Context f469e;

        /* renamed from: l */
        public final /* synthetic */ Bundle f470l;

        /* renamed from: m */
        public final /* synthetic */ C1462a f471m;

        /* renamed from: n */
        public final /* synthetic */ AppInfo f472n;

        public C1398a(Context context, Bundle bundle, C1462a aVar, AppInfo appInfo) {
            this.f469e = context;
            this.f470l = bundle;
            this.f471m = aVar;
            this.f472n = appInfo;
        }

        /* renamed from: b */
        public void mo15065a(AuthError authError) {
            this.f471m.mo15067b(authError);
        }

        /* renamed from: c */
        public void onSuccess(Bundle bundle) {
            String string = bundle.getString(AuthzConstants$BUNDLE_KEY.TOKEN.val);
            if (TextUtils.isEmpty(string)) {
                C1424i.m567s(this.f469e).mo15183b();
                C1485a.m829b(C1397j.f467a, "Not authorized for getProfile");
                if (C1397j.m429n(this.f470l)) {
                    this.f471m.mo15067b(new InsufficientScopeAuthError("Profile request not valid for authorized scopes"));
                } else {
                    this.f471m.mo15068c(C1397j.m424i((Bundle) null));
                }
            } else {
                Bundle d = C1397j.m427l(this.f469e, this.f472n.mo21443l());
                if (d != null) {
                    C1485a.m836i(C1397j.f467a, "Returning local profile information", d.toString());
                    this.f471m.mo15068c(C1397j.m424i(d));
                    return;
                }
                try {
                    JSONObject e = C1397j.m428m(this.f469e, string, this.f470l, this.f472n);
                    C1485a.m828a(C1397j.f467a, "Returning remote profile information");
                    this.f471m.mo15068c(C1397j.m424i(C1397j.m423h(e)));
                    C1397j.m430o(this.f469e, this.f472n.mo21443l(), e);
                } catch (IOException e2) {
                    C1485a.m830c(C1397j.f467a, e2.getMessage(), e2);
                    this.f471m.mo15067b(new AuthError(e2.getMessage(), AuthError.ERROR_TYPE.ERROR_IO));
                } catch (InvalidTokenAuthError e3) {
                    C1485a.m829b(C1397j.f467a, "Invalid token sent to the server. Cleaning up local state");
                    C1423h.m562a(this.f469e);
                    this.f471m.mo15067b(e3);
                } catch (InsufficientScopeAuthError e4) {
                    C1485a.m829b(C1397j.f467a, e4.getMessage());
                    if (C1397j.m429n(this.f470l)) {
                        this.f471m.mo15067b(e4);
                    } else {
                        this.f471m.mo15068c(C1397j.m424i((Bundle) null));
                    }
                } catch (AuthError e5) {
                    C1485a.m829b(C1397j.f467a, e5.getMessage());
                    this.f471m.mo15067b(e5);
                } catch (JSONException e6) {
                    C1485a.m830c(C1397j.f467a, e6.getMessage(), e6);
                    this.f471m.mo15067b(new AuthError(e6.getMessage(), AuthError.ERROR_TYPE.ERROR_JSON));
                }
            }
        }
    }

    /* renamed from: h */
    public static Bundle m423h(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            bundle.putString(next, jSONObject.getString(next));
        }
        C1485a.m836i(f467a, "Profile Information", bundle.toString());
        return bundle;
    }

    /* renamed from: i */
    public static Bundle m424i(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(AuthzConstants$BUNDLE_KEY.PROFILE.val, bundle);
        return bundle2;
    }

    /* renamed from: j */
    public static String[] m425j(Context context, AppInfo appInfo) {
        List<RequestedScope> s = C1425j.m574u(context).mo15209s(appInfo.mo21443l());
        String[] strArr = new String[s.size()];
        int i = 0;
        for (RequestedScope p : s) {
            strArr[i] = p.mo21509p();
            i++;
        }
        return strArr;
    }

    /* renamed from: k */
    public static void m426k(Context context, String str, Bundle bundle, C1462a aVar) {
        AppInfo a = new C1378d().mo15096a(str, context);
        if (a == null) {
            aVar.mo15067b(new AuthError("App info is null", AuthError.ERROR_TYPE.ERROR_ACCESS_DENIED));
            return;
        }
        try {
            C1410p.m484b(context, str, a.mo21446o(), m425j(context, a), new C1398a(context, bundle, aVar, a), new C1378d(), bundle);
        } catch (AuthError e) {
            aVar.mo15067b(e);
        }
    }

    /* renamed from: l */
    public static Bundle m427l(Context context, String str) {
        C1485a.m828a(f467a, "Accessing local profile information");
        Profile t = C1424i.m567s(context).mo15207t(str);
        if (t == null || t.mo21494r()) {
            C1485a.m828a(f467a, "Local profile information does not exist, or has expired");
            return null;
        }
        try {
            return t.mo21489m();
        } catch (AuthError unused) {
            C1485a.m828a(f467a, "Local profile information invalid");
            return null;
        }
    }

    /* renamed from: m */
    public static JSONObject m428m(Context context, String str, Bundle bundle, AppInfo appInfo) {
        C1485a.m828a(f467a, "Fetching remote profile information");
        return f468b.mo15280c(context, str, bundle, appInfo);
    }

    /* renamed from: n */
    public static boolean m429n(Bundle bundle) {
        return bundle != null && bundle.containsKey(LWAConstants$PROFILE_BUNDLE_KEY.FAIL_ON_INSUFFICIENT_SCOPE.val);
    }

    /* renamed from: o */
    public static void m430o(Context context, String str, JSONObject jSONObject) {
        C1485a.m828a(f467a, "Updating local profile information");
        C1424i s = C1424i.m567s(context);
        s.mo15183b();
        s.mo15196p(new Profile(str, jSONObject.toString()), context);
    }
}
