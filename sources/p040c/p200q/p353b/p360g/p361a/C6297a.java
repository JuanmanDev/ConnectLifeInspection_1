package p040c.p200q.p353b.p360g.p361a;

import androidx.test.internal.runner.RunnerArgs;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
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
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p360g.p361a.p362j.C6322a;
import p040c.p200q.p353b.p360g.p361a.p362j.C6323b;
import sun.misc.Unsafe;

/* renamed from: c.q.b.g.a.a */
/* compiled from: AbstractFuture */
public abstract class C6297a<V> extends C6322a implements C6316e<V> {

    /* renamed from: n */
    public static final boolean f11920n = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: o */
    public static final Logger f11921o = Logger.getLogger(C6297a.class.getName());

    /* renamed from: p */
    public static final C6299b f11922p;

    /* renamed from: q */
    public static final Object f11923q = new Object();

    /* renamed from: e */
    public volatile Object f11924e;

    /* renamed from: l */
    public volatile C6303e f11925l;

    /* renamed from: m */
    public volatile C6311l f11926m;

    /* renamed from: c.q.b.g.a.a$b */
    /* compiled from: AbstractFuture */
    public static abstract class C6299b {
        public C6299b() {
        }

        /* renamed from: a */
        public abstract boolean mo30372a(C6297a<?> aVar, C6303e eVar, C6303e eVar2);

        /* renamed from: b */
        public abstract boolean mo30373b(C6297a<?> aVar, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo30374c(C6297a<?> aVar, C6311l lVar, C6311l lVar2);

        /* renamed from: d */
        public abstract void mo30375d(C6311l lVar, C6311l lVar2);

        /* renamed from: e */
        public abstract void mo30376e(C6311l lVar, Thread thread);
    }

    /* renamed from: c.q.b.g.a.a$c */
    /* compiled from: AbstractFuture */
    public static final class C6300c {

        /* renamed from: c */
        public static final C6300c f11927c;

        /* renamed from: d */
        public static final C6300c f11928d;

        /* renamed from: a */
        public final boolean f11929a;

        /* renamed from: b */
        public final Throwable f11930b;

        static {
            if (C6297a.f11920n) {
                f11928d = null;
                f11927c = null;
                return;
            }
            f11928d = new C6300c(false, (Throwable) null);
            f11927c = new C6300c(true, (Throwable) null);
        }

        public C6300c(boolean z, Throwable th) {
            this.f11929a = z;
            this.f11930b = th;
        }
    }

    /* renamed from: c.q.b.g.a.a$d */
    /* compiled from: AbstractFuture */
    public static final class C6301d {

        /* renamed from: a */
        public final Throwable f11931a;

        /* renamed from: c.q.b.g.a.a$d$a */
        /* compiled from: AbstractFuture */
        public static class C6302a extends Throwable {
            public C6302a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new C6301d(new C6302a("Failure occurred while trying to finish a future."));
        }

        public C6301d(Throwable th) {
            C5850m.m16594o(th);
            this.f11931a = th;
        }
    }

    /* renamed from: c.q.b.g.a.a$e */
    /* compiled from: AbstractFuture */
    public static final class C6303e {

        /* renamed from: d */
        public static final C6303e f11932d = new C6303e((Runnable) null, (Executor) null);

        /* renamed from: a */
        public final Runnable f11933a;

        /* renamed from: b */
        public final Executor f11934b;

        /* renamed from: c */
        public C6303e f11935c;

        public C6303e(Runnable runnable, Executor executor) {
            this.f11933a = runnable;
            this.f11934b = executor;
        }
    }

    /* renamed from: c.q.b.g.a.a$f */
    /* compiled from: AbstractFuture */
    public static final class C6304f extends C6299b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C6311l, Thread> f11936a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C6311l, C6311l> f11937b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<C6297a, C6311l> f11938c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<C6297a, C6303e> f11939d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<C6297a, Object> f11940e;

        public C6304f(AtomicReferenceFieldUpdater<C6311l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C6311l, C6311l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C6297a, C6311l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C6297a, C6303e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C6297a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f11936a = atomicReferenceFieldUpdater;
            this.f11937b = atomicReferenceFieldUpdater2;
            this.f11938c = atomicReferenceFieldUpdater3;
            this.f11939d = atomicReferenceFieldUpdater4;
            this.f11940e = atomicReferenceFieldUpdater5;
        }

        /* renamed from: a */
        public boolean mo30372a(C6297a<?> aVar, C6303e eVar, C6303e eVar2) {
            return this.f11939d.compareAndSet(aVar, eVar, eVar2);
        }

        /* renamed from: b */
        public boolean mo30373b(C6297a<?> aVar, Object obj, Object obj2) {
            return this.f11940e.compareAndSet(aVar, obj, obj2);
        }

        /* renamed from: c */
        public boolean mo30374c(C6297a<?> aVar, C6311l lVar, C6311l lVar2) {
            return this.f11938c.compareAndSet(aVar, lVar, lVar2);
        }

        /* renamed from: d */
        public void mo30375d(C6311l lVar, C6311l lVar2) {
            this.f11937b.lazySet(lVar, lVar2);
        }

        /* renamed from: e */
        public void mo30376e(C6311l lVar, Thread thread) {
            this.f11936a.lazySet(lVar, thread);
        }
    }

    /* renamed from: c.q.b.g.a.a$g */
    /* compiled from: AbstractFuture */
    public static final class C6305g<V> implements Runnable {

        /* renamed from: e */
        public final C6297a<V> f11941e;

        /* renamed from: l */
        public final C6316e<? extends V> f11942l;

        public void run() {
            if (this.f11941e.f11924e == this) {
                if (C6297a.f11922p.mo30373b(this.f11941e, this, C6297a.m17723s(this.f11942l))) {
                    C6297a.m17721p(this.f11941e);
                }
            }
        }
    }

    /* renamed from: c.q.b.g.a.a$h */
    /* compiled from: AbstractFuture */
    public static final class C6306h extends C6299b {
        public C6306h() {
            super();
        }

        /* renamed from: a */
        public boolean mo30372a(C6297a<?> aVar, C6303e eVar, C6303e eVar2) {
            synchronized (aVar) {
                if (aVar.f11925l != eVar) {
                    return false;
                }
                C6303e unused = aVar.f11925l = eVar2;
                return true;
            }
        }

        /* renamed from: b */
        public boolean mo30373b(C6297a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f11924e != obj) {
                    return false;
                }
                Object unused = aVar.f11924e = obj2;
                return true;
            }
        }

        /* renamed from: c */
        public boolean mo30374c(C6297a<?> aVar, C6311l lVar, C6311l lVar2) {
            synchronized (aVar) {
                if (aVar.f11926m != lVar) {
                    return false;
                }
                C6311l unused = aVar.f11926m = lVar2;
                return true;
            }
        }

        /* renamed from: d */
        public void mo30375d(C6311l lVar, C6311l lVar2) {
            lVar.f11951b = lVar2;
        }

        /* renamed from: e */
        public void mo30376e(C6311l lVar, Thread thread) {
            lVar.f11950a = thread;
        }
    }

    /* renamed from: c.q.b.g.a.a$i */
    /* compiled from: AbstractFuture */
    public interface C6307i<V> extends C6316e<V> {
    }

    /* renamed from: c.q.b.g.a.a$j */
    /* compiled from: AbstractFuture */
    public static abstract class C6308j<V> extends C6297a<V> implements C6307i<V> {
        public final void addListener(Runnable runnable, Executor executor) {
            C6297a.super.addListener(runnable, executor);
        }

        public final boolean cancel(boolean z) {
            return C6297a.super.cancel(z);
        }

        public final V get() {
            return C6297a.super.get();
        }

        public final boolean isCancelled() {
            return C6297a.super.isCancelled();
        }

        public final boolean isDone() {
            return C6297a.super.isDone();
        }

        public final V get(long j, TimeUnit timeUnit) {
            return C6297a.super.get(j, timeUnit);
        }
    }

    /* renamed from: c.q.b.g.a.a$k */
    /* compiled from: AbstractFuture */
    public static final class C6309k extends C6299b {

        /* renamed from: a */
        public static final Unsafe f11943a;

        /* renamed from: b */
        public static final long f11944b;

        /* renamed from: c */
        public static final long f11945c;

        /* renamed from: d */
        public static final long f11946d;

        /* renamed from: e */
        public static final long f11947e;

        /* renamed from: f */
        public static final long f11948f;

        /* renamed from: c.q.b.g.a.a$k$a */
        /* compiled from: AbstractFuture */
        public static class C6310a implements PrivilegedExceptionAction<Unsafe> {
            /* renamed from: a */
            public Unsafe run() {
                Class<Unsafe> cls = Unsafe.class;
                for (Field field : cls.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get((Object) null);
                    if (cls.isInstance(obj)) {
                        return cls.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new p040c.p200q.p353b.p360g.p361a.C6297a.C6309k.C6310a());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<c.q.b.g.a.a$l> r0 = p040c.p200q.p353b.p360g.p361a.C6297a.C6311l.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                c.q.b.g.a.a$k$a r1 = new c.q.b.g.a.a$k$a     // Catch:{ PrivilegedActionException -> 0x005d }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005d }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005d }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005d }
            L_0x0012:
                java.lang.Class<c.q.b.g.a.a> r2 = p040c.p200q.p353b.p360g.p361a.C6297a.class
                java.lang.String r3 = "m"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f11945c = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "l"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f11944b = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "e"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f11946d = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "a"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f11947e = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "b"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
                f11948f = r2     // Catch:{ Exception -> 0x0053 }
                f11943a = r1     // Catch:{ Exception -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                p040c.p200q.p353b.p354a.C5866s.m16621e(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p353b.p360g.p361a.C6297a.C6309k.<clinit>():void");
        }

        public C6309k() {
            super();
        }

        /* renamed from: a */
        public boolean mo30372a(C6297a<?> aVar, C6303e eVar, C6303e eVar2) {
            return f11943a.compareAndSwapObject(aVar, f11944b, eVar, eVar2);
        }

        /* renamed from: b */
        public boolean mo30373b(C6297a<?> aVar, Object obj, Object obj2) {
            return f11943a.compareAndSwapObject(aVar, f11946d, obj, obj2);
        }

        /* renamed from: c */
        public boolean mo30374c(C6297a<?> aVar, C6311l lVar, C6311l lVar2) {
            return f11943a.compareAndSwapObject(aVar, f11945c, lVar, lVar2);
        }

        /* renamed from: d */
        public void mo30375d(C6311l lVar, C6311l lVar2) {
            f11943a.putObject(lVar, f11948f, lVar2);
        }

        /* renamed from: e */
        public void mo30376e(C6311l lVar, Thread thread) {
            f11943a.putObject(lVar, f11947e, thread);
        }
    }

    /* renamed from: c.q.b.g.a.a$l */
    /* compiled from: AbstractFuture */
    public static final class C6311l {

        /* renamed from: c */
        public static final C6311l f11949c = new C6311l(false);

        /* renamed from: a */
        public volatile Thread f11950a;

        /* renamed from: b */
        public volatile C6311l f11951b;

        public C6311l(boolean z) {
        }

        /* renamed from: a */
        public void mo30381a(C6311l lVar) {
            C6297a.f11922p.mo30375d(this, lVar);
        }

        /* renamed from: b */
        public void mo30382b() {
            Thread thread = this.f11950a;
            if (thread != null) {
                this.f11950a = null;
                LockSupport.unpark(thread);
            }
        }

        public C6311l() {
            C6297a.f11922p.mo30376e(this, Thread.currentThread());
        }
    }

    static {
        C6299b bVar;
        Class<C6311l> cls = C6311l.class;
        Throwable th = null;
        try {
            bVar = new C6309k();
            th = null;
        } catch (Throwable th2) {
            bVar = new C6306h();
            th = th2;
        }
        f11922p = bVar;
        Class<LockSupport> cls2 = LockSupport.class;
        if (th != null) {
            f11921o.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", th);
            f11921o.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    /* renamed from: n */
    public static CancellationException m17720n(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: p */
    public static void m17721p(C6297a<?> aVar) {
        C6303e eVar = null;
        C6297a<V> aVar2 = aVar;
        while (true) {
            aVar2.mo30368w();
            aVar2.mo30362m();
            C6303e o = aVar2.mo30363o(eVar);
            while (true) {
                if (o != null) {
                    eVar = o.f11935c;
                    Runnable runnable = o.f11933a;
                    if (runnable instanceof C6305g) {
                        C6305g gVar = (C6305g) runnable;
                        C6297a<V> aVar3 = gVar.f11941e;
                        if (aVar3.f11924e == gVar) {
                            if (f11922p.mo30373b(aVar3, gVar, m17723s(gVar.f11942l))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m17722q(runnable, o.f11934b);
                    }
                    o = eVar;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: q */
    public static void m17722q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f11921o;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: s */
    public static Object m17723s(C6316e<?> eVar) {
        Throwable a;
        if (eVar instanceof C6307i) {
            Object obj = ((C6297a) eVar).f11924e;
            if (!(obj instanceof C6300c)) {
                return obj;
            }
            C6300c cVar = (C6300c) obj;
            if (cVar.f11929a) {
                return cVar.f11930b != null ? new C6300c(false, cVar.f11930b) : C6300c.f11928d;
            }
            return obj;
        } else if ((eVar instanceof C6322a) && (a = C6323b.m17773a((C6322a) eVar)) != null) {
            return new C6301d(a);
        } else {
            boolean isCancelled = eVar.isCancelled();
            if ((!f11920n) && isCancelled) {
                return C6300c.f11928d;
            }
            try {
                Object t = m17724t(eVar);
                if (!isCancelled) {
                    return t == null ? f11923q : t;
                }
                return new C6300c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + eVar));
            } catch (ExecutionException e) {
                if (!isCancelled) {
                    return new C6301d(e.getCause());
                }
                return new C6300c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + eVar, e));
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new C6300c(false, e2);
                }
                return new C6301d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + eVar, e2));
            } catch (Throwable th) {
                return new C6301d(th);
            }
        }
    }

    /* renamed from: t */
    public static <V> V m17724t(Future<V> future) {
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

    /* renamed from: A */
    public final String mo30354A(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* renamed from: a */
    public final Throwable mo30355a() {
        if (!(this instanceof C6307i)) {
            return null;
        }
        Object obj = this.f11924e;
        if (obj instanceof C6301d) {
            return ((C6301d) obj).f11931a;
        }
        return null;
    }

    public void addListener(Runnable runnable, Executor executor) {
        C6303e eVar;
        C5850m.m16595p(runnable, "Runnable was null.");
        C5850m.m16595p(executor, "Executor was null.");
        if (isDone() || (eVar = this.f11925l) == C6303e.f11932d) {
            m17722q(runnable, executor);
        }
        C6303e eVar2 = new C6303e(runnable, executor);
        do {
            eVar2.f11935c = eVar;
            if (!f11922p.mo30372a(this, eVar, eVar2)) {
                eVar = this.f11925l;
            } else {
                return;
            }
        } while (eVar != C6303e.f11932d);
        m17722q(runnable, executor);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, c.q.b.g.a.e<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f11924e
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof p040c.p200q.p353b.p360g.p361a.C6297a.C6305g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f11920n
            if (r3 == 0) goto L_0x001f
            c.q.b.g.a.a$c r3 = new c.q.b.g.a.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            c.q.b.g.a.a$c r3 = p040c.p200q.p353b.p360g.p361a.C6297a.C6300c.f11927c
            goto L_0x0026
        L_0x0024:
            c.q.b.g.a.a$c r3 = p040c.p200q.p353b.p360g.p361a.C6297a.C6300c.f11928d
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            c.q.b.g.a.a$b r6 = f11922p
            boolean r6 = r6.mo30373b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.mo30366u()
        L_0x0035:
            m17721p(r4)
            boolean r4 = r0 instanceof p040c.p200q.p353b.p360g.p361a.C6297a.C6305g
            if (r4 == 0) goto L_0x0062
            c.q.b.g.a.a$g r0 = (p040c.p200q.p353b.p360g.p361a.C6297a.C6305g) r0
            c.q.b.g.a.e<? extends V> r0 = r0.f11942l
            boolean r4 = r0 instanceof p040c.p200q.p353b.p360g.p361a.C6297a.C6307i
            if (r4 == 0) goto L_0x0055
            r4 = r0
            c.q.b.g.a.a r4 = (p040c.p200q.p353b.p360g.p361a.C6297a) r4
            java.lang.Object r0 = r4.f11924e
            if (r0 != 0) goto L_0x004d
            r5 = r1
            goto L_0x004e
        L_0x004d:
            r5 = r2
        L_0x004e:
            boolean r6 = r0 instanceof p040c.p200q.p353b.p360g.p361a.C6297a.C6305g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = r1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f11924e
            boolean r6 = r0 instanceof p040c.p200q.p353b.p360g.p361a.C6297a.C6305g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p353b.p360g.p361a.C6297a.cancel(boolean):boolean");
    }

    public V get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f11924e;
            if ((obj != null) && (!(obj instanceof C6305g))) {
                return mo30364r(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C6311l lVar = this.f11926m;
                if (lVar != C6311l.f11949c) {
                    C6311l lVar2 = new C6311l();
                    do {
                        lVar2.mo30381a(lVar);
                        if (f11922p.mo30374c(this, lVar, lVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f11924e;
                                    if ((obj2 != null) && (!(obj2 instanceof C6305g))) {
                                        return mo30364r(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    mo30369x(lVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            mo30369x(lVar2);
                        } else {
                            lVar = this.f11926m;
                        }
                    } while (lVar != C6311l.f11949c);
                }
                return mo30364r(this.f11924e);
            }
            while (nanos > 0) {
                Object obj3 = this.f11924e;
                if ((obj3 != null) && (!(obj3 instanceof C6305g))) {
                    return mo30364r(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
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
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.f11924e instanceof C6300c;
    }

    public boolean isDone() {
        Object obj = this.f11924e;
        return (!(obj instanceof C6305g)) & (obj != null);
    }

    /* renamed from: l */
    public final void mo30361l(StringBuilder sb) {
        try {
            Object t = m17724t(this);
            sb.append("SUCCESS, result=[");
            sb.append(mo30354A(t));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: m */
    public void mo30362m() {
    }

    /* renamed from: o */
    public final C6303e mo30363o(C6303e eVar) {
        C6303e eVar2;
        do {
            eVar2 = this.f11925l;
        } while (!f11922p.mo30372a(this, eVar2, C6303e.f11932d));
        C6303e eVar3 = eVar2;
        C6303e eVar4 = eVar;
        C6303e eVar5 = eVar3;
        while (eVar5 != null) {
            C6303e eVar6 = eVar5.f11935c;
            eVar5.f11935c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    /* renamed from: r */
    public final V mo30364r(Object obj) {
        if (obj instanceof C6300c) {
            throw m17720n("Task was cancelled.", ((C6300c) obj).f11930b);
        } else if (obj instanceof C6301d) {
            throw new ExecutionException(((C6301d) obj).f11931a);
        } else if (obj == f11923q) {
            return null;
        } else {
            return obj;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            mo30361l(sb);
        } else {
            try {
                str = mo30367v();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                mo30361l(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo30366u() {
    }

    /* renamed from: v */
    public String mo30367v() {
        Object obj = this.f11924e;
        if (obj instanceof C6305g) {
            return "setFuture=[" + mo30354A(((C6305g) obj).f11942l) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* renamed from: w */
    public final void mo30368w() {
        C6311l lVar;
        do {
            lVar = this.f11926m;
        } while (!f11922p.mo30374c(this, lVar, C6311l.f11949c));
        while (lVar != null) {
            lVar.mo30382b();
            lVar = lVar.f11951b;
        }
    }

    /* renamed from: x */
    public final void mo30369x(C6311l lVar) {
        lVar.f11950a = null;
        while (true) {
            C6311l lVar2 = this.f11926m;
            if (lVar2 != C6311l.f11949c) {
                C6311l lVar3 = null;
                while (lVar2 != null) {
                    C6311l lVar4 = lVar2.f11951b;
                    if (lVar2.f11950a != null) {
                        lVar3 = lVar2;
                    } else if (lVar3 != null) {
                        lVar3.f11951b = lVar4;
                        if (lVar3.f11950a == null) {
                        }
                    } else if (!f11922p.mo30374c(this, lVar2, lVar4)) {
                    }
                    lVar2 = lVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: y */
    public boolean mo30370y(V v) {
        if (v == null) {
            v = f11923q;
        }
        if (!f11922p.mo30373b(this, (Object) null, v)) {
            return false;
        }
        m17721p(this);
        return true;
    }

    /* renamed from: z */
    public boolean mo30371z(Throwable th) {
        C5850m.m16594o(th);
        if (!f11922p.mo30373b(this, (Object) null, new C6301d(th))) {
            return false;
        }
        m17721p(this);
        return true;
    }

    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f11924e;
            if ((obj2 != null) && (!(obj2 instanceof C6305g))) {
                return mo30364r(obj2);
            }
            C6311l lVar = this.f11926m;
            if (lVar != C6311l.f11949c) {
                C6311l lVar2 = new C6311l();
                do {
                    lVar2.mo30381a(lVar);
                    if (f11922p.mo30374c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f11924e;
                            } else {
                                mo30369x(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C6305g))));
                        return mo30364r(obj);
                    }
                    lVar = this.f11926m;
                } while (lVar != C6311l.f11949c);
            }
            return mo30364r(this.f11924e);
        }
        throw new InterruptedException();
    }
}
