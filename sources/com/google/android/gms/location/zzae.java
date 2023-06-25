package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.C5392f;

public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new C5392f();

    /* renamed from: e */
    public final String f14865e;

    /* renamed from: l */
    public final String f14866l;

    /* renamed from: m */
    public final String f14867m;

    public zzae(String str, String str2, String str3) {
        this.f14867m = str;
        this.f14865e = str2;
        this.f14866l = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14865e, false);
        C3514a.m8970s(parcel, 2, this.f14866l, false);
        C3514a.m8970s(parcel, 5, this.f14867m, false);
        C3514a.m8953b(parcel, a);
    }
}
