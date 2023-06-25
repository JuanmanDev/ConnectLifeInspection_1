package p040c.p048b.p049a.p050a.p051a.p056j;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$BUNDLE_KEY;
import com.amazon.identity.auth.device.utils.LWAConstants$AUTHORIZE_BUNDLE_KEY;
import p040c.p048b.p049a.p050a.p051a.p055i.C1378d;
import p040c.p048b.p049a.p050a.p051a.p056j.p057q.C1412a;
import p040c.p048b.p049a.p050a.p051a.p060m.C1443r;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.j.f */
/* compiled from: AuthorizationResponseProcessor */
public final class C1387f {

    /* renamed from: a */
    public static final String f435a = "c.b.a.a.a.j.f";

    /* renamed from: c.b.a.a.a.j.f$a */
    /* compiled from: AuthorizationResponseProcessor */
    public static class C1388a implements C1412a {

        /* renamed from: e */
        public final /* synthetic */ C1412a f436e;

        public C1388a(C1412a aVar) {
            this.f436e = aVar;
        }

        /* renamed from: b */
        public void mo15065a(AuthError authError) {
            String a = C1387f.f435a;
            C1485a.m838k(a, "Code for Token Exchange Error. " + authError.getMessage());
            C1412a aVar = this.f436e;
            if (aVar != null) {
                aVar.mo15067b(authError);
            }
        }

        /* renamed from: c */
        public void onSuccess(Bundle bundle) {
            C1485a.m838k(C1387f.f435a, "Code for Token Exchange success");
            C1412a aVar = this.f436e;
            if (aVar != null) {
                aVar.mo15068c(bundle);
            }
        }

        /* renamed from: e */
        public void mo15069e(Bundle bundle) {
            C1485a.m838k(C1387f.f435a, "Code for Token Exchange Cancel");
            C1412a aVar = this.f436e;
            if (aVar != null) {
                aVar.mo15069e(bundle);
            }
        }
    }

    /* renamed from: b */
    public static void m384b(Context context, Uri uri, String[] strArr, boolean z, C1412a aVar) {
        C1412a aVar2 = aVar;
        C1386e eVar = new C1386e();
        String str = f435a;
        C1485a.m836i(str, "Received response from WebBroswer for OAuth2 flow", "response=" + uri.toString());
        Uri uri2 = uri;
        String[] strArr2 = strArr;
        try {
            Bundle c = eVar.mo15113c(uri, strArr);
            if (c.containsKey(AuthzConstants$BUNDLE_KEY.CAUSE_ID.val)) {
                aVar2.mo15069e(c);
            } else if (c.getBoolean(AuthzConstants$BUNDLE_KEY.GET_AUTH_CODE.val, false)) {
                Context context2 = context;
                C1383c.m375n(c.getString("code"), C1390h.m398e(context).mo15121d(), C1390h.m398e(context).mo15123g(context), aVar2);
            } else {
                Context context3 = context;
                Bundle bundle = new Bundle();
                bundle.putBoolean(LWAConstants$AUTHORIZE_BUNDLE_KEY.RETURN_ACCESS_TOKEN.val, z);
                Context context4 = context;
                new C1383c().mo15108b(context4, context.getPackageName(), C1389g.m389f().mo15118e(), c, false, (String) null, new C1443r(), new C1378d(), bundle, new C1388a(aVar2));
            }
        } catch (AuthError e) {
            if (aVar2 != null) {
                aVar2.mo15067b(e);
            }
        }
    }
}
