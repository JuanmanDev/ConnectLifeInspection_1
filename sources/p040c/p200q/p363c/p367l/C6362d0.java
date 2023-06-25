package p040c.p200q.p363c.p367l;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p363c.p367l.p368h.C6399v;

/* renamed from: c.q.c.l.d0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6362d0 implements C6399v {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth f12032a;

    public C6362d0(FirebaseAuth firebaseAuth) {
        this.f12032a = firebaseAuth;
    }

    /* renamed from: a */
    public final void mo30448a(zzzy zzzy, FirebaseUser firebaseUser) {
        C3495o.m8908j(zzzy);
        C3495o.m8908j(firebaseUser);
        firebaseUser.mo37362a0(zzzy);
        FirebaseAuth.m22624p(this.f12032a, firebaseUser, zzzy, true, true);
    }

    /* renamed from: b */
    public final void mo30449b(Status status) {
        if (status.mo24533R() == 17011 || status.mo24533R() == 17021 || status.mo24533R() == 17005 || status.mo24533R() == 17091) {
            this.f12032a.mo37333h();
        }
    }
}
