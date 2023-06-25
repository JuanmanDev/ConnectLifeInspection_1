package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.p268a.p271f.C3249i;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = new C3249i();

    /* renamed from: e */
    public final String f8077e;

    /* renamed from: l */
    public final String f8078l;

    public SignInPassword(String str, String str2) {
        C3495o.m8909k(str, "Account identifier cannot be null");
        String trim = str.trim();
        C3495o.m8905g(trim, "Account identifier cannot be empty");
        this.f8077e = trim;
        C3495o.m8904f(str2);
        this.f8078l = str2;
    }

    /* renamed from: P */
    public String mo24410P() {
        return this.f8077e;
    }

    /* renamed from: Q */
    public String mo24411Q() {
        return this.f8078l;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        if (!C3487m.m8886a(this.f8077e, signInPassword.f8077e) || !C3487m.m8886a(this.f8078l, signInPassword.f8078l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C3487m.m8887b(this.f8077e, this.f8078l);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, mo24410P(), false);
        C3514a.m8970s(parcel, 2, mo24411Q(), false);
        C3514a.m8953b(parcel, a);
    }
}
