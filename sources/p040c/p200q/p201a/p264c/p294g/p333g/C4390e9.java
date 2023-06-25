package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zznr;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.e9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4390e9 extends C4364da {
    public C4390e9() {
        super(C4722qh.class, new C4363d9(C4735r4.class));
    }

    /* renamed from: b */
    public final zznr mo25848b() {
        return zznr.ASYMMETRIC_PUBLIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C4572l2 mo25849c(zzacc zzacc) {
        return C4722qh.m12925J(zzacc, C4913y0.m13537a());
    }

    /* renamed from: d */
    public final String mo25850d() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo25851e(C4572l2 l2Var) {
        C4722qh qhVar = (C4722qh) l2Var;
        C4751rk.m13024c(qhVar.mo26581E(), 0);
        if (qhVar.mo26584O()) {
            C4417f9.m11947a(qhVar.mo26582F());
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }
}
