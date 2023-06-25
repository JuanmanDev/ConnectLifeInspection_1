package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zzaay;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.C6406k;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class GoogleAuthCredential extends AuthCredential {
    @NonNull
    public static final Parcelable.Creator<GoogleAuthCredential> CREATOR = new C6406k();
    @Nullable

    /* renamed from: e */
    public final String f15353e;
    @Nullable

    /* renamed from: l */
    public final String f15354l;

    public GoogleAuthCredential(@Nullable String str, @Nullable String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        } else if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        } else if (str2 == null || str2.length() != 0) {
            this.f15353e = str;
            this.f15354l = str2;
        } else {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
    }

    /* renamed from: R */
    public static zzaay m22659R(@NonNull GoogleAuthCredential googleAuthCredential, @Nullable String str) {
        C3495o.m8908j(googleAuthCredential);
        return new zzaay(googleAuthCredential.f15353e, googleAuthCredential.f15354l, googleAuthCredential.mo37314P(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    @NonNull
    /* renamed from: P */
    public String mo37314P() {
        return "google.com";
    }

    @NonNull
    /* renamed from: Q */
    public final AuthCredential mo37315Q() {
        return new GoogleAuthCredential(this.f15353e, this.f15354l);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f15353e, false);
        C3514a.m8970s(parcel, 2, this.f15354l, false);
        C3514a.m8953b(parcel, a);
    }
}
