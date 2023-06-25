package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p343j.C5729e;

public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new C5729e();

    /* renamed from: e */
    public final int f14950e;

    /* renamed from: l */
    public final boolean f14951l;

    public zzh(int i, boolean z) {
        this.f14950e = i;
        this.f14951l = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 2, this.f14950e);
        C3514a.m8954c(parcel, 3, this.f14951l);
        C3514a.m8953b(parcel, a);
    }
}
