package p620g.p621a.p622d;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java9.util.concurrent.CompletionException;
import java9.util.concurrent.ForkJoinTask;
import p040c.p077d.p078a.p080j.C1564e;
import p040c.p200q.p201a.p264c.p294g.p333g.C4569l;
import p620g.p621a.p622d.C9346b;
import sun.misc.Unsafe;

/* renamed from: g.a.d.a */
/* compiled from: CompletableFuture */
public class C9340a<T> implements Future<T> {

    /* renamed from: m */
    public static final C9341a f18301m = new C9341a((Throwable) null);

    /* renamed from: n */
    public static final boolean f18302n;

    /* renamed from: o */
    public static final Executor f18303o;

    /* renamed from: p */
    public static final Unsafe f18304p;

    /* renamed from: q */
    public static final long f18305q;

    /* renamed from: r */
    public static final long f18306r;

    /* renamed from: s */
    public static final long f18307s;

    /* renamed from: e */
    public volatile Object f18308e;

    /* renamed from: l */
    public volatile C9343c f18309l;

    /* renamed from: g.a.d.a$a */
    /* compiled from: CompletableFuture */
    public static final class C9341a {

        /* renamed from: a */
        public final Throwable f18310a;

        public C9341a(Throwable th) {
            this.f18310a = th;
        }
    }

    /* renamed from: g.a.d.a$b */
    /* compiled from: CompletableFuture */
    public interface C9342b {
    }

    /* renamed from: g.a.d.a$c */
    /* compiled from: CompletableFuture */
    public static abstract class C9343c extends ForkJoinTask<Void> implements Runnable, C9342b {

        /* renamed from: e */
        public volatile C9343c f18311e;

        /* renamed from: c */
        public abstract boolean mo47197c();

        /* renamed from: d */
        public abstract C9340a<?> mo47198d(int i);

        public final boolean exec() {
            mo47198d(1);
            return false;
        }

        public final Void getRawResult() {
            return null;
        }

        public final void run() {
            mo47198d(1);
        }

        public final void setRawResult(Void voidR) {
        }
    }

    /* renamed from: g.a.d.a$d */
    /* compiled from: CompletableFuture */
    public static final class C9344d extends C9343c implements C9346b.C9353e {

        /* renamed from: l */
        public long f18312l;

        /* renamed from: m */
        public final long f18313m;

        /* renamed from: n */
        public final boolean f18314n;

        /* renamed from: o */
        public boolean f18315o;

        /* renamed from: p */
        public volatile Thread f18316p = Thread.currentThread();

        public C9344d(boolean z, long j, long j2) {
            this.f18314n = z;
            this.f18312l = j;
            this.f18313m = j2;
        }

        /* renamed from: a */
        public boolean mo47204a() {
            while (!mo47205b()) {
                if (this.f18313m == 0) {
                    LockSupport.park(this);
                } else {
                    LockSupport.parkNanos(this, this.f18312l);
                }
            }
            return true;
        }

        /* renamed from: b */
        public boolean mo47205b() {
            if (Thread.interrupted()) {
                this.f18315o = true;
            }
            if (this.f18315o && this.f18314n) {
                return true;
            }
            long j = this.f18313m;
            if (j != 0) {
                if (this.f18312l <= 0) {
                    return true;
                }
                long nanoTime = j - System.nanoTime();
                this.f18312l = nanoTime;
                if (nanoTime <= 0) {
                    return true;
                }
            }
            if (this.f18316p == null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final boolean mo47197c() {
            return this.f18316p != null;
        }

        /* renamed from: d */
        public final C9340a<?> mo47198d(int i) {
            Thread thread = this.f18316p;
            if (thread != null) {
                this.f18316p = null;
                LockSupport.unpark(thread);
            }
            return null;
        }
    }

    /* renamed from: g.a.d.a$e */
    /* compiled from: CompletableFuture */
    public static final class C9345e implements Executor {
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    static {
        boolean z = true;
        if (C9346b.m25214n() <= 1) {
            z = false;
        }
        f18302n = z;
        f18303o = z ? C9346b.m25209d() : new C9345e();
        Unsafe unsafe = C9364f.f18379a;
        f18304p = unsafe;
        try {
            f18305q = unsafe.objectFieldOffset(C9340a.class.getDeclaredField(C1564e.f893u));
            f18306r = f18304p.objectFieldOffset(C9340a.class.getDeclaredField(C4569l.f9345A));
            f18307s = f18304p.objectFieldOffset(C9343c.class.getDeclaredField(C1564e.f893u));
            Class<LockSupport> cls = LockSupport.class;
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static boolean m25187a(C9343c cVar, C9343c cVar2, C9343c cVar3) {
        return f18304p.compareAndSwapObject(cVar, f18307s, cVar2, cVar3);
    }

    /* renamed from: h */
    public static void m25188h(C9343c cVar, C9343c cVar2) {
        f18304p.putOrderedObject(cVar, f18307s, cVar2);
    }

    /* renamed from: k */
    public static Object m25189k(Object obj) {
        Throwable cause;
        if (obj == null) {
            throw new InterruptedException();
        } else if (!(obj instanceof C9341a)) {
            return obj;
        } else {
            Throwable th = ((C9341a) obj).f18310a;
            if (th == null) {
                return null;
            }
            if (!(th instanceof CancellationException)) {
                if ((th instanceof CompletionException) && (cause = th.getCause()) != null) {
                    th = cause;
                }
                throw new ExecutionException(th);
            }
            throw ((CancellationException) th);
        }
    }

    /* renamed from: b */
    public final boolean mo47180b(C9343c cVar, C9343c cVar2) {
        return f18304p.compareAndSwapObject(this, f18306r, cVar, cVar2);
    }

    /* renamed from: c */
    public final void mo47181c() {
        C9343c cVar;
        boolean z = false;
        while (true) {
            cVar = this.f18309l;
            if (cVar != null && !cVar.mo47197c()) {
                z = mo47180b(cVar, cVar.f18311e);
            } else if (cVar != null && !z) {
                C9343c cVar2 = cVar;
                C9343c cVar3 = cVar.f18311e;
                C9343c cVar4 = cVar2;
                while (cVar3 != null) {
                    C9343c cVar5 = cVar3.f18311e;
                    if (cVar3.mo47197c()) {
                        cVar4 = cVar3;
                        cVar3 = cVar5;
                    } else {
                        m25187a(cVar4, cVar3, cVar5);
                        return;
                    }
                }
                return;
            }
        }
        if (cVar != null) {
        }
    }

    public boolean cancel(boolean z) {
        boolean z2 = this.f18308e == null && mo47186g(new C9341a(new CancellationException()));
        mo47189i();
        if (z2 || isCancelled()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo47183d(T t) {
        boolean e = mo47184e(t);
        mo47189i();
        return e;
    }

    /* renamed from: e */
    public final boolean mo47184e(T t) {
        Unsafe unsafe = f18304p;
        long j = f18305q;
        if (t == null) {
            t = f18301m;
        }
        return unsafe.compareAndSwapObject(this, j, (Object) null, t);
    }

    /* renamed from: f */
    public Executor mo47185f() {
        return f18303o;
    }

    /* renamed from: g */
    public final boolean mo47186g(Object obj) {
        return f18304p.compareAndSwapObject(this, f18305q, (Object) null, obj);
    }

    public T get() {
        Object obj = this.f18308e;
        if (obj == null) {
            obj = mo47195n(true);
        }
        return m25189k(obj);
    }

    /* renamed from: i */
    public final void mo47189i() {
        while (true) {
            C9340a aVar = this;
            while (true) {
                C9343c cVar = aVar.f18309l;
                if (cVar == null) {
                    if (aVar != this && (cVar = this.f18309l) != null) {
                        aVar = this;
                    } else {
                        return;
                    }
                }
                C9343c cVar2 = cVar.f18311e;
                if (aVar.mo47180b(cVar, cVar2)) {
                    if (cVar2 != null) {
                        if (aVar != this) {
                            mo47192j(cVar);
                        } else {
                            m25187a(cVar, cVar2, (C9343c) null);
                        }
                    }
                    aVar = cVar.mo47198d(-1);
                    if (aVar == null) {
                    }
                }
            }
        }
    }

    public boolean isCancelled() {
        Object obj = this.f18308e;
        return (obj instanceof C9341a) && (((C9341a) obj).f18310a instanceof CancellationException);
    }

    public boolean isDone() {
        return this.f18308e != null;
    }

    /* renamed from: j */
    public final void mo47192j(C9343c cVar) {
        do {
        } while (!mo47194m(cVar));
    }

    /* renamed from: l */
    public final Object mo47193l(long j) {
        Object obj;
        if (Thread.interrupted()) {
            return null;
        }
        if (j > 0) {
            long nanoTime = System.nanoTime() + j;
            if (nanoTime == 0) {
                nanoTime = 1;
            }
            boolean z = false;
            C9344d dVar = null;
            while (true) {
                obj = this.f18308e;
                if (obj != null) {
                    break;
                } else if (dVar == null) {
                    C9344d dVar2 = new C9344d(true, j, nanoTime);
                    if (Thread.currentThread() instanceof C9356c) {
                        C9346b.m25216p(mo47185f(), dVar2);
                    }
                    dVar = dVar2;
                } else if (!z) {
                    z = mo47194m(dVar);
                } else if (dVar.f18312l <= 0) {
                    break;
                } else {
                    try {
                        C9346b.m25218u(dVar);
                    } catch (InterruptedException unused) {
                        dVar.f18315o = true;
                    }
                    if (dVar.f18315o) {
                        break;
                    }
                }
            }
            if (dVar != null && z) {
                dVar.f18316p = null;
                if (obj == null) {
                    mo47181c();
                }
            }
            if (!(obj == null && (obj = this.f18308e) == null)) {
                mo47189i();
            }
            if (obj != null || (dVar != null && dVar.f18315o)) {
                return obj;
            }
        }
        throw new TimeoutException();
    }

    /* renamed from: m */
    public final boolean mo47194m(C9343c cVar) {
        C9343c cVar2 = this.f18309l;
        m25188h(cVar, cVar2);
        return f18304p.compareAndSwapObject(this, f18306r, cVar2, cVar);
    }

    /* renamed from: n */
    public final Object mo47195n(boolean z) {
        Object obj;
        boolean z2 = false;
        C9344d dVar = null;
        while (true) {
            obj = this.f18308e;
            if (obj == null) {
                if (dVar != null) {
                    if (z2) {
                        try {
                            C9346b.m25218u(dVar);
                        } catch (InterruptedException unused) {
                            dVar.f18315o = true;
                        }
                        if (dVar.f18315o && z) {
                            break;
                        }
                    } else {
                        z2 = mo47194m(dVar);
                    }
                } else {
                    dVar = new C9344d(z, 0, 0);
                    if (Thread.currentThread() instanceof C9356c) {
                        C9346b.m25216p(mo47185f(), dVar);
                    }
                }
            } else {
                break;
            }
        }
        if (dVar != null && z2) {
            dVar.f18316p = null;
            if (!z && dVar.f18315o) {
                Thread.currentThread().interrupt();
            }
            if (obj == null) {
                mo47181c();
            }
        }
        if (!(obj == null && (obj = this.f18308e) == null)) {
            mo47189i();
        }
        return obj;
    }

    public String toString() {
        String str;
        Object obj = this.f18308e;
        int i = 0;
        for (C9343c cVar = this.f18309l; cVar != null; cVar = cVar.f18311e) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (obj != null) {
            if (obj instanceof C9341a) {
                C9341a aVar = (C9341a) obj;
                if (aVar.f18310a != null) {
                    str = "[Completed exceptionally: " + aVar.f18310a + "]";
                }
            }
            str = "[Completed normally]";
        } else if (i == 0) {
            str = "[Not completed]";
        } else {
            str = "[Not completed, " + i + " dependents]";
        }
        sb.append(str);
        return sb.toString();
    }

    public T get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        Object obj = this.f18308e;
        if (obj == null) {
            obj = mo47193l(nanos);
        }
        return m25189k(obj);
    }
}
