package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.C5393g;

public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new C5393g();

    /* renamed from: e */
    public final List<LocationRequest> f14849e;

    /* renamed from: l */
    public final boolean f14850l;

    /* renamed from: m */
    public final boolean f14851m;

    /* renamed from: n */
    public zzae f14852n;

    public LocationSettingsRequest(List<LocationRequest> list, boolean z, boolean z2, zzae zzae) {
        this.f14849e = list;
        this.f14850l = z;
        this.f14851m = z2;
        this.f14852n = zzae;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8974w(parcel, 1, Collections.unmodifiableList(this.f14849e), false);
        C3514a.m8954c(parcel, 2, this.f14850l);
        C3514a.m8954c(parcel, 3, this.f14851m);
        C3514a.m8968q(parcel, 5, this.f14852n, i, false);
        C3514a.m8953b(parcel, a);
    }
}
