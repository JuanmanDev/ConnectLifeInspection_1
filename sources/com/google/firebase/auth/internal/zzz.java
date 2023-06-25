package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.FirebaseUserMetadata;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.p368h.C6373c;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzz implements FirebaseUserMetadata {
    public static final Parcelable.Creator<zzz> CREATOR = new C6373c();

    /* renamed from: e */
    public final long f15423e;

    /* renamed from: l */
    public final long f15424l;

    public zzz(long j, long j2) {
        this.f15423e = j;
        this.f15424l = j2;
    }

    /* renamed from: a */
    public final JSONObject mo37416a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f15423e);
            jSONObject.put("creationTimestamp", this.f15424l);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8965n(parcel, 1, this.f15423e);
        C3514a.m8965n(parcel, 2, this.f15424l);
        C3514a.m8953b(parcel, a);
    }
}
