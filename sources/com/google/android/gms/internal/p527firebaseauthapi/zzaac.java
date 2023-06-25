package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4299b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaac */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaac> CREATOR = new C4299b();
    @Nullable

    /* renamed from: e */
    public final String f14611e;
    @NonNull

    /* renamed from: l */
    public final String f14612l;

    /* renamed from: m */
    public final String f14613m;

    /* renamed from: n */
    public final long f14614n;

    public zzaac(String str, String str2, String str3, long j) {
        this.f14611e = str;
        C3495o.m8904f(str2);
        this.f14612l = str2;
        this.f14613m = str3;
        this.f14614n = j;
    }

    /* renamed from: Q */
    public static zzaac m21906Q(@NonNull JSONObject jSONObject) {
        zzaac zzaac = new zzaac(jSONObject.optString("phoneInfo", (String) null), jSONObject.optString("mfaEnrollmentId", (String) null), jSONObject.optString(FileProvider.DISPLAYNAME_FIELD, (String) null), m21908V(jSONObject.optString("enrolledAt", "")));
        jSONObject.optString("unobfuscatedPhoneInfo");
        return zzaac;
    }

    /* renamed from: U */
    public static List m21907U(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m21906Q(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    /* renamed from: V */
    public static long m21908V(String str) {
        String replaceAll = str.replaceAll("\\.[0-9]{0,9}Z$|Z$", ".000Z");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat.parse(replaceAll).getTime();
        } catch (ParseException unused) {
            return 0;
        }
    }

    /* renamed from: P */
    public final long mo33340P() {
        return this.f14614n;
    }

    /* renamed from: R */
    public final String mo33341R() {
        return this.f14613m;
    }

    /* renamed from: S */
    public final String mo33342S() {
        return this.f14612l;
    }

    @Nullable
    /* renamed from: T */
    public final String mo33343T() {
        return this.f14611e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14611e, false);
        C3514a.m8970s(parcel, 2, this.f14612l, false);
        C3514a.m8970s(parcel, 3, this.f14613m, false);
        C3514a.m8965n(parcel, 4, this.f14614n);
        C3514a.m8953b(parcel, a);
    }
}
