package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import androidx.test.internal.runner.RunnerArgs;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.p700ws.RealWebSocket;
import p040c.p200q.p201a.p264c.p276d.C3330e;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p288m.C3548a;
import p040c.p200q.p201a.p264c.p294g.p335i.C5088h1;

/* renamed from: c.q.a.c.i.b.q8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5616q8 extends C5432b4 {

    /* renamed from: c */
    public final C5604p8 f10787c;

    /* renamed from: d */
    public C5691x2 f10788d;

    /* renamed from: e */
    public volatile Boolean f10789e;

    /* renamed from: f */
    public final C5583o f10790f;

    /* renamed from: g */
    public final C5521i9 f10791g;

    /* renamed from: h */
    public final List f10792h = new ArrayList();

    /* renamed from: i */
    public final C5583o f10793i;

    public C5616q8(C5648t4 t4Var) {
        super(t4Var);
        this.f10791g = new C5521i9(t4Var.mo28488c());
        this.f10787c = new C5604p8(this);
        this.f10790f = new C5718z7(this, t4Var);
        this.f10793i = new C5436b8(this, t4Var);
    }

    /* renamed from: M */
    public static /* bridge */ /* synthetic */ void m16024M(C5616q8 q8Var, ComponentName componentName) {
        q8Var.mo28029h();
        if (q8Var.f10788d != null) {
            q8Var.f10788d = null;
            q8Var.f10699a.mo28487b().mo28343v().mo28260b("Disconnected from device MeasurementService", componentName);
            q8Var.mo28029h();
            q8Var.mo28565P();
        }
    }

    @WorkerThread
    /* renamed from: A */
    public final boolean mo28556A() {
        mo28029h();
        mo28106i();
        if (!mo28557B() || this.f10699a.mo28629N().mo28303o0() >= ((Integer) C5658u2.f10974f0.mo28613a((Object) null)).intValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012b  */
    @androidx.annotation.WorkerThread
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28557B() {
        /*
            r7 = this;
            r7.mo28029h()
            r7.mo28106i()
            java.lang.Boolean r0 = r7.f10789e
            if (r0 != 0) goto L_0x014b
            r7.mo28029h()
            r7.mo28106i()
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.x3 r0 = r0.mo28622F()
            r0.mo28029h()
            android.content.SharedPreferences r1 = r0.mo28679o()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.mo28679o()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x0145
        L_0x003f:
            c.q.a.c.i.b.t4 r4 = r7.f10699a
            r4.mo28489d()
            c.q.a.c.i.b.t4 r4 = r7.f10699a
            c.q.a.c.i.b.y2 r4 = r4.mo28618B()
            int r4 = r4.mo28703o()
            if (r4 != r1) goto L_0x0053
        L_0x0050:
            r3 = r1
            goto L_0x010d
        L_0x0053:
            c.q.a.c.i.b.t4 r4 = r7.f10699a
            c.q.a.c.i.b.i3 r4 = r4.mo28487b()
            c.q.a.c.i.b.g3 r4 = r4.mo28343v()
            java.lang.String r5 = "Checking service availability"
            r4.mo28259a(r5)
            c.q.a.c.i.b.t4 r4 = r7.f10699a
            c.q.a.c.i.b.ga r4 = r4.mo28629N()
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r4.mo28305p0(r5)
            if (r4 == 0) goto L_0x00fc
            if (r4 == r1) goto L_0x00ec
            r5 = 2
            if (r4 == r5) goto L_0x00c6
            r0 = 3
            if (r4 == r0) goto L_0x00b5
            r0 = 9
            if (r4 == r0) goto L_0x00a5
            r0 = 18
            if (r4 == r0) goto L_0x0095
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28344w()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.mo28260b(r4, r1)
            goto L_0x00c4
        L_0x0095:
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28344w()
            java.lang.String r3 = "Service updating"
            r0.mo28259a(r3)
            goto L_0x0050
        L_0x00a5:
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28344w()
            java.lang.String r1 = "Service invalid"
            r0.mo28259a(r1)
            goto L_0x00c4
        L_0x00b5:
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28344w()
            java.lang.String r1 = "Service disabled"
            r0.mo28259a(r1)
        L_0x00c4:
            r1 = r3
            goto L_0x010d
        L_0x00c6:
            c.q.a.c.i.b.t4 r4 = r7.f10699a
            c.q.a.c.i.b.i3 r4 = r4.mo28487b()
            c.q.a.c.i.b.g3 r4 = r4.mo28338q()
            java.lang.String r5 = "Service container out of date"
            r4.mo28259a(r5)
            c.q.a.c.i.b.t4 r4 = r7.f10699a
            c.q.a.c.i.b.ga r4 = r4.mo28629N()
            int r4 = r4.mo28303o0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00e4
            goto L_0x010d
        L_0x00e4:
            if (r0 != 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r1 = r3
        L_0x00e8:
            r6 = r3
            r3 = r1
            r1 = r6
            goto L_0x010d
        L_0x00ec:
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28343v()
            java.lang.String r4 = "Service missing"
            r0.mo28259a(r4)
            goto L_0x010d
        L_0x00fc:
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28343v()
            java.lang.String r3 = "Service available"
            r0.mo28259a(r3)
            goto L_0x0050
        L_0x010d:
            if (r3 != 0) goto L_0x012b
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.g r0 = r0.mo28649z()
            boolean r0 = r0.mo28240G()
            if (r0 == 0) goto L_0x012b
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.i3 r0 = r0.mo28487b()
            c.q.a.c.i.b.g3 r0 = r0.mo28339r()
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.mo28259a(r1)
            goto L_0x0144
        L_0x012b:
            if (r1 == 0) goto L_0x0144
            c.q.a.c.i.b.t4 r0 = r7.f10699a
            c.q.a.c.i.b.x3 r0 = r0.mo28622F()
            r0.mo28029h()
            android.content.SharedPreferences r0 = r0.mo28679o()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x0144:
            r1 = r3
        L_0x0145:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.f10789e = r0
        L_0x014b:
            java.lang.Boolean r0 = r7.f10789e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p340i.p342b.C5616q8.mo28557B():boolean");
    }

    @WorkerThread
    /* renamed from: C */
    public final zzq mo28558C(boolean z) {
        Pair a;
        this.f10699a.mo28489d();
        C5702y2 B = this.f10699a.mo28618B();
        String str = null;
        if (z) {
            C5515i3 b = this.f10699a.mo28487b();
            if (!(b.f10699a.mo28622F().f11072d == null || (a = b.f10699a.mo28622F().f11072d.mo28661a()) == null || a == C5692x3.f11070y)) {
                str = String.valueOf(a.second) + RunnerArgs.CLASSPATH_SEPARATOR + ((String) a.first);
            }
        }
        return B.mo28705q(str);
    }

    @WorkerThread
    /* renamed from: D */
    public final void mo28559D() {
        mo28029h();
        this.f10699a.mo28487b().mo28343v().mo28260b("Processing queued up service tasks", Integer.valueOf(this.f10792h.size()));
        for (Runnable run : this.f10792h) {
            try {
                run.run();
            } catch (RuntimeException e) {
                this.f10699a.mo28487b().mo28339r().mo28260b("Task exception while flushing queue", e);
            }
        }
        this.f10792h.clear();
        this.f10793i.mo28495b();
    }

    @WorkerThread
    /* renamed from: E */
    public final void mo28560E() {
        mo28029h();
        this.f10791g.mo28351b();
        C5583o oVar = this.f10790f;
        this.f10699a.mo28649z();
        oVar.mo28496d(((Long) C5658u2.f10946J.mo28613a((Object) null)).longValue());
    }

    @WorkerThread
    /* renamed from: F */
    public final void mo28561F(Runnable runnable) {
        mo28029h();
        if (mo28584z()) {
            runnable.run();
            return;
        }
        int size = this.f10792h.size();
        this.f10699a.mo28649z();
        if (((long) size) >= 1000) {
            this.f10699a.mo28487b().mo28339r().mo28259a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f10792h.add(runnable);
        this.f10793i.mo28496d(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
        mo28565P();
    }

    /* renamed from: G */
    public final boolean mo28562G() {
        this.f10699a.mo28489d();
        return true;
    }

    /* renamed from: J */
    public final Boolean mo28563J() {
        return this.f10789e;
    }

    @WorkerThread
    /* renamed from: O */
    public final void mo28564O() {
        mo28029h();
        mo28106i();
        zzq C = mo28558C(true);
        this.f10699a.mo28619C().mo28099r();
        mo28561F(new C5685w7(this, C));
    }

    @WorkerThread
    /* renamed from: P */
    public final void mo28565P() {
        mo28029h();
        mo28106i();
        if (!mo28584z()) {
            if (mo28557B()) {
                this.f10787c.mo28524c();
            } else if (!this.f10699a.mo28649z().mo28240G()) {
                this.f10699a.mo28489d();
                List<ResolveInfo> queryIntentServices = this.f10699a.mo28490f().getPackageManager().queryIntentServices(new Intent().setClassName(this.f10699a.mo28490f(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    this.f10699a.mo28487b().mo28339r().mo28259a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context f = this.f10699a.mo28490f();
                this.f10699a.mo28489d();
                intent.setComponent(new ComponentName(f, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f10787c.mo28523b(intent);
            }
        }
    }

    @WorkerThread
    /* renamed from: Q */
    public final void mo28566Q() {
        mo28029h();
        mo28106i();
        this.f10787c.mo28525f();
        try {
            C3548a.m9034b().mo20833c(this.f10699a.mo28490f(), this.f10787c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f10788d = null;
    }

    @WorkerThread
    /* renamed from: R */
    public final void mo28567R(C5088h1 h1Var) {
        mo28029h();
        mo28106i();
        mo28561F(new C5674v7(this, mo28558C(false), h1Var));
    }

    @WorkerThread
    /* renamed from: S */
    public final void mo28568S(AtomicReference atomicReference) {
        mo28029h();
        mo28106i();
        mo28561F(new C5663u7(this, atomicReference, mo28558C(false)));
    }

    @WorkerThread
    /* renamed from: T */
    public final void mo28569T(C5088h1 h1Var, String str, String str2) {
        mo28029h();
        mo28106i();
        mo28561F(new C5520i8(this, str, str2, mo28558C(false), h1Var));
    }

    @WorkerThread
    /* renamed from: U */
    public final void mo28570U(AtomicReference atomicReference, String str, String str2, String str3) {
        mo28029h();
        mo28106i();
        mo28561F(new C5508h8(this, atomicReference, (String) null, str2, str3, mo28558C(false)));
    }

    @WorkerThread
    /* renamed from: V */
    public final void mo28571V(C5088h1 h1Var, String str, String str2, boolean z) {
        mo28029h();
        mo28106i();
        mo28561F(new C5627r7(this, str, str2, mo28558C(false), z, h1Var));
    }

    @WorkerThread
    /* renamed from: W */
    public final void mo28572W(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        mo28029h();
        mo28106i();
        mo28561F(new C5532j8(this, atomicReference, (String) null, str2, str3, mo28558C(false), z));
    }

    /* renamed from: n */
    public final boolean mo28061n() {
        return false;
    }

    @WorkerThread
    /* renamed from: o */
    public final void mo28573o(zzaw zzaw, String str) {
        C3495o.m8908j(zzaw);
        mo28029h();
        mo28106i();
        mo28562G();
        mo28561F(new C5484f8(this, true, mo28558C(true), this.f10699a.mo28619C().mo28103v(zzaw), zzaw, str));
    }

    @WorkerThread
    /* renamed from: p */
    public final void mo28574p(C5088h1 h1Var, zzaw zzaw, String str) {
        mo28029h();
        mo28106i();
        if (this.f10699a.mo28629N().mo28305p0(C3330e.f6210a) != 0) {
            this.f10699a.mo28487b().mo28344w().mo28259a("Not bundling data. Service unavailable or out of date");
            this.f10699a.mo28629N().mo28276G(h1Var, new byte[0]);
            return;
        }
        mo28561F(new C5424a8(this, zzaw, str, h1Var));
    }

    @WorkerThread
    /* renamed from: q */
    public final void mo28575q() {
        mo28029h();
        mo28106i();
        zzq C = mo28558C(false);
        mo28562G();
        this.f10699a.mo28619C().mo28098q();
        mo28561F(new C5651t7(this, C));
    }

    @WorkerThread
    /* renamed from: r */
    public final void mo28576r(C5691x2 x2Var, AbstractSafeParcelable abstractSafeParcelable, zzq zzq) {
        int i;
        mo28029h();
        mo28106i();
        mo28562G();
        this.f10699a.mo28649z();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List p = this.f10699a.mo28619C().mo28097p(100);
            if (p != null) {
                arrayList.addAll(p);
                i = p.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        x2Var.mo28448H((zzaw) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e) {
                        this.f10699a.mo28487b().mo28339r().mo28260b("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkw) {
                    try {
                        x2Var.mo28453P((zzkw) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e2) {
                        this.f10699a.mo28487b().mo28339r().mo28260b("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        x2Var.mo28457W((zzac) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e3) {
                        this.f10699a.mo28487b().mo28339r().mo28260b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.f10699a.mo28487b().mo28339r().mo28259a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    @WorkerThread
    /* renamed from: s */
    public final void mo28577s(zzac zzac) {
        C3495o.m8908j(zzac);
        mo28029h();
        mo28106i();
        this.f10699a.mo28489d();
        mo28561F(new C5496g8(this, true, mo28558C(true), this.f10699a.mo28619C().mo28102u(zzac), new zzac(zzac), zzac));
    }

    @WorkerThread
    /* renamed from: t */
    public final void mo28578t(boolean z) {
        mo28029h();
        mo28106i();
        if (z) {
            mo28562G();
            this.f10699a.mo28619C().mo28098q();
        }
        if (mo28556A()) {
            mo28561F(new C5472e8(this, mo28558C(false)));
        }
    }

    @WorkerThread
    /* renamed from: u */
    public final void mo28579u(C5519i7 i7Var) {
        mo28029h();
        mo28106i();
        mo28561F(new C5696x7(this, i7Var));
    }

    @WorkerThread
    /* renamed from: v */
    public final void mo28580v(Bundle bundle) {
        mo28029h();
        mo28106i();
        mo28561F(new C5707y7(this, mo28558C(false), bundle));
    }

    @WorkerThread
    /* renamed from: w */
    public final void mo28581w() {
        mo28029h();
        mo28106i();
        mo28561F(new C5448c8(this, mo28558C(true)));
    }

    @WorkerThread
    /* renamed from: x */
    public final void mo28582x(C5691x2 x2Var) {
        mo28029h();
        C3495o.m8908j(x2Var);
        this.f10788d = x2Var;
        mo28560E();
        mo28559D();
    }

    @WorkerThread
    /* renamed from: y */
    public final void mo28583y(zzkw zzkw) {
        mo28029h();
        mo28106i();
        mo28562G();
        mo28561F(new C5639s7(this, mo28558C(true), this.f10699a.mo28619C().mo28104w(zzkw), zzkw));
    }

    @WorkerThread
    /* renamed from: z */
    public final boolean mo28584z() {
        mo28029h();
        mo28106i();
        return this.f10788d != null;
    }
}
