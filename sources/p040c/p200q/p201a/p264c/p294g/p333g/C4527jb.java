package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.q.a.c.g.g.jb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4527jb {

    /* renamed from: a */
    public final Map f9313a;

    /* renamed from: b */
    public final Map f9314b;

    /* renamed from: c */
    public final Map f9315c;

    /* renamed from: d */
    public final Map f9316d;

    public /* synthetic */ C4527jb(C4365db dbVar, C4500ib ibVar) {
        this.f9313a = new HashMap(dbVar.f9171a);
        this.f9314b = new HashMap(dbVar.f9172b);
        this.f9315c = new HashMap(dbVar.f9173c);
        this.f9316d = new HashMap(dbVar.f9174d);
    }

    /* renamed from: a */
    public final C4761s4 mo26134a(C4338cb cbVar, C4892x5 x5Var) {
        C4419fb fbVar = new C4419fb(cbVar.getClass(), cbVar.mo25787c(), (C4392eb) null);
        if (this.f9314b.containsKey(fbVar)) {
            return ((C4844v9) this.f9314b.get(fbVar)).mo26639a(cbVar, x5Var);
        }
        String fbVar2 = fbVar.toString();
        throw new GeneralSecurityException("No Key Parser for requested key type " + fbVar2 + " available");
    }
}
