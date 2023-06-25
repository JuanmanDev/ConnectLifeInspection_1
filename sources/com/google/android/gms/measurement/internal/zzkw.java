package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p340i.p342b.C5438ba;
import p040c.p200q.p201a.p264c.p340i.p342b.C5450ca;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzkw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkw> CREATOR = new C5438ba();

    /* renamed from: e */
    public final int f14903e;

    /* renamed from: l */
    public final String f14904l;

    /* renamed from: m */
    public final long f14905m;
    @Nullable

    /* renamed from: n */
    public final Long f14906n;
    @Nullable

    /* renamed from: o */
    public final String f14907o;

    /* renamed from: p */
    public final String f14908p;
    @Nullable

    /* renamed from: q */
    public final Double f14909q;

    public zzkw(int i, String str, long j, @Nullable Long l, Float f, @Nullable String str2, String str3, @Nullable Double d) {
        this.f14903e = i;
        this.f14904l = str;
        this.f14905m = j;
        this.f14906n = l;
        if (i == 1) {
            this.f14909q = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f14909q = d;
        }
        this.f14907o = str2;
        this.f14908p = str3;
    }

    @Nullable
    /* renamed from: P */
    public final Object mo33668P() {
        Long l = this.f14906n;
        if (l != null) {
            return l;
        }
        Double d = this.f14909q;
        if (d != null) {
            return d;
        }
        String str = this.f14907o;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5438ba.m15558a(this, parcel, i);
    }

    public zzkw(C5450ca caVar) {
        this(caVar.f10374c, caVar.f10375d, caVar.f10376e, caVar.f10373b);
    }

    public zzkw(String str, long j, @Nullable Object obj, String str2) {
        C3495o.m8904f(str);
        this.f14903e = 2;
        this.f14904l = str;
        this.f14905m = j;
        this.f14908p = str2;
        if (obj == null) {
            this.f14906n = null;
            this.f14909q = null;
            this.f14907o = null;
        } else if (obj instanceof Long) {
            this.f14906n = (Long) obj;
            this.f14909q = null;
            this.f14907o = null;
        } else if (obj instanceof String) {
            this.f14906n = null;
            this.f14909q = null;
            this.f14907o = (String) obj;
        } else if (obj instanceof Double) {
            this.f14906n = null;
            this.f14909q = (Double) obj;
            this.f14907o = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
