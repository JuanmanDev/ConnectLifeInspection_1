package p630io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9193j;
import p553f.p594c.p598o.C9207b;
import p630io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.ObserverResourceWrapper */
public final class ObserverResourceWrapper<T> extends AtomicReference<C9207b> implements C9193j<T>, C9207b {
    public static final long serialVersionUID = -8612022020200669122L;
    public final C9193j<? super T> downstream;
    public final AtomicReference<C9207b> upstream = new AtomicReference<>();

    public ObserverResourceWrapper(C9193j<? super T> jVar) {
        this.downstream = jVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return this.upstream.get() == DisposableHelper.DISPOSED;
    }

    public void onComplete() {
        dispose();
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        dispose();
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public void onSubscribe(C9207b bVar) {
        if (DisposableHelper.setOnce(this.upstream, bVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    public void setResource(C9207b bVar) {
        DisposableHelper.set(this, bVar);
    }
}
