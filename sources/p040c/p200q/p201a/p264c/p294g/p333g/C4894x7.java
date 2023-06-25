package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zznr;
import java.security.InvalidKeyException;

/* renamed from: c.q.a.c.g.g.x7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4894x7 extends C4364da {
    public C4894x7() {
        super(C4585lf.class, new C4842v7(C4682p4.class));
    }

    /* renamed from: a */
    public final C4337ca mo25847a() {
        return new C4868w7(this, C4666of.class);
    }

    /* renamed from: b */
    public final zznr mo25848b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C4572l2 mo25849c(zzacc zzacc) {
        return C4585lf.m12407H(zzacc, C4913y0.m13537a());
    }

    /* renamed from: d */
    public final String mo25850d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo25851e(C4572l2 l2Var) {
        C4585lf lfVar = (C4585lf) l2Var;
        C4751rk.m13024c(lfVar.mo26270E(), 0);
        if (lfVar.mo26271I().zzd() != 64) {
            int zzd = lfVar.mo26271I().zzd();
            throw new InvalidKeyException("invalid key size: " + zzd + ". Valid keys must have 64 bytes.");
        }
    }
}
