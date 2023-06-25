package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.C3291c;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new C3291c();

    /* renamed from: e */
    public final int f7973e;

    /* renamed from: l */
    public int f7974l;
    @Deprecated

    /* renamed from: m */
    public String f7975m;

    /* renamed from: n */
    public Account f7976n;

    public AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.f7973e = i;
        this.f7974l = i2;
        this.f7975m = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f7976n = account;
        } else {
            this.f7976n = new Account(str, "com.google");
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f7973e);
        C3514a.m8963l(parcel, 2, this.f7974l);
        C3514a.m8970s(parcel, 3, this.f7975m, false);
        C3514a.m8968q(parcel, 4, this.f7976n, i, false);
        C3514a.m8953b(parcel, a);
    }

    public AccountChangeEventsRequest() {
        this.f7973e = 1;
    }
}
