package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4804tl;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzso */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzso extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzso> CREATOR = new C4804tl();

    /* renamed from: e */
    public final String f14700e;
    @Nullable

    /* renamed from: l */
    public final String f14701l;

    public zzso(String str, @Nullable String str2) {
        this.f14700e = str;
        this.f14701l = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14700e, false);
        C3514a.m8970s(parcel, 2, this.f14701l, false);
        C3514a.m8953b(parcel, a);
    }
}
