package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.C5401o;
import p040c.p200q.p201a.p264c.p338h.C5402p;

public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new C5402p();

    /* renamed from: n */
    public static final Comparator<ActivityTransition> f14823n = new C5401o();

    /* renamed from: e */
    public final List<ActivityTransition> f14824e;
    @Nullable

    /* renamed from: l */
    public final String f14825l;

    /* renamed from: m */
    public final List<ClientIdentity> f14826m;

    public ActivityTransitionRequest(List<ActivityTransition> list, @Nullable String str, @Nullable List<ClientIdentity> list2) {
        C3495o.m8909k(list, "transitions can't be null");
        C3495o.m8900b(list.size() > 0, "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(f14823n);
        for (ActivityTransition next : list) {
            C3495o.m8900b(treeSet.add(next), String.format("Found duplicated transition: %s.", new Object[]{next}));
        }
        this.f14824e = Collections.unmodifiableList(list);
        this.f14825l = str;
        this.f14826m = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ActivityTransitionRequest.class == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            return C3487m.m8886a(this.f14824e, activityTransitionRequest.f14824e) && C3487m.m8886a(this.f14825l, activityTransitionRequest.f14825l) && C3487m.m8886a(this.f14826m, activityTransitionRequest.f14826m);
        }
    }

    public int hashCode() {
        int hashCode = this.f14824e.hashCode() * 31;
        String str = this.f14825l;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<ClientIdentity> list = this.f14826m;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f14824e);
        String str = this.f14825l;
        String valueOf2 = String.valueOf(this.f14826m);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append('\'');
        sb.append(", mClients=");
        sb.append(valueOf2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8974w(parcel, 1, this.f14824e, false);
        C3514a.m8970s(parcel, 2, this.f14825l, false);
        C3514a.m8974w(parcel, 3, this.f14826m, false);
        C3514a.m8953b(parcel, a);
    }
}
