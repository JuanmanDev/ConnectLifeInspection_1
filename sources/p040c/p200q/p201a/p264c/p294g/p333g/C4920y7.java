package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: c.q.a.c.g.g.y7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4920y7 implements C4866w5 {
    public /* synthetic */ C4920y7(C4893x6 x6Var) {
    }

    /* renamed from: h */
    public final ExecutorService mo26791h(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
