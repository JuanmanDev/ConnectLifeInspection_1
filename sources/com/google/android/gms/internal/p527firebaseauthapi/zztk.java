package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.zze;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4430fm;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zztk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztk> CREATOR = new C4430fm();

    /* renamed from: e */
    public final Status f14736e;

    /* renamed from: l */
    public final zze f14737l;

    /* renamed from: m */
    public final String f14738m;

    /* renamed from: n */
    public final String f14739n;

    public zztk(Status status, zze zze, String str, @Nullable String str2) {
        this.f14736e = status;
        this.f14737l = zze;
        this.f14738m = str;
        this.f14739n = str2;
    }

    /* renamed from: P */
    public final Status mo33461P() {
        return this.f14736e;
    }

    /* renamed from: Q */
    public final zze mo33462Q() {
        return this.f14737l;
    }

    /* renamed from: R */
    public final String mo33463R() {
        return this.f14738m;
    }

    /* renamed from: S */
    public final String mo33464S() {
        return this.f14739n;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, this.f14736e, i, false);
        C3514a.m8968q(parcel, 2, this.f14737l, i, false);
        C3514a.m8970s(parcel, 3, this.f14738m, false);
        C3514a.m8970s(parcel, 4, this.f14739n, false);
        C3514a.m8953b(parcel, a);
    }
}
