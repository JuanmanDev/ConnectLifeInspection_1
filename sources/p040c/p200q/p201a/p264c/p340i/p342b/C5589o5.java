package p040c.p200q.p201a.p264c.p340i.p342b;

/* renamed from: c.q.a.c.i.b.o5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public abstract class C5589o5 extends C5577n5 {

    /* renamed from: b */
    public boolean f10716b;

    public C5589o5(C5648t4 t4Var) {
        super(t4Var);
        this.f10699a.mo28636i();
    }

    /* renamed from: i */
    public void mo28296i() {
    }

    /* renamed from: j */
    public abstract boolean mo28227j();

    /* renamed from: k */
    public final void mo28502k() {
        if (!mo28505n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: l */
    public final void mo28503l() {
        if (this.f10716b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo28227j()) {
            this.f10699a.mo28634g();
            this.f10716b = true;
        }
    }

    /* renamed from: m */
    public final void mo28504m() {
        if (!this.f10716b) {
            mo28296i();
            this.f10699a.mo28634g();
            this.f10716b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: n */
    public final boolean mo28505n() {
        return this.f10716b;
    }
}
