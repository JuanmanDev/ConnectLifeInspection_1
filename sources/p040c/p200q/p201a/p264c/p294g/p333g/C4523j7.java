package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Build;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: c.q.a.c.g.g.j7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4523j7 {

    /* renamed from: c */
    public static final ThreadLocal f9307c = new C4496i7();

    /* renamed from: a */
    public final SecretKey f9308a;

    /* renamed from: b */
    public final boolean f9309b;

    public C4523j7(byte[] bArr, boolean z) {
        if (C4790t7.m13146a(2)) {
            C4751rk.m13023b(bArr.length);
            this.f9308a = new SecretKeySpec(bArr, "AES");
            this.f9309b = z;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final byte[] mo26133a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        AlgorithmParameterSpec algorithmParameterSpec;
        int i = 12;
        if (bArr.length == 12) {
            boolean z = this.f9309b;
            int i2 = true != z ? 16 : 28;
            int length = bArr2.length;
            if (length < i2) {
                throw new GeneralSecurityException("ciphertext too short");
            } else if (!z || ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                if (!C4725qk.m12939a() || Integer.valueOf(Build.VERSION.SDK_INT).intValue() > 19) {
                    algorithmParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
                } else {
                    algorithmParameterSpec = new IvParameterSpec(bArr, 0, 12);
                }
                ((Cipher) f9307c.get()).init(2, this.f9308a, algorithmParameterSpec);
                boolean z2 = this.f9309b;
                if (true != z2) {
                    i = 0;
                }
                if (z2) {
                    length -= 12;
                }
                return ((Cipher) f9307c.get()).doFinal(bArr2, i, length);
            } else {
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
        } else {
            throw new GeneralSecurityException("iv is wrong size");
        }
    }
}
