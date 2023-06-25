package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p344k.p345b.C5739h;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new C5739h();

    /* renamed from: e */
    public final int f14957e;

    /* renamed from: l */
    public final zat f14958l;

    public zai(int i, zat zat) {
        this.f14957e = i;
        this.f14958l = zat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f14957e);
        C3514a.m8968q(parcel, 2, this.f14958l, i, false);
        C3514a.m8953b(parcel, a);
    }
}
