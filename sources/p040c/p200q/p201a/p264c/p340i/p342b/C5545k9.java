package p040c.p200q.p201a.p264c.p340i.p342b;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;
import androidx.navigation.NavInflater;
import p040c.p200q.p201a.p264c.p294g.p335i.C5271t0;
import p040c.p200q.p201a.p264c.p294g.p335i.C5286u0;

/* renamed from: c.q.a.c.i.b.k9 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5545k9 extends C5569m9 {

    /* renamed from: d */
    public final AlarmManager f10620d = ((AlarmManager) this.f10699a.mo28490f().getSystemService(NotificationCompat.CATEGORY_ALARM));

    /* renamed from: e */
    public C5583o f10621e;

    /* renamed from: f */
    public Integer f10622f;

    public C5545k9(C5709y9 y9Var) {
        super(y9Var);
    }

    /* renamed from: l */
    public final boolean mo28087l() {
        AlarmManager alarmManager = this.f10620d;
        if (alarmManager != null) {
            alarmManager.cancel(mo28373p());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        mo28375r();
        return false;
    }

    /* renamed from: m */
    public final void mo28370m() {
        mo28475i();
        this.f10699a.mo28487b().mo28343v().mo28259a("Unscheduling upload");
        AlarmManager alarmManager = this.f10620d;
        if (alarmManager != null) {
            alarmManager.cancel(mo28373p());
        }
        mo28374q().mo28495b();
        if (Build.VERSION.SDK_INT >= 24) {
            mo28375r();
        }
    }

    /* renamed from: n */
    public final void mo28371n(long j) {
        mo28475i();
        this.f10699a.mo28489d();
        Context f = this.f10699a.mo28490f();
        if (!C5498ga.m15687Y(f)) {
            this.f10699a.mo28487b().mo28338q().mo28259a("Receiver not registered/enabled");
        }
        if (!C5498ga.m15688Z(f, false)) {
            this.f10699a.mo28487b().mo28338q().mo28259a("Service not registered/enabled");
        }
        mo28370m();
        this.f10699a.mo28487b().mo28343v().mo28260b("Scheduling upload, millis", Long.valueOf(j));
        long b = this.f10699a.mo28488c().mo20839b() + j;
        this.f10699a.mo28649z();
        if (j < Math.max(0, ((Long) C5658u2.f11004x.mo28613a((Object) null)).longValue()) && !mo28374q().mo28497e()) {
            mo28374q().mo28496d(j);
        }
        this.f10699a.mo28489d();
        if (Build.VERSION.SDK_INT >= 24) {
            Context f2 = this.f10699a.mo28490f();
            ComponentName componentName = new ComponentName(f2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int o = mo28372o();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString(NavInflater.TAG_ACTION, "com.google.android.gms.measurement.UPLOAD");
            C5286u0.m15005a(f2, new JobInfo.Builder(o, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f10620d;
        if (alarmManager != null) {
            this.f10699a.mo28649z();
            alarmManager.setInexactRepeating(2, b, Math.max(((Long) C5658u2.f10999s.mo28613a((Object) null)).longValue(), j), mo28373p());
        }
    }

    /* renamed from: o */
    public final int mo28372o() {
        if (this.f10622f == null) {
            this.f10622f = Integer.valueOf("measurement".concat(String.valueOf(this.f10699a.mo28490f().getPackageName())).hashCode());
        }
        return this.f10622f.intValue();
    }

    /* renamed from: p */
    public final PendingIntent mo28373p() {
        Context f = this.f10699a.mo28490f();
        return PendingIntent.getBroadcast(f, 0, new Intent().setClassName(f, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C5271t0.f10142a);
    }

    /* renamed from: q */
    public final C5583o mo28374q() {
        if (this.f10621e == null) {
            this.f10621e = new C5533j9(this, this.f10663b.mo28739b0());
        }
        return this.f10621e;
    }

    @TargetApi(24)
    /* renamed from: r */
    public final void mo28375r() {
        JobScheduler jobScheduler = (JobScheduler) this.f10699a.mo28490f().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(mo28372o());
        }
    }
}
