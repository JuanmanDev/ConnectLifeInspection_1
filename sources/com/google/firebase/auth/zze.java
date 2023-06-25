package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zzaay;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4304b4;
import p040c.p200q.p363c.p367l.C6418w;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zze extends OAuthCredential {
    public static final Parcelable.Creator<zze> CREATOR = new C6418w();

    /* renamed from: e */
    public final String f15425e;
    @Nullable

    /* renamed from: l */
    public final String f15426l;
    @Nullable

    /* renamed from: m */
    public final String f15427m;
    @Nullable

    /* renamed from: n */
    public final zzaay f15428n;
    @Nullable

    /* renamed from: o */
    public final String f15429o;
    @Nullable

    /* renamed from: p */
    public final String f15430p;
    @Nullable

    /* renamed from: q */
    public final String f15431q;

    public zze(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable zzaay zzaay, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.f15425e = C4304b4.m11705b(str);
        this.f15426l = str2;
        this.f15427m = str3;
        this.f15428n = zzaay;
        this.f15429o = str4;
        this.f15430p = str5;
        this.f15431q = str6;
    }

    /* renamed from: R */
    public static zze m22732R(zzaay zzaay) {
        C3495o.m8909k(zzaay, "Must specify a non-null webSignInCredential");
        return new zze((String) null, (String) null, (String) null, zzaay, (String) null, (String) null, (String) null);
    }

    /* renamed from: S */
    public static zze m22733S(String str, String str2, String str3, @Nullable String str4, @Nullable String str5) {
        C3495o.m8905g(str, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new zze(str, str2, str3, (zzaay) null, str4, str5, (String) null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    /* renamed from: T */
    public static zzaay m22734T(zze zze, @Nullable String str) {
        C3495o.m8908j(zze);
        zzaay zzaay = zze.f15428n;
        if (zzaay != null) {
            return zzaay;
        }
        return new zzaay(zze.f15426l, zze.f15427m, zze.f15425e, (String) null, zze.f15430p, (String) null, str, zze.f15429o, zze.f15431q);
    }

    /* renamed from: P */
    public final String mo37314P() {
        return this.f15425e;
    }

    /* renamed from: Q */
    public final AuthCredential mo37315Q() {
        return new zze(this.f15425e, this.f15426l, this.f15427m, this.f15428n, this.f15429o, this.f15430p, this.f15431q);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f15425e, false);
        C3514a.m8970s(parcel, 2, this.f15426l, false);
        C3514a.m8970s(parcel, 3, this.f15427m, false);
        C3514a.m8968q(parcel, 4, this.f15428n, i, false);
        C3514a.m8970s(parcel, 5, this.f15429o, false);
        C3514a.m8970s(parcel, 6, this.f15430p, false);
        C3514a.m8970s(parcel, 7, this.f15431q, false);
        C3514a.m8953b(parcel, a);
    }
}
