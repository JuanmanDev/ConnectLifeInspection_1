package p040c.p200q.p201a.p264c.p294g.p333g;

/* renamed from: c.q.a.c.g.g.p2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4680p2 implements C4889x2 {

    /* renamed from: a */
    public final C4572l2 f9541a;

    /* renamed from: b */
    public final C4654o3 f9542b;

    /* renamed from: c */
    public final boolean f9543c;

    /* renamed from: d */
    public final C4939z0 f9544d;

    public C4680p2(C4654o3 o3Var, C4939z0 z0Var, C4572l2 l2Var) {
        this.f9542b = o3Var;
        this.f9543c = z0Var.mo25761e(l2Var);
        this.f9544d = z0Var;
        this.f9541a = l2Var;
    }

    /* renamed from: k */
    public static C4680p2 m12764k(C4654o3 o3Var, C4939z0 z0Var, C4572l2 l2Var) {
        return new C4680p2(o3Var, z0Var, l2Var);
    }

    /* renamed from: a */
    public final int mo26411a(Object obj) {
        int hashCode = this.f9542b.mo26440d(obj).hashCode();
        if (!this.f9543c) {
            return hashCode;
        }
        this.f9544d.mo25757a(obj);
        throw null;
    }

    /* renamed from: b */
    public final void mo26413b(Object obj) {
        this.f9542b.mo26449m(obj);
        this.f9544d.mo25760d(obj);
        throw null;
    }

    /* renamed from: c */
    public final boolean mo26415c(Object obj) {
        this.f9544d.mo25757a(obj);
        throw null;
    }

    /* renamed from: d */
    public final Object mo26417d() {
        C4572l2 l2Var = this.f9541a;
        if (l2Var instanceof C4544k1) {
            return ((C4544k1) l2Var).mo26148A();
        }
        return l2Var.mo26159r().mo26054g();
    }

    /* renamed from: e */
    public final int mo26419e(Object obj) {
        C4654o3 o3Var = this.f9542b;
        int b = o3Var.mo26438b(o3Var.mo26440d(obj));
        if (!this.f9543c) {
            return b;
        }
        this.f9544d.mo25757a(obj);
        throw null;
    }

    /* renamed from: f */
    public final void mo26420f(Object obj, Object obj2) {
        C4941z2.m13664f(this.f9542b, obj, obj2);
        if (this.f9543c) {
            C4941z2.m13663e(this.f9544d, obj, obj2);
            throw null;
        }
    }

    /* renamed from: g */
    public final boolean mo26421g(Object obj, Object obj2) {
        if (!this.f9542b.mo26440d(obj).equals(this.f9542b.mo26440d(obj2))) {
            return false;
        }
        if (!this.f9543c) {
            return true;
        }
        this.f9544d.mo25757a(obj);
        throw null;
    }

    /* renamed from: h */
    public final void mo26422h(Object obj, byte[] bArr, int i, int i2, C4860w wVar) {
        C4544k1 k1Var = (C4544k1) obj;
        if (k1Var.zzc == C4681p3.m12775c()) {
            k1Var.zzc = C4681p3.m12777f();
        }
        C4490i1 i1Var = (C4490i1) obj;
        throw null;
    }

    /* renamed from: i */
    public final void mo26423i(Object obj, C4809u0 u0Var) {
        this.f9544d.mo25757a(obj);
        throw null;
    }

    /* renamed from: j */
    public final void mo26424j(Object obj, C4863w2 w2Var, C4913y0 y0Var) {
        C4654o3 o3Var = this.f9542b;
        C4939z0 z0Var = this.f9544d;
        o3Var.mo26439c(obj);
        z0Var.mo25758b(obj);
        throw null;
    }
}
