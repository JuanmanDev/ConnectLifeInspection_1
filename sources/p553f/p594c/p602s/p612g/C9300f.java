package p553f.p594c.p602s.p612g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p630io.reactivex.internal.schedulers.RxThreadFactory;

/* renamed from: f.c.s.g.f */
/* compiled from: SchedulerPoolFactory */
public final class C9300f {

    /* renamed from: a */
    public static final boolean f18226a;

    /* renamed from: b */
    public static final int f18227b;

    /* renamed from: c */
    public static final AtomicReference<ScheduledExecutorService> f18228c = new AtomicReference<>();

    /* renamed from: d */
    public static final Map<ScheduledThreadPoolExecutor, Object> f18229d = new ConcurrentHashMap();

    /* renamed from: f.c.s.g.f$a */
    /* compiled from: SchedulerPoolFactory */
    public static final class C9301a {

        /* renamed from: a */
        public boolean f18230a;

        /* renamed from: b */
        public int f18231b;

        /* renamed from: a */
        public void mo47141a(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.f18230a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.f18230a = true;
            }
            if (!this.f18230a || !properties.containsKey("rx2.purge-period-seconds")) {
                this.f18231b = 1;
                return;
            }
            try {
                this.f18231b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
                this.f18231b = 1;
            }
        }
    }

    /* renamed from: f.c.s.g.f$b */
    /* compiled from: SchedulerPoolFactory */
    public static final class C9302b implements Runnable {
        public void run() {
            Iterator it = new ArrayList(C9300f.f18229d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C9300f.f18229d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        C9301a aVar = new C9301a();
        aVar.mo47141a(properties);
        f18226a = aVar.f18230a;
        f18227b = aVar.f18231b;
        m25104b();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m25103a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m25105c(f18226a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: b */
    public static void m25104b() {
        m25106d(f18226a);
    }

    /* renamed from: c */
    public static void m25105c(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f18229d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* renamed from: d */
    public static void m25106d(boolean z) {
        if (z) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = f18228c.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
                    if (f18228c.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                        C9302b bVar = new C9302b();
                        int i = f18227b;
                        newScheduledThreadPool.scheduleAtFixedRate(bVar, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }
}
