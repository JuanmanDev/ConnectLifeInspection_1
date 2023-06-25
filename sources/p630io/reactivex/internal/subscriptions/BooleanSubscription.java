package p630io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import p648m.p683f.C9803c;

/* renamed from: io.reactivex.internal.subscriptions.BooleanSubscription */
public final class BooleanSubscription extends AtomicBoolean implements C9803c {
    public static final long serialVersionUID = -8127758972444290902L;

    public void cancel() {
        lazySet(true);
    }

    public boolean isCancelled() {
        return get();
    }

    public void request(long j) {
        SubscriptionHelper.validate(j);
    }

    public String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }
}
