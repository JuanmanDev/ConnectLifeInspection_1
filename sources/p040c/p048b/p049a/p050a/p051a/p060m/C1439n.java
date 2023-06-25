package p040c.p048b.p049a.p050a.p051a.p060m;

import android.text.TextUtils;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.InsufficientScopeAuthError;
import com.amazon.identity.auth.device.InvalidTokenAuthError;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.m.n */
/* compiled from: ProfileResponse */
public class C1439n extends C1427b {

    /* renamed from: f */
    public static final String f603f = "c.b.a.a.a.m.n";

    /* renamed from: e */
    public JSONObject f604e;

    public C1439n(C1433h hVar) {
        super(hVar);
    }

    /* renamed from: a */
    public void mo15224a(JSONObject jSONObject) {
        this.f604e = jSONObject;
    }

    /* renamed from: b */
    public JSONObject mo15225b(JSONObject jSONObject) {
        return jSONObject;
    }

    /* renamed from: f */
    public String mo15229f() {
        return "3.0.6";
    }

    /* renamed from: h */
    public void mo15231h(JSONObject jSONObject) {
        String str = null;
        try {
            str = jSONObject.getString("error");
            if (!TextUtils.isEmpty(str)) {
                String string = jSONObject.getString("error_description");
                if (mo15276l(str, string)) {
                    String str2 = f603f;
                    C1485a.m836i(str2, "Insufficient scope in token in exchange.", "info=" + jSONObject);
                    throw new InsufficientScopeAuthError("Profile request not valid for authorized scopes");
                } else if (mo15277m(str, string)) {
                    String str3 = f603f;
                    C1485a.m836i(str3, "Invalid Token in exchange.", "info=" + jSONObject);
                    throw new InvalidTokenAuthError("Invalid Token in exchange. " + jSONObject);
                } else {
                    String str4 = f603f;
                    C1485a.m836i(str4, "Server error doing authorization exchange.", "info=" + jSONObject);
                    throw new AuthError("Server error doing authorization exchange. " + jSONObject, AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
                }
            }
        } catch (JSONException unused) {
            if (!TextUtils.isEmpty(str)) {
                throw new AuthError("Server Error : " + str, AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
            }
        }
    }

    /* renamed from: k */
    public JSONObject mo15275k() {
        return this.f604e;
    }

    /* renamed from: l */
    public final boolean mo15276l(String str, String str2) {
        return "insufficient_scope".equals(str);
    }

    /* renamed from: m */
    public final boolean mo15277m(String str, String str2) {
        return "invalid_token".equals(str) || ("invalid_request".equals(str) && !TextUtils.isEmpty(str2) && str2.contains("access_token"));
    }
}
