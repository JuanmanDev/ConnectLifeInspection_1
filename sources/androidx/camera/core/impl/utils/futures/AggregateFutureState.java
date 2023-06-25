package androidx.camera.core.impl.utils.futures;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AggregateFutureState {
    public static final AtomicHelper ATOMIC_HELPER;
    public static final Logger sLogger;
    public volatile int mRemaining;
    public volatile Set<Throwable> mSeenExceptions = null;

    public static abstract class AtomicHelper {
        public AtomicHelper() {
        }

        public abstract void compareAndSetSeenExceptions(AggregateFutureState aggregateFutureState, Set<Throwable> set, Set<Throwable> set2);

        public abstract int decrementAndGetRemainingCount(AggregateFutureState aggregateFutureState);
    }

    public static final class SafeAtomicHelper extends AtomicHelper {
        public final AtomicIntegerFieldUpdater<AggregateFutureState> mRemainingCountUpdater;
        public final AtomicReferenceFieldUpdater<AggregateFutureState, Set<Throwable>> mSeenExceptionsUpdater;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater<AggregateFutureState, Set<Throwable>> atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater<AggregateFutureState> atomicIntegerFieldUpdater) {
            super();
            this.mSeenExceptionsUpdater = atomicReferenceFieldUpdater;
            this.mRemainingCountUpdater = atomicIntegerFieldUpdater;
        }

        public void compareAndSetSeenExceptions(AggregateFutureState aggregateFutureState, Set<Throwable> set, Set<Throwable> set2) {
            this.mSeenExceptionsUpdater.compareAndSet(aggregateFutureState, set, set2);
        }

        public int decrementAndGetRemainingCount(AggregateFutureState aggregateFutureState) {
            return this.mRemainingCountUpdater.decrementAndGet(aggregateFutureState);
        }
    }

    public static final class SynchronizedAtomicHelper extends AtomicHelper {
        public SynchronizedAtomicHelper() {
            super();
        }

        public void compareAndSetSeenExceptions(AggregateFutureState aggregateFutureState, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (aggregateFutureState) {
                if (aggregateFutureState.mSeenExceptions == set) {
                    aggregateFutureState.mSeenExceptions = set2;
                }
            }
        }

        public int decrementAndGetRemainingCount(AggregateFutureState aggregateFutureState) {
            int i;
            synchronized (aggregateFutureState) {
                aggregateFutureState.mRemaining--;
                i = aggregateFutureState.mRemaining;
            }
            return i;
        }
    }

    static {
        AtomicHelper atomicHelper;
        Class<AggregateFutureState> cls = AggregateFutureState.class;
        sLogger = Logger.getLogger(cls.getName());
        try {
            atomicHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(cls, Set.class, "mSeenExceptions"), AtomicIntegerFieldUpdater.newUpdater(cls, "mRemaining"));
            th = null;
        } catch (Throwable th) {
            th = th;
            atomicHelper = new SynchronizedAtomicHelper();
        }
        ATOMIC_HELPER = atomicHelper;
        if (th != null) {
            sLogger.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    public AggregateFutureState(int i) {
        this.mRemaining = i;
    }

    public abstract void addInitialException(Set<Throwable> set);

    public final int decrementRemainingAndGet() {
        return ATOMIC_HELPER.decrementAndGetRemainingCount(this);
    }

    public final Set<Throwable> getOrInitSeenExceptions() {
        Set<Throwable> set = this.mSeenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        addInitialException(newSetFromMap);
        ATOMIC_HELPER.compareAndSetSeenExceptions(this, (Set<Throwable>) null, newSetFromMap);
        return this.mSeenExceptions;
    }
}
