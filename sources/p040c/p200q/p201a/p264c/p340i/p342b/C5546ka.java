package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p040c.p200q.p201a.p264c.p294g.p335i.C5136k1;

/* renamed from: c.q.a.c.i.b.ka */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
public final class C5546ka implements C5672v5 {

    /* renamed from: a */
    public final C5136k1 f10623a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f10624b;

    public C5546ka(AppMeasurementDynamiteService appMeasurementDynamiteService, C5136k1 k1Var) {
        this.f10624b = appMeasurementDynamiteService;
        this.f10623a = k1Var;
    }

    /* renamed from: a */
    public final void mo28376a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f10623a.mo27313j(str, str2, bundle, j);
        } catch (RemoteException e) {
            C5648t4 t4Var = this.f10624b.f14885e;
            if (t4Var != null) {
                t4Var.mo28487b().mo28344w().mo28260b("Event listener threw exception", e);
            }
        }
    }
}
