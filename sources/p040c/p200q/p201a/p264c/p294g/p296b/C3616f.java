package p040c.p200q.p201a.p264c.p294g.p296b;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p040c.p200q.p201a.p264c.p267b.p268a.C3225a;
import p040c.p200q.p201a.p264c.p276d.p277g.C3348d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3461e;
import p040c.p200q.p201a.p264c.p276d.p281j.C3465f;

/* renamed from: c.q.a.c.g.b.f */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C3616f extends C3465f<C3619i> {

    /* renamed from: L */
    public final C3225a.C3226a f6577L;

    public C3616f(Context context, Looper looper, C3461e eVar, C3225a.C3226a aVar, C3348d.C3349a aVar2, C3348d.C3350b bVar) {
        super(context, looper, 68, eVar, aVar2, bVar);
        C3225a.C3226a.C3227a aVar3 = new C3225a.C3226a.C3227a(aVar == null ? C3225a.C3226a.f6101n : aVar);
        aVar3.mo20234a(C3612b.m9155a());
        this.f6577L = aVar3.mo20235b();
    }

    /* renamed from: C */
    public final String mo20300C() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* renamed from: D */
    public final String mo20301D() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* renamed from: j */
    public final int mo20302j() {
        return 12800000;
    }

    /* renamed from: q */
    public final /* synthetic */ IInterface mo20304q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof C3619i) {
            return (C3619i) queryLocalInterface;
        }
        return new C3618h(iBinder);
    }

    /* renamed from: y */
    public final Bundle mo20686y() {
        return this.f6577L.mo20231a();
    }
}
