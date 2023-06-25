package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p335i.C5182n1;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new C5182n1();

    /* renamed from: e */
    public final long f14805e;

    /* renamed from: l */
    public final long f14806l;

    /* renamed from: m */
    public final boolean f14807m;
    @Nullable

    /* renamed from: n */
    public final String f14808n;
    @Nullable

    /* renamed from: o */
    public final String f14809o;
    @Nullable

    /* renamed from: p */
    public final String f14810p;
    @Nullable

    /* renamed from: q */
    public final Bundle f14811q;
    @Nullable

    /* renamed from: r */
    public final String f14812r;

    public zzcl(long j, long j2, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Bundle bundle, @Nullable String str4) {
        this.f14805e = j;
        this.f14806l = j2;
        this.f14807m = z;
        this.f14808n = str;
        this.f14809o = str2;
        this.f14810p = str3;
        this.f14811q = bundle;
        this.f14812r = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8965n(parcel, 1, this.f14805e);
        C3514a.m8965n(parcel, 2, this.f14806l);
        C3514a.m8954c(parcel, 3, this.f14807m);
        C3514a.m8970s(parcel, 4, this.f14808n, false);
        C3514a.m8970s(parcel, 5, this.f14809o, false);
        C3514a.m8970s(parcel, 6, this.f14810p, false);
        C3514a.m8956e(parcel, 7, this.f14811q, false);
        C3514a.m8970s(parcel, 8, this.f14812r, false);
        C3514a.m8953b(parcel, a);
    }
}
