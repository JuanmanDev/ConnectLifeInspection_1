package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.core.graphics.PaintCompat;
import androidx.work.impl.background.systemalarm.CommandHandler;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.C5390d;

public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C5390d();

    /* renamed from: e */
    public int f14839e;

    /* renamed from: l */
    public long f14840l;

    /* renamed from: m */
    public long f14841m;

    /* renamed from: n */
    public boolean f14842n;

    /* renamed from: o */
    public long f14843o;

    /* renamed from: p */
    public int f14844p;

    /* renamed from: q */
    public float f14845q;

    /* renamed from: r */
    public long f14846r;

    public LocationRequest() {
        this.f14839e = 102;
        this.f14840l = 3600000;
        this.f14841m = CommandHandler.WORK_PROCESSING_TIME_IN_MS;
        this.f14842n = false;
        this.f14843o = Long.MAX_VALUE;
        this.f14844p = Integer.MAX_VALUE;
        this.f14845q = 0.0f;
        this.f14846r = 0;
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.f14839e = i;
        this.f14840l = j;
        this.f14841m = j2;
        this.f14842n = z;
        this.f14843o = j3;
        this.f14844p = i2;
        this.f14845q = f;
        this.f14846r = j4;
    }

    /* renamed from: P */
    public final long mo33581P() {
        long j = this.f14846r;
        long j2 = this.f14840l;
        return j < j2 ? j2 : j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f14839e == locationRequest.f14839e && this.f14840l == locationRequest.f14840l && this.f14841m == locationRequest.f14841m && this.f14842n == locationRequest.f14842n && this.f14843o == locationRequest.f14843o && this.f14844p == locationRequest.f14844p && this.f14845q == locationRequest.f14845q && mo33581P() == locationRequest.mo33581P();
    }

    public final int hashCode() {
        return C3487m.m8887b(Integer.valueOf(this.f14839e), Long.valueOf(this.f14840l), Float.valueOf(this.f14845q), Long.valueOf(this.f14846r));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.f14839e;
        sb.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f14839e != 105) {
            sb.append(" requested=");
            sb.append(this.f14840l);
            sb.append(LanguageConstKt.f15959ms);
        }
        sb.append(" fastest=");
        sb.append(this.f14841m);
        sb.append(LanguageConstKt.f15959ms);
        if (this.f14846r > this.f14840l) {
            sb.append(" maxWait=");
            sb.append(this.f14846r);
            sb.append(LanguageConstKt.f15959ms);
        }
        if (this.f14845q > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f14845q);
            sb.append(PaintCompat.EM_STRING);
        }
        long j = this.f14843o;
        if (j != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append(LanguageConstKt.f15959ms);
        }
        if (this.f14844p != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f14844p);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f14839e);
        C3514a.m8965n(parcel, 2, this.f14840l);
        C3514a.m8965n(parcel, 3, this.f14841m);
        C3514a.m8954c(parcel, 4, this.f14842n);
        C3514a.m8965n(parcel, 5, this.f14843o);
        C3514a.m8963l(parcel, 6, this.f14844p);
        C3514a.m8960i(parcel, 7, this.f14845q);
        C3514a.m8965n(parcel, 8, this.f14846r);
        C3514a.m8953b(parcel, a);
    }
}
