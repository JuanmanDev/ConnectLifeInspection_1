package p040c.p048b.p049a.p050a.p051a.p056j;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.test.internal.runner.RunnerArgs;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.authorization.Service;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$BUNDLE_KEY;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import com.amazon.identity.auth.device.dataobject.RequestedScope;
import com.amazon.identity.auth.device.utils.HashAlgorithm;
import com.amazon.identity.auth.device.utils.LWAConstants$AUTHORIZE_BUNDLE_KEY;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.text.Typography;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p048b.p049a.p050a.p051a.p055i.C1377c;
import p040c.p048b.p049a.p050a.p051a.p056j.p057q.C1412a;
import p040c.p048b.p049a.p050a.p051a.p060m.C1443r;
import p040c.p048b.p049a.p050a.p051a.p061n.C1444a;
import p040c.p048b.p049a.p050a.p051a.p061n.C1445b;
import p040c.p048b.p049a.p050a.p051a.p065r.C1467d;
import p040c.p048b.p049a.p050a.p051a.p067t.C1478g;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.j.c */
/* compiled from: AuthorizationHelper */
public class C1383c {

    /* renamed from: a */
    public static final String f417a = "c.b.a.a.a.j.c";

    /* renamed from: c.b.a.a.a.j.c$a */
    /* compiled from: AuthorizationHelper */
    public class C1384a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Bundle f418e;

        /* renamed from: l */
        public final /* synthetic */ Context f419l;

        /* renamed from: m */
        public final /* synthetic */ String f420m;

        /* renamed from: n */
        public final /* synthetic */ String f421n;

        /* renamed from: o */
        public final /* synthetic */ String f422o;

        /* renamed from: p */
        public final /* synthetic */ C1443r f423p;

        /* renamed from: q */
        public final /* synthetic */ C1377c f424q;

        /* renamed from: r */
        public final /* synthetic */ boolean f425r;

        /* renamed from: s */
        public final /* synthetic */ Bundle f426s;

        /* renamed from: t */
        public final /* synthetic */ C1412a f427t;

        public C1384a(Bundle bundle, Context context, String str, String str2, String str3, C1443r rVar, C1377c cVar, boolean z, Bundle bundle2, C1412a aVar) {
            this.f418e = bundle;
            this.f419l = context;
            this.f420m = str;
            this.f421n = str2;
            this.f422o = str3;
            this.f423p = rVar;
            this.f424q = cVar;
            this.f425r = z;
            this.f426s = bundle2;
            this.f427t = aVar;
        }

        public void run() {
            Bundle bundle = this.f418e;
            if (bundle != null) {
                C1383c.this.mo15109o(this.f419l, this.f420m, this.f421n, this.f422o, this.f423p, this.f424q, bundle, this.f425r, this.f426s, this.f427t);
            } else {
                this.f427t.mo15067b(new AuthError("Response bundle from Authorization was null", AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE));
            }
        }
    }

    /* renamed from: c */
    public static String m364c(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RunnerArgs.ARGUMENT_TEST_PACKAGE, str);
            for (HashAlgorithm hashAlgorithm : HashAlgorithm.values()) {
                jSONObject.put(hashAlgorithm.getAlgorithmName(), new JSONArray(C1478g.m812a(str, hashAlgorithm, context)));
            }
            return Base64.encodeToString(jSONObject.toString().getBytes(), 0);
        } catch (JSONException e) {
            C1485a.m830c(f417a, "Encountered exception while generating app identifier blob", e);
            return null;
        }
    }

    /* renamed from: d */
    public static String[] m365d(Context context, String[] strArr, List<RequestedScope> list) {
        List asList = Arrays.asList(strArr);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(asList);
        if (list != null) {
            for (RequestedScope p : list) {
                String p2 = p.mo21509p();
                if (!arrayList.contains(p2)) {
                    arrayList.add(p2);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: e */
    public static String m366e(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("authzParams");
        StringBuffer stringBuffer = new StringBuffer("");
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                stringBuffer.append(Typography.amp);
                stringBuffer.append(m374m(str, bundle2.getString(str)));
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: f */
    public static String m367f() {
        return "/ap/oa";
    }

    /* renamed from: g */
    public static String m368g(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = bundle.keySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            String string = bundle.getString(str);
            AuthzConstants$BUNDLE_KEY[] values = AuthzConstants$BUNDLE_KEY.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (values[i].val.equalsIgnoreCase(str)) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                sb.append(m374m(str, string));
                sb.append("&");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: h */
    public static String m369h() {
        return "&language=" + Locale.getDefault().toString();
    }

    /* renamed from: i */
    public static String m370i(Context context, String str, String str2, String[] strArr, String str3, boolean z, boolean z2, Bundle bundle, AppInfo appInfo) {
        C1444a a = C1445b.m720a(context, appInfo);
        a.mo15293d(Service.AUTHORIZATION);
        if (bundle.containsKey(LWAConstants$AUTHORIZE_BUNDLE_KEY.REGION.val)) {
            a.mo15291b(C1399k.m434a(bundle.getString(LWAConstants$AUTHORIZE_BUNDLE_KEY.REGION.val)));
        }
        String j = m371j(context, str, str2, strArr, str3, z, z2, bundle);
        String url = new URL(a.mo15294e() + m367f() + j + m369h() + m366e(bundle)).toString();
        String str4 = f417a;
        StringBuilder sb = new StringBuilder();
        sb.append("url=");
        sb.append(url);
        C1485a.m836i(str4, "Generating OAUTH2 URL", sb.toString());
        return url;
    }

    /* renamed from: j */
    public static String m371j(Context context, String str, String str2, String[] strArr, String str3, boolean z, boolean z2, Bundle bundle) {
        StringBuffer stringBuffer = new StringBuffer("?");
        String k = m372k(str);
        stringBuffer.append(m374m("response_type", "code"));
        stringBuffer.append("&");
        stringBuffer.append(m374m("redirect_uri", k));
        if (str2 != null) {
            stringBuffer.append("&");
            stringBuffer.append(m374m("client_id", str2));
        }
        stringBuffer.append("&");
        if (z) {
            stringBuffer.append(m374m("amzn_respectRmrMeAuthState", "1"));
            stringBuffer.append("&");
            stringBuffer.append(m374m("amzn_showRmrMe", "1"));
            stringBuffer.append("&");
            stringBuffer.append(m374m("amzn_rmrMeDefaultSelected", "1"));
            stringBuffer.append("&");
        }
        if (z2) {
            stringBuffer.append(m374m("skipSignIn", "1"));
            stringBuffer.append("&");
        }
        if (bundle.getBoolean(AuthzConstants$BUNDLE_KEY.SANDBOX.val, false)) {
            stringBuffer.append(m374m("sandbox", "true"));
            stringBuffer.append("&");
        }
        if (str2 == null) {
            str2 = str3;
        }
        boolean z3 = bundle.getBoolean(AuthzConstants$BUNDLE_KEY.GET_AUTH_CODE.val, false);
        StringBuilder sb = new StringBuilder();
        sb.append("clientId=" + str2 + "&");
        sb.append("redirectUri=" + k + "&");
        sb.append("clientRequestId=" + str3.toString() + "&");
        if (bundle.containsKey("InteractiveRequestType")) {
            sb.append("InteractiveRequestType=" + bundle.getString("InteractiveRequestType") + "&");
        }
        sb.append(AuthzConstants$BUNDLE_KEY.GET_AUTH_CODE.val + MAPCookie.COOKIE_NAME_VALUE_SEPERATOR + String.valueOf(z3));
        stringBuffer.append(m374m("state", sb.toString()));
        stringBuffer.append("&");
        stringBuffer.append(m374m("scope", C1400l.m436b(strArr)));
        stringBuffer.append("&");
        stringBuffer.append(m374m("appIdentifier", m364c(context, str)));
        if (bundle.containsKey(AuthzConstants$BUNDLE_KEY.SDK_VERSION.val) || bundle.containsKey(AuthzConstants$BUNDLE_KEY.SSO_VERSION.val)) {
            stringBuffer.append("&");
            stringBuffer.append(m374m("sw_ver", m373l(bundle)));
        }
        stringBuffer.append("&");
        stringBuffer.append(m368g(bundle.getBundle(AuthzConstants$BUNDLE_KEY.EXTRA_URL_PARAMS.val)));
        return stringBuffer.toString();
    }

    /* renamed from: k */
    public static String m372k(String str) {
        String str2 = "amzn://" + str;
        C1485a.m836i(f417a, "Generating Redirect URI", "rediectUri=" + str2);
        return str2;
    }

    /* renamed from: l */
    public static String m373l(Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        if (bundle.containsKey(AuthzConstants$BUNDLE_KEY.SDK_VERSION.val)) {
            sb.append(bundle.getString(AuthzConstants$BUNDLE_KEY.SDK_VERSION.val));
            if (bundle.containsKey(AuthzConstants$BUNDLE_KEY.SSO_VERSION.val)) {
                sb.append(AccountManagerConstants$LOCALE.LOCALE_SEPERATOR);
            }
        }
        if (bundle.containsKey(AuthzConstants$BUNDLE_KEY.SSO_VERSION.val)) {
            sb.append(bundle.getString(AuthzConstants$BUNDLE_KEY.SSO_VERSION.val));
        }
        return sb.toString();
    }

    /* renamed from: m */
    public static String m374m(String str, String str2) {
        StringBuilder sb = new StringBuilder(URLEncoder.encode(str));
        sb.append(MAPCookie.COOKIE_NAME_VALUE_SEPERATOR);
        if (str2 != null) {
            sb.append(URLEncoder.encode(str2));
        }
        return sb.toString();
    }

    /* renamed from: n */
    public static void m375n(String str, String str2, String str3, C1412a aVar) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                bundle.putString(AuthzConstants$BUNDLE_KEY.AUTHORIZATION_CODE.val, str);
                bundle.putString(AuthzConstants$BUNDLE_KEY.CLIENT_ID.val, str2);
                bundle.putString(AuthzConstants$BUNDLE_KEY.REDIRECT_URI.val, str3);
                C1485a.m832e(f417a, "Return auth code success");
                if (aVar != null) {
                    aVar.mo15068c(bundle);
                    return;
                }
                return;
            }
            throw new AuthError("Response bundle from Authorization does not contain authorization code", AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
        } catch (AuthError e) {
            String str4 = f417a;
            C1485a.m829b(str4, "Return auth code error. " + e.getMessage());
            if (aVar != null) {
                aVar.mo15067b(e);
            }
        }
    }

    /* renamed from: b */
    public void mo15108b(Context context, String str, String str2, Bundle bundle, boolean z, String str3, C1443r rVar, C1377c cVar, Bundle bundle2, C1412a aVar) {
        C1467d.f646b.execute(new C1384a(bundle, context, str, str2, str3, rVar, cVar, z, bundle2, aVar));
    }

    /* renamed from: o */
    public final void mo15109o(Context context, String str, String str2, String str3, C1443r rVar, C1377c cVar, Bundle bundle, boolean z, Bundle bundle2, C1412a aVar) {
        String str4 = str;
        Bundle bundle3 = bundle;
        C1412a aVar2 = aVar;
        if (!C1467d.m792b()) {
            String string = bundle3.getString("code");
            if (!TextUtils.isEmpty(string)) {
                String string2 = bundle3.getString("clientId");
                String string3 = bundle3.getString("redirectUri");
                String[] stringArray = bundle3.getStringArray("scope");
                String string4 = bundle3.getString("responseUrl");
                String str5 = f417a;
                C1485a.m836i(str5, "Params extracted from OAuth2 response", "code=" + string + "clientId=" + string2 + " redirectUri=" + string3 + " directedId=" + str3 + " scopes=" + Arrays.toString(stringArray));
                Context context2 = context;
                AppInfo a = cVar.mo15096a(str4, context);
                if (a != null) {
                    try {
                        Bundle j = rVar.mo15289j(string, str2, string3, stringArray, str3, context, a, bundle2);
                        if (z) {
                            j.putString("responseUrl", string4);
                        }
                        aVar2.mo15068c(j);
                    } catch (IOException e) {
                        aVar2.mo15067b(new AuthError("Failed to exchange code for token", e, AuthError.ERROR_TYPE.ERROR_IO));
                    } catch (AuthError e2) {
                        String str6 = f417a;
                        C1485a.m829b(str6, "Failed doing code for token exchange " + e2.getMessage());
                        aVar2.mo15067b(e2);
                    }
                } else {
                    String str7 = f417a;
                    C1485a.m829b(str7, "Unable to extract AppInfo for " + str4);
                    aVar2.mo15067b(new AuthError("Unable to extract AppInfo", AuthError.ERROR_TYPE.ERROR_UNKNOWN));
                }
            } else {
                aVar2.mo15067b(new AuthError("Response bundle from Authorization was empty", AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE));
            }
        } else {
            C1485a.m829b(f417a, "code for token exchange started on main thread");
            throw new IllegalStateException("authorize started on main thread");
        }
    }
}
