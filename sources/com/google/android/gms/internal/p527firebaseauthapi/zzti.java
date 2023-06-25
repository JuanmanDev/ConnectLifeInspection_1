package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4403em;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzti */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzti extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzti> CREATOR = new C4403em();

    /* renamed from: e */
    public final String f14733e;

    /* renamed from: l */
    public final String f14734l;

    /* renamed from: m */
    public final ActionCodeSettings f14735m;

    public zzti(String str, String str2, ActionCodeSettings actionCodeSettings) {
        this.f14733e = str;
        this.f14734l = str2;
        this.f14735m = actionCodeSettings;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14733e, false);
        C3514a.m8970s(parcel, 2, this.f14734l, false);
        C3514a.m8968q(parcel, 3, this.f14735m, i, false);
        C3514a.m8953b(parcel, a);
    }
}
