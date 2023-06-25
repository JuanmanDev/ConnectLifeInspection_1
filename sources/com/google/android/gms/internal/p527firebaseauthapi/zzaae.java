package com.google.android.gms.internal.p527firebaseauthapi;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4326c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaae */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaae> CREATOR = new C4326c();

    /* renamed from: e */
    public String f14615e;

    /* renamed from: l */
    public String f14616l;

    /* renamed from: m */
    public String f14617m;

    /* renamed from: n */
    public String f14618n;

    /* renamed from: o */
    public String f14619o;

    /* renamed from: p */
    public String f14620p;

    /* renamed from: q */
    public String f14621q;

    public zzaae() {
    }

    @Nullable
    /* renamed from: P */
    public final Uri mo33345P() {
        if (!TextUtils.isEmpty(this.f14617m)) {
            return Uri.parse(this.f14617m);
        }
        return null;
    }

    @Nullable
    /* renamed from: Q */
    public final String mo33346Q() {
        return this.f14616l;
    }

    @Nullable
    /* renamed from: R */
    public final String mo33347R() {
        return this.f14621q;
    }

    /* renamed from: S */
    public final String mo33348S() {
        return this.f14615e;
    }

    /* renamed from: T */
    public final String mo33349T() {
        return this.f14620p;
    }

    /* renamed from: U */
    public final String mo33350U() {
        return this.f14618n;
    }

    @Nullable
    /* renamed from: V */
    public final String mo33351V() {
        return this.f14619o;
    }

    /* renamed from: W */
    public final void mo33352W(String str) {
        this.f14619o = str;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 2, this.f14615e, false);
        C3514a.m8970s(parcel, 3, this.f14616l, false);
        C3514a.m8970s(parcel, 4, this.f14617m, false);
        C3514a.m8970s(parcel, 5, this.f14618n, false);
        C3514a.m8970s(parcel, 6, this.f14619o, false);
        C3514a.m8970s(parcel, 7, this.f14620p, false);
        C3514a.m8970s(parcel, 8, this.f14621q, false);
        C3514a.m8953b(parcel, a);
    }

    public zzaae(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f14615e = str;
        this.f14616l = str2;
        this.f14617m = str3;
        this.f14618n = str4;
        this.f14619o = str5;
        this.f14620p = str6;
        this.f14621q = str7;
    }
}
