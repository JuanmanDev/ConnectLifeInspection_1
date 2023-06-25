package p040c.p072c.p073a.p074a;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: c.c.a.a.x */
/* compiled from: ThreadUtils */
public final class C1528x {

    /* renamed from: a */
    public static final Handler f747a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static final Map<Integer, Map<Integer, ExecutorService>> f748b = new HashMap();

    /* renamed from: c */
    public static final int f749c = Runtime.getRuntime().availableProcessors();

    /* renamed from: c.c.a.a.x$b */
    /* compiled from: ThreadUtils */
    public static final class C1530b extends ThreadPoolExecutor {

        /* renamed from: e */
        public final AtomicInteger f752e = new AtomicInteger();

        /* renamed from: l */
        public C1529a f753l;

        public C1530b(int i, int i2, long j, TimeUnit timeUnit, C1529a aVar, ThreadFactory threadFactory) {
            super(i, i2, j, timeUnit, aVar, threadFactory);
            C1530b unused = aVar.f750e = this;
            this.f753l = aVar;
        }

        /* renamed from: b */
        public static ExecutorService m1075b(int i, int i2) {
            int i3 = i;
            int i4 = i2;
            if (i3 == -8) {
                return new C1530b(C1528x.f749c + 1, (C1528x.f749c * 2) + 1, 30, TimeUnit.SECONDS, new C1529a(true), new C1531c("cpu", i4));
            } else if (i3 == -4) {
                return new C1530b((C1528x.f749c * 2) + 1, (C1528x.f749c * 2) + 1, 30, TimeUnit.SECONDS, new C1529a(), new C1531c("io", i4));
            } else {
                if (i3 == -2) {
                    return new C1530b(0, 128, 60, TimeUnit.SECONDS, new C1529a(true), new C1531c("cached", i4));
                } else if (i3 == -1) {
                    return new C1530b(1, 1, 0, TimeUnit.MILLISECONDS, new C1529a(), new C1531c("single", i4));
                } else {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    C1529a aVar = new C1529a();
                    return new C1530b(i, i, 0, timeUnit, aVar, new C1531c("fixed(" + i3 + ")", i4));
                }
            }
        }

        public void afterExecute(Runnable runnable, Throwable th) {
            this.f752e.decrementAndGet();
            super.afterExecute(runnable, th);
        }

        public void execute(@NonNull Runnable runnable) {
            if (runnable == null) {
                throw new NullPointerException("Argument 'command' of type Runnable (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            } else if (!isShutdown()) {
                this.f752e.incrementAndGet();
                try {
                    super.execute(runnable);
                } catch (RejectedExecutionException unused) {
                    this.f753l.offer(runnable);
                } catch (Throwable unused2) {
                    this.f752e.decrementAndGet();
                }
            }
        }
    }

    /* renamed from: c.c.a.a.x$c */
    /* compiled from: ThreadUtils */
    public static final class C1531c extends AtomicLong implements ThreadFactory {

        /* renamed from: n */
        public static final AtomicInteger f754n = new AtomicInteger(1);
        public static final long serialVersionUID = -9209200509960368598L;

        /* renamed from: e */
        public final String f755e;

        /* renamed from: l */
        public final int f756l;

        /* renamed from: m */
        public final boolean f757m;

        /* renamed from: c.c.a.a.x$c$a */
        /* compiled from: ThreadUtils */
        public class C1532a extends Thread {
            public C1532a(C1531c cVar, Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                try {
                    super.run();
                } catch (Throwable unused) {
                }
            }
        }

        /* renamed from: c.c.a.a.x$c$b */
        /* compiled from: ThreadUtils */
        public class C1533b implements Thread.UncaughtExceptionHandler {
            public C1533b(C1531c cVar) {
            }

            public void uncaughtException(Thread thread, Throwable th) {
                System.out.println(th);
            }
        }

        public C1531c(String str, int i) {
            this(str, i, false);
        }

        public Thread newThread(@NonNull Runnable runnable) {
            if (runnable != null) {
                C1532a aVar = new C1532a(this, runnable, this.f755e + getAndIncrement());
                aVar.setDaemon(this.f757m);
                aVar.setUncaughtExceptionHandler(new C1533b(this));
                aVar.setPriority(this.f756l);
                return aVar;
            }
            throw new NullPointerException("Argument 'r' of type Runnable (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public C1531c(String str, int i, boolean z) {
            this.f755e = str + "-pool-" + f754n.getAndIncrement() + "-thread-";
            this.f756l = i;
            this.f757m = z;
        }
    }

    static {
        new ConcurrentHashMap();
        new Timer();
    }

    /* renamed from: b */
    public static ExecutorService m1067b() {
        return m1068c(-2);
    }

    /* renamed from: c */
    public static ExecutorService m1068c(int i) {
        return m1069d(i, 5);
    }

    /* renamed from: d */
    public static ExecutorService m1069d(int i, int i2) {
        ExecutorService executorService;
        synchronized (f748b) {
            Map map = f748b.get(Integer.valueOf(i));
            if (map == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                executorService = C1530b.m1075b(i, i2);
                concurrentHashMap.put(Integer.valueOf(i2), executorService);
                f748b.put(Integer.valueOf(i), concurrentHashMap);
            } else {
                executorService = (ExecutorService) map.get(Integer.valueOf(i2));
                if (executorService == null) {
                    executorService = C1530b.m1075b(i, i2);
                    map.put(Integer.valueOf(i2), executorService);
                }
            }
        }
        return executorService;
    }

    /* renamed from: e */
    public static void m1070e(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f747a.post(runnable);
        }
    }

    /* renamed from: f */
    public static void m1071f(Runnable runnable, long j) {
        f747a.postDelayed(runnable, j);
    }

    /* renamed from: c.c.a.a.x$a */
    /* compiled from: ThreadUtils */
    public static final class C1529a extends LinkedBlockingQueue<Runnable> {

        /* renamed from: e */
        public volatile C1530b f750e;

        /* renamed from: l */
        public int f751l = Integer.MAX_VALUE;

        public C1529a() {
        }

        /* renamed from: f */
        public boolean offer(@NonNull Runnable runnable) {
            if (runnable == null) {
                throw new NullPointerException("Argument 'runnable' of type Runnable (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            } else if (this.f751l > size() || this.f750e == null || this.f750e.getPoolSize() >= this.f750e.getMaximumPoolSize()) {
                return super.offer(runnable);
            } else {
                return false;
            }
        }

        public C1529a(boolean z) {
            if (z) {
                this.f751l = 0;
            }
        }
    }
}
