package p630io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9198m;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9214b;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.CompositeException;
import p630io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.observers.BiConsumerSingleObserver */
public final class BiConsumerSingleObserver<T> extends AtomicReference<C9207b> implements C9198m<T>, C9207b {
    public static final long serialVersionUID = 4943102778943297569L;
    public final C9214b<? super T, ? super Throwable> onCallback;

    public BiConsumerSingleObserver(C9214b<? super T, ? super Throwable> bVar) {
        this.onCallback = bVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    public void onError(Throwable th) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.mo47037a(null, th);
        } catch (Throwable th2) {
            C9211a.m24971b(th2);
            C9323a.m25169p(new CompositeException(th, th2));
        }
    }

    public void onSubscribe(C9207b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }

    public void onSuccess(T t) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.mo47037a(t, null);
        } catch (Throwable th) {
            C9211a.m24971b(th);
            C9323a.m25169p(th);
        }
    }
}
