package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3286l;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C3286l();
    @Deprecated

    /* renamed from: e */
    public String f8131e;

    /* renamed from: l */
    public GoogleSignInAccount f8132l;
    @Deprecated

    /* renamed from: m */
    public String f8133m;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f8132l = googleSignInAccount;
        C3495o.m8905g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f8131e = str;
        C3495o.m8905g(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f8133m = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 4, this.f8131e, false);
        C3514a.m8968q(parcel, 7, this.f8132l, i, false);
        C3514a.m8970s(parcel, 8, this.f8133m, false);
        C3514a.m8953b(parcel, a);
    }

    /* renamed from: z */
    public final GoogleSignInAccount mo24457z() {
        return this.f8132l;
    }
}
