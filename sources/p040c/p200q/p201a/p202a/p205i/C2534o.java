package p040c.p200q.p201a.p202a.p205i;

import java.util.concurrent.Executor;
import p040c.p200q.p201a.p202a.p205i.p206a0.C2396a;

/* renamed from: c.q.a.a.i.o */
/* compiled from: SafeLoggingExecutor */
public class C2534o implements Executor {

    /* renamed from: e */
    public final Executor f2972e;

    /* renamed from: c.q.a.a.i.o$a */
    /* compiled from: SafeLoggingExecutor */
    public static class C2535a implements Runnable {

        /* renamed from: e */
        public final Runnable f2973e;

        public C2535a(Runnable runnable) {
            this.f2973e = runnable;
        }

        public void run() {
            try {
                this.f2973e.run();
            } catch (Exception e) {
                C2396a.m4210d("Executor", "Background execution failure.", e);
            }
        }
    }

    public C2534o(Executor executor) {
        this.f2972e = executor;
    }

    public void execute(Runnable runnable) {
        this.f2972e.execute(new C2535a(runnable));
    }
}
