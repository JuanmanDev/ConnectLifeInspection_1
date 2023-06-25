package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zznr;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.v6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4841v6 extends C4364da {
    public C4841v6() {
        super(C4746rf.class, new C4789t6(C4574l4.class));
    }

    /* renamed from: a */
    public final C4337ca mo25847a() {
        return new C4815u6(this, C4824uf.class);
    }

    /* renamed from: b */
    public final zznr mo25848b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C4572l2 mo25849c(zzacc zzacc) {
        return C4746rf.m13007H(zzacc, C4913y0.m13537a());
    }

    /* renamed from: d */
    public final String mo25850d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo25851e(C4572l2 l2Var) {
        C4746rf rfVar = (C4746rf) l2Var;
        C4751rk.m13024c(rfVar.mo26615E(), 0);
        if (rfVar.mo26616I().zzd() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
