package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p297c.C3622b;

public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C3622b();

    /* renamed from: e */
    public final int f8385e = 1;

    /* renamed from: l */
    public final String f8386l;

    /* renamed from: m */
    public final int f8387m;

    public zzab(int i, String str, int i2) {
        C3495o.m8908j(str);
        this.f8386l = str;
        this.f8387m = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8385e);
        C3514a.m8970s(parcel, 2, this.f8386l, false);
        C3514a.m8963l(parcel, 3, this.f8387m);
        C3514a.m8953b(parcel, a);
    }
}
