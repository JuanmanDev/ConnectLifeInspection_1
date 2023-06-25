package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4406ep;
import p040c.p200q.p201a.p264c.p294g.p333g.C4407f;
import p040c.p200q.p201a.p264c.p294g.p333g.C4962zn;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaal */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaal extends AbstractSafeParcelable implements C4962zn {
    public static final Parcelable.Creator<zzaal> CREATOR = new C4407f();

    /* renamed from: e */
    public final String f14628e;

    /* renamed from: l */
    public final long f14629l;

    /* renamed from: m */
    public final boolean f14630m;

    /* renamed from: n */
    public final String f14631n;
    @Nullable

    /* renamed from: o */
    public final String f14632o;
    @Nullable

    /* renamed from: p */
    public final String f14633p;

    /* renamed from: q */
    public final boolean f14634q;

    /* renamed from: r */
    public final String f14635r;
    @Nullable

    /* renamed from: s */
    public C4406ep f14636s;

    public zzaal(String str, long j, boolean z, String str2, @Nullable String str3, @Nullable String str4, boolean z2, @Nullable String str5) {
        C3495o.m8904f(str);
        this.f14628e = str;
        this.f14629l = j;
        this.f14630m = z;
        this.f14631n = str2;
        this.f14632o = str3;
        this.f14633p = str4;
        this.f14634q = z2;
        this.f14635r = str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14628e, false);
        C3514a.m8965n(parcel, 2, this.f14629l);
        C3514a.m8954c(parcel, 3, this.f14630m);
        C3514a.m8970s(parcel, 4, this.f14631n, false);
        C3514a.m8970s(parcel, 5, this.f14632o, false);
        C3514a.m8970s(parcel, 6, this.f14633p, false);
        C3514a.m8954c(parcel, 7, this.f14634q);
        C3514a.m8970s(parcel, 8, this.f14635r, false);
        C3514a.m8953b(parcel, a);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.f14628e);
        String str = this.f14632o;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.f14633p;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        C4406ep epVar = this.f14636s;
        if (epVar == null) {
            String str3 = this.f14635r;
            if (str3 != null) {
                jSONObject.put("safetyNetToken", str3);
            }
            return jSONObject.toString();
        }
        epVar.mo25955a();
        throw null;
    }
}
