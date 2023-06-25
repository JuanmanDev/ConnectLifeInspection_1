package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p277g.C3431o;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new C3431o();

    /* renamed from: e */
    public final int f8171e;

    /* renamed from: l */
    public final String f8172l;

    public Scope(int i, String str) {
        C3495o.m8905g(str, "scopeUri must not be null or empty");
        this.f8171e = i;
        this.f8172l = str;
    }

    @NonNull
    /* renamed from: P */
    public String mo24526P() {
        return this.f8172l;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f8172l.equals(((Scope) obj).f8172l);
    }

    public int hashCode() {
        return this.f8172l.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f8172l;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8171e);
        C3514a.m8970s(parcel, 2, mo24526P(), false);
        C3514a.m8953b(parcel, a);
    }

    public Scope(@NonNull String str) {
        this(1, str);
    }
}
