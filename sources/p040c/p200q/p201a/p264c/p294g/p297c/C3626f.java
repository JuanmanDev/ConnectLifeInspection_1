package p040c.p200q.p201a.p264c.p294g.p297c;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import p040c.p200q.p201a.p264c.p267b.p268a.C3228b;
import p040c.p200q.p201a.p264c.p267b.p268a.C3229c;
import p040c.p200q.p201a.p264c.p276d.C3330e;
import p040c.p200q.p201a.p264c.p276d.p277g.C3348d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3461e;
import p040c.p200q.p201a.p264c.p276d.p281j.C3465f;

/* renamed from: c.q.a.c.g.c.f */
public final class C3626f extends C3465f<C3627g> {

    /* renamed from: L */
    public final Bundle f6579L;

    public C3626f(Context context, Looper looper, C3461e eVar, C3229c cVar, C3348d.C3349a aVar, C3348d.C3350b bVar) {
        super(context, looper, 16, eVar, aVar, bVar);
        if (cVar == null) {
            this.f6579L = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: C */
    public final String mo20300C() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* renamed from: D */
    public final String mo20301D() {
        return "com.google.android.gms.auth.service.START";
    }

    /* renamed from: j */
    public final int mo20302j() {
        return C3330e.f6210a;
    }

    /* renamed from: m */
    public final boolean mo20676m() {
        C3461e h0 = mo20716h0();
        return !TextUtils.isEmpty(h0.mo20697b()) && !h0.mo20700e(C3228b.f6110c).isEmpty();
    }

    /* renamed from: q */
    public final /* synthetic */ IInterface mo20304q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof C3627g) {
            return (C3627g) queryLocalInterface;
        }
        return new C3628h(iBinder);
    }

    /* renamed from: y */
    public final Bundle mo20686y() {
        return this.f6579L;
    }
}
