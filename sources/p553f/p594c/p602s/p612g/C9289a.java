package p553f.p594c.p602s.p612g;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p602s.p604b.C9222a;

/* renamed from: f.c.s.g.a */
/* compiled from: AbstractDirectTask */
public abstract class C9289a extends AtomicReference<Future<?>> implements C9207b {
    public static final FutureTask<Void> DISPOSED = new FutureTask<>(C9222a.f18006a, (Object) null);
    public static final FutureTask<Void> FINISHED = new FutureTask<>(C9222a.f18006a, (Object) null);
    public static final long serialVersionUID = 1811839108042568751L;
    public final Runnable runnable;
    public Thread runner;

    public C9289a(Runnable runnable2) {
        this.runnable = runnable2;
    }

    public final void dispose() {
        FutureTask<Void> futureTask;
        Future future = (Future) get();
        if (future != FINISHED && future != (futureTask = DISPOSED) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(this.runner != Thread.currentThread());
        }
    }

    public Runnable getWrappedRunnable() {
        return this.runnable;
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == FINISHED || future == DISPOSED;
    }

    public final void setFuture(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != FINISHED) {
                if (future2 == DISPOSED) {
                    future.cancel(this.runner != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
