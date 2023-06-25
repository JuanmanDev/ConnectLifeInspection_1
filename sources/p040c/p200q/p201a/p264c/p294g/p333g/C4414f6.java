package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.q.a.c.g.g.f6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4414f6 extends C4337ca {
    public C4414f6(C4441g6 g6Var, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4572l2 mo25813a(C4572l2 l2Var) {
        C4341ce ceVar = (C4341ce) l2Var;
        new C4522j6();
        C4449ge g = C4495i6.m12135g(ceVar.mo25854H());
        C4572l2 a = new C4528jc().mo25847a().mo25813a(ceVar.mo25855I());
        C4926yd F = C4952zd.m13717F();
        F.mo26855l(g);
        F.mo26856m((C4877wg) a);
        F.mo26857p(0);
        return (C4952zd) F.mo26052e();
    }

    /* renamed from: b */
    public final /* synthetic */ C4572l2 mo25814b(zzacc zzacc) {
        return C4341ce.m11775G(zzacc, C4913y0.m13537a());
    }

    /* renamed from: c */
    public final Map mo25815c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", C4441g6.m12022k(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", C4441g6.m12022k(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", C4441g6.m12022k(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", C4441g6.m12022k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo25816d(C4572l2 l2Var) {
        C4341ce ceVar = (C4341ce) l2Var;
        ((C4495i6) new C4522j6().mo25847a()).mo25816d(ceVar.mo25854H());
        new C4528jc().mo25847a().mo25816d(ceVar.mo25855I());
        C4751rk.m13023b(ceVar.mo25854H().mo26135E());
    }
}
