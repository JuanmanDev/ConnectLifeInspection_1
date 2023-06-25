package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p297c.C3623c;

public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new C3623c();

    /* renamed from: e */
    public final int f8388e = 1;

    /* renamed from: l */
    public final String f8389l;

    public zzad(int i, String str) {
        C3495o.m8908j(str);
        this.f8389l = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8388e);
        C3514a.m8970s(parcel, 2, this.f8389l, false);
        C3514a.m8953b(parcel, a);
    }
}
