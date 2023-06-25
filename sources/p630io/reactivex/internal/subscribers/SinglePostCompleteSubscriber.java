package p630io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicLong;
import p553f.p594c.C9186d;
import p553f.p594c.p602s.p614i.C9314b;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9802b;
import p648m.p683f.C9803c;

/* renamed from: io.reactivex.internal.subscribers.SinglePostCompleteSubscriber */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements C9186d<T>, C9803c {
    public static final long COMPLETE_MASK = Long.MIN_VALUE;
    public static final long REQUEST_MASK = Long.MAX_VALUE;
    public static final long serialVersionUID = 7917814472626990048L;
    public final C9802b<? super R> downstream;
    public long produced;
    public C9803c upstream;
    public R value;

    public SinglePostCompleteSubscriber(C9802b<? super R> bVar) {
        this.downstream = bVar;
    }

    public void cancel() {
        this.upstream.cancel();
    }

    public final void complete(R r) {
        long j = this.produced;
        if (j != 0) {
            C9314b.m25137c(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                onDrop(r);
                return;
            } else if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.downstream.onNext(r);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r;
                if (!compareAndSet(0, Long.MIN_VALUE)) {
                    this.value = null;
                } else {
                    return;
                }
            }
        }
    }

    public abstract /* synthetic */ void onComplete();

    public void onDrop(R r) {
    }

    public abstract /* synthetic */ void onError(Throwable th);

    public abstract /* synthetic */ void onNext(T t);

    public void onSubscribe(C9803c cVar) {
        if (SubscriptionHelper.validate(this.upstream, cVar)) {
            this.upstream = cVar;
            this.downstream.onSubscribe(this);
        }
    }

    public final void request(long j) {
        long j2;
        if (SubscriptionHelper.validate(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.downstream.onNext(this.value);
                        this.downstream.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, C9314b.m25136b(j2, j)));
            this.upstream.request(j);
        }
    }
}
