package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p338h.C5397k;

public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new C5397k();

    /* renamed from: e */
    public final List<String> f14872e;

    /* renamed from: l */
    public final PendingIntent f14873l;

    /* renamed from: m */
    public final String f14874m;

    public zzal(@Nullable List<String> list, @Nullable PendingIntent pendingIntent, String str) {
        this.f14872e = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f14873l = pendingIntent;
        this.f14874m = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8972u(parcel, 1, this.f14872e, false);
        C3514a.m8968q(parcel, 2, this.f14873l, i, false);
        C3514a.m8970s(parcel, 3, this.f14874m, false);
        C3514a.m8953b(parcel, a);
    }
}
