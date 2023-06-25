package p040c.p048b.p049a.p050a.p051a.p056j;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$BUNDLE_KEY;
import java.util.Map;
import p040c.p048b.p049a.p050a.p051a.p060m.C1441p;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.j.e */
/* compiled from: AuthorizationResponseParser */
public class C1386e {

    /* renamed from: a */
    public static final String f434a = "c.b.a.a.a.j.e";

    /* renamed from: a */
    public final Bundle mo15111a(Bundle bundle, String str, String str2) {
        if (!"access_denied".equals(str) || TextUtils.isEmpty(str2) || (!"Access not permitted.".equals(str2) && !"Access+not+permitted.".equals(str2))) {
            AuthError.ERROR_TYPE error_type = AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE;
            if ("invalid_atn_token".equals(str)) {
                error_type = AuthError.ERROR_TYPE.ERROR_INVALID_TOKEN;
            }
            throw new AuthError("Error=" + str + " error_description=" + str2, error_type);
        }
        C1485a.m828a(f434a, "Cancel response due to access denied");
        bundle.putInt(AuthzConstants$BUNDLE_KEY.CAUSE_ID.val, 0);
        bundle.putString(AuthzConstants$BUNDLE_KEY.ON_CANCEL_TYPE.val, str);
        bundle.putString(AuthzConstants$BUNDLE_KEY.ON_CANCEL_DESCRIPTION.val, str2);
        return bundle;
    }

    /* renamed from: b */
    public final Bundle mo15112b(Bundle bundle, Map<String, String> map, String str, String[] strArr) {
        bundle.putString("clientId", map.get("clientId"));
        bundle.putString("redirectUri", map.get("redirectUri"));
        bundle.putBoolean(AuthzConstants$BUNDLE_KEY.GET_AUTH_CODE.val, Boolean.valueOf(map.get(AuthzConstants$BUNDLE_KEY.GET_AUTH_CODE.val)).booleanValue());
        if (str != null) {
            bundle.putStringArray("scope", C1400l.m435a(str));
        } else {
            C1485a.m828a(f434a, "No scopes from OAuth2 response, using requested scopes");
            bundle.putStringArray("scope", strArr);
        }
        return bundle;
    }

    /* renamed from: c */
    public Bundle mo15113c(Uri uri, String[] strArr) {
        Bundle bundle = new Bundle();
        String str = f434a;
        C1485a.m836i(str, "Received response from OAuth2 flow", "response=" + uri.toString());
        bundle.putString("responseUrl", Base64.encodeToString(uri.toString().getBytes(), 0));
        String queryParameter = uri.getQueryParameter("code");
        bundle.putString("code", queryParameter);
        String str2 = f434a;
        C1485a.m836i(str2, "Code extracted from response", "code=" + queryParameter);
        String queryParameter2 = uri.getQueryParameter("error");
        if (!TextUtils.isEmpty(queryParameter2)) {
            mo15111a(bundle, queryParameter2, uri.getQueryParameter("error_description"));
            return bundle;
        } else if (!TextUtils.isEmpty(queryParameter)) {
            mo15112b(bundle, new C1441p(uri).mo15278a(), uri.getQueryParameter("scope"), strArr);
            return bundle;
        } else {
            throw new AuthError("No code in OAuth2 response", AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
        }
    }
}
