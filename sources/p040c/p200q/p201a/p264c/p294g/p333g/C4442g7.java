package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zznr;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.g7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4442g7 extends C4364da {
    public C4442g7() {
        super(C4427fj.class, new C4388e7(C4574l4.class));
    }

    /* renamed from: a */
    public final C4337ca mo25847a() {
        return new C4415f7(this, C4508ij.class);
    }

    /* renamed from: b */
    public final zznr mo25848b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C4572l2 mo25849c(zzacc zzacc) {
        return C4427fj.m11990H(zzacc, C4913y0.m13537a());
    }

    /* renamed from: d */
    public final String mo25850d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo25851e(C4572l2 l2Var) {
        C4427fj fjVar = (C4427fj) l2Var;
        C4751rk.m13024c(fjVar.mo25995E(), 0);
        if (fjVar.mo25996I().zzd() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
