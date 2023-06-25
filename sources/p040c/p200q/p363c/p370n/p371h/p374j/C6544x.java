package p040c.p200q.p363c.p370n.p371h.p374j;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p040c.p200q.p363c.p370n.p371h.C6479f;

/* renamed from: c.q.c.n.h.j.x */
/* compiled from: ExecutorUtils */
public final class C6544x {

    /* renamed from: c.q.c.n.h.j.x$a */
    /* compiled from: ExecutorUtils */
    public class C6545a implements ThreadFactory {

        /* renamed from: e */
        public final /* synthetic */ String f12341e;

        /* renamed from: l */
        public final /* synthetic */ AtomicLong f12342l;

        /* renamed from: c.q.c.n.h.j.x$a$a */
        /* compiled from: ExecutorUtils */
        public class C6546a extends C6509j {

            /* renamed from: e */
            public final /* synthetic */ Runnable f12343e;

            public C6546a(C6545a aVar, Runnable runnable) {
                this.f12343e = runnable;
            }

            /* renamed from: a */
            public void mo30688a() {
                this.f12343e.run();
            }
        }

        public C6545a(String str, AtomicLong atomicLong) {
            this.f12341e = str;
            this.f12342l = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C6546a(this, runnable));
            newThread.setName(this.f12341e + this.f12342l.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: c.q.c.n.h.j.x$b */
    /* compiled from: ExecutorUtils */
    public class C6547b extends C6509j {

        /* renamed from: e */
        public final /* synthetic */ String f12344e;

        /* renamed from: l */
        public final /* synthetic */ ExecutorService f12345l;

        /* renamed from: m */
        public final /* synthetic */ long f12346m;

        /* renamed from: n */
        public final /* synthetic */ TimeUnit f12347n;

        public C6547b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f12344e = str;
            this.f12345l = executorService;
            this.f12346m = j;
            this.f12347n = timeUnit;
        }

        /* renamed from: a */
        public void mo30688a() {
            try {
                C6479f f = C6479f.m18125f();
                f.mo30641b("Executing shutdown hook for " + this.f12344e);
                this.f12345l.shutdown();
                if (!this.f12345l.awaitTermination(this.f12346m, this.f12347n)) {
                    C6479f f2 = C6479f.m18125f();
                    f2.mo30641b(this.f12344e + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f12345l.shutdownNow();
                }
            } catch (InterruptedException unused) {
                C6479f.m18125f().mo30641b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f12344e}));
                this.f12345l.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    public static void m18396a(String str, ExecutorService executorService) {
        m18397b(str, executorService, 2, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public static void m18397b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C6547b bVar = new C6547b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m18398c(String str) {
        ExecutorService e = m18400e(m18399d(str), new ThreadPoolExecutor.DiscardPolicy());
        m18396a(str, e);
        return e;
    }

    /* renamed from: d */
    public static ThreadFactory m18399d(String str) {
        return new C6545a(str, new AtomicLong(1));
    }

    /* renamed from: e */
    public static ExecutorService m18400e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
