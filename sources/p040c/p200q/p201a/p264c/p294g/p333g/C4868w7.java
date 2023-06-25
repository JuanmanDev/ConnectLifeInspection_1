package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.q.a.c.g.g.w7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4868w7 extends C4337ca {
    public C4868w7(C4894x7 x7Var, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4572l2 mo25813a(C4572l2 l2Var) {
        C4558kf F = C4585lf.m12405F();
        F.mo26174l(zzacc.zzn(C4698pk.m12824a(((C4666of) l2Var).mo26471E())));
        F.mo26175m(0);
        return (C4585lf) F.mo26052e();
    }

    /* renamed from: b */
    public final /* synthetic */ C4572l2 mo25814b(zzacc zzacc) {
        return C4666of.m12717H(zzacc, C4913y0.m13537a());
    }

    /* renamed from: c */
    public final Map mo25815c() {
        HashMap hashMap = new HashMap();
        C4639nf F = C4666of.m12715F();
        F.mo26331l(64);
        hashMap.put("AES256_SIV", new C4310ba((C4666of) F.mo26052e(), 1));
        C4639nf F2 = C4666of.m12715F();
        F2.mo26331l(64);
        hashMap.put("AES256_SIV_RAW", new C4310ba((C4666of) F2.mo26052e(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo25816d(C4572l2 l2Var) {
        C4666of ofVar = (C4666of) l2Var;
        if (ofVar.mo26471E() != 64) {
            int E = ofVar.mo26471E();
            throw new InvalidAlgorithmParameterException("invalid key size: " + E + ". Valid keys must have 64 bytes.");
        }
    }
}
