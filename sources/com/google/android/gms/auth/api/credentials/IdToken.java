package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.p268a.p270e.C3240f;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new C3240f();
    @NonNull

    /* renamed from: e */
    public final String f8050e;
    @NonNull

    /* renamed from: l */
    public final String f8051l;

    public IdToken(@NonNull String str, @NonNull String str2) {
        C3495o.m8900b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        C3495o.m8900b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f8050e = str;
        this.f8051l = str2;
    }

    @NonNull
    /* renamed from: P */
    public final String mo24364P() {
        return this.f8050e;
    }

    @NonNull
    /* renamed from: Q */
    public final String mo24365Q() {
        return this.f8051l;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return C3487m.m8886a(this.f8050e, idToken.f8050e) && C3487m.m8886a(this.f8051l, idToken.f8051l);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, mo24364P(), false);
        C3514a.m8970s(parcel, 2, mo24365Q(), false);
        C3514a.m8953b(parcel, a);
    }
}
