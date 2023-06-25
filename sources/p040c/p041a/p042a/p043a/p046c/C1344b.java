package p040c.p041a.p042a.p043a.p046c;

import com.alibaba.android.arouter.facade.template.ILogger;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p041a.p042a.p043a.p047d.C1353e;

/* renamed from: c.a.a.a.c.b */
/* compiled from: DefaultPoolExecutor */
public class C1344b extends ThreadPoolExecutor {

    /* renamed from: e */
    public static final int f359e;

    /* renamed from: l */
    public static final int f360l;

    /* renamed from: m */
    public static final int f361m;

    /* renamed from: n */
    public static volatile C1344b f362n;

    /* renamed from: c.a.a.a.c.b$a */
    /* compiled from: DefaultPoolExecutor */
    public class C1345a implements RejectedExecutionHandler {
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            C1337a.f337c.error(ILogger.defaultTag, "Task rejected, too many task!");
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f359e = availableProcessors;
        int i = availableProcessors + 1;
        f360l = i;
        f361m = i;
    }

    public C1344b(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, new C1345a());
    }

    /* renamed from: a */
    public static C1344b m238a() {
        if (f362n == null) {
            synchronized (C1344b.class) {
                if (f362n == null) {
                    f362n = new C1344b(f360l, f361m, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(64), new C1346c());
                }
            }
        }
        return f362n;
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            try {
                ((Future) runnable).get();
            } catch (CancellationException e) {
                th = e;
            } catch (ExecutionException e2) {
                th = e2.getCause();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (th != null) {
            ILogger iLogger = C1337a.f337c;
            iLogger.warning(ILogger.defaultTag, "Running task appeared exception! Thread [" + Thread.currentThread().getName() + "], because [" + th.getMessage() + "]\n" + C1353e.m251a(th.getStackTrace()));
        }
    }
}
