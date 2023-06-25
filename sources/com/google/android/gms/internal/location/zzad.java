package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p277g.C3356i;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p334h.C4965b;

public final class zzad extends AbstractSafeParcelable implements C3356i {
    public static final Parcelable.Creator<zzad> CREATOR = new C4965b();

    /* renamed from: e */
    public final Status f14772e;

    static {
        Status status = Status.f8173p;
    }

    public zzad(Status status) {
        this.f14772e = status;
    }

    /* renamed from: F */
    public final Status mo20282F() {
        return this.f14772e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, mo20282F(), i, false);
        C3514a.m8953b(parcel, a);
    }
}
