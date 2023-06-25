package p630io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9186d;
import p553f.p594c.p602s.p614i.C9317d;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p630io.reactivex.internal.util.AtomicThrowable;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: io.reactivex.internal.subscribers.StrictSubscriber */
public class StrictSubscriber<T> extends AtomicInteger implements C9186d<T>, C9803c {
    public static final long serialVersionUID = -4945028590049415624L;
    public volatile boolean done;
    public final C9802b<? super T> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public final AtomicBoolean once = new AtomicBoolean();
    public final AtomicLong requested = new AtomicLong();
    public final AtomicReference<C9803c> upstream = new AtomicReference<>();

    public StrictSubscriber(C9802b<? super T> bVar) {
        this.downstream = bVar;
    }

    public void cancel() {
        if (!this.done) {
            SubscriptionHelper.cancel(this.upstream);
        }
    }

    public void onComplete() {
        this.done = true;
        C9317d.m25142a(this.downstream, this, this.error);
    }

    public void onError(Throwable th) {
        this.done = true;
        C9317d.m25143b(this.downstream, th, this, this.error);
    }

    public void onNext(T t) {
        C9317d.m25144c(this.downstream, t, this, this.error);
    }

    public void onSubscribe(C9803c cVar) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, cVar);
            return;
        }
        cVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
    }
}
