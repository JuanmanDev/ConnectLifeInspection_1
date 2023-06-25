package p630io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import p553f.p594c.p602s.p612g.C9289a;

/* renamed from: io.reactivex.internal.schedulers.ScheduledDirectTask */
public final class ScheduledDirectTask extends C9289a implements Callable<Void> {
    public static final long serialVersionUID = 1811839108042568751L;

    public ScheduledDirectTask(Runnable runnable) {
        super(runnable);
    }

    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public Void call() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            return null;
        } finally {
            lazySet(C9289a.FINISHED);
            this.runner = null;
        }
    }
}
