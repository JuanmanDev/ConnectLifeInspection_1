package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p343j.C5726b;

public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HarmfulAppsData> CREATOR = new C5726b();

    /* renamed from: e */
    public final String f14934e;

    /* renamed from: l */
    public final byte[] f14935l;

    /* renamed from: m */
    public final int f14936m;

    public HarmfulAppsData(String str, byte[] bArr, int i) {
        this.f14934e = str;
        this.f14935l = bArr;
        this.f14936m = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 2, this.f14934e, false);
        C3514a.m8957f(parcel, 3, this.f14935l, false);
        C3514a.m8963l(parcel, 4, this.f14936m);
        C3514a.m8953b(parcel, a);
    }
}
