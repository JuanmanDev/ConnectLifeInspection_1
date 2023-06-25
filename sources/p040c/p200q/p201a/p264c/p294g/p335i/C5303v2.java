package p040c.p200q.p201a.p264c.p294g.p335i;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3553d;
import p040c.p200q.p201a.p264c.p276d.p289n.C3556g;
import p040c.p200q.p201a.p264c.p340i.p341a.C5413a;
import p040c.p200q.p201a.p264c.p340i.p342b.C5507h7;
import p040c.p200q.p201a.p264c.p340i.p342b.C5564m4;

/* renamed from: c.q.a.c.g.i.v2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
public final class C5303v2 {

    /* renamed from: i */
    public static volatile C5303v2 f10178i;

    /* renamed from: a */
    public final String f10179a;

    /* renamed from: b */
    public final C3553d f10180b;

    /* renamed from: c */
    public final ExecutorService f10181c;

    /* renamed from: d */
    public final C5413a f10182d;
    @GuardedBy("listenerList")

    /* renamed from: e */
    public final List f10183e;

    /* renamed from: f */
    public int f10184f;

    /* renamed from: g */
    public boolean f10185g;

    /* renamed from: h */
    public volatile C5040e1 f10186h;

    public C5303v2(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !mo27808o(str2, str3)) {
            this.f10179a = "FA";
        } else {
            this.f10179a = str;
        }
        this.f10180b = C3556g.m9065c();
        C5346y0.m15317a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C5025d2(this));
        boolean z = true;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f10181c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f10182d = new C5413a(this);
        this.f10183e = new ArrayList();
        try {
            if (C5507h7.m15764b(context, "google_app_id", C5564m4.m15891a(context)) != null && !mo27804k()) {
                this.f10185g = true;
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!mo27808o(str2, str3) && (str2 == null || str3 == null)) {
            boolean z2 = (str2 == null) ^ (str3 != null ? false : z);
        }
        mo27807n(new C5272t1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new C5288u2(this));
        }
    }

    /* renamed from: u */
    public static C5303v2 m15090u(Context context, String str, String str2, String str3, Bundle bundle) {
        C3495o.m8908j(context);
        if (f10178i == null) {
            synchronized (C5303v2.class) {
                if (f10178i == null) {
                    f10178i = new C5303v2(context, str, str2, str3, bundle);
                }
            }
        }
        return f10178i;
    }

    /* renamed from: A */
    public final List mo27789A(String str, String str2) {
        C4976a1 a1Var = new C4976a1();
        mo27807n(new C5227q1(this, str, str2, a1Var));
        List list = (List) C4976a1.m13744v(a1Var.mo26911e(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: B */
    public final Map mo27790B(String str, String str2, boolean z) {
        C4976a1 a1Var = new C4976a1();
        mo27807n(new C4993b2(this, str, str2, z, a1Var));
        Bundle e = a1Var.mo26911e(5000);
        if (e == null || e.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(e.size());
        for (String str3 : e.keySet()) {
            Object obj = e.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: F */
    public final void mo27791F(String str) {
        mo27807n(new C5287u1(this, str));
    }

    /* renamed from: G */
    public final void mo27792G(String str, String str2, Bundle bundle) {
        mo27807n(new C5212p1(this, str, str2, bundle));
    }

    /* renamed from: H */
    public final void mo27793H(String str) {
        mo27807n(new C5302v1(this, str));
    }

    /* renamed from: I */
    public final void mo27794I(@NonNull String str, Bundle bundle) {
        mo27806m((String) null, str, bundle, false, true, (Long) null);
    }

    /* renamed from: J */
    public final void mo27795J(String str, String str2, Bundle bundle) {
        mo27806m(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: a */
    public final void mo27796a(int i, String str, Object obj, Object obj2, Object obj3) {
        mo27807n(new C5009c2(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r4.f10186h == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.f10186h.registerOnMeasurementEventListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        mo27807n(new p040c.p200q.p201a.p264c.p294g.p335i.C5073g2(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27797b(p040c.p200q.p201a.p264c.p340i.p342b.C5672v5 r5) {
        /*
            r4 = this;
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r5)
            java.util.List r0 = r4.f10183e
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List r2 = r4.f10183e     // Catch:{ all -> 0x0047 }
            int r2 = r2.size()     // Catch:{ all -> 0x0047 }
            if (r1 >= r2) goto L_0x0024
            java.util.List r2 = r4.f10183e     // Catch:{ all -> 0x0047 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0047 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0047 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x0047 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0021
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return
        L_0x0021:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0024:
            c.q.a.c.g.i.l2 r1 = new c.q.a.c.g.i.l2     // Catch:{ all -> 0x0047 }
            r1.<init>(r5)     // Catch:{ all -> 0x0047 }
            java.util.List r2 = r4.f10183e     // Catch:{ all -> 0x0047 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0047 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0047 }
            r2.add(r3)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            c.q.a.c.g.i.e1 r5 = r4.f10186h
            if (r5 == 0) goto L_0x003e
            c.q.a.c.g.i.e1 r5 = r4.f10186h     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x003e }
            r5.registerOnMeasurementEventListener(r1)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x003e }
            return
        L_0x003e:
            c.q.a.c.g.i.g2 r5 = new c.q.a.c.g.i.g2
            r5.<init>(r4, r1)
            r4.mo27807n(r5)
            return
        L_0x0047:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5303v2.mo27797b(c.q.a.c.i.b.v5):void");
    }

    /* renamed from: c */
    public final void mo27798c(Bundle bundle) {
        mo27807n(new C5197o1(this, bundle));
    }

    /* renamed from: d */
    public final void mo27799d(Bundle bundle) {
        mo27807n(new C5257s1(this, bundle));
    }

    /* renamed from: e */
    public final void mo27800e(Activity activity, String str, String str2) {
        mo27807n(new C5242r1(this, activity, str, str2));
    }

    /* renamed from: f */
    public final void mo27801f(boolean z) {
        mo27807n(new C5057f2(this, z));
    }

    /* renamed from: g */
    public final void mo27802g(String str, String str2, Object obj, boolean z) {
        mo27807n(new C5121j2(this, str, str2, obj, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r3.f10186h == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3.f10186h.unregisterOnMeasurementEventListener(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        mo27807n(new p040c.p200q.p201a.p264c.p294g.p335i.C5089h2(r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27803h(p040c.p200q.p201a.p264c.p340i.p342b.C5672v5 r4) {
        /*
            r3 = this;
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r4)
            java.util.List r0 = r3.f10183e
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List r2 = r3.f10183e     // Catch:{ all -> 0x004d }
            int r2 = r2.size()     // Catch:{ all -> 0x004d }
            if (r1 >= r2) goto L_0x002b
            java.util.List r2 = r3.f10183e     // Catch:{ all -> 0x004d }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x004d }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x004d }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x004d }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x0028
            java.util.List r4 = r3.f10183e     // Catch:{ all -> 0x004d }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x004d }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x004d }
            goto L_0x002c
        L_0x0028:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x002b:
            r4 = 0
        L_0x002c:
            if (r4 != 0) goto L_0x0030
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x0030:
            java.util.List r1 = r3.f10183e     // Catch:{ all -> 0x004d }
            r1.remove(r4)     // Catch:{ all -> 0x004d }
            java.lang.Object r4 = r4.second     // Catch:{ all -> 0x004d }
            c.q.a.c.g.i.l2 r4 = (p040c.p200q.p201a.p264c.p294g.p335i.C5153l2) r4     // Catch:{ all -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            c.q.a.c.g.i.e1 r0 = r3.f10186h
            if (r0 == 0) goto L_0x0044
            c.q.a.c.g.i.e1 r0 = r3.f10186h     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0044 }
            r0.unregisterOnMeasurementEventListener(r4)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0044 }
            return
        L_0x0044:
            c.q.a.c.g.i.h2 r0 = new c.q.a.c.g.i.h2
            r0.<init>(r3, r4)
            r3.mo27807n(r0)
            return
        L_0x004d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5303v2.mo27803h(c.q.a.c.i.b.v5):void");
    }

    /* renamed from: k */
    public final boolean mo27804k() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: l */
    public final void mo27805l(Exception exc, boolean z, boolean z2) {
        this.f10185g |= z;
        if (!z && z2) {
            mo27796a(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
    }

    /* renamed from: m */
    public final void mo27806m(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        mo27807n(new C5105i2(this, l, str, str2, bundle, z, z2));
    }

    /* renamed from: n */
    public final void mo27807n(C5137k2 k2Var) {
        this.f10181c.execute(k2Var);
    }

    /* renamed from: o */
    public final boolean mo27808o(String str, String str2) {
        return (str2 == null || str == null || mo27804k()) ? false : true;
    }

    /* renamed from: p */
    public final int mo27809p(String str) {
        C4976a1 a1Var = new C4976a1();
        mo27807n(new C5041e2(this, str, a1Var));
        Integer num = (Integer) C4976a1.m13744v(a1Var.mo26911e(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: q */
    public final long mo27810q() {
        C4976a1 a1Var = new C4976a1();
        mo27807n(new C5347y1(this, a1Var));
        Long g = a1Var.mo26912g(500);
        if (g != null) {
            return g.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f10180b.mo20838a()).nextLong();
        int i = this.f10184f + 1;
        this.f10184f = i;
        return nextLong + ((long) i);
    }

    /* renamed from: r */
    public final C5413a mo27811r() {
        return this.f10182d;
    }

    /* renamed from: t */
    public final C5040e1 mo27812t(Context context, boolean z) {
        try {
            return C5024d1.asInterface(DynamiteModule.m11032d(context, DynamiteModule.f8367b, ModuleDescriptor.MODULE_ID).mo24664c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            mo27805l(e, true, false);
            return null;
        }
    }

    /* renamed from: w */
    public final String mo27813w() {
        C4976a1 a1Var = new C4976a1();
        mo27807n(new C5332x1(this, a1Var));
        return a1Var.mo26913k(50);
    }

    /* renamed from: x */
    public final String mo27814x() {
        C4976a1 a1Var = new C4976a1();
        mo27807n(new C4977a2(this, a1Var));
        return a1Var.mo26913k(500);
    }

    /* renamed from: y */
    public final String mo27815y() {
        C4976a1 a1Var = new C4976a1();
        mo27807n(new C5362z1(this, a1Var));
        return a1Var.mo26913k(500);
    }

    /* renamed from: z */
    public final String mo27816z() {
        C4976a1 a1Var = new C4976a1();
        mo27807n(new C5317w1(this, a1Var));
        return a1Var.mo26913k(500);
    }
}
