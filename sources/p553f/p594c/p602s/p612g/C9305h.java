package p553f.p594c.p602s.p612g;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p553f.p594c.C9194k;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p598o.C9208c;
import p553f.p594c.p602s.p604b.C9227b;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.internal.disposables.EmptyDisposable;

/* renamed from: f.c.s.g.h */
/* compiled from: TrampolineScheduler */
public final class C9305h extends C9194k {

    /* renamed from: a */
    public static final C9305h f18238a = new C9305h();

    /* renamed from: f.c.s.g.h$a */
    /* compiled from: TrampolineScheduler */
    public static final class C9306a implements Runnable {

        /* renamed from: e */
        public final Runnable f18239e;

        /* renamed from: l */
        public final C9308c f18240l;

        /* renamed from: m */
        public final long f18241m;

        public C9306a(Runnable runnable, C9308c cVar, long j) {
            this.f18239e = runnable;
            this.f18240l = cVar;
            this.f18241m = j;
        }

        public void run() {
            if (!this.f18240l.f18249n) {
                long a = this.f18240l.mo47018a(TimeUnit.MILLISECONDS);
                long j = this.f18241m;
                if (j > a) {
                    try {
                        Thread.sleep(j - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C9323a.m25169p(e);
                        return;
                    }
                }
                if (!this.f18240l.f18249n) {
                    this.f18239e.run();
                }
            }
        }
    }

    /* renamed from: f.c.s.g.h$b */
    /* compiled from: TrampolineScheduler */
    public static final class C9307b implements Comparable<C9307b> {

        /* renamed from: e */
        public final Runnable f18242e;

        /* renamed from: l */
        public final long f18243l;

        /* renamed from: m */
        public final int f18244m;

        /* renamed from: n */
        public volatile boolean f18245n;

        public C9307b(Runnable runnable, Long l, int i) {
            this.f18242e = runnable;
            this.f18243l = l.longValue();
            this.f18244m = i;
        }

        /* renamed from: c */
        public int compareTo(C9307b bVar) {
            int b = C9227b.m24983b(this.f18243l, bVar.f18243l);
            return b == 0 ? C9227b.m24982a(this.f18244m, bVar.f18244m) : b;
        }
    }

    /* renamed from: f.c.s.g.h$c */
    /* compiled from: TrampolineScheduler */
    public static final class C9308c extends C9194k.C9196b implements C9207b {

        /* renamed from: e */
        public final PriorityBlockingQueue<C9307b> f18246e = new PriorityBlockingQueue<>();

        /* renamed from: l */
        public final AtomicInteger f18247l = new AtomicInteger();

        /* renamed from: m */
        public final AtomicInteger f18248m = new AtomicInteger();

        /* renamed from: n */
        public volatile boolean f18249n;

        /* renamed from: f.c.s.g.h$c$a */
        /* compiled from: TrampolineScheduler */
        public final class C9309a implements Runnable {

            /* renamed from: e */
            public final C9307b f18250e;

            public C9309a(C9307b bVar) {
                this.f18250e = bVar;
            }

            public void run() {
                this.f18250e.f18245n = true;
                C9308c.this.f18246e.remove(this.f18250e);
            }
        }

        /* renamed from: b */
        public C9207b mo47019b(Runnable runnable) {
            return mo47146d(runnable, mo47018a(TimeUnit.MILLISECONDS));
        }

        /* renamed from: c */
        public C9207b mo47020c(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = mo47018a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return mo47146d(new C9306a(runnable, this, a), a);
        }

        /* renamed from: d */
        public C9207b mo47146d(Runnable runnable, long j) {
            if (this.f18249n) {
                return EmptyDisposable.INSTANCE;
            }
            C9307b bVar = new C9307b(runnable, Long.valueOf(j), this.f18248m.incrementAndGet());
            this.f18246e.add(bVar);
            if (this.f18247l.getAndIncrement() != 0) {
                return C9208c.m24965b(new C9309a(bVar));
            }
            int i = 1;
            while (!this.f18249n) {
                C9307b poll = this.f18246e.poll();
                if (poll == null) {
                    i = this.f18247l.addAndGet(-i);
                    if (i == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!poll.f18245n) {
                    poll.f18242e.run();
                }
            }
            this.f18246e.clear();
            return EmptyDisposable.INSTANCE;
        }

        public void dispose() {
            this.f18249n = true;
        }
    }

    /* renamed from: d */
    public static C9305h m25112d() {
        return f18238a;
    }

    /* renamed from: a */
    public C9194k.C9196b mo47013a() {
        return new C9308c();
    }

    /* renamed from: b */
    public C9207b mo47014b(Runnable runnable) {
        C9323a.m25171r(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    /* renamed from: c */
    public C9207b mo47015c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C9323a.m25171r(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C9323a.m25169p(e);
        }
        return EmptyDisposable.INSTANCE;
    }
}
