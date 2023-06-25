package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.annotation.Nullable;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.g.g.n */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4623n implements C4962zn {

    /* renamed from: e */
    public final String f9453e;

    /* renamed from: l */
    public final String f9454l;
    @Nullable

    /* renamed from: m */
    public final String f9455m;

    public C4623n(String str, String str2, @Nullable String str3) {
        C3495o.m8904f(str);
        this.f9453e = str;
        C3495o.m8904f(str2);
        this.f9454l = str2;
        this.f9455m = str3;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f9453e);
        jSONObject.put("password", this.f9454l);
        jSONObject.put("returnSecureToken", true);
        String str = this.f9455m;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
