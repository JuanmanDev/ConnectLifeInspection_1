package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.C3576r;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class Feature extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new C3576r();

    /* renamed from: e */
    public final String f8160e;
    @Deprecated

    /* renamed from: l */
    public final int f8161l;

    /* renamed from: m */
    public final long f8162m;

    public Feature(@NonNull String str, int i, long j) {
        this.f8160e = str;
        this.f8161l = i;
        this.f8162m = j;
    }

    public Feature(@NonNull String str, long j) {
        this.f8160e = str;
        this.f8162m = j;
        this.f8161l = -1;
    }

    @NonNull
    /* renamed from: P */
    public String mo24495P() {
        return this.f8160e;
    }

    /* renamed from: Q */
    public long mo24496Q() {
        long j = this.f8162m;
        return j == -1 ? (long) this.f8161l : j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((mo24495P() == null || !mo24495P().equals(feature.mo24495P())) && (mo24495P() != null || feature.mo24495P() != null)) || mo24496Q() != feature.mo24496Q()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C3487m.m8887b(mo24495P(), Long.valueOf(mo24496Q()));
    }

    @NonNull
    public final String toString() {
        C3487m.C3488a c = C3487m.m8888c(this);
        c.mo20747a("name", mo24495P());
        c.mo20747a("version", Long.valueOf(mo24496Q()));
        return c.toString();
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, mo24495P(), false);
        C3514a.m8963l(parcel, 2, this.f8161l);
        C3514a.m8965n(parcel, 3, mo24496Q());
        C3514a.m8953b(parcel, a);
    }
}
