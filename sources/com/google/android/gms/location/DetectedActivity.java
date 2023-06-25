package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.C5404r;

public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new C5404r();

    /* renamed from: m */
    public static final int[] f14828m = {0, 1, 2, 3, 7, 8, 16, 17};

    /* renamed from: e */
    public int f14829e;

    /* renamed from: l */
    public int f14830l;

    public DetectedActivity(int i, int i2) {
        this.f14829e = i;
        this.f14830l = i2;
    }

    /* renamed from: Q */
    public static void m21995Q(int i) {
        boolean z = false;
        for (int i2 : f14828m) {
            if (i2 == i) {
                z = true;
            }
        }
        if (!z) {
            StringBuilder sb = new StringBuilder(81);
            sb.append(i);
            sb.append(" is not a valid DetectedActivity supported by Activity Transition API.");
            sb.toString();
        }
    }

    /* renamed from: P */
    public int mo33568P() {
        int i = this.f14829e;
        if (i > 19 || i < 0) {
            return 4;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DetectedActivity.class == obj.getClass()) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            return this.f14829e == detectedActivity.f14829e && this.f14830l == detectedActivity.f14830l;
        }
    }

    public int hashCode() {
        return C3487m.m8887b(Integer.valueOf(this.f14829e), Integer.valueOf(this.f14830l));
    }

    public String toString() {
        String str;
        int P = mo33568P();
        if (P == 0) {
            str = "IN_VEHICLE";
        } else if (P == 1) {
            str = "ON_BICYCLE";
        } else if (P == 2) {
            str = "ON_FOOT";
        } else if (P == 3) {
            str = "STILL";
        } else if (P == 4) {
            str = "UNKNOWN";
        } else if (P == 5) {
            str = "TILTING";
        } else if (P == 7) {
            str = "WALKING";
        } else if (P != 8) {
            switch (P) {
                case 16:
                    str = "IN_ROAD_VEHICLE";
                    break;
                case 17:
                    str = "IN_RAIL_VEHICLE";
                    break;
                case 18:
                    str = "IN_TWO_WHEELER_VEHICLE";
                    break;
                case 19:
                    str = "IN_FOUR_WHEELER_VEHICLE";
                    break;
                default:
                    str = Integer.toString(P);
                    break;
            }
        } else {
            str = DebugCoroutineInfoImplKt.RUNNING;
        }
        int i = this.f14830l;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f14829e);
        C3514a.m8963l(parcel, 2, this.f14830l);
        C3514a.m8953b(parcel, a);
    }
}
