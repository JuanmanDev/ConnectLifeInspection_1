package com.google.firebase.auth;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import com.google.android.gms.internal.p527firebaseauthapi.zzqx;
import com.hisense.connect_life.core.global.EventBusConstKt;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.C6411p;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class PhoneMultiFactorInfo extends MultiFactorInfo {
    @NonNull
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = new C6411p();

    /* renamed from: e */
    public final String f15362e;

    /* renamed from: l */
    public final String f15363l;

    /* renamed from: m */
    public final long f15364m;

    /* renamed from: n */
    public final String f15365n;

    public PhoneMultiFactorInfo(@NonNull String str, String str2, long j, @NonNull String str3) {
        C3495o.m8904f(str);
        this.f15362e = str;
        this.f15363l = str2;
        this.f15364m = j;
        C3495o.m8904f(str3);
        this.f15365n = str3;
    }

    @Nullable
    /* renamed from: P */
    public JSONObject mo37366P() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", EventBusConstKt.PHONE);
            jSONObject.putOpt("uid", this.f15362e);
            jSONObject.putOpt(FileProvider.DISPLAYNAME_FIELD, this.f15363l);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f15364m));
            jSONObject.putOpt("phoneNumber", this.f15365n);
            return jSONObject;
        } catch (JSONException e) {
            throw new zzqx(e);
        }
    }

    @Nullable
    /* renamed from: Q */
    public String mo37377Q() {
        return this.f15363l;
    }

    /* renamed from: R */
    public long mo37378R() {
        return this.f15364m;
    }

    @NonNull
    /* renamed from: S */
    public String mo37379S() {
        return this.f15365n;
    }

    @NonNull
    /* renamed from: T */
    public String mo37380T() {
        return this.f15362e;
    }

    @SuppressLint({"FirebaseUnknownNullness"})
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, mo37380T(), false);
        C3514a.m8970s(parcel, 2, mo37377Q(), false);
        C3514a.m8965n(parcel, 3, mo37378R());
        C3514a.m8970s(parcel, 4, mo37379S(), false);
        C3514a.m8953b(parcel, a);
    }
}
