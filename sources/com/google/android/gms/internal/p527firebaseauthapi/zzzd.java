package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4297ao;
import p040c.p200q.p201a.p264c.p294g.p333g.C4460gp;
import p040c.p200q.p201a.p264c.p294g.p333g.C4730r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzd extends AbstractSafeParcelable implements C4297ao<zzzd> {
    public static final Parcelable.Creator<zzzd> CREATOR = new C4460gp();

    /* renamed from: q */
    public static final String f14743q = zzzd.class.getSimpleName();

    /* renamed from: e */
    public String f14744e;

    /* renamed from: l */
    public boolean f14745l;

    /* renamed from: m */
    public String f14746m;

    /* renamed from: n */
    public boolean f14747n;

    /* renamed from: o */
    public zzaaw f14748o;

    /* renamed from: p */
    public List f14749p;

    public zzzd() {
        this.f14748o = new zzaaw((List) null);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4297ao mo25802c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f14744e = jSONObject.optString("authUri", (String) null);
            this.f14745l = jSONObject.optBoolean("registered", false);
            this.f14746m = jSONObject.optString("providerId", (String) null);
            this.f14747n = jSONObject.optBoolean("forExistingProvider", false);
            if (!jSONObject.has("allProviders")) {
                this.f14748o = new zzaaw((List) null);
            } else {
                this.f14748o = new zzaaw(1, C4730r.m12950b(jSONObject.optJSONArray("allProviders")));
            }
            this.f14749p = C4730r.m12950b(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C4730r.m12949a(e, f14743q, str);
        }
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 2, this.f14744e, false);
        C3514a.m8954c(parcel, 3, this.f14745l);
        C3514a.m8970s(parcel, 4, this.f14746m, false);
        C3514a.m8954c(parcel, 5, this.f14747n);
        C3514a.m8968q(parcel, 6, this.f14748o, i, false);
        C3514a.m8972u(parcel, 7, this.f14749p, false);
        C3514a.m8953b(parcel, a);
    }

    public zzzd(String str, boolean z, String str2, boolean z2, zzaaw zzaaw, List list) {
        zzaaw zzaaw2;
        this.f14744e = str;
        this.f14745l = z;
        this.f14746m = str2;
        this.f14747n = z2;
        if (zzaaw == null) {
            zzaaw2 = new zzaaw((List) null);
        } else {
            zzaaw2 = zzaaw.m21925P(zzaaw);
        }
        this.f14748o = zzaaw2;
        this.f14749p = list;
    }
}
