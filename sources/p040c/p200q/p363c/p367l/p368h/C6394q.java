package p040c.p200q.p363c.p367l.p368h;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.c.l.h.q */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6394q {

    /* renamed from: a */
    public static final List f12066a = new ArrayList(Arrays.asList(new String[]{"firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", NotificationCompat.CarExtender.KEY_TIMESTAMP}));

    /* renamed from: b */
    public static final C6394q f12067b = new C6394q();

    /* renamed from: a */
    public static C6394q m17924a() {
        return f12067b;
    }

    /* renamed from: d */
    public static final void m17925d(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : f12066a) {
            edit.remove(remove);
        }
        edit.commit();
    }

    /* renamed from: b */
    public final void mo30489b(Context context) {
        C3495o.m8908j(context);
        m17925d(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007c, code lost:
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN") == false) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cf  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30490c(com.google.firebase.auth.FirebaseAuth r12) {
        /*
            r11 = this;
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r12)
            c.q.c.h r0 = r12.mo37327b()
            android.content.Context r0 = r0.mo30404j()
            java.lang.String r1 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "firebaseAppName"
            java.lang.String r3 = ""
            java.lang.String r1 = r0.getString(r1, r3)
            c.q.c.h r4 = r12.mo37327b()
            java.lang.String r4 = r4.mo30405n()
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0029
            return
        L_0x0029:
            java.lang.String r1 = "verifyAssertionRequest"
            boolean r4 = r0.contains(r1)
            r5 = -1
            java.lang.String r6 = "operation"
            r7 = 0
            java.lang.String r9 = "timestamp"
            if (r4 == 0) goto L_0x00da
            java.lang.String r1 = r0.getString(r1, r3)
            android.os.Parcelable$Creator<com.google.android.gms.internal.firebase-auth-api.zzaay> r4 = com.google.android.gms.internal.p527firebaseauthapi.zzaay.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r1 = p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3515b.m8979b(r1, r4)
            com.google.android.gms.internal.firebase-auth-api.zzaay r1 = (com.google.android.gms.internal.p527firebaseauthapi.zzaay) r1
            java.lang.String r4 = r0.getString(r6, r3)
            r6 = 0
            java.lang.String r10 = "tenantId"
            java.lang.String r6 = r0.getString(r10, r6)
            java.lang.String r10 = "firebaseUserUid"
            java.lang.String r3 = r0.getString(r10, r3)
            r0.getLong(r9, r7)
            if (r6 == 0) goto L_0x0060
            r12.mo37331f(r6)
            r1.mo33363S(r6)
        L_0x0060:
            int r6 = r4.hashCode()
            r7 = -98509410(0xfffffffffa20dd9e, float:-2.088156E35)
            r8 = 2
            r9 = 1
            if (r6 == r7) goto L_0x0089
            r7 = 175006864(0xa6e6490, float:1.1478197E-32)
            if (r6 == r7) goto L_0x007f
            r7 = 1450464913(0x56745691, float:6.7163159E13)
            if (r6 == r7) goto L_0x0076
            goto L_0x0093
        L_0x0076:
            java.lang.String r6 = "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0093
            goto L_0x0094
        L_0x007f:
            java.lang.String r2 = "com.google.firebase.auth.internal.NONGMSCORE_LINK"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0093
            r2 = r9
            goto L_0x0094
        L_0x0089:
            java.lang.String r2 = "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0093
            r2 = r8
            goto L_0x0094
        L_0x0093:
            r2 = r5
        L_0x0094:
            if (r2 == 0) goto L_0x00cf
            if (r2 == r9) goto L_0x00b5
            if (r2 == r8) goto L_0x009b
            goto L_0x00d6
        L_0x009b:
            com.google.firebase.auth.FirebaseUser r2 = r12.mo37328c()
            java.lang.String r2 = r2.mo37354S()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00d6
            com.google.firebase.auth.FirebaseUser r2 = r12.mo37328c()
            com.google.firebase.auth.zze r1 = com.google.firebase.auth.zze.m22732R(r1)
            r12.mo37339t(r2, r1)
            goto L_0x00d6
        L_0x00b5:
            com.google.firebase.auth.FirebaseUser r2 = r12.mo37328c()
            java.lang.String r2 = r2.mo37354S()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00d6
            com.google.firebase.auth.FirebaseUser r2 = r12.mo37328c()
            com.google.firebase.auth.zze r1 = com.google.firebase.auth.zze.m22732R(r1)
            r12.mo37338s(r2, r1)
            goto L_0x00d6
        L_0x00cf:
            com.google.firebase.auth.zze r1 = com.google.firebase.auth.zze.m22732R(r1)
            r12.mo37332g(r1)
        L_0x00d6:
            m17925d(r0)
            return
        L_0x00da:
            java.lang.String r12 = "recaptchaToken"
            boolean r1 = r0.contains(r12)
            if (r1 == 0) goto L_0x010b
            java.lang.String r12 = r0.getString(r12, r3)
            java.lang.String r1 = r0.getString(r6, r3)
            r0.getLong(r9, r7)
            int r3 = r1.hashCode()
            r4 = -214796028(0xfffffffff3327904, float:-1.4140065E31)
            if (r3 == r4) goto L_0x00f7
            goto L_0x0100
        L_0x00f7:
            java.lang.String r3 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0100
            goto L_0x0101
        L_0x0100:
            r2 = r5
        L_0x0101:
            if (r2 == 0) goto L_0x0104
            goto L_0x0107
        L_0x0104:
            p040c.p200q.p201a.p264c.p347m.C5777m.m16414f(r12)
        L_0x0107:
            m17925d(r0)
            return
        L_0x010b:
            java.lang.String r12 = "statusCode"
            boolean r1 = r0.contains(r12)
            if (r1 == 0) goto L_0x0131
            r1 = 17062(0x42a6, float:2.3909E-41)
            int r12 = r0.getInt(r12, r1)
            java.lang.String r1 = "statusMessage"
            java.lang.String r1 = r0.getString(r1, r3)
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r2.<init>((int) r12, (java.lang.String) r1)
            r0.getLong(r9, r7)
            m17925d(r0)
            com.google.firebase.FirebaseException r12 = p040c.p200q.p201a.p264c.p294g.p333g.C4728qn.m12942a(r2)
            p040c.p200q.p201a.p264c.p347m.C5777m.m16413e(r12)
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p367l.p368h.C6394q.mo30490c(com.google.firebase.auth.FirebaseAuth):void");
    }
}
