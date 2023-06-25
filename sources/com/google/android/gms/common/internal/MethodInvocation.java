package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3479j0;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class MethodInvocation extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new C3479j0();

    /* renamed from: e */
    public final int f8264e;

    /* renamed from: l */
    public final int f8265l;

    /* renamed from: m */
    public final int f8266m;

    /* renamed from: n */
    public final long f8267n;

    /* renamed from: o */
    public final long f8268o;
    @Nullable

    /* renamed from: p */
    public final String f8269p;
    @Nullable

    /* renamed from: q */
    public final String f8270q;

    /* renamed from: r */
    public final int f8271r;

    /* renamed from: s */
    public final int f8272s;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, @Nullable String str, @Nullable String str2, int i4, int i5) {
        this.f8264e = i;
        this.f8265l = i2;
        this.f8266m = i3;
        this.f8267n = j;
        this.f8268o = j2;
        this.f8269p = str;
        this.f8270q = str2;
        this.f8271r = i4;
        this.f8272s = i5;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8264e);
        C3514a.m8963l(parcel, 2, this.f8265l);
        C3514a.m8963l(parcel, 3, this.f8266m);
        C3514a.m8965n(parcel, 4, this.f8267n);
        C3514a.m8965n(parcel, 5, this.f8268o);
        C3514a.m8970s(parcel, 6, this.f8269p, false);
        C3514a.m8970s(parcel, 7, this.f8270q, false);
        C3514a.m8963l(parcel, 8, this.f8271r);
        C3514a.m8963l(parcel, 9, this.f8272s);
        C3514a.m8953b(parcel, a);
    }
}
