package androidx.camera.core.impl.utils.futures;

import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AbstractFuture;
import androidx.core.util.Preconditions;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Logger;
import p040c.p200q.p353b.p360g.p361a.C6316e;

public abstract class AggregateFuture<InputT, OutputT> extends AbstractFuture.TrustedFuture<OutputT> {
    public static final Logger sLogger = Logger.getLogger(AggregateFuture.class.getName());
    @Nullable
    public AggregateFuture<InputT, OutputT>.RunningState mRunningState;

    public abstract class RunningState extends AggregateFutureState implements Runnable {
        public final boolean mAllMustSucceed;
        public final boolean mCollectsValues;
        public Collection<? extends C6316e<? extends InputT>> mFutures;

        public RunningState(Collection<? extends C6316e<? extends InputT>> collection, boolean z, boolean z2) {
            super(collection.size());
            this.mFutures = (Collection) Preconditions.checkNotNull(collection);
            this.mAllMustSucceed = z;
            this.mCollectsValues = z2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void handleException(java.lang.Throwable r6) {
            /*
                r5 = this;
                androidx.core.util.Preconditions.checkNotNull(r6)
                boolean r0 = r5.mAllMustSucceed
                r1 = 1
                if (r0 == 0) goto L_0x001d
                androidx.camera.core.impl.utils.futures.AggregateFuture r0 = androidx.camera.core.impl.utils.futures.AggregateFuture.this
                boolean r0 = r0.setException(r6)
                if (r0 == 0) goto L_0x0014
                r5.releaseResourcesAfterFailure()
                goto L_0x001e
            L_0x0014:
                java.util.Set r2 = r5.getOrInitSeenExceptions()
                boolean r2 = androidx.camera.core.impl.utils.futures.AggregateFuture.addCausalChain(r2, r6)
                goto L_0x001f
            L_0x001d:
                r0 = 0
            L_0x001e:
                r2 = r1
            L_0x001f:
                boolean r3 = r6 instanceof java.lang.Error
                boolean r4 = r5.mAllMustSucceed
                r0 = r0 ^ r1
                r0 = r0 & r4
                r0 = r0 & r2
                r0 = r0 | r3
                if (r0 == 0) goto L_0x0037
                if (r3 == 0) goto L_0x002e
                java.lang.String r0 = "Input Future failed with Error"
                goto L_0x0030
            L_0x002e:
                java.lang.String r0 = "Got more than one input Future failure. Logging failures after the first"
            L_0x0030:
                java.util.logging.Logger r1 = androidx.camera.core.impl.utils.futures.AggregateFuture.sLogger
                java.util.logging.Level r2 = java.util.logging.Level.SEVERE
                r1.log(r2, r0, r6)
            L_0x0037:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.futures.AggregateFuture.RunningState.handleException(java.lang.Throwable):void");
        }

        private void processCompleted() {
            if (this.mCollectsValues && (!this.mAllMustSucceed)) {
                int i = 0;
                for (C6316e handleOneInputDone : this.mFutures) {
                    handleOneInputDone(i, handleOneInputDone);
                    i++;
                }
            }
            handleAllCompleted();
        }

        public final void addInitialException(Set<Throwable> set) {
            if (!AggregateFuture.this.isCancelled()) {
                AggregateFuture.addCausalChain(set, AggregateFuture.this.tryInternalFastPathGetFailure());
            }
        }

        public abstract void collectOneValue(boolean z, int i, @Nullable InputT inputt);

        public void decrementCountAndMaybeComplete() {
            int decrementRemainingAndGet = decrementRemainingAndGet();
            Preconditions.checkState(decrementRemainingAndGet >= 0, "Less than 0 remaining mFutures");
            if (decrementRemainingAndGet == 0) {
                processCompleted();
            }
        }

        public abstract void handleAllCompleted();

        public void handleOneInputDone(int i, Future<? extends InputT> future) {
            Preconditions.checkState(this.mAllMustSucceed || !AggregateFuture.this.isDone() || AggregateFuture.this.isCancelled(), "Future was done before all dependencies completed");
            try {
                Preconditions.checkState(future.isDone(), "Tried to set value from future which is not done");
                if (this.mAllMustSucceed) {
                    if (future.isCancelled()) {
                        AggregateFuture.this.mRunningState = null;
                        AggregateFuture.this.cancel(false);
                        return;
                    }
                    Object done = Futures.getDone(future);
                    if (this.mCollectsValues) {
                        collectOneValue(this.mAllMustSucceed, i, done);
                    }
                } else if (this.mCollectsValues && !future.isCancelled()) {
                    collectOneValue(this.mAllMustSucceed, i, Futures.getDone(future));
                }
            } catch (ExecutionException e) {
                handleException(e.getCause());
            } catch (Throwable th) {
                handleException(th);
            }
        }

        public void init() {
            if (this.mFutures.isEmpty()) {
                handleAllCompleted();
            } else if (this.mAllMustSucceed) {
                final int i = 0;
                for (final C6316e eVar : this.mFutures) {
                    eVar.addListener(new Runnable() {
                        public void run() {
                            try {
                                RunningState.this.handleOneInputDone(i, eVar);
                            } finally {
                                RunningState.this.decrementCountAndMaybeComplete();
                            }
                        }
                    }, CameraXExecutors.directExecutor());
                    i++;
                }
            } else {
                for (C6316e addListener : this.mFutures) {
                    addListener.addListener(this, CameraXExecutors.directExecutor());
                }
            }
        }

        public void interruptTask() {
        }

        public void releaseResourcesAfterFailure() {
            this.mFutures = null;
        }

        public final void run() {
            decrementCountAndMaybeComplete();
        }
    }

    public static boolean addCausalChain(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    public final void afterDone() {
        super.afterDone();
        AggregateFuture<InputT, OutputT>.RunningState runningState = this.mRunningState;
        if (runningState != null) {
            this.mRunningState = null;
            Collection<? extends C6316e<? extends InputT>> collection = runningState.mFutures;
            boolean wasInterrupted = wasInterrupted();
            if (wasInterrupted) {
                runningState.interruptTask();
            }
            if (isCancelled() && (collection != null)) {
                for (C6316e cancel : collection) {
                    cancel.cancel(wasInterrupted);
                }
            }
        }
    }

    public final void init(AggregateFuture<InputT, OutputT>.RunningState runningState) {
        this.mRunningState = runningState;
        runningState.init();
    }

    public String pendingToString() {
        Collection<? extends C6316e<? extends InputT>> collection;
        AggregateFuture<InputT, OutputT>.RunningState runningState = this.mRunningState;
        if (runningState == null || (collection = runningState.mFutures) == null) {
            return null;
        }
        return "mFutures=[" + collection + "]";
    }
}
