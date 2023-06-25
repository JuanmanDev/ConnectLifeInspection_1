package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zzaay;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.C6420y;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class FacebookAuthCredential extends AuthCredential {
    @NonNull
    public static final Parcelable.Creator<FacebookAuthCredential> CREATOR = new C6420y();

    /* renamed from: e */
    public final String f15336e;

    public FacebookAuthCredential(String str) {
        C3495o.m8904f(str);
        this.f15336e = str;
    }

    @NonNull
    /* renamed from: R */
    public static zzaay m22616R(@NonNull FacebookAuthCredential facebookAuthCredential, @Nullable String str) {
        C3495o.m8908j(facebookAuthCredential);
        return new zzaay((String) null, facebookAuthCredential.f15336e, facebookAuthCredential.mo37314P(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    @NonNull
    /* renamed from: P */
    public String mo37314P() {
        return "facebook.com";
    }

    @NonNull
    /* renamed from: Q */
    public final AuthCredential mo37315Q() {
        return new FacebookAuthCredential(this.f15336e);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f15336e, false);
        C3514a.m8953b(parcel, a);
    }
}
