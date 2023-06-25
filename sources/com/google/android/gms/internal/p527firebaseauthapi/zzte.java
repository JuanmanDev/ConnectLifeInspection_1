package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4349cm;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzte */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzte extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzte> CREATOR = new C4349cm();

    /* renamed from: e */
    public final String f14729e;

    /* renamed from: l */
    public final String f14730l;

    public zzte(String str, String str2) {
        this.f14729e = str;
        this.f14730l = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14729e, false);
        C3514a.m8970s(parcel, 2, this.f14730l, false);
        C3514a.m8953b(parcel, a);
    }
}
