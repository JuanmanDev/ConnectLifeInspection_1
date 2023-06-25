package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.p028os.EnvironmentCompat;
import com.facebook.stetho.inspector.elements.android.FragmentDescriptor;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.p339b.C5386a;

public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new C5386a();

    /* renamed from: e */
    public final int f14861e;

    /* renamed from: l */
    public final String f14862l;

    /* renamed from: m */
    public final String f14863m;

    /* renamed from: n */
    public final String f14864n;

    public PlaceReport(int i, String str, String str2, String str3) {
        this.f14861e = i;
        this.f14862l = str;
        this.f14863m = str2;
        this.f14864n = str3;
    }

    /* renamed from: P */
    public String mo33601P() {
        return this.f14862l;
    }

    /* renamed from: Q */
    public String mo33602Q() {
        return this.f14863m;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return C3487m.m8886a(this.f14862l, placeReport.f14862l) && C3487m.m8886a(this.f14863m, placeReport.f14863m) && C3487m.m8886a(this.f14864n, placeReport.f14864n);
    }

    public int hashCode() {
        return C3487m.m8887b(this.f14862l, this.f14863m, this.f14864n);
    }

    public String toString() {
        C3487m.C3488a c = C3487m.m8888c(this);
        c.mo20747a("placeId", this.f14862l);
        c.mo20747a(FragmentDescriptor.TAG_ATTRIBUTE_NAME, this.f14863m);
        if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(this.f14864n)) {
            c.mo20747a("source", this.f14864n);
        }
        return c.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f14861e);
        C3514a.m8970s(parcel, 2, mo33601P(), false);
        C3514a.m8970s(parcel, 3, mo33602Q(), false);
        C3514a.m8970s(parcel, 4, this.f14864n, false);
        C3514a.m8953b(parcel, a);
    }
}
