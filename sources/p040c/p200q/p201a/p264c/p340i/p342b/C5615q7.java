package p040c.p200q.p201a.p264c.p340i.p342b;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.DebugKt;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.q7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5615q7 extends C5432b4 {

    /* renamed from: c */
    public volatile C5519i7 f10777c;

    /* renamed from: d */
    public volatile C5519i7 f10778d;

    /* renamed from: e */
    public C5519i7 f10779e;

    /* renamed from: f */
    public final Map f10780f = new ConcurrentHashMap();
    @GuardedBy("activityLock")

    /* renamed from: g */
    public Activity f10781g;
    @GuardedBy("activityLock")

    /* renamed from: h */
    public volatile boolean f10782h;

    /* renamed from: i */
    public volatile C5519i7 f10783i;

    /* renamed from: j */
    public C5519i7 f10784j;
    @GuardedBy("activityLock")

    /* renamed from: k */
    public boolean f10785k;

    /* renamed from: l */
    public final Object f10786l = new Object();

    public C5615q7(C5648t4 t4Var) {
        super(t4Var);
    }

    /* renamed from: w */
    public static /* bridge */ /* synthetic */ void m16003w(C5615q7 q7Var, Bundle bundle, C5519i7 i7Var, C5519i7 i7Var2, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        q7Var.mo28549o(i7Var, i7Var2, j, true, q7Var.f10699a.mo28629N().mo28314v0((String) null, "screen_view", bundle, (List) null, false));
    }

    @MainThread
    /* renamed from: A */
    public final void mo28542A(Activity activity) {
        synchronized (this.f10786l) {
            this.f10785k = false;
            this.f10782h = true;
        }
        long b = this.f10699a.mo28488c().mo20839b();
        if (!this.f10699a.mo28649z().mo28237D()) {
            this.f10777c = null;
            this.f10699a.mo28486a().mo28540z(new C5579n7(this, b));
            return;
        }
        C5519i7 F = mo28547F(activity);
        this.f10778d = this.f10777c;
        this.f10777c = null;
        this.f10699a.mo28486a().mo28540z(new C5591o7(this, F, b));
    }

    @MainThread
    /* renamed from: B */
    public final void mo28543B(Activity activity) {
        synchronized (this.f10786l) {
            this.f10785k = true;
            if (activity != this.f10781g) {
                synchronized (this.f10786l) {
                    this.f10781g = activity;
                    this.f10782h = false;
                }
                if (this.f10699a.mo28649z().mo28237D()) {
                    this.f10783i = null;
                    this.f10699a.mo28486a().mo28540z(new C5603p7(this));
                }
            }
        }
        if (!this.f10699a.mo28649z().mo28237D()) {
            this.f10777c = this.f10783i;
            this.f10699a.mo28486a().mo28540z(new C5567m7(this));
            return;
        }
        mo28548G(activity, mo28547F(activity), false);
        C5712z1 y = this.f10699a.mo28648y();
        y.f10699a.mo28486a().mo28540z(new C5700y0(y, y.f10699a.mo28488c().mo20839b()));
    }

    @MainThread
    /* renamed from: C */
    public final void mo28544C(Activity activity, Bundle bundle) {
        C5519i7 i7Var;
        if (this.f10699a.mo28649z().mo28237D() && bundle != null && (i7Var = (C5519i7) this.f10780f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", i7Var.f10562c);
            bundle2.putString("name", i7Var.f10560a);
            bundle2.putString("referrer_name", i7Var.f10561b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r5.length() <= 100) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r6.length() <= 100) goto L_0x00cf;
     */
    @java.lang.Deprecated
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28545D(@androidx.annotation.NonNull android.app.Activity r4, @androidx.annotation.Size(max = 36, min = 1) java.lang.String r5, @androidx.annotation.Size(max = 36, min = 1) java.lang.String r6) {
        /*
            r3 = this;
            c.q.a.c.i.b.t4 r0 = r3.f10699a
            c.q.a.c.i.b.g r0 = r0.mo28649z()
            boolean r0 = r0.mo28237D()
            if (r0 != 0) goto L_0x001c
            c.q.a.c.i.b.t4 r4 = r3.f10699a
            c.q.a.c.i.b.i3 r4 = r4.mo28487b()
            c.q.a.c.i.b.g3 r4 = r4.mo28345x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.mo28259a(r5)
            return
        L_0x001c:
            c.q.a.c.i.b.i7 r0 = r3.f10777c
            if (r0 != 0) goto L_0x0030
            c.q.a.c.i.b.t4 r4 = r3.f10699a
            c.q.a.c.i.b.i3 r4 = r4.mo28487b()
            c.q.a.c.i.b.g3 r4 = r4.mo28345x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.mo28259a(r5)
            return
        L_0x0030:
            java.util.Map r1 = r3.f10780f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L_0x0048
            c.q.a.c.i.b.t4 r4 = r3.f10699a
            c.q.a.c.i.b.i3 r4 = r4.mo28487b()
            c.q.a.c.i.b.g3 r4 = r4.mo28345x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.mo28259a(r5)
            return
        L_0x0048:
            if (r6 != 0) goto L_0x0054
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.mo28553t(r6, r1)
        L_0x0054:
            java.lang.String r1 = r0.f10561b
            boolean r1 = p040c.p200q.p201a.p264c.p340i.p342b.C5531j7.m15797a(r1, r6)
            java.lang.String r0 = r0.f10560a
            boolean r0 = p040c.p200q.p201a.p264c.p340i.p342b.C5531j7.m15797a(r0, r5)
            if (r1 == 0) goto L_0x0075
            if (r0 != 0) goto L_0x0065
            goto L_0x0075
        L_0x0065:
            c.q.a.c.i.b.t4 r4 = r3.f10699a
            c.q.a.c.i.b.i3 r4 = r4.mo28487b()
            c.q.a.c.i.b.g3 r4 = r4.mo28345x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.mo28259a(r5)
            return
        L_0x0075:
            r0 = 100
            if (r5 == 0) goto L_0x00a3
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x008b
            c.q.a.c.i.b.t4 r1 = r3.f10699a
            r1.mo28649z()
            int r1 = r5.length()
            if (r1 > r0) goto L_0x008b
            goto L_0x00a3
        L_0x008b:
            c.q.a.c.i.b.t4 r4 = r3.f10699a
            c.q.a.c.i.b.i3 r4 = r4.mo28487b()
            c.q.a.c.i.b.g3 r4 = r4.mo28345x()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.mo28260b(r6, r5)
            return
        L_0x00a3:
            if (r6 == 0) goto L_0x00cf
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x00b7
            c.q.a.c.i.b.t4 r1 = r3.f10699a
            r1.mo28649z()
            int r1 = r6.length()
            if (r1 > r0) goto L_0x00b7
            goto L_0x00cf
        L_0x00b7:
            c.q.a.c.i.b.t4 r4 = r3.f10699a
            c.q.a.c.i.b.i3 r4 = r4.mo28487b()
            c.q.a.c.i.b.g3 r4 = r4.mo28345x()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.mo28260b(r6, r5)
            return
        L_0x00cf:
            c.q.a.c.i.b.t4 r0 = r3.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28343v()
            if (r5 != 0) goto L_0x00de
            java.lang.String r1 = "null"
            goto L_0x00df
        L_0x00de:
            r1 = r5
        L_0x00df:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.mo28261c(r2, r1, r6)
            c.q.a.c.i.b.i7 r0 = new c.q.a.c.i.b.i7
            c.q.a.c.i.b.t4 r1 = r3.f10699a
            c.q.a.c.i.b.ga r1 = r1.mo28629N()
            long r1 = r1.mo28308r0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f10780f
            r5.put(r4, r0)
            r5 = 1
            r3.mo28548G(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5615q7.mo28545D(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r2 > 100) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r4 > 100) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r0 = r12.f10699a.mo28487b().mo28343v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        if (r3 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        r1 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        if (r4 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r0.mo28261c("Logging screen view with name, class", r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r12.f10777c != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r0 = r12.f10778d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        r0 = r12.f10777c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e5, code lost:
        r2 = new p040c.p200q.p201a.p264c.p340i.p342b.C5519i7(r3, r4, r12.f10699a.mo28629N().mo28308r0(), true, r14);
        r12.f10777c = r2;
        r12.f10778d = r0;
        r12.f10783i = r2;
        r12.f10699a.mo28486a().mo28540z(new p040c.p200q.p201a.p264c.p340i.p342b.C5543k7(r12, r13, r2, r0, r12.f10699a.mo28488c().mo20839b()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        return;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28546E(android.os.Bundle r13, long r14) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f10786l
            monitor-enter(r0)
            boolean r1 = r12.f10785k     // Catch:{ all -> 0x011b }
            if (r1 != 0) goto L_0x0018
            c.q.a.c.i.b.t4 r13 = r12.f10699a     // Catch:{ all -> 0x011b }
            c.q.a.c.i.b.i3 r13 = r13.mo28487b()     // Catch:{ all -> 0x011b }
            c.q.a.c.i.b.g3 r13 = r13.mo28345x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Cannot log screen view event when the app is in the background."
            r13.mo28259a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x0018:
            java.lang.String r1 = "screen_name"
            java.lang.String r3 = r13.getString(r1)     // Catch:{ all -> 0x011b }
            r1 = 100
            if (r3 == 0) goto L_0x004c
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            if (r2 <= 0) goto L_0x0033
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            c.q.a.c.i.b.t4 r4 = r12.f10699a     // Catch:{ all -> 0x011b }
            r4.mo28649z()     // Catch:{ all -> 0x011b }
            if (r2 <= r1) goto L_0x004c
        L_0x0033:
            c.q.a.c.i.b.t4 r13 = r12.f10699a     // Catch:{ all -> 0x011b }
            c.q.a.c.i.b.i3 r13 = r13.mo28487b()     // Catch:{ all -> 0x011b }
            c.q.a.c.i.b.g3 r13 = r13.mo28345x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen name length for screen view. Length"
            int r15 = r3.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo28260b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x004c:
            java.lang.String r2 = "screen_class"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x007e
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            if (r4 <= 0) goto L_0x0065
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            c.q.a.c.i.b.t4 r5 = r12.f10699a     // Catch:{ all -> 0x011b }
            r5.mo28649z()     // Catch:{ all -> 0x011b }
            if (r4 <= r1) goto L_0x007e
        L_0x0065:
            c.q.a.c.i.b.t4 r13 = r12.f10699a     // Catch:{ all -> 0x011b }
            c.q.a.c.i.b.i3 r13 = r13.mo28487b()     // Catch:{ all -> 0x011b }
            c.q.a.c.i.b.g3 r13 = r13.mo28345x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen class length for screen view. Length"
            int r15 = r2.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo28260b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x007e:
            if (r2 != 0) goto L_0x0093
            android.app.Activity r1 = r12.f10781g     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x008f
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x011b }
            java.lang.String r2 = "Activity"
            java.lang.String r1 = r12.mo28553t(r1, r2)     // Catch:{ all -> 0x011b }
            goto L_0x0091
        L_0x008f:
            java.lang.String r1 = "Activity"
        L_0x0091:
            r4 = r1
            goto L_0x0094
        L_0x0093:
            r4 = r2
        L_0x0094:
            c.q.a.c.i.b.i7 r1 = r12.f10777c     // Catch:{ all -> 0x011b }
            boolean r2 = r12.f10782h     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            r2 = 0
            r12.f10782h = r2     // Catch:{ all -> 0x011b }
            java.lang.String r2 = r1.f10561b     // Catch:{ all -> 0x011b }
            boolean r2 = p040c.p200q.p201a.p264c.p340i.p342b.C5531j7.m15797a(r2, r4)     // Catch:{ all -> 0x011b }
            java.lang.String r1 = r1.f10560a     // Catch:{ all -> 0x011b }
            boolean r1 = p040c.p200q.p201a.p264c.p340i.p342b.C5531j7.m15797a(r1, r3)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            c.q.a.c.i.b.t4 r13 = r12.f10699a     // Catch:{ all -> 0x011b }
            c.q.a.c.i.b.i3 r13 = r13.mo28487b()     // Catch:{ all -> 0x011b }
            c.q.a.c.i.b.g3 r13 = r13.mo28345x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Ignoring call to log screen view event with duplicate parameters."
            r13.mo28259a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x00c0:
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            c.q.a.c.i.b.t4 r0 = r12.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28343v()
            if (r3 != 0) goto L_0x00d0
            java.lang.String r1 = "null"
            goto L_0x00d1
        L_0x00d0:
            r1 = r3
        L_0x00d1:
            if (r4 != 0) goto L_0x00d6
            java.lang.String r2 = "null"
            goto L_0x00d7
        L_0x00d6:
            r2 = r4
        L_0x00d7:
            java.lang.String r5 = "Logging screen view with name, class"
            r0.mo28261c(r5, r1, r2)
            c.q.a.c.i.b.i7 r0 = r12.f10777c
            if (r0 != 0) goto L_0x00e3
            c.q.a.c.i.b.i7 r0 = r12.f10778d
            goto L_0x00e5
        L_0x00e3:
            c.q.a.c.i.b.i7 r0 = r12.f10777c
        L_0x00e5:
            c.q.a.c.i.b.i7 r1 = new c.q.a.c.i.b.i7
            c.q.a.c.i.b.t4 r2 = r12.f10699a
            c.q.a.c.i.b.ga r2 = r2.mo28629N()
            long r5 = r2.mo28308r0()
            r7 = 1
            r2 = r1
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r12.f10777c = r1
            r12.f10778d = r0
            r12.f10783i = r1
            c.q.a.c.i.b.t4 r14 = r12.f10699a
            c.q.a.c.d.n.d r14 = r14.mo28488c()
            long r10 = r14.mo20839b()
            c.q.a.c.i.b.t4 r14 = r12.f10699a
            c.q.a.c.i.b.q4 r14 = r14.mo28486a()
            c.q.a.c.i.b.k7 r15 = new c.q.a.c.i.b.k7
            r5 = r15
            r6 = r12
            r7 = r13
            r8 = r1
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r14.mo28540z(r15)
            return
        L_0x011b:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5615q7.mo28546E(android.os.Bundle, long):void");
    }

    @MainThread
    /* renamed from: F */
    public final C5519i7 mo28547F(@NonNull Activity activity) {
        C3495o.m8908j(activity);
        C5519i7 i7Var = (C5519i7) this.f10780f.get(activity);
        if (i7Var == null) {
            C5519i7 i7Var2 = new C5519i7((String) null, mo28553t(activity.getClass(), "Activity"), this.f10699a.mo28629N().mo28308r0());
            this.f10780f.put(activity, i7Var2);
            i7Var = i7Var2;
        }
        return this.f10783i != null ? this.f10783i : i7Var;
    }

    @MainThread
    /* renamed from: G */
    public final void mo28548G(Activity activity, C5519i7 i7Var, boolean z) {
        C5519i7 i7Var2;
        C5519i7 i7Var3;
        C5519i7 i7Var4 = i7Var;
        if (this.f10777c == null) {
            i7Var2 = this.f10778d;
        } else {
            i7Var2 = this.f10777c;
        }
        C5519i7 i7Var5 = i7Var2;
        if (i7Var4.f10561b == null) {
            i7Var3 = new C5519i7(i7Var4.f10560a, activity != null ? mo28553t(activity.getClass(), "Activity") : null, i7Var4.f10562c, i7Var4.f10564e, i7Var4.f10565f);
        } else {
            i7Var3 = i7Var4;
        }
        this.f10778d = this.f10777c;
        this.f10777c = i7Var3;
        this.f10699a.mo28486a().mo28540z(new C5555l7(this, i7Var3, i7Var5, this.f10699a.mo28488c().mo20839b(), z));
    }

    /* renamed from: n */
    public final boolean mo28061n() {
        return false;
    }

    @WorkerThread
    /* renamed from: o */
    public final void mo28549o(C5519i7 i7Var, C5519i7 i7Var2, long j, boolean z, Bundle bundle) {
        Bundle bundle2;
        long j2;
        long j3;
        C5519i7 i7Var3 = i7Var;
        C5519i7 i7Var4 = i7Var2;
        long j4 = j;
        Bundle bundle3 = bundle;
        mo28029h();
        boolean z2 = false;
        boolean z3 = i7Var4 == null || i7Var4.f10562c != i7Var3.f10562c || !C5531j7.m15797a(i7Var4.f10561b, i7Var3.f10561b) || !C5531j7.m15797a(i7Var4.f10560a, i7Var3.f10560a);
        if (z && this.f10779e != null) {
            z2 = true;
        }
        if (z3) {
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            C5498ga.m15697y(i7Var3, bundle4, true);
            if (i7Var4 != null) {
                String str = i7Var4.f10560a;
                if (str != null) {
                    bundle4.putString("_pn", str);
                }
                String str2 = i7Var4.f10561b;
                if (str2 != null) {
                    bundle4.putString("_pc", str2);
                }
                bundle4.putLong("_pi", i7Var4.f10562c);
            }
            if (z2) {
                C5485f9 f9Var = this.f10699a.mo28628M().f10530e;
                long j5 = j4 - f9Var.f10476b;
                f9Var.f10476b = j4;
                if (j5 > 0) {
                    this.f10699a.mo28629N().mo28315w(bundle4, j5);
                }
            }
            if (!this.f10699a.mo28649z().mo28237D()) {
                bundle4.putLong("_mst", 1);
            }
            String str3 = true != i7Var3.f10564e ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : "app";
            long a = this.f10699a.mo28488c().mo20838a();
            if (i7Var3.f10564e) {
                j3 = a;
                long j6 = i7Var3.f10565f;
                if (j6 != 0) {
                    j2 = j6;
                    this.f10699a.mo28624I().mo28069v(str3, "_vs", j2, bundle4);
                }
            } else {
                j3 = a;
            }
            j2 = j3;
            this.f10699a.mo28624I().mo28069v(str3, "_vs", j2, bundle4);
        }
        if (z2) {
            mo28550p(this.f10779e, true, j4);
        }
        this.f10779e = i7Var3;
        if (i7Var3.f10564e) {
            this.f10784j = i7Var3;
        }
        this.f10699a.mo28627L().mo28579u(i7Var3);
    }

    @WorkerThread
    /* renamed from: p */
    public final void mo28550p(C5519i7 i7Var, boolean z, long j) {
        this.f10699a.mo28648y().mo28770n(this.f10699a.mo28488c().mo20839b());
        if (this.f10699a.mo28628M().f10530e.mo28232d(i7Var != null && i7Var.f10563d, z, j) && i7Var != null) {
            i7Var.f10563d = false;
        }
    }

    /* renamed from: r */
    public final C5519i7 mo28551r() {
        return this.f10777c;
    }

    @WorkerThread
    /* renamed from: s */
    public final C5519i7 mo28552s(boolean z) {
        mo28106i();
        mo28029h();
        if (!z) {
            return this.f10779e;
        }
        C5519i7 i7Var = this.f10779e;
        return i7Var != null ? i7Var : this.f10784j;
    }

    /* renamed from: t */
    public final String mo28553t(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.f10699a.mo28649z();
        if (length2 <= 100) {
            return str2;
        }
        this.f10699a.mo28649z();
        return str2.substring(0, 100);
    }

    @MainThread
    /* renamed from: y */
    public final void mo28554y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f10699a.mo28649z().mo28237D() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f10780f.put(activity, new C5519i7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    @MainThread
    /* renamed from: z */
    public final void mo28555z(Activity activity) {
        synchronized (this.f10786l) {
            if (activity == this.f10781g) {
                this.f10781g = null;
            }
        }
        if (this.f10699a.mo28649z().mo28237D()) {
            this.f10780f.remove(activity);
        }
    }
}
