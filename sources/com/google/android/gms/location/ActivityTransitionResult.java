package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.C5403q;

public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new C5403q();

    /* renamed from: e */
    public final List<ActivityTransitionEvent> f14827e;

    public ActivityTransitionResult(List<ActivityTransitionEvent> list) {
        C3495o.m8909k(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                C3495o.m8899a(list.get(i).mo33554Q() >= list.get(i + -1).mo33554Q());
            }
        }
        this.f14827e = Collections.unmodifiableList(list);
    }

    /* renamed from: P */
    public List<ActivityTransitionEvent> mo33564P() {
        return this.f14827e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ActivityTransitionResult.class != obj.getClass()) {
            return false;
        }
        return this.f14827e.equals(((ActivityTransitionResult) obj).f14827e);
    }

    public int hashCode() {
        return this.f14827e.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8974w(parcel, 1, mo33564P(), false);
        C3514a.m8953b(parcel, a);
    }
}
