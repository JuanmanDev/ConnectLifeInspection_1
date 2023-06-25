package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4934yl;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsy */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsy> CREATOR = new C4934yl();

    /* renamed from: e */
    public final PhoneMultiFactorInfo f14717e;

    /* renamed from: l */
    public final String f14718l;
    @Nullable

    /* renamed from: m */
    public final String f14719m;

    /* renamed from: n */
    public final long f14720n;

    /* renamed from: o */
    public final boolean f14721o;

    /* renamed from: p */
    public final boolean f14722p;
    @Nullable

    /* renamed from: q */
    public final String f14723q;
    @Nullable

    /* renamed from: r */
    public final String f14724r;

    /* renamed from: s */
    public final boolean f14725s;

    public zzsy(PhoneMultiFactorInfo phoneMultiFactorInfo, String str, @Nullable String str2, long j, boolean z, boolean z2, @Nullable String str3, @Nullable String str4, boolean z3) {
        this.f14717e = phoneMultiFactorInfo;
        this.f14718l = str;
        this.f14719m = str2;
        this.f14720n = j;
        this.f14721o = z;
        this.f14722p = z2;
        this.f14723q = str3;
        this.f14724r = str4;
        this.f14725s = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, this.f14717e, i, false);
        C3514a.m8970s(parcel, 2, this.f14718l, false);
        C3514a.m8970s(parcel, 3, this.f14719m, false);
        C3514a.m8965n(parcel, 4, this.f14720n);
        C3514a.m8954c(parcel, 5, this.f14721o);
        C3514a.m8954c(parcel, 6, this.f14722p);
        C3514a.m8970s(parcel, 7, this.f14723q, false);
        C3514a.m8970s(parcel, 8, this.f14724r, false);
        C3514a.m8954c(parcel, 9, this.f14725s);
        C3514a.m8953b(parcel, a);
    }
}
