package p630io.reactivex.internal.observers;

import p553f.p594c.C9193j;
import p553f.p594c.p598o.C9207b;
import p630io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.observers.DeferredScalarObserver */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements C9193j<T> {
    public static final long serialVersionUID = -266195175408988651L;
    public C9207b upstream;

    public DeferredScalarObserver(C9193j<? super R> jVar) {
        super(jVar);
    }

    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }

    public void onComplete() {
        T t = this.value;
        if (t != null) {
            this.value = null;
            complete(t);
            return;
        }
        complete();
    }

    public void onError(Throwable th) {
        this.value = null;
        error(th);
    }

    public abstract /* synthetic */ void onNext(T t);

    public void onSubscribe(C9207b bVar) {
        if (DisposableHelper.validate(this.upstream, bVar)) {
            this.upstream = bVar;
            this.downstream.onSubscribe(this);
        }
    }
}
