package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* renamed from: c.q.a.c.g.g.lk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4590lk extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ C4617mk f9393a;

    public C4590lk(C4617mk mkVar) {
        this.f9393a = mkVar;
    }

    /* renamed from: a */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) C4958zj.f9783f.mo26891a(this.f9393a.f9440b);
            mac.init(this.f9393a.f9441c);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
