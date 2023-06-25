package p630io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9193j;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p602s.p605c.C9229b;
import p553f.p594c.p602s.p605c.C9234g;
import p553f.p594c.p602s.p606d.C9235a;
import p553f.p594c.p602s.p614i.C9320g;
import p630io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.observers.InnerQueuedObserver */
public final class InnerQueuedObserver<T> extends AtomicReference<C9207b> implements C9193j<T>, C9207b {
    public static final long serialVersionUID = -5417183359794346637L;
    public volatile boolean done;
    public int fusionMode;
    public final C9235a<T> parent;
    public final int prefetch;
    public C9234g<T> queue;

    public InnerQueuedObserver(C9235a<T> aVar, int i) {
        this.parent = aVar;
        this.prefetch = i;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public int fusionMode() {
        return this.fusionMode;
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((C9207b) get());
    }

    public boolean isDone() {
        return this.done;
    }

    public void onComplete() {
        this.parent.mo47056c(this);
    }

    public void onError(Throwable th) {
        this.parent.mo47055b(this, th);
    }

    public void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.mo47057d(this, t);
        } else {
            this.parent.mo47054a();
        }
    }

    public void onSubscribe(C9207b bVar) {
        if (DisposableHelper.setOnce(this, bVar)) {
            if (bVar instanceof C9229b) {
                C9229b bVar2 = (C9229b) bVar;
                int requestFusion = bVar2.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = bVar2;
                    this.done = true;
                    this.parent.mo47056c(this);
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = bVar2;
                    return;
                }
            }
            this.queue = C9320g.m25152a(-this.prefetch);
        }
    }

    public C9234g<T> queue() {
        return this.queue;
    }

    public void setDone() {
        this.done = true;
    }
}
