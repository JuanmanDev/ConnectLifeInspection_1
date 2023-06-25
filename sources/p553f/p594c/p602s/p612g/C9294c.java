package p553f.p594c.p602s.p612g;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9194k;
import p553f.p594c.p598o.C9206a;
import p553f.p594c.p598o.C9207b;
import p630io.reactivex.internal.disposables.EmptyDisposable;
import p630io.reactivex.internal.schedulers.RxThreadFactory;

/* renamed from: f.c.s.g.c */
/* compiled from: IoScheduler */
public final class C9294c extends C9194k {

    /* renamed from: c */
    public static final RxThreadFactory f18203c;

    /* renamed from: d */
    public static final RxThreadFactory f18204d;

    /* renamed from: e */
    public static final long f18205e = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: f */
    public static final TimeUnit f18206f = TimeUnit.SECONDS;

    /* renamed from: g */
    public static final C9297c f18207g;

    /* renamed from: h */
    public static final C9295a f18208h;

    /* renamed from: a */
    public final ThreadFactory f18209a;

    /* renamed from: b */
    public final AtomicReference<C9295a> f18210b;

    /* renamed from: f.c.s.g.c$a */
    /* compiled from: IoScheduler */
    public static final class C9295a implements Runnable {

        /* renamed from: e */
        public final long f18211e;

        /* renamed from: l */
        public final ConcurrentLinkedQueue<C9297c> f18212l;

        /* renamed from: m */
        public final C9206a f18213m;

        /* renamed from: n */
        public final ScheduledExecutorService f18214n;

        /* renamed from: o */
        public final Future<?> f18215o;

        /* renamed from: p */
        public final ThreadFactory f18216p;

        public C9295a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            this.f18211e = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f18212l = new ConcurrentLinkedQueue<>();
            this.f18213m = new C9206a();
            this.f18216p = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C9294c.f18204d);
                long j2 = this.f18211e;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f18214n = scheduledExecutorService;
            this.f18215o = scheduledFuture;
        }

        /* renamed from: a */
        public void mo47130a() {
            if (!this.f18212l.isEmpty()) {
                long c = mo47132c();
                Iterator<C9297c> it = this.f18212l.iterator();
                while (it.hasNext()) {
                    C9297c next = it.next();
                    if (next.mo47136g() > c) {
                        return;
                    }
                    if (this.f18212l.remove(next)) {
                        this.f18213m.mo47026a(next);
                    }
                }
            }
        }

        /* renamed from: b */
        public C9297c mo47131b() {
            if (this.f18213m.mo47031f()) {
                return C9294c.f18207g;
            }
            while (!this.f18212l.isEmpty()) {
                C9297c poll = this.f18212l.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C9297c cVar = new C9297c(this.f18216p);
            this.f18213m.mo47027b(cVar);
            return cVar;
        }

        /* renamed from: c */
        public long mo47132c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        public void mo47133d(C9297c cVar) {
            cVar.mo47137h(mo47132c() + this.f18211e);
            this.f18212l.offer(cVar);
        }

        /* renamed from: e */
        public void mo47134e() {
            this.f18213m.dispose();
            Future<?> future = this.f18215o;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f18214n;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public void run() {
            mo47130a();
        }
    }

    /* renamed from: f.c.s.g.c$b */
    /* compiled from: IoScheduler */
    public static final class C9296b extends C9194k.C9196b {

        /* renamed from: e */
        public final C9206a f18217e;

        /* renamed from: l */
        public final C9295a f18218l;

        /* renamed from: m */
        public final C9297c f18219m;

        /* renamed from: n */
        public final AtomicBoolean f18220n = new AtomicBoolean();

        public C9296b(C9295a aVar) {
            this.f18218l = aVar;
            this.f18217e = new C9206a();
            this.f18219m = aVar.mo47131b();
        }

        /* renamed from: c */
        public C9207b mo47020c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f18217e.mo47031f()) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f18219m.mo47138d(runnable, j, timeUnit, this.f18217e);
        }

        public void dispose() {
            if (this.f18220n.compareAndSet(false, true)) {
                this.f18217e.dispose();
                this.f18218l.mo47133d(this.f18219m);
            }
        }
    }

    /* renamed from: f.c.s.g.c$c */
    /* compiled from: IoScheduler */
    public static final class C9297c extends C9299e {

        /* renamed from: m */
        public long f18221m = 0;

        public C9297c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: g */
        public long mo47136g() {
            return this.f18221m;
        }

        /* renamed from: h */
        public void mo47137h(long j) {
            this.f18221m = j;
        }
    }

    static {
        C9297c cVar = new C9297c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f18207g = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f18203c = new RxThreadFactory("RxCachedThreadScheduler", max);
        f18204d = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        C9295a aVar = new C9295a(0, (TimeUnit) null, f18203c);
        f18208h = aVar;
        aVar.mo47134e();
    }

    public C9294c() {
        this(f18203c);
    }

    /* renamed from: a */
    public C9194k.C9196b mo47013a() {
        return new C9296b(this.f18210b.get());
    }

    /* renamed from: d */
    public void mo47129d() {
        C9295a aVar = new C9295a(f18205e, f18206f, this.f18209a);
        if (!this.f18210b.compareAndSet(f18208h, aVar)) {
            aVar.mo47134e();
        }
    }

    public C9294c(ThreadFactory threadFactory) {
        this.f18209a = threadFactory;
        this.f18210b = new AtomicReference<>(f18208h);
        mo47129d();
    }
}
