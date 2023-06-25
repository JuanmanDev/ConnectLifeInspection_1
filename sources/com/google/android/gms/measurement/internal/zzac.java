package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p340i.p342b.C5451d;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new C5451d();
    @Nullable

    /* renamed from: e */
    public String f14887e;

    /* renamed from: l */
    public String f14888l;

    /* renamed from: m */
    public zzkw f14889m;

    /* renamed from: n */
    public long f14890n;

    /* renamed from: o */
    public boolean f14891o;
    @Nullable

    /* renamed from: p */
    public String f14892p;
    @Nullable

    /* renamed from: q */
    public final zzaw f14893q;

    /* renamed from: r */
    public long f14894r;
    @Nullable

    /* renamed from: s */
    public zzaw f14895s;

    /* renamed from: t */
    public final long f14896t;
    @Nullable

    /* renamed from: u */
    public final zzaw f14897u;

    public zzac(zzac zzac) {
        C3495o.m8908j(zzac);
        this.f14887e = zzac.f14887e;
        this.f14888l = zzac.f14888l;
        this.f14889m = zzac.f14889m;
        this.f14890n = zzac.f14890n;
        this.f14891o = zzac.f14891o;
        this.f14892p = zzac.f14892p;
        this.f14893q = zzac.f14893q;
        this.f14894r = zzac.f14894r;
        this.f14895s = zzac.f14895s;
        this.f14896t = zzac.f14896t;
        this.f14897u = zzac.f14897u;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 2, this.f14887e, false);
        C3514a.m8970s(parcel, 3, this.f14888l, false);
        C3514a.m8968q(parcel, 4, this.f14889m, i, false);
        C3514a.m8965n(parcel, 5, this.f14890n);
        C3514a.m8954c(parcel, 6, this.f14891o);
        C3514a.m8970s(parcel, 7, this.f14892p, false);
        C3514a.m8968q(parcel, 8, this.f14893q, i, false);
        C3514a.m8965n(parcel, 9, this.f14894r);
        C3514a.m8968q(parcel, 10, this.f14895s, i, false);
        C3514a.m8965n(parcel, 11, this.f14896t);
        C3514a.m8968q(parcel, 12, this.f14897u, i, false);
        C3514a.m8953b(parcel, a);
    }

    public zzac(@Nullable String str, String str2, zzkw zzkw, long j, boolean z, @Nullable String str3, @Nullable zzaw zzaw, long j2, @Nullable zzaw zzaw2, long j3, @Nullable zzaw zzaw3) {
        this.f14887e = str;
        this.f14888l = str2;
        this.f14889m = zzkw;
        this.f14890n = j;
        this.f14891o = z;
        this.f14892p = str3;
        this.f14893q = zzaw;
        this.f14894r = j2;
        this.f14895s = zzaw2;
        this.f14896t = j3;
        this.f14897u = zzaw3;
    }
}
