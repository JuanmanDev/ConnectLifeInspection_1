package p040c.p200q.p363c.p370n.p371h.p374j;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p040c.p200q.p201a.p264c.p347m.C5757c;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5777m;

/* renamed from: c.q.c.n.h.j.o */
/* compiled from: CrashlyticsBackgroundWorker */
public class C6515o {

    /* renamed from: a */
    public final Executor f12247a;

    /* renamed from: b */
    public C5771j<Void> f12248b = C5777m.m16414f(null);

    /* renamed from: c */
    public final Object f12249c = new Object();

    /* renamed from: d */
    public final ThreadLocal<Boolean> f12250d = new ThreadLocal<>();

    /* renamed from: c.q.c.n.h.j.o$a */
    /* compiled from: CrashlyticsBackgroundWorker */
    public class C6516a implements Runnable {
        public C6516a() {
        }

        public void run() {
            C6515o.this.f12250d.set(Boolean.TRUE);
        }
    }

    /* renamed from: c.q.c.n.h.j.o$b */
    /* compiled from: CrashlyticsBackgroundWorker */
    public class C6517b implements Callable<Void> {

        /* renamed from: e */
        public final /* synthetic */ Runnable f12252e;

        public C6517b(C6515o oVar, Runnable runnable) {
            this.f12252e = runnable;
        }

        /* renamed from: a */
        public Void call() {
            this.f12252e.run();
            return null;
        }
    }

    /* renamed from: c.q.c.n.h.j.o$c */
    /* compiled from: CrashlyticsBackgroundWorker */
    public class C6518c implements C5757c<Void, T> {

        /* renamed from: a */
        public final /* synthetic */ Callable f12253a;

        public C6518c(C6515o oVar, Callable callable) {
            this.f12253a = callable;
        }

        /* renamed from: a */
        public T mo20377a(@NonNull C5771j<Void> jVar) {
            return this.f12253a.call();
        }
    }

    /* renamed from: c.q.c.n.h.j.o$d */
    /* compiled from: CrashlyticsBackgroundWorker */
    public class C6519d implements C5757c<T, Void> {
        public C6519d(C6515o oVar) {
        }

        /* renamed from: b */
        public Void mo20377a(@NonNull C5771j<T> jVar) {
            return null;
        }
    }

    public C6515o(Executor executor) {
        this.f12247a = executor;
        executor.execute(new C6516a());
    }

    /* renamed from: b */
    public void mo30698b() {
        if (!mo30701e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor mo30699c() {
        return this.f12247a;
    }

    /* renamed from: d */
    public final <T> C5771j<Void> mo30700d(C5771j<T> jVar) {
        return jVar.mo28849j(this.f12247a, new C6519d(this));
    }

    /* renamed from: e */
    public final boolean mo30701e() {
        return Boolean.TRUE.equals(this.f12250d.get());
    }

    /* renamed from: f */
    public final <T> C5757c<Void, T> mo30702f(Callable<T> callable) {
        return new C6518c(this, callable);
    }

    /* renamed from: g */
    public C5771j<Void> mo30703g(Runnable runnable) {
        return mo30704h(new C6517b(this, runnable));
    }

    /* renamed from: h */
    public <T> C5771j<T> mo30704h(Callable<T> callable) {
        C5771j<TContinuationResult> j;
        synchronized (this.f12249c) {
            j = this.f12248b.mo28849j(this.f12247a, mo30702f(callable));
            this.f12248b = mo30700d(j);
        }
        return j;
    }

    /* renamed from: i */
    public <T> C5771j<T> mo30705i(Callable<C5771j<T>> callable) {
        C5771j<TContinuationResult> k;
        synchronized (this.f12249c) {
            k = this.f12248b.mo28850k(this.f12247a, mo30702f(callable));
            this.f12248b = mo30700d(k);
        }
        return k;
    }
}
