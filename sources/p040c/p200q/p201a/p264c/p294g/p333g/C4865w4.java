package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: c.q.a.c.g.g.w4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4865w4 implements C4917y4 {

    /* renamed from: a */
    public final /* synthetic */ C4364da f9719a;

    public C4865w4(C4364da daVar) {
        this.f9719a = daVar;
    }

    /* renamed from: a */
    public final C4787t4 mo26786a() {
        C4364da daVar = this.f9719a;
        return new C4839v4(daVar, daVar.mo25892g());
    }

    /* renamed from: b */
    public final Class mo26787b() {
        return this.f9719a.getClass();
    }

    /* renamed from: c */
    public final Class mo26788c() {
        return null;
    }

    /* renamed from: d */
    public final Set mo26789d() {
        return this.f9719a.mo25895j();
    }

    /* renamed from: e */
    public final C4787t4 mo26790e(Class cls) {
        try {
            return new C4839v4(this.f9719a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }
}
