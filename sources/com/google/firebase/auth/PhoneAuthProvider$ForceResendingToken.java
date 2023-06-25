package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.C6417v;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class PhoneAuthProvider$ForceResendingToken extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PhoneAuthProvider$ForceResendingToken> CREATOR = new C6417v();

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        C3514a.m8953b(parcel, C3514a.m8952a(parcel));
    }
}
