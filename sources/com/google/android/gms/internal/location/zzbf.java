package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p334h.C4966c;
import p040c.p200q.p201a.p264c.p294g.p334h.C4967d;
import p040c.p200q.p201a.p264c.p294g.p334h.C4970g;
import p040c.p200q.p201a.p264c.p338h.C5385a0;
import p040c.p200q.p201a.p264c.p338h.C5387b0;
import p040c.p200q.p201a.p264c.p338h.C5410x;
import p040c.p200q.p201a.p264c.p338h.C5411y;

public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new C4970g();

    /* renamed from: e */
    public int f14781e;

    /* renamed from: l */
    public zzbd f14782l;

    /* renamed from: m */
    public C5385a0 f14783m;

    /* renamed from: n */
    public PendingIntent f14784n;

    /* renamed from: o */
    public C5410x f14785o;

    /* renamed from: p */
    public C4966c f14786p;

    public zzbf(int i, zzbd zzbd, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f14781e = i;
        this.f14782l = zzbd;
        C4966c cVar = null;
        this.f14783m = iBinder == null ? null : C5387b0.m15437d(iBinder);
        this.f14784n = pendingIntent;
        this.f14785o = iBinder2 == null ? null : C5411y.m15439d(iBinder2);
        if (!(iBinder3 == null || iBinder3 == null)) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            cVar = queryLocalInterface instanceof C4966c ? (C4966c) queryLocalInterface : new C4967d(iBinder3);
        }
        this.f14786p = cVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f14781e);
        C3514a.m8968q(parcel, 2, this.f14782l, i, false);
        C5385a0 a0Var = this.f14783m;
        IBinder iBinder = null;
        C3514a.m8962k(parcel, 3, a0Var == null ? null : a0Var.asBinder(), false);
        C3514a.m8968q(parcel, 4, this.f14784n, i, false);
        C5410x xVar = this.f14785o;
        C3514a.m8962k(parcel, 5, xVar == null ? null : xVar.asBinder(), false);
        C4966c cVar = this.f14786p;
        if (cVar != null) {
            iBinder = cVar.asBinder();
        }
        C3514a.m8962k(parcel, 6, iBinder, false);
        C3514a.m8953b(parcel, a);
    }
}
