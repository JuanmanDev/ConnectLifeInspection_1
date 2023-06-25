package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.UserProfileChangeRequest;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4376dm;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zztg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztg> CREATOR = new C4376dm();

    /* renamed from: e */
    public final UserProfileChangeRequest f14731e;

    /* renamed from: l */
    public final String f14732l;

    public zztg(UserProfileChangeRequest userProfileChangeRequest, String str) {
        this.f14731e = userProfileChangeRequest;
        this.f14732l = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, this.f14731e, i, false);
        C3514a.m8970s(parcel, 2, this.f14732l, false);
        C3514a.m8953b(parcel, a);
    }
}
