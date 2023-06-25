package p648m.p660d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p648m.p660d.p667l.C9684d;
import p648m.p684g.C9805b;
import p648m.p684g.C9806c;

/* renamed from: m.d.a */
/* compiled from: AbstractWebSocket */
public abstract class C9643a extends C9646c {

    /* renamed from: l */
    public final C9805b f18874l = C9806c.m26345i(C9643a.class);

    /* renamed from: m */
    public boolean f18875m;

    /* renamed from: n */
    public boolean f18876n;

    /* renamed from: o */
    public ScheduledExecutorService f18877o;

    /* renamed from: p */
    public ScheduledFuture<?> f18878p;

    /* renamed from: q */
    public long f18879q = TimeUnit.SECONDS.toNanos(60);

    /* renamed from: r */
    public final Object f18880r = new Object();

    /* renamed from: m.d.a$a */
    /* compiled from: AbstractWebSocket */
    public class C9644a implements Runnable {

        /* renamed from: e */
        public ArrayList<C9645b> f18881e = new ArrayList<>();

        public C9644a() {
        }

        public void run() {
            long nanoTime;
            this.f18881e.clear();
            try {
                this.f18881e.addAll(C9643a.this.mo50336u());
                synchronized (C9643a.this.f18880r) {
                    nanoTime = (long) (((double) System.nanoTime()) - (((double) C9643a.this.f18879q) * 1.5d));
                }
                Iterator<C9645b> it = this.f18881e.iterator();
                while (it.hasNext()) {
                    C9643a.this.mo50335t(it.next(), nanoTime);
                }
            } catch (Exception unused) {
            }
            this.f18881e.clear();
        }
    }

    /* renamed from: A */
    public void mo50332A() {
        synchronized (this.f18880r) {
            if (this.f18879q <= 0) {
                this.f18874l.trace("Connection lost timer deactivated");
                return;
            }
            this.f18874l.trace("Connection lost timer started");
            mo50339x();
        }
    }

    /* renamed from: B */
    public void mo50333B() {
        synchronized (this.f18880r) {
            if (!(this.f18877o == null && this.f18878p == null)) {
                this.f18874l.trace("Connection lost timer stopped");
                mo50334s();
            }
        }
    }

    /* renamed from: s */
    public final void mo50334s() {
        ScheduledExecutorService scheduledExecutorService = this.f18877o;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f18877o = null;
        }
        ScheduledFuture<?> scheduledFuture = this.f18878p;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f18878p = null;
        }
    }

    /* renamed from: t */
    public final void mo50335t(C9645b bVar, long j) {
        if (bVar instanceof C9647d) {
            C9647d dVar = (C9647d) bVar;
            if (dVar.mo50368q() < j) {
                this.f18874l.trace("Closing connection due to no pong received: {}", (Object) dVar);
                dVar.mo50357f(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
            } else if (dVar.mo50374v()) {
                dVar.mo50377y();
            } else {
                this.f18874l.trace("Trying to ping a non open connection: {}", (Object) dVar);
            }
        }
    }

    /* renamed from: u */
    public abstract Collection<C9645b> mo50336u();

    /* renamed from: v */
    public boolean mo50337v() {
        return this.f18876n;
    }

    /* renamed from: w */
    public boolean mo50338w() {
        return this.f18875m;
    }

    /* renamed from: x */
    public final void mo50339x() {
        mo50334s();
        this.f18877o = Executors.newSingleThreadScheduledExecutor(new C9684d("connectionLostChecker"));
        C9644a aVar = new C9644a();
        ScheduledExecutorService scheduledExecutorService = this.f18877o;
        long j = this.f18879q;
        this.f18878p = scheduledExecutorService.scheduleAtFixedRate(aVar, j, j, TimeUnit.NANOSECONDS);
    }

    /* renamed from: y */
    public void mo50340y(boolean z) {
        this.f18876n = z;
    }

    /* renamed from: z */
    public void mo50341z(boolean z) {
        this.f18875m = z;
    }
}
