package p040c.p200q.p201a.p264c.p340i.p342b;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.WorkerThread;
import androidx.appcompat.widget.TooltipCompatHandler;
import androidx.collection.ArrayMap;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzkw;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p294g.p335i.C5179md;
import p040c.p200q.p201a.p264c.p294g.p335i.C5193nc;

/* renamed from: c.q.a.c.i.b.a7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5423a7 extends C5432b4 {

    /* renamed from: c */
    public C5717z6 f10322c;

    /* renamed from: d */
    public C5661u5 f10323d;

    /* renamed from: e */
    public final Set f10324e = new CopyOnWriteArraySet();

    /* renamed from: f */
    public boolean f10325f;

    /* renamed from: g */
    public final AtomicReference f10326g = new AtomicReference();

    /* renamed from: h */
    public final Object f10327h = new Object();
    @GuardedBy("consentLock")

    /* renamed from: i */
    public C5499h f10328i = new C5499h((Boolean) null, (Boolean) null);
    @GuardedBy("consentLock")

    /* renamed from: j */
    public int f10329j = 100;

    /* renamed from: k */
    public final AtomicLong f10330k = new AtomicLong(0);

    /* renamed from: l */
    public long f10331l = -1;

    /* renamed from: m */
    public int f10332m = 100;

    /* renamed from: n */
    public final C5570ma f10333n;

    /* renamed from: o */
    public boolean f10334o = true;

    /* renamed from: p */
    public final C5486fa f10335p = new C5590o6(this);

    public C5423a7(C5648t4 t4Var) {
        super(t4Var);
        this.f10333n = new C5570ma(t4Var);
    }

    /* renamed from: b0 */
    public static /* bridge */ /* synthetic */ void m15445b0(C5423a7 a7Var, C5499h hVar, C5499h hVar2) {
        boolean z;
        zzah[] zzahArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            zzah zzah = zzahArr[i];
            if (!hVar2.mo28326i(zzah) && hVar.mo28326i(zzah)) {
                z = true;
                break;
            }
            i++;
        }
        boolean l = hVar.mo28328l(hVar2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (z || l) {
            a7Var.f10699a.mo28618B().mo28710v();
        }
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m15446c0(C5423a7 a7Var, C5499h hVar, int i, long j, boolean z, boolean z2) {
        a7Var.mo28029h();
        a7Var.mo28106i();
        if (j > a7Var.f10331l || !C5499h.m15751j(a7Var.f10332m, i)) {
            C5692x3 F = a7Var.f10699a.mo28622F();
            C5648t4 t4Var = F.f10699a;
            F.mo28029h();
            if (F.mo28687w(i)) {
                SharedPreferences.Editor edit = F.mo28679o().edit();
                edit.putString("consent_settings", hVar.mo28324h());
                edit.putInt("consent_source", i);
                edit.apply();
                a7Var.f10331l = j;
                a7Var.f10332m = i;
                a7Var.f10699a.mo28627L().mo28578t(z);
                if (z2) {
                    a7Var.f10699a.mo28627L().mo28568S(new AtomicReference());
                    return;
                }
                return;
            }
            a7Var.f10699a.mo28487b().mo28342u().mo28260b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        a7Var.f10699a.mo28487b().mo28342u().mo28260b("Dropped out-of-date consent setting, proposed settings", hVar);
    }

    /* renamed from: A */
    public final void mo28033A(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.f10699a.mo28486a().mo28540z(new C5482f6(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* renamed from: B */
    public final void mo28034B(String str, String str2, long j, Object obj) {
        this.f10699a.mo28486a().mo28540z(new C5494g6(this, str, str2, obj, j));
    }

    /* renamed from: C */
    public final void mo28035C(String str) {
        this.f10326g.set(str);
    }

    /* renamed from: D */
    public final void mo28036D(Bundle bundle) {
        mo28037E(bundle, this.f10699a.mo28488c().mo20838a());
    }

    /* renamed from: E */
    public final void mo28037E(Bundle bundle, long j) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        C3495o.m8908j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f10699a.mo28487b().mo28344w().mo28259a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C3495o.m8908j(bundle2);
        C5613q5.m15998a(bundle2, "app_id", cls2, (Object) null);
        C5613q5.m15998a(bundle2, EventBusConstKt.ORIGIN, cls2, (Object) null);
        C5613q5.m15998a(bundle2, "name", cls2, (Object) null);
        C5613q5.m15998a(bundle2, "value", Object.class, (Object) null);
        C5613q5.m15998a(bundle2, "trigger_event_name", cls2, (Object) null);
        C5613q5.m15998a(bundle2, "trigger_timeout", cls, 0L);
        C5613q5.m15998a(bundle2, "timed_out_event_name", cls2, (Object) null);
        C5613q5.m15998a(bundle2, "timed_out_event_params", Bundle.class, (Object) null);
        C5613q5.m15998a(bundle2, "triggered_event_name", cls2, (Object) null);
        C5613q5.m15998a(bundle2, "triggered_event_params", Bundle.class, (Object) null);
        C5613q5.m15998a(bundle2, "time_to_live", cls, 0L);
        C5613q5.m15998a(bundle2, "expired_event_name", cls2, (Object) null);
        C5613q5.m15998a(bundle2, "expired_event_params", Bundle.class, (Object) null);
        C3495o.m8904f(bundle2.getString("name"));
        C3495o.m8904f(bundle2.getString(EventBusConstKt.ORIGIN));
        C3495o.m8908j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f10699a.mo28629N().mo28301n0(string) != 0) {
            this.f10699a.mo28487b().mo28339r().mo28260b("Invalid conditional user property name", this.f10699a.mo28620D().mo28146f(string));
        } else if (this.f10699a.mo28629N().mo28297j0(string, obj) == 0) {
            Object p = this.f10699a.mo28629N().mo28304p(string, obj);
            if (p == null) {
                this.f10699a.mo28487b().mo28339r().mo28261c("Unable to normalize conditional user property value", this.f10699a.mo28620D().mo28146f(string), obj);
                return;
            }
            C5613q5.m15999b(bundle2, p);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                this.f10699a.mo28649z();
                if (j2 > 15552000000L || j2 < 1) {
                    this.f10699a.mo28487b().mo28339r().mo28261c("Invalid conditional user property timeout", this.f10699a.mo28620D().mo28146f(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong("time_to_live");
            this.f10699a.mo28649z();
            if (j3 > 15552000000L || j3 < 1) {
                this.f10699a.mo28487b().mo28339r().mo28261c("Invalid conditional user property time to live", this.f10699a.mo28620D().mo28146f(string), Long.valueOf(j3));
            } else {
                this.f10699a.mo28486a().mo28540z(new C5518i6(this, bundle2));
            }
        } else {
            this.f10699a.mo28487b().mo28339r().mo28261c("Invalid conditional user property value", this.f10699a.mo28620D().mo28146f(string), obj);
        }
    }

    /* renamed from: F */
    public final void mo28038F(Bundle bundle, int i, long j) {
        mo28106i();
        String g = C5499h.m15750g(bundle);
        if (g != null) {
            this.f10699a.mo28487b().mo28345x().mo28260b("Ignoring invalid consent setting", g);
            this.f10699a.mo28487b().mo28345x().mo28259a("Valid consent values are 'granted', 'denied'");
        }
        mo28039G(C5499h.m15748a(bundle), i, j);
    }

    /* renamed from: G */
    public final void mo28039G(C5499h hVar, int i, long j) {
        C5499h hVar2;
        boolean z;
        boolean z2;
        boolean z3;
        C5499h hVar3 = hVar;
        int i2 = i;
        mo28106i();
        if (i2 != -10 && hVar.mo28321e() == null && hVar.mo28323f() == null) {
            this.f10699a.mo28487b().mo28345x().mo28259a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f10327h) {
            hVar2 = this.f10328i;
            z = true;
            z2 = false;
            if (C5499h.m15751j(i2, this.f10329j)) {
                boolean k = hVar3.mo28327k(this.f10328i);
                if (hVar3.mo28326i(zzah.ANALYTICS_STORAGE) && !this.f10328i.mo28326i(zzah.ANALYTICS_STORAGE)) {
                    z2 = true;
                }
                hVar3 = hVar3.mo28320d(this.f10328i);
                this.f10328i = hVar3;
                this.f10329j = i2;
                z3 = z2;
                z2 = k;
            } else {
                z = false;
                z3 = false;
            }
        }
        if (!z) {
            this.f10699a.mo28487b().mo28342u().mo28260b("Ignoring lower-priority consent settings, proposed settings", hVar3);
            return;
        }
        long andIncrement = this.f10330k.getAndIncrement();
        if (z2) {
            this.f10326g.set((Object) null);
            this.f10699a.mo28486a().mo28533A(new C5662u6(this, hVar3, j, i, andIncrement, z3, hVar2));
            return;
        }
        C5673v6 v6Var = new C5673v6(this, hVar3, i, andIncrement, z3, hVar2);
        if (i2 == 30 || i2 == -10) {
            this.f10699a.mo28486a().mo28533A(v6Var);
        } else {
            this.f10699a.mo28486a().mo28540z(v6Var);
        }
    }

    @WorkerThread
    /* renamed from: H */
    public final void mo28040H(C5661u5 u5Var) {
        C5661u5 u5Var2;
        mo28029h();
        mo28106i();
        if (!(u5Var == null || u5Var == (u5Var2 = this.f10323d))) {
            C3495o.m8912n(u5Var2 == null, "EventInterceptor already set.");
        }
        this.f10323d = u5Var;
    }

    /* renamed from: I */
    public final void mo28041I(Boolean bool) {
        mo28106i();
        this.f10699a.mo28486a().mo28540z(new C5650t6(this, bool));
    }

    @WorkerThread
    /* renamed from: J */
    public final void mo28042J(C5499h hVar) {
        mo28029h();
        boolean z = (hVar.mo28326i(zzah.ANALYTICS_STORAGE) && hVar.mo28326i(zzah.AD_STORAGE)) || this.f10699a.mo28627L().mo28556A();
        if (z != this.f10699a.mo28643p()) {
            this.f10699a.mo28639l(z);
            C5692x3 F = this.f10699a.mo28622F();
            C5648t4 t4Var = F.f10699a;
            F.mo28029h();
            Boolean valueOf = F.mo28679o().contains("measurement_enabled_from_api") ? Boolean.valueOf(F.mo28679o().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                mo28047O(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: K */
    public final void mo28043K(String str, String str2, Object obj, boolean z) {
        mo28044L(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", obj, true, this.f10699a.mo28488c().mo20838a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28044L(java.lang.String r16, java.lang.String r17, java.lang.Object r18, boolean r19, long r20) {
        /*
            r15 = this;
            r6 = r15
            r2 = r17
            r0 = r18
            if (r16 != 0) goto L_0x000a
            java.lang.String r1 = "app"
            goto L_0x000c
        L_0x000a:
            r1 = r16
        L_0x000c:
            r3 = 6
            r4 = 0
            r5 = 24
            if (r19 == 0) goto L_0x001e
            c.q.a.c.i.b.t4 r3 = r6.f10699a
            c.q.a.c.i.b.ga r3 = r3.mo28629N()
            int r3 = r3.mo28301n0(r2)
        L_0x001c:
            r11 = r3
            goto L_0x0046
        L_0x001e:
            c.q.a.c.i.b.t4 r7 = r6.f10699a
            c.q.a.c.i.b.ga r7 = r7.mo28629N()
            java.lang.String r8 = "user property"
            boolean r9 = r7.mo28287R(r8, r2)
            if (r9 != 0) goto L_0x002d
        L_0x002c:
            goto L_0x001c
        L_0x002d:
            java.lang.String[] r9 = p040c.p200q.p201a.p264c.p340i.p342b.C5649t5.f10923a
            r10 = 0
            boolean r9 = r7.mo28283N(r8, r9, r10, r2)
            if (r9 != 0) goto L_0x0039
            r3 = 15
            goto L_0x001c
        L_0x0039:
            c.q.a.c.i.b.t4 r9 = r7.f10699a
            r9.mo28649z()
            boolean r7 = r7.mo28282M(r8, r5, r2)
            if (r7 != 0) goto L_0x0045
            goto L_0x002c
        L_0x0045:
            r11 = r4
        L_0x0046:
            r3 = 1
            if (r11 == 0) goto L_0x006e
            c.q.a.c.i.b.t4 r0 = r6.f10699a
            c.q.a.c.i.b.ga r0 = r0.mo28629N()
            c.q.a.c.i.b.t4 r1 = r6.f10699a
            r1.mo28649z()
            java.lang.String r13 = r0.mo28307r(r2, r5, r3)
            if (r2 == 0) goto L_0x005e
            int r4 = r17.length()
        L_0x005e:
            r14 = r4
            c.q.a.c.i.b.t4 r0 = r6.f10699a
            c.q.a.c.i.b.ga r8 = r0.mo28629N()
            c.q.a.c.i.b.fa r9 = r6.f10335p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.mo28271B(r9, r10, r11, r12, r13, r14)
            return
        L_0x006e:
            if (r0 == 0) goto L_0x00c0
            c.q.a.c.i.b.t4 r7 = r6.f10699a
            c.q.a.c.i.b.ga r7 = r7.mo28629N()
            int r11 = r7.mo28297j0(r2, r0)
            if (r11 == 0) goto L_0x00ab
            c.q.a.c.i.b.t4 r1 = r6.f10699a
            c.q.a.c.i.b.ga r1 = r1.mo28629N()
            c.q.a.c.i.b.t4 r7 = r6.f10699a
            r7.mo28649z()
            java.lang.String r13 = r1.mo28307r(r2, r5, r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L_0x0093
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L_0x009b
        L_0x0093:
            java.lang.String r0 = r18.toString()
            int r4 = r0.length()
        L_0x009b:
            r14 = r4
            c.q.a.c.i.b.t4 r0 = r6.f10699a
            c.q.a.c.i.b.ga r8 = r0.mo28629N()
            c.q.a.c.i.b.fa r9 = r6.f10335p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.mo28271B(r9, r10, r11, r12, r13, r14)
            return
        L_0x00ab:
            c.q.a.c.i.b.t4 r3 = r6.f10699a
            c.q.a.c.i.b.ga r3 = r3.mo28629N()
            java.lang.Object r5 = r3.mo28304p(r2, r0)
            if (r5 == 0) goto L_0x00bf
            r0 = r15
            r2 = r17
            r3 = r20
            r0.mo28034B(r1, r2, r3, r5)
        L_0x00bf:
            return
        L_0x00c0:
            r5 = 0
            r0 = r15
            r2 = r17
            r3 = r20
            r0.mo28034B(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5423a7.mo28044L(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    @androidx.annotation.WorkerThread
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28045M(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r9)
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r10)
            r8.mo28029h()
            r8.mo28106i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0064
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0052
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0052
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L_0x0037
            r10 = 0
            goto L_0x0038
        L_0x0037:
            r10 = r2
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            c.q.a.c.i.b.t4 r10 = r8.f10699a
            c.q.a.c.i.b.x3 r10 = r10.mo28622F()
            c.q.a.c.i.b.w3 r10 = r10.f11081m
            long r4 = r11.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x004e
            java.lang.String r0 = "true"
        L_0x004e:
            r10.mo28671b(r0)
            goto L_0x0061
        L_0x0052:
            if (r11 != 0) goto L_0x0064
            c.q.a.c.i.b.t4 r10 = r8.f10699a
            c.q.a.c.i.b.x3 r10 = r10.mo28622F()
            c.q.a.c.i.b.w3 r10 = r10.f11081m
            java.lang.String r0 = "unset"
            r10.mo28671b(r0)
        L_0x0061:
            r6 = r11
            r3 = r1
            goto L_0x0066
        L_0x0064:
            r3 = r10
            r6 = r11
        L_0x0066:
            c.q.a.c.i.b.t4 r10 = r8.f10699a
            boolean r10 = r10.mo28642o()
            if (r10 != 0) goto L_0x007e
            c.q.a.c.i.b.t4 r9 = r8.f10699a
            c.q.a.c.i.b.i3 r9 = r9.mo28487b()
            c.q.a.c.i.b.g3 r9 = r9.mo28343v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo28259a(r10)
            return
        L_0x007e:
            c.q.a.c.i.b.t4 r10 = r8.f10699a
            boolean r10 = r10.mo28645r()
            if (r10 != 0) goto L_0x0087
            return
        L_0x0087:
            com.google.android.gms.measurement.internal.zzkw r10 = new com.google.android.gms.measurement.internal.zzkw
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            c.q.a.c.i.b.t4 r9 = r8.f10699a
            c.q.a.c.i.b.q8 r9 = r9.mo28627L()
            r9.mo28583y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5423a7.mo28045M(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: N */
    public final void mo28046N(C5672v5 v5Var) {
        mo28106i();
        C3495o.m8908j(v5Var);
        if (!this.f10324e.remove(v5Var)) {
            this.f10699a.mo28487b().mo28344w().mo28259a("OnEventListener had not been registered");
        }
    }

    @WorkerThread
    /* renamed from: O */
    public final void mo28047O(Boolean bool, boolean z) {
        mo28029h();
        mo28106i();
        this.f10699a.mo28487b().mo28338q().mo28260b("Setting app measurement enabled (FE)", bool);
        this.f10699a.mo28622F().mo28683s(bool);
        if (z) {
            C5692x3 F = this.f10699a.mo28622F();
            C5648t4 t4Var = F.f10699a;
            F.mo28029h();
            SharedPreferences.Editor edit = F.mo28679o().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f10699a.mo28643p() || (bool != null && !bool.booleanValue())) {
            mo28048P();
        }
    }

    @WorkerThread
    /* renamed from: P */
    public final void mo28048P() {
        mo28029h();
        String a = this.f10699a.mo28622F().f11081m.mo28670a();
        if (a != null) {
            if ("unset".equals(a)) {
                mo28045M("app", "_npa", (Object) null, this.f10699a.mo28488c().mo20838a());
            } else {
                mo28045M("app", "_npa", Long.valueOf(true != "true".equals(a) ? 0 : 1), this.f10699a.mo28488c().mo20838a());
            }
        }
        if (!this.f10699a.mo28642o() || !this.f10334o) {
            this.f10699a.mo28487b().mo28338q().mo28259a("Updating Scion state (FE)");
            this.f10699a.mo28627L().mo28581w();
            return;
        }
        this.f10699a.mo28487b().mo28338q().mo28259a("Recording app launch after enabling measurement for the first time (FE)");
        mo28060f0();
        C5193nc.m14579b();
        if (this.f10699a.mo28649z().mo28235B((String) null, C5658u2.f10972e0)) {
            this.f10699a.mo28628M().f10529d.mo28267a();
        }
        this.f10699a.mo28486a().mo28540z(new C5446c6(this));
    }

    /* renamed from: Q */
    public final int mo28049Q(String str) {
        C3495o.m8904f(str);
        this.f10699a.mo28649z();
        return 25;
    }

    /* renamed from: R */
    public final Boolean mo28050R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f10699a.mo28486a().mo28536r(atomicReference, TooltipCompatHandler.HOVER_HIDE_TIMEOUT_MS, "boolean test flag value", new C5554l6(this, atomicReference));
    }

    /* renamed from: S */
    public final Double mo28051S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f10699a.mo28486a().mo28536r(atomicReference, TooltipCompatHandler.HOVER_HIDE_TIMEOUT_MS, "double test flag value", new C5638s6(this, atomicReference));
    }

    /* renamed from: T */
    public final Integer mo28052T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f10699a.mo28486a().mo28536r(atomicReference, TooltipCompatHandler.HOVER_HIDE_TIMEOUT_MS, "int test flag value", new C5626r6(this, atomicReference));
    }

    /* renamed from: U */
    public final Long mo28053U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f10699a.mo28486a().mo28536r(atomicReference, TooltipCompatHandler.HOVER_HIDE_TIMEOUT_MS, "long test flag value", new C5614q6(this, atomicReference));
    }

    /* renamed from: V */
    public final String mo28054V() {
        return (String) this.f10326g.get();
    }

    /* renamed from: W */
    public final String mo28055W() {
        C5519i7 r = this.f10699a.mo28626K().mo28551r();
        if (r != null) {
            return r.f10561b;
        }
        return null;
    }

    /* renamed from: X */
    public final String mo28056X() {
        C5519i7 r = this.f10699a.mo28626K().mo28551r();
        if (r != null) {
            return r.f10560a;
        }
        return null;
    }

    /* renamed from: Y */
    public final String mo28057Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f10699a.mo28486a().mo28536r(atomicReference, TooltipCompatHandler.HOVER_HIDE_TIMEOUT_MS, "String test flag value", new C5602p6(this, atomicReference));
    }

    /* renamed from: Z */
    public final ArrayList mo28058Z(String str, String str2) {
        if (this.f10699a.mo28486a().mo28534C()) {
            this.f10699a.mo28487b().mo28339r().mo28259a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f10699a.mo28489d();
        if (C5439c.m15559a()) {
            this.f10699a.mo28487b().mo28339r().mo28259a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f10699a.mo28486a().mo28536r(atomicReference, 5000, "get conditional user properties", new C5542k6(this, atomicReference, (String) null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C5498ga.m15696v(list);
        }
        this.f10699a.mo28487b().mo28339r().mo28260b("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList();
    }

    /* renamed from: a0 */
    public final Map mo28059a0(String str, String str2, boolean z) {
        if (this.f10699a.mo28486a().mo28534C()) {
            this.f10699a.mo28487b().mo28339r().mo28259a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f10699a.mo28489d();
        if (C5439c.m15559a()) {
            this.f10699a.mo28487b().mo28339r().mo28259a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f10699a.mo28486a().mo28536r(atomicReference, 5000, "get user properties", new C5566m6(this, atomicReference, (String) null, str, str2, z));
        List<zzkw> list = (List) atomicReference.get();
        if (list == null) {
            this.f10699a.mo28487b().mo28339r().mo28260b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zzkw zzkw : list) {
            Object P = zzkw.mo33668P();
            if (P != null) {
                arrayMap.put(zzkw.f14904l, P);
            }
        }
        return arrayMap;
    }

    @WorkerThread
    /* renamed from: f0 */
    public final void mo28060f0() {
        mo28029h();
        mo28106i();
        if (this.f10699a.mo28645r()) {
            if (this.f10699a.mo28649z().mo28235B((String) null, C5658u2.f10961Y)) {
                C5487g z = this.f10699a.mo28649z();
                z.f10699a.mo28489d();
                Boolean t = z.mo28252t("google_analytics_deferred_deep_link_enabled");
                if (t != null && t.booleanValue()) {
                    this.f10699a.mo28487b().mo28338q().mo28259a("Deferred Deep Link feature enabled.");
                    this.f10699a.mo28486a().mo28540z(new C5434b6(this));
                }
            }
            this.f10699a.mo28627L().mo28564O();
            this.f10334o = false;
            C5692x3 F = this.f10699a.mo28622F();
            F.mo28029h();
            String string = F.mo28679o().getString("previous_os_version", (String) null);
            F.f10699a.mo28617A().mo28502k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = F.mo28679o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f10699a.mo28617A().mo28502k();
                if (!string.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    mo28068u(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: n */
    public final boolean mo28061n() {
        return false;
    }

    /* renamed from: o */
    public final void mo28062o(String str, String str2, Bundle bundle) {
        long a = this.f10699a.mo28488c().mo20838a();
        C3495o.m8904f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f10699a.mo28486a().mo28540z(new C5530j6(this, bundle2));
    }

    /* renamed from: p */
    public final void mo28063p() {
        if ((this.f10699a.mo28490f().getApplicationContext() instanceof Application) && this.f10322c != null) {
            ((Application) this.f10699a.mo28490f().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f10322c);
        }
    }

    /* renamed from: q */
    public final /* synthetic */ void mo28064q(Bundle bundle) {
        if (bundle == null) {
            this.f10699a.mo28622F().f11092x.mo28603b(new Bundle());
            return;
        }
        Bundle a = this.f10699a.mo28622F().f11092x.mo28602a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f10699a.mo28629N().mo28290U(obj)) {
                    this.f10699a.mo28629N().mo28271B(this.f10335p, (String) null, 27, (String) null, (String) null, 0);
                }
                this.f10699a.mo28487b().mo28345x().mo28261c("Invalid default event parameter type. Name, value", str, obj);
            } else if (C5498ga.m15685W(str)) {
                this.f10699a.mo28487b().mo28345x().mo28260b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a.remove(str);
            } else {
                C5498ga N = this.f10699a.mo28629N();
                this.f10699a.mo28649z();
                if (N.mo28285P("param", str, 100, obj)) {
                    this.f10699a.mo28629N().mo28272C(a, str, obj);
                }
            }
        }
        this.f10699a.mo28629N();
        int m = this.f10699a.mo28649z().mo28245m();
        if (a.size() > m) {
            int i = 0;
            for (String str2 : new TreeSet(a.keySet())) {
                i++;
                if (i > m) {
                    a.remove(str2);
                }
            }
            this.f10699a.mo28629N().mo28271B(this.f10335p, (String) null, 26, (String) null, (String) null, 0);
            this.f10699a.mo28487b().mo28345x().mo28259a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f10699a.mo28622F().f11092x.mo28603b(a);
        this.f10699a.mo28627L().mo28580v(a);
    }

    /* renamed from: r */
    public final void mo28065r(String str, String str2, Bundle bundle) {
        mo28066s(str, str2, bundle, true, true, this.f10699a.mo28488c().mo20838a());
    }

    /* renamed from: s */
    public final void mo28066s(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str2;
        String str4 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str3 == "screen_view" || (str3 != null && str2.equals("screen_view"))) {
            this.f10699a.mo28626K().mo28546E(bundle2, j);
            return;
        }
        boolean z3 = true;
        if (z2 && this.f10323d != null && !C5498ga.m15685W(str2)) {
            z3 = false;
        }
        mo28033A(str4, str2, j, bundle2, z2, z3, z, (String) null);
    }

    /* renamed from: t */
    public final void mo28067t(String str, String str2, Bundle bundle, String str3) {
        C5648t4.m16092t();
        throw null;
    }

    @WorkerThread
    /* renamed from: u */
    public final void mo28068u(String str, String str2, Bundle bundle) {
        mo28029h();
        mo28069v(str, str2, this.f10699a.mo28488c().mo20838a(), bundle);
    }

    @WorkerThread
    /* renamed from: v */
    public final void mo28069v(String str, String str2, long j, Bundle bundle) {
        mo28029h();
        mo28070w(str, str2, j, bundle, true, this.f10323d == null || C5498ga.m15685W(str2), true, (String) null);
    }

    /* JADX WARNING: type inference failed for: r5v10, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.WorkerThread
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28070w(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r24
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8904f(r20)
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r24)
            r19.mo28029h()
            r19.mo28106i()
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            boolean r1 = r1.mo28642o()
            if (r1 == 0) goto L_0x04f1
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.y2 r1 = r1.mo28618B()
            java.util.List r1 = r1.mo28709u()
            if (r1 == 0) goto L_0x0043
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x0033
            goto L_0x0043
        L_0x0033:
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28338q()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo28261c(r1, r9, r8)
            return
        L_0x0043:
            boolean r1 = r7.f10325f
            r13 = 0
            r14 = 0
            r15 = 1
            if (r1 != 0) goto L_0x00a1
            r7.f10325f = r15
            c.q.a.c.i.b.t4 r1 = r7.f10699a     // Catch:{ ClassNotFoundException -> 0x0092 }
            boolean r1 = r1.mo28646s()     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r1 != 0) goto L_0x0063
            c.q.a.c.i.b.t4 r1 = r7.f10699a     // Catch:{ ClassNotFoundException -> 0x0092 }
            android.content.Context r1 = r1.mo28490f()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r15, r1)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0067
        L_0x0063:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0067:
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0081 }
            c.q.a.c.i.b.t4 r2 = r7.f10699a     // Catch:{ Exception -> 0x0081 }
            android.content.Context r2 = r2.mo28490f()     // Catch:{ Exception -> 0x0081 }
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0081 }
            goto L_0x00a1
        L_0x0081:
            r0 = move-exception
            c.q.a.c.i.b.t4 r1 = r7.f10699a     // Catch:{ ClassNotFoundException -> 0x0092 }
            c.q.a.c.i.b.i3 r1 = r1.mo28487b()     // Catch:{ ClassNotFoundException -> 0x0092 }
            c.q.a.c.i.b.g3 r1 = r1.mo28344w()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo28260b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x00a1
        L_0x0092:
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28342u()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo28259a(r1)
        L_0x00a1:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00cd
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            r1.mo28489d()
            java.lang.String r4 = r12.getString(r0)
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.d.n.d r0 = r0.mo28488c()
            long r5 = r0.mo20838a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r19
            r1.mo28045M(r2, r3, r4, r5)
        L_0x00cd:
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            r0.mo28489d()
            if (r25 == 0) goto L_0x00ef
            boolean r0 = p040c.p200q.p201a.p264c.p340i.p342b.C5498ga.m15689a0(r21)
            if (r0 == 0) goto L_0x00ef
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.ga r0 = r0.mo28629N()
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.x3 r1 = r1.mo28622F()
            c.q.a.c.i.b.s3 r1 = r1.f11092x
            android.os.Bundle r1 = r1.mo28602a()
            r0.mo28318z(r12, r1)
        L_0x00ef:
            r0 = 40
            if (r27 != 0) goto L_0x0177
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            r1.mo28489d()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0177
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.ga r1 = r1.mo28629N()
            java.lang.String r2 = "event"
            boolean r3 = r1.mo28287R(r2, r9)
            r4 = 2
            if (r3 != 0) goto L_0x0110
            goto L_0x012a
        L_0x0110:
            java.lang.String[] r3 = p040c.p200q.p201a.p264c.p340i.p342b.C5625r5.f10819a
            java.lang.String[] r5 = p040c.p200q.p201a.p264c.p340i.p342b.C5625r5.f10820b
            boolean r3 = r1.mo28283N(r2, r3, r5, r9)
            if (r3 != 0) goto L_0x011d
            r4 = 13
            goto L_0x012a
        L_0x011d:
            c.q.a.c.i.b.t4 r3 = r1.f10699a
            r3.mo28649z()
            boolean r1 = r1.mo28282M(r2, r0, r9)
            if (r1 != 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r4 = r14
        L_0x012a:
            if (r4 == 0) goto L_0x0177
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.i3 r1 = r1.mo28487b()
            c.q.a.c.i.b.g3 r1 = r1.mo28340s()
            c.q.a.c.i.b.t4 r2 = r7.f10699a
            c.q.a.c.i.b.d3 r2 = r2.mo28620D()
            java.lang.String r2 = r2.mo28144d(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo28260b(r3, r2)
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.ga r1 = r1.mo28629N()
            c.q.a.c.i.b.t4 r2 = r7.f10699a
            r2.mo28649z()
            java.lang.String r0 = r1.mo28307r(r9, r0, r15)
            if (r9 == 0) goto L_0x015a
            int r14 = r21.length()
        L_0x015a:
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.ga r1 = r1.mo28629N()
            c.q.a.c.i.b.fa r2 = r7.f10335p
            r3 = 0
            java.lang.String r5 = "_ev"
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r0
            r26 = r14
            r20.mo28271B(r21, r22, r23, r24, r25, r26)
            return
        L_0x0177:
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            r1.mo28489d()
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.q7 r1 = r1.mo28626K()
            c.q.a.c.i.b.i7 r1 = r1.mo28552s(r14)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x0192
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x0192
            r1.f10563d = r15
        L_0x0192:
            if (r25 == 0) goto L_0x0198
            if (r27 != 0) goto L_0x0198
            r3 = r15
            goto L_0x0199
        L_0x0198:
            r3 = r14
        L_0x0199:
            p040c.p200q.p201a.p264c.p340i.p342b.C5498ga.m15697y(r1, r12, r3)
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r3 = p040c.p200q.p201a.p264c.p340i.p342b.C5498ga.m15685W(r21)
            if (r25 == 0) goto L_0x01e9
            c.q.a.c.i.b.u5 r4 = r7.f10323d
            if (r4 == 0) goto L_0x01e9
            if (r3 != 0) goto L_0x01e9
            if (r1 == 0) goto L_0x01b3
            r16 = r15
            goto L_0x01eb
        L_0x01b3:
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28338q()
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.d3 r1 = r1.mo28620D()
            java.lang.String r1 = r1.mo28144d(r9)
            c.q.a.c.i.b.t4 r2 = r7.f10699a
            c.q.a.c.i.b.d3 r2 = r2.mo28620D()
            java.lang.String r2 = r2.mo28142b(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo28261c(r3, r1, r2)
            c.q.a.c.i.b.u5 r0 = r7.f10323d
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r0)
            c.q.a.c.i.b.u5 r1 = r7.f10323d
            r2 = r20
            r3 = r21
            r4 = r24
            r5 = r22
            r1.mo28359a(r2, r3, r4, r5)
            return
        L_0x01e9:
            r16 = r1
        L_0x01eb:
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            boolean r1 = r1.mo28645r()
            if (r1 == 0) goto L_0x04f0
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.ga r1 = r1.mo28629N()
            int r1 = r1.mo28298k0(r9)
            if (r1 == 0) goto L_0x0249
            c.q.a.c.i.b.t4 r2 = r7.f10699a
            c.q.a.c.i.b.i3 r2 = r2.mo28487b()
            c.q.a.c.i.b.g3 r2 = r2.mo28340s()
            c.q.a.c.i.b.t4 r3 = r7.f10699a
            c.q.a.c.i.b.d3 r3 = r3.mo28620D()
            java.lang.String r3 = r3.mo28144d(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.mo28260b(r4, r3)
            c.q.a.c.i.b.t4 r2 = r7.f10699a
            c.q.a.c.i.b.ga r2 = r2.mo28629N()
            c.q.a.c.i.b.t4 r3 = r7.f10699a
            r3.mo28649z()
            java.lang.String r0 = r2.mo28307r(r9, r0, r15)
            if (r9 == 0) goto L_0x022d
            int r14 = r21.length()
        L_0x022d:
            c.q.a.c.i.b.t4 r2 = r7.f10699a
            c.q.a.c.i.b.ga r2 = r2.mo28629N()
            c.q.a.c.i.b.fa r3 = r7.f10335p
            java.lang.String r4 = "_ev"
            r20 = r2
            r21 = r3
            r22 = r28
            r23 = r1
            r24 = r4
            r25 = r0
            r26 = r14
            r20.mo28271B(r21, r22, r23, r24, r25, r26)
            return
        L_0x0249:
            java.lang.String r0 = "_o"
            java.lang.String r1 = "_sn"
            java.lang.String r3 = "_si"
            java.lang.String[] r1 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r5 = p040c.p200q.p201a.p264c.p276d.p289n.C3554e.m9063c(r1)
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.ga r1 = r1.mo28629N()
            r2 = r28
            r3 = r21
            r4 = r24
            r6 = r27
            android.os.Bundle r12 = r1.mo28314v0(r2, r3, r4, r5, r6)
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r12)
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            r1.mo28489d()
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.q7 r1 = r1.mo28626K()
            c.q.a.c.i.b.i7 r1 = r1.mo28552s(r14)
            java.lang.String r5 = "_ae"
            if (r1 == 0) goto L_0x02ae
            boolean r1 = r5.equals(r9)
            if (r1 == 0) goto L_0x02ae
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.h9 r1 = r1.mo28628M()
            c.q.a.c.i.b.f9 r1 = r1.f10530e
            c.q.a.c.i.b.h9 r2 = r1.f10478d
            c.q.a.c.i.b.t4 r2 = r2.f10699a
            c.q.a.c.d.n.d r2 = r2.mo28488c()
            long r14 = r2.mo20839b()
            long r3 = r1.f10476b
            long r2 = r14 - r3
            r1.f10476b = r14
            r14 = 0
            int r1 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x02ae
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.ga r1 = r1.mo28629N()
            r1.mo28315w(r12, r2)
        L_0x02ae:
            p040c.p200q.p201a.p264c.p294g.p335i.C5035dc.m13991b()
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.g r1 = r1.mo28649z()
            c.q.a.c.i.b.t2 r2 = p040c.p200q.p201a.p264c.p340i.p342b.C5658u2.f10970d0
            boolean r1 = r1.mo28235B(r13, r2)
            if (r1 == 0) goto L_0x0338
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0317
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0317
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.ga r1 = r1.mo28629N()
            java.lang.String r2 = r12.getString(r2)
            boolean r3 = p040c.p200q.p201a.p264c.p276d.p289n.C3564o.m9094b(r2)
            if (r3 == 0) goto L_0x02e3
            r2 = r13
            goto L_0x02e9
        L_0x02e3:
            if (r2 == 0) goto L_0x02e9
            java.lang.String r2 = r2.trim()
        L_0x02e9:
            c.q.a.c.i.b.t4 r3 = r1.f10699a
            c.q.a.c.i.b.x3 r3 = r3.mo28622F()
            c.q.a.c.i.b.w3 r3 = r3.f11089u
            java.lang.String r3 = r3.mo28670a()
            boolean r3 = p040c.p200q.p201a.p264c.p340i.p342b.C5462da.m15635a(r2, r3)
            if (r3 != 0) goto L_0x0307
            c.q.a.c.i.b.t4 r1 = r1.f10699a
            c.q.a.c.i.b.x3 r1 = r1.mo28622F()
            c.q.a.c.i.b.w3 r1 = r1.f11089u
            r1.mo28671b(r2)
            goto L_0x0338
        L_0x0307:
            c.q.a.c.i.b.t4 r0 = r1.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28338q()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.mo28259a(r1)
            return
        L_0x0317:
            boolean r1 = r5.equals(r9)
            if (r1 == 0) goto L_0x0338
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.ga r1 = r1.mo28629N()
            c.q.a.c.i.b.t4 r1 = r1.f10699a
            c.q.a.c.i.b.x3 r1 = r1.mo28622F()
            c.q.a.c.i.b.w3 r1 = r1.f11089u
            java.lang.String r1 = r1.mo28670a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0338
            r12.putString(r2, r1)
        L_0x0338:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r12)
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.x3 r1 = r1.mo28622F()
            c.q.a.c.i.b.t3 r1 = r1.f11083o
            long r1 = r1.mo28615a()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x03ca
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.x3 r1 = r1.mo28622F()
            boolean r1 = r1.mo28686v(r10)
            if (r1 == 0) goto L_0x03ca
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.x3 r1 = r1.mo28622F()
            c.q.a.c.i.b.r3 r1 = r1.f11086r
            boolean r1 = r1.mo28590b()
            if (r1 == 0) goto L_0x03ca
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.i3 r1 = r1.mo28487b()
            c.q.a.c.i.b.g3 r1 = r1.mo28343v()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo28259a(r2)
            r6 = 0
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.d.n.d r1 = r1.mo28488c()
            long r17 = r1.mo20838a()
            java.lang.String r2 = "auto"
            java.lang.String r15 = "_sid"
            r1 = r19
            r24 = r14
            r13 = r3
            r3 = r15
            r4 = r6
            r15 = r5
            r5 = r17
            r1.mo28045M(r2, r3, r4, r5)
            r4 = 0
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.d.n.d r1 = r1.mo28488c()
            long r5 = r1.mo20838a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r19
            r1.mo28045M(r2, r3, r4, r5)
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.d.n.d r1 = r1.mo28488c()
            long r5 = r1.mo20838a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r19
            r1.mo28045M(r2, r3, r4, r5)
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.x3 r1 = r1.mo28622F()
            c.q.a.c.i.b.t3 r1 = r1.f11084p
            r1.mo28616b(r13)
            goto L_0x03ce
        L_0x03ca:
            r15 = r5
            r24 = r14
            r13 = r3
        L_0x03ce:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r13)
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x03f5
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.i3 r1 = r1.mo28487b()
            c.q.a.c.i.b.g3 r1 = r1.mo28343v()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo28259a(r2)
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.h9 r1 = r1.mo28628M()
            c.q.a.c.i.b.g9 r1 = r1.f10529d
            r2 = 1
            r1.mo28268b(r10, r2)
        L_0x03f5:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x0406:
            if (r3 >= r2) goto L_0x0454
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0451
            c.q.a.c.i.b.t4 r5 = r7.f10699a
            r5.mo28629N()
            java.lang.Object r5 = r12.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0426
            r6 = 1
            android.os.Bundle[] r13 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r13[r6] = r5
            goto L_0x044c
        L_0x0426:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x0437
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r13 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r13)
            r13 = r5
            android.os.Bundle[] r13 = (android.os.Bundle[]) r13
            goto L_0x044c
        L_0x0437:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x044b
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            r13 = r5
            android.os.Bundle[] r13 = (android.os.Bundle[]) r13
            goto L_0x044c
        L_0x044b:
            r13 = 0
        L_0x044c:
            if (r13 == 0) goto L_0x0451
            r12.putParcelableArray(r4, r13)
        L_0x0451:
            int r3 = r3 + 1
            goto L_0x0406
        L_0x0454:
            r12 = 0
        L_0x0455:
            int r1 = r24.size()
            if (r12 >= r1) goto L_0x04c2
            r13 = r24
            java.lang.Object r1 = r13.get(r12)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r12 == 0) goto L_0x0468
            java.lang.String r2 = "_ep"
            goto L_0x0469
        L_0x0468:
            r2 = r9
        L_0x0469:
            r1.putString(r0, r8)
            if (r26 == 0) goto L_0x0478
            c.q.a.c.i.b.t4 r3 = r7.f10699a
            c.q.a.c.i.b.ga r3 = r3.mo28629N()
            android.os.Bundle r1 = r3.mo28313u0(r1)
        L_0x0478:
            r14 = r1
            com.google.android.gms.measurement.internal.zzaw r5 = new com.google.android.gms.measurement.internal.zzaw
            com.google.android.gms.measurement.internal.zzau r3 = new com.google.android.gms.measurement.internal.zzau
            r3.<init>(r14)
            r1 = r5
            r4 = r20
            r25 = r0
            r0 = r5
            r5 = r22
            r1.<init>(r2, r3, r4, r5)
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.i.b.q8 r1 = r1.mo28627L()
            r5 = r28
            r1.mo28573o(r0, r5)
            if (r16 != 0) goto L_0x04bb
            java.util.Set r0 = r7.f10324e
            java.util.Iterator r0 = r0.iterator()
        L_0x049e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04bb
            java.lang.Object r1 = r0.next()
            c.q.a.c.i.b.v5 r1 = (p040c.p200q.p201a.p264c.p340i.p342b.C5672v5) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r14)
            r2 = r20
            r3 = r21
            r5 = r22
            r1.mo28376a(r2, r3, r4, r5)
            r5 = r28
            goto L_0x049e
        L_0x04bb:
            int r12 = r12 + 1
            r0 = r25
            r24 = r13
            goto L_0x0455
        L_0x04c2:
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            r0.mo28489d()
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.q7 r0 = r0.mo28626K()
            r1 = 0
            c.q.a.c.i.b.i7 r0 = r0.mo28552s(r1)
            if (r0 == 0) goto L_0x04f0
            boolean r0 = r15.equals(r9)
            if (r0 == 0) goto L_0x04f0
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.h9 r0 = r0.mo28628M()
            c.q.a.c.i.b.t4 r1 = r7.f10699a
            c.q.a.c.d.n.d r1 = r1.mo28488c()
            long r1 = r1.mo20839b()
            c.q.a.c.i.b.f9 r0 = r0.f10530e
            r3 = 1
            r0.mo28232d(r3, r3, r1)
        L_0x04f0:
            return
        L_0x04f1:
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28338q()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo28259a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5423a7.mo28070w(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: x */
    public final void mo28071x(C5672v5 v5Var) {
        mo28106i();
        C3495o.m8908j(v5Var);
        if (!this.f10324e.add(v5Var)) {
            this.f10699a.mo28487b().mo28344w().mo28259a("OnEventListener already registered");
        }
    }

    /* renamed from: y */
    public final void mo28072y(long j) {
        this.f10326g.set((Object) null);
        this.f10699a.mo28486a().mo28540z(new C5506h6(this, j));
    }

    /* renamed from: z */
    public final void mo28073z(long j, boolean z) {
        mo28029h();
        mo28106i();
        this.f10699a.mo28487b().mo28338q().mo28259a("Resetting analytics data (FE)");
        C5509h9 M = this.f10699a.mo28628M();
        M.mo28029h();
        C5497g9 g9Var = M.f10529d;
        M.f10530e.mo28229a();
        C5179md.m14505b();
        if (this.f10699a.mo28649z().mo28235B((String) null, C5658u2.f10982j0)) {
            this.f10699a.mo28618B().mo28710v();
        }
        boolean o = this.f10699a.mo28642o();
        C5692x3 F = this.f10699a.mo28622F();
        F.f11073e.mo28616b(j);
        if (!TextUtils.isEmpty(F.f10699a.mo28622F().f11089u.mo28670a())) {
            F.f11089u.mo28671b((String) null);
        }
        C5193nc.m14579b();
        if (F.f10699a.mo28649z().mo28235B((String) null, C5658u2.f10972e0)) {
            F.f11083o.mo28616b(0);
        }
        F.f11084p.mo28616b(0);
        if (!F.f10699a.mo28649z().mo28238E()) {
            F.mo28684t(!o);
        }
        F.f11090v.mo28671b((String) null);
        F.f11091w.mo28616b(0);
        F.f11092x.mo28603b((Bundle) null);
        if (z) {
            this.f10699a.mo28627L().mo28575q();
        }
        C5193nc.m14579b();
        if (this.f10699a.mo28649z().mo28235B((String) null, C5658u2.f10972e0)) {
            this.f10699a.mo28628M().f10529d.mo28267a();
        }
        this.f10334o = !o;
    }
}
