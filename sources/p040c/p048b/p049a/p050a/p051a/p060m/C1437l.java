package p040c.p048b.p049a.p050a.p051a.p060m;

import android.text.TextUtils;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.InvalidTokenAuthError;
import com.amazon.identity.auth.device.dataobject.AuthorizationToken;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p048b.p049a.p050a.p051a.p066s.C1469a;
import p040c.p048b.p049a.p050a.p051a.p066s.C1470b;
import p040c.p048b.p049a.p050a.p068b.p069a.p070b.C1483a;
import p040c.p048b.p049a.p050a.p068b.p069a.p070b.C1484b;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.m.l */
/* compiled from: OauthTokenResponse */
public class C1437l extends C1427b {

    /* renamed from: i */
    public static final String f595i = "c.b.a.a.a.m.l";

    /* renamed from: e */
    public final String f596e;

    /* renamed from: f */
    public C1469a f597f;

    /* renamed from: g */
    public C1470b f598g = null;

    /* renamed from: h */
    public String f599h;

    public C1437l(C1433h hVar, String str, String str2) {
        super(hVar);
        this.f596e = str;
        this.f599h = str2;
    }

    /* renamed from: a */
    public void mo15224a(JSONObject jSONObject) {
        this.f597f = mo15265l(jSONObject);
        this.f598g = mo15261m(jSONObject);
    }

    /* renamed from: b */
    public JSONObject mo15225b(JSONObject jSONObject) {
        try {
            return super.mo15225b(jSONObject);
        } catch (JSONException unused) {
            C1485a.m838k(f595i, "No Response type in the response");
            return jSONObject;
        }
    }

    /* renamed from: f */
    public String mo15229f() {
        return "3.0.6";
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15231h(org.json.JSONObject r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = "error"
            java.lang.String r1 = r6.getString(r1)     // Catch:{ JSONException -> 0x011d }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x011c }
            if (r2 != 0) goto L_0x0123
            java.lang.String r2 = "error_description"
            java.lang.String r2 = r6.getString(r2)     // Catch:{ JSONException -> 0x011c }
            boolean r3 = r5.mo15271s(r1, r2)     // Catch:{ JSONException -> 0x011c }
            java.lang.String r4 = "info="
            if (r3 != 0) goto L_0x00f1
            boolean r3 = r5.mo15262u(r1, r2)     // Catch:{ JSONException -> 0x011c }
            if (r3 != 0) goto L_0x00ed
            boolean r0 = r5.mo15270r(r1, r2)     // Catch:{ JSONException -> 0x011c }
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r5.mo15272t(r1, r2)     // Catch:{ JSONException -> 0x011c }
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5.mo15269q(r1, r2)     // Catch:{ JSONException -> 0x011c }
            if (r0 != 0) goto L_0x0093
            boolean r0 = r5.mo15273v(r1, r2)     // Catch:{ JSONException -> 0x011c }
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = "Unauthorized Client.  The authenticated client is not authorized to use this authorization grant type. "
            java.lang.String r2 = f595i     // Catch:{ JSONException -> 0x011c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x011c }
            r3.<init>()     // Catch:{ JSONException -> 0x011c }
            r3.append(r4)     // Catch:{ JSONException -> 0x011c }
            r3.append(r6)     // Catch:{ JSONException -> 0x011c }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x011c }
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m836i(r2, r0, r3)     // Catch:{ JSONException -> 0x011c }
            com.amazon.identity.auth.device.AuthError r2 = new com.amazon.identity.auth.device.AuthError     // Catch:{ JSONException -> 0x011c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x011c }
            r3.<init>()     // Catch:{ JSONException -> 0x011c }
            r3.append(r0)     // Catch:{ JSONException -> 0x011c }
            r3.append(r6)     // Catch:{ JSONException -> 0x011c }
            java.lang.String r6 = r3.toString()     // Catch:{ JSONException -> 0x011c }
            com.amazon.identity.auth.device.AuthError$ERROR_TYPE r0 = com.amazon.identity.auth.device.AuthError.ERROR_TYPE.ERROR_UNAUTHORIZED_CLIENT     // Catch:{ JSONException -> 0x011c }
            r2.<init>(r6, r0)     // Catch:{ JSONException -> 0x011c }
            throw r2     // Catch:{ JSONException -> 0x011c }
        L_0x0066:
            java.lang.String r0 = "Server error doing authorization exchange. "
            java.lang.String r2 = f595i     // Catch:{ JSONException -> 0x011c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x011c }
            r3.<init>()     // Catch:{ JSONException -> 0x011c }
            r3.append(r4)     // Catch:{ JSONException -> 0x011c }
            r3.append(r6)     // Catch:{ JSONException -> 0x011c }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x011c }
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m836i(r2, r0, r3)     // Catch:{ JSONException -> 0x011c }
            com.amazon.identity.auth.device.AuthError r2 = new com.amazon.identity.auth.device.AuthError     // Catch:{ JSONException -> 0x011c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x011c }
            r3.<init>()     // Catch:{ JSONException -> 0x011c }
            r3.append(r0)     // Catch:{ JSONException -> 0x011c }
            r3.append(r6)     // Catch:{ JSONException -> 0x011c }
            java.lang.String r6 = r3.toString()     // Catch:{ JSONException -> 0x011c }
            com.amazon.identity.auth.device.AuthError$ERROR_TYPE r0 = com.amazon.identity.auth.device.AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE     // Catch:{ JSONException -> 0x011c }
            r2.<init>(r6, r0)     // Catch:{ JSONException -> 0x011c }
            throw r2     // Catch:{ JSONException -> 0x011c }
        L_0x0093:
            java.lang.String r0 = "Invalid Scope. Authorization not valid for the requested scopes "
            java.lang.String r2 = f595i     // Catch:{ JSONException -> 0x011c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x011c }
            r3.<init>()     // Catch:{ JSONException -> 0x011c }
            r3.append(r4)     // Catch:{ JSONException -> 0x011c }
            r3.append(r6)     // Catch:{ JSONException -> 0x011c }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x011c }
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m836i(r2, r0, r3)     // Catch:{ JSONException -> 0x011c }
            com.amazon.identity.auth.device.AuthError r2 = new com.amazon.identity.auth.device.AuthError     // Catch:{ JSONException -> 0x011c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x011c }
            r3.<init>()     // Catch:{ JSONException -> 0x011c }
            r3.append(r0)     // Catch:{ JSONException -> 0x011c }
            r3.append(r6)     // Catch:{ JSONException -> 0x011c }
            java.lang.String r6 = r3.toString()     // Catch:{ JSONException -> 0x011c }
            com.amazon.identity.auth.device.AuthError$ERROR_TYPE r0 = com.amazon.identity.auth.device.AuthError.ERROR_TYPE.ERROR_INVALID_SCOPE     // Catch:{ JSONException -> 0x011c }
            r2.<init>(r6, r0)     // Catch:{ JSONException -> 0x011c }
            throw r2     // Catch:{ JSONException -> 0x011c }
        L_0x00c0:
            java.lang.String r0 = "Invalid Client. ApiKey is invalid "
            java.lang.String r2 = f595i     // Catch:{ JSONException -> 0x011c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x011c }
            r3.<init>()     // Catch:{ JSONException -> 0x011c }
            r3.append(r4)     // Catch:{ JSONException -> 0x011c }
            r3.append(r6)     // Catch:{ JSONException -> 0x011c }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x011c }
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m836i(r2, r0, r3)     // Catch:{ JSONException -> 0x011c }
            com.amazon.identity.auth.device.AuthError r2 = new com.amazon.identity.auth.device.AuthError     // Catch:{ JSONException -> 0x011c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x011c }
            r3.<init>()     // Catch:{ JSONException -> 0x011c }
            r3.append(r0)     // Catch:{ JSONException -> 0x011c }
            r3.append(r6)     // Catch:{ JSONException -> 0x011c }
            java.lang.String r6 = r3.toString()     // Catch:{ JSONException -> 0x011c }
            com.amazon.identity.auth.device.AuthError$ERROR_TYPE r0 = com.amazon.identity.auth.device.AuthError.ERROR_TYPE.ERROR_INVALID_CLIENT     // Catch:{ JSONException -> 0x011c }
            r2.<init>(r6, r0)     // Catch:{ JSONException -> 0x011c }
            throw r2     // Catch:{ JSONException -> 0x011c }
        L_0x00ed:
            r5.mo15268p(r6)     // Catch:{ JSONException -> 0x011c }
            throw r0
        L_0x00f1:
            java.lang.String r0 = "Invalid source authorization in exchange."
            java.lang.String r2 = f595i     // Catch:{ JSONException -> 0x011c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x011c }
            r3.<init>()     // Catch:{ JSONException -> 0x011c }
            r3.append(r4)     // Catch:{ JSONException -> 0x011c }
            r3.append(r6)     // Catch:{ JSONException -> 0x011c }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x011c }
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m836i(r2, r0, r3)     // Catch:{ JSONException -> 0x011c }
            com.amazon.identity.auth.device.InvalidGrantAuthError r2 = new com.amazon.identity.auth.device.InvalidGrantAuthError     // Catch:{ JSONException -> 0x011c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x011c }
            r3.<init>()     // Catch:{ JSONException -> 0x011c }
            r3.append(r0)     // Catch:{ JSONException -> 0x011c }
            r3.append(r6)     // Catch:{ JSONException -> 0x011c }
            java.lang.String r6 = r3.toString()     // Catch:{ JSONException -> 0x011c }
            r2.<init>(r6)     // Catch:{ JSONException -> 0x011c }
            throw r2     // Catch:{ JSONException -> 0x011c }
        L_0x011c:
            r0 = r1
        L_0x011d:
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 == 0) goto L_0x0124
        L_0x0123:
            return
        L_0x0124:
            com.amazon.identity.auth.device.AuthError r6 = new com.amazon.identity.auth.device.AuthError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Server Error : "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.amazon.identity.auth.device.AuthError$ERROR_TYPE r1 = com.amazon.identity.auth.device.AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE
            r6.<init>(r0, r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p048b.p049a.p050a.p051a.p060m.C1437l.mo15231h(org.json.JSONObject):void");
    }

    /* renamed from: k */
    public C1484b mo15264k(String str, long j) {
        return new C1469a(this.f596e, this.f599h, str, j, (byte[]) null);
    }

    /* renamed from: l */
    public C1469a mo15265l(JSONObject jSONObject) {
        try {
            if (jSONObject.has("access_token")) {
                return (C1469a) mo15264k(jSONObject.getString("access_token"), C1483a.m827a(mo15226c(jSONObject)));
            }
            C1485a.m829b(f595i, "Unable to find AccessAtzToken in JSON response, throwing AuthError");
            throw new AuthError("JSON response did not contain an AccessAtzToken", AuthError.ERROR_TYPE.ERROR_JSON);
        } catch (JSONException unused) {
            C1485a.m829b(f595i, "Error reading JSON response, throwing AuthError");
            throw new AuthError("Error reading JSON response", AuthError.ERROR_TYPE.ERROR_JSON);
        }
    }

    /* renamed from: m */
    public C1470b mo15261m(JSONObject jSONObject) {
        C1485a.m832e(f595i, "Extracting RefreshToken");
        try {
            if (jSONObject.has("refresh_token")) {
                return new C1470b(mo15266n(), this.f599h, jSONObject.getString("refresh_token"), (byte[]) null);
            }
            C1485a.m829b(f595i, "Unable to find RefreshAtzToken in JSON response");
            return null;
        } catch (JSONException unused) {
            C1485a.m829b(f595i, "Error reading JSON response, throwing AuthError");
            throw new AuthError("Error reading JSON response", AuthError.ERROR_TYPE.ERROR_JSON);
        }
    }

    /* renamed from: n */
    public String mo15266n() {
        return this.f596e;
    }

    /* renamed from: o */
    public AuthorizationToken[] mo15267o() {
        return new AuthorizationToken[]{this.f597f, this.f598g};
    }

    /* renamed from: p */
    public void mo15268p(JSONObject jSONObject) {
        String str = f595i;
        C1485a.m836i(str, "Invalid Token in exchange.", "info=" + jSONObject);
        throw new InvalidTokenAuthError("Invalid Token in exchange." + jSONObject);
    }

    /* renamed from: q */
    public boolean mo15269q(String str, String str2) {
        return "insufficient_scope".equals(str);
    }

    /* renamed from: r */
    public boolean mo15270r(String str, String str2) {
        return "invalid_client".equals(str);
    }

    /* renamed from: s */
    public boolean mo15271s(String str, String str2) {
        return "invalid_grant".equals(str) || "unsupported_grant_type".equals(str);
    }

    /* renamed from: t */
    public boolean mo15272t(String str, String str2) {
        return "invalid_scope".equals(str);
    }

    /* renamed from: u */
    public boolean mo15262u(String str, String str2) {
        return "invalid_token".equals(str) || ("invalid_request".equals(str) && !TextUtils.isEmpty(str2) && str2.contains("access_token"));
    }

    /* renamed from: v */
    public boolean mo15273v(String str, String str2) {
        return "unauthorized_client".equals(str);
    }
}
