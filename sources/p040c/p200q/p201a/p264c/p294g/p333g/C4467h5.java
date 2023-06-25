package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: c.q.a.c.g.g.h5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4467h5 {

    /* renamed from: a */
    public static final CopyOnWriteArrayList f9269a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static C4440g5 m12087a(String str) {
        Iterator it = f9269a.iterator();
        while (it.hasNext()) {
            C4440g5 g5Var = (C4440g5) it.next();
            if (g5Var.mo26022d(str)) {
                return g5Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
