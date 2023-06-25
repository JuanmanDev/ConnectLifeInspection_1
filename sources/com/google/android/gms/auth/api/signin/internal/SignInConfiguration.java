package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e.C3258a;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e.C3278u;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C3278u();

    /* renamed from: e */
    public final String f8137e;

    /* renamed from: l */
    public GoogleSignInOptions f8138l;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        C3495o.m8904f(str);
        this.f8137e = str;
        this.f8138l = googleSignInOptions;
    }

    /* renamed from: P */
    public final GoogleSignInOptions mo24460P() {
        return this.f8138l;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f8137e.equals(signInConfiguration.f8137e)) {
            GoogleSignInOptions googleSignInOptions = this.f8138l;
            if (googleSignInOptions == null) {
                if (signInConfiguration.f8138l == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.f8138l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C3258a aVar = new C3258a();
        aVar.mo20284a(this.f8137e);
        aVar.mo20284a(this.f8138l);
        return aVar.mo20285b();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 2, this.f8137e, false);
        C3514a.m8968q(parcel, 5, this.f8138l, i, false);
        C3514a.m8953b(parcel, a);
    }
}
