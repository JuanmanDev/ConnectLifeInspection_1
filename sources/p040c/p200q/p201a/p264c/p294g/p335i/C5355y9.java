package p040c.p200q.p201a.p264c.p294g.p335i;

/* renamed from: c.q.a.c.g.i.y9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5355y9 implements C5065fa {

    /* renamed from: a */
    public final C5295u9 f10282a;

    /* renamed from: b */
    public final C5326wa f10283b;

    /* renamed from: c */
    public final boolean f10284c;

    /* renamed from: d */
    public final C5095h8 f10285d;

    public C5355y9(C5326wa waVar, C5095h8 h8Var, C5295u9 u9Var) {
        this.f10283b = waVar;
        this.f10284c = h8Var.mo27307c(u9Var);
        this.f10285d = h8Var;
        this.f10282a = u9Var;
    }

    /* renamed from: j */
    public static C5355y9 m15368j(C5326wa waVar, C5095h8 h8Var, C5295u9 u9Var) {
        return new C5355y9(waVar, h8Var, u9Var);
    }

    /* renamed from: a */
    public final int mo27237a(Object obj) {
        int hashCode = this.f10283b.mo27867d(obj).hashCode();
        if (!this.f10284c) {
            return hashCode;
        }
        this.f10285d.mo27305a(obj);
        throw null;
    }

    /* renamed from: b */
    public final void mo27238b(Object obj) {
        this.f10283b.mo27870g(obj);
        this.f10285d.mo27306b(obj);
        throw null;
    }

    /* renamed from: c */
    public final boolean mo27239c(Object obj) {
        this.f10285d.mo27305a(obj);
        throw null;
    }

    /* renamed from: d */
    public final Object mo27240d() {
        C5295u9 u9Var = this.f10282a;
        if (u9Var instanceof C5279t8) {
            return ((C5279t8) u9Var).mo27719j();
        }
        return u9Var.mo27714c().mo27523o();
    }

    /* renamed from: e */
    public final int mo27241e(Object obj) {
        C5326wa waVar = this.f10283b;
        int b = waVar.mo27865b(waVar.mo27867d(obj));
        if (!this.f10284c) {
            return b;
        }
        this.f10285d.mo27305a(obj);
        throw null;
    }

    /* renamed from: f */
    public final void mo27242f(Object obj, Object obj2) {
        C5097ha.m14249f(this.f10283b, obj, obj2);
        if (this.f10284c) {
            C5097ha.m14248e(this.f10285d, obj, obj2);
            throw null;
        }
    }

    /* renamed from: g */
    public final boolean mo27243g(Object obj, Object obj2) {
        if (!this.f10283b.mo27867d(obj).equals(this.f10283b.mo27867d(obj2))) {
            return false;
        }
        if (!this.f10284c) {
            return true;
        }
        this.f10285d.mo27305a(obj);
        throw null;
    }

    /* renamed from: h */
    public final void mo27244h(Object obj, C5192nb nbVar) {
        this.f10285d.mo27305a(obj);
        throw null;
    }

    /* renamed from: i */
    public final void mo27245i(Object obj, byte[] bArr, int i, int i2, C5094h7 h7Var) {
        C5279t8 t8Var = (C5279t8) obj;
        if (t8Var.zzc == C5341xa.m15301c()) {
            t8Var.zzc = C5341xa.m15303f();
        }
        C5249r8 r8Var = (C5249r8) obj;
        throw null;
    }
}
