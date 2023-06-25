package p040c.p200q.p201a.p264c.p340i.p342b;

import androidx.annotation.Nullable;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.q4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5612q4 extends C5589o5 {

    /* renamed from: l */
    public static final AtomicLong f10765l = new AtomicLong(Long.MIN_VALUE);
    @Nullable

    /* renamed from: c */
    public C5600p4 f10766c;
    @Nullable

    /* renamed from: d */
    public C5600p4 f10767d;

    /* renamed from: e */
    public final PriorityBlockingQueue f10768e = new PriorityBlockingQueue();

    /* renamed from: f */
    public final BlockingQueue f10769f = new LinkedBlockingQueue();

    /* renamed from: g */
    public final Thread.UncaughtExceptionHandler f10770g = new C5576n4(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h */
    public final Thread.UncaughtExceptionHandler f10771h = new C5576n4(this, "Thread death: Uncaught exception on network thread");

    /* renamed from: i */
    public final Object f10772i = new Object();

    /* renamed from: j */
    public final Semaphore f10773j = new Semaphore(2);

    /* renamed from: k */
    public volatile boolean f10774k;

    public C5612q4(C5648t4 t4Var) {
        super(t4Var);
    }

    /* renamed from: A */
    public final void mo28533A(Runnable runnable) {
        mo28502k();
        C3495o.m8908j(runnable);
        mo28535D(new C5588o4(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: C */
    public final boolean mo28534C() {
        return Thread.currentThread() == this.f10766c;
    }

    /* renamed from: D */
    public final void mo28535D(C5588o4 o4Var) {
        synchronized (this.f10772i) {
            this.f10768e.add(o4Var);
            C5600p4 p4Var = this.f10766c;
            if (p4Var == null) {
                C5600p4 p4Var2 = new C5600p4(this, "Measurement Worker", this.f10768e);
                this.f10766c = p4Var2;
                p4Var2.setUncaughtExceptionHandler(this.f10770g);
                this.f10766c.start();
            } else {
                p4Var.mo28517a();
            }
        }
    }

    /* renamed from: g */
    public final void mo28491g() {
        if (Thread.currentThread() != this.f10767d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: h */
    public final void mo28029h() {
        if (Thread.currentThread() != this.f10766c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: j */
    public final boolean mo28227j() {
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = r1.f10699a.mo28487b().mo28344w();
        r3.mo28259a("Interrupted waiting for " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r1.f10699a.mo28487b().mo28344w().mo28259a("Timed out waiting for ".concat(r5));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
    @androidx.annotation.Nullable
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo28536r(java.util.concurrent.atomic.AtomicReference r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            c.q.a.c.i.b.t4 r0 = r1.f10699a     // Catch:{ all -> 0x0049 }
            c.q.a.c.i.b.q4 r0 = r0.mo28486a()     // Catch:{ all -> 0x0049 }
            r0.mo28540z(r6)     // Catch:{ all -> 0x0049 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0027
            c.q.a.c.i.b.t4 r3 = r1.f10699a
            c.q.a.c.i.b.i3 r3 = r3.mo28487b()
            c.q.a.c.i.b.g3 r3 = r3.mo28344w()
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r4 = r4.concat(r5)
            r3.mo28259a(r4)
        L_0x0027:
            return r2
        L_0x0028:
            c.q.a.c.i.b.t4 r3 = r1.f10699a     // Catch:{ all -> 0x0049 }
            c.q.a.c.i.b.i3 r3 = r3.mo28487b()     // Catch:{ all -> 0x0049 }
            c.q.a.c.i.b.g3 r3 = r3.mo28344w()     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r4.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r6 = "Interrupted waiting for "
            r4.append(r6)     // Catch:{ all -> 0x0049 }
            r4.append(r5)     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0049 }
            r3.mo28259a(r4)     // Catch:{ all -> 0x0049 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            r2 = 0
            return r2
        L_0x0049:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5612q4.mo28536r(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: s */
    public final Future mo28537s(Callable callable) {
        mo28502k();
        C3495o.m8908j(callable);
        C5588o4 o4Var = new C5588o4(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f10766c) {
            if (!this.f10768e.isEmpty()) {
                this.f10699a.mo28487b().mo28344w().mo28259a("Callable skipped the worker queue.");
            }
            o4Var.run();
        } else {
            mo28535D(o4Var);
        }
        return o4Var;
    }

    /* renamed from: t */
    public final Future mo28538t(Callable callable) {
        mo28502k();
        C3495o.m8908j(callable);
        C5588o4 o4Var = new C5588o4(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f10766c) {
            o4Var.run();
        } else {
            mo28535D(o4Var);
        }
        return o4Var;
    }

    /* renamed from: y */
    public final void mo28539y(Runnable runnable) {
        mo28502k();
        C3495o.m8908j(runnable);
        C5588o4 o4Var = new C5588o4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f10772i) {
            this.f10769f.add(o4Var);
            C5600p4 p4Var = this.f10767d;
            if (p4Var == null) {
                C5600p4 p4Var2 = new C5600p4(this, "Measurement Network", this.f10769f);
                this.f10767d = p4Var2;
                p4Var2.setUncaughtExceptionHandler(this.f10771h);
                this.f10767d.start();
            } else {
                p4Var.mo28517a();
            }
        }
    }

    /* renamed from: z */
    public final void mo28540z(Runnable runnable) {
        mo28502k();
        C3495o.m8908j(runnable);
        mo28535D(new C5588o4(this, runnable, false, "Task exception on worker thread"));
    }
}
