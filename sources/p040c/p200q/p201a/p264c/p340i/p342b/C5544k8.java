package p040c.p200q.p201a.p264c.p340i.p342b;

/* renamed from: c.q.a.c.i.b.k8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5544k8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C5691x2 f10618e;

    /* renamed from: l */
    public final /* synthetic */ C5604p8 f10619l;

    public C5544k8(C5604p8 p8Var, C5691x2 x2Var) {
        this.f10619l = p8Var;
        this.f10618e = x2Var;
    }

    public final void run() {
        synchronized (this.f10619l) {
            this.f10619l.f10749e = false;
            if (!this.f10619l.f10751m.mo28584z()) {
                this.f10619l.f10751m.f10699a.mo28487b().mo28343v().mo28259a("Connected to service");
                this.f10619l.f10751m.mo28582x(this.f10618e);
            }
        }
    }
}
