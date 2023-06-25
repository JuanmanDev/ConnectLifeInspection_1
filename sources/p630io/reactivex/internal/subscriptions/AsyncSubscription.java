package p630io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.p598o.C9207b;
import p630io.reactivex.internal.disposables.DisposableHelper;
import p648m.p683f.C9803c;

/* renamed from: io.reactivex.internal.subscriptions.AsyncSubscription */
public final class AsyncSubscription extends AtomicLong implements C9803c, C9207b {
    public static final long serialVersionUID = 7028635084060361255L;
    public final AtomicReference<C9803c> actual;
    public final AtomicReference<C9207b> resource;

    public AsyncSubscription() {
        this.resource = new AtomicReference<>();
        this.actual = new AtomicReference<>();
    }

    public void cancel() {
        dispose();
    }

    public void dispose() {
        SubscriptionHelper.cancel(this.actual);
        DisposableHelper.dispose(this.resource);
    }

    public boolean isDisposed() {
        return this.actual.get() == SubscriptionHelper.CANCELLED;
    }

    public boolean replaceResource(C9207b bVar) {
        return DisposableHelper.replace(this.resource, bVar);
    }

    public void request(long j) {
        SubscriptionHelper.deferredRequest(this.actual, this, j);
    }

    public boolean setResource(C9207b bVar) {
        return DisposableHelper.set(this.resource, bVar);
    }

    public void setSubscription(C9803c cVar) {
        SubscriptionHelper.deferredSetOnce(this.actual, this, cVar);
    }

    public AsyncSubscription(C9207b bVar) {
        this();
        this.resource.lazySet(bVar);
    }
}
