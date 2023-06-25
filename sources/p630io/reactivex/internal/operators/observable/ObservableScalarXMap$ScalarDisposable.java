package p630io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import p553f.p594c.C9193j;
import p553f.p594c.p602s.p605c.C9229b;

/* renamed from: io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarDisposable */
public final class ObservableScalarXMap$ScalarDisposable<T> extends AtomicInteger implements C9229b<T>, Runnable {
    public static final int FUSED = 1;
    public static final int ON_COMPLETE = 3;
    public static final int ON_NEXT = 2;
    public static final int START = 0;
    public static final long serialVersionUID = 3880992722410194083L;
    public final C9193j<? super T> observer;
    public final T value;

    public ObservableScalarXMap$ScalarDisposable(C9193j<? super T> jVar, T t) {
        this.observer = jVar;
        this.value = t;
    }

    public void clear() {
        lazySet(3);
    }

    public void dispose() {
        set(3);
    }

    public boolean isDisposed() {
        return get() == 3;
    }

    public boolean isEmpty() {
        return get() != 1;
    }

    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public T poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.value;
    }

    public int requestFusion(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        lazySet(1);
        return 1;
    }

    public void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.observer.onNext(this.value);
            if (get() == 2) {
                lazySet(3);
                this.observer.onComplete();
            }
        }
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
