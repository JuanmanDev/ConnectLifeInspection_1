package p040c.p048b.p049a.p050a.p051a.p060m;

import com.amazon.identity.auth.device.AuthError;
import org.json.JSONObject;
import p040c.p048b.p049a.p050a.p051a.p066s.C1470b;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.m.j */
/* compiled from: OauthCodeForTokenResponse */
public class C1435j extends C1437l {

    /* renamed from: j */
    public static final String f592j = "c.b.a.a.a.m.j";

    public C1435j(C1433h hVar, String str, String str2) {
        super(hVar, str, str2);
        String str3 = f592j;
        C1485a.m832e(str3, "Creating OauthCodeForTokenResponse appId=" + str);
    }

    /* renamed from: m */
    public C1470b mo15261m(JSONObject jSONObject) {
        C1470b m = super.mo15261m(jSONObject);
        if (m != null) {
            return m;
        }
        throw new AuthError("JSON response did not contain an AccessAtzToken", AuthError.ERROR_TYPE.ERROR_JSON);
    }

    /* renamed from: u */
    public boolean mo15262u(String str, String str2) {
        return false;
    }
}
