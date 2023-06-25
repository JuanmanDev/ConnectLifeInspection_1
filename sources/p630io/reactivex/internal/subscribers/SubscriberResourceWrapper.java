package p630io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9186d;
import p553f.p594c.p598o.C9207b;
import p630io.reactivex.internal.disposables.DisposableHelper;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: io.reactivex.internal.subscribers.SubscriberResourceWrapper */
public final class SubscriberResourceWrapper<T> extends AtomicReference<C9207b> implements C9186d<T>, C9207b, C9803c {
    public static final long serialVersionUID = -8612022020200669122L;
    public final C9802b<? super T> downstream;
    public final AtomicReference<C9803c> upstream = new AtomicReference<>();

    public SubscriberResourceWrapper(C9802b<? super T> bVar) {
        this.downstream = bVar;
    }

    public void cancel() {
        dispose();
    }

    public void dispose() {
        SubscriptionHelper.cancel(this.upstream);
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    public void onComplete() {
        DisposableHelper.dispose(this);
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        DisposableHelper.dispose(this);
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public void onSubscribe(C9803c cVar) {
        if (SubscriptionHelper.setOnce(this.upstream, cVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            this.upstream.get().request(j);
        }
    }

    public void setResource(C9207b bVar) {
        DisposableHelper.set(this, bVar);
    }
}
