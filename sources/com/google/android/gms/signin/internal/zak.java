package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p344k.p345b.C5740i;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C5740i();

    /* renamed from: e */
    public final int f14959e;

    /* renamed from: l */
    public final ConnectionResult f14960l;
    @Nullable

    /* renamed from: m */
    public final zav f14961m;

    public zak(int i, ConnectionResult connectionResult, @Nullable zav zav) {
        this.f14959e = i;
        this.f14960l = connectionResult;
        this.f14961m = zav;
    }

    /* renamed from: P */
    public final ConnectionResult mo33686P() {
        return this.f14960l;
    }

    @Nullable
    /* renamed from: Q */
    public final zav mo33687Q() {
        return this.f14961m;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f14959e);
        C3514a.m8968q(parcel, 2, this.f14960l, i, false);
        C3514a.m8968q(parcel, 3, this.f14961m, i, false);
        C3514a.m8953b(parcel, a);
    }
}
