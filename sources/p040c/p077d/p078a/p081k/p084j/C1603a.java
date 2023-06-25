package p040c.p077d.p078a.p081k.p084j;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.p084j.C1678p;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.j.a */
/* compiled from: ActiveResources */
public final class C1603a {

    /* renamed from: a */
    public final boolean f962a;
    @VisibleForTesting

    /* renamed from: b */
    public final Map<C1567c, C1608d> f963b;

    /* renamed from: c */
    public final ReferenceQueue<C1678p<?>> f964c;

    /* renamed from: d */
    public C1678p.C1679a f965d;

    /* renamed from: e */
    public volatile boolean f966e;
    @Nullable

    /* renamed from: f */
    public volatile C1607c f967f;

    /* renamed from: c.d.a.k.j.a$a */
    /* compiled from: ActiveResources */
    public class C1604a implements ThreadFactory {

        /* renamed from: c.d.a.k.j.a$a$a */
        /* compiled from: ActiveResources */
        public class C1605a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ Runnable f968e;

            public C1605a(C1604a aVar, Runnable runnable) {
                this.f968e = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f968e.run();
            }
        }

        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new C1605a(this, runnable), "glide-active-resources");
        }
    }

    /* renamed from: c.d.a.k.j.a$b */
    /* compiled from: ActiveResources */
    public class C1606b implements Runnable {
        public C1606b() {
        }

        public void run() {
            C1603a.this.mo15682b();
        }
    }

    @VisibleForTesting
    /* renamed from: c.d.a.k.j.a$c */
    /* compiled from: ActiveResources */
    public interface C1607c {
        /* renamed from: a */
        void mo15690a();
    }

    @VisibleForTesting
    /* renamed from: c.d.a.k.j.a$d */
    /* compiled from: ActiveResources */
    public static final class C1608d extends WeakReference<C1678p<?>> {

        /* renamed from: a */
        public final C1567c f970a;

        /* renamed from: b */
        public final boolean f971b;
        @Nullable

        /* renamed from: c */
        public C1685u<?> f972c;

        public C1608d(@NonNull C1567c cVar, @NonNull C1678p<?> pVar, @NonNull ReferenceQueue<? super C1678p<?>> referenceQueue, boolean z) {
            super(pVar, referenceQueue);
            C1685u<?> uVar;
            C1949i.m2563d(cVar);
            this.f970a = cVar;
            if (!pVar.mo15870f() || !z) {
                uVar = null;
            } else {
                C1685u<?> b = pVar.mo15866b();
                C1949i.m2563d(b);
                uVar = b;
            }
            this.f972c = uVar;
            this.f971b = pVar.mo15870f();
        }

        /* renamed from: a */
        public void mo15691a() {
            this.f972c = null;
            clear();
        }
    }

    public C1603a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new C1604a()));
    }

    /* renamed from: a */
    public synchronized void mo15681a(C1567c cVar, C1678p<?> pVar) {
        C1608d put = this.f963b.put(cVar, new C1608d(cVar, pVar, this.f964c, this.f962a));
        if (put != null) {
            put.mo15691a();
        }
    }

    /* renamed from: b */
    public void mo15682b() {
        while (!this.f966e) {
            try {
                mo15683c((C1608d) this.f964c.remove());
                C1607c cVar = this.f967f;
                if (cVar != null) {
                    cVar.mo15690a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    public void mo15683c(@NonNull C1608d dVar) {
        synchronized (this.f965d) {
            synchronized (this) {
                this.f963b.remove(dVar.f970a);
                if (dVar.f971b) {
                    if (dVar.f972c != null) {
                        C1678p pVar = new C1678p(dVar.f972c, true, false);
                        pVar.mo15873h(dVar.f970a, this.f965d);
                        this.f965d.mo15824d(dVar.f970a, pVar);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public synchronized void mo15684d(C1567c cVar) {
        C1608d remove = this.f963b.remove(cVar);
        if (remove != null) {
            remove.mo15691a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    @androidx.annotation.Nullable
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p040c.p077d.p078a.p081k.p084j.C1678p<?> mo15685e(p040c.p077d.p078a.p081k.C1567c r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<c.d.a.k.c, c.d.a.k.j.a$d> r0 = r1.f963b     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            c.d.a.k.j.a$d r2 = (p040c.p077d.p078a.p081k.p084j.C1603a.C1608d) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            c.d.a.k.j.p r0 = (p040c.p077d.p078a.p081k.p084j.C1678p) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.mo15683c(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p081k.p084j.C1603a.mo15685e(c.d.a.k.c):c.d.a.k.j.p");
    }

    /* renamed from: f */
    public void mo15686f(C1678p.C1679a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f965d = aVar;
            }
        }
    }

    @VisibleForTesting
    public C1603a(boolean z, Executor executor) {
        this.f963b = new HashMap();
        this.f964c = new ReferenceQueue<>();
        this.f962a = z;
        executor.execute(new C1606b());
    }
}
