package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.C5399m;

public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new C5399m();

    /* renamed from: e */
    public final int f14818e;

    /* renamed from: l */
    public final int f14819l;

    public ActivityTransition(int i, int i2) {
        this.f14818e = i;
        this.f14819l = i2;
    }

    /* renamed from: R */
    public static void m21988R(int i) {
        boolean z = true;
        if (i < 0 || i > 1) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        C3495o.m8900b(z, sb.toString());
    }

    /* renamed from: P */
    public int mo33547P() {
        return this.f14818e;
    }

    /* renamed from: Q */
    public int mo33548Q() {
        return this.f14819l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f14818e == activityTransition.f14818e && this.f14819l == activityTransition.f14819l;
    }

    public int hashCode() {
        return C3487m.m8887b(Integer.valueOf(this.f14818e), Integer.valueOf(this.f14819l));
    }

    public String toString() {
        int i = this.f14818e;
        int i2 = this.f14819l;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, mo33547P());
        C3514a.m8963l(parcel, 2, mo33548Q());
        C3514a.m8953b(parcel, a);
    }
}
