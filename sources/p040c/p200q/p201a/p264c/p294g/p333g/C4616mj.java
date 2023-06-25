package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: c.q.a.c.g.g.mj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4616mj extends ThreadLocal {
    /* renamed from: a */
    public static final Cipher m12492a() {
        try {
            return (Cipher) C4958zj.f9782e.mo26891a("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m12492a();
    }
}
