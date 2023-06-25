package p553f.p594c;

import java.util.concurrent.TimeUnit;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p602s.p612g.C9299e;
import p553f.p594c.p617v.C9323a;

/* renamed from: f.c.k */
/* compiled from: Scheduler */
public abstract class C9194k {

    /* renamed from: f.c.k$a */
    /* compiled from: Scheduler */
    public static final class C9195a implements C9207b, Runnable {

        /* renamed from: e */
        public final Runnable f17986e;

        /* renamed from: l */
        public final C9196b f17987l;

        /* renamed from: m */
        public Thread f17988m;

        public C9195a(Runnable runnable, C9196b bVar) {
            this.f17986e = runnable;
            this.f17987l = bVar;
        }

        public void dispose() {
            if (this.f17988m == Thread.currentThread()) {
                C9196b bVar = this.f17987l;
                if (bVar instanceof C9299e) {
                    ((C9299e) bVar).mo47140f();
                    return;
                }
            }
            this.f17987l.dispose();
        }

        public void run() {
            this.f17988m = Thread.currentThread();
            try {
                this.f17986e.run();
            } finally {
                dispose();
                this.f17988m = null;
            }
        }
    }

    /* renamed from: f.c.k$b */
    /* compiled from: Scheduler */
    public static abstract class C9196b implements C9207b {
        /* renamed from: a */
        public long mo47018a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: b */
        public C9207b mo47019b(Runnable runnable) {
            return mo47020c(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: c */
        public abstract C9207b mo47020c(Runnable runnable, long j, TimeUnit timeUnit);
    }

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());
    }

    /* renamed from: a */
    public abstract C9196b mo47013a();

    /* renamed from: b */
    public C9207b mo47014b(Runnable runnable) {
        return mo47015c(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: c */
    public C9207b mo47015c(Runnable runnable, long j, TimeUnit timeUnit) {
        C9196b a = mo47013a();
        C9195a aVar = new C9195a(C9323a.m25171r(runnable), a);
        a.mo47020c(aVar, j, timeUnit);
        return aVar;
    }
}
