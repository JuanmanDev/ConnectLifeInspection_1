package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: c.q.a.c.g.g.a8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4281a8 implements C4682p4 {

    /* renamed from: a */
    public final C4710q5 f9122a;

    public C4281a8(C4710q5 q5Var) {
        this.f9122a = q5Var;
        if (q5Var.mo26572f()) {
            C4475hd b = C4634na.m12534a().mo26329b();
            C4610md a = C4553ka.m12280a(q5Var);
            b.mo26073a(a, "daead", "encrypt");
            b.mo26073a(a, "daead", "decrypt");
            return;
        }
        C4448gd gdVar = C4553ka.f9325a;
    }

    /* renamed from: a */
    public final byte[] mo25785a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (C4602m5 m5Var : this.f9122a.mo26571e(copyOf)) {
                try {
                    byte[] a = ((C4682p4) m5Var.mo26304e()).mo25785a(copyOfRange, bArr2);
                    m5Var.mo26300a();
                    int length2 = copyOfRange.length;
                    return a;
                } catch (GeneralSecurityException e) {
                    C4308b8.f9134a.logp(Level.INFO, "com.google.crypto.tink.daead.DeterministicAeadWrapper$WrappedDeterministicAead", "decryptDeterministically", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (C4602m5 m5Var2 : this.f9122a.mo26571e(C4655o4.f9511a)) {
            try {
                byte[] a2 = ((C4682p4) m5Var2.mo26304e()).mo25785a(bArr, bArr2);
                m5Var2.mo26300a();
                int length3 = bArr.length;
                return a2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
