package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.annotation.Nullable;
import com.hisense.connect_life.core.global.EventBusConstKt;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p289n.C3564o;

/* renamed from: c.q.a.c.g.g.q */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4704q implements C4297ao {

    /* renamed from: q */
    public static final String f9566q = "q";

    /* renamed from: e */
    public String f9567e;

    /* renamed from: l */
    public String f9568l;

    /* renamed from: m */
    public long f9569m;

    /* renamed from: n */
    public boolean f9570n;

    /* renamed from: o */
    public String f9571o;

    /* renamed from: p */
    public String f9572p;

    /* renamed from: a */
    public final long mo26541a() {
        return this.f9569m;
    }

    @Nullable
    /* renamed from: b */
    public final String mo26542b() {
        return this.f9567e;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4297ao mo25802c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f9567e = C3564o.m9093a(jSONObject.optString(EventBusConstKt.ID_TOKEN, (String) null));
            this.f9568l = C3564o.m9093a(jSONObject.optString("refreshToken", (String) null));
            this.f9569m = jSONObject.optLong("expiresIn", 0);
            C3564o.m9093a(jSONObject.optString("localId", (String) null));
            this.f9570n = jSONObject.optBoolean("isNewUser", false);
            this.f9571o = C3564o.m9093a(jSONObject.optString("temporaryProof", (String) null));
            this.f9572p = C3564o.m9093a(jSONObject.optString("phoneNumber", (String) null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C4730r.m12949a(e, f9566q, str);
        }
    }

    @Nullable
    /* renamed from: d */
    public final String mo26543d() {
        return this.f9572p;
    }

    @Nullable
    /* renamed from: e */
    public final String mo26544e() {
        return this.f9568l;
    }

    @Nullable
    /* renamed from: f */
    public final String mo26545f() {
        return this.f9571o;
    }

    /* renamed from: g */
    public final boolean mo26546g() {
        return this.f9570n;
    }
}
