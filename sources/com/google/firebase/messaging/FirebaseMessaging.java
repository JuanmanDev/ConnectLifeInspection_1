package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p040c.p200q.p201a.p202a.C2354f;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.p290r.C3567a;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.C6330g;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p389r.C6736a;
import p040c.p200q.p363c.p389r.C6737b;
import p040c.p200q.p363c.p389r.C6739d;
import p040c.p200q.p363c.p391t.p392a.C6753a;
import p040c.p200q.p363c.p393u.C6757b;
import p040c.p200q.p363c.p394v.C6770i;
import p040c.p200q.p363c.p400x.C6828g;
import p040c.p200q.p363c.p400x.C6829g0;
import p040c.p200q.p363c.p400x.C6830h;
import p040c.p200q.p363c.p400x.C6831h0;
import p040c.p200q.p363c.p400x.C6832i;
import p040c.p200q.p363c.p400x.C6833i0;
import p040c.p200q.p363c.p400x.C6834j;
import p040c.p200q.p363c.p400x.C6835j0;
import p040c.p200q.p363c.p400x.C6836k;
import p040c.p200q.p363c.p400x.C6838l;
import p040c.p200q.p363c.p400x.C6840m;
import p040c.p200q.p363c.p400x.C6841m0;
import p040c.p200q.p363c.p400x.C6842n;
import p040c.p200q.p363c.p400x.C6847p0;
import p040c.p200q.p363c.p400x.C6853s0;
import p040c.p200q.p363c.p400x.C6860v0;
import p040c.p200q.p363c.p400x.C6863w0;
import p040c.p200q.p363c.p400x.C6870z0;
import p040c.p200q.p363c.p403y.C6880i;

public class FirebaseMessaging {

    /* renamed from: m */
    public static final long f15439m = TimeUnit.HOURS.toSeconds(8);
    @GuardedBy("FirebaseMessaging.class")

    /* renamed from: n */
    public static C6860v0 f15440n;
    @VisibleForTesting
    @SuppressLint({"FirebaseUnknownNullness"})
    @Nullable

    /* renamed from: o */
    public static C2354f f15441o;
    @VisibleForTesting
    @GuardedBy("FirebaseMessaging.class")

    /* renamed from: p */
    public static ScheduledExecutorService f15442p;

    /* renamed from: a */
    public final C6331h f15443a;
    @Nullable

    /* renamed from: b */
    public final C6753a f15444b;

    /* renamed from: c */
    public final Context f15445c;

    /* renamed from: d */
    public final C6835j0 f15446d;

    /* renamed from: e */
    public final C6853s0 f15447e;

    /* renamed from: f */
    public final C8294a f15448f;

    /* renamed from: g */
    public final Executor f15449g;

    /* renamed from: h */
    public final Executor f15450h;

    /* renamed from: i */
    public final C5771j<C6870z0> f15451i;

    /* renamed from: j */
    public final C6841m0 f15452j;
    @GuardedBy("this")

    /* renamed from: k */
    public boolean f15453k;

    /* renamed from: l */
    public final Application.ActivityLifecycleCallbacks f15454l;

    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    public class C8294a {

        /* renamed from: a */
        public final C6739d f15455a;
        @GuardedBy("this")

        /* renamed from: b */
        public boolean f15456b;
        @GuardedBy("this")
        @Nullable

        /* renamed from: c */
        public C6737b<C6330g> f15457c;
        @GuardedBy("this")
        @Nullable

        /* renamed from: d */
        public Boolean f15458d;

        public C8294a(C6739d dVar) {
            this.f15455a = dVar;
        }

        /* renamed from: a */
        public synchronized void mo37469a() {
            if (!this.f15456b) {
                Boolean d = mo37472d();
                this.f15458d = d;
                if (d == null) {
                    C6830h hVar = new C6830h(this);
                    this.f15457c = hVar;
                    this.f15455a.mo30593a(C6330g.class, hVar);
                }
                this.f15456b = true;
            }
        }

        /* renamed from: b */
        public synchronized boolean mo37470b() {
            boolean z;
            mo37469a();
            if (this.f15458d != null) {
                z = this.f15458d.booleanValue();
            } else {
                z = FirebaseMessaging.this.f15443a.mo30410u();
            }
            return z;
        }

        /* renamed from: c */
        public /* synthetic */ void mo37471c(C6736a aVar) {
            if (mo37470b()) {
                FirebaseMessaging.this.mo37466w();
            }
        }

        @Nullable
        /* renamed from: d */
        public final Boolean mo37472d() {
            ApplicationInfo applicationInfo;
            Context j = FirebaseMessaging.this.f15443a.mo30404j();
            SharedPreferences sharedPreferences = j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = j.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(j.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(C6331h hVar, @Nullable C6753a aVar, C6757b<C6880i> bVar, C6757b<HeartBeatInfo> bVar2, C6770i iVar, @Nullable C2354f fVar, C6739d dVar) {
        this(hVar, aVar, bVar, bVar2, iVar, fVar, dVar, new C6841m0(hVar.mo30404j()));
    }

    @NonNull
    /* renamed from: f */
    public static synchronized FirebaseMessaging m23019f() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(C6331h.m17785l());
        }
        return instance;
    }

    @NonNull
    /* renamed from: g */
    public static synchronized C6860v0 m23020g(Context context) {
        C6860v0 v0Var;
        synchronized (FirebaseMessaging.class) {
            if (f15440n == null) {
                f15440n = new C6860v0(context);
            }
            v0Var = f15440n;
        }
        return v0Var;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull C6331h hVar) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) hVar.mo30402h(cls);
            C3495o.m8909k(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    @Nullable
    /* renamed from: k */
    public static C2354f m23021k() {
        return f15441o;
    }

    /* renamed from: c */
    public String mo37449c() {
        C6753a aVar = this.f15444b;
        if (aVar != null) {
            try {
                return (String) C5777m.m16409a(aVar.mo31434a());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        } else {
            C6860v0.C6861a j = mo37454j();
            if (!mo37468y(j)) {
                return j.f13134a;
            }
            String c = C6841m0.m19427c(this.f15443a);
            try {
                return (String) C5777m.m16409a(this.f15447e.mo31672a(c, new C6828g(this, c, j)));
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
    }

    /* renamed from: d */
    public void mo37450d(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (f15442p == null) {
                f15442p = new ScheduledThreadPoolExecutor(1, new C3567a("TAG"));
            }
            f15442p.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: e */
    public Context mo37451e() {
        return this.f15445c;
    }

    /* renamed from: h */
    public final String mo37452h() {
        if ("[DEFAULT]".equals(this.f15443a.mo30405n())) {
            return "";
        }
        return this.f15443a.mo30407p();
    }

    @NonNull
    /* renamed from: i */
    public C5771j<String> mo37453i() {
        C6753a aVar = this.f15444b;
        if (aVar != null) {
            return aVar.mo31434a();
        }
        C5773k kVar = new C5773k();
        this.f15449g.execute(new C6838l(this, kVar));
        return kVar.mo28859a();
    }

    @VisibleForTesting
    @Nullable
    /* renamed from: j */
    public C6860v0.C6861a mo37454j() {
        return m23020g(this.f15445c).mo31691d(mo37452h(), C6841m0.m19427c(this.f15443a));
    }

    /* renamed from: l */
    public final void mo37455l(String str) {
        if ("[DEFAULT]".equals(this.f15443a.mo30405n())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                "Invoking onNewToken for app: " + this.f15443a.mo30405n();
            }
            Intent intent = new Intent(FirebaseMessagingService.ACTION_NEW_TOKEN);
            intent.putExtra(FirebaseMessagingService.EXTRA_TOKEN, str);
            new C6829g0(this.f15445c).mo31609f(intent);
        }
    }

    /* renamed from: m */
    public boolean mo37456m() {
        return this.f15448f.mo37470b();
    }

    @VisibleForTesting
    /* renamed from: n */
    public boolean mo37457n() {
        return this.f15452j.mo31643g();
    }

    /* renamed from: o */
    public /* synthetic */ C5771j mo37458o(String str, C6860v0.C6861a aVar) {
        return this.f15446d.mo31623d().mo28858s(this.f15450h, new C6832i(this, str, aVar));
    }

    /* renamed from: p */
    public /* synthetic */ C5771j mo37459p(String str, C6860v0.C6861a aVar, String str2) {
        m23020g(this.f15445c).mo31693f(mo37452h(), str, str2, this.f15452j.mo31638a());
        if (aVar == null || !str2.equals(aVar.f13134a)) {
            mo37455l(str2);
        }
        return C5777m.m16414f(str2);
    }

    /* renamed from: q */
    public /* synthetic */ void mo37460q(C5773k kVar) {
        try {
            kVar.mo28861c(mo37449c());
        } catch (Exception e) {
            kVar.mo28860b(e);
        }
    }

    /* renamed from: r */
    public /* synthetic */ void mo37461r() {
        if (mo37456m()) {
            mo37466w();
        }
    }

    /* renamed from: s */
    public /* synthetic */ void mo37462s(C6870z0 z0Var) {
        if (mo37456m()) {
            z0Var.mo31721n();
        }
    }

    /* renamed from: t */
    public /* synthetic */ void mo37463t() {
        C6847p0.m19466b(this.f15445c);
    }

    /* renamed from: u */
    public synchronized void mo37464u(boolean z) {
        this.f15453k = z;
    }

    /* renamed from: v */
    public final synchronized void mo37465v() {
        if (!this.f15453k) {
            mo37467x(0);
        }
    }

    /* renamed from: w */
    public final void mo37466w() {
        C6753a aVar = this.f15444b;
        if (aVar != null) {
            aVar.mo31436c();
        } else if (mo37468y(mo37454j())) {
            mo37465v();
        }
    }

    /* renamed from: x */
    public synchronized void mo37467x(long j) {
        mo37450d(new C6863w0(this, Math.min(Math.max(30, 2 * j), f15439m)), j);
        this.f15453k = true;
    }

    @VisibleForTesting
    /* renamed from: y */
    public boolean mo37468y(@Nullable C6860v0.C6861a aVar) {
        return aVar == null || aVar.mo31694b(this.f15452j.mo31638a());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FirebaseMessaging(p040c.p200q.p363c.C6331h r12, @androidx.annotation.Nullable p040c.p200q.p363c.p391t.p392a.C6753a r13, p040c.p200q.p363c.p393u.C6757b<p040c.p200q.p363c.p403y.C6880i> r14, p040c.p200q.p363c.p393u.C6757b<com.google.firebase.heartbeatinfo.HeartBeatInfo> r15, p040c.p200q.p363c.p394v.C6770i r16, @androidx.annotation.Nullable p040c.p200q.p201a.p202a.C2354f r17, p040c.p200q.p363c.p389r.C6739d r18, p040c.p200q.p363c.p400x.C6841m0 r19) {
        /*
            r11 = this;
            c.q.c.x.j0 r7 = new c.q.c.x.j0
            r0 = r7
            r1 = r12
            r2 = r19
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r8 = p040c.p200q.p363c.p400x.C6831h0.m19377f()
            java.util.concurrent.ScheduledExecutorService r9 = p040c.p200q.p363c.p400x.C6831h0.m19374c()
            java.util.concurrent.Executor r10 = p040c.p200q.p363c.p400x.C6831h0.m19373b()
            r0 = r11
            r2 = r13
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.<init>(c.q.c.h, c.q.c.t.a.a, c.q.c.u.b, c.q.c.u.b, c.q.c.v.i, c.q.a.a.f, c.q.c.r.d, c.q.c.x.m0):void");
    }

    public FirebaseMessaging(C6331h hVar, @Nullable C6753a aVar, C6770i iVar, @Nullable C2354f fVar, C6739d dVar, C6841m0 m0Var, C6835j0 j0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f15453k = false;
        f15441o = fVar;
        this.f15443a = hVar;
        this.f15444b = aVar;
        this.f15448f = new C8294a(dVar);
        this.f15445c = hVar.mo30404j();
        this.f15454l = new C6833i0();
        this.f15452j = m0Var;
        this.f15446d = j0Var;
        this.f15447e = new C6853s0(executor);
        this.f15449g = executor2;
        this.f15450h = executor3;
        Context j = hVar.mo30404j();
        if (j instanceof Application) {
            ((Application) j).registerActivityLifecycleCallbacks(this.f15454l);
        } else {
            "Context " + j + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.";
        }
        if (aVar != null) {
            aVar.mo31435b(new C6840m(this));
        }
        executor2.execute(new C6834j(this));
        C5771j<C6870z0> d = C6870z0.m19519d(this, m0Var, j0Var, this.f15445c, C6831h0.m19378g());
        this.f15451i = d;
        d.mo28847h(executor2, new C6842n(this));
        executor2.execute(new C6836k(this));
    }
}
