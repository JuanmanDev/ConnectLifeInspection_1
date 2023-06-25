package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.hisense.connect_life.core.global.EventBusConstKt;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4515j;
import p040c.p200q.p201a.p264c.p294g.p333g.C4962zn;
import p040c.p200q.p363c.p367l.p368h.C6372b0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaay */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaay extends AbstractSafeParcelable implements C4962zn {
    public static final Parcelable.Creator<zzaay> CREATOR = new C4515j();

    /* renamed from: e */
    public String f14639e;

    /* renamed from: l */
    public String f14640l;

    /* renamed from: m */
    public String f14641m;

    /* renamed from: n */
    public String f14642n;

    /* renamed from: o */
    public String f14643o;
    @Nullable

    /* renamed from: p */
    public String f14644p;

    /* renamed from: q */
    public String f14645q;

    /* renamed from: r */
    public String f14646r;

    /* renamed from: s */
    public boolean f14647s;

    /* renamed from: t */
    public boolean f14648t;

    /* renamed from: u */
    public String f14649u;

    /* renamed from: v */
    public String f14650v;

    /* renamed from: w */
    public String f14651w;

    /* renamed from: x */
    public String f14652x;

    /* renamed from: y */
    public boolean f14653y;
    @Nullable

    /* renamed from: z */
    public String f14654z;

    public zzaay() {
        this.f14647s = true;
        this.f14648t = true;
    }

    /* renamed from: P */
    public final zzaay mo33360P(boolean z) {
        this.f14648t = false;
        return this;
    }

    /* renamed from: Q */
    public final zzaay mo33361Q(String str) {
        C3495o.m8904f(str);
        this.f14640l = str;
        return this;
    }

    /* renamed from: R */
    public final zzaay mo33362R(boolean z) {
        this.f14653y = true;
        return this;
    }

    /* renamed from: S */
    public final zzaay mo33363S(@Nullable String str) {
        this.f14652x = str;
        return this;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 2, this.f14639e, false);
        C3514a.m8970s(parcel, 3, this.f14640l, false);
        C3514a.m8970s(parcel, 4, this.f14641m, false);
        C3514a.m8970s(parcel, 5, this.f14642n, false);
        C3514a.m8970s(parcel, 6, this.f14643o, false);
        C3514a.m8970s(parcel, 7, this.f14644p, false);
        C3514a.m8970s(parcel, 8, this.f14645q, false);
        C3514a.m8970s(parcel, 9, this.f14646r, false);
        C3514a.m8954c(parcel, 10, this.f14647s);
        C3514a.m8954c(parcel, 11, this.f14648t);
        C3514a.m8970s(parcel, 12, this.f14649u, false);
        C3514a.m8970s(parcel, 13, this.f14650v, false);
        C3514a.m8970s(parcel, 14, this.f14651w, false);
        C3514a.m8970s(parcel, 15, this.f14652x, false);
        C3514a.m8954c(parcel, 16, this.f14653y);
        C3514a.m8970s(parcel, 17, this.f14654z, false);
        C3514a.m8953b(parcel, a);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.f14648t);
        jSONObject.put("returnSecureToken", this.f14647s);
        String str = this.f14640l;
        if (str != null) {
            jSONObject.put(EventBusConstKt.ID_TOKEN, str);
        }
        String str2 = this.f14645q;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.f14652x;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.f14654z;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.f14650v)) {
            jSONObject.put("sessionId", this.f14650v);
        }
        if (!TextUtils.isEmpty(this.f14651w)) {
            jSONObject.put("requestUri", this.f14651w);
        } else {
            String str5 = this.f14639e;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        }
        jSONObject.put("returnIdpCredential", this.f14653y);
        return jSONObject.toString();
    }

    public zzaay(C6372b0 b0Var, String str) {
        C3495o.m8908j(b0Var);
        String d = b0Var.mo30461d();
        C3495o.m8904f(d);
        this.f14650v = d;
        C3495o.m8904f(str);
        this.f14651w = str;
        String c = b0Var.mo30460c();
        C3495o.m8904f(c);
        this.f14643o = c;
        this.f14647s = true;
        this.f14645q = "providerId=".concat(String.valueOf(c));
    }

    public zzaay(@Nullable String str, @Nullable String str2, String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.f14639e = "http://localhost";
        this.f14641m = str;
        this.f14642n = str2;
        this.f14646r = str5;
        this.f14649u = str6;
        this.f14652x = str7;
        this.f14654z = str8;
        this.f14647s = true;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.f14642n) || !TextUtils.isEmpty(this.f14649u)) {
            C3495o.m8904f(str3);
            this.f14643o = str3;
            this.f14644p = null;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f14641m)) {
                sb.append("id_token=");
                sb.append(this.f14641m);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f14642n)) {
                sb.append("access_token=");
                sb.append(this.f14642n);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f14644p)) {
                sb.append("identifier=");
                sb.append(this.f14644p);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f14646r)) {
                sb.append("oauth_token_secret=");
                sb.append(this.f14646r);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f14649u)) {
                sb.append("code=");
                sb.append(this.f14649u);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(str9)) {
                sb.append("nonce=");
                sb.append(str9);
                sb.append("&");
            }
            sb.append("providerId=");
            sb.append(this.f14643o);
            this.f14645q = sb.toString();
            this.f14648t = true;
            return;
        }
        throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }

    public zzaay(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, String str11, String str12, boolean z3, String str13) {
        this.f14639e = str;
        this.f14640l = str2;
        this.f14641m = str3;
        this.f14642n = str4;
        this.f14643o = str5;
        this.f14644p = str6;
        this.f14645q = str7;
        this.f14646r = str8;
        this.f14647s = z;
        this.f14648t = z2;
        this.f14649u = str9;
        this.f14650v = str10;
        this.f14651w = str11;
        this.f14652x = str12;
        this.f14653y = z3;
        this.f14654z = str13;
    }
}
