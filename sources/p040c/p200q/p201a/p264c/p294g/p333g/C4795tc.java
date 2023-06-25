package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzadn;
import com.google.android.gms.internal.p527firebaseauthapi.zzoy;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.tc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final /* synthetic */ class C4795tc implements C4792t9 {

    /* renamed from: a */
    public static final /* synthetic */ C4795tc f9647a = new C4795tc();

    /* renamed from: a */
    public final C4761s4 mo25788a(C4338cb cbVar, C4892x5 x5Var) {
        C4609mc mcVar;
        C4636nc ncVar;
        int i = C4821uc.f9675f;
        if (((C4949za) cbVar).mo26885g().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                C4877wg I = C4877wg.m13418I(((C4949za) cbVar).mo26883e(), C4913y0.m13537a());
                if (I.mo26802E() == 0) {
                    C4582lc lcVar = new C4582lc((C4555kc) null);
                    lcVar.mo26265b(I.mo26804K().zzd());
                    lcVar.mo26266c(I.mo26803J().mo25856E());
                    int J = I.mo26803J().mo25857J();
                    zzoy zzoy = zzoy.UNKNOWN_PREFIX;
                    int i2 = J - 2;
                    if (i2 == 1) {
                        mcVar = C4609mc.f9430b;
                    } else if (i2 == 2) {
                        mcVar = C4609mc.f9433e;
                    } else if (i2 == 3) {
                        mcVar = C4609mc.f9432d;
                    } else if (i2 == 4) {
                        mcVar = C4609mc.f9434f;
                    } else if (i2 == 5) {
                        mcVar = C4609mc.f9431c;
                    } else {
                        throw new GeneralSecurityException("Unable to parse HashType: " + C4799tg.m13164a(J));
                    }
                    lcVar.mo26264a(mcVar);
                    zzoy d = ((C4949za) cbVar).mo26882d();
                    int ordinal = d.ordinal();
                    if (ordinal == 1) {
                        ncVar = C4636nc.f9470b;
                    } else if (ordinal == 2) {
                        ncVar = C4636nc.f9472d;
                    } else if (ordinal == 3) {
                        ncVar = C4636nc.f9473e;
                    } else if (ordinal == 4) {
                        ncVar = C4636nc.f9471c;
                    } else {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + d.zza());
                    }
                    lcVar.mo26267d(ncVar);
                    C4690pc e = lcVar.mo26268e();
                    C4393ec ecVar = new C4393ec((C4366dc) null);
                    ecVar.mo25942c(e);
                    ecVar.mo25941b(C4855vk.m13336b(I.mo26804K().zzt(), x5Var));
                    ecVar.mo25940a(((C4949za) cbVar).mo26884f());
                    return ecVar.mo25943d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzadn | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to HmacParameters.parseParameters");
        }
    }
}
