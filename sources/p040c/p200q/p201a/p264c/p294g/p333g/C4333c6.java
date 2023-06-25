package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: c.q.a.c.g.g.c6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4333c6 implements C4574l4 {

    /* renamed from: a */
    public final C4710q5 f9141a;

    public /* synthetic */ C4333c6(C4710q5 q5Var, C4306b6 b6Var) {
        this.f9141a = q5Var;
        if (q5Var.mo26572f()) {
            C4475hd b = C4634na.m12534a().mo26329b();
            C4610md a = C4553ka.m12280a(q5Var);
            b.mo26073a(a, "aead", "encrypt");
            b.mo26073a(a, "aead", "decrypt");
            return;
        }
        C4448gd gdVar = C4553ka.f9325a;
    }

    /* renamed from: a */
    public final byte[] mo25783a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (C4602m5 m5Var : this.f9141a.mo26571e(copyOf)) {
                try {
                    byte[] a = ((C4574l4) m5Var.mo26304e()).mo25783a(copyOfRange, bArr2);
                    m5Var.mo26300a();
                    int length2 = copyOfRange.length;
                    return a;
                } catch (GeneralSecurityException e) {
                    C4360d6.f9167a.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (C4602m5 m5Var2 : this.f9141a.mo26571e(C4655o4.f9511a)) {
            try {
                byte[] a2 = ((C4574l4) m5Var2.mo26304e()).mo25783a(bArr, bArr2);
                m5Var2.mo26300a();
                int length3 = bArr.length;
                return a2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    /* renamed from: b */
    public final byte[] mo25784b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
