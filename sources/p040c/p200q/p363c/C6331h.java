package p040c.p200q.p363c;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.p028os.UserManagerCompat;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3365c;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3552c;
import p040c.p200q.p201a.p264c.p276d.p289n.C3562m;
import p040c.p200q.p201a.p264c.p276d.p289n.C3563n;
import p040c.p200q.p363c.p369m.C6439o;
import p040c.p200q.p363c.p369m.C6443q;
import p040c.p200q.p363c.p369m.C6449t;
import p040c.p200q.p363c.p369m.C6458x;
import p040c.p200q.p363c.p389r.C6738c;
import p040c.p200q.p363c.p390s.C6746g;
import p040c.p200q.p363c.p393u.C6757b;
import p040c.p200q.p363c.p399w.C6795a;
import p040c.p200q.p363c.p404z.C6882b;
import p040c.p200q.p363c.p404z.C6883c;

/* renamed from: c.q.c.h */
/* compiled from: FirebaseApp */
public class C6331h {

    /* renamed from: k */
    public static final Object f11973k = new Object();

    /* renamed from: l */
    public static final Executor f11974l = new C6335d();
    @GuardedBy("LOCK")

    /* renamed from: m */
    public static final Map<String, C6331h> f11975m = new ArrayMap();

    /* renamed from: a */
    public final Context f11976a;

    /* renamed from: b */
    public final String f11977b;

    /* renamed from: c */
    public final C6338j f11978c;

    /* renamed from: d */
    public final C6449t f11979d;

    /* renamed from: e */
    public final AtomicBoolean f11980e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f11981f = new AtomicBoolean();

    /* renamed from: g */
    public final C6458x<C6795a> f11982g;

    /* renamed from: h */
    public final C6757b<C6746g> f11983h;

    /* renamed from: i */
    public final List<C6333b> f11984i = new CopyOnWriteArrayList();

    /* renamed from: j */
    public final List<C6337i> f11985j = new CopyOnWriteArrayList();

    /* renamed from: c.q.c.h$b */
    /* compiled from: FirebaseApp */
    public interface C6333b {
        /* renamed from: a */
        void mo30391a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: c.q.c.h$c */
    /* compiled from: FirebaseApp */
    public static class C6334c implements C3365c.C3366a {

        /* renamed from: a */
        public static AtomicReference<C6334c> f11986a = new AtomicReference<>();

        /* renamed from: c */
        public static void m17811c(Context context) {
            if (C3562m.m9080a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f11986a.get() == null) {
                    C6334c cVar = new C6334c();
                    if (f11986a.compareAndSet((Object) null, cVar)) {
                        C3365c.m8513d(application);
                        C3365c.m8512b().mo20467a(cVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo20481a(boolean z) {
            synchronized (C6331h.f11973k) {
                Iterator it = new ArrayList(C6331h.f11975m.values()).iterator();
                while (it.hasNext()) {
                    C6331h hVar = (C6331h) it.next();
                    if (hVar.f11980e.get()) {
                        hVar.mo30414z(z);
                    }
                }
            }
        }
    }

    /* renamed from: c.q.c.h$d */
    /* compiled from: FirebaseApp */
    public static class C6335d implements Executor {

        /* renamed from: e */
        public static final Handler f11987e = new Handler(Looper.getMainLooper());

        public C6335d() {
        }

        public void execute(@NonNull Runnable runnable) {
            f11987e.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: c.q.c.h$e */
    /* compiled from: FirebaseApp */
    public static class C6336e extends BroadcastReceiver {

        /* renamed from: b */
        public static AtomicReference<C6336e> f11988b = new AtomicReference<>();

        /* renamed from: a */
        public final Context f11989a;

        public C6336e(Context context) {
            this.f11989a = context;
        }

        /* renamed from: b */
        public static void m17814b(Context context) {
            if (f11988b.get() == null) {
                C6336e eVar = new C6336e(context);
                if (f11988b.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void mo30416c() {
            this.f11989a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (C6331h.f11973k) {
                for (C6331h b : C6331h.f11975m.values()) {
                    b.mo30408q();
                }
            }
            mo30416c();
        }
    }

    public C6331h(Context context, String str, C6338j jVar) {
        C3495o.m8908j(context);
        this.f11976a = context;
        C3495o.m8904f(str);
        this.f11977b = str;
        C3495o.m8908j(jVar);
        this.f11978c = jVar;
        C6883c.m19557b("Firebase");
        C6883c.m19557b("ComponentDiscovery");
        List<C6757b<ComponentRegistrar>> a = C6443q.m17998b(context, ComponentDiscoveryService.class).mo30559a();
        C6883c.m19556a();
        C6883c.m19557b("Runtime");
        C6449t.C6451b f = C6449t.m18008f(f11974l);
        f.mo30573c(a);
        f.mo30572b(new FirebaseCommonRegistrar());
        f.mo30571a(C6439o.m17973o(context, Context.class, new Class[0]));
        f.mo30571a(C6439o.m17973o(this, C6331h.class, new Class[0]));
        f.mo30571a(C6439o.m17973o(jVar, C6338j.class, new Class[0]));
        f.mo30575f(new C6882b());
        this.f11979d = f.mo30574d();
        C6883c.m19556a();
        this.f11982g = new C6458x<>(new C6325b(this, context));
        this.f11983h = this.f11979d.mo30530b(C6746g.class);
        mo30398e(new C6324a(this));
        C6883c.m19556a();
    }

    /* renamed from: i */
    public static List<String> m17783i() {
        ArrayList arrayList = new ArrayList();
        synchronized (f11973k) {
            for (C6331h n : f11975m.values()) {
                arrayList.add(n.mo30405n());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @NonNull
    /* renamed from: k */
    public static List<C6331h> m17784k(@NonNull Context context) {
        ArrayList arrayList;
        synchronized (f11973k) {
            arrayList = new ArrayList(f11975m.values());
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: l */
    public static C6331h m17785l() {
        C6331h hVar;
        synchronized (f11973k) {
            hVar = f11975m.get("[DEFAULT]");
            if (hVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C3563n.m9092a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return hVar;
    }

    @NonNull
    /* renamed from: m */
    public static C6331h m17786m(@NonNull String str) {
        C6331h hVar;
        String str2;
        synchronized (f11973k) {
            hVar = f11975m.get(m17790y(str));
            if (hVar != null) {
                hVar.f11983h.get().mo31421i();
            } else {
                List<String> i = m17783i();
                if (i.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", i);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return hVar;
    }

    @Nullable
    /* renamed from: r */
    public static C6331h m17787r(@NonNull Context context) {
        synchronized (f11973k) {
            if (f11975m.containsKey("[DEFAULT]")) {
                C6331h l = m17785l();
                return l;
            }
            C6338j a = C6338j.m17817a(context);
            if (a == null) {
                return null;
            }
            C6331h s = m17788s(context, a);
            return s;
        }
    }

    @NonNull
    /* renamed from: s */
    public static C6331h m17788s(@NonNull Context context, @NonNull C6338j jVar) {
        return m17789t(context, jVar, "[DEFAULT]");
    }

    @NonNull
    /* renamed from: t */
    public static C6331h m17789t(@NonNull Context context, @NonNull C6338j jVar, @NonNull String str) {
        C6331h hVar;
        C6334c.m17811c(context);
        String y = m17790y(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f11973k) {
            boolean z = !f11975m.containsKey(y);
            C3495o.m8912n(z, "FirebaseApp name " + y + " already exists!");
            C3495o.m8909k(context, "Application context cannot be null.");
            hVar = new C6331h(context, y, jVar);
            f11975m.put(y, hVar);
        }
        hVar.mo30408q();
        return hVar;
    }

    /* renamed from: y */
    public static String m17790y(@NonNull String str) {
        return str.trim();
    }

    /* renamed from: A */
    public final void mo30394A() {
        for (C6337i a : this.f11985j) {
            a.mo30418a(this.f11977b, this.f11978c);
        }
    }

    /* renamed from: B */
    public void mo30395B(boolean z) {
        mo30400f();
        if (this.f11980e.compareAndSet(!z, z)) {
            boolean e = C3365c.m8512b().mo20468e();
            if (z && e) {
                mo30414z(true);
            } else if (!z && e) {
                mo30414z(false);
            }
        }
    }

    /* renamed from: C */
    public void mo30396C(Boolean bool) {
        mo30400f();
        this.f11982g.get().mo31564e(bool);
    }

    @Deprecated
    /* renamed from: D */
    public void mo30397D(boolean z) {
        mo30396C(Boolean.valueOf(z));
    }

    /* renamed from: e */
    public void mo30398e(C6333b bVar) {
        mo30400f();
        if (this.f11980e.get() && C3365c.m8512b().mo20468e()) {
            bVar.mo30391a(true);
        }
        this.f11984i.add(bVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6331h)) {
            return false;
        }
        return this.f11977b.equals(((C6331h) obj).mo30405n());
    }

    /* renamed from: f */
    public final void mo30400f() {
        C3495o.m8912n(!this.f11981f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: g */
    public void mo30401g() {
        if (this.f11981f.compareAndSet(false, true)) {
            synchronized (f11973k) {
                f11975m.remove(this.f11977b);
            }
            mo30394A();
        }
    }

    /* renamed from: h */
    public <T> T mo30402h(Class<T> cls) {
        mo30400f();
        return this.f11979d.mo30529a(cls);
    }

    public int hashCode() {
        return this.f11977b.hashCode();
    }

    @NonNull
    /* renamed from: j */
    public Context mo30404j() {
        mo30400f();
        return this.f11976a;
    }

    @NonNull
    /* renamed from: n */
    public String mo30405n() {
        mo30400f();
        return this.f11977b;
    }

    @NonNull
    /* renamed from: o */
    public C6338j mo30406o() {
        mo30400f();
        return this.f11978c;
    }

    /* renamed from: p */
    public String mo30407p() {
        return C3552c.m9058e(mo30405n().getBytes(Charset.defaultCharset())) + "+" + C3552c.m9058e(mo30406o().mo30420c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: q */
    public final void mo30408q() {
        if (!UserManagerCompat.isUserUnlocked(this.f11976a)) {
            "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + mo30405n();
            C6336e.m17814b(this.f11976a);
            return;
        }
        "Device unlocked: initializing all Firebase APIs for app " + mo30405n();
        this.f11979d.mo30565i(mo30411v());
        this.f11983h.get().mo31421i();
    }

    public String toString() {
        C3487m.C3488a c = C3487m.m8888c(this);
        c.mo20747a("name", this.f11977b);
        c.mo20747a("options", this.f11978c);
        return c.toString();
    }

    /* renamed from: u */
    public boolean mo30410u() {
        mo30400f();
        return this.f11982g.get().mo31561b();
    }

    @VisibleForTesting
    /* renamed from: v */
    public boolean mo30411v() {
        return "[DEFAULT]".equals(mo30405n());
    }

    /* renamed from: w */
    public /* synthetic */ C6795a mo30412w(Context context) {
        return new C6795a(context, mo30407p(), (C6738c) this.f11979d.mo30529a(C6738c.class));
    }

    /* renamed from: x */
    public /* synthetic */ void mo30413x(boolean z) {
        if (!z) {
            this.f11983h.get().mo31421i();
        }
    }

    /* renamed from: z */
    public final void mo30414z(boolean z) {
        for (C6333b a : this.f11984i) {
            a.mo30391a(z);
        }
    }
}
