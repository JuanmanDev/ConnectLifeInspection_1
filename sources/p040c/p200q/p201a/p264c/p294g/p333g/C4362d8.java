package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.q.a.c.g.g.d8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4362d8 extends C4337ca {
    public C4362d8(C4389e8 e8Var, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4572l2 mo25813a(C4572l2 l2Var) {
        C4316bg bgVar = (C4316bg) l2Var;
        KeyPair d = C4906xj.m13504d(C4906xj.m13512l(C4632n8.m12530c(bgVar.mo25826H().mo25988I().mo26473J())));
        ECPoint w = ((ECPublicKey) d.getPublic()).getW();
        C4559kg G = C4586lg.m12413G();
        G.mo26177m(0);
        G.mo26176l(bgVar.mo25826H());
        G.mo26178p(zzacc.zzn(w.getAffineX().toByteArray()));
        G.mo26179q(zzacc.zzn(w.getAffineY().toByteArray()));
        C4478hg F = C4505ig.m12160F();
        F.mo26077p(0);
        F.mo26076m((C4586lg) G.mo26052e());
        F.mo26075l(zzacc.zzn(((ECPrivateKey) d.getPrivate()).getS().toByteArray()));
        return (C4505ig) F.mo26052e();
    }

    /* renamed from: b */
    public final /* synthetic */ C4572l2 mo25814b(zzacc zzacc) {
        return C4316bg.m11734G(zzacc, C4913y0.m13537a());
    }

    /* renamed from: c */
    public final Map mo25815c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", C4389e8.m11902m(4, 5, 3, C4332c5.m11752a("AES128_GCM"), C4389e8.f9192d, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", C4389e8.m11902m(4, 5, 3, C4332c5.m11752a("AES128_GCM"), C4389e8.f9192d, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", C4389e8.m11902m(4, 5, 4, C4332c5.m11752a("AES128_GCM"), C4389e8.f9192d, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", C4389e8.m11902m(4, 5, 4, C4332c5.m11752a("AES128_GCM"), C4389e8.f9192d, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", C4389e8.m11902m(4, 5, 4, C4332c5.m11752a("AES128_GCM"), C4389e8.f9192d, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", C4389e8.m11902m(4, 5, 3, C4332c5.m11752a("AES128_CTR_HMAC_SHA256"), C4389e8.f9192d, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", C4389e8.m11902m(4, 5, 3, C4332c5.m11752a("AES128_CTR_HMAC_SHA256"), C4389e8.f9192d, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", C4389e8.m11902m(4, 5, 4, C4332c5.m11752a("AES128_CTR_HMAC_SHA256"), C4389e8.f9192d, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", C4389e8.m11902m(4, 5, 4, C4332c5.m11752a("AES128_CTR_HMAC_SHA256"), C4389e8.f9192d, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo25816d(C4572l2 l2Var) {
        C4632n8.m12528a(((C4316bg) l2Var).mo25826H());
    }
}
