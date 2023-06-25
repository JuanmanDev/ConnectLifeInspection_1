package p040c.p200q.p363c.p370n.p371h.p374j;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.SavedStateHandle;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p040c.p200q.p201a.p264c.p347m.C5769i;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.p370n.p371h.C6472c;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.C6480g;
import p040c.p200q.p363c.p370n.p371h.p372h.C6481a;
import p040c.p200q.p363c.p370n.p371h.p374j.C6540u;
import p040c.p200q.p363c.p370n.p371h.p375k.C6554e;
import p040c.p200q.p363c.p370n.p371h.p375k.C6567i;
import p040c.p200q.p363c.p370n.p371h.p376l.C6595b0;
import p040c.p200q.p363c.p370n.p371h.p379n.C6677f;
import p040c.p200q.p363c.p370n.p371h.p381p.C6688d;
import p040c.p200q.p363c.p370n.p371h.p381p.C6696i;

/* renamed from: c.q.c.n.h.j.p */
/* compiled from: CrashlyticsController */
public class C6520p {

    /* renamed from: r */
    public static final FilenameFilter f12254r = C6490a.f12197a;

    /* renamed from: a */
    public final Context f12255a;

    /* renamed from: b */
    public final C6543w f12256b;

    /* renamed from: c */
    public final C6537r f12257c;

    /* renamed from: d */
    public final C6567i f12258d;

    /* renamed from: e */
    public final C6515o f12259e;

    /* renamed from: f */
    public final C6549z f12260f;

    /* renamed from: g */
    public final C6677f f12261g;

    /* renamed from: h */
    public final C6504h f12262h;

    /* renamed from: i */
    public final C6554e f12263i;

    /* renamed from: j */
    public final C6472c f12264j;

    /* renamed from: k */
    public final C6481a f12265k;

    /* renamed from: l */
    public final C6501f0 f12266l;

    /* renamed from: m */
    public C6540u f12267m;

    /* renamed from: n */
    public final C5773k<Boolean> f12268n = new C5773k<>();

    /* renamed from: o */
    public final C5773k<Boolean> f12269o = new C5773k<>();

    /* renamed from: p */
    public final C5773k<Void> f12270p = new C5773k<>();

    /* renamed from: q */
    public final AtomicBoolean f12271q = new AtomicBoolean(false);

    /* renamed from: c.q.c.n.h.j.p$a */
    /* compiled from: CrashlyticsController */
    public class C6521a implements C6540u.C6541a {
        public C6521a() {
        }

        /* renamed from: a */
        public void mo30736a(@NonNull C6696i iVar, @NonNull Thread thread, @NonNull Throwable th) {
            C6520p.this.mo30712G(iVar, thread, th);
        }
    }

    /* renamed from: c.q.c.n.h.j.p$b */
    /* compiled from: CrashlyticsController */
    public class C6522b implements Callable<C5771j<Void>> {

        /* renamed from: e */
        public final /* synthetic */ long f12273e;

        /* renamed from: l */
        public final /* synthetic */ Throwable f12274l;

        /* renamed from: m */
        public final /* synthetic */ Thread f12275m;

        /* renamed from: n */
        public final /* synthetic */ C6696i f12276n;

        /* renamed from: o */
        public final /* synthetic */ boolean f12277o;

        /* renamed from: c.q.c.n.h.j.p$b$a */
        /* compiled from: CrashlyticsController */
        public class C6523a implements C5769i<C6688d, Void> {

            /* renamed from: a */
            public final /* synthetic */ Executor f12279a;

            /* renamed from: b */
            public final /* synthetic */ String f12280b;

            public C6523a(Executor executor, String str) {
                this.f12279a = executor;
                this.f12280b = str;
            }

            @NonNull
            /* renamed from: b */
            public C5771j<Void> mo20378a(@Nullable C6688d dVar) {
                String str = null;
                if (dVar == null) {
                    C6479f.m18125f().mo30649k("Received null app settings, cannot send reports at crash time.");
                    return C5777m.m16414f(null);
                }
                C5771j[] jVarArr = new C5771j[2];
                jVarArr[0] = C6520p.this.mo30717M();
                C6501f0 g = C6520p.this.f12266l;
                Executor executor = this.f12279a;
                if (C6522b.this.f12277o) {
                    str = this.f12280b;
                }
                jVarArr[1] = g.mo30678u(executor, str);
                return C5777m.m16416h(jVarArr);
            }
        }

        public C6522b(long j, Throwable th, Thread thread, C6696i iVar, boolean z) {
            this.f12273e = j;
            this.f12274l = th;
            this.f12275m = thread;
            this.f12276n = iVar;
            this.f12277o = z;
        }

        /* renamed from: a */
        public C5771j<Void> call() {
            long a = C6520p.m18266F(this.f12273e);
            String b = C6520p.this.mo30711C();
            if (b == null) {
                C6479f.m18125f().mo30643d("Tried to write a fatal exception while no session was open.");
                return C5777m.m16414f(null);
            }
            C6520p.this.f12257c.mo30776a();
            C6520p.this.f12266l.mo30673p(this.f12274l, this.f12275m, b, a);
            C6520p.this.mo30733x(this.f12273e);
            C6520p.this.mo30730u(this.f12276n);
            C6520p.this.mo30732w(new C6512m(C6520p.this.f12260f).toString());
            if (!C6520p.this.f12256b.mo30809d()) {
                return C5777m.m16414f(null);
            }
            Executor c = C6520p.this.f12259e.mo30699c();
            return this.f12276n.mo31322a().mo28858s(c, new C6523a(c, b));
        }
    }

    /* renamed from: c.q.c.n.h.j.p$c */
    /* compiled from: CrashlyticsController */
    public class C6524c implements C5769i<Void, Boolean> {
        public C6524c(C6520p pVar) {
        }

        @NonNull
        /* renamed from: b */
        public C5771j<Boolean> mo20378a(@Nullable Void voidR) {
            return C5777m.m16414f(Boolean.TRUE);
        }
    }

    /* renamed from: c.q.c.n.h.j.p$d */
    /* compiled from: CrashlyticsController */
    public class C6525d implements C5769i<Boolean, Void> {

        /* renamed from: a */
        public final /* synthetic */ C5771j f12282a;

        /* renamed from: c.q.c.n.h.j.p$d$a */
        /* compiled from: CrashlyticsController */
        public class C6526a implements Callable<C5771j<Void>> {

            /* renamed from: e */
            public final /* synthetic */ Boolean f12284e;

            /* renamed from: c.q.c.n.h.j.p$d$a$a */
            /* compiled from: CrashlyticsController */
            public class C6527a implements C5769i<C6688d, Void> {

                /* renamed from: a */
                public final /* synthetic */ Executor f12286a;

                public C6527a(Executor executor) {
                    this.f12286a = executor;
                }

                @NonNull
                /* renamed from: b */
                public C5771j<Void> mo20378a(@Nullable C6688d dVar) {
                    if (dVar == null) {
                        C6479f.m18125f().mo30649k("Received null app settings at app startup. Cannot send cached reports");
                        return C5777m.m16414f(null);
                    }
                    C5771j unused = C6520p.this.mo30717M();
                    C6520p.this.f12266l.mo30677t(this.f12286a);
                    C6520p.this.f12270p.mo28863e(null);
                    return C5777m.m16414f(null);
                }
            }

            public C6526a(Boolean bool) {
                this.f12284e = bool;
            }

            /* renamed from: a */
            public C5771j<Void> call() {
                if (!this.f12284e.booleanValue()) {
                    C6479f.m18125f().mo30647i("Deleting cached crash reports...");
                    C6520p.m18284r(C6520p.this.mo30715K());
                    C6520p.this.f12266l.mo30676s();
                    C6520p.this.f12270p.mo28863e(null);
                    return C5777m.m16414f(null);
                }
                C6479f.m18125f().mo30641b("Sending cached crash reports...");
                C6520p.this.f12256b.mo30808c(this.f12284e.booleanValue());
                Executor c = C6520p.this.f12259e.mo30699c();
                return C6525d.this.f12282a.mo28858s(c, new C6527a(c));
            }
        }

        public C6525d(C5771j jVar) {
            this.f12282a = jVar;
        }

        @NonNull
        /* renamed from: b */
        public C5771j<Void> mo20378a(@Nullable Boolean bool) {
            return C6520p.this.f12259e.mo30705i(new C6526a(bool));
        }
    }

    /* renamed from: c.q.c.n.h.j.p$e */
    /* compiled from: CrashlyticsController */
    public class C6528e implements Callable<Void> {

        /* renamed from: e */
        public final /* synthetic */ long f12288e;

        /* renamed from: l */
        public final /* synthetic */ String f12289l;

        public C6528e(long j, String str) {
            this.f12288e = j;
            this.f12289l = str;
        }

        /* renamed from: a */
        public Void call() {
            if (C6520p.this.mo30714I()) {
                return null;
            }
            C6520p.this.f12263i.mo30842g(this.f12288e, this.f12289l);
            return null;
        }
    }

    /* renamed from: c.q.c.n.h.j.p$f */
    /* compiled from: CrashlyticsController */
    public class C6529f implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ long f12291e;

        /* renamed from: l */
        public final /* synthetic */ Throwable f12292l;

        /* renamed from: m */
        public final /* synthetic */ Thread f12293m;

        public C6529f(long j, Throwable th, Thread thread) {
            this.f12291e = j;
            this.f12292l = th;
            this.f12293m = thread;
        }

        public void run() {
            if (!C6520p.this.mo30714I()) {
                long a = C6520p.m18266F(this.f12291e);
                String b = C6520p.this.mo30711C();
                if (b == null) {
                    C6479f.m18125f().mo30649k("Tried to write a non-fatal exception while no session was open.");
                } else {
                    C6520p.this.f12266l.mo30674q(this.f12292l, this.f12293m, b, a);
                }
            }
        }
    }

    /* renamed from: c.q.c.n.h.j.p$g */
    /* compiled from: CrashlyticsController */
    public class C6530g implements Callable<Void> {

        /* renamed from: e */
        public final /* synthetic */ String f12295e;

        public C6530g(String str) {
            this.f12295e = str;
        }

        /* renamed from: a */
        public Void call() {
            C6520p.this.mo30732w(this.f12295e);
            return null;
        }
    }

    /* renamed from: c.q.c.n.h.j.p$h */
    /* compiled from: CrashlyticsController */
    public class C6531h implements Callable<Void> {

        /* renamed from: e */
        public final /* synthetic */ long f12297e;

        public C6531h(long j) {
            this.f12297e = j;
        }

        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong(NotificationCompat.CarExtender.KEY_TIMESTAMP, this.f12297e);
            C6520p.this.f12265k.mo30602a("_ae", bundle);
            return null;
        }
    }

    public C6520p(Context context, C6515o oVar, C6549z zVar, C6543w wVar, C6677f fVar, C6537r rVar, C6504h hVar, C6567i iVar, C6554e eVar, C6501f0 f0Var, C6472c cVar, C6481a aVar) {
        this.f12255a = context;
        this.f12259e = oVar;
        this.f12260f = zVar;
        this.f12256b = wVar;
        this.f12261g = fVar;
        this.f12257c = rVar;
        this.f12262h = hVar;
        this.f12258d = iVar;
        this.f12263i = eVar;
        this.f12264j = cVar;
        this.f12265k = aVar;
        this.f12266l = f0Var;
    }

    /* renamed from: B */
    public static boolean m18263B() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: D */
    public static long m18264D() {
        return m18266F(System.currentTimeMillis());
    }

    @NonNull
    /* renamed from: E */
    public static List<C6495c0> m18265E(C6480g gVar, String str, C6677f fVar, byte[] bArr) {
        File o = fVar.mo31294o(str, "user-data");
        File o2 = fVar.mo31294o(str, SavedStateHandle.KEYS);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6511l("logs_file", "logs", bArr));
        arrayList.add(new C6548y("crash_meta_file", "metadata", gVar.mo30635f()));
        arrayList.add(new C6548y("session_meta_file", "session", gVar.mo30634e()));
        arrayList.add(new C6548y("app_meta_file", "app", gVar.mo30630a()));
        arrayList.add(new C6548y("device_meta_file", EventBusConstKt.DEVICE, gVar.mo30632c()));
        arrayList.add(new C6548y("os_meta_file", "os", gVar.mo30631b()));
        arrayList.add(new C6548y("minidump_file", "minidump", gVar.mo30633d()));
        arrayList.add(new C6548y("user_meta_file", "user", o));
        arrayList.add(new C6548y("keys_file", SavedStateHandle.KEYS, o2));
        return arrayList;
    }

    /* renamed from: F */
    public static long m18266F(long j) {
        return j / 1000;
    }

    /* renamed from: o */
    public static C6595b0.C6596a m18281o(C6549z zVar, C6504h hVar) {
        return C6595b0.C6596a.m18576b(zVar.mo30818f(), hVar.f12216e, hVar.f12217f, zVar.mo30654a(), DeliveryMechanism.determineFrom(hVar.f12214c).getId(), hVar.f12218g);
    }

    /* renamed from: p */
    public static C6595b0.C6597b m18282p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return C6595b0.C6597b.m18583c(C6513n.m18234l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C6513n.m18241s(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), C6513n.m18247y(), C6513n.m18235m(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: q */
    public static C6595b0.C6598c m18283q() {
        return C6595b0.C6598c.m18593a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C6513n.m18248z());
    }

    /* renamed from: r */
    public static void m18284r(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    /* renamed from: A */
    public boolean mo30710A(C6696i iVar) {
        this.f12259e.mo30698b();
        if (mo30714I()) {
            C6479f.m18125f().mo30649k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C6479f.m18125f().mo30647i("Finalizing previously open sessions.");
        try {
            mo30731v(true, iVar);
            C6479f.m18125f().mo30647i("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            C6479f.m18125f().mo30644e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    @Nullable
    /* renamed from: C */
    public final String mo30711C() {
        SortedSet<String> l = this.f12266l.mo30669l();
        if (!l.isEmpty()) {
            return l.first();
        }
        return null;
    }

    /* renamed from: G */
    public void mo30712G(@NonNull C6696i iVar, @NonNull Thread thread, @NonNull Throwable th) {
        mo30713H(iVar, thread, th, false);
    }

    /* renamed from: H */
    public synchronized void mo30713H(@NonNull C6696i iVar, @NonNull Thread thread, @NonNull Throwable th, boolean z) {
        C6479f f = C6479f.m18125f();
        f.mo30641b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            C6505h0.m18191a(this.f12259e.mo30705i(new C6522b(System.currentTimeMillis(), th, thread, iVar, z)));
        } catch (TimeoutException unused) {
            C6479f.m18125f().mo30643d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e) {
            C6479f.m18125f().mo30644e("Error handling uncaught exception", e);
        }
    }

    /* renamed from: I */
    public boolean mo30714I() {
        C6540u uVar = this.f12267m;
        return uVar != null && uVar.mo30803a();
    }

    /* renamed from: K */
    public List<File> mo30715K() {
        return this.f12261g.mo31285f(f12254r);
    }

    /* renamed from: L */
    public final C5771j<Void> mo30716L(long j) {
        if (m18263B()) {
            C6479f.m18125f().mo30649k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return C5777m.m16414f(null);
        }
        C6479f.m18125f().mo30641b("Logging app exception event to Firebase Analytics");
        return C5777m.m16412d(new ScheduledThreadPoolExecutor(1), new C6531h(j));
    }

    /* renamed from: M */
    public final C5771j<Void> mo30717M() {
        ArrayList arrayList = new ArrayList();
        for (File next : mo30715K()) {
            try {
                arrayList.add(mo30716L(Long.parseLong(next.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C6479f f = C6479f.m18125f();
                f.mo30649k("Could not parse app exception timestamp from file " + next.getName());
            }
            next.delete();
        }
        return C5777m.m16415g(arrayList);
    }

    /* renamed from: N */
    public void mo30718N(String str) {
        this.f12259e.mo30704h(new C6530g(str));
    }

    /* renamed from: O */
    public C5771j<Void> mo30719O() {
        this.f12269o.mo28863e(Boolean.TRUE);
        return this.f12270p.mo28859a();
    }

    /* renamed from: P */
    public void mo30720P(String str, String str2) {
        try {
            this.f12258d.mo30881k(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f12255a;
            if (context == null || !C6513n.m18245w(context)) {
                C6479f.m18125f().mo30643d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e;
        }
    }

    /* renamed from: Q */
    public void mo30721Q(String str) {
        this.f12258d.mo30882l(str);
    }

    /* renamed from: R */
    public C5771j<Void> mo30722R(C5771j<C6688d> jVar) {
        if (!this.f12266l.mo30668j()) {
            C6479f.m18125f().mo30647i("No crash reports are available to be sent.");
            this.f12268n.mo28863e(Boolean.FALSE);
            return C5777m.m16414f(null);
        }
        C6479f.m18125f().mo30647i("Crash reports are available to be sent.");
        return mo30723S().mo28857r(new C6525d(jVar));
    }

    /* renamed from: S */
    public final C5771j<Boolean> mo30723S() {
        if (this.f12256b.mo30809d()) {
            C6479f.m18125f().mo30641b("Automatic data collection is enabled. Allowing upload.");
            this.f12268n.mo28863e(Boolean.FALSE);
            return C5777m.m16414f(Boolean.TRUE);
        }
        C6479f.m18125f().mo30641b("Automatic data collection is disabled.");
        C6479f.m18125f().mo30647i("Notifying that unsent reports are available.");
        this.f12268n.mo28863e(Boolean.TRUE);
        C5771j<TContinuationResult> r = this.f12256b.mo30812i().mo28857r(new C6524c(this));
        C6479f.m18125f().mo30641b("Waiting for send/deleteUnsentReports to be called.");
        return C6505h0.m18197g(r, this.f12269o.mo28859a());
    }

    /* renamed from: T */
    public final void mo30724T(String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            List historicalProcessExitReasons = ((ActivityManager) this.f12255a.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getHistoricalProcessExitReasons((String) null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f12266l.mo30675r(str, historicalProcessExitReasons, new C6554e(this.f12261g, str), C6567i.m18495h(str, this.f12261g, this.f12259e));
                return;
            }
            C6479f f = C6479f.m18125f();
            f.mo30647i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        C6479f f2 = C6479f.m18125f();
        f2.mo30647i("ANR feature enabled, but device is API " + Build.VERSION.SDK_INT);
    }

    /* renamed from: U */
    public void mo30725U(@NonNull Thread thread, @NonNull Throwable th) {
        this.f12259e.mo30703g(new C6529f(System.currentTimeMillis(), th, thread));
    }

    /* renamed from: V */
    public void mo30726V(long j, String str) {
        this.f12259e.mo30704h(new C6528e(j, str));
    }

    @NonNull
    /* renamed from: n */
    public C5771j<Boolean> mo30727n() {
        if (this.f12271q.compareAndSet(false, true)) {
            return this.f12268n.mo28859a();
        }
        C6479f.m18125f().mo30649k("checkForUnsentReports should only be called once per execution.");
        return C5777m.m16414f(Boolean.FALSE);
    }

    /* renamed from: s */
    public C5771j<Void> mo30728s() {
        this.f12269o.mo28863e(Boolean.FALSE);
        return this.f12270p.mo28859a();
    }

    /* renamed from: t */
    public boolean mo30729t() {
        if (!this.f12257c.mo30778c()) {
            String C = mo30711C();
            if (C == null || !this.f12264j.mo30628d(C)) {
                return false;
            }
            return true;
        }
        C6479f.m18125f().mo30647i("Found previous crash marker.");
        this.f12257c.mo30779d();
        return true;
    }

    /* renamed from: u */
    public void mo30730u(C6696i iVar) {
        mo30731v(false, iVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30731v(boolean r4, p040c.p200q.p363c.p370n.p371h.p381p.C6696i r5) {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            c.q.c.n.h.j.f0 r1 = r3.f12266l
            java.util.SortedSet r1 = r1.mo30669l()
            r0.<init>(r1)
            int r1 = r0.size()
            if (r1 > r4) goto L_0x001b
            c.q.c.n.h.f r4 = p040c.p200q.p363c.p370n.p371h.C6479f.m18125f()
            java.lang.String r5 = "No open sessions to be closed."
            r4.mo30647i(r5)
            return
        L_0x001b:
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            c.q.c.n.h.p.d r5 = r5.mo31323b()
            c.q.c.n.h.p.d$a r5 = r5.f12797b
            boolean r5 = r5.f12803b
            if (r5 == 0) goto L_0x002f
            r3.mo30724T(r1)
            goto L_0x0038
        L_0x002f:
            c.q.c.n.h.f r5 = p040c.p200q.p363c.p370n.p371h.C6479f.m18125f()
            java.lang.String r2 = "ANR feature disabled."
            r5.mo30647i(r2)
        L_0x0038:
            c.q.c.n.h.c r5 = r3.f12264j
            boolean r5 = r5.mo30628d(r1)
            if (r5 == 0) goto L_0x0043
            r3.mo30735z(r1)
        L_0x0043:
            r5 = 0
            if (r4 == 0) goto L_0x004e
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
        L_0x004e:
            c.q.c.n.h.j.f0 r4 = r3.f12266l
            long r0 = m18264D()
            r4.mo30666g(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p370n.p371h.p374j.C6520p.mo30731v(boolean, c.q.c.n.h.p.i):void");
    }

    /* renamed from: w */
    public final void mo30732w(String str) {
        long D = m18264D();
        C6479f f = C6479f.m18125f();
        f.mo30641b("Opening a new session with ID " + str);
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{C6532q.m18328l()});
        C6595b0.C6596a o = m18281o(this.f12260f, this.f12262h);
        C6595b0.C6598c q = m18283q();
        C6595b0.C6597b p = m18282p();
        this.f12264j.mo30627c(str, format, D, C6595b0.m18572b(o, q, p));
        this.f12263i.mo30840e(str);
        this.f12266l.mo30670m(str, D);
    }

    /* renamed from: x */
    public final void mo30733x(long j) {
        try {
            C6677f fVar = this.f12261g;
            if (!fVar.mo31284e(".ae" + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            C6479f.m18125f().mo30650l("Could not create app exception marker file.", e);
        }
    }

    /* renamed from: y */
    public void mo30734y(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C6696i iVar) {
        mo30718N(str);
        C6540u uVar = new C6540u(new C6521a(), iVar, uncaughtExceptionHandler, this.f12264j);
        this.f12267m = uVar;
        Thread.setDefaultUncaughtExceptionHandler(uVar);
    }

    /* renamed from: z */
    public final void mo30735z(String str) {
        C6479f f = C6479f.m18125f();
        f.mo30647i("Finalizing native report for session " + str);
        C6480g a = this.f12264j.mo30625a(str);
        File d = a.mo30633d();
        if (d == null || !d.exists()) {
            C6479f f2 = C6479f.m18125f();
            f2.mo30649k("No minidump data found for session " + str);
            return;
        }
        long lastModified = d.lastModified();
        C6554e eVar = new C6554e(this.f12261g, str);
        File i = this.f12261g.mo31288i(str);
        if (!i.isDirectory()) {
            C6479f.m18125f().mo30649k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        mo30733x(lastModified);
        List<C6495c0> E = m18265E(a, str, this.f12261g, eVar.mo30837b());
        C6497d0.m18161b(i, E);
        C6479f.m18125f().mo30641b("CrashlyticsController#finalizePreviousNativeSession");
        this.f12266l.mo30665f(str, E);
        eVar.mo30836a();
    }
}
