package p040c.p200q.p201a.p264c.p294g.p333g;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.tk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4803tk implements C4574l4 {

    /* renamed from: a */
    public final C4685p7 f9648a;

    public C4803tk(byte[] bArr) {
        this.f9648a = new C4685p7(bArr);
    }

    /* renamed from: a */
    public final byte[] mo25783a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.f9648a.mo26326b(ByteBuffer.wrap(bArr, 24, length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo25784b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
