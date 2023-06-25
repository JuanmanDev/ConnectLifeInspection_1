package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzadn;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.t5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4788t5 extends C4839v4 implements C4762s5 {

    /* renamed from: c */
    public final C4923ya f9636c;

    /* renamed from: d */
    public final C4364da f9637d;

    public C4788t5(C4923ya yaVar, C4364da daVar, Class cls) {
        super(yaVar, cls);
        this.f9636c = yaVar;
        this.f9637d = daVar;
    }

    /* renamed from: b */
    public final C4826uh mo26638b(zzacc zzacc) {
        try {
            C4572l2 c = this.f9636c.mo25849c(zzacc);
            this.f9636c.mo25851e(c);
            C4572l2 k = this.f9636c.mo25852k(c);
            this.f9637d.mo25851e(k);
            C4774sh E = C4826uh.m13237E();
            E.mo26648m(this.f9637d.mo25850d());
            E.mo26649p(k.mo26232j());
            E.mo26647l(this.f9637d.mo25848b());
            return (C4826uh) E.mo26052e();
        } catch (zzadn e) {
            throw new GeneralSecurityException("expected serialized proto of type ", e);
        }
    }
}
