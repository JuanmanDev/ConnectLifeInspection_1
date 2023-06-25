package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4402el;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzrm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrm> CREATOR = new C4402el();

    /* renamed from: e */
    public final PhoneAuthCredential f14675e;

    /* renamed from: l */
    public final String f14676l;
    @Nullable

    /* renamed from: m */
    public final String f14677m;

    public zzrm(PhoneAuthCredential phoneAuthCredential, String str, @Nullable String str2) {
        this.f14675e = phoneAuthCredential;
        this.f14676l = str;
        this.f14677m = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, this.f14675e, i, false);
        C3514a.m8970s(parcel, 2, this.f14676l, false);
        C3514a.m8970s(parcel, 3, this.f14677m, false);
        C3514a.m8953b(parcel, a);
    }
}
