package p553f.p594c.p602s.p612g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.C9194k;
import p553f.p594c.p598o.C9206a;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p602s.p603a.C9221b;
import p630io.reactivex.internal.disposables.EmptyDisposable;
import p630io.reactivex.internal.schedulers.RxThreadFactory;

/* renamed from: f.c.s.g.b */
/* compiled from: ComputationScheduler */
public final class C9290b extends C9194k {

    /* renamed from: c */
    public static final C9292b f18189c;

    /* renamed from: d */
    public static final RxThreadFactory f18190d;

    /* renamed from: e */
    public static final int f18191e = m25079d(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: f */
    public static final C9293c f18192f;

    /* renamed from: a */
    public final ThreadFactory f18193a;

    /* renamed from: b */
    public final AtomicReference<C9292b> f18194b;

    /* renamed from: f.c.s.g.b$a */
    /* compiled from: ComputationScheduler */
    public static final class C9291a extends C9194k.C9196b {

        /* renamed from: e */
        public final C9221b f18195e = new C9221b();

        /* renamed from: l */
        public final C9206a f18196l = new C9206a();

        /* renamed from: m */
        public final C9221b f18197m;

        /* renamed from: n */
        public final C9293c f18198n;

        /* renamed from: o */
        public volatile boolean f18199o;

        public C9291a(C9293c cVar) {
            this.f18198n = cVar;
            C9221b bVar = new C9221b();
            this.f18197m = bVar;
            bVar.mo47027b(this.f18195e);
            this.f18197m.mo47027b(this.f18196l);
        }

        /* renamed from: b */
        public C9207b mo47019b(Runnable runnable) {
            if (this.f18199o) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f18198n.mo47138d(runnable, 0, TimeUnit.MILLISECONDS, this.f18195e);
        }

        /* renamed from: c */
        public C9207b mo47020c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f18199o) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f18198n.mo47138d(runnable, j, timeUnit, this.f18196l);
        }

        public void dispose() {
            if (!this.f18199o) {
                this.f18199o = true;
                this.f18197m.dispose();
            }
        }
    }

    /* renamed from: f.c.s.g.b$b */
    /* compiled from: ComputationScheduler */
    public static final class C9292b {

        /* renamed from: a */
        public final int f18200a;

        /* renamed from: b */
        public final C9293c[] f18201b;

        /* renamed from: c */
        public long f18202c;

        public C9292b(int i, ThreadFactory threadFactory) {
            this.f18200a = i;
            this.f18201b = new C9293c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f18201b[i2] = new C9293c(threadFactory);
            }
        }

        /* renamed from: a */
        public C9293c mo47127a() {
            int i = this.f18200a;
            if (i == 0) {
                return C9290b.f18192f;
            }
            C9293c[] cVarArr = this.f18201b;
            long j = this.f18202c;
            this.f18202c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void mo47128b() {
            for (C9293c dispose : this.f18201b) {
                dispose.dispose();
            }
        }
    }

    /* renamed from: f.c.s.g.b$c */
    /* compiled from: ComputationScheduler */
    public static final class C9293c extends C9299e {
        public C9293c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C9293c cVar = new C9293c(new RxThreadFactory("RxComputationShutdown"));
        f18192f = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f18190d = rxThreadFactory;
        C9292b bVar = new C9292b(0, rxThreadFactory);
        f18189c = bVar;
        bVar.mo47128b();
    }

    public C9290b() {
        this(f18190d);
    }

    /* renamed from: d */
    public static int m25079d(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    /* renamed from: a */
    public C9194k.C9196b mo47013a() {
        return new C9291a(this.f18194b.get().mo47127a());
    }

    /* renamed from: c */
    public C9207b mo47015c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f18194b.get().mo47127a().mo47139e(runnable, j, timeUnit);
    }

    /* renamed from: e */
    public void mo47126e() {
        C9292b bVar = new C9292b(f18191e, this.f18193a);
        if (!this.f18194b.compareAndSet(f18189c, bVar)) {
            bVar.mo47128b();
        }
    }

    public C9290b(ThreadFactory threadFactory) {
        this.f18193a = threadFactory;
        this.f18194b = new AtomicReference<>(f18189c);
        mo47126e();
    }
}
