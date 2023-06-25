package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.p268a.p271f.C3243c;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new C3243c();

    /* renamed from: e */
    public final String f8064e;
    @Nullable

    /* renamed from: l */
    public final String f8065l;
    @Nullable

    /* renamed from: m */
    public String f8066m;

    public GetSignInIntentRequest(String str, @Nullable String str2, @Nullable String str3) {
        C3495o.m8908j(str);
        this.f8064e = str;
        this.f8065l = str2;
        this.f8066m = str3;
    }

    @Nullable
    /* renamed from: P */
    public String mo24387P() {
        return this.f8065l;
    }

    /* renamed from: Q */
    public String mo24388Q() {
        return this.f8064e;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        if (!C3487m.m8886a(this.f8064e, getSignInIntentRequest.f8064e) || !C3487m.m8886a(this.f8065l, getSignInIntentRequest.f8065l) || !C3487m.m8886a(this.f8066m, getSignInIntentRequest.f8066m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C3487m.m8887b(this.f8064e, this.f8065l, this.f8066m);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, mo24388Q(), false);
        C3514a.m8970s(parcel, 2, mo24387P(), false);
        C3514a.m8970s(parcel, 3, this.f8066m, false);
        C3514a.m8953b(parcel, a);
    }
}
