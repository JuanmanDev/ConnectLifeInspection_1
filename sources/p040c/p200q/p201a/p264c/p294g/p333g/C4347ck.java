package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* renamed from: c.q.a.c.g.g.ck */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4347ck implements C4455gk {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25829a(String str, Provider provider) {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
