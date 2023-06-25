package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4645nl;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsc> CREATOR = new C4645nl();

    /* renamed from: e */
    public final String f14691e;
    @Nullable

    /* renamed from: l */
    public final ActionCodeSettings f14692l;

    public zzsc(String str, @Nullable ActionCodeSettings actionCodeSettings) {
        this.f14691e = str;
        this.f14692l = actionCodeSettings;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14691e, false);
        C3514a.m8968q(parcel, 2, this.f14692l, i, false);
        C3514a.m8953b(parcel, a);
    }
}
