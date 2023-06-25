package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.p527firebaseauthapi.zzaae;
import com.google.android.gms.internal.p527firebaseauthapi.zzqx;
import com.google.android.gms.internal.p527firebaseauthapi.zzzr;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.C6368g;
import p040c.p200q.p363c.p367l.p368h.C6382g0;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzt extends AbstractSafeParcelable implements C6368g {
    public static final Parcelable.Creator<zzt> CREATOR = new C6382g0();
    @NonNull

    /* renamed from: e */
    public final String f15402e;
    @NonNull

    /* renamed from: l */
    public final String f15403l;
    @Nullable

    /* renamed from: m */
    public final String f15404m;
    @Nullable

    /* renamed from: n */
    public String f15405n;
    @Nullable

    /* renamed from: o */
    public Uri f15406o;
    @Nullable

    /* renamed from: p */
    public final String f15407p;
    @Nullable

    /* renamed from: q */
    public final String f15408q;

    /* renamed from: r */
    public final boolean f15409r;
    @Nullable

    /* renamed from: s */
    public final String f15410s;

    public zzt(zzzr zzzr, String str) {
        C3495o.m8908j(zzzr);
        C3495o.m8904f("firebase");
        String d0 = zzzr.mo33488d0();
        C3495o.m8904f(d0);
        this.f15402e = d0;
        this.f15403l = "firebase";
        this.f15407p = zzzr.mo33487c0();
        this.f15404m = zzzr.mo33486b0();
        Uri R = zzzr.mo33476R();
        if (R != null) {
            this.f15405n = R.toString();
            this.f15406o = R;
        }
        this.f15409r = zzzr.mo33492h0();
        this.f15410s = null;
        this.f15408q = zzzr.mo33489e0();
    }

    @NonNull
    /* renamed from: P */
    public final String mo37400P() {
        return this.f15402e;
    }

    @Nullable
    /* renamed from: Q */
    public final String mo37401Q() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f15402e);
            jSONObject.putOpt("providerId", this.f15403l);
            jSONObject.putOpt(FileProvider.DISPLAYNAME_FIELD, this.f15404m);
            jSONObject.putOpt("photoUrl", this.f15405n);
            jSONObject.putOpt("email", this.f15407p);
            jSONObject.putOpt("phoneNumber", this.f15408q);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f15409r));
            jSONObject.putOpt("rawUserInfo", this.f15410s);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new zzqx(e);
        }
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f15402e, false);
        C3514a.m8970s(parcel, 2, this.f15403l, false);
        C3514a.m8970s(parcel, 3, this.f15404m, false);
        C3514a.m8970s(parcel, 4, this.f15405n, false);
        C3514a.m8970s(parcel, 5, this.f15407p, false);
        C3514a.m8970s(parcel, 6, this.f15408q, false);
        C3514a.m8954c(parcel, 7, this.f15409r);
        C3514a.m8970s(parcel, 8, this.f15410s, false);
        C3514a.m8953b(parcel, a);
    }

    @NonNull
    /* renamed from: y */
    public final String mo30456y() {
        return this.f15403l;
    }

    @Nullable
    public final String zza() {
        return this.f15410s;
    }

    public zzt(zzaae zzaae) {
        C3495o.m8908j(zzaae);
        this.f15402e = zzaae.mo33348S();
        String U = zzaae.mo33350U();
        C3495o.m8904f(U);
        this.f15403l = U;
        this.f15404m = zzaae.mo33346Q();
        Uri P = zzaae.mo33345P();
        if (P != null) {
            this.f15405n = P.toString();
            this.f15406o = P;
        }
        this.f15407p = zzaae.mo33347R();
        this.f15408q = zzaae.mo33349T();
        this.f15409r = false;
        this.f15410s = zzaae.mo33351V();
    }

    public zzt(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z, @Nullable String str7) {
        this.f15402e = str;
        this.f15403l = str2;
        this.f15407p = str3;
        this.f15408q = str4;
        this.f15404m = str5;
        this.f15405n = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f15406o = Uri.parse(this.f15405n);
        }
        this.f15409r = z;
        this.f15410s = str7;
    }
}
