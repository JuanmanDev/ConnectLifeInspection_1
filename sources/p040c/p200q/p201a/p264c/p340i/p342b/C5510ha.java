package p040c.p200q.p201a.p264c.p340i.p342b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p040c.p200q.p201a.p264c.p294g.p335i.C5088h1;

/* renamed from: c.q.a.c.i.b.ha */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
public final class C5510ha implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C5088h1 f10532e;

    /* renamed from: l */
    public final /* synthetic */ String f10533l;

    /* renamed from: m */
    public final /* synthetic */ String f10534m;

    /* renamed from: n */
    public final /* synthetic */ AppMeasurementDynamiteService f10535n;

    public C5510ha(AppMeasurementDynamiteService appMeasurementDynamiteService, C5088h1 h1Var, String str, String str2) {
        this.f10535n = appMeasurementDynamiteService;
        this.f10532e = h1Var;
        this.f10533l = str;
        this.f10534m = str2;
    }

    public final void run() {
        this.f10535n.f14885e.mo28627L().mo28569T(this.f10532e, this.f10533l, this.f10534m);
    }
}
