package p040c.p200q.p201a.p264c.p347m;

import java.util.concurrent.Callable;

/* renamed from: c.q.a.c.m.o0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5782o0 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C5780n0 f11279e;

    /* renamed from: l */
    public final /* synthetic */ Callable f11280l;

    public C5782o0(C5780n0 n0Var, Callable callable) {
        this.f11279e = n0Var;
        this.f11280l = callable;
    }

    public final void run() {
        try {
            this.f11279e.mo28870u(this.f11280l.call());
        } catch (Exception e) {
            this.f11279e.mo28869t(e);
        } catch (Throwable th) {
            this.f11279e.mo28869t(new RuntimeException(th));
        }
    }
}
