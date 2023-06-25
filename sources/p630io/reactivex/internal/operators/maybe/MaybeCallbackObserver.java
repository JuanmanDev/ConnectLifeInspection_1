package p630io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9188f;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9213a;
import p553f.p594c.p601r.C9217e;
import p553f.p594c.p602s.p604b.C9222a;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.CompositeException;
import p630io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeCallbackObserver */
public final class MaybeCallbackObserver<T> extends AtomicReference<C9207b> implements C9188f<T>, C9207b {
    public static final long serialVersionUID = -6076952298809384986L;
    public final C9213a onComplete;
    public final C9217e<? super Throwable> onError;
    public final C9217e<? super T> onSuccess;

    public MaybeCallbackObserver(C9217e<? super T> eVar, C9217e<? super Throwable> eVar2, C9213a aVar) {
        this.onSuccess = eVar;
        this.onError = eVar2;
        this.onComplete = aVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return this.onError != C9222a.f18009d;
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((C9207b) get());
    }

    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            C9211a.m24971b(th);
            C9323a.m25169p(th);
        }
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
