package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.C5400n;

public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new C5400n();

    /* renamed from: e */
    public final int f14820e;

    /* renamed from: l */
    public final int f14821l;

    /* renamed from: m */
    public final long f14822m;

    public ActivityTransitionEvent(int i, int i2, long j) {
        DetectedActivity.m21995Q(i);
        ActivityTransition.m21988R(i2);
        this.f14820e = i;
        this.f14821l = i2;
        this.f14822m = j;
    }

    /* renamed from: P */
    public int mo33553P() {
        return this.f14820e;
    }

    /* renamed from: Q */
    public long mo33554Q() {
        return this.f14822m;
    }

    /* renamed from: R */
    public int mo33555R() {
        return this.f14821l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f14820e == activityTransitionEvent.f14820e && this.f14821l == activityTransitionEvent.f14821l && this.f14822m == activityTransitionEvent.f14822m;
    }

    public int hashCode() {
        return C3487m.m8887b(Integer.valueOf(this.f14820e), Integer.valueOf(this.f14821l), Long.valueOf(this.f14822m));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f14820e;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" ");
        int i2 = this.f14821l;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(" ");
        long j = this.f14822m;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, mo33553P());
        C3514a.m8963l(parcel, 2, mo33555R());
        C3514a.m8965n(parcel, 3, mo33554Q());
        C3514a.m8953b(parcel, a);
    }
}
