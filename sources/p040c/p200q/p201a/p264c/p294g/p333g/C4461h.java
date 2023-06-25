package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import com.google.android.gms.internal.p527firebaseauthapi.zzaag;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p289n.C3564o;

/* renamed from: c.q.a.c.g.g.h */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4461h implements C4297ao {

    /* renamed from: o */
    public static final String f9252o = "h";

    /* renamed from: e */
    public zzaag f9253e;

    /* renamed from: l */
    public String f9254l;

    /* renamed from: m */
    public String f9255m;

    /* renamed from: n */
    public long f9256n;

    /* renamed from: a */
    public final long mo26044a() {
        return this.f9256n;
    }

    @Nullable
    /* renamed from: b */
    public final String mo26045b() {
        return this.f9254l;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4297ao mo25802c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C3564o.m9093a(jSONObject.optString("email", (String) null));
            C3564o.m9093a(jSONObject.optString("passwordHash", (String) null));
            jSONObject.optBoolean("emailVerified", false);
            C3564o.m9093a(jSONObject.optString(FileProvider.DISPLAYNAME_FIELD, (String) null));
            C3564o.m9093a(jSONObject.optString("photoUrl", (String) null));
            this.f9253e = zzaag.m21921P(jSONObject.optJSONArray("providerUserInfo"));
            this.f9254l = C3564o.m9093a(jSONObject.optString(EventBusConstKt.ID_TOKEN, (String) null));
            this.f9255m = C3564o.m9093a(jSONObject.optString("refreshToken", (String) null));
            this.f9256n = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C4730r.m12949a(e, f9252o, str);
        }
    }

    @Nullable
    /* renamed from: d */
    public final String mo26046d() {
        return this.f9255m;
    }

    @Nullable
    /* renamed from: e */
    public final List mo26047e() {
        zzaag zzaag = this.f9253e;
        if (zzaag != null) {
            return zzaag.mo33354R();
        }
        return null;
    }
}
