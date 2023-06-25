package p040c.p200q.p201a.p264c.p347m;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* renamed from: c.q.a.c.m.t */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5787t implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C5771j f11291e;

    /* renamed from: l */
    public final /* synthetic */ C5788u f11292l;

    public C5787t(C5788u uVar, C5771j jVar) {
        this.f11292l = uVar;
        this.f11291e = jVar;
    }

    public final void run() {
        if (this.f11291e.mo28854o()) {
            this.f11292l.f11295c.mo28871v();
            return;
        }
        try {
            this.f11292l.f11295c.mo28870u(this.f11292l.f11294b.mo20377a(this.f11291e));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f11292l.f11295c.mo28869t((Exception) e.getCause());
            } else {
                this.f11292l.f11295c.mo28869t(e);
            }
        } catch (Exception e2) {
            this.f11292l.f11295c.mo28869t(e2);
        }
    }
}
