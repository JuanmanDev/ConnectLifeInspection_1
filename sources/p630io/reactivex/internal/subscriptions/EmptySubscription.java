package p630io.reactivex.internal.subscriptions;

import p553f.p594c.p602s.p605c.C9231d;
import p648m.p683f.C9802b;

/* renamed from: io.reactivex.internal.subscriptions.EmptySubscription */
public enum EmptySubscription implements C9231d<Object> {
    INSTANCE;

    public static void complete(C9802b<?> bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onComplete();
    }

    public static void error(Throwable th, C9802b<?> bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onError(th);
    }

    public void cancel() {
    }

    public void clear() {
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() {
        return null;
    }

    public void request(long j) {
        SubscriptionHelper.validate(j);
    }

    public int requestFusion(int i) {
        return i & 2;
    }

    public String toString() {
        return "EmptySubscription";
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
