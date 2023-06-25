package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: c.q.a.c.g.g.dk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4374dk implements C4455gk {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo25829a(String str, Provider provider) {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
