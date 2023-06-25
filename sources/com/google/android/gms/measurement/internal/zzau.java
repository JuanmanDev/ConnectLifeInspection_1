package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p340i.p342b.C5631s;
import p040c.p200q.p201a.p264c.p340i.p342b.C5643t;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new C5643t();

    /* renamed from: e */
    public final Bundle f14898e;

    public zzau(Bundle bundle) {
        this.f14898e = bundle;
    }

    /* renamed from: P */
    public final int mo33657P() {
        return this.f14898e.size();
    }

    /* renamed from: R */
    public final Bundle mo33658R() {
        return new Bundle(this.f14898e);
    }

    /* renamed from: S */
    public final Double mo33659S(String str) {
        return Double.valueOf(this.f14898e.getDouble("value"));
    }

    /* renamed from: T */
    public final Long mo33660T(String str) {
        return Long.valueOf(this.f14898e.getLong("value"));
    }

    /* renamed from: U */
    public final Object mo33661U(String str) {
        return this.f14898e.get(str);
    }

    /* renamed from: V */
    public final String mo33662V(String str) {
        return this.f14898e.getString(str);
    }

    public final Iterator iterator() {
        return new C5631s(this);
    }

    public final String toString() {
        return this.f14898e.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8956e(parcel, 2, mo33658R(), false);
        C3514a.m8953b(parcel, a);
    }
}
