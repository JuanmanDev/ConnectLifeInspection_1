package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: c.q.a.c.g.g.s7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4764s7 implements C4574l4 {

    /* renamed from: b */
    public static final ThreadLocal f9611b = new C4738r7();

    /* renamed from: a */
    public final SecretKey f9612a;

    public C4764s7(byte[] bArr) {
        C4751rk.m13023b(bArr.length);
        this.f9612a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: a */
    public final byte[] mo25783a(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (bArr.length >= 28) {
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                algorithmParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            } catch (ClassNotFoundException unused) {
                if (C4725qk.m12939a()) {
                    algorithmParameterSpec = new IvParameterSpec(bArr, 0, 12);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ((Cipher) f9611b.get()).init(2, this.f9612a, algorithmParameterSpec);
            return ((Cipher) f9611b.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo25784b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
