package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p040c.p200q.p201a.p264c.p267b.C3292d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new C3292d();

    /* renamed from: e */
    public final int f7977e;

    /* renamed from: l */
    public final List<AccountChangeEvent> f7978l;

    public AccountChangeEventsResponse(int i, List<AccountChangeEvent> list) {
        this.f7977e = i;
        C3495o.m8908j(list);
        this.f7978l = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f7977e);
        C3514a.m8974w(parcel, 2, this.f7978l, false);
        C3514a.m8953b(parcel, a);
    }
}
