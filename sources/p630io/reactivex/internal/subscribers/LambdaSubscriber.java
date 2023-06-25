package p630io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9186d;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p601r.C9213a;
import p553f.p594c.p601r.C9217e;
import p553f.p594c.p602s.p604b.C9222a;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.CompositeException;
import p630io.reactivex.internal.subscriptions.SubscriptionHelper;
import p648m.p683f.C9803c;

/* renamed from: io.reactivex.internal.subscribers.LambdaSubscriber */
public final class LambdaSubscriber<T> extends AtomicReference<C9803c> implements C9186d<T>, C9803c, C9207b {
    public static final long serialVersionUID = -7251123623727029452L;
    public final C9213a onComplete;
    public final C9217e<? super Throwable> onError;
    public final C9217e<? super T> onNext;
    public final C9217e<? super C9803c> onSubscribe;

    public LambdaSubscriber(C9217e<? super T> eVar, C9217e<? super Throwable> eVar2, C9213a aVar, C9217e<? super C9803c> eVar3) {
        this.onNext = eVar;
        this.onError = eVar2;
        this.onComplete = aVar;
        this.onSubscribe = eVar3;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public void dispose() {
        cancel();
    }

    public boolean hasCustomOnError() {
        return this.onError != C9222a.f18009d;
    }

    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    public void onComplete() {
        Object obj = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (obj != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                C9211a.m24971b(th);
                C9323a.m25169p(th);
            }
        }
    }

    public void onError(Throwable th) {
        Object obj = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (obj != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                C9211a.m24971b(th2);
                C9323a.m25169p(new CompositeException(th, th2));
            }
        } else {
            C9323a.m25169p(th);
        }
    }

    public void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                C9211a.m24971b(th);
                ((C9803c) get()).cancel();
                onError(th);
            }
        }
    }

    public void onSubscribe(C9803c cVar) {
        if (SubscriptionHelper.setOnce(this, cVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                C9211a.m24971b(th);
                cVar.cancel();
                onError(th);
            }
        }
    }

    public void request(long j) {
        ((C9803c) get()).request(j);
    }
}
