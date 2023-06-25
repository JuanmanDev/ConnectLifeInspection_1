package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p276d.p289n.C3556g;
import p040c.p200q.p201a.p264c.p276d.p289n.C3564o;
import p040c.p200q.p201a.p264c.p294g.p333g.C4297ao;
import p040c.p200q.p201a.p264c.p294g.p333g.C4703pp;
import p040c.p200q.p201a.p264c.p294g.p333g.C4730r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzy */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzy extends AbstractSafeParcelable implements C4297ao<zzzy> {
    public static final Parcelable.Creator<zzzy> CREATOR = new C4703pp();

    /* renamed from: p */
    public static final String f14766p = zzzy.class.getSimpleName();

    /* renamed from: e */
    public String f14767e;

    /* renamed from: l */
    public String f14768l;

    /* renamed from: m */
    public Long f14769m;

    /* renamed from: n */
    public String f14770n;

    /* renamed from: o */
    public Long f14771o;

    public zzzy() {
        this.f14771o = Long.valueOf(System.currentTimeMillis());
    }

    /* renamed from: R */
    public static zzzy m21975R(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzzy zzzy = new zzzy();
            zzzy.f14767e = jSONObject.optString("refresh_token", (String) null);
            zzzy.f14768l = jSONObject.optString("access_token", (String) null);
            zzzy.f14769m = Long.valueOf(jSONObject.optLong("expires_in"));
            zzzy.f14770n = jSONObject.optString("token_type", (String) null);
            zzzy.f14771o = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzzy;
        } catch (JSONException e) {
            throw new zzqx(e);
        }
    }

    /* renamed from: P */
    public final long mo33497P() {
        Long l = this.f14769m;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: Q */
    public final long mo33498Q() {
        return this.f14771o.longValue();
    }

    /* renamed from: S */
    public final String mo33499S() {
        return this.f14768l;
    }

    /* renamed from: T */
    public final String mo33500T() {
        return this.f14767e;
    }

    @Nullable
    /* renamed from: U */
    public final String mo33501U() {
        return this.f14770n;
    }

    /* renamed from: V */
    public final String mo33502V() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f14767e);
            jSONObject.put("access_token", this.f14768l);
            jSONObject.put("expires_in", this.f14769m);
            jSONObject.put("token_type", this.f14770n);
            jSONObject.put("issued_at", this.f14771o);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new zzqx(e);
        }
    }

    /* renamed from: W */
    public final void mo33503W(String str) {
        C3495o.m8904f(str);
        this.f14767e = str;
    }

    /* renamed from: X */
    public final boolean mo33504X() {
        return C3556g.m9065c().mo20838a() + PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS < this.f14771o.longValue() + (this.f14769m.longValue() * 1000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4297ao mo25802c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f14767e = C3564o.m9093a(jSONObject.optString("refresh_token"));
            this.f14768l = C3564o.m9093a(jSONObject.optString("access_token"));
            this.f14769m = Long.valueOf(jSONObject.optLong("expires_in", 0));
            this.f14770n = C3564o.m9093a(jSONObject.optString("token_type"));
            this.f14771o = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C4730r.m12949a(e, f14766p, str);
        }
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 2, this.f14767e, false);
        C3514a.m8970s(parcel, 3, this.f14768l, false);
        C3514a.m8966o(parcel, 4, Long.valueOf(mo33497P()), false);
        C3514a.m8970s(parcel, 5, this.f14770n, false);
        C3514a.m8966o(parcel, 6, Long.valueOf(this.f14771o.longValue()), false);
        C3514a.m8953b(parcel, a);
    }

    public zzzy(String str, String str2, Long l, String str3) {
        this(str, str2, l, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public zzzy(String str, String str2, Long l, String str3, Long l2) {
        this.f14767e = str;
        this.f14768l = str2;
        this.f14769m = l;
        this.f14770n = str3;
        this.f14771o = l2;
    }
}
