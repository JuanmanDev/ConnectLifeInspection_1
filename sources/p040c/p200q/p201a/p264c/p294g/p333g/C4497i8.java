package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: c.q.a.c.g.g.i8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4497i8 implements C4709q4 {

    /* renamed from: a */
    public final C4710q5 f9290a;

    public C4497i8(C4710q5 q5Var) {
        this.f9290a = q5Var;
        if (q5Var.mo26572f()) {
            C4634na.m12534a().mo26329b().mo26073a(C4553ka.m12280a(q5Var), "hybrid_decrypt", "decrypt");
        } else {
            C4448gd gdVar = C4553ka.f9325a;
        }
    }

    /* renamed from: a */
    public final byte[] mo26102a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (C4602m5 m5Var : this.f9290a.mo26571e(copyOfRange)) {
                try {
                    byte[] a = ((C4709q4) m5Var.mo26304e()).mo26102a(copyOfRange2, (byte[]) null);
                    m5Var.mo26300a();
                    int length2 = copyOfRange2.length;
                    return a;
                } catch (GeneralSecurityException e) {
                    C4524j8.f9310a.logp(Level.INFO, "com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e.toString())));
                }
            }
        }
        for (C4602m5 m5Var2 : this.f9290a.mo26571e(C4655o4.f9511a)) {
            try {
                byte[] a2 = ((C4709q4) m5Var2.mo26304e()).mo26102a(bArr, (byte[]) null);
                m5Var2.mo26300a();
                int length3 = bArr.length;
                return a2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
