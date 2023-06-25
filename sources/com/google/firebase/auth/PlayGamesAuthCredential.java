package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zzaay;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.C6412q;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class PlayGamesAuthCredential extends AuthCredential {
    @NonNull
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR = new C6412q();

    /* renamed from: e */
    public final String f15366e;

    public PlayGamesAuthCredential(@NonNull String str) {
        C3495o.m8904f(str);
        this.f15366e = str;
    }

    /* renamed from: R */
    public static zzaay m22678R(@NonNull PlayGamesAuthCredential playGamesAuthCredential, @Nullable String str) {
        C3495o.m8908j(playGamesAuthCredential);
        return new zzaay((String) null, (String) null, playGamesAuthCredential.mo37314P(), (String) null, (String) null, playGamesAuthCredential.f15366e, str, (String) null, (String) null);
    }

    @NonNull
    /* renamed from: P */
    public String mo37314P() {
        return "playgames.google.com";
    }

    @NonNull
    /* renamed from: Q */
    public final AuthCredential mo37315Q() {
        return new PlayGamesAuthCredential(this.f15366e);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f15366e, false);
        C3514a.m8953b(parcel, a);
    }
}
