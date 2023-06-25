package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zznr;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.j6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4522j6 extends C4364da {
    public C4522j6() {
        super(C4449ge.class, new C4468h6(C4536jk.class));
    }

    /* renamed from: l */
    public static final void m12193l(C4449ge geVar) {
        C4751rk.m13024c(geVar.mo26029E(), 0);
        C4751rk.m13023b(geVar.mo26031K().zzd());
        m12194m(geVar.mo26030J());
    }

    /* renamed from: m */
    public static final void m12194m(C4611me meVar) {
        if (meVar.mo26316E() < 12 || meVar.mo26316E() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* renamed from: a */
    public final C4337ca mo25847a() {
        return new C4495i6(this, C4530je.class);
    }

    /* renamed from: b */
    public final zznr mo25848b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C4572l2 mo25849c(zzacc zzacc) {
        return C4449ge.m12047I(zzacc, C4913y0.m13537a());
    }

    /* renamed from: d */
    public final String mo25850d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo25851e(C4572l2 l2Var) {
        m12193l((C4449ge) l2Var);
    }
}
