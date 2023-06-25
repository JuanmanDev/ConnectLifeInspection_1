package p040c.p200q.p201a.p264c.p340i.p342b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c.q.a.c.i.b.p6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5602p6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f10746e;

    /* renamed from: l */
    public final /* synthetic */ C5423a7 f10747l;

    public C5602p6(C5423a7 a7Var, AtomicReference atomicReference) {
        this.f10747l = a7Var;
        this.f10746e = atomicReference;
    }

    public final void run() {
        synchronized (this.f10746e) {
            try {
                this.f10746e.set(this.f10747l.f10699a.mo28649z().mo28256x(this.f10747l.f10699a.mo28618B().mo28707s(), C5658u2.f10948L));
                this.f10746e.notify();
            } catch (Throwable th) {
                this.f10746e.notify();
                throw th;
            }
        }
    }
}
