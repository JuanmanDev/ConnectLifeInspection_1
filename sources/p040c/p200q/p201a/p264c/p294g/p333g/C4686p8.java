package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: c.q.a.c.g.g.p8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4686p8 implements C4765s8 {

    /* renamed from: a */
    public final int f9551a;

    public C4686p8(int i) {
        if (i == 16 || i == 32) {
            this.f9551a = i;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i);
    }

    /* renamed from: a */
    public final byte[] mo26509a() {
        int i = this.f9551a;
        if (i == 16) {
            return C4417f9.f9217i;
        }
        if (i == 32) {
            return C4417f9.f9218j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    /* renamed from: b */
    public final byte[] mo26510b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.f9551a) {
            return new C4523j7(bArr, false).mo26133a(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }

    public final int zza() {
        return this.f9551a;
    }
}
