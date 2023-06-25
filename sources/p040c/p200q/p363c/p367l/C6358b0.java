package p040c.p200q.p363c.p367l;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import p040c.p200q.p363c.p367l.p368h.C6399v;

/* renamed from: c.q.c.l.b0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6358b0 implements C6399v {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth f12029a;

    public C6358b0(FirebaseAuth firebaseAuth) {
        this.f12029a = firebaseAuth;
    }

    /* renamed from: a */
    public final void mo30448a(zzzy zzzy, FirebaseUser firebaseUser) {
        FirebaseAuth.m22624p(this.f12029a, firebaseUser, zzzy, true, true);
    }

    /* renamed from: b */
    public final void mo30449b(Status status) {
        int R = status.mo24533R();
        if (R == 17011 || R == 17021 || R == 17005) {
            this.f12029a.mo37333h();
        }
    }
}
