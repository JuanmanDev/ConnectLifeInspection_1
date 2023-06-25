package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3483k1;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C3483k1();

    /* renamed from: e */
    public Bundle f8294e;

    /* renamed from: l */
    public Feature[] f8295l;

    /* renamed from: m */
    public int f8296m;
    @Nullable

    /* renamed from: n */
    public ConnectionTelemetryConfiguration f8297n;

    public zzj() {
    }

    public zzj(Bundle bundle, Feature[] featureArr, int i, @Nullable ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f8294e = bundle;
        this.f8295l = featureArr;
        this.f8296m = i;
        this.f8297n = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8956e(parcel, 1, this.f8294e, false);
        C3514a.m8973v(parcel, 2, this.f8295l, i, false);
        C3514a.m8963l(parcel, 3, this.f8296m);
        C3514a.m8968q(parcel, 4, this.f8297n, i, false);
        C3514a.m8953b(parcel, a);
    }
}
