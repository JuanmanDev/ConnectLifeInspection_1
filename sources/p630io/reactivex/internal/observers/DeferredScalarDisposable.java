package p630io.reactivex.internal.observers;

import p553f.p594c.C9193j;
import p553f.p594c.p617v.C9323a;

/* renamed from: io.reactivex.internal.observers.DeferredScalarDisposable */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    public static final int DISPOSED = 4;
    public static final int FUSED_CONSUMED = 32;
    public static final int FUSED_EMPTY = 8;
    public static final int FUSED_READY = 16;
    public static final int TERMINATED = 2;
    public static final long serialVersionUID = -5502432239815349361L;
    public final C9193j<? super T> downstream;
    public T value;

    public DeferredScalarDisposable(C9193j<? super T> jVar) {
        this.downstream = jVar;
    }

    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final void complete(T t) {
        int i = get();
        if ((i & 54) == 0) {
            C9193j<? super T> jVar = this.downstream;
            if (i == 8) {
                this.value = t;
                lazySet(16);
                jVar.onNext(null);
            } else {
                lazySet(2);
                jVar.onNext(t);
            }
            if (get() != 4) {
                jVar.onComplete();
            }
        }
    }

    public void dispose() {
        set(4);
        this.value = null;
    }

    public final void error(Throwable th) {
        if ((get() & 54) != 0) {
            C9323a.m25169p(th);
            return;
        }
        lazySet(2);
        this.downstream.onError(th);
    }

    public final boolean isDisposed() {
        return get() == 4;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final T poll() {
        if (get() != 16) {
            return null;
        }
        T t = this.value;
        this.value = null;
        lazySet(32);
        return t;
    }

    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryDispose() {
        return getAndSet(4) != 4;
    }

    public final void complete() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.downstream.onComplete();
        }
    }
}
