package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzaay;
import com.google.android.gms.internal.p527firebaseauthapi.zzrw;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p363c.p367l.p368h.C6370a0;
import p040c.p200q.p363c.p367l.p368h.C6403z;

/* renamed from: c.q.a.c.g.g.an */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4296an extends C4594lo {

    /* renamed from: s */
    public final zzaay f9126s;

    public C4296an(AuthCredential authCredential) {
        super(2);
        C3495o.m8909k(authCredential, "credential cannot be null");
        this.f9126s = C6370a0.m17892a(authCredential, (String) null);
    }

    /* renamed from: a */
    public final void mo25799a(C5773k kVar, C4701pn pnVar) {
        this.f9417r = new C4567ko(this, kVar);
        pnVar.mo26533c(new zzrw(this.f9403d.mo37360Y(), this.f9126s), this.f9401b);
    }

    /* renamed from: b */
    public final void mo25800b() {
        zzx e = C4593ln.m12436e(this.f9402c, this.f9409j);
        ((C6403z) this.f9404e).mo30448a(this.f9408i, e);
        mo26295k(new zzr(e));
    }

    public final String zza() {
        return "linkFederatedCredential";
    }
}
