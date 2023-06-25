package p040c.p200q.p363c.p370n.p371h.p374j;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p370n.p371h.C6472c;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p372h.C6481a;
import p040c.p200q.p363c.p370n.p371h.p373i.C6488b;
import p040c.p200q.p363c.p370n.p371h.p375k.C6554e;
import p040c.p200q.p363c.p370n.p371h.p375k.C6567i;
import p040c.p200q.p363c.p370n.p371h.p379n.C6677f;
import p040c.p200q.p363c.p370n.p371h.p381p.C6696i;
import p040c.p200q.p363c.p370n.p371h.p382q.C6700a;
import p040c.p200q.p363c.p370n.p371h.p382q.C6702c;

/* renamed from: c.q.c.n.h.j.q */
/* compiled from: CrashlyticsCore */
public class C6532q {

    /* renamed from: a */
    public final Context f12299a;

    /* renamed from: b */
    public final C6543w f12300b;

    /* renamed from: c */
    public final C6499e0 f12301c = new C6499e0();

    /* renamed from: d */
    public final long f12302d = System.currentTimeMillis();

    /* renamed from: e */
    public C6537r f12303e;

    /* renamed from: f */
    public C6537r f12304f;

    /* renamed from: g */
    public boolean f12305g;

    /* renamed from: h */
    public C6520p f12306h;

    /* renamed from: i */
    public final C6549z f12307i;

    /* renamed from: j */
    public final C6677f f12308j;
    @VisibleForTesting

    /* renamed from: k */
    public final C6488b f12309k;

    /* renamed from: l */
    public final C6481a f12310l;

    /* renamed from: m */
    public final ExecutorService f12311m;

    /* renamed from: n */
    public final C6515o f12312n;

    /* renamed from: o */
    public final C6472c f12313o;

    /* renamed from: c.q.c.n.h.j.q$a */
    /* compiled from: CrashlyticsCore */
    public class C6533a implements Callable<C5771j<Void>> {

        /* renamed from: e */
        public final /* synthetic */ C6696i f12314e;

        public C6533a(C6696i iVar) {
            this.f12314e = iVar;
        }

        /* renamed from: a */
        public C5771j<Void> call() {
            return C6532q.this.mo30757i(this.f12314e);
        }
    }

    /* renamed from: c.q.c.n.h.j.q$b */
    /* compiled from: CrashlyticsCore */
    public class C6534b implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C6696i f12316e;

        public C6534b(C6696i iVar) {
            this.f12316e = iVar;
        }

        public void run() {
            C5771j unused = C6532q.this.mo30757i(this.f12316e);
        }
    }

    /* renamed from: c.q.c.n.h.j.q$c */
    /* compiled from: CrashlyticsCore */
    public class C6535c implements Callable<Boolean> {
        public C6535c() {
        }

        /* renamed from: a */
        public Boolean call() {
            try {
                boolean d = C6532q.this.f12303e.mo30779d();
                if (!d) {
                    C6479f.m18125f().mo30649k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d);
            } catch (Exception e) {
                C6479f.m18125f().mo30644e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: c.q.c.n.h.j.q$d */
    /* compiled from: CrashlyticsCore */
    public class C6536d implements Callable<Boolean> {
        public C6536d() {
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(C6532q.this.f12306h.mo30729t());
        }
    }

    public C6532q(C6331h hVar, C6549z zVar, C6472c cVar, C6543w wVar, C6488b bVar, C6481a aVar, C6677f fVar, ExecutorService executorService) {
        this.f12300b = wVar;
        this.f12299a = hVar.mo30404j();
        this.f12307i = zVar;
        this.f12313o = cVar;
        this.f12309k = bVar;
        this.f12310l = aVar;
        this.f12311m = executorService;
        this.f12308j = fVar;
        this.f12312n = new C6515o(executorService);
    }

    /* renamed from: l */
    public static String m18328l() {
        return "18.3.2";
    }

    /* renamed from: m */
    public static boolean m18329m(String str, boolean z) {
        if (!z) {
            C6479f.m18125f().mo30647i("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public final void mo30752d() {
        try {
            this.f12305g = Boolean.TRUE.equals((Boolean) C6505h0.m18191a(this.f12312n.mo30704h(new C6536d())));
        } catch (Exception unused) {
            this.f12305g = false;
        }
    }

    @NonNull
    /* renamed from: e */
    public C5771j<Boolean> mo30753e() {
        return this.f12306h.mo30727n();
    }

    /* renamed from: f */
    public C5771j<Void> mo30754f() {
        return this.f12306h.mo30728s();
    }

    /* renamed from: g */
    public boolean mo30755g() {
        return this.f12305g;
    }

    /* renamed from: h */
    public boolean mo30756h() {
        return this.f12303e.mo30778c();
    }

    /* renamed from: i */
    public final C5771j<Void> mo30757i(C6696i iVar) {
        mo30763q();
        try {
            this.f12309k.mo30603a(new C6492b(this));
            if (!iVar.mo31323b().f12797b.f12802a) {
                C6479f.m18125f().mo30641b("Collection of crash reports disabled in Crashlytics settings.");
                return C5777m.m16413e(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f12306h.mo30710A(iVar)) {
                C6479f.m18125f().mo30649k("Previous sessions could not be finalized.");
            }
            C5771j<Void> R = this.f12306h.mo30722R(iVar.mo31322a());
            mo30762p();
            return R;
        } catch (Exception e) {
            C6479f.m18125f().mo30644e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return C5777m.m16413e(e);
        } finally {
            mo30762p();
        }
    }

    /* renamed from: j */
    public C5771j<Void> mo30758j(C6696i iVar) {
        return C6505h0.m18193c(this.f12311m, new C6533a(iVar));
    }

    /* renamed from: k */
    public final void mo30759k(C6696i iVar) {
        Future<?> submit = this.f12311m.submit(new C6534b(iVar));
        C6479f.m18125f().mo30641b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C6479f.m18125f().mo30644e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            C6479f.m18125f().mo30644e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            C6479f.m18125f().mo30644e("Crashlytics timed out during initialization.", e3);
        }
    }

    /* renamed from: n */
    public void mo30760n(String str) {
        this.f12306h.mo30726V(System.currentTimeMillis() - this.f12302d, str);
    }

    /* renamed from: o */
    public void mo30761o(@NonNull Throwable th) {
        this.f12306h.mo30725U(Thread.currentThread(), th);
    }

    /* renamed from: p */
    public void mo30762p() {
        this.f12312n.mo30704h(new C6535c());
    }

    /* renamed from: q */
    public void mo30763q() {
        this.f12312n.mo30698b();
        this.f12303e.mo30776a();
        C6479f.m18125f().mo30647i("Initialization marker file was created.");
    }

    /* renamed from: r */
    public boolean mo30764r(C6504h hVar, C6696i iVar) {
        C6696i iVar2 = iVar;
        if (m18329m(hVar.f12213b, C6513n.m18233k(this.f12299a, "com.crashlytics.RequireBuildId", true))) {
            String mVar = new C6512m(this.f12307i).toString();
            try {
                this.f12304f = new C6537r("crash_marker", this.f12308j);
                this.f12303e = new C6537r("initialization_marker", this.f12308j);
                C6567i iVar3 = new C6567i(mVar, this.f12308j, this.f12312n);
                C6554e eVar = new C6554e(this.f12308j);
                C6504h hVar2 = hVar;
                C6554e eVar2 = eVar;
                C6567i iVar4 = iVar3;
                C6501f0 e = C6501f0.m18169e(this.f12299a, this.f12307i, this.f12308j, hVar2, eVar2, iVar4, new C6700a(1024, new C6702c(10)), iVar, this.f12301c);
                Context context = this.f12299a;
                C6515o oVar = this.f12312n;
                C6549z zVar = this.f12307i;
                C6543w wVar = this.f12300b;
                C6677f fVar = this.f12308j;
                C6537r rVar = this.f12304f;
                C6567i iVar5 = iVar3;
                Context context2 = context;
                String str = mVar;
                C6515o oVar2 = oVar;
                C6549z zVar2 = zVar;
                C6543w wVar2 = wVar;
                C6677f fVar2 = fVar;
                C6537r rVar2 = rVar;
                C6504h hVar3 = hVar;
                this.f12306h = new C6520p(context2, oVar2, zVar2, wVar2, fVar2, rVar2, hVar3, iVar5, eVar, e, this.f12313o, this.f12310l);
                boolean h = mo30756h();
                mo30752d();
                this.f12306h.mo30734y(str, Thread.getDefaultUncaughtExceptionHandler(), iVar2);
                if (!h || !C6513n.m18225c(this.f12299a)) {
                    C6479f.m18125f().mo30641b("Successfully configured exception handler.");
                    return true;
                }
                C6479f.m18125f().mo30641b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                mo30759k(iVar2);
                return false;
            } catch (Exception e2) {
                C6479f.m18125f().mo30644e("Crashlytics was not started due to an exception during initialization", e2);
                this.f12306h = null;
                return false;
            }
        } else {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
    }

    /* renamed from: s */
    public C5771j<Void> mo30765s() {
        return this.f12306h.mo30719O();
    }

    /* renamed from: t */
    public void mo30766t(@Nullable Boolean bool) {
        this.f12300b.mo30811g(bool);
    }

    /* renamed from: u */
    public void mo30767u(String str, String str2) {
        this.f12306h.mo30720P(str, str2);
    }

    /* renamed from: v */
    public void mo30768v(String str) {
        this.f12306h.mo30721Q(str);
    }
}
