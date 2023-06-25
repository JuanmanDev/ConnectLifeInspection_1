package p040c.p200q.p201a.p264c.p340i.p342b;

import androidx.annotation.WorkerThread;

/* renamed from: c.q.a.c.i.b.b4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public abstract class C5432b4 extends C5419a3 {

    /* renamed from: b */
    public boolean f10351b;

    public C5432b4(C5648t4 t4Var) {
        super(t4Var);
        this.f10699a.mo28636i();
    }

    /* renamed from: i */
    public final void mo28106i() {
        if (!mo28110m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo28107j() {
        if (this.f10351b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo28061n()) {
            this.f10699a.mo28634g();
            this.f10351b = true;
        }
    }

    /* renamed from: k */
    public final void mo28108k() {
        if (!this.f10351b) {
            mo28109l();
            this.f10699a.mo28634g();
            this.f10351b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    @WorkerThread
    /* renamed from: l */
    public void mo28109l() {
    }

    /* renamed from: m */
    public final boolean mo28110m() {
        return this.f10351b;
    }

    /* renamed from: n */
    public abstract boolean mo28061n();
}
