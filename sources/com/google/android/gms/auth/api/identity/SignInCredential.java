package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.p268a.p271f.C3248h;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new C3248h();

    /* renamed from: e */
    public final String f8070e;
    @Nullable

    /* renamed from: l */
    public final String f8071l;
    @Nullable

    /* renamed from: m */
    public final String f8072m;
    @Nullable

    /* renamed from: n */
    public final String f8073n;
    @Nullable

    /* renamed from: o */
    public final Uri f8074o;
    @Nullable

    /* renamed from: p */
    public final String f8075p;
    @Nullable

    /* renamed from: q */
    public final String f8076q;

    public SignInCredential(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Uri uri, @Nullable String str5, @Nullable String str6) {
        C3495o.m8904f(str);
        this.f8070e = str;
        this.f8071l = str2;
        this.f8072m = str3;
        this.f8073n = str4;
        this.f8074o = uri;
        this.f8075p = str5;
        this.f8076q = str6;
    }

    @Nullable
    /* renamed from: P */
    public final String mo24400P() {
        return this.f8071l;
    }

    @Nullable
    /* renamed from: Q */
    public final String mo24401Q() {
        return this.f8073n;
    }

    @Nullable
    /* renamed from: R */
    public final String mo24402R() {
        return this.f8072m;
    }

    @Nullable
    /* renamed from: S */
    public final String mo24403S() {
        return this.f8076q;
    }

    /* renamed from: T */
    public final String mo24404T() {
        return this.f8070e;
    }

    @Nullable
    /* renamed from: U */
    public final String mo24405U() {
        return this.f8075p;
    }

    @Nullable
    /* renamed from: V */
    public final Uri mo24406V() {
        return this.f8074o;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        if (!C3487m.m8886a(this.f8070e, signInCredential.f8070e) || !C3487m.m8886a(this.f8071l, signInCredential.f8071l) || !C3487m.m8886a(this.f8072m, signInCredential.f8072m) || !C3487m.m8886a(this.f8073n, signInCredential.f8073n) || !C3487m.m8886a(this.f8074o, signInCredential.f8074o) || !C3487m.m8886a(this.f8075p, signInCredential.f8075p) || !C3487m.m8886a(this.f8076q, signInCredential.f8076q)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C3487m.m8887b(this.f8070e, this.f8071l, this.f8072m, this.f8073n, this.f8074o, this.f8075p, this.f8076q);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, mo24404T(), false);
        C3514a.m8970s(parcel, 2, mo24400P(), false);
        C3514a.m8970s(parcel, 3, mo24402R(), false);
        C3514a.m8970s(parcel, 4, mo24401Q(), false);
        C3514a.m8968q(parcel, 5, mo24406V(), i, false);
        C3514a.m8970s(parcel, 6, mo24405U(), false);
        C3514a.m8970s(parcel, 7, mo24403S(), false);
        C3514a.m8953b(parcel, a);
    }
}
