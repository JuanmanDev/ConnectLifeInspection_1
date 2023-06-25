package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.oj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4670oj implements C4574l4 {

    /* renamed from: a */
    public final C4523j7 f9524a;

    public C4670oj(byte[] bArr) {
        if (C4790t7.m13146a(2)) {
            this.f9524a = new C4523j7(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final byte[] mo25783a(byte[] bArr, byte[] bArr2) {
        return this.f9524a.mo26133a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    /* renamed from: b */
    public final byte[] mo25784b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
