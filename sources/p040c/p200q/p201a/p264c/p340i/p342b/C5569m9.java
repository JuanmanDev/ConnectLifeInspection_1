package p040c.p200q.p201a.p264c.p340i.p342b;

/* renamed from: c.q.a.c.i.b.m9 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public abstract class C5569m9 extends C5557l9 {

    /* renamed from: c */
    public boolean f10684c;

    public C5569m9(C5709y9 y9Var) {
        super(y9Var);
        this.f10663b.mo28759r();
    }

    /* renamed from: i */
    public final void mo28475i() {
        if (!mo28477k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo28476j() {
        if (!this.f10684c) {
            mo28087l();
            this.f10663b.mo28754m();
            this.f10684c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: k */
    public final boolean mo28477k() {
        return this.f10684c;
    }

    /* renamed from: l */
    public abstract boolean mo28087l();
}
