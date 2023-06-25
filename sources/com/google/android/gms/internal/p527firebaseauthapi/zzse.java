package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4672ol;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzse */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzse> CREATOR = new C4672ol();

    /* renamed from: e */
    public final String f14693e;

    /* renamed from: l */
    public final ActionCodeSettings f14694l;
    @Nullable

    /* renamed from: m */
    public final String f14695m;

    public zzse(String str, ActionCodeSettings actionCodeSettings, @Nullable String str2) {
        this.f14693e = str;
        this.f14694l = actionCodeSettings;
        this.f14695m = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14693e, false);
        C3514a.m8968q(parcel, 2, this.f14694l, i, false);
        C3514a.m8970s(parcel, 3, this.f14695m, false);
        C3514a.m8953b(parcel, a);
    }
}
