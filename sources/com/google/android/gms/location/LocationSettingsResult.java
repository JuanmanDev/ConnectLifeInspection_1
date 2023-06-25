package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p277g.C3356i;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.C5394h;

public final class LocationSettingsResult extends AbstractSafeParcelable implements C3356i {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new C5394h();

    /* renamed from: e */
    public final Status f14853e;

    /* renamed from: l */
    public final LocationSettingsStates f14854l;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f14853e = status;
        this.f14854l = locationSettingsStates;
    }

    /* renamed from: F */
    public final Status mo20282F() {
        return this.f14853e;
    }

    /* renamed from: P */
    public final LocationSettingsStates mo33592P() {
        return this.f14854l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, mo20282F(), i, false);
        C3514a.m8968q(parcel, 2, mo33592P(), i, false);
        C3514a.m8953b(parcel, a);
    }
}
