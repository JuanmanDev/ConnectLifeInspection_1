package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4908xl;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsw */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzsw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsw> CREATOR = new C4908xl();

    /* renamed from: e */
    public final String f14708e;

    /* renamed from: l */
    public final String f14709l;
    @Nullable

    /* renamed from: m */
    public final String f14710m;

    /* renamed from: n */
    public final long f14711n;

    /* renamed from: o */
    public final boolean f14712o;

    /* renamed from: p */
    public final boolean f14713p;
    @Nullable

    /* renamed from: q */
    public final String f14714q;
    @Nullable

    /* renamed from: r */
    public final String f14715r;

    /* renamed from: s */
    public final boolean f14716s;

    public zzsw(String str, String str2, @Nullable String str3, long j, boolean z, boolean z2, @Nullable String str4, @Nullable String str5, boolean z3) {
        this.f14708e = str;
        this.f14709l = str2;
        this.f14710m = str3;
        this.f14711n = j;
        this.f14712o = z;
        this.f14713p = z2;
        this.f14714q = str4;
        this.f14715r = str5;
        this.f14716s = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14708e, false);
        C3514a.m8970s(parcel, 2, this.f14709l, false);
        C3514a.m8970s(parcel, 3, this.f14710m, false);
        C3514a.m8965n(parcel, 4, this.f14711n);
        C3514a.m8954c(parcel, 5, this.f14712o);
        C3514a.m8954c(parcel, 6, this.f14713p);
        C3514a.m8970s(parcel, 7, this.f14714q, false);
        C3514a.m8970s(parcel, 8, this.f14715r, false);
        C3514a.m8954c(parcel, 9, this.f14716s);
        C3514a.m8953b(parcel, a);
    }
}
