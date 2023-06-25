package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.p368h.C6377e;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzae extends MultiFactorResolver {
    public static final Parcelable.Creator<zzae> CREATOR = new C6377e();

    /* renamed from: e */
    public final List f15387e = new ArrayList();

    /* renamed from: l */
    public final zzag f15388l;

    /* renamed from: m */
    public final String f15389m;

    /* renamed from: n */
    public final zze f15390n;

    /* renamed from: o */
    public final zzx f15391o;

    public zzae(List list, zzag zzag, String str, @Nullable zze zze, @Nullable zzx zzx) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                this.f15387e.add((PhoneMultiFactorInfo) multiFactorInfo);
            }
        }
        C3495o.m8908j(zzag);
        this.f15388l = zzag;
        C3495o.m8904f(str);
        this.f15389m = str;
        this.f15390n = zze;
        this.f15391o = zzx;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8974w(parcel, 1, this.f15387e, false);
        C3514a.m8968q(parcel, 2, this.f15388l, i, false);
        C3514a.m8970s(parcel, 3, this.f15389m, false);
        C3514a.m8968q(parcel, 4, this.f15390n, i, false);
        C3514a.m8968q(parcel, 5, this.f15391o, i, false);
        C3514a.m8953b(parcel, a);
    }
}
