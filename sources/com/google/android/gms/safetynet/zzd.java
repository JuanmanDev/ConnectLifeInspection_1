package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p343j.C5727c;

public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C5727c();

    /* renamed from: e */
    public final long f14945e;

    /* renamed from: l */
    public final HarmfulAppsData[] f14946l;

    /* renamed from: m */
    public final int f14947m;

    /* renamed from: n */
    public final boolean f14948n;

    public zzd(long j, HarmfulAppsData[] harmfulAppsDataArr, int i, boolean z) {
        this.f14945e = j;
        this.f14946l = harmfulAppsDataArr;
        this.f14948n = z;
        if (z) {
            this.f14947m = i;
        } else {
            this.f14947m = -1;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8965n(parcel, 2, this.f14945e);
        C3514a.m8973v(parcel, 3, this.f14946l, i, false);
        C3514a.m8963l(parcel, 4, this.f14947m);
        C3514a.m8954c(parcel, 5, this.f14948n);
        C3514a.m8953b(parcel, a);
    }
}
