package p040c.p200q.p201a.p264c.p340i.p342b;

/* renamed from: c.q.a.c.i.b.b6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final /* synthetic */ class C5434b6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C5423a7 f10354e;

    public /* synthetic */ C5434b6(C5423a7 a7Var) {
        this.f10354e = a7Var;
    }

    public final void run() {
        C5423a7 a7Var = this.f10354e;
        a7Var.mo28029h();
        if (!a7Var.f10699a.mo28622F().f11087s.mo28590b()) {
            long a = a7Var.f10699a.mo28622F().f11088t.mo28615a();
            a7Var.f10699a.mo28622F().f11088t.mo28616b(1 + a);
            a7Var.f10699a.mo28649z();
            if (a >= 5) {
                a7Var.f10699a.mo28487b().mo28344w().mo28259a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                a7Var.f10699a.mo28622F().f11087s.mo28589a(true);
                return;
            }
            a7Var.f10699a.mo28637j();
            return;
        }
        a7Var.f10699a.mo28487b().mo28338q().mo28259a("Deferred Deep Link already retrieved. Not fetching again.");
    }
}
