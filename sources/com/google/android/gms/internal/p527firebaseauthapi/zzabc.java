package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.hisense.connect_life.core.global.EventBusConstKt;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p276d.p289n.C3564o;
import p040c.p200q.p201a.p264c.p294g.p333g.C4297ao;
import p040c.p200q.p201a.p264c.p294g.p333g.C4596m;
import p040c.p200q.p201a.p264c.p294g.p333g.C4730r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzabc extends AbstractSafeParcelable implements C4297ao<zzabc> {
    public static final Parcelable.Creator<zzabc> CREATOR = new C4596m();

    /* renamed from: o */
    public static final String f14655o = zzabc.class.getSimpleName();

    /* renamed from: e */
    public String f14656e;

    /* renamed from: l */
    public String f14657l;

    /* renamed from: m */
    public long f14658m;

    /* renamed from: n */
    public boolean f14659n;

    public zzabc() {
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4297ao mo25802c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f14656e = C3564o.m9093a(jSONObject.optString(EventBusConstKt.ID_TOKEN, (String) null));
            this.f14657l = C3564o.m9093a(jSONObject.optString("refreshToken", (String) null));
            this.f14658m = jSONObject.optLong("expiresIn", 0);
            this.f14659n = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C4730r.m12949a(e, f14655o, str);
        }
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 2, this.f14656e, false);
        C3514a.m8970s(parcel, 3, this.f14657l, false);
        C3514a.m8965n(parcel, 4, this.f14658m);
        C3514a.m8954c(parcel, 5, this.f14659n);
        C3514a.m8953b(parcel, a);
    }

    public zzabc(String str, String str2, long j, boolean z) {
        this.f14656e = str;
        this.f14657l = str2;
        this.f14658m = j;
        this.f14659n = z;
    }
}
