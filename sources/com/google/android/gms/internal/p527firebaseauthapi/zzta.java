package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4295am;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzta */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzta extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzta> CREATOR = new C4295am();

    /* renamed from: e */
    public final String f14726e;

    /* renamed from: l */
    public final String f14727l;

    public zzta(String str, String str2) {
        this.f14726e = str;
        this.f14727l = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14726e, false);
        C3514a.m8970s(parcel, 2, this.f14727l, false);
        C3514a.m8953b(parcel, a);
    }
}
