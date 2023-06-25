package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.C5396j;

public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C5396j();

    /* renamed from: e */
    public final int f14868e;

    /* renamed from: l */
    public final int f14869l;

    /* renamed from: m */
    public final long f14870m;

    /* renamed from: n */
    public final long f14871n;

    public zzaj(int i, int i2, long j, long j2) {
        this.f14868e = i;
        this.f14869l = i2;
        this.f14870m = j;
        this.f14871n = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaj.class == obj.getClass()) {
            zzaj zzaj = (zzaj) obj;
            return this.f14868e == zzaj.f14868e && this.f14869l == zzaj.f14869l && this.f14870m == zzaj.f14870m && this.f14871n == zzaj.f14871n;
        }
    }

    public final int hashCode() {
        return C3487m.m8887b(Integer.valueOf(this.f14869l), Integer.valueOf(this.f14868e), Long.valueOf(this.f14871n), Long.valueOf(this.f14870m));
    }

    public final String toString() {
        return "NetworkLocationStatus:" + " Wifi status: " + this.f14868e + " Cell status: " + this.f14869l + " elapsed time NS: " + this.f14871n + " system time ms: " + this.f14870m;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f14868e);
        C3514a.m8963l(parcel, 2, this.f14869l);
        C3514a.m8965n(parcel, 3, this.f14870m);
        C3514a.m8965n(parcel, 4, this.f14871n);
        C3514a.m8953b(parcel, a);
    }
}
