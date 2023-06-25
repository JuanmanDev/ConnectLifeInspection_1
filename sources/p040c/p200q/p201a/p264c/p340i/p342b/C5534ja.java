package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p040c.p200q.p201a.p264c.p294g.p335i.C5136k1;

/* renamed from: c.q.a.c.i.b.ja */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
public final class C5534ja implements C5661u5 {

    /* renamed from: a */
    public final C5136k1 f10599a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f10600b;

    public C5534ja(AppMeasurementDynamiteService appMeasurementDynamiteService, C5136k1 k1Var) {
        this.f10600b = appMeasurementDynamiteService;
        this.f10599a = k1Var;
    }

    /* renamed from: a */
    public final void mo28359a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f10599a.mo27313j(str, str2, bundle, j);
        } catch (RemoteException e) {
            C5648t4 t4Var = this.f10600b.f14885e;
            if (t4Var != null) {
                t4Var.mo28487b().mo28344w().mo28260b("Event interceptor threw exception", e);
            }
        }
    }
}
