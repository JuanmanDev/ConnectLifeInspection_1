package p040c.p200q.p201a.p264c.p340i.p342b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c.q.a.c.i.b.s6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5638s6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f10852e;

    /* renamed from: l */
    public final /* synthetic */ C5423a7 f10853l;

    public C5638s6(C5423a7 a7Var, AtomicReference atomicReference) {
        this.f10853l = a7Var;
        this.f10852e = atomicReference;
    }

    public final void run() {
        synchronized (this.f10852e) {
            try {
                this.f10852e.set(Double.valueOf(this.f10853l.f10699a.mo28649z().mo28243k(this.f10853l.f10699a.mo28618B().mo28707s(), C5658u2.f10951O)));
                this.f10852e.notify();
            } catch (Throwable th) {
                this.f10852e.notify();
                throw th;
            }
        }
    }
}
