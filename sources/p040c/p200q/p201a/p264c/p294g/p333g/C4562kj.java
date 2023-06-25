package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: c.q.a.c.g.g.kj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4562kj implements C4536jk {

    /* renamed from: d */
    public static final ThreadLocal f9329d = new C4535jj();

    /* renamed from: a */
    public final SecretKeySpec f9330a;

    /* renamed from: b */
    public final int f9331b;

    /* renamed from: c */
    public final int f9332c;

    public C4562kj(byte[] bArr, int i) {
        if (C4790t7.m13146a(2)) {
            C4751rk.m13023b(bArr.length);
            this.f9330a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) f9329d.get()).getBlockSize();
            this.f9332c = blockSize;
            if (i < 12 || i > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f9331b = i;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final byte[] mo26145a(byte[] bArr) {
        int length = bArr.length;
        int i = this.f9331b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int i2 = this.f9331b;
            int i3 = length - i2;
            byte[] bArr3 = new byte[i3];
            Cipher cipher = (Cipher) f9329d.get();
            byte[] bArr4 = new byte[this.f9332c];
            System.arraycopy(bArr2, 0, bArr4, 0, this.f9331b);
            cipher.init(2, this.f9330a, new IvParameterSpec(bArr4));
            if (cipher.doFinal(bArr, i2, i3, bArr3, 0) == i3) {
                return bArr3;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
