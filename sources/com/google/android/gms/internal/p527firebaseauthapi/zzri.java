package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4348cl;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzri */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzri extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzri> CREATOR = new C4348cl();

    /* renamed from: e */
    public final String f14671e;

    /* renamed from: l */
    public final String f14672l;
    @Nullable

    /* renamed from: m */
    public final String f14673m;

    public zzri(String str, String str2, @Nullable String str3) {
        this.f14671e = str;
        this.f14672l = str2;
        this.f14673m = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14671e, false);
        C3514a.m8970s(parcel, 2, this.f14672l, false);
        C3514a.m8970s(parcel, 3, this.f14673m, false);
        C3514a.m8953b(parcel, a);
    }
}
