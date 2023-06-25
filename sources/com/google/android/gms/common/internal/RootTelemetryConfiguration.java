package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3446a1;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new C3446a1();

    /* renamed from: e */
    public final int f8273e;

    /* renamed from: l */
    public final boolean f8274l;

    /* renamed from: m */
    public final boolean f8275m;

    /* renamed from: n */
    public final int f8276n;

    /* renamed from: o */
    public final int f8277o;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.f8273e = i;
        this.f8274l = z;
        this.f8275m = z2;
        this.f8276n = i2;
        this.f8277o = i3;
    }

    /* renamed from: P */
    public int mo24598P() {
        return this.f8276n;
    }

    /* renamed from: Q */
    public int mo24599Q() {
        return this.f8277o;
    }

    /* renamed from: R */
    public boolean mo24600R() {
        return this.f8274l;
    }

    /* renamed from: S */
    public boolean mo24601S() {
        return this.f8275m;
    }

    public int getVersion() {
        return this.f8273e;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, getVersion());
        C3514a.m8954c(parcel, 2, mo24600R());
        C3514a.m8954c(parcel, 3, mo24601S());
        C3514a.m8963l(parcel, 4, mo24598P());
        C3514a.m8963l(parcel, 5, mo24599Q());
        C3514a.m8953b(parcel, a);
    }
}
