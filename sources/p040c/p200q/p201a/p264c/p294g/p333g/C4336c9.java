package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zznr;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.c9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4336c9 extends C4923ya {
    public C4336c9() {
        super(C4641nh.class, C4722qh.class, new C4282a9(C4709q4.class));
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ C4310ba m11759l(int i, int i2, int i3, int i4) {
        C4533jh E = C4560kh.m12290E();
        E.mo26139p(i);
        E.mo26138m(i2);
        E.mo26137l(i3);
        C4452gh E2 = C4479hh.m12103E();
        E2.mo26032l((C4560kh) E.mo26052e());
        return new C4310ba((C4479hh) E2.mo26052e(), i4);
    }

    /* renamed from: a */
    public final C4337ca mo25847a() {
        return new C4309b9(this, C4479hh.class);
    }

    /* renamed from: b */
    public final zznr mo25848b() {
        return zznr.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: c */
    public final /* synthetic */ C4572l2 mo25849c(zzacc zzacc) {
        return C4641nh.m12543H(zzacc, C4913y0.m13537a());
    }

    /* renamed from: d */
    public final String mo25850d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo25851e(C4572l2 l2Var) {
        C4641nh nhVar = (C4641nh) l2Var;
        if (nhVar.mo26337J().zzs()) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (nhVar.mo26338N()) {
            C4751rk.m13024c(nhVar.mo26335E(), 0);
            C4417f9.m11947a(nhVar.mo26336I().mo26582F());
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }

    /* renamed from: k */
    public final /* synthetic */ C4572l2 mo25852k(C4572l2 l2Var) {
        return ((C4641nh) l2Var).mo26336I();
    }
}
