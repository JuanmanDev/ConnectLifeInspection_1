package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: c.q.a.c.i.b.n8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5580n8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C5604p8 f10704e;

    public C5580n8(C5604p8 p8Var) {
        this.f10704e = p8Var;
    }

    public final void run() {
        C5616q8 q8Var = this.f10704e.f10751m;
        Context f = q8Var.f10699a.mo28490f();
        this.f10704e.f10751m.f10699a.mo28489d();
        C5616q8.m16024M(q8Var, new ComponentName(f, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
