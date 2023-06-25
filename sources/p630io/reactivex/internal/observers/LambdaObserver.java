package p630io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9193j;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9213a;
import p553f.p594c.p601r.C9217e;
import p553f.p594c.p602s.p604b.C9222a;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.CompositeException;
import p630io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.observers.LambdaObserver */
public final class LambdaObserver<T> extends AtomicReference<C9207b> implements C9193j<T>, C9207b {
    public static final long serialVersionUID = -7251123623727029452L;
    public final C9213a onComplete;
    public final C9217e<? super Throwable> onError;
    public final C9217e<? super T> onNext;
    public final C9217e<? super C9207b> onSubscribe;

    public LambdaObserver(C9217e<? super T> eVar, C9217e<? super Throwable> eVar2, C9213a aVar, C9217e<? super C9207b> eVar3) {
        this.onNext = eVar;
        this.onError = eVar2;
        this.onComplete = aVar;
        this.onSubscribe = eVar3;
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

    public void onComplete() {
        if (!isDisposed()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                C9211a.m24971b(th);
                C9323a.m25169p(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                C9211a.m24971b(th2);
                C9323a.m25169p(new CompositeException(th, th2));
            }
        } else {
            C9323a.m25169p(th);
        }
    }

    public void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                C9211a.m24971b(th);
                ((C9207b) get()).dispose();
                onError(th);
            }
        }
    }

    public void onSubscribe(C9207b bVar) {
        if (DisposableHelper.setOnce(this, bVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                C9211a.m24971b(th);
                bVar.dispose();
                onError(th);
            }
        }
    }
}
