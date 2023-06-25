package p040c.p200q.p201a.p264c.p340i.p342b;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.navigation.NavInflater;
import com.google.android.gms.internal.measurement.zzcl;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.x8 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5697x8 {

    /* renamed from: a */
    public final Context f11114a;

    public C5697x8(Context context) {
        C3495o.m8908j(context);
        this.f11114a = context;
    }

    @MainThread
    /* renamed from: a */
    public final int mo28691a(Intent intent, int i, int i2) {
        C5648t4 H = C5648t4.m16090H(this.f11114a, (zzcl) null, (Long) null);
        C5515i3 b = H.mo28487b();
        if (intent == null) {
            b.mo28344w().mo28259a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        H.mo28489d();
        b.mo28343v().mo28261c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            mo28698h(new C5664u8(this, i2, b, intent));
        }
        return 2;
    }

    @MainThread
    /* renamed from: b */
    public final IBinder mo28692b(Intent intent) {
        if (intent == null) {
            mo28701k().mo28339r().mo28259a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C5565m5(C5709y9.m16231e0(this.f11114a), (String) null);
        }
        mo28701k().mo28344w().mo28260b("onBind received unknown action", action);
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28693c(int i, C5515i3 i3Var, Intent intent) {
        if (((C5686w8) this.f11114a).mo28675a(i)) {
            i3Var.mo28343v().mo28260b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            mo28701k().mo28343v().mo28259a("Completed wakeful intent.");
            ((C5686w8) this.f11114a).mo28676b(intent);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo28694d(C5515i3 i3Var, JobParameters jobParameters) {
        i3Var.mo28343v().mo28259a("AppMeasurementJobService processed last upload request.");
        ((C5686w8) this.f11114a).mo28677d(jobParameters, false);
    }

    @MainThread
    /* renamed from: e */
    public final void mo28695e() {
        C5648t4 H = C5648t4.m16090H(this.f11114a, (zzcl) null, (Long) null);
        C5515i3 b = H.mo28487b();
        H.mo28489d();
        b.mo28343v().mo28259a("Local AppMeasurementService is starting up");
    }

    @MainThread
    /* renamed from: f */
    public final void mo28696f() {
        C5648t4 H = C5648t4.m16090H(this.f11114a, (zzcl) null, (Long) null);
        C5515i3 b = H.mo28487b();
        H.mo28489d();
        b.mo28343v().mo28259a("Local AppMeasurementService is shutting down");
    }

    @MainThread
    /* renamed from: g */
    public final void mo28697g(Intent intent) {
        if (intent == null) {
            mo28701k().mo28339r().mo28259a("onRebind called with null intent");
            return;
        }
        mo28701k().mo28343v().mo28260b("onRebind called. action", intent.getAction());
    }

    /* renamed from: h */
    public final void mo28698h(Runnable runnable) {
        C5709y9 e0 = C5709y9.m16231e0(this.f11114a);
        e0.mo28486a().mo28540z(new C5675v8(this, e0, runnable));
    }

    @TargetApi(24)
    @MainThread
    /* renamed from: i */
    public final boolean mo28699i(JobParameters jobParameters) {
        C5648t4 H = C5648t4.m16090H(this.f11114a, (zzcl) null, (Long) null);
        C5515i3 b = H.mo28487b();
        String string = jobParameters.getExtras().getString(NavInflater.TAG_ACTION);
        H.mo28489d();
        b.mo28343v().mo28260b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        mo28698h(new C5652t8(this, b, jobParameters));
        return true;
    }

    @MainThread
    /* renamed from: j */
    public final boolean mo28700j(Intent intent) {
        if (intent == null) {
            mo28701k().mo28339r().mo28259a("onUnbind called with null intent");
            return true;
        }
        mo28701k().mo28343v().mo28260b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    /* renamed from: k */
    public final C5515i3 mo28701k() {
        return C5648t4.m16090H(this.f11114a, (zzcl) null, (Long) null).mo28487b();
    }
}
