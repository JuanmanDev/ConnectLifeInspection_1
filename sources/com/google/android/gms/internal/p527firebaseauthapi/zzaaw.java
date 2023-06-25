package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p276d.p289n.C3564o;
import p040c.p200q.p201a.p264c.p294g.p333g.C4488i;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaw */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaaw> CREATOR = new C4488i();

    /* renamed from: e */
    public final int f14637e;

    /* renamed from: l */
    public List f14638l;

    public zzaaw() {
        this((List) null);
    }

    /* renamed from: P */
    public static zzaaw m21925P(zzaaw zzaaw) {
        return new zzaaw(zzaaw.f14638l);
    }

    /* renamed from: Q */
    public final List mo33358Q() {
        return this.f14638l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f14637e);
        C3514a.m8972u(parcel, 2, this.f14638l, false);
        C3514a.m8953b(parcel, a);
    }

    public zzaaw(int i, List list) {
        this.f14637e = i;
        if (list == null || list.isEmpty()) {
            this.f14638l = Collections.emptyList();
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            list.set(i2, C3564o.m9093a((String) list.get(i2)));
        }
        this.f14638l = Collections.unmodifiableList(list);
    }

    public zzaaw(@Nullable List list) {
        this.f14637e = 1;
        this.f14638l = new ArrayList();
        if (list != null && !list.isEmpty()) {
            this.f14638l.addAll(list);
        }
    }
}
