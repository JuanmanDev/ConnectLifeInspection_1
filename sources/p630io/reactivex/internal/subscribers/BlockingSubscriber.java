package p630io.reactivex.internal.subscribers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9186d;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p630io.reactivex.internal.util.NotificationLite;
import p648m.p683f.C9803c;

/* renamed from: io.reactivex.internal.subscribers.BlockingSubscriber */
public final class BlockingSubscriber<T> extends AtomicReference<C9803c> implements C9186d<T>, C9803c {
    public static final Object TERMINATED = new Object();
    public static final long serialVersionUID = -4875965440900746268L;
    public final Queue<Object> queue;

    public BlockingSubscriber(Queue<Object> queue2) {
        this.queue = queue2;
    }

    public void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    public boolean isCancelled() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    public void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    public void onNext(T t) {
        this.queue.offer(NotificationLite.next(t));
    }

    public void onSubscribe(C9803c cVar) {
        if (SubscriptionHelper.setOnce(this, cVar)) {
            this.queue.offer(NotificationLite.subscription(this));
        }
    }

    public void request(long j) {
        ((C9803c) get()).request(j);
    }
}
