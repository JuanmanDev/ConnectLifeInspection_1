package p040c.p200q.p201a.p264c.p294g.p333g;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import com.google.android.gms.internal.p527firebaseauthapi.zzaac;
import com.google.firebase.auth.zze;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p289n.C3564o;

/* renamed from: c.q.a.c.g.g.l */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4569l implements C4297ao {

    /* renamed from: A */
    public static final String f9345A = "l";

    /* renamed from: e */
    public boolean f9346e;

    /* renamed from: l */
    public String f9347l;

    /* renamed from: m */
    public String f9348m;

    /* renamed from: n */
    public long f9349n;

    /* renamed from: o */
    public String f9350o;

    /* renamed from: p */
    public String f9351p;

    /* renamed from: q */
    public String f9352q;

    /* renamed from: r */
    public boolean f9353r;

    /* renamed from: s */
    public String f9354s;

    /* renamed from: t */
    public String f9355t;

    /* renamed from: u */
    public String f9356u;

    /* renamed from: v */
    public String f9357v;

    /* renamed from: w */
    public String f9358w;

    /* renamed from: x */
    public String f9359x;

    /* renamed from: y */
    public List f9360y;

    /* renamed from: z */
    public String f9361z;

    /* renamed from: a */
    public final long mo26188a() {
        return this.f9349n;
    }

    @Nullable
    /* renamed from: b */
    public final zze mo26189b() {
        if (!TextUtils.isEmpty(this.f9354s) || !TextUtils.isEmpty(this.f9355t)) {
            return zze.m22733S(this.f9351p, this.f9355t, this.f9354s, this.f9358w, this.f9356u);
        }
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4297ao mo25802c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f9346e = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.f9347l = C3564o.m9093a(jSONObject.optString(EventBusConstKt.ID_TOKEN, (String) null));
            this.f9348m = C3564o.m9093a(jSONObject.optString("refreshToken", (String) null));
            this.f9349n = jSONObject.optLong("expiresIn", 0);
            C3564o.m9093a(jSONObject.optString("localId", (String) null));
            this.f9350o = C3564o.m9093a(jSONObject.optString("email", (String) null));
            C3564o.m9093a(jSONObject.optString(FileProvider.DISPLAYNAME_FIELD, (String) null));
            C3564o.m9093a(jSONObject.optString("photoUrl", (String) null));
            this.f9351p = C3564o.m9093a(jSONObject.optString("providerId", (String) null));
            this.f9352q = C3564o.m9093a(jSONObject.optString("rawUserInfo", (String) null));
            this.f9353r = jSONObject.optBoolean("isNewUser", false);
            this.f9354s = jSONObject.optString("oauthAccessToken", (String) null);
            this.f9355t = jSONObject.optString("oauthIdToken", (String) null);
            this.f9357v = C3564o.m9093a(jSONObject.optString("errorMessage", (String) null));
            this.f9358w = C3564o.m9093a(jSONObject.optString("pendingToken", (String) null));
            this.f9359x = C3564o.m9093a(jSONObject.optString("tenantId", (String) null));
            this.f9360y = zzaac.m21907U(jSONObject.optJSONArray("mfaInfo"));
            this.f9361z = C3564o.m9093a(jSONObject.optString("mfaPendingCredential", (String) null));
            this.f9356u = C3564o.m9093a(jSONObject.optString("oauthTokenSecret", (String) null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C4730r.m12949a(e, f9345A, str);
        }
    }

    /* renamed from: d */
    public final String mo26190d() {
        return this.f9350o;
    }

    /* renamed from: e */
    public final String mo26191e() {
        return this.f9357v;
    }

    /* renamed from: f */
    public final String mo26192f() {
        return this.f9347l;
    }

    /* renamed from: g */
    public final String mo26193g() {
        return this.f9361z;
    }

    /* renamed from: h */
    public final String mo26194h() {
        return this.f9351p;
    }

    /* renamed from: i */
    public final String mo26195i() {
        return this.f9352q;
    }

    @Nullable
    /* renamed from: j */
    public final String mo26196j() {
        return this.f9348m;
    }

    @Nullable
    /* renamed from: k */
    public final String mo26197k() {
        return this.f9359x;
    }

    /* renamed from: l */
    public final List mo26198l() {
        return this.f9360y;
    }

    /* renamed from: m */
    public final boolean mo26199m() {
        return !TextUtils.isEmpty(this.f9361z);
    }

    /* renamed from: n */
    public final boolean mo26200n() {
        return this.f9346e;
    }

    /* renamed from: o */
    public final boolean mo26201o() {
        return this.f9353r;
    }

    /* renamed from: p */
    public final boolean mo26202p() {
        return this.f9346e || !TextUtils.isEmpty(this.f9357v);
    }
}
