package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3502q0;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new C3502q0();

    /* renamed from: e */
    public final int f8289e;

    /* renamed from: l */
    public final int f8290l;

    /* renamed from: m */
    public final int f8291m;
    @Deprecated
    @Nullable

    /* renamed from: n */
    public final Scope[] f8292n;

    public zax(int i, int i2, int i3, @Nullable Scope[] scopeArr) {
        this.f8289e = i;
        this.f8290l = i2;
        this.f8291m = i3;
        this.f8292n = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8289e);
        C3514a.m8963l(parcel, 2, this.f8290l);
        C3514a.m8963l(parcel, 3, this.f8291m);
        C3514a.m8973v(parcel, 4, this.f8292n, i, false);
        C3514a.m8953b(parcel, a);
    }
}
