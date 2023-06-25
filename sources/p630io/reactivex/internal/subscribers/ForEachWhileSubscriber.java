package p630io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9186d;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9213a;
import p553f.p594c.p601r.C9217e;
import p553f.p594c.p601r.C9219g;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.CompositeException;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9803c;

/* renamed from: io.reactivex.internal.subscribers.ForEachWhileSubscriber */
public final class ForEachWhileSubscriber<T> extends AtomicReference<C9803c> implements C9186d<T>, C9207b {
    public static final long serialVersionUID = -4403180040475402120L;
    public boolean done;
    public final C9213a onComplete;
    public final C9217e<? super Throwable> onError;
    public final C9219g<? super T> onNext;

    public ForEachWhileSubscriber(C9219g<? super T> gVar, C9217e<? super Throwable> eVar, C9213a aVar) {
        this.onNext = gVar;
        this.onError = eVar;
        this.onComplete = aVar;
    }

    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
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

    public void onSubscribe(C9803c cVar) {
        SubscriptionHelper.setOnce(this, cVar, Long.MAX_VALUE);
    }
}
