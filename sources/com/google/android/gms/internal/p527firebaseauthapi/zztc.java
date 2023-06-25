package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4322bm;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zztc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztc> CREATOR = new C4322bm();

    /* renamed from: e */
    public final String f14728e;

    public zztc(String str) {
        this.f14728e = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14728e, false);
        C3514a.m8953b(parcel, a);
    }
}
