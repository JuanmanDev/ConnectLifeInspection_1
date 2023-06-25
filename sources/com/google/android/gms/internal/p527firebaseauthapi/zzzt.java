package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4649np;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzt> CREATOR = new C4649np();

    /* renamed from: e */
    public final List f14765e;

    public zzzt() {
        this.f14765e = new ArrayList();
    }

    /* renamed from: P */
    public static zzzt m21973P(zzzt zzzt) {
        C3495o.m8908j(zzzt);
        List list = zzzt.f14765e;
        zzzt zzzt2 = new zzzt();
        if (list != null && !list.isEmpty()) {
            zzzt2.f14765e.addAll(list);
        }
        return zzzt2;
    }

    /* renamed from: Q */
    public final List mo33495Q() {
        return this.f14765e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8974w(parcel, 2, this.f14765e, false);
        C3514a.m8953b(parcel, a);
    }

    public zzzt(List list) {
        List list2;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f14765e = list2;
    }
}
