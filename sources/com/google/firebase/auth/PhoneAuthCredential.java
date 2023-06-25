package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.hisense.connect_life.core.global.EventBusConstKt;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.C6410o;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    @NonNull
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new C6410o();
    @Nullable

    /* renamed from: e */
    public String f15355e;
    @Nullable

    /* renamed from: l */
    public String f15356l;

    /* renamed from: m */
    public boolean f15357m;
    @Nullable

    /* renamed from: n */
    public String f15358n;

    /* renamed from: o */
    public boolean f15359o;
    @Nullable

    /* renamed from: p */
    public String f15360p;
    @Nullable

    /* renamed from: q */
    public String f15361q;

    public PhoneAuthCredential(@Nullable String str, @Nullable String str2, boolean z, @Nullable String str3, boolean z2, @Nullable String str4, @Nullable String str5) {
        boolean z3 = false;
        if ((z && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || ((z && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))))) {
            z3 = true;
        }
        C3495o.m8900b(z3, "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.f15355e = str;
        this.f15356l = str2;
        this.f15357m = z;
        this.f15358n = str3;
        this.f15359o = z2;
        this.f15360p = str4;
        this.f15361q = str5;
    }

    @NonNull
    /* renamed from: T */
    public static PhoneAuthCredential m22663T(@NonNull String str, @NonNull String str2) {
        return new PhoneAuthCredential((String) null, (String) null, false, str, true, str2, (String) null);
    }

    @NonNull
    /* renamed from: P */
    public String mo37314P() {
        return EventBusConstKt.PHONE;
    }

    @NonNull
    /* renamed from: Q */
    public final AuthCredential mo37315Q() {
        return clone();
    }

    @Nullable
    /* renamed from: R */
    public String mo37367R() {
        return this.f15356l;
    }

    @NonNull
    /* renamed from: S */
    public final PhoneAuthCredential clone() {
        return new PhoneAuthCredential(this.f15355e, mo37367R(), this.f15357m, this.f15358n, this.f15359o, this.f15360p, this.f15361q);
    }

    @NonNull
    /* renamed from: U */
    public final PhoneAuthCredential mo37369U(boolean z) {
        this.f15359o = false;
        return this;
    }

    @Nullable
    /* renamed from: V */
    public final String mo37370V() {
        return this.f15358n;
    }

    @Nullable
    /* renamed from: W */
    public final String mo37371W() {
        return this.f15355e;
    }

    @Nullable
    /* renamed from: X */
    public final String mo37372X() {
        return this.f15360p;
    }

    /* renamed from: Y */
    public final boolean mo37373Y() {
        return this.f15359o;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f15355e, false);
        C3514a.m8970s(parcel, 2, mo37367R(), false);
        C3514a.m8954c(parcel, 3, this.f15357m);
        C3514a.m8970s(parcel, 4, this.f15358n, false);
        C3514a.m8954c(parcel, 5, this.f15359o);
        C3514a.m8970s(parcel, 6, this.f15360p, false);
        C3514a.m8970s(parcel, 7, this.f15361q, false);
        C3514a.m8953b(parcel, a);
    }
}
