package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3496o0;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new C3496o0();

    /* renamed from: e */
    public final int f8280e;

    /* renamed from: l */
    public final Account f8281l;

    /* renamed from: m */
    public final int f8282m;
    @Nullable

    /* renamed from: n */
    public final GoogleSignInAccount f8283n;

    public zat(int i, Account account, int i2, @Nullable GoogleSignInAccount googleSignInAccount) {
        this.f8280e = i;
        this.f8281l = account;
        this.f8282m = i2;
        this.f8283n = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8280e);
        C3514a.m8968q(parcel, 2, this.f8281l, i, false);
        C3514a.m8963l(parcel, 3, this.f8282m);
        C3514a.m8968q(parcel, 4, this.f8283n, i, false);
        C3514a.m8953b(parcel, a);
    }

    public zat(Account account, int i, @Nullable GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
