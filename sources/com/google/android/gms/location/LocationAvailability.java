package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.C5388c;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C5388c();
    @Deprecated

    /* renamed from: e */
    public int f14834e;
    @Deprecated

    /* renamed from: l */
    public int f14835l;

    /* renamed from: m */
    public long f14836m;

    /* renamed from: n */
    public int f14837n;

    /* renamed from: o */
    public zzaj[] f14838o;

    public LocationAvailability(int i, int i2, int i3, long j, zzaj[] zzajArr) {
        this.f14837n = i;
        this.f14834e = i2;
        this.f14835l = i3;
        this.f14836m = j;
        this.f14838o = zzajArr;
    }

    /* renamed from: P */
    public final boolean mo33576P() {
        return this.f14837n < 1000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f14834e == locationAvailability.f14834e && this.f14835l == locationAvailability.f14835l && this.f14836m == locationAvailability.f14836m && this.f14837n == locationAvailability.f14837n && Arrays.equals(this.f14838o, locationAvailability.f14838o);
        }
    }

    public final int hashCode() {
        return C3487m.m8887b(Integer.valueOf(this.f14837n), Integer.valueOf(this.f14834e), Integer.valueOf(this.f14835l), Long.valueOf(this.f14836m), this.f14838o);
    }

    public final String toString() {
        boolean P = mo33576P();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(P);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f14834e);
        C3514a.m8963l(parcel, 2, this.f14835l);
        C3514a.m8965n(parcel, 3, this.f14836m);
        C3514a.m8963l(parcel, 4, this.f14837n);
        C3514a.m8973v(parcel, 5, this.f14838o, i, false);
        C3514a.m8953b(parcel, a);
    }
}
