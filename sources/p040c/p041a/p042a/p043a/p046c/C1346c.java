package p040c.p041a.p042a.p043a.p046c;

import androidx.annotation.NonNull;
import com.alibaba.android.arouter.facade.template.ILogger;
import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p040c.p041a.p042a.p043a.p045b.C1337a;

/* renamed from: c.a.a.a.c.c */
/* compiled from: DefaultThreadFactory */
public class C1346c implements ThreadFactory {

    /* renamed from: n */
    public static final AtomicInteger f363n = new AtomicInteger(1);

    /* renamed from: e */
    public final AtomicInteger f364e = new AtomicInteger(1);

    /* renamed from: l */
    public final ThreadGroup f365l;

    /* renamed from: m */
    public final String f366m;

    /* renamed from: c.a.a.a.c.c$a */
    /* compiled from: DefaultThreadFactory */
    public class C1347a implements Thread.UncaughtExceptionHandler {
        public C1347a(C1346c cVar) {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            ILogger iLogger = C1337a.f337c;
            iLogger.info(ILogger.defaultTag, "Running task appeared exception! Thread [" + thread.getName() + "], because [" + th.getMessage() + "]");
        }
    }

    public C1346c() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            threadGroup = Thread.currentThread().getThreadGroup();
        }
        this.f365l = threadGroup;
        this.f366m = "ARouter task pool No." + f363n.getAndIncrement() + ", thread No.";
    }

    public Thread newThread(@NonNull Runnable runnable) {
        String str = this.f366m + this.f364e.getAndIncrement();
        C1337a.f337c.info(ILogger.defaultTag, "Thread production, name is [" + str + "]");
        Thread thread = new Thread(this.f365l, runnable, str, 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        thread.setUncaughtExceptionHandler(new C1347a(this));
        return thread;
    }
}
