package p040c.p200q.p201a.p264c.p294g.p333g;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.rj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4750rj implements C4574l4 {

    /* renamed from: a */
    public final C4604m7 f9602a;

    public C4750rj(byte[] bArr) {
        this.f9602a = new C4604m7(bArr);
    }

    /* renamed from: a */
    public final byte[] mo25783a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.f9602a.mo26326b(ByteBuffer.wrap(bArr, 12, length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo25784b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
