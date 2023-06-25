package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p340i.p342b.C5655u;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new C5655u();

    /* renamed from: e */
    public final String f14899e;

    /* renamed from: l */
    public final zzau f14900l;

    /* renamed from: m */
    public final String f14901m;

    /* renamed from: n */
    public final long f14902n;

    public zzaw(zzaw zzaw, long j) {
        C3495o.m8908j(zzaw);
        this.f14899e = zzaw.f14899e;
        this.f14900l = zzaw.f14900l;
        this.f14901m = zzaw.f14901m;
        this.f14902n = j;
    }

    public final String toString() {
        String str = this.f14901m;
        String str2 = this.f14899e;
        String valueOf = String.valueOf(this.f14900l);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5655u.m16139a(this, parcel, i);
    }

    public zzaw(String str, zzau zzau, String str2, long j) {
        this.f14899e = str;
        this.f14900l = zzau;
        this.f14901m = str2;
        this.f14902n = j;
    }
}
