package p040c.p200q.p201a.p264c.p340i.p342b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c.q.a.c.i.b.q6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5614q6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f10775e;

    /* renamed from: l */
    public final /* synthetic */ C5423a7 f10776l;

    public C5614q6(C5423a7 a7Var, AtomicReference atomicReference) {
        this.f10776l = a7Var;
        this.f10775e = atomicReference;
    }

    public final void run() {
        synchronized (this.f10775e) {
            try {
                this.f10775e.set(Long.valueOf(this.f10776l.f10699a.mo28649z().mo28250r(this.f10776l.f10699a.mo28618B().mo28707s(), C5658u2.f10949M)));
                this.f10775e.notify();
            } catch (Throwable th) {
                this.f10775e.notify();
                throw th;
            }
        }
    }
}
