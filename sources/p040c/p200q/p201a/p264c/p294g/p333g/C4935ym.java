package p040c.p200q.p201a.p264c.p294g.p333g;

import android.text.TextUtils;
import com.google.android.gms.internal.p527firebaseauthapi.zzrq;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p363c.p367l.p368h.C6390m;
import p040c.p200q.p363c.p367l.p368h.C6403z;

/* renamed from: c.q.a.c.g.g.ym */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4935ym extends C4594lo {

    /* renamed from: s */
    public final zzrq f9754s;

    public C4935ym(String str) {
        super(1);
        C3495o.m8905g(str, "refresh token cannot be null");
        this.f9754s = new zzrq(str);
    }

    /* renamed from: a */
    public final void mo25799a(C5773k kVar, C4701pn pnVar) {
        this.f9417r = new C4567ko(this, kVar);
        pnVar.mo26531a(this.f9754s, this.f9401b);
    }

    /* renamed from: b */
    public final void mo25800b() {
        if (TextUtils.isEmpty(this.f9408i.mo33500T())) {
            this.f9408i.mo33503W(this.f9754s.zza());
        }
        ((C6403z) this.f9404e).mo30448a(this.f9408i, this.f9403d);
        mo26295k(C6390m.m17917a(this.f9408i.mo33499S()));
    }

    public final String zza() {
        return "getAccessToken";
    }
}
