package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3528x;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class TelemetryData extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR = new C3528x();

    /* renamed from: e */
    public final int f8278e;

    /* renamed from: l */
    public List<MethodInvocation> f8279l;

    public TelemetryData(int i, List<MethodInvocation> list) {
        this.f8278e = i;
        this.f8279l = list;
    }

    /* renamed from: P */
    public final int mo24604P() {
        return this.f8278e;
    }

    @Nullable
    /* renamed from: Q */
    public final List<MethodInvocation> mo24605Q() {
        return this.f8279l;
    }

    /* renamed from: R */
    public final void mo24606R(@NonNull MethodInvocation methodInvocation) {
        if (this.f8279l == null) {
            this.f8279l = new ArrayList();
        }
        this.f8279l.add(methodInvocation);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8278e);
        C3514a.m8974w(parcel, 2, this.f8279l, false);
        C3514a.m8953b(parcel, a);
    }
}
