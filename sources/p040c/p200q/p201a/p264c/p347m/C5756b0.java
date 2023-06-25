package p040c.p200q.p201a.p264c.p347m;

import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.m.b0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5756b0 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C5771j f11248e;

    /* renamed from: l */
    public final /* synthetic */ C5758c0 f11249l;

    public C5756b0(C5758c0 c0Var, C5771j jVar) {
        this.f11249l = c0Var;
        this.f11248e = jVar;
    }

    public final void run() {
        synchronized (this.f11249l.f11251b) {
            C5758c0 c0Var = this.f11249l;
            if (c0Var.f11252c != null) {
                C5763f a = c0Var.f11252c;
                Exception l = this.f11248e.mo28851l();
                C3495o.m8908j(l);
                a.onFailure(l);
            }
        }
    }
}
