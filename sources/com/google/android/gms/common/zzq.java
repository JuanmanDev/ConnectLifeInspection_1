package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.C3331e0;
import p040c.p200q.p201a.p264c.p276d.C3538k0;
import p040c.p200q.p201a.p264c.p276d.C3577s;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C3331e0();

    /* renamed from: e */
    public final boolean f8357e;

    /* renamed from: l */
    public final String f8358l;

    /* renamed from: m */
    public final int f8359m;

    /* renamed from: n */
    public final int f8360n;

    public zzq(boolean z, String str, int i, int i2) {
        this.f8357e = z;
        this.f8358l = str;
        this.f8359m = C3538k0.m9033a(i) - 1;
        this.f8360n = C3577s.m9112a(i2) - 1;
    }

    /* renamed from: P */
    public final boolean mo24657P() {
        return this.f8357e;
    }

    /* renamed from: Q */
    public final int mo24658Q() {
        return C3577s.m9112a(this.f8360n);
    }

    /* renamed from: R */
    public final int mo24659R() {
        return C3538k0.m9033a(this.f8359m);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8954c(parcel, 1, this.f8357e);
        C3514a.m8970s(parcel, 2, this.f8358l, false);
        C3514a.m8963l(parcel, 3, this.f8359m);
        C3514a.m8963l(parcel, 4, this.f8360n);
        C3514a.m8953b(parcel, a);
    }

    public final String zza() {
        return this.f8358l;
    }
}
