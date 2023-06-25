package p040c.p200q.p201a.p264c.p340i.p342b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c.q.a.c.i.b.l6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5554l6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f10654e;

    /* renamed from: l */
    public final /* synthetic */ C5423a7 f10655l;

    public C5554l6(C5423a7 a7Var, AtomicReference atomicReference) {
        this.f10655l = a7Var;
        this.f10654e = atomicReference;
    }

    public final void run() {
        synchronized (this.f10654e) {
            try {
                this.f10654e.set(Boolean.valueOf(this.f10655l.f10699a.mo28649z().mo28235B(this.f10655l.f10699a.mo28618B().mo28707s(), C5658u2.f10947K)));
                this.f10654e.notify();
            } catch (Throwable th) {
                this.f10654e.notify();
                throw th;
            }
        }
    }
}
