package p040c.p200q.p201a.p264c.p276d;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicBoolean;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3557h;
import p040c.p200q.p201a.p264c.p276d.p289n.C3562m;
import p040c.p200q.p201a.p264c.p276d.p289n.C3565p;
import p040c.p200q.p201a.p264c.p276d.p291o.C3573c;

/* renamed from: c.q.a.c.d.e */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3330e {
    @Deprecated

    /* renamed from: a */
    public static final int f6210a = 12451000;

    /* renamed from: b */
    public static final AtomicBoolean f6211b = new AtomicBoolean();

    /* renamed from: c */
    public static boolean f6212c = false;

    /* renamed from: d */
    public static boolean f6213d = false;

    /* renamed from: e */
    public static final AtomicBoolean f6214e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static int m8443a(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @NonNull
    @Deprecated
    /* renamed from: b */
    public static String m8444b(int i) {
        return ConnectionResult.m10849U(i);
    }

    @Nullable
    /* renamed from: c */
    public static Context m8445c(@NonNull Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: d */
    public static Resources m8446d(@NonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m8447e(@NonNull Context context) {
        if (!f6213d) {
            try {
                PackageInfo e = C3573c.m9110a(context).mo20847e("com.google.android.gms", 64);
                C3332f.m8454a(context);
                if (e == null || C3332f.m8456e(e, false) || !C3332f.m8456e(e, true)) {
                    f6212c = false;
                } else {
                    f6212c = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                f6213d = true;
            }
        }
        return f6212c || !C3557h.m9069b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    @java.lang.Deprecated
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m8448f(@androidx.annotation.NonNull android.content.Context r9, int r10) {
        /*
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ all -> 0x0009 }
            int r1 = com.google.android.gms.common.R$string.common_google_play_services_unknown_issue     // Catch:{ all -> 0x0009 }
            r0.getString(r1)     // Catch:{ all -> 0x0009 }
        L_0x0009:
            java.lang.String r0 = r9.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0035
            java.util.concurrent.atomic.AtomicBoolean r0 = f6214e
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x001e
            goto L_0x0035
        L_0x001e:
            int r0 = p040c.p200q.p201a.p264c.p276d.p281j.C3532y0.m9013a(r9)
            if (r0 == 0) goto L_0x002f
            int r2 = f6210a
            if (r0 != r2) goto L_0x0029
            goto L_0x0035
        L_0x0029:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r9.<init>()
            throw r9
        L_0x0035:
            boolean r0 = p040c.p200q.p201a.p264c.p276d.p289n.C3557h.m9071d(r9)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0045
            boolean r0 = p040c.p200q.p201a.p264c.p276d.p289n.C3557h.m9073f(r9)
            if (r0 != 0) goto L_0x0045
            r0 = r2
            goto L_0x0046
        L_0x0045:
            r0 = r3
        L_0x0046:
            if (r10 < 0) goto L_0x004a
            r4 = r2
            goto L_0x004b
        L_0x004a:
            r4 = r3
        L_0x004b:
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8899a(r4)
            java.lang.String r4 = r9.getPackageName()
            android.content.pm.PackageManager r5 = r9.getPackageManager()
            r6 = 9
            if (r0 == 0) goto L_0x006f
            java.lang.String r7 = "com.android.vending"
            r8 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r7 = r5.getPackageInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x0063 }
            goto L_0x0070
        L_0x0063:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires the Google Play Store, but it is missing."
            r9.concat(r10)
        L_0x006c:
            r2 = r6
            goto L_0x0114
        L_0x006f:
            r7 = 0
        L_0x0070:
            r8 = 64
            android.content.pm.PackageInfo r8 = r5.getPackageInfo(r1, r8)     // Catch:{ NameNotFoundException -> 0x010b }
            p040c.p200q.p201a.p264c.p276d.C3332f.m8454a(r9)
            boolean r9 = p040c.p200q.p201a.p264c.p276d.C3332f.m8456e(r8, r2)
            if (r9 != 0) goto L_0x0089
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play services, but their signature is invalid."
            r9.concat(r10)
            goto L_0x006c
        L_0x0089:
            if (r0 == 0) goto L_0x009e
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r7)
            boolean r9 = p040c.p200q.p201a.p264c.p276d.C3332f.m8456e(r7, r2)
            if (r9 != 0) goto L_0x009e
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play Store, but its signature is invalid."
            r9.concat(r10)
            goto L_0x006c
        L_0x009e:
            if (r0 == 0) goto L_0x00ba
            if (r7 == 0) goto L_0x00ba
            android.content.pm.Signature[] r9 = r7.signatures
            r9 = r9[r3]
            android.content.pm.Signature[] r0 = r8.signatures
            r0 = r0[r3]
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00ba
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            r9.concat(r10)
            goto L_0x006c
        L_0x00ba:
            int r9 = r8.versionCode
            int r9 = p040c.p200q.p201a.p264c.p276d.p289n.C3569s.m9100a(r9)
            int r0 = p040c.p200q.p201a.p264c.p276d.p289n.C3569s.m9100a(r10)
            if (r9 >= r0) goto L_0x00ea
            int r9 = r8.versionCode
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Google Play services out of date for "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ".  Requires "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = " but found "
            r0.append(r10)
            r0.append(r9)
            r0.toString()
            r2 = 2
            goto L_0x0114
        L_0x00ea:
            android.content.pm.ApplicationInfo r9 = r8.applicationInfo
            if (r9 != 0) goto L_0x0104
            android.content.pm.ApplicationInfo r9 = r5.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x00f3 }
            goto L_0x0104
        L_0x00f3:
            r9 = move-exception
            java.lang.String r10 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r10 = r10.concat(r0)
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.util.Log.wtf(r0, r10, r9)
            goto L_0x0114
        L_0x0104:
            boolean r9 = r9.enabled
            if (r9 != 0) goto L_0x010a
            r2 = 3
            goto L_0x0114
        L_0x010a:
            return r3
        L_0x010b:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play services, but they are missing."
            r9.concat(r10)
        L_0x0114:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p276d.C3330e.m8448f(android.content.Context, int):int");
    }

    @Deprecated
    /* renamed from: g */
    public static boolean m8449g(@NonNull Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m8453k(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: h */
    public static boolean m8450h(@NonNull Context context) {
        if (!C3562m.m9082c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        C3495o.m8908j(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    /* renamed from: i */
    public static boolean m8451i(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @TargetApi(19)
    @Deprecated
    /* renamed from: j */
    public static boolean m8452j(@NonNull Context context, int i, @NonNull String str) {
        return C3565p.m9096b(context, i, str);
    }

    @TargetApi(21)
    /* renamed from: k */
    public static boolean m8453k(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C3562m.m9085f()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !m8450h(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
