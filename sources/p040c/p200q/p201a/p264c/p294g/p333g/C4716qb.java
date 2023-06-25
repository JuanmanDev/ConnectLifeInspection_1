package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.q.a.c.g.g.qb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4716qb extends C4337ca {
    public C4716qb(C4742rb rbVar, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4572l2 mo25813a(C4572l2 l2Var) {
        C4796td tdVar = (C4796td) l2Var;
        C4691pd F = C4718qd.m12910F();
        F.mo26522p(0);
        F.mo26520l(zzacc.zzn(C4698pk.m12824a(tdVar.mo26675E())));
        F.mo26521m(tdVar.mo26676I());
        return (C4718qd) F.mo26052e();
    }

    /* renamed from: b */
    public final /* synthetic */ C4572l2 mo25814b(zzacc zzacc) {
        return C4796td.m13158H(zzacc, C4913y0.m13537a());
    }

    /* renamed from: c */
    public final Map mo25815c() {
        HashMap hashMap = new HashMap();
        C4770sd F = C4796td.m13156F();
        F.mo26642l(32);
        C4848vd F2 = C4874wd.m13409F();
        F2.mo26777l(16);
        F.mo26643m((C4874wd) F2.mo26052e());
        hashMap.put("AES_CMAC", new C4310ba((C4796td) F.mo26052e(), 1));
        C4770sd F3 = C4796td.m13156F();
        F3.mo26642l(32);
        C4848vd F4 = C4874wd.m13409F();
        F4.mo26777l(16);
        F3.mo26643m((C4874wd) F4.mo26052e());
        hashMap.put("AES256_CMAC", new C4310ba((C4796td) F3.mo26052e(), 1));
        C4770sd F5 = C4796td.m13156F();
        F5.mo26642l(32);
        C4848vd F6 = C4874wd.m13409F();
        F6.mo26777l(16);
        F5.mo26643m((C4874wd) F6.mo26052e());
        hashMap.put("AES256_CMAC_RAW", new C4310ba((C4796td) F5.mo26052e(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo25816d(C4572l2 l2Var) {
        C4796td tdVar = (C4796td) l2Var;
        C4742rb.m12996m(tdVar.mo26676I());
        C4742rb.m12997n(tdVar.mo26675E());
    }
}
