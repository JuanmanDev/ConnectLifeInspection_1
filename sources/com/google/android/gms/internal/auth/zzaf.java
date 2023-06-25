package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p297c.C3624d;

public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new C3624d();

    /* renamed from: e */
    public final int f8390e = 1;

    /* renamed from: l */
    public final String f8391l;

    /* renamed from: m */
    public final byte[] f8392m;

    public zzaf(int i, String str, byte[] bArr) {
        C3495o.m8908j(str);
        this.f8391l = str;
        C3495o.m8908j(bArr);
        this.f8392m = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8390e);
        C3514a.m8970s(parcel, 2, this.f8391l, false);
        C3514a.m8957f(parcel, 3, this.f8392m, false);
        C3514a.m8953b(parcel, a);
    }
}
