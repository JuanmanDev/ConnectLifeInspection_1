package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.internal.measurement.zzcl;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.d4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5456d4 {

    /* renamed from: a */
    public final C5444c4 f10384a;

    public C5456d4(C5444c4 c4Var) {
        C3495o.m8908j(c4Var);
        this.f10384a = c4Var;
    }

    @MainThread
    /* renamed from: a */
    public final void mo28147a(Context context, Intent intent) {
        C5648t4 H = C5648t4.m16090H(context, (zzcl) null, (Long) null);
        C5515i3 b = H.mo28487b();
        if (intent == null) {
            b.mo28344w().mo28259a("Receiver called with null intent");
            return;
        }
        H.mo28489d();
        String action = intent.getAction();
        b.mo28343v().mo28260b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            b.mo28343v().mo28259a("Starting wakeful intent.");
            this.f10384a.mo28133a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            b.mo28344w().mo28259a("Install Referrer Broadcasts are deprecated");
        }
    }
}
