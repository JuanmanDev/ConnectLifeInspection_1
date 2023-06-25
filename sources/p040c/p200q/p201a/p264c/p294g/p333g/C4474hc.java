package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: c.q.a.c.g.g.hc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4474hc extends C4897xa {
    public C4474hc(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25786a(C4572l2 l2Var) {
        C4877wg wgVar = (C4877wg) l2Var;
        int J = wgVar.mo26803J().mo25857J();
        SecretKeySpec secretKeySpec = new SecretKeySpec(wgVar.mo26804K().zzt(), "HMAC");
        int E = wgVar.mo26803J().mo25856E();
        int i = J - 2;
        if (i == 1) {
            return new C4644nk(new C4617mk("HMACSHA1", secretKeySpec), E);
        }
        if (i == 2) {
            return new C4644nk(new C4617mk("HMACSHA384", secretKeySpec), E);
        }
        if (i == 3) {
            return new C4644nk(new C4617mk("HMACSHA256", secretKeySpec), E);
        }
        if (i == 4) {
            return new C4644nk(new C4617mk("HMACSHA512", secretKeySpec), E);
        }
        if (i == 5) {
            return new C4644nk(new C4617mk("HMACSHA224", secretKeySpec), E);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
