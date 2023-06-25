package p630io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;
import p553f.p594c.p602s.p605c.C9229b;

/* renamed from: io.reactivex.internal.observers.BasicIntQueueDisposable */
public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements C9229b<T> {
    public static final long serialVersionUID = -1001730202384742097L;

    public abstract /* synthetic */ void clear();

    public abstract /* synthetic */ void dispose();

    public abstract /* synthetic */ boolean isDisposed();

    public abstract /* synthetic */ boolean isEmpty();

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }

    public abstract /* synthetic */ T poll();

    public abstract /* synthetic */ int requestFusion(int i);

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
