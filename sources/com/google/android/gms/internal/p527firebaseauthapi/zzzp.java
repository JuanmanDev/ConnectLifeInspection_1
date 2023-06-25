package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p276d.p289n.C3564o;
import p040c.p200q.p201a.p264c.p294g.p333g.C4297ao;
import p040c.p200q.p201a.p264c.p294g.p333g.C4595lp;
import p040c.p200q.p201a.p264c.p294g.p333g.C4730r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzp extends AbstractSafeParcelable implements C4297ao<zzzp> {
    public static final Parcelable.Creator<zzzp> CREATOR = new C4595lp();

    /* renamed from: l */
    public static final String f14750l = zzzp.class.getSimpleName();

    /* renamed from: e */
    public zzzt f14751e;

    public zzzp() {
    }

    /* renamed from: P */
    public final List mo33472P() {
        return this.f14751e.mo33495Q();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4297ao mo25802c(String str) {
        zzzt zzzt;
        int i;
        zzzr zzzr;
        String str2 = str;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("users")) {
                this.f14751e = new zzzt();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                Parcelable.Creator<zzzt> creator = zzzt.CREATOR;
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        ArrayList arrayList = new ArrayList(optJSONArray.length());
                        boolean z = false;
                        int i2 = 0;
                        while (i2 < optJSONArray.length()) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                            if (jSONObject2 == null) {
                                zzzr = new zzzr();
                                i = i2;
                            } else {
                                i = i2;
                                zzzr = new zzzr(C3564o.m9093a(jSONObject2.optString("localId", (String) null)), C3564o.m9093a(jSONObject2.optString("email", (String) null)), jSONObject2.optBoolean("emailVerified", z), C3564o.m9093a(jSONObject2.optString(FileProvider.DISPLAYNAME_FIELD, (String) null)), C3564o.m9093a(jSONObject2.optString("photoUrl", (String) null)), zzaag.m21921P(jSONObject2.optJSONArray("providerUserInfo")), C3564o.m9093a(jSONObject2.optString("rawPassword", (String) null)), C3564o.m9093a(jSONObject2.optString("phoneNumber", (String) null)), jSONObject2.optLong("createdAt", 0), jSONObject2.optLong("lastLoginAt", 0), false, (zze) null, zzaac.m21907U(jSONObject2.optJSONArray("mfaInfo")));
                            }
                            arrayList.add(zzzr);
                            i2 = i + 1;
                            z = false;
                        }
                        zzzt = new zzzt(arrayList);
                        this.f14751e = zzzt;
                    }
                }
                zzzt = new zzzt(new ArrayList());
                this.f14751e = zzzt;
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C4730r.m12949a(e, f14750l, str2);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 2, this.f14751e, i, false);
        C3514a.m8953b(parcel, a);
    }

    public zzzp(zzzt zzzt) {
        zzzt zzzt2;
        if (zzzt == null) {
            zzzt2 = new zzzt();
        } else {
            zzzt2 = zzzt.m21973P(zzzt);
        }
        this.f14751e = zzzt2;
    }
}
