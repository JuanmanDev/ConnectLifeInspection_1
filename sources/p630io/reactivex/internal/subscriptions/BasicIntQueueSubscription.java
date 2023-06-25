package p630io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import p553f.p594c.p602s.p605c.C9231d;

/* renamed from: io.reactivex.internal.subscriptions.BasicIntQueueSubscription */
public abstract class BasicIntQueueSubscription<T> extends AtomicInteger implements C9231d<T> {
    public static final long serialVersionUID = -6671519529404341862L;

    public abstract /* synthetic */ void cancel();

    public abstract /* synthetic */ void clear();

    public abstract /* synthetic */ boolean isEmpty();

    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public abstract /* synthetic */ T poll();

    public abstract /* synthetic */ void request(long j);

    public abstract /* synthetic */ int requestFusion(int i);

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
