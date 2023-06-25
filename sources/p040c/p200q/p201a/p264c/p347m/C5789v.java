package p040c.p200q.p201a.p264c.p347m;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* renamed from: c.q.a.c.m.v */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5789v implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C5771j f11296e;

    /* renamed from: l */
    public final /* synthetic */ C5790w f11297l;

    public C5789v(C5790w wVar, C5771j jVar) {
        this.f11297l = wVar;
        this.f11296e = jVar;
    }

    public final void run() {
        try {
            C5771j jVar = (C5771j) this.f11297l.f11299b.mo20377a(this.f11296e);
            if (jVar == null) {
                this.f11297l.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            jVar.mo28847h(C5775l.f11269b, this.f11297l);
            jVar.mo28845f(C5775l.f11269b, this.f11297l);
            jVar.mo28840a(C5775l.f11269b, this.f11297l);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f11297l.f11300c.mo28869t((Exception) e.getCause());
            } else {
                this.f11297l.f11300c.mo28869t(e);
            }
        } catch (Exception e2) {
            this.f11297l.f11300c.mo28869t(e2);
        }
    }
}
