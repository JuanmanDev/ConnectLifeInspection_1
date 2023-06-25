package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzadn;
import com.google.android.gms.internal.p527firebaseauthapi.zzoy;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.ac */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final /* synthetic */ class C4285ac implements C4792t9 {

    /* renamed from: a */
    public static final /* synthetic */ C4285ac f9123a = new C4285ac();

    /* renamed from: a */
    public final C4761s4 mo25788a(C4338cb cbVar, C4892x5 x5Var) {
        C4820ub ubVar;
        int i = C4339cc.f9148f;
        if (((C4949za) cbVar).mo26885g().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                C4718qd H = C4718qd.m12912H(((C4949za) cbVar).mo26883e(), C4913y0.m13537a());
                if (H.mo26576E() == 0) {
                    C4794tb tbVar = new C4794tb((C4768sb) null);
                    tbVar.mo26671a(H.mo26578J().zzd());
                    tbVar.mo26672b(H.mo26577I().mo26801E());
                    zzoy d = ((C4949za) cbVar).mo26882d();
                    zzoy zzoy = zzoy.UNKNOWN_PREFIX;
                    int ordinal = d.ordinal();
                    if (ordinal == 1) {
                        ubVar = C4820ub.f9665b;
                    } else if (ordinal == 2) {
                        ubVar = C4820ub.f9667d;
                    } else if (ordinal == 3) {
                        ubVar = C4820ub.f9668e;
                    } else if (ordinal == 4) {
                        ubVar = C4820ub.f9666c;
                    } else {
                        int zza = d.zza();
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                    }
                    tbVar.mo26673c(ubVar);
                    C4872wb d2 = tbVar.mo26674d();
                    C4608mb mbVar = new C4608mb((C4581lb) null);
                    mbVar.mo26310c(d2);
                    mbVar.mo26308a(C4855vk.m13336b(H.mo26578J().zzt(), x5Var));
                    mbVar.mo26309b(((C4949za) cbVar).mo26884f());
                    return mbVar.mo26311d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzadn | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
    }
}
