package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.q.a.c.g.g.ka */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4553ka {

    /* renamed from: a */
    public static final C4448gd f9325a = new C4526ja((C4499ia) null);

    /* renamed from: a */
    public static C4610md m12280a(C4710q5 q5Var) {
        C4278a5 a5Var;
        C4502id idVar = new C4502id();
        idVar.mo26104b(q5Var.mo26568b());
        for (List it : q5Var.mo26570d()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C4602m5 m5Var = (C4602m5) it2.next();
                    int g = m5Var.mo26306g() - 2;
                    if (g == 1) {
                        a5Var = C4278a5.f9113b;
                    } else if (g == 2) {
                        a5Var = C4278a5.f9114c;
                    } else if (g == 3) {
                        a5Var = C4278a5.f9115d;
                    } else {
                        throw new IllegalStateException("Unknown key status");
                    }
                    idVar.mo26103a(a5Var, m5Var.mo26300a(), m5Var.mo26302c());
                }
            }
        }
        if (q5Var.mo26567a() != null) {
            idVar.mo26105c(q5Var.mo26567a().mo26300a());
        }
        try {
            return idVar.mo26106d();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
