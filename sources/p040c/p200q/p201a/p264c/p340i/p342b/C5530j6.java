package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.j6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5530j6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ Bundle f10590e;

    /* renamed from: l */
    public final /* synthetic */ C5423a7 f10591l;

    public C5530j6(C5423a7 a7Var, Bundle bundle) {
        this.f10591l = a7Var;
        this.f10590e = bundle;
    }

    public final void run() {
        C5423a7 a7Var = this.f10591l;
        Bundle bundle = this.f10590e;
        a7Var.mo28029h();
        a7Var.mo28106i();
        C3495o.m8908j(bundle);
        String string = bundle.getString("name");
        C3495o.m8904f(string);
        if (!a7Var.f10699a.mo28642o()) {
            a7Var.f10699a.mo28487b().mo28343v().mo28259a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzkw zzkw = new zzkw(string, 0, (Object) null, "");
        try {
            zzac zzac = r4;
            zzac zzac2 = new zzac(bundle.getString("app_id"), "", zzkw, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (zzaw) null, bundle.getLong("trigger_timeout"), (zzaw) null, bundle.getLong("time_to_live"), a7Var.f10699a.mo28629N().mo28316w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true));
            a7Var.f10699a.mo28627L().mo28577s(zzac);
        } catch (IllegalArgumentException unused) {
        }
    }
}
