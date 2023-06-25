package p630io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9184b;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9213a;
import p553f.p594c.p601r.C9217e;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.OnErrorNotImplementedException;
import p630io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.observers.CallbackCompletableObserver */
public final class CallbackCompletableObserver extends AtomicReference<C9207b> implements C9184b, C9207b, C9217e<Throwable> {
    public static final long serialVersionUID = -4361286194466301354L;
    public final C9213a onComplete;
    public final C9217e<? super Throwable> onError;

    public CallbackCompletableObserver(C9213a aVar) {
        this.onError = this;
        this.onComplete = aVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return this.onError != this;
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    public void onComplete() {
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            C9211a.m24971b(th);
            C9323a.m25169p(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    public void onError(Throwable th) {
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C9211a.m24971b(th2);
            C9323a.m25169p(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    public void onSubscribe(C9207b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }

    public void accept(Throwable th) {
        C9323a.m25169p(new OnErrorNotImplementedException(th));
    }

    public CallbackCompletableObserver(C9217e<? super Throwable> eVar, C9213a aVar) {
        this.onError = eVar;
        this.onComplete = aVar;
    }
}
