package p040c.p077d.p078a.p081k.p084j.p086b0;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: c.d.a.k.j.b0.a */
/* compiled from: GlideExecutor */
public final class C1632a implements ExecutorService {

    /* renamed from: l */
    public static final long f1006l = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: m */
    public static volatile int f1007m;

    /* renamed from: e */
    public final ExecutorService f1008e;

    /* renamed from: c.d.a.k.j.b0.a$a */
    /* compiled from: GlideExecutor */
    public static final class C1633a implements ThreadFactory {

        /* renamed from: e */
        public final String f1009e;

        /* renamed from: l */
        public final C1635b f1010l;

        /* renamed from: m */
        public final boolean f1011m;

        /* renamed from: n */
        public int f1012n;

        /* renamed from: c.d.a.k.j.b0.a$a$a */
        /* compiled from: GlideExecutor */
        public class C1634a extends Thread {
            public C1634a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C1633a.this.f1011m) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    C1633a.this.f1010l.mo15740a(th);
                }
            }
        }

        public C1633a(String str, C1635b bVar, boolean z) {
            this.f1009e = str;
            this.f1010l = bVar;
            this.f1011m = z;
        }

        public synchronized Thread newThread(@NonNull Runnable runnable) {
            C1634a aVar;
            aVar = new C1634a(runnable, "glide-" + this.f1009e + "-thread-" + this.f1012n);
            this.f1012n = this.f1012n + 1;
            return aVar;
        }
    }

    /* renamed from: c.d.a.k.j.b0.a$b */
    /* compiled from: GlideExecutor */
    public interface C1635b {

        /* renamed from: a */
        public static final C1635b f1014a = new C1636a();

        /* renamed from: b */
        public static final C1635b f1015b = f1014a;

        /* renamed from: c.d.a.k.j.b0.a$b$a */
        /* compiled from: GlideExecutor */
        public class C1636a implements C1635b {
            /* renamed from: a */
            public void mo15740a(Throwable th) {
                if (th != null) {
                    boolean isLoggable = Log.isLoggable("GlideExecutor", 6);
                }
            }
        }

        /* renamed from: a */
        void mo15740a(Throwable th);
    }

    @VisibleForTesting
    public C1632a(ExecutorService executorService) {
        this.f1008e = executorService;
    }

    /* renamed from: a */
    public static int m1444a() {
        if (f1007m == 0) {
            f1007m = Math.min(4, C1637b.m1454a());
        }
        return f1007m;
    }

    /* renamed from: b */
    public static C1632a m1445b() {
        return m1446c(m1444a() >= 4 ? 2 : 1, C1635b.f1015b);
    }

    /* renamed from: c */
    public static C1632a m1446c(int i, C1635b bVar) {
        return new C1632a(new ThreadPoolExecutor(0, i, f1006l, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1633a("animation", bVar, true)));
    }

    /* renamed from: d */
    public static C1632a m1447d() {
        return m1448e(1, "disk-cache", C1635b.f1015b);
    }

    /* renamed from: e */
    public static C1632a m1448e(int i, String str, C1635b bVar) {
        return new C1632a(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1633a(str, bVar, true)));
    }

    /* renamed from: f */
    public static C1632a m1449f() {
        return m1450g(m1444a(), "source", C1635b.f1015b);
    }

    /* renamed from: g */
    public static C1632a m1450g(int i, String str, C1635b bVar) {
        return new C1632a(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1633a(str, bVar, false)));
    }

    /* renamed from: h */
    public static C1632a m1451h() {
        return new C1632a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f1006l, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C1633a("source-unlimited", C1635b.f1015b, false)));
    }

    public boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) {
        return this.f1008e.awaitTermination(j, timeUnit);
    }

    public void execute(@NonNull Runnable runnable) {
        this.f1008e.execute(runnable);
    }

    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) {
        return this.f1008e.invokeAll(collection);
    }

    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) {
        return this.f1008e.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f1008e.isShutdown();
    }

    public boolean isTerminated() {
        return this.f1008e.isTerminated();
    }

    public void shutdown() {
        this.f1008e.shutdown();
    }

    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f1008e.shutdownNow();
    }

    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f1008e.submit(runnable);
    }

    public String toString() {
        return this.f1008e.toString();
    }

    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) {
        return this.f1008e.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) {
        return this.f1008e.invokeAny(collection, j, timeUnit);
    }

    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.f1008e.submit(runnable, t);
    }

    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f1008e.submit(callable);
    }
}
