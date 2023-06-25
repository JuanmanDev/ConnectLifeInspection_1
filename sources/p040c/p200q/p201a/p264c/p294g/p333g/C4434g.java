package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zzaaw;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.g.g.g */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4434g implements C4962zn {

    /* renamed from: e */
    public String f9231e;

    /* renamed from: l */
    public String f9232l;

    /* renamed from: m */
    public String f9233m;

    /* renamed from: n */
    public String f9234n;

    /* renamed from: o */
    public String f9235o;

    /* renamed from: p */
    public String f9236p;

    /* renamed from: q */
    public final zzaaw f9237q = new zzaaw((List) null);

    /* renamed from: r */
    public final zzaaw f9238r = new zzaaw((List) null);
    @Nullable

    /* renamed from: s */
    public String f9239s;

    @NonNull
    /* renamed from: a */
    public final C4434g mo26005a(@Nullable String str) {
        if (str == null) {
            this.f9237q.mo33358Q().add("EMAIL");
        } else {
            this.f9233m = str;
        }
        return this;
    }

    @NonNull
    /* renamed from: b */
    public final C4434g mo26006b(String str) {
        C3495o.m8904f(str);
        this.f9231e = str;
        return this;
    }

    @NonNull
    /* renamed from: c */
    public final C4434g mo26007c(@Nullable String str) {
        if (str == null) {
            this.f9237q.mo33358Q().add("PASSWORD");
        } else {
            this.f9234n = str;
        }
        return this;
    }

    @Nullable
    /* renamed from: d */
    public final String mo26008d() {
        return this.f9232l;
    }

    @Nullable
    /* renamed from: e */
    public final String mo26009e() {
        return this.f9233m;
    }

    @Nullable
    /* renamed from: f */
    public final String mo26010f() {
        return this.f9234n;
    }

    @Nullable
    /* renamed from: g */
    public final String mo26011g() {
        return this.f9236p;
    }

    /* renamed from: h */
    public final boolean mo26012h(String str) {
        C3495o.m8904f(str);
        return this.f9237q.mo33358Q().contains(str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zza() {
        /*
            r11 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "returnSecureToken"
            r2 = 1
            r0.put(r1, r2)
            com.google.android.gms.internal.firebase-auth-api.zzaaw r1 = r11.f9238r
            java.util.List r1 = r1.mo33358Q()
            boolean r1 = r1.isEmpty()
            r3 = 0
            if (r1 != 0) goto L_0x0039
            com.google.android.gms.internal.firebase-auth-api.zzaaw r1 = r11.f9238r
            java.util.List r1 = r1.mo33358Q()
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            r5 = r3
        L_0x0024:
            int r6 = r1.size()
            if (r5 >= r6) goto L_0x0034
            java.lang.Object r6 = r1.get(r5)
            r4.put(r6)
            int r5 = r5 + 1
            goto L_0x0024
        L_0x0034:
            java.lang.String r1 = "deleteProvider"
            r0.put(r1, r4)
        L_0x0039:
            com.google.android.gms.internal.firebase-auth-api.zzaaw r1 = r11.f9237q
            java.util.List r1 = r1.mo33358Q()
            int r4 = r1.size()
            int[] r5 = new int[r4]
            r6 = r3
        L_0x0046:
            int r7 = r1.size()
            if (r6 >= r7) goto L_0x0099
            java.lang.Object r7 = r1.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.hashCode()
            r9 = 3
            r10 = 2
            switch(r8) {
                case -333046776: goto L_0x007a;
                case 66081660: goto L_0x0070;
                case 1939891618: goto L_0x0066;
                case 1999612571: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x0084
        L_0x005c:
            java.lang.String r8 = "PASSWORD"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0084
            r7 = r10
            goto L_0x0085
        L_0x0066:
            java.lang.String r8 = "PHOTO_URL"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0084
            r7 = r9
            goto L_0x0085
        L_0x0070:
            java.lang.String r8 = "EMAIL"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0084
            r7 = r3
            goto L_0x0085
        L_0x007a:
            java.lang.String r8 = "DISPLAY_NAME"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0084
            r7 = r2
            goto L_0x0085
        L_0x0084:
            r7 = -1
        L_0x0085:
            if (r7 == 0) goto L_0x0093
            if (r7 == r2) goto L_0x0094
            if (r7 == r10) goto L_0x0091
            if (r7 == r9) goto L_0x008f
            r10 = r3
            goto L_0x0094
        L_0x008f:
            r10 = 4
            goto L_0x0094
        L_0x0091:
            r10 = 5
            goto L_0x0094
        L_0x0093:
            r10 = r2
        L_0x0094:
            r5[r6] = r10
            int r6 = r6 + 1
            goto L_0x0046
        L_0x0099:
            if (r4 <= 0) goto L_0x00af
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
        L_0x00a0:
            if (r3 >= r4) goto L_0x00aa
            r2 = r5[r3]
            r1.put(r2)
            int r3 = r3 + 1
            goto L_0x00a0
        L_0x00aa:
            java.lang.String r2 = "deleteAttribute"
            r0.put(r2, r1)
        L_0x00af:
            java.lang.String r1 = r11.f9231e
            if (r1 == 0) goto L_0x00b8
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L_0x00b8:
            java.lang.String r1 = r11.f9233m
            if (r1 == 0) goto L_0x00c1
            java.lang.String r2 = "email"
            r0.put(r2, r1)
        L_0x00c1:
            java.lang.String r1 = r11.f9234n
            if (r1 == 0) goto L_0x00ca
            java.lang.String r2 = "password"
            r0.put(r2, r1)
        L_0x00ca:
            java.lang.String r1 = r11.f9232l
            if (r1 == 0) goto L_0x00d3
            java.lang.String r2 = "displayName"
            r0.put(r2, r1)
        L_0x00d3:
            java.lang.String r1 = r11.f9236p
            if (r1 == 0) goto L_0x00dc
            java.lang.String r2 = "photoUrl"
            r0.put(r2, r1)
        L_0x00dc:
            java.lang.String r1 = r11.f9235o
            if (r1 == 0) goto L_0x00e5
            java.lang.String r2 = "oobCode"
            r0.put(r2, r1)
        L_0x00e5:
            java.lang.String r1 = r11.f9239s
            if (r1 == 0) goto L_0x00ee
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L_0x00ee:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4434g.zza():java.lang.String");
    }
}
