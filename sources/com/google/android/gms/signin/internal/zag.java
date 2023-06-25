package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p277g.C3356i;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p344k.p345b.C5738g;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zag extends AbstractSafeParcelable implements C3356i {
    public static final Parcelable.Creator<zag> CREATOR = new C5738g();

    /* renamed from: e */
    public final List<String> f14955e;
    @Nullable

    /* renamed from: l */
    public final String f14956l;

    public zag(List<String> list, @Nullable String str) {
        this.f14955e = list;
        this.f14956l = str;
    }

    /* renamed from: F */
    public final Status mo20282F() {
        if (this.f14956l != null) {
            return Status.f8173p;
        }
        return Status.f8177t;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8972u(parcel, 1, this.f14955e, false);
        C3514a.m8970s(parcel, 2, this.f14956l, false);
        C3514a.m8953b(parcel, a);
    }
}
