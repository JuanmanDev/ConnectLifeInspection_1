package p040c.p200q.p201a.p264c.p294g.p333g;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import com.google.android.gms.internal.p527firebaseauthapi.zzaac;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p289n.C3564o;

/* renamed from: c.q.a.c.g.g.o */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4650o implements C4297ao {

    /* renamed from: p */
    public static final String f9484p = "o";

    /* renamed from: e */
    public String f9485e;

    /* renamed from: l */
    public String f9486l;

    /* renamed from: m */
    public long f9487m;

    /* renamed from: n */
    public List f9488n;

    /* renamed from: o */
    public String f9489o;

    /* renamed from: a */
    public final long mo26346a() {
        return this.f9487m;
    }

    @NonNull
    /* renamed from: b */
    public final String mo26347b() {
        return this.f9485e;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4297ao mo25802c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C3564o.m9093a(jSONObject.optString("localId", (String) null));
            C3564o.m9093a(jSONObject.optString("email", (String) null));
            C3564o.m9093a(jSONObject.optString(FileProvider.DISPLAYNAME_FIELD, (String) null));
            this.f9485e = C3564o.m9093a(jSONObject.optString(EventBusConstKt.ID_TOKEN, (String) null));
            C3564o.m9093a(jSONObject.optString("photoUrl", (String) null));
            this.f9486l = C3564o.m9093a(jSONObject.optString("refreshToken", (String) null));
            this.f9487m = jSONObject.optLong("expiresIn", 0);
            this.f9488n = zzaac.m21907U(jSONObject.optJSONArray("mfaInfo"));
            this.f9489o = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C4730r.m12949a(e, f9484p, str);
        }
    }

    /* renamed from: d */
    public final String mo26348d() {
        return this.f9489o;
    }

    @NonNull
    /* renamed from: e */
    public final String mo26349e() {
        return this.f9486l;
    }

    /* renamed from: f */
    public final List mo26350f() {
        return this.f9488n;
    }

    /* renamed from: g */
    public final boolean mo26351g() {
        return !TextUtils.isEmpty(this.f9489o);
    }
}
