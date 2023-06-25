package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zzaay;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.C6413r;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class TwitterAuthCredential extends AuthCredential {
    @NonNull
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new C6413r();

    /* renamed from: e */
    public String f15367e;

    /* renamed from: l */
    public String f15368l;

    public TwitterAuthCredential(@NonNull String str, @NonNull String str2) {
        C3495o.m8904f(str);
        this.f15367e = str;
        C3495o.m8904f(str2);
        this.f15368l = str2;
    }

    /* renamed from: R */
    public static zzaay m22681R(@NonNull TwitterAuthCredential twitterAuthCredential, @Nullable String str) {
        C3495o.m8908j(twitterAuthCredential);
        return new zzaay((String) null, twitterAuthCredential.f15367e, twitterAuthCredential.mo37314P(), (String) null, twitterAuthCredential.f15368l, (String) null, str, (String) null, (String) null);
    }

    @NonNull
    /* renamed from: P */
    public String mo37314P() {
        return "twitter.com";
    }

    @NonNull
    /* renamed from: Q */
    public final AuthCredential mo37315Q() {
        return new TwitterAuthCredential(this.f15367e, this.f15368l);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f15367e, false);
        C3514a.m8970s(parcel, 2, this.f15368l, false);
        C3514a.m8953b(parcel, a);
    }
}
