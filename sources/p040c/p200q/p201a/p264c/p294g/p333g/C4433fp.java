package p040c.p200q.p201a.p264c.p294g.p333g;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.p527firebaseauthapi.zzvg;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c.q.a.c.g.g.fp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4433fp implements C4297ao {

    /* renamed from: e */
    public String f9230e;

    /* renamed from: a */
    public final C4433fp mo26002a(@NonNull String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.f9230e = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e) {
            "Failed to parse error for string [" + str + "] with exception: " + e.getMessage();
            throw new zzvg("Failed to parse error for string [" + str + "]", e);
        }
    }

    /* renamed from: b */
    public final String mo26003b() {
        return this.f9230e;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4297ao mo25802c(@NonNull String str) {
        mo26002a(str);
        return this;
    }

    /* renamed from: d */
    public final boolean mo26004d() {
        return !TextUtils.isEmpty(this.f9230e);
    }
}
