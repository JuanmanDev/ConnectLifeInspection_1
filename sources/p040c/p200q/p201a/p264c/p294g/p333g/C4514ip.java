package p040c.p200q.p201a.p264c.p294g.p333g;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zzaac;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c.q.a.c.g.g.ip */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4514ip implements C4297ao {

    /* renamed from: q */
    public static final String f9299q = "ip";

    /* renamed from: e */
    public String f9300e;

    /* renamed from: l */
    public String f9301l;

    /* renamed from: m */
    public boolean f9302m;

    /* renamed from: n */
    public long f9303n;
    @Nullable

    /* renamed from: o */
    public List f9304o;
    @Nullable

    /* renamed from: p */
    public String f9305p;

    /* renamed from: a */
    public final long mo26117a() {
        return this.f9303n;
    }

    @NonNull
    /* renamed from: b */
    public final String mo26118b() {
        return this.f9300e;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4297ao mo25802c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("localId", (String) null);
            jSONObject.optString("email", (String) null);
            this.f9300e = jSONObject.optString(EventBusConstKt.ID_TOKEN, (String) null);
            this.f9301l = jSONObject.optString("refreshToken", (String) null);
            this.f9302m = jSONObject.optBoolean("isNewUser", false);
            this.f9303n = jSONObject.optLong("expiresIn", 0);
            this.f9304o = zzaac.m21907U(jSONObject.optJSONArray("mfaInfo"));
            this.f9305p = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C4730r.m12949a(e, f9299q, str);
        }
    }

    @Nullable
    /* renamed from: d */
    public final String mo26119d() {
        return this.f9305p;
    }

    @NonNull
    /* renamed from: e */
    public final String mo26120e() {
        return this.f9301l;
    }

    @Nullable
    /* renamed from: f */
    public final List mo26121f() {
        return this.f9304o;
    }

    /* renamed from: g */
    public final boolean mo26122g() {
        return !TextUtils.isEmpty(this.f9305p);
    }

    /* renamed from: h */
    public final boolean mo26123h() {
        return this.f9302m;
    }
}
