package p630io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p553f.p594c.p598o.C9207b;
import p648m.p683f.C9803c;

/* renamed from: io.reactivex.internal.subscriptions.ArrayCompositeSubscription */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<C9803c> implements C9207b {
    public static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeSubscription(int i) {
        super(i);
    }

    public void dispose() {
        C9803c cVar;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                C9803c cVar2 = (C9803c) get(i);
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (!(cVar2 == subscriptionHelper || (cVar = (C9803c) getAndSet(i, subscriptionHelper)) == SubscriptionHelper.CANCELLED || cVar == null)) {
                    cVar.cancel();
                }
            }
        }
    }

    public boolean isDisposed() {
        return get(0) == SubscriptionHelper.CANCELLED;
    }

    public C9803c replaceResource(int i, C9803c cVar) {
        C9803c cVar2;
        do {
            cVar2 = (C9803c) get(i);
            if (cVar2 == SubscriptionHelper.CANCELLED) {
                if (cVar == null) {
                    return null;
                }
                cVar.cancel();
                return null;
            }
        } while (!compareAndSet(i, cVar2, cVar));
        return cVar2;
    }

    public boolean setResource(int i, C9803c cVar) {
        C9803c cVar2;
        do {
            cVar2 = (C9803c) get(i);
            if (cVar2 == SubscriptionHelper.CANCELLED) {
                if (cVar == null) {
                    return false;
                }
                cVar.cancel();
                return false;
            }
        } while (!compareAndSet(i, cVar2, cVar));
        if (cVar2 == null) {
            return true;
        }
        cVar2.cancel();
        return true;
    }
}
