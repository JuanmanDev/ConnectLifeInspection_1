package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: c.q.a.c.g.g.kk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4563kk implements C4637nd {

    /* renamed from: a */
    public final SecretKey f9333a;

    /* renamed from: b */
    public final byte[] f9334b;

    /* renamed from: c */
    public final byte[] f9335c;

    public C4563kk(byte[] bArr) {
        C4751rk.m13023b(bArr.length);
        this.f9333a = new SecretKeySpec(bArr, "AES");
        Cipher b = m12309b();
        b.init(1, this.f9333a);
        byte[] b2 = C4313bd.m11723b(b.doFinal(new byte[16]));
        this.f9334b = b2;
        this.f9335c = C4313bd.m11723b(b2);
    }

    /* renamed from: b */
    public static Cipher m12309b() {
        if (C4790t7.m13146a(1)) {
            return (Cipher) C4958zj.f9782e.mo26891a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo26184a(byte[] bArr, int i) {
        byte[] bArr2;
        if (i <= 16) {
            Cipher b = m12309b();
            b.init(1, this.f9333a);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
            if (max * 16 == length) {
                bArr2 = C4724qj.m12938e(bArr, (max - 1) * 16, this.f9334b, 0, 16);
            } else {
                bArr2 = C4724qj.m12937d(C4313bd.m11722a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f9335c);
            }
            byte[] bArr3 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr3 = b.doFinal(C4724qj.m12938e(bArr3, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(b.doFinal(C4724qj.m12937d(bArr2, bArr3)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
