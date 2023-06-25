package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p277g.C3356i;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p344k.p345b.C5733b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zaa extends AbstractSafeParcelable implements C3356i {
    public static final Parcelable.Creator<zaa> CREATOR = new C5733b();

    /* renamed from: e */
    public final int f14952e;

    /* renamed from: l */
    public int f14953l;
    @Nullable

    /* renamed from: m */
    public Intent f14954m;

    public zaa() {
        this(2, 0, (Intent) null);
    }

    /* renamed from: F */
    public final Status mo20282F() {
        if (this.f14953l == 0) {
            return Status.f8173p;
        }
        return Status.f8177t;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f14952e);
        C3514a.m8963l(parcel, 2, this.f14953l);
        C3514a.m8968q(parcel, 3, this.f14954m, i, false);
        C3514a.m8953b(parcel, a);
    }

    public zaa(int i, int i2, @Nullable Intent intent) {
        this.f14952e = i;
        this.f14953l = i2;
        this.f14954m = intent;
    }
}
