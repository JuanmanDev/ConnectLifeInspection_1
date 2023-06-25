package p040c.p048b.p049a.p050a.p051a.p052h.p053b;

import android.content.Context;
import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.api.authorization.AuthCancellation;
import com.amazon.identity.auth.device.api.authorization.AuthorizeRequest;
import com.amazon.identity.auth.device.api.authorization.AuthorizeResult;
import com.amazon.identity.auth.device.api.authorization.Region;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$BUNDLE_KEY;
import com.amazon.identity.auth.device.utils.LWAConstants$AUTHORIZE_BUNDLE_KEY;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p048b.p049a.p050a.p051a.C1360g;
import p040c.p048b.p049a.p050a.p051a.p052h.C1361a;
import p040c.p048b.p049a.p050a.p051a.p056j.C1390h;
import p040c.p048b.p049a.p050a.p051a.p056j.p057q.C1412a;
import p040c.p048b.p049a.p050a.p051a.p064q.C1462a;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.h.b.a */
/* compiled from: AuthorizationManager */
public final class C1362a {

    /* renamed from: a */
    public static final String f392a = "c.b.a.a.a.h.b.a";

    /* renamed from: b */
    public static Boolean f393b;

    /* renamed from: c.b.a.a.a.h.b.a$a */
    /* compiled from: AuthorizationManager */
    public static class C1363a implements C1412a {

        /* renamed from: e */
        public final /* synthetic */ Context f394e;

        /* renamed from: l */
        public final /* synthetic */ AuthorizeRequest f395l;

        public C1363a(Context context, AuthorizeRequest authorizeRequest) {
            this.f394e = context;
            this.f395l = authorizeRequest;
        }

        /* renamed from: b */
        public void mo15065a(AuthError authError) {
            this.f395l.mo15070a(authError);
        }

        /* renamed from: c */
        public void onSuccess(Bundle bundle) {
            Context context = this.f394e;
            AuthorizeRequest authorizeRequest = this.f395l;
            C1365b.m306h(context, bundle, authorizeRequest, authorizeRequest.mo21407s());
        }

        /* renamed from: e */
        public void mo15069e(Bundle bundle) {
            this.f395l.onCancel(new AuthCancellation(bundle));
        }
    }

    /* renamed from: c.b.a.a.a.h.b.a$b */
    /* compiled from: AuthorizationManager */
    public static class C1364b implements C1462a {

        /* renamed from: e */
        public final /* synthetic */ C1361a f396e;

        public C1364b(C1361a aVar) {
            this.f396e = aVar;
        }

        /* renamed from: b */
        public void mo15065a(AuthError authError) {
            this.f396e.mo15065a(authError);
        }

        /* renamed from: c */
        public void onSuccess(Bundle bundle) {
            this.f396e.onSuccess(new AuthorizeResult(bundle));
        }
    }

    /* renamed from: a */
    public static void m293a(AuthorizeRequest authorizeRequest) {
        Context h = authorizeRequest.mo15306h();
        String str = f392a;
        C1485a.m832e(str, h.getPackageName() + " calling authorize");
        List<C1369d> q = authorizeRequest.mo21405q();
        int size = q.size();
        String[] strArr = new String[size];
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < size; i++) {
            C1369d dVar = q.get(i);
            String name = dVar.getName();
            strArr[i] = name;
            if (dVar.mo15080a() != null) {
                try {
                    jSONObject.put(name, dVar.mo15080a());
                } catch (JSONException e) {
                    String str2 = f392a;
                    C1485a.m837j(str2, "Unable to serialize scope data for scope \"" + name + "\"", dVar.mo15080a().toString(), e);
                }
            }
        }
        Bundle bundle = new Bundle();
        if (jSONObject.length() > 0) {
            bundle.putString(AuthzConstants$BUNDLE_KEY.SCOPE_DATA.val, jSONObject.toString());
        }
        if (authorizeRequest.mo21404p() == AuthorizeRequest.GrantType.AUTHORIZATION_CODE) {
            bundle.putBoolean(AuthzConstants$BUNDLE_KEY.GET_AUTH_CODE.val, true);
        }
        if (authorizeRequest.mo21402n() != null) {
            bundle.putString(AuthzConstants$BUNDLE_KEY.CODE_CHALLENGE.val, authorizeRequest.mo21402n());
        }
        if (authorizeRequest.mo21403o() != null) {
            bundle.putString(AuthzConstants$BUNDLE_KEY.CODE_CHALLENGE_METHOD.val, authorizeRequest.mo21403o());
        }
        bundle.putBoolean(LWAConstants$AUTHORIZE_BUNDLE_KEY.RETURN_ACCESS_TOKEN.val, true);
        bundle.putBoolean(LWAConstants$AUTHORIZE_BUNDLE_KEY.SHOW_PROGRESS.val, authorizeRequest.mo21408t());
        bundle.putString(AuthzConstants$BUNDLE_KEY.X_AMAZON_OPTIONS.val, m294b(authorizeRequest));
        C1390h.m398e(h).mo15120c(authorizeRequest, h, strArr, bundle, new C1363a(h, authorizeRequest));
    }

    /* renamed from: b */
    public static String m294b(AuthorizeRequest authorizeRequest) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (C1372f next : authorizeRequest.mo21406r()) {
            String name = next.getName();
            JSONObject a = next.mo15084a();
            try {
                jSONObject2.put(name, a);
            } catch (JSONException e) {
                String str = f392a;
                C1485a.m837j(str, "Unable to serialize workflow data for workflow \"" + name + "\"", a.toString(), e);
            }
        }
        try {
            jSONObject.put("workflow_data", jSONObject2);
        } catch (JSONException e2) {
            C1485a.m837j(f392a, "Unable to add workflow_data to com.amazon.oauth2.options parameter", jSONObject2.toString(), e2);
        }
        return jSONObject.toString();
    }

    /* renamed from: c */
    public static Region m295c(Context context) {
        return C1390h.m398e(context).mo15124h(context);
    }

    /* renamed from: d */
    public static void m296d(Context context, C1369d[] dVarArr, C1361a<AuthorizeResult, AuthError> aVar) {
        String str = f392a;
        C1485a.m832e(str, context.getPackageName() + " calling getToken");
        String[] strArr = new String[dVarArr.length];
        for (int i = 0; i < dVarArr.length; i++) {
            strArr[i] = dVarArr[i].getName();
        }
        C1390h.m398e(context).mo15125i(context, strArr, new C1364b(aVar));
    }

    /* renamed from: e */
    public static boolean m297e(Context context) {
        if (f393b == null) {
            f393b = Boolean.valueOf(C1360g.m287e(context));
        }
        return f393b.booleanValue();
    }
}
