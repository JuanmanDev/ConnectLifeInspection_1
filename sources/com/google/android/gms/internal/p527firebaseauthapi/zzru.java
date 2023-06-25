package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4510il;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzru */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzru extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzru> CREATOR = new C4510il();

    /* renamed from: e */
    public final String f14683e;

    /* renamed from: l */
    public final String f14684l;

    /* renamed from: m */
    public final String f14685m;

    public zzru(String str, String str2, String str3) {
        this.f14683e = str;
        this.f14684l = str2;
        this.f14685m = str3;
    }

    /* renamed from: P */
    public final String mo33427P() {
        return this.f14683e;
    }

    /* renamed from: Q */
    public final String mo33428Q() {
        return this.f14684l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14683e, false);
        C3514a.m8970s(parcel, 2, this.f14684l, false);
        C3514a.m8970s(parcel, 3, this.f14685m, false);
        C3514a.m8953b(parcel, a);
    }

    public final String zza() {
        return this.f14685m;
    }
}
