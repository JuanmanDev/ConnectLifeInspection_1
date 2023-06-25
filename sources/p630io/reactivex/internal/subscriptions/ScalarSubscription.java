package p630io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import p553f.p594c.p602s.p605c.C9231d;
import p648m.p683f.C9802b;

/* renamed from: io.reactivex.internal.subscriptions.ScalarSubscription */
public final class ScalarSubscription<T> extends AtomicInteger implements C9231d<T> {
    public static final int CANCELLED = 2;
    public static final int NO_REQUEST = 0;
    public static final int REQUESTED = 1;
    public static final long serialVersionUID = -3830916580126663321L;
    public final C9802b<? super T> subscriber;
    public final T value;

    public ScalarSubscription(C9802b<? super T> bVar, T t) {
        this.subscriber = bVar;
        this.value = t;
    }

    public void cancel() {
        lazySet(2);
    }

    public void clear() {
        lazySet(1);
    }

    public boolean isCancelled() {
        return get() == 2;
    }

    public boolean isEmpty() {
        return get() != 0;
    }

    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j) && compareAndSet(0, 1)) {
            C9802b<? super T> bVar = this.subscriber;
            bVar.onNext(this.value);
            if (get() != 2) {
                bVar.onComplete();
            }
        }
    }

    public int requestFusion(int i) {
        return i & 1;
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
