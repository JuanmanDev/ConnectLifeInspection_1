package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zznr;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.rb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4742rb extends C4364da {
    public C4742rb() {
        super(C4718qd.class, new C4689pb(C4494i5.class));
    }

    /* renamed from: m */
    public static void m12996m(C4874wd wdVar) {
        if (wdVar.mo26801E() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (wdVar.mo26801E() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* renamed from: n */
    public static void m12997n(int i) {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* renamed from: a */
    public final C4337ca mo25847a() {
        return new C4716qb(this, C4796td.class);
    }

    /* renamed from: b */
    public final zznr mo25848b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C4572l2 mo25849c(zzacc zzacc) {
        return C4718qd.m12912H(zzacc, C4913y0.m13537a());
    }

    /* renamed from: d */
    public final String mo25850d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo25851e(C4572l2 l2Var) {
        C4718qd qdVar = (C4718qd) l2Var;
        C4751rk.m13024c(qdVar.mo26576E(), 0);
        m12997n(qdVar.mo26578J().zzd());
        m12996m(qdVar.mo26577I());
    }
}
