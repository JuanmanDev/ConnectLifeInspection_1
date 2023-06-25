package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.p368h.C6393p;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new C6393p();

    /* renamed from: e */
    public final List f15395e;

    public zzbb(List list) {
        this.f15395e = list == null ? new ArrayList() : list;
    }

    /* renamed from: P */
    public final List mo37394P() {
        ArrayList arrayList = new ArrayList();
        for (PhoneMultiFactorInfo add : this.f15395e) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8974w(parcel, 1, this.f15395e, false);
        C3514a.m8953b(parcel, a);
    }
}
