package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: c.q.a.c.g.g.ad */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4286ad implements C4736r5 {

    /* renamed from: a */
    public static final Logger f9124a = Logger.getLogger(C4286ad.class.getName());

    /* renamed from: b */
    public static final byte[] f9125b = {0};

    /* renamed from: a */
    public final Class mo25789a() {
        return C4494i5.class;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo25790b(C4710q5 q5Var) {
        for (List it : q5Var.mo26570d()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C4602m5 m5Var = (C4602m5) it2.next();
                    if (m5Var.mo26301b() instanceof C4873wc) {
                        C4873wc wcVar = (C4873wc) m5Var.mo26301b();
                        C4829uk b = C4829uk.m13256b(m5Var.mo26305f());
                        if (!b.equals(wcVar.mo26028c())) {
                            String valueOf = String.valueOf(wcVar.mo26027b());
                            String ukVar = wcVar.mo26028c().toString();
                            String ukVar2 = b.toString();
                            throw new GeneralSecurityException("Mac Key with parameters " + valueOf + " has wrong output prefix (" + ukVar + ") instead of (" + ukVar2 + ")");
                        }
                    }
                }
            }
        }
        return new C4951zc(q5Var, (C4925yc) null);
    }

    public final Class zza() {
        return C4494i5.class;
    }
}
