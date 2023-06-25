package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p334h.C4969f;

public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbd> CREATOR = new C4969f();

    /* renamed from: r */
    public static final List<ClientIdentity> f14773r = Collections.emptyList();

    /* renamed from: e */
    public LocationRequest f14774e;

    /* renamed from: l */
    public List<ClientIdentity> f14775l;
    @Nullable

    /* renamed from: m */
    public String f14776m;

    /* renamed from: n */
    public boolean f14777n;

    /* renamed from: o */
    public boolean f14778o;

    /* renamed from: p */
    public boolean f14779p;
    @Nullable

    /* renamed from: q */
    public String f14780q;

    public zzbd(LocationRequest locationRequest, List<ClientIdentity> list, @Nullable String str, boolean z, boolean z2, boolean z3, String str2) {
        this.f14774e = locationRequest;
        this.f14775l = list;
        this.f14776m = str;
        this.f14777n = z;
        this.f14778o = z2;
        this.f14779p = z3;
        this.f14780q = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbd = (zzbd) obj;
        return C3487m.m8886a(this.f14774e, zzbd.f14774e) && C3487m.m8886a(this.f14775l, zzbd.f14775l) && C3487m.m8886a(this.f14776m, zzbd.f14776m) && this.f14777n == zzbd.f14777n && this.f14778o == zzbd.f14778o && this.f14779p == zzbd.f14779p && C3487m.m8886a(this.f14780q, zzbd.f14780q);
    }

    public final int hashCode() {
        return this.f14774e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14774e);
        if (this.f14776m != null) {
            sb.append(" tag=");
            sb.append(this.f14776m);
        }
        if (this.f14780q != null) {
            sb.append(" moduleId=");
            sb.append(this.f14780q);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f14777n);
        sb.append(" clients=");
        sb.append(this.f14775l);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f14778o);
        if (this.f14779p) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, this.f14774e, i, false);
        C3514a.m8974w(parcel, 5, this.f14775l, false);
        C3514a.m8970s(parcel, 6, this.f14776m, false);
        C3514a.m8954c(parcel, 7, this.f14777n);
        C3514a.m8954c(parcel, 8, this.f14778o);
        C3514a.m8954c(parcel, 9, this.f14779p);
        C3514a.m8970s(parcel, 10, this.f14780q, false);
        C3514a.m8953b(parcel, a);
    }
}
