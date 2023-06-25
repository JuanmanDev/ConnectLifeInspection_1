package p040c.p200q.p363c.p394v;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p369m.C6458x;
import p040c.p200q.p363c.p390s.C6750j;
import p040c.p200q.p363c.p393u.C6757b;
import p040c.p200q.p363c.p394v.p395p.C6778a;
import p040c.p200q.p363c.p394v.p396q.C6782b;
import p040c.p200q.p363c.p394v.p396q.C6783c;
import p040c.p200q.p363c.p394v.p397r.C6791c;

/* renamed from: c.q.c.v.h */
/* compiled from: FirebaseInstallations */
public class C6767h implements C6770i {

    /* renamed from: m */
    public static final Object f12924m = new Object();

    /* renamed from: n */
    public static final ThreadFactory f12925n = new C6768a();

    /* renamed from: a */
    public final C6331h f12926a;

    /* renamed from: b */
    public final C6791c f12927b;

    /* renamed from: c */
    public final PersistedInstallation f12928c;

    /* renamed from: d */
    public final C6777o f12929d;

    /* renamed from: e */
    public final C6458x<C6782b> f12930e;

    /* renamed from: f */
    public final C6775m f12931f;

    /* renamed from: g */
    public final Object f12932g;

    /* renamed from: h */
    public final ExecutorService f12933h;

    /* renamed from: i */
    public final ExecutorService f12934i;
    @GuardedBy("this")

    /* renamed from: j */
    public String f12935j;
    @GuardedBy("FirebaseInstallations.this")

    /* renamed from: k */
    public Set<C6778a> f12936k;
    @GuardedBy("lock")

    /* renamed from: l */
    public final List<C6776n> f12937l;

    /* renamed from: c.q.c.v.h$a */
    /* compiled from: FirebaseInstallations */
    public class C6768a implements ThreadFactory {

        /* renamed from: e */
        public final AtomicInteger f12938e = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f12938e.getAndIncrement())}));
        }
    }

    /* renamed from: c.q.c.v.h$b */
    /* compiled from: FirebaseInstallations */
    public static /* synthetic */ class C6769b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12939a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f12940b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.remote.TokenResult$ResponseCode[] r0 = com.google.firebase.installations.remote.TokenResult.ResponseCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12940b = r0
                r1 = 1
                com.google.firebase.installations.remote.TokenResult$ResponseCode r2 = com.google.firebase.installations.remote.TokenResult.ResponseCode.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f12940b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f12940b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode[] r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f12939a = r2
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r3 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f12939a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p394v.C6767h.C6769b.<clinit>():void");
        }
    }

    public C6767h(C6331h hVar, @NonNull C6757b<C6750j> bVar) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f12925n), hVar, new C6791c(hVar.mo30404j(), bVar), new PersistedInstallation(hVar), C6777o.m19174c(), new C6458x(new C6761d(hVar)), new C6775m());
    }

    @NonNull
    /* renamed from: l */
    public static C6767h m19128l() {
        return m19129m(C6331h.m17785l());
    }

    @NonNull
    /* renamed from: m */
    public static C6767h m19129m(@NonNull C6331h hVar) {
        C3495o.m8900b(hVar != null, "Null is not a valid value of FirebaseApp.");
        return (C6767h) hVar.mo30402h(C6770i.class);
    }

    /* renamed from: u */
    public static /* synthetic */ C6782b m19130u(C6331h hVar) {
        return new C6782b(hVar);
    }

    /* renamed from: A */
    public final synchronized void mo31451A(String str) {
        this.f12935j = str;
    }

    /* renamed from: B */
    public final synchronized void mo31452B(C6783c cVar, C6783c cVar2) {
        if (this.f12936k.size() != 0 && !TextUtils.equals(cVar.mo31488d(), cVar2.mo31488d())) {
            for (C6778a a : this.f12936k) {
                a.mo31485a(cVar2.mo31488d());
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public C5771j<C6773l> mo31453a(boolean z) {
        mo31472v();
        C5771j<C6773l> b = mo31454b();
        this.f12933h.execute(new C6760c(this, z));
        return b;
    }

    /* renamed from: b */
    public final C5771j<C6773l> mo31454b() {
        C5773k kVar = new C5773k();
        mo31456d(new C6771j(this.f12929d, kVar));
        return kVar.mo28859a();
    }

    /* renamed from: c */
    public final C5771j<String> mo31455c() {
        C5773k kVar = new C5773k();
        mo31456d(new C6772k(kVar));
        return kVar.mo28859a();
    }

    /* renamed from: d */
    public final void mo31456d(C6776n nVar) {
        synchronized (this.f12932g) {
            this.f12937l.add(nVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31469r(boolean r3) {
        /*
            r2 = this;
            c.q.c.v.q.c r0 = r2.mo31465n()
            boolean r1 = r0.mo31512i()     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.mo31515l()     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            c.q.c.v.o r3 = r2.f12929d     // Catch:{ FirebaseInstallationsException -> 0x005f }
            boolean r3 = r3.mo31484f(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            c.q.c.v.q.c r3 = r2.mo31459g(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
            goto L_0x0026
        L_0x0022:
            c.q.c.v.q.c r3 = r2.mo31474x(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
        L_0x0026:
            r2.mo31468q(r3)
            r2.mo31452B(r0, r3)
            boolean r0 = r3.mo31514k()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r3.mo31488d()
            r2.mo31451A(r0)
        L_0x0039:
            boolean r0 = r3.mo31512i()
            if (r0 == 0) goto L_0x004a
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r0 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r3.<init>(r0)
            r2.mo31475y(r3)
            goto L_0x005e
        L_0x004a:
            boolean r0 = r3.mo31513j()
            if (r0 == 0) goto L_0x005b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.mo31475y(r3)
            goto L_0x005e
        L_0x005b:
            r2.mo31476z(r3)
        L_0x005e:
            return
        L_0x005f:
            r3 = move-exception
            r2.mo31475y(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p394v.C6767h.mo31469r(boolean):void");
    }

    /* renamed from: f */
    public final void mo31471t(boolean z) {
        C6783c o = mo31466o();
        if (z) {
            o = o.mo31518p();
        }
        mo31476z(o);
        this.f12934i.execute(new C6759b(this, z));
    }

    /* renamed from: g */
    public final C6783c mo31459g(@NonNull C6783c cVar) {
        TokenResult e = this.f12927b.mo31548e(mo31461h(), cVar.mo31488d(), mo31467p(), cVar.mo31491f());
        int i = C6769b.f12940b[e.mo31537b().ordinal()];
        if (i == 1) {
            return cVar.mo31517o(e.mo31538c(), e.mo31539d(), this.f12929d.mo31482b());
        } else if (i == 2) {
            return cVar.mo31519q("BAD CONFIG");
        } else {
            if (i == 3) {
                mo31451A((String) null);
                return cVar.mo31520r();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    @NonNull
    public C5771j<String> getId() {
        mo31472v();
        String j = mo31463j();
        if (j != null) {
            return C5777m.m16414f(j);
        }
        C5771j<String> c = mo31455c();
        this.f12933h.execute(new C6758a(this));
        return c;
    }

    @Nullable
    /* renamed from: h */
    public String mo31461h() {
        return this.f12926a.mo30406o().mo30419b();
    }

    @VisibleForTesting
    /* renamed from: i */
    public String mo31462i() {
        return this.f12926a.mo30406o().mo30420c();
    }

    /* renamed from: j */
    public final synchronized String mo31463j() {
        return this.f12935j;
    }

    /* renamed from: k */
    public final C6782b mo31464k() {
        return this.f12930e.get();
    }

    /* renamed from: n */
    public final C6783c mo31465n() {
        C6783c d;
        synchronized (f12924m) {
            C6766g a = C6766g.m19126a(this.f12926a.mo30404j(), "generatefid.lock");
            try {
                d = this.f12928c.mo37439d();
                if (a != null) {
                    a.mo31450b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo31450b();
                }
                throw th;
            }
        }
        return d;
    }

    /* renamed from: o */
    public final C6783c mo31466o() {
        C6783c d;
        synchronized (f12924m) {
            C6766g a = C6766g.m19126a(this.f12926a.mo30404j(), "generatefid.lock");
            try {
                d = this.f12928c.mo37439d();
                if (d.mo31513j()) {
                    String w = mo31473w(d);
                    PersistedInstallation persistedInstallation = this.f12928c;
                    d = d.mo31522t(w);
                    persistedInstallation.mo37437b(d);
                }
                if (a != null) {
                    a.mo31450b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo31450b();
                }
                throw th;
            }
        }
        return d;
    }

    @Nullable
    /* renamed from: p */
    public String mo31467p() {
        return this.f12926a.mo30406o().mo30425g();
    }

    /* renamed from: q */
    public final void mo31468q(C6783c cVar) {
        synchronized (f12924m) {
            C6766g a = C6766g.m19126a(this.f12926a.mo30404j(), "generatefid.lock");
            try {
                this.f12928c.mo37437b(cVar);
                if (a != null) {
                    a.mo31450b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo31450b();
                }
                throw th;
            }
        }
    }

    /* renamed from: s */
    public /* synthetic */ void mo31470s() {
        mo31471t(false);
    }

    /* renamed from: v */
    public final void mo31472v() {
        C3495o.m8905g(mo31462i(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C3495o.m8905g(mo31467p(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C3495o.m8905g(mo31461h(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C3495o.m8900b(C6777o.m19177h(mo31462i()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C3495o.m8900b(C6777o.m19176g(mo31461h()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: w */
    public final String mo31473w(C6783c cVar) {
        if ((!this.f12926a.mo30405n().equals("CHIME_ANDROID_SDK") && !this.f12926a.mo30411v()) || !cVar.mo31516m()) {
            return this.f12931f.mo31480a();
        }
        String f = mo31464k().mo31508f();
        return TextUtils.isEmpty(f) ? this.f12931f.mo31480a() : f;
    }

    /* renamed from: x */
    public final C6783c mo31474x(C6783c cVar) {
        InstallationResponse d = this.f12927b.mo31547d(mo31461h(), cVar.mo31488d(), mo31467p(), mo31462i(), (cVar.mo31488d() == null || cVar.mo31488d().length() != 11) ? null : mo31464k().mo31511i());
        int i = C6769b.f12939a[d.mo31526e().ordinal()];
        if (i == 1) {
            return cVar.mo31521s(d.mo31524c(), d.mo31525d(), this.f12929d.mo31482b(), d.mo31523b().mo31538c(), d.mo31523b().mo31539d());
        } else if (i == 2) {
            return cVar.mo31519q("BAD CONFIG");
        } else {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: y */
    public final void mo31475y(Exception exc) {
        synchronized (this.f12932g) {
            Iterator<C6776n> it = this.f12937l.iterator();
            while (it.hasNext()) {
                if (it.next().mo31478a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: z */
    public final void mo31476z(C6783c cVar) {
        synchronized (this.f12932g) {
            Iterator<C6776n> it = this.f12937l.iterator();
            while (it.hasNext()) {
                if (it.next().mo31479b(cVar)) {
                    it.remove();
                }
            }
        }
    }

    public C6767h(ExecutorService executorService, C6331h hVar, C6791c cVar, PersistedInstallation persistedInstallation, C6777o oVar, C6458x<C6782b> xVar, C6775m mVar) {
        this.f12932g = new Object();
        this.f12936k = new HashSet();
        this.f12937l = new ArrayList();
        this.f12926a = hVar;
        this.f12927b = cVar;
        this.f12928c = persistedInstallation;
        this.f12929d = oVar;
        this.f12930e = xVar;
        this.f12931f = mVar;
        this.f12933h = executorService;
        this.f12934i = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f12925n);
    }
}
