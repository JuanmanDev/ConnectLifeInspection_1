package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4564kl;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzry */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzry> CREATOR = new C4564kl();

    /* renamed from: e */
    public final String f14688e;

    /* renamed from: l */
    public final PhoneAuthCredential f14689l;

    public zzry(String str, PhoneAuthCredential phoneAuthCredential) {
        this.f14688e = str;
        this.f14689l = phoneAuthCredential;
    }

    /* renamed from: P */
    public final PhoneAuthCredential mo33434P() {
        return this.f14689l;
    }

    /* renamed from: Q */
    public final String mo33435Q() {
        return this.f14688e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14688e, false);
        C3514a.m8968q(parcel, 2, this.f14689l, i, false);
        C3514a.m8953b(parcel, a);
    }
}
