package p040c.p200q.p363c.p367l.p368h;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zzqx;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.internal.zzt;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p284k.C3537a;

/* renamed from: c.q.c.l.h.r */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6395r {

    /* renamed from: a */
    public final Context f12068a;

    /* renamed from: b */
    public final String f12069b;

    /* renamed from: c */
    public final SharedPreferences f12070c = this.f12068a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", new Object[]{this.f12069b}), 0);

    /* renamed from: d */
    public final C3537a f12071d = new C3537a("StorageHelpers", new String[0]);

    public C6395r(Context context, String str) {
        C3495o.m8908j(context);
        C3495o.m8904f(str);
        this.f12069b = str;
        this.f12068a = context.getApplicationContext();
    }

    @Nullable
    /* renamed from: a */
    public final FirebaseUser mo30491a() {
        String string = this.f12070c.getString("com.google.firebase.auth.FIREBASE_USER", (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return mo30496f(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public final zzzy mo30492b(FirebaseUser firebaseUser) {
        C3495o.m8908j(firebaseUser);
        String string = this.f12070c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser.mo37354S()}), (String) null);
        if (string != null) {
            return zzzy.m21975R(string);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo30493c(String str) {
        this.f12070c.edit().remove(str).apply();
    }

    /* renamed from: d */
    public final void mo30494d(FirebaseUser firebaseUser) {
        String str;
        C3495o.m8908j(firebaseUser);
        JSONObject jSONObject = new JSONObject();
        if (zzx.class.isAssignableFrom(firebaseUser.getClass())) {
            zzx zzx = (zzx) firebaseUser;
            try {
                jSONObject.put("cachedTokenState", zzx.mo37360Y());
                jSONObject.put("applicationName", zzx.mo37405d0().mo30405n());
                jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                if (zzx.mo37410i0() != null) {
                    JSONArray jSONArray = new JSONArray();
                    List i0 = zzx.mo37410i0();
                    int size = i0.size();
                    if (i0.size() > 30) {
                        this.f12071d.mo20811g("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(i0.size()));
                        size = 30;
                    }
                    for (int i = 0; i < size; i++) {
                        jSONArray.put(((zzt) i0.get(i)).mo37401Q());
                    }
                    jSONObject.put("userInfos", jSONArray);
                }
                jSONObject.put("anonymous", zzx.mo37355T());
                jSONObject.put("version", "2");
                if (zzx.mo37404c0() != null) {
                    jSONObject.put("userMetadata", ((zzz) zzx.mo37404c0()).mo37416a());
                }
                List<MultiFactorInfo> a = new C6375d(zzx).mo30452a();
                if (!a.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i2 = 0; i2 < a.size(); i2++) {
                        jSONArray2.put(a.get(i2).mo37366P());
                    }
                    jSONObject.put("userMultiFactorInfo", jSONArray2);
                }
                str = jSONObject.toString();
            } catch (Exception e) {
                this.f12071d.mo20812h("Failed to turn object into JSON", e, new Object[0]);
                throw new zzqx(e);
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f12070c.edit().putString("com.google.firebase.auth.FIREBASE_USER", str).apply();
        }
    }

    /* renamed from: e */
    public final void mo30495e(FirebaseUser firebaseUser, zzzy zzzy) {
        C3495o.m8908j(firebaseUser);
        C3495o.m8908j(zzzy);
        this.f12070c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser.mo37354S()}), zzzy.mo33502V()).apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0085, code lost:
        throw new com.google.android.gms.internal.p527firebaseauthapi.zzqx(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0134, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0135, code lost:
        r26.f12071d.mo20813i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013d, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c7 A[SYNTHETIC, Splitter:B:33:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012e A[ExcHandler: zzqx | ArrayIndexOutOfBoundsException | IllegalArgumentException (e java.lang.Throwable), Splitter:B:1:0x000a] */
    @androidx.annotation.Nullable
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.firebase.auth.internal.zzx mo30496f(org.json.JSONObject r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "enrollmentTimestamp"
            java.lang.String r2 = "userMultiFactorInfo"
            java.lang.String r3 = "userMetadata"
            java.lang.String r5 = "cachedTokenState"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.lang.String r6 = "applicationName"
            java.lang.String r6 = r0.getString(r6)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.lang.String r7 = "anonymous"
            boolean r7 = r0.getBoolean(r7)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.lang.String r8 = "2"
            java.lang.String r9 = "version"
            java.lang.String r9 = r0.getString(r9)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            if (r9 == 0) goto L_0x0025
            r8 = r9
        L_0x0025:
            java.lang.String r9 = "userInfos"
            org.json.JSONArray r9 = r0.getJSONArray(r9)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            int r10 = r9.length()     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            r11.<init>(r10)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            r13 = 0
        L_0x0035:
            java.lang.String r14 = "displayName"
            java.lang.String r15 = "phoneNumber"
            if (r13 >= r10) goto L_0x0086
            java.lang.String r12 = r9.getString(r13)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            android.os.Parcelable$Creator<com.google.firebase.auth.internal.zzt> r16 = com.google.firebase.auth.internal.zzt.CREATOR     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            r4.<init>(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.lang.String r12 = "userId"
            java.lang.String r18 = r4.optString(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.lang.String r12 = "providerId"
            java.lang.String r19 = r4.optString(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.lang.String r12 = "email"
            java.lang.String r20 = r4.optString(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.lang.String r21 = r4.optString(r15)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.lang.String r22 = r4.optString(r14)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.lang.String r12 = "photoUrl"
            java.lang.String r23 = r4.optString(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.lang.String r12 = "isEmailVerified"
            boolean r24 = r4.optBoolean(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.lang.String r12 = "rawUserInfo"
            java.lang.String r25 = r4.optString(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            com.google.firebase.auth.internal.zzt r4 = new com.google.firebase.auth.internal.zzt     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            r17 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            r11.add(r4)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            int r13 = r13 + 1
            goto L_0x0035
        L_0x007f:
            r0 = move-exception
            com.google.android.gms.internal.firebase-auth-api.zzqx r1 = new com.google.android.gms.internal.firebase-auth-api.zzqx     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            throw r1     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
        L_0x0086:
            c.q.c.h r4 = p040c.p200q.p363c.C6331h.m17786m(r6)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            com.google.firebase.auth.internal.zzx r6 = new com.google.firebase.auth.internal.zzx     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            r6.<init>(r4, r11)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            if (r4 != 0) goto L_0x009c
            com.google.android.gms.internal.firebase-auth-api.zzzy r4 = com.google.android.gms.internal.p527firebaseauthapi.zzzy.m21975R(r5)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            r6.mo37362a0(r4)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
        L_0x009c:
            if (r7 != 0) goto L_0x00a1
            r6.mo37408g0()     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
        L_0x00a1:
            r6.mo37407f0(r8)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            boolean r4 = r0.has(r3)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            if (r4 == 0) goto L_0x00ca
            org.json.JSONObject r3 = r0.getJSONObject(r3)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            android.os.Parcelable$Creator<com.google.firebase.auth.internal.zzz> r4 = com.google.firebase.auth.internal.zzz.CREATOR     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            if (r3 != 0) goto L_0x00b4
        L_0x00b2:
            r3 = 0
            goto L_0x00c5
        L_0x00b4:
            java.lang.String r4 = "lastSignInTimestamp"
            long r4 = r3.getLong(r4)     // Catch:{ JSONException -> 0x00b2, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.lang.String r7 = "creationTimestamp"
            long r7 = r3.getLong(r7)     // Catch:{ JSONException -> 0x00b2, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            com.google.firebase.auth.internal.zzz r3 = new com.google.firebase.auth.internal.zzz     // Catch:{ JSONException -> 0x00b2, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            r3.<init>(r4, r7)     // Catch:{ JSONException -> 0x00b2, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
        L_0x00c5:
            if (r3 == 0) goto L_0x00ca
            r6.mo37413l0(r3)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
        L_0x00ca:
            boolean r3 = r0.has(r2)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            if (r3 == 0) goto L_0x012d
            org.json.JSONArray r0 = r0.getJSONArray(r2)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            if (r0 == 0) goto L_0x012d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            r2.<init>()     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            r12 = 0
        L_0x00dc:
            int r3 = r0.length()     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            if (r12 >= r3) goto L_0x012a
            java.lang.String r3 = r0.getString(r12)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.lang.String r3 = "phone"
            java.lang.String r5 = "factorIdKey"
            java.lang.String r5 = r4.optString(r5)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            if (r3 == 0) goto L_0x0123
            android.os.Parcelable$Creator<com.google.firebase.auth.PhoneMultiFactorInfo> r3 = com.google.firebase.auth.PhoneMultiFactorInfo.CREATOR     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            boolean r3 = r4.has(r1)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            if (r3 == 0) goto L_0x011b
            java.lang.String r3 = "uid"
            java.lang.String r18 = r4.optString(r3)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.lang.String r19 = r4.optString(r14)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            long r20 = r4.optLong(r1)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.lang.String r22 = r4.optString(r15)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            com.google.firebase.auth.PhoneMultiFactorInfo r3 = new com.google.firebase.auth.PhoneMultiFactorInfo     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            r17 = r3
            r17.<init>(r18, r19, r20, r22)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            goto L_0x0124
        L_0x011b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            java.lang.String r1 = "An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance."
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            throw r0     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
        L_0x0123:
            r3 = 0
        L_0x0124:
            r2.add(r3)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
            int r12 = r12 + 1
            goto L_0x00dc
        L_0x012a:
            r6.mo37363b0(r2)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, zzqx -> 0x012e }
        L_0x012d:
            return r6
        L_0x012e:
            r0 = move-exception
            goto L_0x0135
        L_0x0130:
            r0 = move-exception
            goto L_0x0135
        L_0x0132:
            r0 = move-exception
            goto L_0x0135
        L_0x0134:
            r0 = move-exception
        L_0x0135:
            r1 = r26
            c.q.a.c.d.k.a r2 = r1.f12071d
            r2.mo20813i(r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p367l.p368h.C6395r.mo30496f(org.json.JSONObject):com.google.firebase.auth.internal.zzx");
    }
}
