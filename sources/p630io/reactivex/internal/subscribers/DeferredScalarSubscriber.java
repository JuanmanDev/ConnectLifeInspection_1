package p630io.reactivex.internal.subscribers;

import p553f.p594c.C9186d;
import p630io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: io.reactivex.internal.subscribers.DeferredScalarSubscriber */
public abstract class DeferredScalarSubscriber<T, R> extends DeferredScalarSubscription<R> implements C9186d<T> {
    public static final long serialVersionUID = 2984505488220891551L;
    public boolean hasValue;
    public C9803c upstream;

    public DeferredScalarSubscriber(C9802b<? super R> bVar) {
        super(bVar);
    }

    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    public void onComplete() {
        if (this.hasValue) {
            complete(this.value);
        } else {
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        this.value = null;
        this.downstream.onError(th);
    }

    public abstract /* synthetic */ void onNext(T t);

    public void onSubscribe(C9803c cVar) {
        if (SubscriptionHelper.validate(this.upstream, cVar)) {
            this.upstream = cVar;
            this.downstream.onSubscribe(this);
            cVar.request(Long.MAX_VALUE);
        }
    }
}
