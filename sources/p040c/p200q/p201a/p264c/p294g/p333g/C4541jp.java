package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzzm;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.g.g.jp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4541jp implements C4962zn {

    /* renamed from: e */
    public final String f9320e = zzzm.REFRESH_TOKEN.toString();

    /* renamed from: l */
    public final String f9321l;

    public C4541jp(String str) {
        C3495o.m8904f(str);
        this.f9321l = str;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.f9320e);
        jSONObject.put("refreshToken", this.f9321l);
        return jSONObject.toString();
    }
}
