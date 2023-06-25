package p630io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.p602s.p604b.C9227b;
import p553f.p594c.p602s.p614i.C9314b;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.ProtocolViolationException;
import p648m.p683f.C9803c;

/* renamed from: io.reactivex.internal.subscriptions.SubscriptionHelper */
public enum SubscriptionHelper implements C9803c {
    CANCELLED;

    public static boolean cancel(AtomicReference<C9803c> atomicReference) {
        C9803c andSet;
        C9803c cVar = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (cVar == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == CANCELLED) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void deferredRequest(AtomicReference<C9803c> atomicReference, AtomicLong atomicLong, long j) {
        C9803c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.request(j);
        } else if (validate(j)) {
            C9314b.m25135a(atomicLong, j);
            C9803c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<C9803c> atomicReference, AtomicLong atomicLong, C9803c cVar) {
        if (!setOnce(atomicReference, cVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet == 0) {
            return true;
        }
        cVar.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<C9803c> atomicReference, C9803c cVar) {
        C9803c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == CANCELLED) {
                if (cVar == null) {
                    return false;
                }
                cVar.cancel();
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        return true;
    }

    public static void reportMoreProduced(long j) {
        C9323a.m25169p(new ProtocolViolationException("More produced than requested: " + j));
    }

    public static void reportSubscriptionSet() {
        C9323a.m25169p(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<C9803c> atomicReference, C9803c cVar) {
        C9803c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == CANCELLED) {
                if (cVar == null) {
                    return false;
                }
                cVar.cancel();
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        if (cVar2 == null) {
            return true;
        }
        cVar2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<C9803c> atomicReference, C9803c cVar) {
        C9227b.m24985d(cVar, "s is null");
        if (atomicReference.compareAndSet((Object) null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(C9803c cVar, C9803c cVar2) {
        if (cVar2 == null) {
            C9323a.m25169p(new NullPointerException("next is null"));
            return false;
        } else if (cVar == null) {
            return true;
        } else {
            cVar2.cancel();
            reportSubscriptionSet();
            return false;
        }
    }

    public void cancel() {
    }

    public void request(long j) {
    }

    public static boolean validate(long j) {
        if (j > 0) {
            return true;
        }
        C9323a.m25169p(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    public static boolean setOnce(AtomicReference<C9803c> atomicReference, C9803c cVar, long j) {
        if (!setOnce(atomicReference, cVar)) {
            return false;
        }
        cVar.request(j);
        return true;
    }
}
