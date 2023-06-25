package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p276d.p289n.C3564o;
import p040c.p200q.p201a.p264c.p294g.p333g.C4353d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaag */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaag> CREATOR = new C4353d();

    /* renamed from: e */
    public final List f14622e;

    public zzaag() {
        this.f14622e = new ArrayList();
    }

    /* renamed from: P */
    public static zzaag m21921P(JSONArray jSONArray) {
        zzaae zzaae;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzaag(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject == null) {
                zzaae = new zzaae();
            } else {
                zzaae = new zzaae(C3564o.m9093a(jSONObject.optString("federatedId", (String) null)), C3564o.m9093a(jSONObject.optString(FileProvider.DISPLAYNAME_FIELD, (String) null)), C3564o.m9093a(jSONObject.optString("photoUrl", (String) null)), C3564o.m9093a(jSONObject.optString("providerId", (String) null)), (String) null, C3564o.m9093a(jSONObject.optString("phoneNumber", (String) null)), C3564o.m9093a(jSONObject.optString("email", (String) null)));
            }
            arrayList.add(zzaae);
        }
        return new zzaag(arrayList);
    }

    /* renamed from: Q */
    public static zzaag m21922Q(zzaag zzaag) {
        List list = zzaag.f14622e;
        zzaag zzaag2 = new zzaag();
        if (list != null) {
            zzaag2.f14622e.addAll(list);
        }
        return zzaag2;
    }

    /* renamed from: R */
    public final List mo33354R() {
        return this.f14622e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8974w(parcel, 2, this.f14622e, false);
        C3514a.m8953b(parcel, a);
    }

    public zzaag(List list) {
        if (list == null || list.isEmpty()) {
            this.f14622e = Collections.emptyList();
        } else {
            this.f14622e = Collections.unmodifiableList(list);
        }
    }
}
