package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p276d.p285l.p286a.C3541c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new C3541c();

    /* renamed from: e */
    public final int f8306e;

    /* renamed from: l */
    public final String f8307l;

    /* renamed from: m */
    public final int f8308m;

    public zac(int i, String str, int i2) {
        this.f8306e = i;
        this.f8307l = str;
        this.f8308m = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8306e);
        C3514a.m8970s(parcel, 2, this.f8307l, false);
        C3514a.m8963l(parcel, 3, this.f8308m);
        C3514a.m8953b(parcel, a);
    }

    public zac(String str, int i) {
        this.f8306e = 1;
        this.f8307l = str;
        this.f8308m = i;
    }
}
