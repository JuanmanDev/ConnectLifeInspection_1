package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.C5395i;

public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new C5395i();

    /* renamed from: e */
    public final boolean f14855e;

    /* renamed from: l */
    public final boolean f14856l;

    /* renamed from: m */
    public final boolean f14857m;

    /* renamed from: n */
    public final boolean f14858n;

    /* renamed from: o */
    public final boolean f14859o;

    /* renamed from: p */
    public final boolean f14860p;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f14855e = z;
        this.f14856l = z2;
        this.f14857m = z3;
        this.f14858n = z4;
        this.f14859o = z5;
        this.f14860p = z6;
    }

    /* renamed from: P */
    public final boolean mo33594P() {
        return this.f14860p;
    }

    /* renamed from: Q */
    public final boolean mo33595Q() {
        return this.f14857m;
    }

    /* renamed from: R */
    public final boolean mo33596R() {
        return this.f14858n;
    }

    /* renamed from: S */
    public final boolean mo33597S() {
        return this.f14855e;
    }

    /* renamed from: T */
    public final boolean mo33598T() {
        return this.f14859o;
    }

    /* renamed from: U */
    public final boolean mo33599U() {
        return this.f14856l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8954c(parcel, 1, mo33597S());
        C3514a.m8954c(parcel, 2, mo33599U());
        C3514a.m8954c(parcel, 3, mo33595Q());
        C3514a.m8954c(parcel, 4, mo33596R());
        C3514a.m8954c(parcel, 5, mo33598T());
        C3514a.m8954c(parcel, 6, mo33594P());
        C3514a.m8953b(parcel, a);
    }
}
