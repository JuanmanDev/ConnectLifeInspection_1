package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3474i;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3499p0;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new C3499p0();

    /* renamed from: e */
    public final int f8284e;
    @Nullable

    /* renamed from: l */
    public final IBinder f8285l;

    /* renamed from: m */
    public final ConnectionResult f8286m;

    /* renamed from: n */
    public final boolean f8287n;

    /* renamed from: o */
    public final boolean f8288o;

    public zav(int i, @Nullable IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f8284e = i;
        this.f8285l = iBinder;
        this.f8286m = connectionResult;
        this.f8287n = z;
        this.f8288o = z2;
    }

    /* renamed from: P */
    public final ConnectionResult mo24611P() {
        return this.f8286m;
    }

    @Nullable
    /* renamed from: Q */
    public final C3474i mo24612Q() {
        IBinder iBinder = this.f8285l;
        if (iBinder == null) {
            return null;
        }
        return C3474i.C3475a.m8877e(iBinder);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zav = (zav) obj;
        return this.f8286m.equals(zav.f8286m) && C3487m.m8886a(mo24612Q(), zav.mo24612Q());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8284e);
        C3514a.m8962k(parcel, 2, this.f8285l, false);
        C3514a.m8968q(parcel, 3, this.f8286m, i, false);
        C3514a.m8954c(parcel, 4, this.f8287n);
        C3514a.m8954c(parcel, 5, this.f8288o);
        C3514a.m8953b(parcel, a);
    }
}
