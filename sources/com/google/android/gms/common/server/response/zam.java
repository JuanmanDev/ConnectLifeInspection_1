package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p276d.p285l.p287b.C3543b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new C3543b();

    /* renamed from: e */
    public final int f8330e;

    /* renamed from: l */
    public final String f8331l;

    /* renamed from: m */
    public final FastJsonResponse.Field<?, ?> f8332m;

    public zam(int i, String str, FastJsonResponse.Field<?, ?> field) {
        this.f8330e = i;
        this.f8331l = str;
        this.f8332m = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8330e);
        C3514a.m8970s(parcel, 2, this.f8331l, false);
        C3514a.m8968q(parcel, 3, this.f8332m, i, false);
        C3514a.m8953b(parcel, a);
    }

    public zam(String str, FastJsonResponse.Field<?, ?> field) {
        this.f8330e = 1;
        this.f8331l = str;
        this.f8332m = field;
    }
}
