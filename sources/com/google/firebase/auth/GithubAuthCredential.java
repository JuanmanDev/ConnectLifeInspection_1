package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zzaay;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.C6405j;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class GithubAuthCredential extends AuthCredential {
    @NonNull
    public static final Parcelable.Creator<GithubAuthCredential> CREATOR = new C6405j();

    /* renamed from: e */
    public String f15352e;

    public GithubAuthCredential(String str) {
        C3495o.m8904f(str);
        this.f15352e = str;
    }

    /* renamed from: R */
    public static zzaay m22656R(@NonNull GithubAuthCredential githubAuthCredential, @Nullable String str) {
        C3495o.m8908j(githubAuthCredential);
        return new zzaay((String) null, githubAuthCredential.f15352e, githubAuthCredential.mo37314P(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    @NonNull
    /* renamed from: P */
    public String mo37314P() {
        return "github.com";
    }

    @NonNull
    /* renamed from: Q */
    public final AuthCredential mo37315Q() {
        return new GithubAuthCredential(this.f15352e);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f15352e, false);
        C3514a.m8953b(parcel, a);
    }
}
