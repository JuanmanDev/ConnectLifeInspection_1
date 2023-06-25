package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4778sl;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsm> CREATOR = new C4778sl();

    /* renamed from: e */
    public final zzaay f14699e;

    public zzsm(zzaay zzaay) {
        this.f14699e = zzaay;
    }

    /* renamed from: P */
    public final zzaay mo33443P() {
        return this.f14699e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, this.f14699e, i, false);
        C3514a.m8953b(parcel, a);
    }
}
