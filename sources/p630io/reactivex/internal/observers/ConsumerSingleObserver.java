package p630io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9198m;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9217e;
import p553f.p594c.p602s.p604b.C9222a;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.CompositeException;
import p630io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.observers.ConsumerSingleObserver */
public final class ConsumerSingleObserver<T> extends AtomicReference<C9207b> implements C9198m<T>, C9207b {
    public static final long serialVersionUID = -7012088219455310787L;
    public final C9217e<? super Throwable> onError;
    public final C9217e<? super T> onSuccess;

    public ConsumerSingleObserver(C9217e<? super T> eVar, C9217e<? super Throwable> eVar2) {
        this.onSuccess = eVar;
        this.onError = eVar2;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return this.onError != C9222a.f18009d;
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C9211a.m24971b(th2);
            C9323a.m25169p(new CompositeException(th, th2));
        }
    }

    public void onSubscribe(C9207b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }

    public void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            C9211a.m24971b(th);
            C9323a.m25169p(th);
        }
    }
}
