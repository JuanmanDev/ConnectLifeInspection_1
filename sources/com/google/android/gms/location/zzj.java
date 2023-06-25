package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.C5405s;

public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C5405s();

    /* renamed from: e */
    public boolean f14875e;

    /* renamed from: l */
    public long f14876l;

    /* renamed from: m */
    public float f14877m;

    /* renamed from: n */
    public long f14878n;

    /* renamed from: o */
    public int f14879o;

    public zzj() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public zzj(boolean z, long j, float f, long j2, int i) {
        this.f14875e = z;
        this.f14876l = j;
        this.f14877m = f;
        this.f14878n = j2;
        this.f14879o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        return this.f14875e == zzj.f14875e && this.f14876l == zzj.f14876l && Float.compare(this.f14877m, zzj.f14877m) == 0 && this.f14878n == zzj.f14878n && this.f14879o == zzj.f14879o;
    }

    public final int hashCode() {
        return C3487m.m8887b(Boolean.valueOf(this.f14875e), Long.valueOf(this.f14876l), Float.valueOf(this.f14877m), Long.valueOf(this.f14878n), Integer.valueOf(this.f14879o));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f14875e);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f14876l);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f14877m);
        long j = this.f14878n;
        if (j != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append(LanguageConstKt.f15959ms);
        }
        if (this.f14879o != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f14879o);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8954c(parcel, 1, this.f14875e);
        C3514a.m8965n(parcel, 2, this.f14876l);
        C3514a.m8960i(parcel, 3, this.f14877m);
        C3514a.m8965n(parcel, 4, this.f14878n);
        C3514a.m8963l(parcel, 5, this.f14879o);
        C3514a.m8953b(parcel, a);
    }
}
