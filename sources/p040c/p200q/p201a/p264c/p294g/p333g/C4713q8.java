package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.InvalidAlgorithmParameterException;

/* renamed from: c.q.a.c.g.g.q8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4713q8 implements C4765s8 {
    /* renamed from: a */
    public final byte[] mo26509a() {
        return C4417f9.f9219k;
    }

    /* renamed from: b */
    public final byte[] mo26510b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            return new C4604m7(bArr).mo26327c(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    public final int zza() {
        return 32;
    }
}
