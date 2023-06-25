package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.C5398l;

public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new C5398l();

    /* renamed from: e */
    public List<DetectedActivity> f14813e;

    /* renamed from: l */
    public long f14814l;

    /* renamed from: m */
    public long f14815m;

    /* renamed from: n */
    public int f14816n;

    /* renamed from: o */
    public Bundle f14817o;

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2, int i, Bundle bundle) {
        boolean z = true;
        C3495o.m8900b(list != null && list.size() > 0, "Must have at least 1 detected activity");
        C3495o.m8900b((j <= 0 || j2 <= 0) ? false : z, "Must set times");
        this.f14813e = list;
        this.f14814l = j;
        this.f14815m = j2;
        this.f14816n = i;
        this.f14817o = bundle;
    }

    /* renamed from: P */
    public static boolean m21987P(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || ((bundle != null && bundle2 == null) || bundle.size() != bundle2.size())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!m21987P(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ActivityRecognitionResult.class == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            return this.f14814l == activityRecognitionResult.f14814l && this.f14815m == activityRecognitionResult.f14815m && this.f14816n == activityRecognitionResult.f14816n && C3487m.m8886a(this.f14813e, activityRecognitionResult.f14813e) && m21987P(this.f14817o, activityRecognitionResult.f14817o);
        }
    }

    public int hashCode() {
        return C3487m.m8887b(Long.valueOf(this.f14814l), Long.valueOf(this.f14815m), Integer.valueOf(this.f14816n), this.f14813e, this.f14817o);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f14813e);
        long j = this.f14814l;
        long j2 = this.f14815m;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8974w(parcel, 1, this.f14813e, false);
        C3514a.m8965n(parcel, 2, this.f14814l);
        C3514a.m8965n(parcel, 3, this.f14815m);
        C3514a.m8963l(parcel, 4, this.f14816n);
        C3514a.m8956e(parcel, 5, this.f14817o, false);
        C3514a.m8953b(parcel, a);
    }
}
