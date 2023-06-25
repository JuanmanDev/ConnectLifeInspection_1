package p040c.p200q.p201a.p264c.p294g.p333g;

import com.hisense.connect_life.core.global.EventBusConstKt;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.g.g.kp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4568kp implements C4962zn {

    /* renamed from: e */
    public final String f9344e;

    public C4568kp(String str) {
        C3495o.m8904f(str);
        this.f9344e = str;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(EventBusConstKt.ID_TOKEN, this.f9344e);
        return jSONObject.toString();
    }
}
