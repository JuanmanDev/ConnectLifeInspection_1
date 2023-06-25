package p040c.p200q.p201a.p264c.p347m;

/* renamed from: c.q.a.c.m.z */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5793z implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C5771j f11305e;

    /* renamed from: l */
    public final /* synthetic */ C5754a0 f11306l;

    public C5793z(C5754a0 a0Var, C5771j jVar) {
        this.f11306l = a0Var;
        this.f11305e = jVar;
    }

    public final void run() {
        synchronized (this.f11306l.f11245b) {
            C5754a0 a0Var = this.f11306l;
            if (a0Var.f11246c != null) {
                a0Var.f11246c.onComplete(this.f11305e);
            }
        }
    }
}
