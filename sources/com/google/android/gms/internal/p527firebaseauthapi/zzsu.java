package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4882wl;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsu> CREATOR = new C4882wl();

    /* renamed from: e */
    public final PhoneAuthCredential f14706e;
    @Nullable

    /* renamed from: l */
    public final String f14707l;

    public zzsu(PhoneAuthCredential phoneAuthCredential, @Nullable String str) {
        this.f14706e = phoneAuthCredential;
        this.f14707l = str;
    }

    /* renamed from: P */
    public final PhoneAuthCredential mo33452P() {
        return this.f14706e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, this.f14706e, i, false);
        C3514a.m8970s(parcel, 2, this.f14707l, false);
        C3514a.m8953b(parcel, a);
    }
}
