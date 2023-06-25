package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3449b1;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C3449b1();

    /* renamed from: e */
    public final int f8293e;

    public zzaj(int i) {
        this.f8293e = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8293e);
        C3514a.m8953b(parcel, a);
    }
}
