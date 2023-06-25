package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3280f;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3281g;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p276d.p289n.C3556g;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C3281g();

    /* renamed from: e */
    public final int f8091e;
    @Nullable

    /* renamed from: l */
    public String f8092l;
    @Nullable

    /* renamed from: m */
    public String f8093m;
    @Nullable

    /* renamed from: n */
    public String f8094n;
    @Nullable

    /* renamed from: o */
    public String f8095o;
    @Nullable

    /* renamed from: p */
    public Uri f8096p;
    @Nullable

    /* renamed from: q */
    public String f8097q;

    /* renamed from: r */
    public long f8098r;

    /* renamed from: s */
    public String f8099s;

    /* renamed from: t */
    public List<Scope> f8100t;
    @Nullable

    /* renamed from: u */
    public String f8101u;
    @Nullable

    /* renamed from: v */
    public String f8102v;

    /* renamed from: w */
    public Set<Scope> f8103w = new HashSet();

    static {
        C3556g.m9065c();
    }

    public GoogleSignInAccount(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Uri uri, @Nullable String str5, long j, String str6, List<Scope> list, @Nullable String str7, @Nullable String str8) {
        this.f8091e = i;
        this.f8092l = str;
        this.f8093m = str2;
        this.f8094n = str3;
        this.f8095o = str4;
        this.f8096p = uri;
        this.f8097q = str5;
        this.f8098r = j;
        this.f8099s = str6;
        this.f8100t = list;
        this.f8101u = str7;
        this.f8102v = str8;
    }

    @NonNull
    /* renamed from: Y */
    public static GoogleSignInAccount m10787Y(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Uri uri, @Nullable Long l, @NonNull String str7, @NonNull Set<Scope> set) {
        long longValue = l.longValue();
        C3495o.m8904f(str7);
        C3495o.m8908j(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, longValue, str7, new ArrayList(set), str5, str6);
    }

    @Nullable
    /* renamed from: Z */
    public static GoogleSignInAccount m10788Z(@Nullable String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount Y = m10787Y(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has(FileProvider.DISPLAYNAME_FIELD) ? jSONObject.optString(FileProvider.DISPLAYNAME_FIELD) : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        Y.f8097q = str2;
        return Y;
    }

    @Nullable
    /* renamed from: P */
    public String mo24418P() {
        return this.f8095o;
    }

    @Nullable
    /* renamed from: Q */
    public String mo24419Q() {
        return this.f8094n;
    }

    @Nullable
    /* renamed from: R */
    public String mo24420R() {
        return this.f8102v;
    }

    @Nullable
    /* renamed from: S */
    public String mo24421S() {
        return this.f8101u;
    }

    @Nullable
    /* renamed from: T */
    public String mo24422T() {
        return this.f8092l;
    }

    @Nullable
    /* renamed from: U */
    public String mo24423U() {
        return this.f8093m;
    }

    @Nullable
    /* renamed from: V */
    public Uri mo24424V() {
        return this.f8096p;
    }

    @NonNull
    /* renamed from: W */
    public Set<Scope> mo24425W() {
        HashSet hashSet = new HashSet(this.f8100t);
        hashSet.addAll(this.f8103w);
        return hashSet;
    }

    @Nullable
    /* renamed from: X */
    public String mo24426X() {
        return this.f8097q;
    }

    @NonNull
    /* renamed from: a0 */
    public final String mo24427a0() {
        return this.f8099s;
    }

    @NonNull
    /* renamed from: b0 */
    public final String mo24428b0() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (mo24422T() != null) {
                jSONObject.put("id", mo24422T());
            }
            if (mo24423U() != null) {
                jSONObject.put("tokenId", mo24423U());
            }
            if (mo24419Q() != null) {
                jSONObject.put("email", mo24419Q());
            }
            if (mo24418P() != null) {
                jSONObject.put(FileProvider.DISPLAYNAME_FIELD, mo24418P());
            }
            if (mo24421S() != null) {
                jSONObject.put("givenName", mo24421S());
            }
            if (mo24420R() != null) {
                jSONObject.put("familyName", mo24420R());
            }
            Uri V = mo24424V();
            if (V != null) {
                jSONObject.put("photoUrl", V.toString());
            }
            if (mo24426X() != null) {
                jSONObject.put("serverAuthCode", mo24426X());
            }
            jSONObject.put("expirationTime", this.f8098r);
            jSONObject.put("obfuscatedIdentifier", this.f8099s);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.f8100t;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C3280f.f6138e);
            for (Scope P : scopeArr) {
                jSONArray.put(P.mo24526P());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f8099s.equals(this.f8099s) && googleSignInAccount.mo24425W().equals(mo24425W());
    }

    @Nullable
    /* renamed from: f */
    public Account mo24430f() {
        String str = this.f8094n;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public int hashCode() {
        return ((this.f8099s.hashCode() + 527) * 31) + mo24425W().hashCode();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8091e);
        C3514a.m8970s(parcel, 2, mo24422T(), false);
        C3514a.m8970s(parcel, 3, mo24423U(), false);
        C3514a.m8970s(parcel, 4, mo24419Q(), false);
        C3514a.m8970s(parcel, 5, mo24418P(), false);
        C3514a.m8968q(parcel, 6, mo24424V(), i, false);
        C3514a.m8970s(parcel, 7, mo24426X(), false);
        C3514a.m8965n(parcel, 8, this.f8098r);
        C3514a.m8970s(parcel, 9, this.f8099s, false);
        C3514a.m8974w(parcel, 10, this.f8100t, false);
        C3514a.m8970s(parcel, 11, mo24421S(), false);
        C3514a.m8970s(parcel, 12, mo24420R(), false);
        C3514a.m8953b(parcel, a);
    }
}
