package p040c.p048b.p049a.p050a.p051a.p067t;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.t.d */
/* compiled from: MAPUtils */
public final class C1475d {

    /* renamed from: a */
    public static final String f654a = "c.b.a.a.a.t.d";

    /* renamed from: b */
    public static SQLiteDatabase f655b;

    public C1475d() {
        throw new Exception("This class is not instantiable!");
    }

    /* renamed from: a */
    public static SQLiteDatabase m803a(Context context) {
        try {
            C1485a.m828a(f654a, "deleteDatabase so we can create it from scratch");
            boolean deleteDatabase = context.deleteDatabase("MAPDataStore.db");
            String str = f654a;
            C1485a.m828a(str, "deleteDatabase was successful : " + deleteDatabase);
        } catch (SQLiteException e) {
            String str2 = f654a;
            C1485a.m828a(str2, "deleteDatabase exception: " + e.getMessage());
        }
        return f655b;
    }

    /* renamed from: b */
    public static String m804b(Context context) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : context.getPackageName());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0013 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized android.database.sqlite.SQLiteDatabase m805c(android.content.Context r2) {
        /*
            java.lang.Class<c.b.a.a.a.t.d> r0 = p040c.p048b.p049a.p050a.p051a.p067t.C1475d.class
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = f655b     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0021
            c.b.a.a.a.l.h r1 = new c.b.a.a.a.l.h     // Catch:{ SQLiteException -> 0x0013 }
            r1.<init>(r2)     // Catch:{ SQLiteException -> 0x0013 }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0013 }
            f655b = r1     // Catch:{ SQLiteException -> 0x0013 }
            goto L_0x0021
        L_0x0013:
            m803a(r2)     // Catch:{ all -> 0x0025 }
            c.b.a.a.a.l.h r1 = new c.b.a.a.a.l.h     // Catch:{ all -> 0x0025 }
            r1.<init>(r2)     // Catch:{ all -> 0x0025 }
            android.database.sqlite.SQLiteDatabase r2 = r1.getWritableDatabase()     // Catch:{ all -> 0x0025 }
            f655b = r2     // Catch:{ all -> 0x0025 }
        L_0x0021:
            android.database.sqlite.SQLiteDatabase r2 = f655b     // Catch:{ all -> 0x0025 }
            monitor-exit(r0)
            return r2
        L_0x0025:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p048b.p049a.p050a.p051a.p067t.C1475d.m805c(android.content.Context):android.database.sqlite.SQLiteDatabase");
    }

    /* renamed from: d */
    public static String m806d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            String str = f654a;
            C1485a.m838k(str, "Unable to get verison info from app" + e.getMessage());
            return "N/A";
        }
    }

    /* renamed from: e */
    public static String m807e(String[] strArr, String str) {
        String str2;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        String str3 = "";
        for (int i = 0; i < strArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(strArr[i].trim());
            if (i == strArr.length - 1) {
                str2 = "";
            } else {
                str2 = str;
            }
            sb.append(str2);
            str3 = sb.toString();
        }
        return str3;
    }

    /* renamed from: f */
    public static String m808f(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    /* renamed from: g */
    public static String[] m809g(String str, String str2) {
        if (str == null || str.trim().length() <= 0) {
            return null;
        }
        String trim = str.trim();
        return trim.split("[" + str2 + "]");
    }
}
