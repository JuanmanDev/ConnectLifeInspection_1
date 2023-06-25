package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.annotation.Nullable;
import com.google.firebase.auth.EmailAuthCredential;
import com.hisense.connect_life.core.global.EventBusConstKt;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p284k.C3537a;
import p040c.p200q.p363c.p367l.C6355a;

/* renamed from: c.q.a.c.g.g.hp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4487hp implements C4962zn {

    /* renamed from: e */
    public final String f9284e;

    /* renamed from: l */
    public final String f9285l;
    @Nullable

    /* renamed from: m */
    public final String f9286m;

    static {
        new C3537a(C4487hp.class.getSimpleName(), new String[0]);
    }

    public C4487hp(EmailAuthCredential emailAuthCredential, @Nullable String str) {
        String U = emailAuthCredential.mo37319U();
        C3495o.m8904f(U);
        this.f9284e = U;
        String W = emailAuthCredential.mo37321W();
        C3495o.m8904f(W);
        this.f9285l = W;
        this.f9286m = str;
    }

    public final String zza() {
        C6355a b = C6355a.m17871b(this.f9285l);
        String str = null;
        String a = b != null ? b.mo30445a() : null;
        if (b != null) {
            str = b.mo30446c();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f9284e);
        if (a != null) {
            jSONObject.put("oobCode", a);
        }
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.f9286m;
        if (str2 != null) {
            jSONObject.put(EventBusConstKt.ID_TOKEN, str2);
        }
        return jSONObject.toString();
    }
}
