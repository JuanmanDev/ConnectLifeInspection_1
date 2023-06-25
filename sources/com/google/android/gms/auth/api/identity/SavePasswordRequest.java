package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.p268a.p271f.C3246f;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new C3246f();

    /* renamed from: e */
    public final SignInPassword f8067e;
    @Nullable

    /* renamed from: l */
    public final String f8068l;

    public SavePasswordRequest(SignInPassword signInPassword, @Nullable String str) {
        C3495o.m8908j(signInPassword);
        this.f8067e = signInPassword;
        this.f8068l = str;
    }

    /* renamed from: P */
    public SignInPassword mo24392P() {
        return this.f8067e;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        if (!C3487m.m8886a(this.f8067e, savePasswordRequest.f8067e) || !C3487m.m8886a(this.f8068l, savePasswordRequest.f8068l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C3487m.m8887b(this.f8067e, this.f8068l);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, mo24392P(), i, false);
        C3514a.m8970s(parcel, 2, this.f8068l, false);
        C3514a.m8953b(parcel, a);
    }
}
