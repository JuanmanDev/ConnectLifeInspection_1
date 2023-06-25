package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzbh;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.C5406t;

public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new C5406t();

    /* renamed from: e */
    public final List<zzbh> f14831e;

    /* renamed from: l */
    public final int f14832l;

    /* renamed from: m */
    public final String f14833m;

    public GeofencingRequest(List<zzbh> list, int i, String str) {
        this.f14831e = list;
        this.f14832l = i;
        this.f14833m = str;
    }

    /* renamed from: P */
    public int mo33573P() {
        return this.f14832l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.f14831e);
        int i = this.f14832l;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i);
        sb2.append(", ");
        sb.append(sb2.toString());
        String valueOf = String.valueOf(this.f14833m);
        sb.append(valueOf.length() != 0 ? "tag=".concat(valueOf) : new String("tag="));
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8974w(parcel, 1, this.f14831e, false);
        C3514a.m8963l(parcel, 2, mo33573P());
        C3514a.m8970s(parcel, 3, this.f14833m, false);
        C3514a.m8953b(parcel, a);
    }
}
