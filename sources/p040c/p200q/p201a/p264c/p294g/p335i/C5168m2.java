package p040c.p200q.p201a.p264c.p294g.p335i;

import android.app.Activity;
import android.os.Bundle;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p292e.C3587b;

/* renamed from: c.q.a.c.g.i.m2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
public final class C5168m2 extends C5137k2 {

    /* renamed from: o */
    public final /* synthetic */ Bundle f9995o;

    /* renamed from: p */
    public final /* synthetic */ Activity f9996p;

    /* renamed from: q */
    public final /* synthetic */ C5288u2 f9997q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5168m2(C5288u2 u2Var, Bundle bundle, Activity activity) {
        super(u2Var.f10168e, true);
        this.f9997q = u2Var;
        this.f9995o = bundle;
        this.f9996p = activity;
    }

    /* renamed from: a */
    public final void mo26914a() {
        Bundle bundle;
        if (this.f9995o != null) {
            bundle = new Bundle();
            if (this.f9995o.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f9995o.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        C5040e1 s = this.f9997q.f10168e.f10186h;
        C3495o.m8908j(s);
        s.onActivityCreated(C3587b.m9124k(this.f9996p), bundle, this.f9973l);
    }
}
