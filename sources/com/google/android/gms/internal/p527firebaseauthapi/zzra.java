package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4933yk;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzra */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzra extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzra> CREATOR = new C4933yk();

    /* renamed from: e */
    public final String f14662e;

    /* renamed from: l */
    public final String f14663l;

    public zzra(String str, String str2) {
        this.f14662e = str;
        this.f14663l = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14662e, false);
        C3514a.m8970s(parcel, 2, this.f14663l, false);
        C3514a.m8953b(parcel, a);
    }
}
