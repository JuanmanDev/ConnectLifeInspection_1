package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4959zk;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzrc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrc> CREATOR = new C4959zk();

    /* renamed from: e */
    public final String f14664e;

    /* renamed from: l */
    public final String f14665l;

    public zzrc(String str, String str2) {
        this.f14664e = str;
        this.f14665l = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14664e, false);
        C3514a.m8970s(parcel, 2, this.f14665l, false);
        C3514a.m8953b(parcel, a);
    }
}
