package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4830ul;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsq> CREATOR = new C4830ul();

    /* renamed from: e */
    public final String f14702e;

    /* renamed from: l */
    public final String f14703l;
    @Nullable

    /* renamed from: m */
    public final String f14704m;

    public zzsq(String str, String str2, @Nullable String str3) {
        this.f14702e = str;
        this.f14703l = str2;
        this.f14704m = str3;
    }

    /* renamed from: P */
    public final String mo33446P() {
        return this.f14703l;
    }

    @Nullable
    /* renamed from: Q */
    public final String mo33447Q() {
        return this.f14704m;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14702e, false);
        C3514a.m8970s(parcel, 2, this.f14703l, false);
        C3514a.m8970s(parcel, 3, this.f14704m, false);
        C3514a.m8953b(parcel, a);
    }

    public final String zza() {
        return this.f14702e;
    }
}
