package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p340i.p342b.C5558la;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C5558la();
    @Nullable

    /* renamed from: A */
    public final String f14910A;
    @Nullable

    /* renamed from: B */
    public final Boolean f14911B;

    /* renamed from: C */
    public final long f14912C;
    @Nullable

    /* renamed from: D */
    public final List f14913D;
    @Nullable

    /* renamed from: E */
    public final String f14914E;

    /* renamed from: F */
    public final String f14915F;

    /* renamed from: G */
    public final String f14916G;
    @Nullable

    /* renamed from: H */
    public final String f14917H;
    @Nullable

    /* renamed from: e */
    public final String f14918e;
    @Nullable

    /* renamed from: l */
    public final String f14919l;
    @Nullable

    /* renamed from: m */
    public final String f14920m;
    @Nullable

    /* renamed from: n */
    public final String f14921n;

    /* renamed from: o */
    public final long f14922o;

    /* renamed from: p */
    public final long f14923p;
    @Nullable

    /* renamed from: q */
    public final String f14924q;

    /* renamed from: r */
    public final boolean f14925r;

    /* renamed from: s */
    public final boolean f14926s;

    /* renamed from: t */
    public final long f14927t;
    @Nullable

    /* renamed from: u */
    public final String f14928u;
    @Deprecated

    /* renamed from: v */
    public final long f14929v;

    /* renamed from: w */
    public final long f14930w;

    /* renamed from: x */
    public final int f14931x;

    /* renamed from: y */
    public final boolean f14932y;

    /* renamed from: z */
    public final boolean f14933z;

    public zzq(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, @Nullable String str4, long j2, long j3, @Nullable String str5, boolean z, boolean z2, @Nullable String str6, long j4, long j5, int i, boolean z3, boolean z4, @Nullable String str7, @Nullable Boolean bool, long j6, @Nullable List list, @Nullable String str8, String str9, String str10, @Nullable String str11) {
        C3495o.m8904f(str);
        this.f14918e = str;
        this.f14919l = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f14920m = str3;
        this.f14927t = j;
        this.f14921n = str4;
        this.f14922o = j2;
        this.f14923p = j3;
        this.f14924q = str5;
        this.f14925r = z;
        this.f14926s = z2;
        this.f14928u = str6;
        this.f14929v = 0;
        this.f14930w = j5;
        this.f14931x = i;
        this.f14932y = z3;
        this.f14933z = z4;
        this.f14910A = str7;
        this.f14911B = bool;
        this.f14912C = j6;
        this.f14913D = list;
        this.f14914E = null;
        this.f14915F = str9;
        this.f14916G = str10;
        this.f14917H = str11;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 2, this.f14918e, false);
        C3514a.m8970s(parcel, 3, this.f14919l, false);
        C3514a.m8970s(parcel, 4, this.f14920m, false);
        C3514a.m8970s(parcel, 5, this.f14921n, false);
        C3514a.m8965n(parcel, 6, this.f14922o);
        C3514a.m8965n(parcel, 7, this.f14923p);
        C3514a.m8970s(parcel, 8, this.f14924q, false);
        C3514a.m8954c(parcel, 9, this.f14925r);
        C3514a.m8954c(parcel, 10, this.f14926s);
        C3514a.m8965n(parcel, 11, this.f14927t);
        C3514a.m8970s(parcel, 12, this.f14928u, false);
        C3514a.m8965n(parcel, 13, this.f14929v);
        C3514a.m8965n(parcel, 14, this.f14930w);
        C3514a.m8963l(parcel, 15, this.f14931x);
        C3514a.m8954c(parcel, 16, this.f14932y);
        C3514a.m8954c(parcel, 18, this.f14933z);
        C3514a.m8970s(parcel, 19, this.f14910A, false);
        C3514a.m8955d(parcel, 21, this.f14911B, false);
        C3514a.m8965n(parcel, 22, this.f14912C);
        C3514a.m8972u(parcel, 23, this.f14913D, false);
        C3514a.m8970s(parcel, 24, this.f14914E, false);
        C3514a.m8970s(parcel, 25, this.f14915F, false);
        C3514a.m8970s(parcel, 26, this.f14916G, false);
        C3514a.m8970s(parcel, 27, this.f14917H, false);
        C3514a.m8953b(parcel, a);
    }

    public zzq(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j, long j2, @Nullable String str5, boolean z, boolean z2, long j3, @Nullable String str6, long j4, long j5, int i, boolean z3, boolean z4, @Nullable String str7, @Nullable Boolean bool, long j6, @Nullable List list, @Nullable String str8, String str9, String str10, String str11) {
        this.f14918e = str;
        this.f14919l = str2;
        this.f14920m = str3;
        this.f14927t = j3;
        this.f14921n = str4;
        this.f14922o = j;
        this.f14923p = j2;
        this.f14924q = str5;
        this.f14925r = z;
        this.f14926s = z2;
        this.f14928u = str6;
        this.f14929v = j4;
        this.f14930w = j5;
        this.f14931x = i;
        this.f14932y = z3;
        this.f14933z = z4;
        this.f14910A = str7;
        this.f14911B = bool;
        this.f14912C = j6;
        this.f14913D = list;
        this.f14914E = str8;
        this.f14915F = str9;
        this.f14916G = str10;
        this.f14917H = str11;
    }
}
