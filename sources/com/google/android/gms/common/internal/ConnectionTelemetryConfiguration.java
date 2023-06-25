package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3486l1;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new C3486l1();

    /* renamed from: e */
    public final RootTelemetryConfiguration f8242e;

    /* renamed from: l */
    public final boolean f8243l;

    /* renamed from: m */
    public final boolean f8244m;
    @Nullable

    /* renamed from: n */
    public final int[] f8245n;

    /* renamed from: o */
    public final int f8246o;
    @Nullable

    /* renamed from: p */
    public final int[] f8247p;

    public ConnectionTelemetryConfiguration(@NonNull RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, @Nullable int[] iArr, int i, @Nullable int[] iArr2) {
        this.f8242e = rootTelemetryConfiguration;
        this.f8243l = z;
        this.f8244m = z2;
        this.f8245n = iArr;
        this.f8246o = i;
        this.f8247p = iArr2;
    }

    /* renamed from: P */
    public int mo24588P() {
        return this.f8246o;
    }

    @Nullable
    /* renamed from: Q */
    public int[] mo24589Q() {
        return this.f8245n;
    }

    @Nullable
    /* renamed from: R */
    public int[] mo24590R() {
        return this.f8247p;
    }

    /* renamed from: S */
    public boolean mo24591S() {
        return this.f8243l;
    }

    /* renamed from: T */
    public boolean mo24592T() {
        return this.f8244m;
    }

    @NonNull
    /* renamed from: U */
    public final RootTelemetryConfiguration mo24593U() {
        return this.f8242e;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, this.f8242e, i, false);
        C3514a.m8954c(parcel, 2, mo24591S());
        C3514a.m8954c(parcel, 3, mo24592T());
        C3514a.m8964m(parcel, 4, mo24589Q(), false);
        C3514a.m8963l(parcel, 5, mo24588P());
        C3514a.m8964m(parcel, 6, mo24590R(), false);
        C3514a.m8953b(parcel, a);
    }
}
