package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: c.q.a.c.g.g.wj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4880wj {

    /* renamed from: a */
    public final ECPrivateKey f9725a;

    public C4880wj(ECPrivateKey eCPrivateKey) {
        this.f9725a = eCPrivateKey;
    }

    /* renamed from: a */
    public final byte[] mo26805a(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i, int i2) {
        int i3 = 1;
        byte[] c = C4724qj.m12936c(bArr, C4906xj.m13508h(this.f9725a, C4906xj.m13511k(this.f9725a.getParams(), i2, bArr)));
        Mac mac = (Mac) C4958zj.f9783f.mo26891a(str);
        if (i <= mac.getMacLength() * 255) {
            if (bArr2 == null || bArr2.length == 0) {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            } else {
                mac.init(new SecretKeySpec(bArr2, str));
            }
            byte[] doFinal = mac.doFinal(c);
            byte[] bArr4 = new byte[i];
            mac.init(new SecretKeySpec(doFinal, str));
            byte[] bArr5 = new byte[0];
            int i4 = 0;
            while (true) {
                mac.update(bArr5);
                mac.update((byte[]) null);
                mac.update((byte) i3);
                bArr5 = mac.doFinal();
                int length = bArr5.length;
                int i5 = i4 + length;
                if (i5 < i) {
                    System.arraycopy(bArr5, 0, bArr4, i4, length);
                    i3++;
                    i4 = i5;
                } else {
                    System.arraycopy(bArr5, 0, bArr4, i4, i - i4);
                    return bArr4;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }
}
