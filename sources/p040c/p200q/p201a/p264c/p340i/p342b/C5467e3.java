package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import p040c.p200q.p201a.p264c.p276d.C3330e;
import p040c.p200q.p201a.p264c.p276d.p281j.C3453d;

/* renamed from: c.q.a.c.i.b.e3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5467e3 extends C3453d {
    public C5467e3(Context context, Looper looper, C3453d.C3454a aVar, C3453d.C3455b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    @NonNull
    /* renamed from: C */
    public final String mo20300C() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @NonNull
    /* renamed from: D */
    public final String mo20301D() {
        return "com.google.android.gms.measurement.START";
    }

    /* renamed from: j */
    public final int mo20302j() {
        return C3330e.f6210a;
    }

    /* renamed from: q */
    public final /* synthetic */ IInterface mo20304q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof C5691x2 ? (C5691x2) queryLocalInterface : new C5669v2(iBinder);
    }
}
