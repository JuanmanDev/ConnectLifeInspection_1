package p630io.reactivex.internal.schedulers;

import p553f.p594c.p602s.p612g.C9289a;
import p553f.p594c.p617v.C9323a;

/* renamed from: io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask */
public final class ScheduledDirectPeriodicTask extends C9289a implements Runnable {
    public static final long serialVersionUID = 1811839108042568751L;

    public ScheduledDirectPeriodicTask(Runnable runnable) {
        super(runnable);
    }

    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public void run() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            this.runner = null;
        } catch (Throwable th) {
            this.runner = null;
            lazySet(C9289a.FINISHED);
            C9323a.m25169p(th);
        }
    }
}
