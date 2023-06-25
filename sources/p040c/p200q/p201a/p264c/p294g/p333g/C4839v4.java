package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzadn;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.v4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C4839v4 implements C4787t4 {

    /* renamed from: a */
    public final C4364da f9699a;

    /* renamed from: b */
    public final Class f9700b;

    public C4839v4(C4364da daVar, Class cls) {
        if (daVar.mo25895j().contains(cls) || Void.class.equals(cls)) {
            this.f9699a = daVar;
            this.f9700b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{daVar.toString(), cls.getName()}));
    }

    /* renamed from: a */
    public final Object mo26664a(C4572l2 l2Var) {
        String concat = "Expected proto of type ".concat(String.valueOf(this.f9699a.mo25893h().getName()));
        if (this.f9699a.mo25893h().isInstance(l2Var)) {
            return mo26774h(l2Var);
        }
        throw new GeneralSecurityException(concat);
    }

    /* renamed from: c */
    public final Object mo26665c(zzacc zzacc) {
        try {
            return mo26774h(this.f9699a.mo25849c(zzacc));
        } catch (zzadn e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.f9699a.mo25893h().getName())), e);
        }
    }

    /* renamed from: d */
    public final String mo26666d() {
        return this.f9699a.mo25850d();
    }

    /* renamed from: e */
    public final C4572l2 mo26667e(zzacc zzacc) {
        try {
            return mo26773g().mo26728a(zzacc);
        } catch (zzadn e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.f9699a.mo25847a().mo25853e().getName())), e);
        }
    }

    /* renamed from: f */
    public final C4826uh mo26668f(zzacc zzacc) {
        try {
            C4572l2 a = mo26773g().mo26728a(zzacc);
            C4774sh E = C4826uh.m13237E();
            E.mo26648m(this.f9699a.mo25850d());
            E.mo26649p(a.mo26232j());
            E.mo26647l(this.f9699a.mo25848b());
            return (C4826uh) E.mo26052e();
        } catch (zzadn e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    /* renamed from: g */
    public final C4813u4 mo26773g() {
        return new C4813u4(this.f9699a.mo25847a());
    }

    /* renamed from: h */
    public final Object mo26774h(C4572l2 l2Var) {
        if (!Void.class.equals(this.f9700b)) {
            this.f9699a.mo25851e(l2Var);
            return this.f9699a.mo25894i(l2Var, this.f9700b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }
}
