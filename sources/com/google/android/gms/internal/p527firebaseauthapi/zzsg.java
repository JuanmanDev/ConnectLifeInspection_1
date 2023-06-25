package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4699pl;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsg> CREATOR = new C4699pl();

    /* renamed from: e */
    public final zzaal f14696e;

    public zzsg(zzaal zzaal) {
        this.f14696e = zzaal;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, this.f14696e, i, false);
        C3514a.m8953b(parcel, a);
    }
}
