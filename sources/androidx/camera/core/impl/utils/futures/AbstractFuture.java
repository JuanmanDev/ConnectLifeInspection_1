package androidx.camera.core.impl.utils.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.internal.InternalFutureFailureAccess;
import androidx.camera.core.impl.utils.futures.internal.InternalFutures;
import androidx.core.util.Preconditions;
import androidx.test.internal.runner.RunnerArgs;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p040c.p200q.p353b.p360g.p361a.C6316e;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Deprecated
public abstract class AbstractFuture<V> extends InternalFutureFailureAccess implements C6316e<V> {
    public static final AtomicHelper ATOMIC_HELPER;
    public static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger LOG = Logger.getLogger(AbstractFuture.class.getName());
    public static final Object NULL = new Object();
    public static final long SPIN_THRESHOLD_NANOS = 1000;
    @Nullable
    public volatile Listener mListeners;
    @Nullable
    public volatile Object mValue;
    @Nullable
    public volatile Waiter mWaiters;

    public static abstract class AtomicHelper {
        public AtomicHelper() {
        }

        public abstract boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2);

        public abstract boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        public abstract boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2);

        public abstract void putNext(Waiter waiter, Waiter waiter2);

        public abstract void putThread(Waiter waiter, Thread thread);
    }

    public static final class Cancellation {
        public static final Cancellation CAUSELESS_CANCELLED;
        public static final Cancellation CAUSELESS_INTERRUPTED;
        @Nullable
        public final Throwable mCause;
        public final boolean mWasInterrupted;

        static {
            if (AbstractFuture.GENERATE_CANCELLATION_CAUSES) {
                CAUSELESS_CANCELLED = null;
                CAUSELESS_INTERRUPTED = null;
                return;
            }
            CAUSELESS_CANCELLED = new Cancellation(false, (Throwable) null);
            CAUSELESS_INTERRUPTED = new Cancellation(true, (Throwable) null);
        }

        public Cancellation(boolean z, @Nullable Throwable th) {
            this.mWasInterrupted = z;
            this.mCause = th;
        }
    }

    public static final class Failure {
        public static final Failure FALLBACK_INSTANCE = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        public final Throwable mException;

        public Failure(Throwable th) {
            this.mException = (Throwable) Preconditions.checkNotNull(th);
        }
    }

    public static final class Listener {
        public static final Listener TOMBSTONE = new Listener((Runnable) null, (Executor) null);
        public final Executor mExecutor;
        @Nullable
        public Listener mNext;
        public final Runnable mTask;

        public Listener(Runnable runnable, Executor executor) {
            this.mTask = runnable;
            this.mExecutor = executor;
        }
    }

    public static final class SafeAtomicHelper extends AtomicHelper {
        public final AtomicReferenceFieldUpdater<AbstractFuture, Listener> mListenersUpdater;
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> mValueUpdater;
        public final AtomicReferenceFieldUpdater<Waiter, Waiter> mWaiterNextUpdater;
        public final AtomicReferenceFieldUpdater<Waiter, Thread> mWaiterThreadUpdater;
        public final AtomicReferenceFieldUpdater<AbstractFuture, Waiter> mWaitersUpdater;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater<Waiter, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<Waiter, Waiter> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, Waiter> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, Listener> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.mWaiterThreadUpdater = atomicReferenceFieldUpdater;
            this.mWaiterNextUpdater = atomicReferenceFieldUpdater2;
            this.mWaitersUpdater = atomicReferenceFieldUpdater3;
            this.mListenersUpdater = atomicReferenceFieldUpdater4;
            this.mValueUpdater = atomicReferenceFieldUpdater5;
        }

        public boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
            return this.mListenersUpdater.compareAndSet(abstractFuture, listener, listener2);
        }

        public boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return this.mValueUpdater.compareAndSet(abstractFuture, obj, obj2);
        }

        public boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
            return this.mWaitersUpdater.compareAndSet(abstractFuture, waiter, waiter2);
        }

        public void putNext(Waiter waiter, Waiter waiter2) {
            this.mWaiterNextUpdater.lazySet(waiter, waiter2);
        }

        public void putThread(Waiter waiter, Thread thread) {
            this.mWaiterThreadUpdater.lazySet(waiter, thread);
        }
    }

    public static final class SetFuture<V> implements Runnable {
        public final C6316e<? extends V> mFuture;
        public final AbstractFuture<V> mOwner;

        public SetFuture(AbstractFuture<V> abstractFuture, C6316e<? extends V> eVar) {
            this.mOwner = abstractFuture;
            this.mFuture = eVar;
        }

        public void run() {
            if (this.mOwner.mValue == this) {
                if (AbstractFuture.ATOMIC_HELPER.casValue(this.mOwner, this, AbstractFuture.getFutureValue(this.mFuture))) {
                    AbstractFuture.complete(this.mOwner);
                }
            }
        }
    }

    public static final class SynchronizedHelper extends AtomicHelper {
        public SynchronizedHelper() {
            super();
        }

        public boolean casListeners(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
            synchronized (abstractFuture) {
                if (abstractFuture.mListeners != listener) {
                    return false;
                }
                abstractFuture.mListeners = listener2;
                return true;
            }
        }

        public boolean casValue(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.mValue != obj) {
                    return false;
                }
                abstractFuture.mValue = obj2;
                return true;
            }
        }

        public boolean casWaiters(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractFuture) {
                if (abstractFuture.mWaiters != waiter) {
                    return false;
                }
                abstractFuture.mWaiters = waiter2;
                return true;
            }
        }

        public void putNext(Waiter waiter, Waiter waiter2) {
            waiter.mNext = waiter2;
        }

        public void putThread(Waiter waiter, Thread thread) {
            waiter.mThread = thread;
        }
    }

    public interface Trusted<V> extends C6316e<V> {
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    public static abstract class TrustedFuture<V> extends AbstractFuture<V> implements Trusted<V> {
        public final void addListener(Runnable runnable, Executor executor) {
            AbstractFuture.super.addListener(runnable, executor);
        }

        public final boolean cancel(boolean z) {
            return AbstractFuture.super.cancel(z);
        }

        public final V get() {
            return AbstractFuture.super.get();
        }

        public final boolean isCancelled() {
            return AbstractFuture.super.isCancelled();
        }

        public final boolean isDone() {
            return AbstractFuture.super.isDone();
        }

        public final V get(long j, TimeUnit timeUnit) {
            return AbstractFuture.super.get(j, timeUnit);
        }
    }

    public static final class Waiter {
        public static final Waiter TOMBSTONE = new Waiter(false);
        @Nullable
        public volatile Waiter mNext;
        @Nullable
        public volatile Thread mThread;

        public Waiter(boolean z) {
        }

        public void setNext(Waiter waiter) {
            AbstractFuture.ATOMIC_HELPER.putNext(this, waiter);
        }

        public void unpark() {
            Thread thread = this.mThread;
            if (thread != null) {
                this.mThread = null;
                LockSupport.unpark(thread);
            }
        }

        public Waiter() {
            AbstractFuture.ATOMIC_HELPER.putThread(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.camera.core.impl.utils.futures.AbstractFuture$SafeAtomicHelper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.camera.core.impl.utils.futures.AbstractFuture$SynchronizedHelper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.camera.core.impl.utils.futures.AbstractFuture$SafeAtomicHelper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.camera.core.impl.utils.futures.AbstractFuture$SafeAtomicHelper} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.camera.core.impl.utils.futures.AbstractFuture$Waiter> r0 = androidx.camera.core.impl.utils.futures.AbstractFuture.Waiter.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            GENERATE_CANCELLATION_CAUSES = r1
            java.lang.Class<androidx.camera.core.impl.utils.futures.AbstractFuture> r1 = androidx.camera.core.impl.utils.futures.AbstractFuture.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            LOG = r1
            androidx.camera.core.impl.utils.futures.AbstractFuture$SafeAtomicHelper r1 = new androidx.camera.core.impl.utils.futures.AbstractFuture$SafeAtomicHelper     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "mThread"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "mNext"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.camera.core.impl.utils.futures.AbstractFuture> r2 = androidx.camera.core.impl.utils.futures.AbstractFuture.class
            java.lang.String r5 = "mWaiters"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.camera.core.impl.utils.futures.AbstractFuture> r0 = androidx.camera.core.impl.utils.futures.AbstractFuture.class
            java.lang.Class<androidx.camera.core.impl.utils.futures.AbstractFuture$Listener> r2 = androidx.camera.core.impl.utils.futures.AbstractFuture.Listener.class
            java.lang.String r6 = "mListeners"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.camera.core.impl.utils.futures.AbstractFuture> r0 = androidx.camera.core.impl.utils.futures.AbstractFuture.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "mValue"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.camera.core.impl.utils.futures.AbstractFuture$SynchronizedHelper r1 = new androidx.camera.core.impl.utils.futures.AbstractFuture$SynchronizedHelper
            r1.<init>()
        L_0x0054:
            ATOMIC_HELPER = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = LOG
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            NULL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.futures.AbstractFuture.<clinit>():void");
    }

    private void addDoneString(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(userObjectToString(uninterruptibly));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, mCause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, mCause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public static CancellationException cancellationExceptionWithCause(@Nullable String str, @Nullable Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private Listener clearListeners(Listener listener) {
        Listener listener2;
        do {
            listener2 = this.mListeners;
        } while (!ATOMIC_HELPER.casListeners(this, listener2, Listener.TOMBSTONE));
        Listener listener3 = listener2;
        Listener listener4 = listener;
        Listener listener5 = listener3;
        while (listener5 != null) {
            Listener listener6 = listener5.mNext;
            listener5.mNext = listener4;
            listener4 = listener5;
            listener5 = listener6;
        }
        return listener4;
    }

    public static void complete(AbstractFuture<?> abstractFuture) {
        Listener listener = null;
        AbstractFuture<V> abstractFuture2 = abstractFuture;
        while (true) {
            abstractFuture2.releaseWaiters();
            abstractFuture2.afterDone();
            Listener clearListeners = abstractFuture2.clearListeners(listener);
            while (true) {
                if (clearListeners != null) {
                    listener = clearListeners.mNext;
                    Runnable runnable = clearListeners.mTask;
                    if (runnable instanceof SetFuture) {
                        SetFuture setFuture = (SetFuture) runnable;
                        AbstractFuture<V> abstractFuture3 = setFuture.mOwner;
                        if (abstractFuture3.mValue == setFuture) {
                            if (ATOMIC_HELPER.casValue(abstractFuture3, setFuture, getFutureValue(setFuture.mFuture))) {
                                abstractFuture2 = abstractFuture3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        executeListener(runnable, clearListeners.mExecutor);
                    }
                    clearListeners = listener;
                } else {
                    return;
                }
            }
        }
    }

    public static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = LOG;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    private V getDoneValue(Object obj) {
        if (obj instanceof Cancellation) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((Cancellation) obj).mCause);
        } else if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).mException);
        } else if (obj == NULL) {
            return null;
        } else {
            return obj;
        }
    }

    public static Object getFutureValue(C6316e<?> eVar) {
        Throwable tryInternalFastPathGetFailure;
        if (eVar instanceof Trusted) {
            Object obj = ((AbstractFuture) eVar).mValue;
            if (!(obj instanceof Cancellation)) {
                return obj;
            }
            Cancellation cancellation = (Cancellation) obj;
            if (cancellation.mWasInterrupted) {
                return cancellation.mCause != null ? new Cancellation(false, cancellation.mCause) : Cancellation.CAUSELESS_CANCELLED;
            }
            return obj;
        } else if ((eVar instanceof InternalFutureFailureAccess) && (tryInternalFastPathGetFailure = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess) eVar)) != null) {
            return new Failure(tryInternalFastPathGetFailure);
        } else {
            boolean isCancelled = eVar.isCancelled();
            if ((!GENERATE_CANCELLATION_CAUSES) && isCancelled) {
                return Cancellation.CAUSELESS_CANCELLED;
            }
            try {
                Object uninterruptibly = getUninterruptibly(eVar);
                if (!isCancelled) {
                    return uninterruptibly == null ? NULL : uninterruptibly;
                }
                return new Cancellation(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + eVar));
            } catch (ExecutionException e) {
                if (!isCancelled) {
                    return new Failure(e.getCause());
                }
                return new Cancellation(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + eVar, e));
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new Cancellation(false, e2);
                }
                return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + eVar, e2));
            } catch (Throwable th) {
                return new Failure(th);
            }
        }
    }

    public static <V> V getUninterruptibly(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private void releaseWaiters() {
        Waiter waiter;
        do {
            waiter = this.mWaiters;
        } while (!ATOMIC_HELPER.casWaiters(this, waiter, Waiter.TOMBSTONE));
        while (waiter != null) {
            waiter.unpark();
            waiter = waiter.mNext;
        }
    }

    private void removeWaiter(Waiter waiter) {
        waiter.mThread = null;
        while (true) {
            Waiter waiter2 = this.mWaiters;
            if (waiter2 != Waiter.TOMBSTONE) {
                Waiter waiter3 = null;
                while (waiter2 != null) {
                    Waiter waiter4 = waiter2.mNext;
                    if (waiter2.mThread != null) {
                        waiter3 = waiter2;
                    } else if (waiter3 != null) {
                        waiter3.mNext = waiter4;
                        if (waiter3.mThread == null) {
                        }
                    } else if (!ATOMIC_HELPER.casWaiters(this, waiter2, waiter4)) {
                    }
                    waiter2 = waiter4;
                }
                return;
            }
            return;
        }
    }

    private String userObjectToString(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public void addListener(Runnable runnable, Executor executor) {
        Listener listener;
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        if (isDone() || (listener = this.mListeners) == Listener.TOMBSTONE) {
            executeListener(runnable, executor);
        }
        Listener listener2 = new Listener(runnable, executor);
        do {
            listener2.mNext = listener;
            if (!ATOMIC_HELPER.casListeners(this, listener, listener2)) {
                listener = this.mListeners;
            } else {
                return;
            }
        } while (listener != Listener.TOMBSTONE);
        executeListener(runnable, executor);
    }

    public void afterDone() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, c.q.b.g.a.e<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.mValue
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof androidx.camera.core.impl.utils.futures.AbstractFuture.SetFuture
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = GENERATE_CANCELLATION_CAUSES
            if (r3 == 0) goto L_0x001f
            androidx.camera.core.impl.utils.futures.AbstractFuture$Cancellation r3 = new androidx.camera.core.impl.utils.futures.AbstractFuture$Cancellation
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.camera.core.impl.utils.futures.AbstractFuture$Cancellation r3 = androidx.camera.core.impl.utils.futures.AbstractFuture.Cancellation.CAUSELESS_INTERRUPTED
            goto L_0x0026
        L_0x0024:
            androidx.camera.core.impl.utils.futures.AbstractFuture$Cancellation r3 = androidx.camera.core.impl.utils.futures.AbstractFuture.Cancellation.CAUSELESS_CANCELLED
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            androidx.camera.core.impl.utils.futures.AbstractFuture$AtomicHelper r6 = ATOMIC_HELPER
            boolean r6 = r6.casValue(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.interruptTask()
        L_0x0035:
            complete(r4)
            boolean r4 = r0 instanceof androidx.camera.core.impl.utils.futures.AbstractFuture.SetFuture
            if (r4 == 0) goto L_0x0062
            androidx.camera.core.impl.utils.futures.AbstractFuture$SetFuture r0 = (androidx.camera.core.impl.utils.futures.AbstractFuture.SetFuture) r0
            c.q.b.g.a.e<? extends V> r0 = r0.mFuture
            boolean r4 = r0 instanceof androidx.camera.core.impl.utils.futures.AbstractFuture.Trusted
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.camera.core.impl.utils.futures.AbstractFuture r4 = (androidx.camera.core.impl.utils.futures.AbstractFuture) r4
            java.lang.Object r0 = r4.mValue
            if (r0 != 0) goto L_0x004d
            r5 = r1
            goto L_0x004e
        L_0x004d:
            r5 = r2
        L_0x004e:
            boolean r6 = r0 instanceof androidx.camera.core.impl.utils.futures.AbstractFuture.SetFuture
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = r1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.mValue
            boolean r6 = r0 instanceof androidx.camera.core.impl.utils.futures.AbstractFuture.SetFuture
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.futures.AbstractFuture.cancel(boolean):boolean");
    }

    public V get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.mValue;
            if ((obj != null) && (!(obj instanceof SetFuture))) {
                return getDoneValue(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                Waiter waiter = this.mWaiters;
                if (waiter != Waiter.TOMBSTONE) {
                    Waiter waiter2 = new Waiter();
                    do {
                        waiter2.setNext(waiter);
                        if (ATOMIC_HELPER.casWaiters(this, waiter, waiter2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.mValue;
                                    if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                        return getDoneValue(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    removeWaiter(waiter2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            removeWaiter(waiter2);
                        } else {
                            waiter = this.mWaiters;
                        }
                    } while (waiter != Waiter.TOMBSTONE);
                }
                return getDoneValue(this.mValue);
            }
            while (nanos > 0) {
                Object obj3 = this.mValue;
                if ((obj3 != null) && (!(obj3 instanceof SetFuture))) {
                    return getDoneValue(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractFuture = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + RunnerArgs.CLASS_SEPARATOR;
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + abstractFuture);
        }
        throw new InterruptedException();
    }

    public void interruptTask() {
    }

    public boolean isCancelled() {
        return this.mValue instanceof Cancellation;
    }

    public boolean isDone() {
        Object obj = this.mValue;
        return (!(obj instanceof SetFuture)) & (obj != null);
    }

    public final void maybePropagateCancellationTo(@Nullable Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    @Nullable
    public String pendingToString() {
        Object obj = this.mValue;
        if (obj instanceof SetFuture) {
            return "setFuture=[" + userObjectToString(((SetFuture) obj).mFuture) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    public boolean set(@Nullable V v) {
        if (v == null) {
            v = NULL;
        }
        if (!ATOMIC_HELPER.casValue(this, (Object) null, v)) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.casValue(this, (Object) null, new Failure((Throwable) Preconditions.checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setFuture(C6316e<? extends V> eVar) {
        SetFuture setFuture;
        Failure failure;
        Preconditions.checkNotNull(eVar);
        Object obj = this.mValue;
        if (obj == null) {
            if (eVar.isDone()) {
                if (!ATOMIC_HELPER.casValue(this, (Object) null, getFutureValue(eVar))) {
                    return false;
                }
                complete(this);
                return true;
            }
            setFuture = new SetFuture(this, eVar);
            if (ATOMIC_HELPER.casValue(this, (Object) null, setFuture)) {
                try {
                    eVar.addListener(setFuture, CameraXExecutors.directExecutor());
                } catch (Throwable unused) {
                    failure = Failure.FALLBACK_INSTANCE;
                }
                return true;
            }
            obj = this.mValue;
        }
        if (obj instanceof Cancellation) {
            eVar.cancel(((Cancellation) obj).mWasInterrupted);
        }
        return false;
        ATOMIC_HELPER.casValue(this, setFuture, failure);
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb);
        } else {
            try {
                str = pendingToString();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                addDoneString(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Nullable
    public final Throwable tryInternalFastPathGetFailure() {
        if (!(this instanceof Trusted)) {
            return null;
        }
        Object obj = this.mValue;
        if (obj instanceof Failure) {
            return ((Failure) obj).mException;
        }
        return null;
    }

    public final boolean wasInterrupted() {
        Object obj = this.mValue;
        return (obj instanceof Cancellation) && ((Cancellation) obj).mWasInterrupted;
    }

    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.mValue;
            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                return getDoneValue(obj2);
            }
            Waiter waiter = this.mWaiters;
            if (waiter != Waiter.TOMBSTONE) {
                Waiter waiter2 = new Waiter();
                do {
                    waiter2.setNext(waiter);
                    if (ATOMIC_HELPER.casWaiters(this, waiter, waiter2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.mValue;
                            } else {
                                removeWaiter(waiter2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return getDoneValue(obj);
                    }
                    waiter = this.mWaiters;
                } while (waiter != Waiter.TOMBSTONE);
            }
            return getDoneValue(this.mValue);
        }
        throw new InterruptedException();
    }
}
