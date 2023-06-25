package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p276d.p285l.C3547c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new C3547c();

    /* renamed from: e */
    public final int f8298e;
    @NonNull

    /* renamed from: l */
    public final String f8299l;

    /* renamed from: m */
    public final int f8300m;

    public FavaDiagnosticsEntity(int i, @NonNull String str, int i2) {
        this.f8298e = i;
        this.f8299l = str;
        this.f8300m = i2;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8298e);
        C3514a.m8970s(parcel, 2, this.f8299l, false);
        C3514a.m8963l(parcel, 3, this.f8300m);
        C3514a.m8953b(parcel, a);
    }
}
