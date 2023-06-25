package p630io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9193j;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9213a;
import p553f.p594c.p601r.C9217e;
import p553f.p594c.p601r.C9219g;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.CompositeException;
import p630io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.observers.ForEachWhileObserver */
public final class ForEachWhileObserver<T> extends AtomicReference<C9207b> implements C9193j<T>, C9207b {
    public static final long serialVersionUID = -4403180040475402120L;
    public boolean done;
    public final C9213a onComplete;
    public final C9217e<? super Throwable> onError;
    public final C9219g<? super T> onNext;

    public ForEachWhileObserver(C9219g<? super T> gVar, C9217e<? super Throwable> eVar, C9213a aVar) {
        this.onNext = gVar;
        this.onError = eVar;
        this.onComplete = aVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((C9207b) get());
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                C9211a.m24971b(th);
                C9323a.m25169p(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            C9323a.m25169p(th);
            return;
        }
        this.done = true;
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C9211a.m24971b(th2);
            C9323a.m25169p(new CompositeException(th, th2));
        }
    }

    public void onNext(T t) {
        if (!this.done) {
            try {
                if (!this.onNext.test(t)) {
                    dispose();
                    onComplete();
                }
            } catch (Throwable th) {
                C9211a.m24971b(th);
                dispose();
                onError(th);
            }
        }
    }

    public void onSubscribe(C9207b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }
}
