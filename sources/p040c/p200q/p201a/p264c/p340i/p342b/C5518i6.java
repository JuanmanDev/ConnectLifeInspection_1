package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import com.hisense.connect_life.core.global.EventBusConstKt;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.i6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5518i6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ Bundle f10558e;

    /* renamed from: l */
    public final /* synthetic */ C5423a7 f10559l;

    public C5518i6(C5423a7 a7Var, Bundle bundle) {
        this.f10559l = a7Var;
        this.f10558e = bundle;
    }

    public final void run() {
        C5423a7 a7Var = this.f10559l;
        Bundle bundle = this.f10558e;
        a7Var.mo28029h();
        a7Var.mo28106i();
        C3495o.m8908j(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString(EventBusConstKt.ORIGIN);
        C3495o.m8904f(string);
        C3495o.m8904f(string2);
        C3495o.m8908j(bundle.get("value"));
        if (!a7Var.f10699a.mo28642o()) {
            a7Var.f10699a.mo28487b().mo28343v().mo28259a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkw zzkw = new zzkw(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzaw w0 = a7Var.f10699a.mo28629N().mo28316w0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true, true);
            zzaw w02 = a7Var.f10699a.mo28629N().mo28316w0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true, true);
            zzaw w03 = a7Var.f10699a.mo28629N().mo28316w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true, true);
            a7Var.f10699a.mo28627L().mo28577s(new zzac(bundle.getString("app_id"), string2, zzkw, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), w02, bundle.getLong("trigger_timeout"), w0, bundle.getLong("time_to_live"), w03));
        } catch (IllegalArgumentException unused) {
        }
    }
}
