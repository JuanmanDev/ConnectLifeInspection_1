package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4537jl;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrw */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzrw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrw> CREATOR = new C4537jl();

    /* renamed from: e */
    public final String f14686e;

    /* renamed from: l */
    public final zzaay f14687l;

    public zzrw(String str, zzaay zzaay) {
        this.f14686e = str;
        this.f14687l = zzaay;
    }

    /* renamed from: P */
    public final zzaay mo33431P() {
        return this.f14687l;
    }

    /* renamed from: Q */
    public final String mo33432Q() {
        return this.f14686e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14686e, false);
        C3514a.m8968q(parcel, 2, this.f14687l, i, false);
        C3514a.m8953b(parcel, a);
    }
}
