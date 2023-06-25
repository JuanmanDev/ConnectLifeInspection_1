package p040c.p200q.p201a.p264c.p347m;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;

/* renamed from: c.q.a.c.m.f0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5764f0 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C5771j f11258e;

    /* renamed from: l */
    public final /* synthetic */ C5766g0 f11259l;

    public C5764f0(C5766g0 g0Var, C5771j jVar) {
        this.f11259l = g0Var;
        this.f11258e = jVar;
    }

    public final void run() {
        try {
            C5771j a = this.f11259l.f11261b.mo20378a(this.f11258e.mo28852m());
            if (a == null) {
                this.f11259l.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            a.mo28847h(C5775l.f11269b, this.f11259l);
            a.mo28845f(C5775l.f11269b, this.f11259l);
            a.mo28840a(C5775l.f11269b, this.f11259l);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f11259l.onFailure((Exception) e.getCause());
            } else {
                this.f11259l.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.f11259l.mo28832a();
        } catch (Exception e2) {
            this.f11259l.onFailure(e2);
        }
    }
}
