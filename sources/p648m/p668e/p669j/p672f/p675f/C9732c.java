package p648m.p668e.p669j.p672f.p675f;

import java.lang.Thread;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.TestTimedOutException;
import p648m.p668e.p680m.p681d.C9785g;

/* renamed from: m.e.j.f.f.c */
/* compiled from: FailOnTimeout */
public class C9732c extends C9785g {

    /* renamed from: a */
    public final C9785g f18999a;

    /* renamed from: b */
    public final TimeUnit f19000b;

    /* renamed from: c */
    public final long f19001c;

    /* renamed from: d */
    public final boolean f19002d;

    /* renamed from: e */
    public volatile ThreadGroup f19003e;

    /* renamed from: m.e.j.f.f.c$b */
    /* compiled from: FailOnTimeout */
    public static class C9734b {

        /* renamed from: a */
        public boolean f19004a;

        /* renamed from: b */
        public long f19005b;

        /* renamed from: c */
        public TimeUnit f19006c;

        /* renamed from: d */
        public C9732c mo50558d(C9785g gVar) {
            if (gVar != null) {
                return new C9732c(this, gVar);
            }
            throw new NullPointerException("statement cannot be null");
        }

        /* renamed from: e */
        public C9734b mo50559e(long j, TimeUnit timeUnit) {
            if (j < 0) {
                throw new IllegalArgumentException("timeout must be non-negative");
            } else if (timeUnit != null) {
                this.f19005b = j;
                this.f19006c = timeUnit;
                return this;
            } else {
                throw new NullPointerException("TimeUnit cannot be null");
            }
        }

        public C9734b() {
            this.f19004a = false;
            this.f19005b = 0;
            this.f19006c = TimeUnit.SECONDS;
        }
    }

    /* renamed from: m.e.j.f.f.c$c */
    /* compiled from: FailOnTimeout */
    public class C9735c implements Callable<Throwable> {

        /* renamed from: e */
        public final CountDownLatch f19007e;

        public C9735c() {
            this.f19007e = new CountDownLatch(1);
        }

        /* renamed from: a */
        public void mo50560a() {
            this.f19007e.await();
        }

        /* renamed from: b */
        public Throwable call() {
            try {
                this.f19007e.countDown();
                C9732c.this.f18999a.evaluate();
                return null;
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                return th;
            }
        }
    }

    /* renamed from: b */
    public static C9734b m26210b() {
        return new C9734b();
    }

    /* renamed from: c */
    public final Thread[] mo50551c(Thread[] threadArr, int i) {
        int min = Math.min(i, threadArr.length);
        Thread[] threadArr2 = new Thread[min];
        for (int i2 = 0; i2 < min; i2++) {
            threadArr2[i2] = threadArr[i2];
        }
        return threadArr2;
    }

    /* renamed from: d */
    public final long mo50552d(Thread thread) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        if (!threadMXBean.isThreadCpuTimeSupported()) {
            return 0;
        }
        try {
            return threadMXBean.getThreadCpuTime(thread.getId());
        } catch (UnsupportedOperationException unused) {
            return 0;
        }
    }

    /* renamed from: e */
    public final Exception mo50553e(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        Thread h = this.f19002d ? mo50556h(thread) : null;
        TestTimedOutException testTimedOutException = new TestTimedOutException(this.f19001c, this.f19000b);
        if (stackTrace != null) {
            testTimedOutException.setStackTrace(stackTrace);
            thread.interrupt();
        }
        if (h == null) {
            return testTimedOutException;
        }
        Exception exc = new Exception("Appears to be stuck in thread " + h.getName());
        exc.setStackTrace(mo50555g(h));
        return new MultipleFailureException(Arrays.asList(new Throwable[]{testTimedOutException, exc}));
    }

    public void evaluate() {
        C9735c cVar = new C9735c();
        FutureTask futureTask = new FutureTask(cVar);
        this.f19003e = new ThreadGroup("FailOnTimeoutGroup");
        Thread thread = new Thread(this.f19003e, futureTask, "Time-limited test");
        thread.setDaemon(true);
        thread.start();
        cVar.mo50560a();
        Throwable f = mo50554f(futureTask, thread);
        if (f != null) {
            throw f;
        }
    }

    /* renamed from: f */
    public final Throwable mo50554f(FutureTask<Throwable> futureTask, Thread thread) {
        try {
            if (this.f19001c > 0) {
                return futureTask.get(this.f19001c, this.f19000b);
            }
            return futureTask.get();
        } catch (InterruptedException e) {
            return e;
        } catch (ExecutionException e2) {
            return e2.getCause();
        } catch (TimeoutException unused) {
            return mo50553e(thread);
        }
    }

    /* renamed from: g */
    public final StackTraceElement[] mo50555g(Thread thread) {
        try {
            return thread.getStackTrace();
        } catch (SecurityException unused) {
            return new StackTraceElement[0];
        }
    }

    /* renamed from: h */
    public final Thread mo50556h(Thread thread) {
        Thread[] i;
        if (this.f19003e == null || (i = mo50557i(this.f19003e)) == null) {
            return null;
        }
        long j = 0;
        Thread thread2 = null;
        for (Thread thread3 : i) {
            if (thread3.getState() == Thread.State.RUNNABLE) {
                long d = mo50552d(thread3);
                if (thread2 == null || d > j) {
                    thread2 = thread3;
                    j = d;
                }
            }
        }
        if (thread2 == thread) {
            return null;
        }
        return thread2;
    }

    /* renamed from: i */
    public final Thread[] mo50557i(ThreadGroup threadGroup) {
        int max = Math.max(threadGroup.activeCount() * 2, 100);
        int i = 0;
        do {
            Thread[] threadArr = new Thread[max];
            int enumerate = threadGroup.enumerate(threadArr);
            if (enumerate < max) {
                return mo50551c(threadArr, enumerate);
            }
            max += 100;
            i++;
        } while (i < 5);
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9732c(p648m.p668e.p680m.p681d.C9785g r3, long r4) {
        /*
            r2 = this;
            m.e.j.f.f.c$b r0 = m26210b()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.mo50559e(r4, r1)
            r2.<init>((p648m.p668e.p669j.p672f.p675f.C9732c.C9734b) r0, (p648m.p668e.p680m.p681d.C9785g) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p648m.p668e.p669j.p672f.p675f.C9732c.<init>(m.e.m.d.g, long):void");
    }

    public C9732c(C9734b bVar, C9785g gVar) {
        this.f19003e = null;
        this.f18999a = gVar;
        this.f19001c = bVar.f19005b;
        this.f19000b = bVar.f19006c;
        this.f19002d = bVar.f19004a;
    }
}
