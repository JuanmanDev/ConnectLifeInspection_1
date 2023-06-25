package com.google.android.gms.internal.p310authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p296b.C3620j;

/* renamed from: com.google.android.gms.internal.auth-api.zzz */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new C3620j();

    /* renamed from: e */
    public final Credential f8384e;

    public zzz(Credential credential) {
        this.f8384e = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, this.f8384e, i, false);
        C3514a.m8953b(parcel, a);
    }
}
