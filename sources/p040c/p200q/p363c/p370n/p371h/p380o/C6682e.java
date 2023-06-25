package p040c.p200q.p363c.p370n.p371h.p380o;

import android.annotation.SuppressLint;
import com.google.android.datatransport.Priority;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p040c.p200q.p201a.p202a.C2351c;
import p040c.p200q.p201a.p202a.C2353e;
import p040c.p200q.p201a.p202a.p205i.C2532m;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p374j.C6499e0;
import p040c.p200q.p363c.p370n.p371h.p374j.C6505h0;
import p040c.p200q.p363c.p370n.p371h.p374j.C6539t;
import p040c.p200q.p363c.p370n.p371h.p381p.C6688d;

/* renamed from: c.q.c.n.h.o.e */
/* compiled from: ReportQueue */
public final class C6682e {

    /* renamed from: a */
    public final double f12779a;

    /* renamed from: b */
    public final double f12780b;

    /* renamed from: c */
    public final long f12781c;

    /* renamed from: d */
    public final int f12782d;

    /* renamed from: e */
    public final BlockingQueue<Runnable> f12783e;

    /* renamed from: f */
    public final ThreadPoolExecutor f12784f;

    /* renamed from: g */
    public final C2353e<CrashlyticsReport> f12785g;

    /* renamed from: h */
    public final C6499e0 f12786h;

    /* renamed from: i */
    public int f12787i;

    /* renamed from: j */
    public long f12788j;

    /* renamed from: c.q.c.n.h.o.e$b */
    /* compiled from: ReportQueue */
    public final class C6684b implements Runnable {

        /* renamed from: e */
        public final C6539t f12789e;

        /* renamed from: l */
        public final C5773k<C6539t> f12790l;

        public void run() {
            C6682e.this.mo31307n(this.f12789e, this.f12790l);
            C6682e.this.f12786h.mo30662c();
            double c = C6682e.this.mo31298e();
            C6479f f = C6479f.m18125f();
            f.mo30641b("Delay for: " + String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(c / 1000.0d)}) + " s for report: " + this.f12789e.mo30684d());
            C6682e.m18916o(c);
        }

        public C6684b(C6539t tVar, C5773k<C6539t> kVar) {
            this.f12789e = tVar;
            this.f12790l = kVar;
        }
    }

    public C6682e(C2353e<CrashlyticsReport> eVar, C6688d dVar, C6499e0 e0Var) {
        this(dVar.f12799d, dVar.f12800e, ((long) dVar.f12801f) * 1000, eVar, e0Var);
    }

    /* renamed from: o */
    public static void m18916o(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: e */
    public final double mo31298e() {
        return Math.min(3600000.0d, (60000.0d / this.f12779a) * Math.pow(this.f12780b, (double) mo31299f()));
    }

    /* renamed from: f */
    public final int mo31299f() {
        int i;
        if (this.f12788j == 0) {
            this.f12788j = mo31306m();
        }
        int m = (int) ((mo31306m() - this.f12788j) / this.f12781c);
        if (mo31303j()) {
            i = Math.min(100, this.f12787i + m);
        } else {
            i = Math.max(0, this.f12787i - m);
        }
        if (this.f12787i != i) {
            this.f12787i = i;
            this.f12788j = mo31306m();
        }
        return i;
    }

    /* renamed from: g */
    public C5773k<C6539t> mo31300g(C6539t tVar, boolean z) {
        synchronized (this.f12783e) {
            C5773k<C6539t> kVar = new C5773k<>();
            if (z) {
                this.f12786h.mo30661b();
                if (mo31302i()) {
                    C6479f f = C6479f.m18125f();
                    f.mo30641b("Enqueueing report: " + tVar.mo30684d());
                    C6479f f2 = C6479f.m18125f();
                    f2.mo30641b("Queue size: " + this.f12783e.size());
                    this.f12784f.execute(new C6684b(tVar, kVar));
                    C6479f f3 = C6479f.m18125f();
                    f3.mo30641b("Closing task for report: " + tVar.mo30684d());
                    kVar.mo28863e(tVar);
                    return kVar;
                }
                mo31299f();
                C6479f f4 = C6479f.m18125f();
                f4.mo30641b("Dropping report due to queue being full: " + tVar.mo30684d());
                this.f12786h.mo30660a();
                kVar.mo28863e(tVar);
                return kVar;
            }
            mo31307n(tVar, kVar);
            return kVar;
        }
    }

    @SuppressLint({"DiscouragedApi"})
    /* renamed from: h */
    public void mo31301h() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new C6680c(this, countDownLatch)).start();
        C6505h0.m18192b(countDownLatch, 2, TimeUnit.SECONDS);
    }

    /* renamed from: i */
    public final boolean mo31302i() {
        return this.f12783e.size() < this.f12782d;
    }

    /* renamed from: j */
    public final boolean mo31303j() {
        return this.f12783e.size() == this.f12782d;
    }

    /* renamed from: k */
    public /* synthetic */ void mo31304k(CountDownLatch countDownLatch) {
        C2532m.m4515b(this.f12785g, Priority.HIGHEST);
        countDownLatch.countDown();
    }

    /* renamed from: l */
    public /* synthetic */ void mo31305l(C5773k kVar, C6539t tVar, Exception exc) {
        if (exc != null) {
            kVar.mo28862d(exc);
            return;
        }
        mo31301h();
        kVar.mo28863e(tVar);
    }

    /* renamed from: m */
    public final long mo31306m() {
        return System.currentTimeMillis();
    }

    /* renamed from: n */
    public final void mo31307n(C6539t tVar, C5773k<C6539t> kVar) {
        C6479f f = C6479f.m18125f();
        f.mo30641b("Sending report through Google DataTransport: " + tVar.mo30684d());
        this.f12785g.mo17661b(C2351c.m4030e(tVar.mo30682b()), new C6679b(this, kVar, tVar));
    }

    public C6682e(double d, double d2, long j, C2353e<CrashlyticsReport> eVar, C6499e0 e0Var) {
        this.f12779a = d;
        this.f12780b = d2;
        this.f12781c = j;
        this.f12785g = eVar;
        this.f12786h = e0Var;
        this.f12782d = (int) d;
        this.f12783e = new ArrayBlockingQueue(this.f12782d);
        this.f12784f = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, this.f12783e);
        this.f12787i = 0;
        this.f12788j = 0;
    }
}
