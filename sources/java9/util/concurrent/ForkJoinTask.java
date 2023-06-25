package java9.util.concurrent;

import androidx.core.app.NotificationCompat;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.ReentrantLock;
import p620g.p621a.C9335b;
import p620g.p621a.p622d.C9346b;
import p620g.p621a.p622d.C9356c;
import p620g.p621a.p622d.C9364f;
import sun.misc.Unsafe;

public abstract class ForkJoinTask<V> implements Future<V>, Serializable {
    public static final int CANCELLED = -1073741824;
    public static final int DONE_MASK = -268435456;
    public static final int EXCEPTIONAL = Integer.MIN_VALUE;
    public static final int NORMAL = -268435456;
    public static final int SIGNAL = 65536;
    public static final int SMASK = 65535;
    public static final long STATUS;

    /* renamed from: U */
    public static final Unsafe f18779U;
    public static final C9482d[] exceptionTable = new C9482d[32];
    public static final ReentrantLock exceptionTableLock = new ReentrantLock();
    public static final ReferenceQueue<ForkJoinTask<?>> exceptionTableRefQueue = new ReferenceQueue<>();
    public static final long serialVersionUID = -7721805057305804111L;
    public volatile int status;

    /* renamed from: java9.util.concurrent.ForkJoinTask$a */
    public static final class C9479a<T> extends ForkJoinTask<T> implements RunnableFuture<T> {
        public static final long serialVersionUID = 2838392045355241008L;

        /* renamed from: e */
        public final Callable<? extends T> f18780e;

        /* renamed from: l */
        public T f18781l;

        public C9479a(Callable<? extends T> callable) {
            C9335b.m25184a(callable);
            this.f18780e = callable;
        }

        public final boolean exec() {
            try {
                this.f18781l = this.f18780e.call();
                return true;
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }

        public final T getRawResult() {
            return this.f18781l;
        }

        public final void run() {
            invoke();
        }

        public final void setRawResult(T t) {
            this.f18781l = t;
        }

        public String toString() {
            return super.toString() + "[Wrapped task = " + this.f18780e + "]";
        }
    }

    /* renamed from: java9.util.concurrent.ForkJoinTask$b */
    public static final class C9480b<T> extends ForkJoinTask<T> implements RunnableFuture<T> {
        public static final long serialVersionUID = 5232453952276885070L;

        /* renamed from: e */
        public final Runnable f18782e;

        /* renamed from: l */
        public T f18783l;

        public C9480b(Runnable runnable, T t) {
            C9335b.m25184a(runnable);
            this.f18782e = runnable;
            this.f18783l = t;
        }

        public final boolean exec() {
            this.f18782e.run();
            return true;
        }

        public final T getRawResult() {
            return this.f18783l;
        }

        public final void run() {
            invoke();
        }

        public final void setRawResult(T t) {
            this.f18783l = t;
        }

        public String toString() {
            return super.toString() + "[Wrapped task = " + this.f18782e + "]";
        }
    }

    /* renamed from: java9.util.concurrent.ForkJoinTask$c */
    public static final class C9481c extends ForkJoinTask<Void> implements RunnableFuture<Void> {
        public static final long serialVersionUID = 5232453952276885070L;

        /* renamed from: e */
        public final Runnable f18784e;

        public C9481c(Runnable runnable) {
            C9335b.m25184a(runnable);
            this.f18784e = runnable;
        }

        public final boolean exec() {
            this.f18784e.run();
            return true;
        }

        public final Void getRawResult() {
            return null;
        }

        public final void run() {
            invoke();
        }

        public final void setRawResult(Void voidR) {
        }

        public String toString() {
            return super.toString() + "[Wrapped task = " + this.f18784e + "]";
        }
    }

    /* renamed from: java9.util.concurrent.ForkJoinTask$d */
    public static final class C9482d extends WeakReference<ForkJoinTask<?>> {

        /* renamed from: a */
        public final Throwable f18785a;

        /* renamed from: b */
        public C9482d f18786b;

        /* renamed from: c */
        public final long f18787c = Thread.currentThread().getId();

        /* renamed from: d */
        public final int f18788d;

        public C9482d(ForkJoinTask<?> forkJoinTask, Throwable th, C9482d dVar, ReferenceQueue<ForkJoinTask<?>> referenceQueue) {
            super(forkJoinTask, referenceQueue);
            this.f18785a = th;
            this.f18786b = dVar;
            this.f18788d = System.identityHashCode(forkJoinTask);
        }
    }

    /* renamed from: java9.util.concurrent.ForkJoinTask$e */
    public static final class C9483e extends ForkJoinTask<Void> {
        public static final long serialVersionUID = 5232453952276885070L;

        /* renamed from: e */
        public final Runnable f18789e;

        public C9483e(Runnable runnable) {
            C9335b.m25184a(runnable);
            this.f18789e = runnable;
        }

        public final boolean exec() {
            this.f18789e.run();
            return true;
        }

        public final Void getRawResult() {
            return null;
        }

        public void internalPropagateException(Throwable th) {
            ForkJoinTask.rethrow(th);
        }

        public final void setRawResult(Void voidR) {
        }
    }

    static {
        Unsafe unsafe = C9364f.f18379a;
        f18779U = unsafe;
        try {
            STATUS = unsafe.objectFieldOffset(ForkJoinTask.class.getDeclaredField(NotificationCompat.CATEGORY_STATUS));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static ForkJoinTask<?> adapt(Runnable runnable) {
        return new C9481c(runnable);
    }

    public static final void cancelIgnoringExceptions(ForkJoinTask<?> forkJoinTask) {
        if (forkJoinTask != null && forkJoinTask.status >= 0) {
            try {
                forkJoinTask.cancel(false);
            } catch (Throwable unused) {
            }
        }
    }

    private void clearExceptionalCompletion() {
        int identityHashCode = System.identityHashCode(this);
        ReentrantLock reentrantLock = exceptionTableLock;
        reentrantLock.lock();
        try {
            C9482d[] dVarArr = exceptionTable;
            int length = identityHashCode & (dVarArr.length - 1);
            C9482d dVar = dVarArr[length];
            C9482d dVar2 = null;
            while (true) {
                if (dVar == null) {
                    break;
                }
                C9482d dVar3 = dVar.f18786b;
                if (dVar.get() != this) {
                    dVar2 = dVar;
                    dVar = dVar3;
                } else if (dVar2 == null) {
                    dVarArr[length] = dVar3;
                } else {
                    dVar2.f18786b = dVar3;
                }
            }
            expungeStaleExceptions();
            this.status = 0;
        } finally {
            reentrantLock.unlock();
        }
    }

    private int doInvoke() {
        int doExec = doExec();
        if (doExec < 0) {
            return doExec;
        }
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C9356c)) {
            return externalAwaitDone();
        }
        C9356c cVar = (C9356c) currentThread;
        return cVar.f18361e.mo47217a(cVar.f18362l, this, 0);
    }

    private int doJoin() {
        int doExec;
        int i = this.status;
        if (i < 0) {
            return i;
        }
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C9356c)) {
            return externalAwaitDone();
        }
        C9356c cVar = (C9356c) currentThread;
        C9346b.C9355g gVar = cVar.f18362l;
        if (!gVar.mo47266q(this) || (doExec = doExec()) >= 0) {
            return cVar.f18361e.mo47217a(gVar, this, 0);
        }
        return doExec;
    }

    public static void expungeStaleExceptions() {
        while (true) {
            Reference<? extends ForkJoinTask<?>> poll = exceptionTableRefQueue.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof C9482d) {
                C9482d[] dVarArr = exceptionTable;
                int length = ((C9482d) poll).f18788d & (dVarArr.length - 1);
                C9482d dVar = dVarArr[length];
                C9482d dVar2 = null;
                while (true) {
                    if (dVar == null) {
                        break;
                    }
                    C9482d dVar3 = dVar.f18786b;
                    if (dVar != poll) {
                        dVar2 = dVar;
                        dVar = dVar3;
                    } else if (dVar2 == null) {
                        dVarArr[length] = dVar3;
                    } else {
                        dVar2.f18786b = dVar3;
                    }
                }
            }
        }
    }

    private int externalAwaitDone() {
        int i;
        boolean z = false;
        if (this instanceof CountedCompleter) {
            i = C9346b.f18326x.mo47223i((CountedCompleter) this, 0);
        } else {
            i = C9346b.f18326x.mo47215J(this) ? doExec() : 0;
        }
        if (i < 0) {
            return i;
        }
        int i2 = this.status;
        if (i2 < 0) {
            return i2;
        }
        int i3 = i2;
        do {
            if (f18779U.compareAndSwapInt(this, STATUS, i3, i3 | 65536)) {
                synchronized (this) {
                    if (this.status >= 0) {
                        try {
                            wait(0);
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                    } else {
                        notifyAll();
                    }
                }
            }
            i3 = this.status;
        } while (i3 >= 0);
        if (z) {
            Thread.currentThread().interrupt();
        }
        return i3;
    }

    private int externalInterruptibleAwaitDone() {
        int i;
        if (!Thread.interrupted()) {
            int i2 = this.status;
            if (i2 < 0) {
                return i2;
            }
            if (this instanceof CountedCompleter) {
                i = C9346b.f18326x.mo47223i((CountedCompleter) this, 0);
            } else {
                i = C9346b.f18326x.mo47215J(this) ? doExec() : 0;
            }
            if (i < 0) {
                return i;
            }
            while (true) {
                int i3 = this.status;
                if (i3 < 0) {
                    return i3;
                }
                if (f18779U.compareAndSwapInt(this, STATUS, i3, i3 | 65536)) {
                    synchronized (this) {
                        if (this.status >= 0) {
                            wait(0);
                        } else {
                            notifyAll();
                        }
                    }
                }
            }
        } else {
            throw new InterruptedException();
        }
    }

    public static C9346b getPool() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C9356c) {
            return ((C9356c) currentThread).f18361e;
        }
        return null;
    }

    public static int getQueuedTaskCount() {
        C9346b.C9355g gVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C9356c) {
            gVar = ((C9356c) currentThread).f18362l;
        } else {
            gVar = C9346b.m25210e();
        }
        if (gVar == null) {
            return 0;
        }
        return gVar.mo47261l();
    }

    public static int getSurplusQueuedTaskCount() {
        return C9346b.m25215o();
    }

    /* JADX INFO: finally extract failed */
    private Throwable getThrowableException() {
        Throwable th;
        int identityHashCode = System.identityHashCode(this);
        ReentrantLock reentrantLock = exceptionTableLock;
        reentrantLock.lock();
        try {
            expungeStaleExceptions();
            C9482d[] dVarArr = exceptionTable;
            C9482d dVar = dVarArr[identityHashCode & (dVarArr.length - 1)];
            while (dVar != null && dVar.get() != this) {
                dVar = dVar.f18786b;
            }
            reentrantLock.unlock();
            Constructor constructor = null;
            if (dVar == null || (th = dVar.f18785a) == null) {
                return null;
            }
            if (dVar.f18787c != Thread.currentThread().getId()) {
                try {
                    for (Constructor constructor2 : th.getClass().getConstructors()) {
                        Class<Throwable>[] parameterTypes = constructor2.getParameterTypes();
                        if (parameterTypes.length == 0) {
                            constructor = constructor2;
                        } else if (parameterTypes.length == 1 && parameterTypes[0] == Throwable.class) {
                            return (Throwable) constructor2.newInstance(new Object[]{th});
                        }
                    }
                    if (constructor != null) {
                        Throwable th2 = (Throwable) constructor.newInstance(new Object[0]);
                        th2.initCause(th);
                        return th2;
                    }
                } catch (Exception unused) {
                }
            }
            return th;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public static final void helpExpungeStaleExceptions() {
        ReentrantLock reentrantLock = exceptionTableLock;
        if (reentrantLock.tryLock()) {
            try {
                expungeStaleExceptions();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static void helpQuiesce() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C9356c) {
            C9356c cVar = (C9356c) currentThread;
            cVar.f18361e.mo47232r(cVar.f18362l);
            return;
        }
        C9346b.m25207A();
    }

    public static boolean inForkJoinPool() {
        return Thread.currentThread() instanceof C9356c;
    }

    public static void invokeAll(ForkJoinTask<?> forkJoinTask, ForkJoinTask<?> forkJoinTask2) {
        forkJoinTask2.fork();
        int doInvoke = forkJoinTask.doInvoke() & -268435456;
        if (doInvoke != -268435456) {
            forkJoinTask.reportException(doInvoke);
        }
        int doJoin = forkJoinTask2.doJoin() & -268435456;
        if (doJoin != -268435456) {
            forkJoinTask2.reportException(doJoin);
        }
    }

    public static ForkJoinTask<?> peekNextLocalTask() {
        C9346b.C9355g gVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C9356c) {
            gVar = ((C9356c) currentThread).f18362l;
        } else {
            gVar = C9346b.m25210e();
        }
        if (gVar == null) {
            return null;
        }
        return gVar.mo47257h();
    }

    public static ForkJoinTask<?> pollNextLocalTask() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C9356c) {
            return ((C9356c) currentThread).f18362l.mo47256g();
        }
        return null;
    }

    public static ForkJoinTask<?> pollSubmission() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C9356c) {
            return ((C9356c) currentThread).f18361e.mo47242z();
        }
        return null;
    }

    public static ForkJoinTask<?> pollTask() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C9356c)) {
            return null;
        }
        C9356c cVar = (C9356c) currentThread;
        return cVar.f18361e.mo47240x(cVar.f18362l);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        if (readObject != null) {
            setExceptionalCompletion((Throwable) readObject);
        }
    }

    private void reportException(int i) {
        if (i == -1073741824) {
            throw new CancellationException();
        } else if (i == Integer.MIN_VALUE) {
            rethrow(getThrowableException());
        }
    }

    public static void rethrow(Throwable th) {
        uncheckedThrow(th);
    }

    private int setCompletion(int i) {
        int i2;
        do {
            i2 = this.status;
            if (i2 < 0) {
                return i2;
            }
        } while (!f18779U.compareAndSwapInt(this, STATUS, i2, i2 | i));
        if ((i2 >>> 16) != 0) {
            synchronized (this) {
                notifyAll();
            }
        }
        return i;
    }

    private int setExceptionalCompletion(Throwable th) {
        int recordExceptionalCompletion = recordExceptionalCompletion(th);
        if ((-268435456 & recordExceptionalCompletion) == Integer.MIN_VALUE) {
            internalPropagateException(th);
        }
        return recordExceptionalCompletion;
    }

    public static <T extends Throwable> void uncheckedThrow(Throwable th) {
        if (th != null) {
            throw th;
        }
        throw new Error("Unknown Exception");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getException());
    }

    public boolean cancel(boolean z) {
        return (setCompletion(CANCELLED) & -268435456) == -1073741824;
    }

    public final boolean compareAndSetForkJoinTaskTag(short s, short s2) {
        int i;
        do {
            i = this.status;
            if (((short) i) != s) {
                return false;
            }
        } while (!f18779U.compareAndSwapInt(this, STATUS, i, (65535 & s2) | (-65536 & i)));
        return true;
    }

    public void complete(V v) {
        try {
            setRawResult(v);
            setCompletion(-268435456);
        } catch (Throwable th) {
            setExceptionalCompletion(th);
        }
    }

    public void completeExceptionally(Throwable th) {
        if (!(th instanceof RuntimeException) && !(th instanceof Error)) {
            th = new RuntimeException(th);
        }
        setExceptionalCompletion(th);
    }

    public final int doExec() {
        int i = this.status;
        if (i < 0) {
            return i;
        }
        try {
            if (exec()) {
                return setCompletion(-268435456);
            }
            return i;
        } catch (Throwable th) {
            return setExceptionalCompletion(th);
        }
    }

    public abstract boolean exec();

    public final ForkJoinTask<V> fork() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C9356c) {
            ((C9356c) currentThread).f18362l.mo47260k(this);
        } else {
            C9346b.f18326x.mo47227j(this);
        }
        return this;
    }

    public final V get() {
        int doJoin = (Thread.currentThread() instanceof C9356c ? doJoin() : externalInterruptibleAwaitDone()) & -268435456;
        if (doJoin == -1073741824) {
            throw new CancellationException();
        } else if (doJoin != Integer.MIN_VALUE) {
            return getRawResult();
        } else {
            throw new ExecutionException(getThrowableException());
        }
    }

    public final Throwable getException() {
        int i = this.status & -268435456;
        if (i >= -268435456) {
            return null;
        }
        if (i == -1073741824) {
            return new CancellationException();
        }
        return getThrowableException();
    }

    public final short getForkJoinTaskTag() {
        return (short) this.status;
    }

    public abstract V getRawResult();

    public void internalPropagateException(Throwable th) {
    }

    public final void internalWait(long j) {
        int i = this.status;
        if (i >= 0) {
            if (f18779U.compareAndSwapInt(this, STATUS, i, i | 65536)) {
                synchronized (this) {
                    if (this.status >= 0) {
                        try {
                            wait(j);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        notifyAll();
                    }
                }
            }
        }
    }

    public final V invoke() {
        int doInvoke = doInvoke() & -268435456;
        if (doInvoke != -268435456) {
            reportException(doInvoke);
        }
        return getRawResult();
    }

    public final boolean isCancelled() {
        return (this.status & -268435456) == -1073741824;
    }

    public final boolean isCompletedAbnormally() {
        return this.status < -268435456;
    }

    public final boolean isCompletedNormally() {
        return (this.status & -268435456) == -268435456;
    }

    public final boolean isDone() {
        return this.status < 0;
    }

    public final V join() {
        int doJoin = doJoin() & -268435456;
        if (doJoin != -268435456) {
            reportException(doJoin);
        }
        return getRawResult();
    }

    public final void quietlyComplete() {
        setCompletion(-268435456);
    }

    public final void quietlyInvoke() {
        doInvoke();
    }

    public final void quietlyJoin() {
        doJoin();
    }

    /* JADX INFO: finally extract failed */
    public final int recordExceptionalCompletion(Throwable th) {
        int i = this.status;
        if (i < 0) {
            return i;
        }
        int identityHashCode = System.identityHashCode(this);
        ReentrantLock reentrantLock = exceptionTableLock;
        reentrantLock.lock();
        try {
            expungeStaleExceptions();
            C9482d[] dVarArr = exceptionTable;
            int length = identityHashCode & (dVarArr.length - 1);
            C9482d dVar = dVarArr[length];
            while (true) {
                if (dVar == null) {
                    dVarArr[length] = new C9482d(this, th, dVarArr[length], exceptionTableRefQueue);
                    break;
                } else if (dVar.get() == this) {
                    break;
                } else {
                    dVar = dVar.f18786b;
                }
            }
            reentrantLock.unlock();
            return setCompletion(Integer.MIN_VALUE);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void reinitialize() {
        if ((this.status & -268435456) == Integer.MIN_VALUE) {
            clearExceptionalCompletion();
        } else {
            this.status = 0;
        }
    }

    public final short setForkJoinTaskTag(short s) {
        Unsafe unsafe;
        long j;
        int i;
        do {
            unsafe = f18779U;
            j = STATUS;
            i = this.status;
        } while (!unsafe.compareAndSwapInt(this, j, i, (-65536 & i) | (65535 & s)));
        return (short) i;
    }

    public abstract void setRawResult(V v);

    public boolean tryUnfork() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C9356c) {
            return ((C9356c) currentThread).f18362l.mo47266q(this);
        }
        return C9346b.f18326x.mo47215J(this);
    }

    public static <T> ForkJoinTask<T> adapt(Runnable runnable, T t) {
        return new C9480b(runnable, t);
    }

    public static <T> ForkJoinTask<T> adapt(Callable<? extends T> callable) {
        return new C9479a(callable);
    }

    public static void invokeAll(ForkJoinTask<?>... forkJoinTaskArr) {
        int length = forkJoinTaskArr.length - 1;
        Throwable th = null;
        for (int i = length; i >= 0; i--) {
            ForkJoinTask<?> forkJoinTask = forkJoinTaskArr[i];
            if (forkJoinTask == null) {
                if (th == null) {
                    th = new NullPointerException();
                }
            } else if (i != 0) {
                forkJoinTask.fork();
            } else if (forkJoinTask.doInvoke() < -268435456 && th == null) {
                th = forkJoinTask.getException();
            }
        }
        for (int i2 = 1; i2 <= length; i2++) {
            ForkJoinTask<?> forkJoinTask2 = forkJoinTaskArr[i2];
            if (forkJoinTask2 != null) {
                if (th != null) {
                    forkJoinTask2.cancel(false);
                } else if (forkJoinTask2.doJoin() < -268435456) {
                    th = forkJoinTask2.getException();
                }
            }
        }
        if (th != null) {
            rethrow(th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052 A[LOOP:0: B:21:0x0052->B:59:0x0052, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(long r11, java.util.concurrent.TimeUnit r13) {
        /*
            r10 = this;
            long r11 = r13.toNanos(r11)
            boolean r13 = java.lang.Thread.interrupted()
            if (r13 != 0) goto L_0x00b8
            int r13 = r10.status
            if (r13 < 0) goto L_0x008b
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x008b
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 + r11
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x001f
            r2 = 1
        L_0x001f:
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            boolean r12 = r11 instanceof p620g.p621a.p622d.C9356c
            if (r12 == 0) goto L_0x0032
            g.a.d.c r11 = (p620g.p621a.p622d.C9356c) r11
            g.a.d.b r12 = r11.f18361e
            g.a.d.b$g r11 = r11.f18362l
            int r13 = r12.mo47217a(r11, r10, r2)
            goto L_0x008b
        L_0x0032:
            boolean r11 = r10 instanceof java9.util.concurrent.CountedCompleter
            r12 = 0
            if (r11 == 0) goto L_0x0042
            g.a.d.b r11 = p620g.p621a.p622d.C9346b.f18326x
            r13 = r10
            java9.util.concurrent.CountedCompleter r13 = (java9.util.concurrent.CountedCompleter) r13
            int r11 = r11.mo47223i(r13, r12)
        L_0x0040:
            r13 = r11
            goto L_0x0050
        L_0x0042:
            g.a.d.b r11 = p620g.p621a.p622d.C9346b.f18326x
            boolean r11 = r11.mo47215J(r10)
            if (r11 == 0) goto L_0x004f
            int r11 = r10.doExec()
            goto L_0x0040
        L_0x004f:
            r13 = r12
        L_0x0050:
            if (r13 < 0) goto L_0x008b
        L_0x0052:
            int r8 = r10.status
            if (r8 < 0) goto L_0x008a
            long r11 = java.lang.System.nanoTime()
            long r11 = r2 - r11
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x008a
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r11 = r13.toMillis(r11)
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x0052
            sun.misc.Unsafe r4 = f18779U
            long r6 = STATUS
            r13 = 65536(0x10000, float:9.18355E-41)
            r9 = r8 | r13
            r5 = r10
            boolean r13 = r4.compareAndSwapInt(r5, r6, r8, r9)
            if (r13 == 0) goto L_0x0052
            monitor-enter(r10)
            int r13 = r10.status     // Catch:{ all -> 0x0087 }
            if (r13 < 0) goto L_0x0082
            r10.wait(r11)     // Catch:{ all -> 0x0087 }
            goto L_0x0085
        L_0x0082:
            r10.notifyAll()     // Catch:{ all -> 0x0087 }
        L_0x0085:
            monitor-exit(r10)     // Catch:{ all -> 0x0087 }
            goto L_0x0052
        L_0x0087:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0087 }
            throw r11
        L_0x008a:
            r13 = r8
        L_0x008b:
            if (r13 < 0) goto L_0x008f
            int r13 = r10.status
        L_0x008f:
            r11 = -268435456(0xfffffffff0000000, float:-1.58456325E29)
            r12 = r13 & r11
            if (r12 == r11) goto L_0x00b3
            r11 = -1073741824(0xffffffffc0000000, float:-2.0)
            if (r12 == r11) goto L_0x00ad
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r11) goto L_0x00a3
            java.util.concurrent.TimeoutException r11 = new java.util.concurrent.TimeoutException
            r11.<init>()
            throw r11
        L_0x00a3:
            java.util.concurrent.ExecutionException r11 = new java.util.concurrent.ExecutionException
            java.lang.Throwable r12 = r10.getThrowableException()
            r11.<init>(r12)
            throw r11
        L_0x00ad:
            java.util.concurrent.CancellationException r11 = new java.util.concurrent.CancellationException
            r11.<init>()
            throw r11
        L_0x00b3:
            java.lang.Object r11 = r10.getRawResult()
            return r11
        L_0x00b8:
            java.lang.InterruptedException r11 = new java.lang.InterruptedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: java9.util.concurrent.ForkJoinTask.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public static <T extends ForkJoinTask<?>> Collection<T> invokeAll(Collection<T> collection) {
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            invokeAll((ForkJoinTask<?>[]) (ForkJoinTask[]) collection.toArray(new ForkJoinTask[0]));
            return collection;
        }
        List list = (List) collection;
        Throwable th = null;
        int size = list.size() - 1;
        for (int i = size; i >= 0; i--) {
            ForkJoinTask forkJoinTask = (ForkJoinTask) list.get(i);
            if (forkJoinTask == null) {
                if (th == null) {
                    th = new NullPointerException();
                }
            } else if (i != 0) {
                forkJoinTask.fork();
            } else if (forkJoinTask.doInvoke() < -268435456 && th == null) {
                th = forkJoinTask.getException();
            }
        }
        for (int i2 = 1; i2 <= size; i2++) {
            ForkJoinTask forkJoinTask2 = (ForkJoinTask) list.get(i2);
            if (forkJoinTask2 != null) {
                if (th != null) {
                    forkJoinTask2.cancel(false);
                } else if (forkJoinTask2.doJoin() < -268435456) {
                    th = forkJoinTask2.getException();
                }
            }
        }
        if (th != null) {
            rethrow(th);
        }
        return collection;
    }
}
