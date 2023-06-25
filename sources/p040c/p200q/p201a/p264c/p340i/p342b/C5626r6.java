package p040c.p200q.p201a.p264c.p340i.p342b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c.q.a.c.i.b.r6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5626r6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f10823e;

    /* renamed from: l */
    public final /* synthetic */ C5423a7 f10824l;

    public C5626r6(C5423a7 a7Var, AtomicReference atomicReference) {
        this.f10824l = a7Var;
        this.f10823e = atomicReference;
    }

    public final void run() {
        synchronized (this.f10823e) {
            try {
                this.f10823e.set(Integer.valueOf(this.f10824l.f10699a.mo28649z().mo28247o(this.f10824l.f10699a.mo28618B().mo28707s(), C5658u2.f10950N)));
                this.f10823e.notify();
            } catch (Throwable th) {
                this.f10823e.notify();
                throw th;
            }
        }
    }
}
