package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzadn;
import com.google.android.gms.internal.p527firebaseauthapi.zznr;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.d5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4359d5 {

    /* renamed from: a */
    public final C4453gi f9165a;

    /* renamed from: b */
    public final C4421fd f9166b = C4421fd.f9226b;

    public C4359d5(C4453gi giVar) {
        this.f9165a = giVar;
    }

    /* renamed from: a */
    public static final C4359d5 m11818a(C4453gi giVar) {
        m11820i(giVar);
        return new C4359d5(giVar);
    }

    /* renamed from: h */
    public static final C4359d5 m11819h(C4714q9 q9Var, C4574l4 l4Var) {
        byte[] bArr = new byte[0];
        C4773sg a = q9Var.mo26573a();
        if (a == null || a.mo26646H().zzd() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            C4453gi J = C4453gi.m12058J(l4Var.mo25783a(a.mo26646H().zzt(), bArr), C4913y0.m13537a());
            m11820i(J);
            return new C4359d5(J);
        } catch (zzadn unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* renamed from: i */
    public static void m11820i(C4453gi giVar) {
        if (giVar == null || giVar.mo26033E() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* renamed from: b */
    public final C4359d5 mo25884b() {
        if (this.f9165a != null) {
            C4372di G = C4453gi.m12056G();
            for (C4426fi fiVar : this.f9165a.mo26036K()) {
                C4826uh F = fiVar.mo25991F();
                if (F.mo26731F() == zznr.ASYMMETRIC_PRIVATE) {
                    String J = F.mo26733J();
                    zzacc I = F.mo26732I();
                    C4787t4 a = C4840v5.m13295a(J);
                    if (a instanceof C4762s5) {
                        C4826uh b = ((C4762s5) a).mo26638b(I);
                        C4840v5.m13300f(b);
                        C4399ei eiVar = (C4399ei) fiVar.mo26164y();
                        eiVar.mo25945l(b);
                        G.mo25908m((C4426fi) eiVar.mo26052e());
                    } else {
                        throw new GeneralSecurityException("manager for key type " + J + " is not a PrivateKeyManager");
                    }
                } else {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
            }
            G.mo25909p(this.f9165a.mo26034F());
            return new C4359d5((C4453gi) G.mo26052e());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    /* renamed from: c */
    public final C4453gi mo25885c() {
        return this.f9165a;
    }

    /* renamed from: d */
    public final C4588li mo25886d() {
        return C4918y5.m13576a(this.f9165a);
    }

    /* renamed from: e */
    public final Object mo25887e(Class cls) {
        Class e = C4840v5.m13299e(cls);
        if (e != null) {
            C4918y5.m13577b(this.f9165a);
            C4575l5 l5Var = new C4575l5(e, (C4548k5) null);
            l5Var.mo26253c(this.f9166b);
            for (C4426fi fiVar : this.f9165a.mo26036K()) {
                if (fiVar.mo25994N() == 3) {
                    Object g = C4840v5.m13301g(fiVar.mo25991F(), e);
                    if (fiVar.mo25990E() == this.f9165a.mo26034F()) {
                        l5Var.mo26251a(g, fiVar);
                    } else {
                        l5Var.mo26252b(g, fiVar);
                    }
                }
            }
            return C4840v5.m13305k(l5Var.mo26254d(), cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
    }

    /* renamed from: f */
    public final void mo25888f(C4413f5 f5Var, C4574l4 l4Var) {
        byte[] bArr = new byte[0];
        C4453gi giVar = this.f9165a;
        byte[] b = l4Var.mo25784b(giVar.mo26231i(), bArr);
        try {
            if (C4453gi.m12058J(l4Var.mo25783a(b, bArr), C4913y0.m13537a()).equals(giVar)) {
                C4747rg E = C4773sg.m13073E();
                E.mo26617l(zzacc.zzn(b));
                E.mo26618m(C4918y5.m13576a(giVar));
                f5Var.mo25973a((C4773sg) E.mo26052e());
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (zzadn unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25889g(p040c.p200q.p201a.p264c.p294g.p333g.C4413f5 r5) {
        /*
            r4 = this;
            c.q.a.c.g.g.gi r0 = r4.f9165a
            java.util.List r0 = r0.mo26036K()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r0.next()
            c.q.a.c.g.g.fi r1 = (p040c.p200q.p201a.p264c.p294g.p333g.C4426fi) r1
            c.q.a.c.g.g.uh r2 = r1.mo25991F()
            com.google.android.gms.internal.firebase-auth-api.zznr r2 = r2.mo26731F()
            com.google.android.gms.internal.firebase-auth-api.zznr r3 = com.google.android.gms.internal.p527firebaseauthapi.zznr.UNKNOWN_KEYMATERIAL
            if (r2 == r3) goto L_0x003b
            c.q.a.c.g.g.uh r2 = r1.mo25991F()
            com.google.android.gms.internal.firebase-auth-api.zznr r2 = r2.mo26731F()
            com.google.android.gms.internal.firebase-auth-api.zznr r3 = com.google.android.gms.internal.p527firebaseauthapi.zznr.SYMMETRIC
            if (r2 == r3) goto L_0x003b
            c.q.a.c.g.g.uh r2 = r1.mo25991F()
            com.google.android.gms.internal.firebase-auth-api.zznr r2 = r2.mo26731F()
            com.google.android.gms.internal.firebase-auth-api.zznr r3 = com.google.android.gms.internal.p527firebaseauthapi.zznr.ASYMMETRIC_PRIVATE
            if (r2 == r3) goto L_0x003b
            goto L_0x000a
        L_0x003b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            c.q.a.c.g.g.uh r3 = r1.mo25991F()
            com.google.android.gms.internal.firebase-auth-api.zznr r3 = r3.mo26731F()
            java.lang.String r3 = r3.name()
            r0[r2] = r3
            r2 = 1
            c.q.a.c.g.g.uh r1 = r1.mo25991F()
            java.lang.String r1 = r1.mo26733J()
            r0[r2] = r1
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r5.<init>(r0)
            throw r5
        L_0x0064:
            c.q.a.c.g.g.gi r0 = r4.f9165a
            r5.mo25974b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4359d5.mo25889g(c.q.a.c.g.g.f5):void");
    }

    public final String toString() {
        return C4918y5.m13576a(this.f9165a).toString();
    }
}
