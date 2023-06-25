package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.c7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4334c7 extends C4337ca {
    public C4334c7(C4361d7 d7Var, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4572l2 mo25813a(C4572l2 l2Var) {
        C4801ti F = C4827ui.m13247F();
        F.mo26677l((C4905xi) l2Var);
        F.mo26678m(0);
        return (C4827ui) F.mo26052e();
    }

    /* renamed from: b */
    public final /* synthetic */ C4572l2 mo25814b(zzacc zzacc) {
        return C4905xi.m13496H(zzacc, C4913y0.m13537a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo25816d(C4572l2 l2Var) {
        C4905xi xiVar = (C4905xi) l2Var;
        if (xiVar.mo26829I().isEmpty() || !xiVar.mo26830J()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
