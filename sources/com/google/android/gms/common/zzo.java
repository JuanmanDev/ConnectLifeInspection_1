package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.C3329d0;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p292e.C3585a;
import p040c.p200q.p201a.p264c.p292e.C3587b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C3329d0();

    /* renamed from: e */
    public final String f8352e;

    /* renamed from: l */
    public final boolean f8353l;

    /* renamed from: m */
    public final boolean f8354m;

    /* renamed from: n */
    public final Context f8355n;

    /* renamed from: o */
    public final boolean f8356o;

    public zzo(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.f8352e = str;
        this.f8353l = z;
        this.f8354m = z2;
        this.f8355n = (Context) C3587b.m9123g(C3585a.C3586a.m9122e(iBinder));
        this.f8356o = z3;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [c.q.a.c.e.a, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f8352e, false);
        C3514a.m8954c(parcel, 2, this.f8353l);
        C3514a.m8954c(parcel, 3, this.f8354m);
        C3514a.m8962k(parcel, 4, C3587b.m9124k(this.f8355n), false);
        C3514a.m8954c(parcel, 5, this.f8356o);
        C3514a.m8953b(parcel, a);
    }
}
