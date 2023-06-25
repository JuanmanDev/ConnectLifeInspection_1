package p553f.p594c.p602s.p612g;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9194k;
import p553f.p594c.p598o.C9206a;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.internal.disposables.EmptyDisposable;
import p630io.reactivex.internal.schedulers.RxThreadFactory;
import p630io.reactivex.internal.schedulers.ScheduledDirectTask;
import p630io.reactivex.internal.schedulers.ScheduledRunnable;

/* renamed from: f.c.s.g.g */
/* compiled from: SingleScheduler */
public final class C9303g extends C9194k {

    /* renamed from: b */
    public static final RxThreadFactory f18232b = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: c */
    public static final ScheduledExecutorService f18233c;

    /* renamed from: a */
    public final AtomicReference<ScheduledExecutorService> f18234a;

    /* renamed from: f.c.s.g.g$a */
    /* compiled from: SingleScheduler */
    public static final class C9304a extends C9194k.C9196b {

        /* renamed from: e */
        public final ScheduledExecutorService f18235e;

        /* renamed from: l */
        public final C9206a f18236l = new C9206a();

        /* renamed from: m */
        public volatile boolean f18237m;

        public C9304a(ScheduledExecutorService scheduledExecutorService) {
            this.f18235e = scheduledExecutorService;
        }

        /* renamed from: c */
        public C9207b mo47020c(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f18237m) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(C9323a.m25171r(runnable), this.f18236l);
            this.f18236l.mo47027b(scheduledRunnable);
            if (j <= 0) {
                try {
                    future = this.f18235e.submit(scheduledRunnable);
                } catch (RejectedExecutionException e) {
                    dispose();
                    C9323a.m25169p(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = this.f18235e.schedule(scheduledRunnable, j, timeUnit);
            }
            scheduledRunnable.setFuture(future);
            return scheduledRunnable;
        }

        public void dispose() {
            if (!this.f18237m) {
                this.f18237m = true;
                this.f18236l.dispose();
            }
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f18233c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public C9303g() {
        this(f18232b);
    }

    /* renamed from: d */
    public static ScheduledExecutorService m25108d(ThreadFactory threadFactory) {
        return C9300f.m25103a(threadFactory);
    }

    /* renamed from: a */
    public C9194k.C9196b mo47013a() {
        return new C9304a(this.f18234a.get());
    }

    /* renamed from: c */
    public C9207b mo47015c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(C9323a.m25171r(runnable));
        if (j <= 0) {
            try {
                future = this.f18234a.get().submit(scheduledDirectTask);
            } catch (RejectedExecutionException e) {
                C9323a.m25169p(e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = this.f18234a.get().schedule(scheduledDirectTask, j, timeUnit);
        }
        scheduledDirectTask.setFuture(future);
        return scheduledDirectTask;
    }

    public C9303g(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f18234a = atomicReference;
        atomicReference.lazySet(m25108d(threadFactory));
    }
}
