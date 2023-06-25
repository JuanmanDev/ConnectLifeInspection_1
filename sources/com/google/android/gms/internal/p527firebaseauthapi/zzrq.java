package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4456gl;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzrq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrq> CREATOR = new C4456gl();

    /* renamed from: e */
    public final String f14680e;

    public zzrq(String str) {
        this.f14680e = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14680e, false);
        C3514a.m8953b(parcel, a);
    }

    public final String zza() {
        return this.f14680e;
    }
}
