package p040c.p200q.p201a.p264c.p276d.p281j;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p040c.p200q.p201a.p264c.p276d.C3326c;

/* renamed from: c.q.a.c.d.j.d */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C3453d<T extends IInterface> {

    /* renamed from: H */
    public static final Feature[] f6407H = new Feature[0];

    /* renamed from: A */
    public final int f6408A;
    @Nullable

    /* renamed from: B */
    public final String f6409B;
    @Nullable

    /* renamed from: C */
    public volatile String f6410C;
    @Nullable

    /* renamed from: D */
    public ConnectionResult f6411D;

    /* renamed from: E */
    public boolean f6412E;
    @Nullable

    /* renamed from: F */
    public volatile zzj f6413F;
    @NonNull

    /* renamed from: G */
    public AtomicInteger f6414G;
    @Nullable

    /* renamed from: e */
    public volatile String f6415e;

    /* renamed from: l */
    public C3517u1 f6416l;

    /* renamed from: m */
    public final Context f6417m;

    /* renamed from: n */
    public final C3468g f6418n;

    /* renamed from: o */
    public final C3326c f6419o;

    /* renamed from: p */
    public final Handler f6420p;

    /* renamed from: q */
    public final Object f6421q;

    /* renamed from: r */
    public final Object f6422r;
    @Nullable

    /* renamed from: s */
    public C3481k f6423s;
    @NonNull

    /* renamed from: t */
    public C3456c f6424t;
    @Nullable

    /* renamed from: u */
    public IInterface f6425u;

    /* renamed from: v */
    public final ArrayList f6426v;
    @Nullable

    /* renamed from: w */
    public C3467f1 f6427w;

    /* renamed from: x */
    public int f6428x;
    @Nullable

    /* renamed from: y */
    public final C3454a f6429y;
    @Nullable

    /* renamed from: z */
    public final C3455b f6430z;

    /* renamed from: c.q.a.c.d.j.d$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C3454a {
        /* renamed from: d */
        void mo20688d(int i);

        /* renamed from: g */
        void mo20689g(@Nullable Bundle bundle);
    }

    /* renamed from: c.q.a.c.d.j.d$b */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C3455b {
        /* renamed from: e */
        void mo20690e(@NonNull ConnectionResult connectionResult);
    }

    /* renamed from: c.q.a.c.d.j.d$c */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C3456c {
        /* renamed from: a */
        void mo20564a(@NonNull ConnectionResult connectionResult);
    }

    /* renamed from: c.q.a.c.d.j.d$d */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public class C3457d implements C3456c {
        public C3457d() {
        }

        /* renamed from: a */
        public final void mo20564a(@NonNull ConnectionResult connectionResult) {
            if (connectionResult.mo24487T()) {
                C3453d dVar = C3453d.this;
                dVar.mo20663b((C3474i) null, dVar.mo20647A());
            } else if (C3453d.this.f6430z != null) {
                C3453d.this.f6430z.mo20690e(connectionResult);
            }
        }
    }

    /* renamed from: c.q.a.c.d.j.d$e */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C3458e {
        /* renamed from: a */
        void mo20491a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3453d(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull android.os.Looper r11, int r12, @androidx.annotation.Nullable p040c.p200q.p201a.p264c.p276d.p281j.C3453d.C3454a r13, @androidx.annotation.Nullable p040c.p200q.p201a.p264c.p276d.p281j.C3453d.C3455b r14, @androidx.annotation.Nullable java.lang.String r15) {
        /*
            r9 = this;
            c.q.a.c.d.j.g r3 = p040c.p200q.p201a.p264c.p276d.p281j.C3468g.m8857b(r10)
            c.q.a.c.d.c r4 = p040c.p200q.p201a.p264c.p276d.C3326c.m8424f()
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r13)
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p276d.p281j.C3453d.<init>(android.content.Context, android.os.Looper, int, c.q.a.c.d.j.d$a, c.q.a.c.d.j.d$b, java.lang.String):void");
    }

    /* renamed from: a0 */
    public static /* bridge */ /* synthetic */ void m8765a0(C3453d dVar, zzj zzj) {
        RootTelemetryConfiguration rootTelemetryConfiguration;
        dVar.f6413F = zzj;
        if (dVar.mo20661Q()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzj.f8297n;
            C3498p b = C3498p.m8924b();
            if (connectionTelemetryConfiguration == null) {
                rootTelemetryConfiguration = null;
            } else {
                rootTelemetryConfiguration = connectionTelemetryConfiguration.mo24593U();
            }
            b.mo20774c(rootTelemetryConfiguration);
        }
    }

    /* renamed from: b0 */
    public static /* bridge */ /* synthetic */ void m8766b0(C3453d dVar, int i) {
        int i2;
        int i3;
        synchronized (dVar.f6421q) {
            i2 = dVar.f6428x;
        }
        if (i2 == 3) {
            dVar.f6412E = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = dVar.f6420p;
        handler.sendMessage(handler.obtainMessage(i3, dVar.f6414G.get(), 16));
    }

    /* renamed from: e0 */
    public static /* bridge */ /* synthetic */ boolean m8768e0(C3453d dVar, int i, int i2, IInterface iInterface) {
        synchronized (dVar.f6421q) {
            if (dVar.f6428x != i) {
                return false;
            }
            dVar.mo20671g0(i2, iInterface);
            return true;
        }
    }

    /* renamed from: f0 */
    public static /* bridge */ /* synthetic */ boolean m8769f0(C3453d dVar) {
        if (dVar.f6412E || TextUtils.isEmpty(dVar.mo20300C()) || TextUtils.isEmpty(dVar.mo20687z())) {
            return false;
        }
        try {
            Class.forName(dVar.mo20300C());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @NonNull
    /* renamed from: A */
    public Set<Scope> mo20647A() {
        return Collections.emptySet();
    }

    @NonNull
    /* renamed from: B */
    public final T mo20648B() {
        T t;
        synchronized (this.f6421q) {
            if (this.f6428x != 5) {
                mo20678p();
                t = this.f6425u;
                C3495o.m8909k(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    @NonNull
    /* renamed from: C */
    public abstract String mo20300C();

    @NonNull
    /* renamed from: D */
    public abstract String mo20301D();

    @NonNull
    /* renamed from: E */
    public String mo20649E() {
        return "com.google.android.gms";
    }

    @Nullable
    /* renamed from: F */
    public ConnectionTelemetryConfiguration mo20650F() {
        zzj zzj = this.f6413F;
        if (zzj == null) {
            return null;
        }
        return zzj.f8297n;
    }

    /* renamed from: G */
    public boolean mo20651G() {
        return mo20302j() >= 211700000;
    }

    /* renamed from: H */
    public boolean mo20652H() {
        return this.f6413F != null;
    }

    @CallSuper
    /* renamed from: I */
    public void mo20653I(@NonNull T t) {
        System.currentTimeMillis();
    }

    @CallSuper
    /* renamed from: J */
    public void mo20654J(@NonNull ConnectionResult connectionResult) {
        connectionResult.mo24483P();
        System.currentTimeMillis();
    }

    @CallSuper
    /* renamed from: K */
    public void mo20655K(int i) {
        System.currentTimeMillis();
    }

    /* renamed from: L */
    public void mo20656L(int i, @Nullable IBinder iBinder, @Nullable Bundle bundle, int i2) {
        Handler handler = this.f6420p;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C3470g1(this, i, iBinder, bundle)));
    }

    /* renamed from: M */
    public boolean mo20657M() {
        return false;
    }

    /* renamed from: N */
    public void mo20658N(@NonNull String str) {
        this.f6410C = str;
    }

    /* renamed from: O */
    public void mo20659O(int i) {
        Handler handler = this.f6420p;
        handler.sendMessage(handler.obtainMessage(6, this.f6414G.get(), i));
    }

    /* renamed from: P */
    public void mo20660P(@NonNull C3456c cVar, int i, @Nullable PendingIntent pendingIntent) {
        C3495o.m8909k(cVar, "Connection progress callbacks cannot be null.");
        this.f6424t = cVar;
        Handler handler = this.f6420p;
        handler.sendMessage(handler.obtainMessage(3, this.f6414G.get(), i, pendingIntent));
    }

    /* renamed from: Q */
    public boolean mo20661Q() {
        return false;
    }

    @NonNull
    /* renamed from: V */
    public final String mo20662V() {
        String str = this.f6409B;
        return str == null ? this.f6417m.getClass().getName() : str;
    }

    @WorkerThread
    /* renamed from: b */
    public void mo20663b(@Nullable C3474i iVar, @NonNull Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle y = mo20686y();
        int i = this.f6408A;
        String str = this.f6410C;
        int i2 = C3326c.f6203a;
        Scope[] scopeArr = GetServiceRequest.f8248y;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f8249z;
        GetServiceRequest getServiceRequest = r3;
        GetServiceRequest getServiceRequest2 = new GetServiceRequest(6, i, i2, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, featureArr, featureArr, true, 0, false, str);
        GetServiceRequest getServiceRequest3 = getServiceRequest;
        getServiceRequest3.f8253n = this.f6417m.getPackageName();
        getServiceRequest3.f8256q = y;
        if (set2 != null) {
            getServiceRequest3.f8255p = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (mo20676m()) {
            Account s = mo20680s();
            if (s == null) {
                s = new Account("<<default account>>", "com.google");
            }
            getServiceRequest3.f8257r = s;
            if (iVar != null) {
                getServiceRequest3.f8254o = iVar.asBinder();
            }
        } else if (mo20657M()) {
            getServiceRequest3.f8257r = mo20680s();
        }
        getServiceRequest3.f8258s = f6407H;
        getServiceRequest3.f8259t = mo20681t();
        if (mo20661Q()) {
            getServiceRequest3.f8262w = true;
        }
        try {
            synchronized (this.f6422r) {
                C3481k kVar = this.f6423s;
                if (kVar != null) {
                    kVar.mo20741z(new C3464e1(this, this.f6414G.get()), getServiceRequest3);
                }
            }
        } catch (DeadObjectException unused) {
            mo20659O(3);
        } catch (SecurityException e) {
            throw e;
        } catch (RemoteException | RuntimeException unused2) {
            mo20656L(8, (IBinder) null, (Bundle) null, this.f6414G.get());
        }
    }

    /* renamed from: c */
    public void mo20664c(@NonNull String str) {
        this.f6415e = str;
        disconnect();
    }

    /* renamed from: c0 */
    public final void mo20665c0(int i, @Nullable Bundle bundle, int i2) {
        Handler handler = this.f6420p;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C3473h1(this, i, (Bundle) null)));
    }

    /* renamed from: d */
    public boolean mo20666d() {
        boolean z;
        synchronized (this.f6421q) {
            int i = this.f6428x;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    public void disconnect() {
        this.f6414G.incrementAndGet();
        synchronized (this.f6426v) {
            int size = this.f6426v.size();
            for (int i = 0; i < size; i++) {
                ((C3460d1) this.f6426v.get(i)).mo20694d();
            }
            this.f6426v.clear();
        }
        synchronized (this.f6422r) {
            this.f6423s = null;
        }
        mo20671g0(1, (IInterface) null);
    }

    @NonNull
    /* renamed from: e */
    public String mo20668e() {
        C3517u1 u1Var;
        if (isConnected() && (u1Var = this.f6416l) != null) {
            return u1Var.mo20790b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: f */
    public void mo20669f(@NonNull C3456c cVar) {
        C3495o.m8909k(cVar, "Connection progress callbacks cannot be null.");
        this.f6424t = cVar;
        mo20671g0(2, (IInterface) null);
    }

    /* renamed from: g */
    public void mo20670g(@NonNull C3458e eVar) {
        eVar.mo20491a();
    }

    /* renamed from: g0 */
    public final void mo20671g0(int i, @Nullable IInterface iInterface) {
        C3517u1 u1Var;
        C3517u1 u1Var2;
        boolean z = false;
        if ((i == 4) == (iInterface != null)) {
            z = true;
        }
        C3495o.m8899a(z);
        synchronized (this.f6421q) {
            this.f6428x = i;
            this.f6425u = iInterface;
            if (i == 1) {
                C3467f1 f1Var = this.f6427w;
                if (f1Var != null) {
                    C3468g gVar = this.f6418n;
                    String c = this.f6416l.mo20791c();
                    C3495o.m8908j(c);
                    gVar.mo20722e(c, this.f6416l.mo20790b(), this.f6416l.mo20789a(), f1Var, mo20662V(), this.f6416l.mo20792d());
                    this.f6427w = null;
                }
            } else if (i == 2 || i == 3) {
                C3467f1 f1Var2 = this.f6427w;
                if (!(f1Var2 == null || (u1Var2 = this.f6416l) == null)) {
                    "Calling connect() while still connected, missing disconnect() for " + u1Var2.mo20791c() + " on " + u1Var2.mo20790b();
                    C3468g gVar2 = this.f6418n;
                    String c2 = this.f6416l.mo20791c();
                    C3495o.m8908j(c2);
                    gVar2.mo20722e(c2, this.f6416l.mo20790b(), this.f6416l.mo20789a(), f1Var2, mo20662V(), this.f6416l.mo20792d());
                    this.f6414G.incrementAndGet();
                }
                C3467f1 f1Var3 = new C3467f1(this, this.f6414G.get());
                this.f6427w = f1Var3;
                if (this.f6428x != 3 || mo20687z() == null) {
                    u1Var = new C3517u1(mo20649E(), mo20301D(), false, C3468g.m8856a(), mo20651G());
                } else {
                    u1Var = new C3517u1(mo20684w().getPackageName(), mo20687z(), true, C3468g.m8856a(), false);
                }
                this.f6416l = u1Var;
                if (u1Var.mo20792d()) {
                    if (mo20302j() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f6416l.mo20791c())));
                    }
                }
                C3468g gVar3 = this.f6418n;
                String c3 = this.f6416l.mo20791c();
                C3495o.m8908j(c3);
                if (!gVar3.mo20723f(new C3494n1(c3, this.f6416l.mo20790b(), this.f6416l.mo20789a(), this.f6416l.mo20792d()), f1Var3, mo20662V(), mo20682u())) {
                    "unable to connect to service: " + this.f6416l.mo20791c() + " on " + this.f6416l.mo20790b();
                    mo20665c0(16, (Bundle) null, this.f6414G.get());
                }
            } else if (i == 4) {
                C3495o.m8908j(iInterface);
                mo20653I(iInterface);
            }
        }
    }

    /* renamed from: h */
    public boolean mo20672h() {
        return true;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.f6421q) {
            z = this.f6428x == 4;
        }
        return z;
    }

    /* renamed from: j */
    public int mo20302j() {
        return C3326c.f6203a;
    }

    @Nullable
    /* renamed from: k */
    public final Feature[] mo20674k() {
        zzj zzj = this.f6413F;
        if (zzj == null) {
            return null;
        }
        return zzj.f8295l;
    }

    @Nullable
    /* renamed from: l */
    public String mo20675l() {
        return this.f6415e;
    }

    /* renamed from: m */
    public boolean mo20676m() {
        return false;
    }

    /* renamed from: o */
    public void mo20677o() {
        int h = this.f6419o.mo20389h(this.f6417m, mo20302j());
        if (h != 0) {
            mo20671g0(1, (IInterface) null);
            mo20660P(new C3457d(), h, (PendingIntent) null);
            return;
        }
        mo20669f(new C3457d());
    }

    /* renamed from: p */
    public final void mo20678p() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    @Nullable
    /* renamed from: q */
    public abstract T mo20304q(@NonNull IBinder iBinder);

    /* renamed from: r */
    public boolean mo20679r() {
        return false;
    }

    @Nullable
    /* renamed from: s */
    public Account mo20680s() {
        return null;
    }

    @NonNull
    /* renamed from: t */
    public Feature[] mo20681t() {
        return f6407H;
    }

    @Nullable
    /* renamed from: u */
    public Executor mo20682u() {
        return null;
    }

    @Nullable
    /* renamed from: v */
    public Bundle mo20683v() {
        return null;
    }

    @NonNull
    /* renamed from: w */
    public final Context mo20684w() {
        return this.f6417m;
    }

    /* renamed from: x */
    public int mo20685x() {
        return this.f6408A;
    }

    @NonNull
    /* renamed from: y */
    public Bundle mo20686y() {
        return new Bundle();
    }

    @Nullable
    /* renamed from: z */
    public String mo20687z() {
        return null;
    }

    public C3453d(@NonNull Context context, @NonNull Looper looper, @NonNull C3468g gVar, @NonNull C3326c cVar, int i, @Nullable C3454a aVar, @Nullable C3455b bVar, @Nullable String str) {
        this.f6415e = null;
        this.f6421q = new Object();
        this.f6422r = new Object();
        this.f6426v = new ArrayList();
        this.f6428x = 1;
        this.f6411D = null;
        this.f6412E = false;
        this.f6413F = null;
        this.f6414G = new AtomicInteger(0);
        C3495o.m8909k(context, "Context must not be null");
        this.f6417m = context;
        C3495o.m8909k(looper, "Looper must not be null");
        C3495o.m8909k(gVar, "Supervisor must not be null");
        this.f6418n = gVar;
        C3495o.m8909k(cVar, "API availability must not be null");
        this.f6419o = cVar;
        this.f6420p = new C3452c1(this, looper);
        this.f6408A = i;
        this.f6429y = aVar;
        this.f6430z = bVar;
        this.f6409B = str;
    }
}
