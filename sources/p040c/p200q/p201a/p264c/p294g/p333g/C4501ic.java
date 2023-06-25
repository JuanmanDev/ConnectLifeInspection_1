package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.q.a.c.g.g.ic */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4501ic extends C4337ca {
    public C4501ic(C4528jc jcVar, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4572l2 mo25813a(C4572l2 l2Var) {
        C4955zg zgVar = (C4955zg) l2Var;
        C4851vg F = C4877wg.m13415F();
        F.mo26781p(0);
        F.mo26780m(zgVar.mo26890J());
        F.mo26779l(zzacc.zzn(C4698pk.m12824a(zgVar.mo26889E())));
        return (C4877wg) F.mo26052e();
    }

    /* renamed from: b */
    public final /* synthetic */ C4572l2 mo25814b(zzacc zzacc) {
        return C4955zg.m13730I(zzacc, C4913y0.m13537a());
    }

    /* renamed from: c */
    public final Map mo25815c() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", C4528jc.m12213m(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", C4528jc.m12213m(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", C4528jc.m12213m(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", C4528jc.m12213m(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", C4528jc.m12213m(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", C4528jc.m12213m(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", C4528jc.m12213m(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", C4528jc.m12213m(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", C4528jc.m12213m(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", C4528jc.m12213m(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo25816d(C4572l2 l2Var) {
        C4955zg zgVar = (C4955zg) l2Var;
        if (zgVar.mo26889E() >= 16) {
            C4528jc.m12214n(zgVar.mo26890J());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
