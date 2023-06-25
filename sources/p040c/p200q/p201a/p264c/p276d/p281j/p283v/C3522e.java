package p040c.p200q.p201a.p264c.p276d.p281j.p283v;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3372e;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3390k;
import p040c.p200q.p201a.p264c.p276d.p281j.C3461e;
import p040c.p200q.p201a.p264c.p276d.p281j.C3465f;
import p040c.p200q.p201a.p264c.p276d.p281j.C3510t;
import p040c.p200q.p201a.p264c.p294g.p298d.C3634d;

/* renamed from: c.q.a.c.d.j.v.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3522e extends C3465f<C3518a> {

    /* renamed from: L */
    public final C3510t f6525L;

    public C3522e(Context context, Looper looper, C3461e eVar, C3510t tVar, C3372e eVar2, C3390k kVar) {
        super(context, looper, (int) BottomAppBarTopEdgeTreatment.ANGLE_UP, eVar, eVar2, kVar);
        this.f6525L = tVar;
    }

    @NonNull
    /* renamed from: C */
    public final String mo20300C() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @NonNull
    /* renamed from: D */
    public final String mo20301D() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* renamed from: G */
    public final boolean mo20651G() {
        return true;
    }

    /* renamed from: j */
    public final int mo20302j() {
        return 203400000;
    }

    @Nullable
    /* renamed from: q */
    public final /* synthetic */ IInterface mo20304q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C3518a ? (C3518a) queryLocalInterface : new C3518a(iBinder);
    }

    /* renamed from: t */
    public final Feature[] mo20681t() {
        return C3634d.f6583b;
    }

    /* renamed from: y */
    public final Bundle mo20686y() {
        return this.f6525L.mo20783b();
    }
}
