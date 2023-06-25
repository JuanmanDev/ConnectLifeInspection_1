package p040c.p200q.p201a.p264c.p276d.p281j.p283v;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.TelemetryData;
import p040c.p200q.p201a.p264c.p294g.p298d.C3631a;
import p040c.p200q.p201a.p264c.p294g.p298d.C3633c;

/* renamed from: c.q.a.c.d.j.v.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3518a extends C3631a implements IInterface {
    public C3518a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* renamed from: v */
    public final void mo20793v(TelemetryData telemetryData) {
        Parcel d = mo20900d();
        C3633c.m9179b(d, telemetryData);
        mo20903k(1, d);
    }
}
