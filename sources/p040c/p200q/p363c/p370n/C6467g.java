package p040c.p200q.p363c.p370n;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p040c.p200q.p201a.p264c.p347m.C5757c;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p364k.p365a.C6341a;
import p040c.p200q.p363c.p370n.p371h.C6472c;
import p040c.p200q.p363c.p370n.p371h.C6473d;
import p040c.p200q.p363c.p370n.p371h.C6476e;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p374j.C6504h;
import p040c.p200q.p363c.p370n.p371h.p374j.C6513n;
import p040c.p200q.p363c.p370n.p371h.p374j.C6532q;
import p040c.p200q.p363c.p370n.p371h.p374j.C6543w;
import p040c.p200q.p363c.p370n.p371h.p374j.C6544x;
import p040c.p200q.p363c.p370n.p371h.p374j.C6549z;
import p040c.p200q.p363c.p370n.p371h.p378m.C6670b;
import p040c.p200q.p363c.p370n.p371h.p379n.C6677f;
import p040c.p200q.p363c.p370n.p371h.p381p.C6692f;
import p040c.p200q.p363c.p393u.C6755a;
import p040c.p200q.p363c.p394v.C6770i;

/* renamed from: c.q.c.n.g */
/* compiled from: FirebaseCrashlytics */
public class C6467g {
    @VisibleForTesting

    /* renamed from: a */
    public final C6532q f12171a;

    /* renamed from: c.q.c.n.g$a */
    /* compiled from: FirebaseCrashlytics */
    public class C6468a implements C5757c<Void, Object> {
        /* renamed from: a */
        public Object mo20377a(@NonNull C5771j<Void> jVar) {
            if (jVar.mo28856q()) {
                return null;
            }
            C6479f.m18125f().mo30644e("Error fetching settings.", jVar.mo28851l());
            return null;
        }
    }

    /* renamed from: c.q.c.n.g$b */
    /* compiled from: FirebaseCrashlytics */
    public class C6469b implements Callable<Void> {

        /* renamed from: e */
        public final /* synthetic */ boolean f12172e;

        /* renamed from: l */
        public final /* synthetic */ C6532q f12173l;

        /* renamed from: m */
        public final /* synthetic */ C6692f f12174m;

        public C6469b(boolean z, C6532q qVar, C6692f fVar) {
            this.f12172e = z;
            this.f12173l = qVar;
            this.f12174m = fVar;
        }

        /* renamed from: a */
        public Void call() {
            if (!this.f12172e) {
                return null;
            }
            this.f12173l.mo30758j(this.f12174m);
            return null;
        }
    }

    public C6467g(@NonNull C6532q qVar) {
        this.f12171a = qVar;
    }

    @NonNull
    /* renamed from: d */
    public static C6467g m18085d() {
        C6467g gVar = (C6467g) C6331h.m17785l().mo30402h(C6467g.class);
        if (gVar != null) {
            return gVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    @Nullable
    /* renamed from: e */
    public static C6467g m18086e(@NonNull C6331h hVar, @NonNull C6770i iVar, @NonNull C6755a<C6472c> aVar, @NonNull C6755a<C6341a> aVar2) {
        Context j = hVar.mo30404j();
        String packageName = j.getPackageName();
        C6479f f = C6479f.m18125f();
        f.mo30645g("Initializing Firebase Crashlytics " + C6532q.m18328l() + " for " + packageName);
        C6677f fVar = new C6677f(j);
        C6543w wVar = new C6543w(hVar);
        C6549z zVar = new C6549z(j, packageName, iVar, wVar);
        C6473d dVar = new C6473d(aVar);
        C6465e eVar = new C6465e(aVar2);
        C6331h hVar2 = hVar;
        C6549z zVar2 = zVar;
        C6543w wVar2 = wVar;
        C6532q qVar = new C6532q(hVar2, zVar2, dVar, wVar2, eVar.mo30605b(), eVar.mo30604a(), fVar, C6544x.m18398c("Crashlytics Exception Handler"));
        String c = hVar.mo30406o().mo30420c();
        String n = C6513n.m18236n(j);
        C6479f f2 = C6479f.m18125f();
        f2.mo30641b("Mapping file ID is: " + n);
        try {
            C6504h a = C6504h.m18190a(j, zVar, c, n, new C6476e(j));
            C6479f f3 = C6479f.m18125f();
            f3.mo30647i("Installer package name is: " + a.f12214c);
            ExecutorService c2 = C6544x.m18398c("com.google.firebase.crashlytics.startup");
            C6692f l = C6692f.m18949l(j, c, zVar, new C6670b(), a.f12216e, a.f12217f, fVar, wVar);
            l.mo31328p(c2).mo28849j(c2, new C6468a());
            C5777m.m16412d(c2, new C6469b(qVar.mo30764r(a, l), qVar, l));
            return new C6467g(qVar);
        } catch (PackageManager.NameNotFoundException e) {
            C6479f.m18125f().mo30644e("Error retrieving app package info.", e);
            return null;
        }
    }

    @NonNull
    /* renamed from: a */
    public C5771j<Boolean> mo30613a() {
        return this.f12171a.mo30753e();
    }

    /* renamed from: b */
    public void mo30614b() {
        this.f12171a.mo30754f();
    }

    /* renamed from: c */
    public boolean mo30615c() {
        return this.f12171a.mo30755g();
    }

    /* renamed from: f */
    public void mo30616f(@NonNull String str) {
        this.f12171a.mo30760n(str);
    }

    /* renamed from: g */
    public void mo30617g(@NonNull Throwable th) {
        if (th == null) {
            C6479f.m18125f().mo30649k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f12171a.mo30761o(th);
        }
    }

    /* renamed from: h */
    public void mo30618h() {
        this.f12171a.mo30765s();
    }

    /* renamed from: i */
    public void mo30619i(@Nullable Boolean bool) {
        this.f12171a.mo30766t(bool);
    }

    /* renamed from: j */
    public void mo30620j(boolean z) {
        this.f12171a.mo30766t(Boolean.valueOf(z));
    }

    /* renamed from: k */
    public void mo30621k(@NonNull String str, @NonNull String str2) {
        this.f12171a.mo30767u(str, str2);
    }

    /* renamed from: l */
    public void mo30622l(@NonNull String str) {
        this.f12171a.mo30768v(str);
    }
}
