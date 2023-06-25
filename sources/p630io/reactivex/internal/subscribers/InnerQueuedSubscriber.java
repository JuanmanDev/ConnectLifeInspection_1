package p630io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9186d;
import p553f.p594c.p602s.p605c.C9231d;
import p553f.p594c.p602s.p605c.C9234g;
import p553f.p594c.p602s.p613h.C9312c;
import p553f.p594c.p602s.p614i.C9320g;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9803c;

/* renamed from: io.reactivex.internal.subscribers.InnerQueuedSubscriber */
public final class InnerQueuedSubscriber<T> extends AtomicReference<C9803c> implements C9186d<T>, C9803c {
    public static final long serialVersionUID = 22876611072430776L;
    public volatile boolean done;
    public int fusionMode;
    public final int limit;
    public final C9312c<T> parent;
    public final int prefetch;
    public long produced;
    public volatile C9234g<T> queue;

    public InnerQueuedSubscriber(C9312c<T> cVar, int i) {
        this.parent = cVar;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDone() {
        return this.done;
    }

    public void onComplete() {
        this.parent.mo47157b(this);
    }

    public void onError(Throwable th) {
        this.parent.mo47159d(this, th);
    }

    public void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.mo47158c(this, t);
        } else {
            this.parent.mo47156a();
        }
    }

    public void onSubscribe(C9803c cVar) {
        if (SubscriptionHelper.setOnce(this, cVar)) {
            if (cVar instanceof C9231d) {
                C9231d dVar = (C9231d) cVar;
                int requestFusion = dVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = dVar;
                    this.done = true;
                    this.parent.mo47157b(this);
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = dVar;
                    C9320g.m25153b(cVar, this.prefetch);
                    return;
                }
            }
            this.queue = C9320g.m25152a(this.prefetch);
            C9320g.m25153b(cVar, this.prefetch);
        }
    }

    public C9234g<T> queue() {
        return this.queue;
    }

    public void request(long j) {
        if (this.fusionMode != 1) {
            long j2 = this.produced + j;
            if (j2 >= ((long) this.limit)) {
                this.produced = 0;
                ((C9803c) get()).request(j2);
                return;
            }
            this.produced = j2;
        }
    }

    public void requestOne() {
        if (this.fusionMode != 1) {
            long j = this.produced + 1;
            if (j == ((long) this.limit)) {
                this.produced = 0;
                ((C9803c) get()).request(j);
                return;
            }
            this.produced = j;
        }
    }

    public void setDone() {
        this.done = true;
    }
}
