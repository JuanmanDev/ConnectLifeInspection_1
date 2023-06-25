package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.C6419x;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class EmailAuthCredential extends AuthCredential {
    @NonNull
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new C6419x();

    /* renamed from: e */
    public String f15331e;
    @Nullable

    /* renamed from: l */
    public String f15332l;
    @Nullable

    /* renamed from: m */
    public final String f15333m;
    @Nullable

    /* renamed from: n */
    public String f15334n;

    /* renamed from: o */
    public boolean f15335o;

    public EmailAuthCredential(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z) {
        C3495o.m8904f(str);
        this.f15331e = str;
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            this.f15332l = str2;
            this.f15333m = str3;
            this.f15334n = str4;
            this.f15335o = z;
            return;
        }
        throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }

    @NonNull
    /* renamed from: P */
    public String mo37314P() {
        return "password";
    }

    @NonNull
    /* renamed from: Q */
    public final AuthCredential mo37315Q() {
        return new EmailAuthCredential(this.f15331e, this.f15332l, this.f15333m, this.f15334n, this.f15335o);
    }

    @NonNull
    /* renamed from: R */
    public String mo37316R() {
        return !TextUtils.isEmpty(this.f15332l) ? "password" : "emailLink";
    }

    @NonNull
    /* renamed from: S */
    public final EmailAuthCredential mo37317S(@NonNull FirebaseUser firebaseUser) {
        this.f15334n = firebaseUser.mo37360Y();
        this.f15335o = true;
        return this;
    }

    @Nullable
    /* renamed from: T */
    public final String mo37318T() {
        return this.f15334n;
    }

    @NonNull
    /* renamed from: U */
    public final String mo37319U() {
        return this.f15331e;
    }

    @Nullable
    /* renamed from: V */
    public final String mo37320V() {
        return this.f15332l;
    }

    @Nullable
    /* renamed from: W */
    public final String mo37321W() {
        return this.f15333m;
    }

    /* renamed from: X */
    public final boolean mo37322X() {
        return !TextUtils.isEmpty(this.f15333m);
    }

    /* renamed from: Y */
    public final boolean mo37323Y() {
        return this.f15335o;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f15331e, false);
        C3514a.m8970s(parcel, 2, this.f15332l, false);
        C3514a.m8970s(parcel, 3, this.f15333m, false);
        C3514a.m8970s(parcel, 4, this.f15334n, false);
        C3514a.m8954c(parcel, 5, this.f15335o);
        C3514a.m8953b(parcel, a);
    }
}
