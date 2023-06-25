package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p334h.C4971h;

public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new C4971h();

    /* renamed from: e */
    public final String f14787e;

    /* renamed from: l */
    public final long f14788l;

    /* renamed from: m */
    public final short f14789m;

    /* renamed from: n */
    public final double f14790n;

    /* renamed from: o */
    public final double f14791o;

    /* renamed from: p */
    public final float f14792p;

    /* renamed from: q */
    public final int f14793q;

    /* renamed from: r */
    public final int f14794r;

    /* renamed from: s */
    public final int f14795s;

    public zzbh(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "requestId is null or too long: ".concat(valueOf) : new String("requestId is null or too long: "));
        } else if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.f14789m = s;
                this.f14787e = str;
                this.f14790n = d;
                this.f14791o = d2;
                this.f14792p = f;
                this.f14788l = j;
                this.f14793q = i4;
                this.f14794r = i2;
                this.f14795s = i3;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    /* renamed from: P */
    public final String mo33512P() {
        return this.f14787e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbh)) {
            return false;
        }
        zzbh zzbh = (zzbh) obj;
        return this.f14792p == zzbh.f14792p && this.f14790n == zzbh.f14790n && this.f14791o == zzbh.f14791o && this.f14789m == zzbh.f14789m;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f14790n);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f14791o);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2))) * 31) + Float.floatToIntBits(this.f14792p)) * 31) + this.f14789m) * 31) + this.f14793q;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = this.f14789m != 1 ? null : "CIRCLE";
        objArr[1] = this.f14787e.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f14793q);
        objArr[3] = Double.valueOf(this.f14790n);
        objArr[4] = Double.valueOf(this.f14791o);
        objArr[5] = Float.valueOf(this.f14792p);
        objArr[6] = Integer.valueOf(this.f14794r / 1000);
        objArr[7] = Integer.valueOf(this.f14795s);
        objArr[8] = Long.valueOf(this.f14788l);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, mo33512P(), false);
        C3514a.m8965n(parcel, 2, this.f14788l);
        C3514a.m8969r(parcel, 3, this.f14789m);
        C3514a.m8958g(parcel, 4, this.f14790n);
        C3514a.m8958g(parcel, 5, this.f14791o);
        C3514a.m8960i(parcel, 6, this.f14792p);
        C3514a.m8963l(parcel, 7, this.f14793q);
        C3514a.m8963l(parcel, 8, this.f14794r);
        C3514a.m8963l(parcel, 9, this.f14795s);
        C3514a.m8953b(parcel, a);
    }
}
