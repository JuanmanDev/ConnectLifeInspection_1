package com.google.android.gms.internal.p310authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p296b.C3617g;

/* renamed from: com.google.android.gms.internal.auth-api.zzt */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new C3617g();

    /* renamed from: e */
    public final Credential f8383e;

    public zzt(Credential credential) {
        this.f8383e = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, this.f8383e, i, false);
        C3514a.m8953b(parcel, a);
    }
}
