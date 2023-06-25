package p040c.p200q.p363c.p400x.p402f1;

import androidx.annotation.NonNull;
import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: c.q.c.x.f1.b */
/* compiled from: PoolableExecutors */
public class C6825b {

    /* renamed from: a */
    public static final C6824a f13067a;

    /* renamed from: b */
    public static volatile C6824a f13068b;

    /* renamed from: c.q.c.x.f1.b$b */
    /* compiled from: PoolableExecutors */
    public static class C6827b implements C6824a {
        public C6827b() {
        }

        @NonNull
        /* renamed from: a */
        public ExecutorService mo31606a(ThreadFactory threadFactory, ThreadPriority threadPriority) {
            return mo31607b(1, threadFactory, threadPriority);
        }

        @NonNull
        /* renamed from: b */
        public ExecutorService mo31607b(int i, ThreadFactory threadFactory, ThreadPriority threadPriority) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C6827b bVar = new C6827b();
        f13067a = bVar;
        f13068b = bVar;
    }

    /* renamed from: a */
    public static C6824a m19361a() {
        return f13068b;
    }
}
