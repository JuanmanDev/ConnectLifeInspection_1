package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.AdditionalUserInfo;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.p368h.C6378e0;
import p040c.p200q.p363c.p367l.p368h.C6391n;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzp implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzp> CREATOR = new C6378e0();

    /* renamed from: e */
    public final String f15396e;

    /* renamed from: l */
    public final String f15397l;

    /* renamed from: m */
    public final boolean f15398m;

    public zzp(String str, String str2, boolean z) {
        C3495o.m8904f(str);
        C3495o.m8904f(str2);
        this.f15396e = str;
        this.f15397l = str2;
        C6391n.m17920c(str2);
        this.f15398m = z;
    }

    public zzp(boolean z) {
        this.f15398m = z;
        this.f15397l = null;
        this.f15396e = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f15396e, false);
        C3514a.m8970s(parcel, 2, this.f15397l, false);
        C3514a.m8954c(parcel, 3, this.f15398m);
        C3514a.m8953b(parcel, a);
    }
}
