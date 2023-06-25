package p040c.p200q.p201a.p264c.p294g.p333g;

import android.text.TextUtils;
import com.hisense.connect_life.core.global.EventBusConstKt;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.g.g.p */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4677p implements C4962zn {

    /* renamed from: e */
    public String f9531e;

    /* renamed from: l */
    public String f9532l;

    /* renamed from: m */
    public String f9533m;

    /* renamed from: n */
    public String f9534n;

    /* renamed from: o */
    public String f9535o;

    /* renamed from: p */
    public boolean f9536p;

    /* renamed from: a */
    public static C4677p m12752a(String str, String str2, boolean z) {
        C4677p pVar = new C4677p();
        C3495o.m8904f(str);
        pVar.f9532l = str;
        C3495o.m8904f(str2);
        pVar.f9533m = str2;
        pVar.f9536p = z;
        return pVar;
    }

    /* renamed from: b */
    public static C4677p m12753b(String str, String str2, boolean z) {
        C4677p pVar = new C4677p();
        C3495o.m8904f(str);
        pVar.f9531e = str;
        C3495o.m8904f(str2);
        pVar.f9534n = str2;
        pVar.f9536p = z;
        return pVar;
    }

    /* renamed from: c */
    public final void mo26489c(String str) {
        this.f9535o = str;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f9534n)) {
            jSONObject.put("phoneNumber", this.f9531e);
            jSONObject.put("temporaryProof", this.f9534n);
        } else {
            jSONObject.put("sessionInfo", this.f9532l);
            jSONObject.put("code", this.f9533m);
        }
        String str = this.f9535o;
        if (str != null) {
            jSONObject.put(EventBusConstKt.ID_TOKEN, str);
        }
        if (!this.f9536p) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }
}
