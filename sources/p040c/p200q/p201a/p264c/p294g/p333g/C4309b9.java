package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;
import okio.Utf8;

/* renamed from: c.q.a.c.g.g.b9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4309b9 extends C4337ca {
    public C4309b9(C4336c9 c9Var, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4572l2 mo25813a(C4572l2 l2Var) {
        byte[] bArr;
        byte[] bArr2;
        C4479hh hhVar = (C4479hh) l2Var;
        int J = hhVar.mo26078H().mo26182J() - 2;
        if (J == 1) {
            bArr = C4698pk.m12824a(32);
            bArr[0] = (byte) (bArr[0] | 7);
            byte b = bArr[31] & Utf8.REPLACEMENT_BYTE;
            bArr[31] = (byte) b;
            bArr[31] = (byte) (b | ByteCompanionObject.MIN_VALUE);
            bArr2 = C4777sk.m13085b(bArr);
        } else if (J == 2 || J == 3 || J == 4) {
            int g = C4417f9.m11953g(hhVar.mo26078H().mo26182J());
            KeyPair d = C4906xj.m13504d(C4906xj.m13512l(g));
            bArr2 = C4906xj.m13513m(g, 1, ((ECPublicKey) d.getPublic()).getW());
            bArr = ((ECPrivateKey) d.getPrivate()).getS().toByteArray();
        } else {
            throw new GeneralSecurityException("Invalid KEM");
        }
        C4695ph G = C4722qh.m12922G();
        G.mo26528p(0);
        G.mo26526l(hhVar.mo26078H());
        G.mo26527m(zzacc.zzn(bArr2));
        C4614mh F = C4641nh.m12541F();
        F.mo26319p(0);
        F.mo26318m((C4722qh) G.mo26052e());
        F.mo26317l(zzacc.zzn(bArr));
        return (C4641nh) F.mo26052e();
    }

    /* renamed from: b */
    public final /* synthetic */ C4572l2 mo25814b(zzacc zzacc) {
        return C4479hh.m12105G(zzacc, C4913y0.m13537a());
    }

    /* renamed from: c */
    public final Map mo25815c() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", C4336c9.m11759l(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", C4336c9.m11759l(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", C4336c9.m11759l(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", C4336c9.m11759l(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", C4336c9.m11759l(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", C4336c9.m11759l(3, 3, 5, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", C4336c9.m11759l(4, 3, 3, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", C4336c9.m11759l(4, 3, 3, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", C4336c9.m11759l(4, 3, 4, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", C4336c9.m11759l(4, 3, 4, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", C4336c9.m11759l(5, 4, 3, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", C4336c9.m11759l(5, 4, 3, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", C4336c9.m11759l(5, 4, 4, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", C4336c9.m11759l(5, 4, 4, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", C4336c9.m11759l(6, 5, 3, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", C4336c9.m11759l(6, 5, 3, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", C4336c9.m11759l(6, 5, 4, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", C4336c9.m11759l(6, 5, 4, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo25816d(C4572l2 l2Var) {
        C4417f9.m11947a(((C4479hh) l2Var).mo26078H());
    }
}
