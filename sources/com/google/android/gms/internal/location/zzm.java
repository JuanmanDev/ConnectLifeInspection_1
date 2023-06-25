package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p334h.C4972i;

public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new C4972i();

    /* renamed from: n */
    public static final List<ClientIdentity> f14796n = Collections.emptyList();

    /* renamed from: o */
    public static final zzj f14797o = new zzj();

    /* renamed from: e */
    public zzj f14798e;

    /* renamed from: l */
    public List<ClientIdentity> f14799l;
    @Nullable

    /* renamed from: m */
    public String f14800m;

    public zzm(zzj zzj, List<ClientIdentity> list, String str) {
        this.f14798e = zzj;
        this.f14799l = list;
        this.f14800m = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzm = (zzm) obj;
        return C3487m.m8886a(this.f14798e, zzm.f14798e) && C3487m.m8886a(this.f14799l, zzm.f14799l) && C3487m.m8886a(this.f14800m, zzm.f14800m);
    }

    public final int hashCode() {
        return this.f14798e.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, this.f14798e, i, false);
        C3514a.m8974w(parcel, 2, this.f14799l, false);
        C3514a.m8970s(parcel, 3, this.f14800m, false);
        C3514a.m8953b(parcel, a);
    }
}
