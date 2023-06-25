package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p297c.C3625e;

public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new C3625e();

    /* renamed from: e */
    public final int f8393e = 1;

    /* renamed from: l */
    public final String f8394l;

    /* renamed from: m */
    public final PendingIntent f8395m;

    public zzah(int i, String str, PendingIntent pendingIntent) {
        C3495o.m8908j(str);
        this.f8394l = str;
        C3495o.m8908j(pendingIntent);
        this.f8395m = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8393e);
        C3514a.m8970s(parcel, 2, this.f8394l, false);
        C3514a.m8968q(parcel, 3, this.f8395m, i, false);
        C3514a.m8953b(parcel, a);
    }
}
