package com.google.android.gms.internal.p527firebaseauthapi;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4622mp;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzr> CREATOR = new C4622mp();

    /* renamed from: e */
    public String f14752e;

    /* renamed from: l */
    public String f14753l;

    /* renamed from: m */
    public boolean f14754m;

    /* renamed from: n */
    public String f14755n;

    /* renamed from: o */
    public String f14756o;

    /* renamed from: p */
    public zzaag f14757p;

    /* renamed from: q */
    public String f14758q;

    /* renamed from: r */
    public String f14759r;

    /* renamed from: s */
    public long f14760s;

    /* renamed from: t */
    public long f14761t;

    /* renamed from: u */
    public boolean f14762u;

    /* renamed from: v */
    public zze f14763v;

    /* renamed from: w */
    public List f14764w;

    public zzzr() {
        this.f14757p = new zzaag();
    }

    /* renamed from: P */
    public final long mo33474P() {
        return this.f14760s;
    }

    /* renamed from: Q */
    public final long mo33475Q() {
        return this.f14761t;
    }

    @Nullable
    /* renamed from: R */
    public final Uri mo33476R() {
        if (!TextUtils.isEmpty(this.f14756o)) {
            return Uri.parse(this.f14756o);
        }
        return null;
    }

    @Nullable
    /* renamed from: S */
    public final zze mo33477S() {
        return this.f14763v;
    }

    @NonNull
    /* renamed from: T */
    public final zzzr mo33478T(zze zze) {
        this.f14763v = zze;
        return this;
    }

    @NonNull
    /* renamed from: U */
    public final zzzr mo33479U(@Nullable String str) {
        this.f14755n = str;
        return this;
    }

    @NonNull
    /* renamed from: V */
    public final zzzr mo33480V(@Nullable String str) {
        this.f14753l = str;
        return this;
    }

    /* renamed from: W */
    public final zzzr mo33481W(boolean z) {
        this.f14762u = z;
        return this;
    }

    @NonNull
    /* renamed from: X */
    public final zzzr mo33482X(String str) {
        C3495o.m8904f(str);
        this.f14758q = str;
        return this;
    }

    @NonNull
    /* renamed from: Y */
    public final zzzr mo33483Y(@Nullable String str) {
        this.f14756o = str;
        return this;
    }

    @NonNull
    /* renamed from: Z */
    public final zzzr mo33484Z(List list) {
        C3495o.m8908j(list);
        zzaag zzaag = new zzaag();
        this.f14757p = zzaag;
        zzaag.mo33354R().addAll(list);
        return this;
    }

    /* renamed from: a0 */
    public final zzaag mo33485a0() {
        return this.f14757p;
    }

    @Nullable
    /* renamed from: b0 */
    public final String mo33486b0() {
        return this.f14755n;
    }

    @Nullable
    /* renamed from: c0 */
    public final String mo33487c0() {
        return this.f14753l;
    }

    @NonNull
    /* renamed from: d0 */
    public final String mo33488d0() {
        return this.f14752e;
    }

    @Nullable
    /* renamed from: e0 */
    public final String mo33489e0() {
        return this.f14759r;
    }

    @NonNull
    /* renamed from: f0 */
    public final List mo33490f0() {
        return this.f14764w;
    }

    @NonNull
    /* renamed from: g0 */
    public final List mo33491g0() {
        return this.f14757p.mo33354R();
    }

    /* renamed from: h0 */
    public final boolean mo33492h0() {
        return this.f14754m;
    }

    /* renamed from: i0 */
    public final boolean mo33493i0() {
        return this.f14762u;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 2, this.f14752e, false);
        C3514a.m8970s(parcel, 3, this.f14753l, false);
        C3514a.m8954c(parcel, 4, this.f14754m);
        C3514a.m8970s(parcel, 5, this.f14755n, false);
        C3514a.m8970s(parcel, 6, this.f14756o, false);
        C3514a.m8968q(parcel, 7, this.f14757p, i, false);
        C3514a.m8970s(parcel, 8, this.f14758q, false);
        C3514a.m8970s(parcel, 9, this.f14759r, false);
        C3514a.m8965n(parcel, 10, this.f14760s);
        C3514a.m8965n(parcel, 11, this.f14761t);
        C3514a.m8954c(parcel, 12, this.f14762u);
        C3514a.m8968q(parcel, 13, this.f14763v, i, false);
        C3514a.m8974w(parcel, 14, this.f14764w, false);
        C3514a.m8953b(parcel, a);
    }

    public zzzr(String str, String str2, boolean z, String str3, String str4, zzaag zzaag, String str5, String str6, long j, long j2, boolean z2, zze zze, List list) {
        zzaag zzaag2;
        this.f14752e = str;
        this.f14753l = str2;
        this.f14754m = z;
        this.f14755n = str3;
        this.f14756o = str4;
        if (zzaag == null) {
            zzaag2 = new zzaag();
        } else {
            zzaag2 = zzaag.m21922Q(zzaag);
        }
        this.f14757p = zzaag2;
        this.f14758q = str5;
        this.f14759r = str6;
        this.f14760s = j;
        this.f14761t = j2;
        this.f14762u = z2;
        this.f14763v = zze;
        this.f14764w = list == null ? new ArrayList() : list;
    }
}
