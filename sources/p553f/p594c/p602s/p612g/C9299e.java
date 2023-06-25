package p553f.p594c.p602s.p612g;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p553f.p594c.C9194k;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p602s.p603a.C9220a;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.internal.disposables.EmptyDisposable;
import p630io.reactivex.internal.schedulers.ScheduledDirectTask;
import p630io.reactivex.internal.schedulers.ScheduledRunnable;

/* renamed from: f.c.s.g.e */
/* compiled from: NewThreadWorker */
public class C9299e extends C9194k.C9196b implements C9207b {

    /* renamed from: e */
    public final ScheduledExecutorService f18224e;

    /* renamed from: l */
    public volatile boolean f18225l;

    public C9299e(ThreadFactory threadFactory) {
        this.f18224e = C9300f.m25103a(threadFactory);
    }

    /* renamed from: b */
    public C9207b mo47019b(Runnable runnable) {
        return mo47020c(runnable, 0, (TimeUnit) null);
    }

    /* renamed from: c */
    public C9207b mo47020c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f18225l) {
            return EmptyDisposable.INSTANCE;
        }
        return mo47138d(runnable, j, timeUnit, (C9220a) null);
    }

    /* renamed from: d */
    public ScheduledRunnable mo47138d(Runnable runnable, long j, TimeUnit timeUnit, C9220a aVar) {
        Future future;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(C9323a.m25171r(runnable), aVar);
        if (aVar != null && !aVar.mo47027b(scheduledRunnable)) {
            return scheduledRunnable;
        }
        if (j <= 0) {
            try {
                future = this.f18224e.submit(scheduledRunnable);
            } catch (RejectedExecutionException e) {
                if (aVar != null) {
                    aVar.mo47026a(scheduledRunnable);
                }
                C9323a.m25169p(e);
            }
        } else {
            future = this.f18224e.schedule(scheduledRunnable, j, timeUnit);
        }
        scheduledRunnable.setFuture(future);
        return scheduledRunnable;
    }

    public void dispose() {
        if (!this.f18225l) {
            this.f18225l = true;
            this.f18224e.shutdownNow();
        }
    }

    /* renamed from: e */
    public C9207b mo47139e(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(C9323a.m25171r(runnable));
        if (j <= 0) {
            try {
                future = this.f18224e.submit(scheduledDirectTask);
            } catch (RejectedExecutionException e) {
                C9323a.m25169p(e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = this.f18224e.schedule(scheduledDirectTask, j, timeUnit);
        }
        scheduledDirectTask.setFuture(future);
        return scheduledDirectTask;
    }

    /* renamed from: f */
    public void mo47140f() {
        if (!this.f18225l) {
            this.f18225l = true;
            this.f18224e.shutdown();
        }
    }
}
