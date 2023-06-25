package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.q.a.c.g.g.db */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4365db {

    /* renamed from: a */
    public final Map f9171a;

    /* renamed from: b */
    public final Map f9172b;

    /* renamed from: c */
    public final Map f9173c;

    /* renamed from: d */
    public final Map f9174d;

    public C4365db() {
        this.f9171a = new HashMap();
        this.f9172b = new HashMap();
        this.f9173c = new HashMap();
        this.f9174d = new HashMap();
    }

    /* renamed from: a */
    public final C4365db mo25896a(C4844v9 v9Var) {
        C4419fb fbVar = new C4419fb(v9Var.mo26776d(), v9Var.mo26775c(), (C4392eb) null);
        if (this.f9172b.containsKey(fbVar)) {
            C4844v9 v9Var2 = (C4844v9) this.f9172b.get(fbVar);
            if (!v9Var2.equals(v9Var) || !v9Var.equals(v9Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(fbVar.toString()));
            }
        } else {
            this.f9172b.put(fbVar, v9Var);
        }
        return this;
    }

    /* renamed from: b */
    public final C4365db mo25897b(C4948z9 z9Var) {
        C4473hb hbVar = new C4473hb(z9Var.mo26879b(), z9Var.mo26880c(), (C4446gb) null);
        if (this.f9171a.containsKey(hbVar)) {
            C4948z9 z9Var2 = (C4948z9) this.f9171a.get(hbVar);
            if (!z9Var2.equals(z9Var) || !z9Var.equals(z9Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(hbVar.toString()));
            }
        } else {
            this.f9171a.put(hbVar, z9Var);
        }
        return this;
    }

    /* renamed from: c */
    public final C4365db mo25898c(C4767sa saVar) {
        C4419fb fbVar = new C4419fb(saVar.mo26641c(), saVar.mo26640b(), (C4392eb) null);
        if (this.f9174d.containsKey(fbVar)) {
            C4767sa saVar2 = (C4767sa) this.f9174d.get(fbVar);
            if (!saVar2.equals(saVar) || !saVar.equals(saVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(fbVar.toString()));
            }
        } else {
            this.f9174d.put(fbVar, saVar);
        }
        return this;
    }

    /* renamed from: d */
    public final C4365db mo25899d(C4871wa waVar) {
        C4473hb hbVar = new C4473hb(waVar.mo26792b(), waVar.mo26793c(), (C4446gb) null);
        if (this.f9173c.containsKey(hbVar)) {
            C4871wa waVar2 = (C4871wa) this.f9173c.get(hbVar);
            if (!waVar2.equals(waVar) || !waVar.equals(waVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(hbVar.toString()));
            }
        } else {
            this.f9173c.put(hbVar, waVar);
        }
        return this;
    }

    public C4365db(C4527jb jbVar) {
        this.f9171a = new HashMap(jbVar.f9313a);
        this.f9172b = new HashMap(jbVar.f9314b);
        this.f9173c = new HashMap(jbVar.f9315c);
        this.f9174d = new HashMap(jbVar.f9316d);
    }
}
