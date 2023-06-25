package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.q.a.c.g.g.l6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4576l6 extends C4337ca {
    public C4576l6(C4603m6 m6Var, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4572l2 mo25813a(C4572l2 l2Var) {
        C4771se seVar = (C4771se) l2Var;
        C4665oe F = C4692pe.m12809F();
        F.mo26468l(zzacc.zzn(C4698pk.m12824a(seVar.mo26644E())));
        F.mo26469m(seVar.mo26645I());
        F.mo26470p(0);
        return (C4692pe) F.mo26052e();
    }

    /* renamed from: b */
    public final /* synthetic */ C4572l2 mo25814b(zzacc zzacc) {
        return C4771se.m13067H(zzacc, C4913y0.m13537a());
    }

    /* renamed from: c */
    public final Map mo25815c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", C4603m6.m12470k(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", C4603m6.m12470k(16, 16, 3));
        hashMap.put("AES256_EAX", C4603m6.m12470k(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", C4603m6.m12470k(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo25816d(C4572l2 l2Var) {
        C4771se seVar = (C4771se) l2Var;
        C4751rk.m13023b(seVar.mo26644E());
        if (seVar.mo26645I().mo26778E() != 12 && seVar.mo26645I().mo26778E() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
