package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p334h.C4966c;
import p040c.p200q.p201a.p264c.p294g.p334h.C4967d;
import p040c.p200q.p201a.p264c.p294g.p334h.C4973j;
import p040c.p200q.p201a.p264c.p338h.C5407u;
import p040c.p200q.p201a.p264c.p338h.C5408v;

public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C4973j();

    /* renamed from: e */
    public int f14801e;

    /* renamed from: l */
    public zzm f14802l;

    /* renamed from: m */
    public C5407u f14803m;

    /* renamed from: n */
    public C4966c f14804n;

    public zzo(int i, zzm zzm, IBinder iBinder, IBinder iBinder2) {
        this.f14801e = i;
        this.f14802l = zzm;
        C4966c cVar = null;
        this.f14803m = iBinder == null ? null : C5408v.m15438d(iBinder);
        if (!(iBinder2 == null || iBinder2 == null)) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            cVar = queryLocalInterface instanceof C4966c ? (C4966c) queryLocalInterface : new C4967d(iBinder2);
        }
        this.f14804n = cVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f14801e);
        C3514a.m8968q(parcel, 2, this.f14802l, i, false);
        C5407u uVar = this.f14803m;
        IBinder iBinder = null;
        C3514a.m8962k(parcel, 3, uVar == null ? null : uVar.asBinder(), false);
        C4966c cVar = this.f14804n;
        if (cVar != null) {
            iBinder = cVar.asBinder();
        }
        C3514a.m8962k(parcel, 4, iBinder, false);
        C3514a.m8953b(parcel, a);
    }
}
