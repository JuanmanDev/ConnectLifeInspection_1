package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.p268a.p269d.C3234e;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new C3234e();

    /* renamed from: e */
    public final int f7986e;

    /* renamed from: l */
    public boolean f7987l;

    /* renamed from: m */
    public long f7988m;

    /* renamed from: n */
    public final boolean f7989n;

    public DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.f7986e = i;
        this.f7987l = z;
        this.f7988m = j;
        this.f7989n = z2;
    }

    /* renamed from: P */
    public long mo24322P() {
        return this.f7988m;
    }

    /* renamed from: Q */
    public boolean mo24323Q() {
        return this.f7989n;
    }

    /* renamed from: R */
    public boolean mo24324R() {
        return this.f7987l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f7986e);
        C3514a.m8954c(parcel, 2, mo24324R());
        C3514a.m8965n(parcel, 3, mo24322P());
        C3514a.m8954c(parcel, 4, mo24323Q());
        C3514a.m8953b(parcel, a);
    }
}
