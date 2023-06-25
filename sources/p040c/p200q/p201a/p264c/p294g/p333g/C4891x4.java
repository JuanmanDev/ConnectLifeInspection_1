package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: c.q.a.c.g.g.x4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4891x4 implements C4917y4 {

    /* renamed from: a */
    public final /* synthetic */ C4923ya f9730a;

    /* renamed from: b */
    public final /* synthetic */ C4364da f9731b;

    public C4891x4(C4923ya yaVar, C4364da daVar) {
        this.f9730a = yaVar;
        this.f9731b = daVar;
    }

    /* renamed from: a */
    public final C4787t4 mo26786a() {
        C4923ya yaVar = this.f9730a;
        return new C4788t5(yaVar, this.f9731b, yaVar.mo25892g());
    }

    /* renamed from: b */
    public final Class mo26787b() {
        return this.f9730a.getClass();
    }

    /* renamed from: c */
    public final Class mo26788c() {
        return this.f9731b.getClass();
    }

    /* renamed from: d */
    public final Set mo26789d() {
        return this.f9730a.mo25895j();
    }

    /* renamed from: e */
    public final C4787t4 mo26790e(Class cls) {
        try {
            return new C4788t5(this.f9730a, this.f9731b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }
}
