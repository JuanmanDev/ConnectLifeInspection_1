package p040c.p200q.p201a.p264c.p347m;

/* renamed from: c.q.a.c.m.d0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5760d0 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C5771j f11253e;

    /* renamed from: l */
    public final /* synthetic */ C5762e0 f11254l;

    public C5760d0(C5762e0 e0Var, C5771j jVar) {
        this.f11254l = e0Var;
        this.f11253e = jVar;
    }

    public final void run() {
        synchronized (this.f11254l.f11256b) {
            C5762e0 e0Var = this.f11254l;
            if (e0Var.f11257c != null) {
                e0Var.f11257c.onSuccess(this.f11253e.mo28852m());
            }
        }
    }
}
