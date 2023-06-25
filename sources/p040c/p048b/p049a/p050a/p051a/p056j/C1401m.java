package p040c.p048b.p049a.p050a.p051a.p056j;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.api.authorization.AuthorizeRequest;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$BUNDLE_KEY;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import com.amazon.identity.auth.device.dataobject.RequestedScope;
import com.amazon.identity.auth.device.utils.LWAConstants$AUTHORIZE_BUNDLE_KEY;
import java.util.List;
import p040c.p048b.p049a.p050a.p051a.C1358e;
import p040c.p048b.p049a.p050a.p051a.C1360g;
import p040c.p048b.p049a.p050a.p051a.p052h.p053b.C1362a;
import p040c.p048b.p049a.p050a.p051a.p055i.C1378d;
import p040c.p048b.p049a.p050a.p051a.p056j.p057q.C1412a;
import p040c.p048b.p049a.p050a.p051a.p059l.C1423h;
import p040c.p048b.p049a.p050a.p051a.p059l.C1424i;
import p040c.p048b.p049a.p050a.p051a.p060m.C1443r;
import p040c.p048b.p049a.p050a.p051a.p065r.C1467d;
import p040c.p048b.p049a.p050a.p051a.p067t.C1474c;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.j.m */
/* compiled from: ThirdPartyAuthorizationHelper */
public class C1401m extends C1383c {

    /* renamed from: d */
    public static final String f474d = "c.b.a.a.a.j.m";

    /* renamed from: b */
    public C1406o f475b;

    /* renamed from: c */
    public C1389g f476c;

    /* renamed from: c.b.a.a.a.j.m$a */
    /* compiled from: ThirdPartyAuthorizationHelper */
    public class C1402a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ boolean f477e;

        /* renamed from: l */
        public final /* synthetic */ boolean f478l;

        /* renamed from: m */
        public final /* synthetic */ AuthorizeRequest f479m;

        /* renamed from: n */
        public final /* synthetic */ Context f480n;

        /* renamed from: o */
        public final /* synthetic */ String f481o;

        /* renamed from: p */
        public final /* synthetic */ String[] f482p;

        /* renamed from: q */
        public final /* synthetic */ C1412a f483q;

        /* renamed from: r */
        public final /* synthetic */ Bundle f484r;

        /* renamed from: s */
        public final /* synthetic */ AppInfo f485s;

        public C1402a(boolean z, boolean z2, AuthorizeRequest authorizeRequest, Context context, String str, String[] strArr, C1412a aVar, Bundle bundle, AppInfo appInfo) {
            this.f477e = z;
            this.f478l = z2;
            this.f479m = authorizeRequest;
            this.f480n = context;
            this.f481o = str;
            this.f482p = strArr;
            this.f483q = aVar;
            this.f484r = bundle;
            this.f485s = appInfo;
        }

        public void run() {
            try {
                if (!this.f477e) {
                    if (!this.f478l) {
                        this.f483q.mo15067b(new AuthError("WebView is not allowed for Authorization", AuthError.ERROR_TYPE.ERROR_BAD_PARAM));
                        return;
                    }
                }
                C1401m.this.mo15137t(this.f479m, this.f480n, this.f480n.getPackageName(), this.f481o, this.f482p, this.f483q, this.f484r, this.f485s);
                C1360g.m291i(this.f480n, false);
            } catch (AuthError e) {
                this.f483q.mo15067b(e);
            }
        }
    }

    /* renamed from: c.b.a.a.a.j.m$b */
    /* compiled from: ThirdPartyAuthorizationHelper */
    public class C1403b implements C1412a {

        /* renamed from: e */
        public final /* synthetic */ C1412a f487e;

        public C1403b(C1401m mVar, C1412a aVar) {
            this.f487e = aVar;
        }

        /* renamed from: b */
        public void mo15065a(AuthError authError) {
            String q = C1401m.f474d;
            C1485a.m829b(q, "Code for Token Exchange Error. " + authError.getMessage());
            C1412a aVar = this.f487e;
            if (aVar != null) {
                aVar.mo15067b(authError);
            }
        }

        /* renamed from: c */
        public void onSuccess(Bundle bundle) {
            C1485a.m832e(C1401m.f474d, "Code for Token Exchange success");
            C1412a aVar = this.f487e;
            if (aVar != null) {
                aVar.mo15068c(bundle);
            }
        }

        /* renamed from: e */
        public void mo15069e(Bundle bundle) {
            C1485a.m838k(C1401m.f474d, "Code for Token Exchange Cancel");
            C1412a aVar = this.f487e;
            if (aVar != null) {
                aVar.mo15069e(bundle);
            }
        }
    }

    /* renamed from: c.b.a.a.a.j.m$c */
    /* compiled from: ThirdPartyAuthorizationHelper */
    public class C1404c extends C1474c<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ String[] f488b;

        /* renamed from: c */
        public final /* synthetic */ Bundle f489c;

        public C1404c(C1401m mVar, String[] strArr, Bundle bundle) {
            this.f488b = strArr;
            this.f489c = bundle;
        }

        /* renamed from: c */
        public Bundle mo15142a(Context context, C1379a aVar) {
            return C1401m.m440u(context, this.f488b, aVar, this.f489c);
        }
    }

    public C1401m() {
        this(new C1406o());
    }

    /* renamed from: u */
    public static Bundle m440u(Context context, String[] strArr, C1379a aVar, Bundle bundle) {
        Bundle X = aVar.mo15103X(bundle, context.getPackageName(), strArr);
        if (X != null) {
            X.setClassLoader(context.getClassLoader());
        }
        return X;
    }

    /* renamed from: s */
    public void mo15136s(AuthorizeRequest authorizeRequest, Context context, String str, String str2, String str3, String[] strArr, boolean z, C1443r rVar, C1412a aVar, Bundle bundle) {
        Context context2 = context;
        String str4 = str2;
        C1412a aVar2 = aVar;
        Bundle bundle2 = bundle;
        if (!C1467d.m792b()) {
            AppInfo a = new C1378d().mo15096a(str, context2);
            List<RequestedScope> a2 = rVar.mo15282a(context2);
            String[] d = C1383c.m365d(context2, strArr, a2);
            boolean z2 = bundle2.getBoolean(AuthzConstants$BUNDLE_KEY.SANDBOX.val, false);
            if (bundle2 == Bundle.EMPTY) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putBoolean(AuthzConstants$BUNDLE_KEY.CHECK_API_KEY.val, false);
            bundle3.putBoolean(AuthzConstants$BUNDLE_KEY.RETURN_CODE.val, true);
            bundle3.putString(LWAConstants$AUTHORIZE_BUNDLE_KEY.REGION.val, C1362a.m295c(context).getStringValue());
            bundle3.putString(AuthzConstants$BUNDLE_KEY.CLIENT_ID.val, str4);
            bundle3.putString(AuthzConstants$BUNDLE_KEY.SDK_VERSION.val, "LWAAndroidSDK3.0.6");
            try {
                bundle3.putBundle(AuthzConstants$BUNDLE_KEY.EXTRA_URL_PARAMS.val, mo15138v(bundle3));
                Bundle bundle4 = Bundle.EMPTY;
                if (!z2 && (C1360g.m288f(context) || a2 == null || a2.size() == 0)) {
                    bundle4 = mo15140x(context2, d, bundle3);
                }
                Bundle bundle5 = bundle4;
                if (!bundle5.containsKey("code") || TextUtils.isEmpty(bundle5.getString("code"))) {
                    if (bundle5.containsKey(AuthError.AUTH_ERROR_EXECEPTION) || bundle5.containsKey(AuthzConstants$BUNDLE_KEY.AUTHORIZE.val) || bundle5.containsKey(AuthzConstants$BUNDLE_KEY.CAUSE_ID.val)) {
                        bundle5.setClassLoader(context.getClassLoader());
                        if (bundle5.containsKey(AuthzConstants$BUNDLE_KEY.CAUSE_ID.val)) {
                            aVar2.mo15069e(bundle5);
                        } else if (bundle5.containsKey(AuthError.AUTH_ERROR_EXECEPTION)) {
                            aVar2.mo15067b(AuthError.extractError(bundle5));
                        } else {
                            C1423h.m562a(context);
                            Bundle bundle6 = new Bundle();
                            bundle6.putString(AuthzConstants$BUNDLE_KEY.AUTHORIZE.val, "authorized via service");
                            aVar2.mo15068c(bundle6);
                        }
                    } else {
                        C1424i.m567s(context).mo15183b();
                        new Handler(Looper.getMainLooper()).post(new C1402a(z, z2, authorizeRequest, context, str2, d, aVar, bundle3, a));
                    }
                } else if (bundle3.getBoolean(AuthzConstants$BUNDLE_KEY.GET_AUTH_CODE.val, false)) {
                    C1383c.m375n(bundle5.getString("code"), str4, str3, aVar2);
                } else {
                    mo15139w(context, str, this.f476c.mo15118e(), bundle5, bundle3, aVar);
                    C1360g.m291i(context2, true);
                }
            } catch (AuthError e) {
                aVar2.mo15067b(e);
            }
        } else {
            C1485a.m829b(f474d, "authorize started on main thread");
            throw new IllegalStateException("authorize started on main thread");
        }
    }

    /* renamed from: t */
    public final void mo15137t(AuthorizeRequest authorizeRequest, Context context, String str, String str2, String[] strArr, C1412a aVar, Bundle bundle, AppInfo appInfo) {
        bundle.getBundle(AuthzConstants$BUNDLE_KEY.EXTRA_URL_PARAMS.val).remove("client_id");
        C1385d dVar = new C1385d(authorizeRequest, str2, strArr, bundle, appInfo, aVar);
        Context context2 = context;
        C1358e.m270c().mo15057b(dVar, context);
    }

    /* renamed from: v */
    public final Bundle mo15138v(Bundle bundle) {
        Bundle bundle2;
        if (bundle.getBoolean(AuthzConstants$BUNDLE_KEY.GET_AUTH_CODE.val, false)) {
            String string = bundle.getString(AuthzConstants$BUNDLE_KEY.CODE_CHALLENGE.val);
            String string2 = bundle.getString(AuthzConstants$BUNDLE_KEY.CODE_CHALLENGE_METHOD.val);
            if (!TextUtils.isEmpty(string)) {
                bundle2 = new Bundle();
                bundle2.putString("code_challenge", string);
                bundle2.putString("code_challenge_method", string2);
            } else {
                throw new AuthError("Must provide code challenge parameter.", AuthError.ERROR_TYPE.ERROR_MISSING_CODE_CHALLENGE);
            }
        } else {
            bundle2 = this.f476c.mo15119g();
        }
        if (bundle.getString(AuthzConstants$BUNDLE_KEY.SCOPE_DATA.val) != null) {
            bundle2.putString("scope_data", bundle.getString(AuthzConstants$BUNDLE_KEY.SCOPE_DATA.val));
        }
        if (bundle.getString(AuthzConstants$BUNDLE_KEY.X_AMAZON_OPTIONS.val) != null) {
            bundle2.putString("com.amazon.oauth2.options", bundle.getString(AuthzConstants$BUNDLE_KEY.X_AMAZON_OPTIONS.val));
        }
        bundle2.putString("client_id", bundle.getString(AuthzConstants$BUNDLE_KEY.CLIENT_ID.val));
        return bundle2;
    }

    /* renamed from: w */
    public final void mo15139w(Context context, String str, String str2, Bundle bundle, Bundle bundle2, C1412a aVar) {
        mo15108b(context, str, str2, bundle, false, (String) null, new C1443r(), new C1378d(), bundle2, new C1403b(this, aVar));
    }

    /* renamed from: x */
    public final Bundle mo15140x(Context context, String[] strArr, Bundle bundle) {
        Bundle bundle2 = (Bundle) new C1404c(this, strArr, bundle).mo15345b(context, this.f475b);
        return bundle2 != null ? bundle2 : new Bundle();
    }

    public C1401m(C1406o oVar) {
        this.f476c = C1389g.m389f();
        this.f475b = oVar;
    }
}
