package p040c.p325e0.p326a.p327b.p328a.p329a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.test.internal.runner.RunnerArgs;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040c.p325e0.p326a.p332c.C4270g;

/* renamed from: c.e0.a.b.a.a.a */
/* compiled from: BUGLY */
public class C4259a {
    static {
        "@buglyAllChannel@".split(RunnerArgs.CLASS_SEPARATOR);
        "@buglyAllChannelPriority@".split(RunnerArgs.CLASS_SEPARATOR);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[Catch:{ all -> 0x0051, all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[SYNTHETIC, Splitter:B:24:0x004d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m11601a(int r7) {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            java.lang.String r3 = "/proc/"
            r2.<init>(r3)     // Catch:{ all -> 0x003a }
            r2.append(r7)     // Catch:{ all -> 0x003a }
            java.lang.String r3 = "/cmdline"
            r2.append(r3)     // Catch:{ all -> 0x003a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x003a }
            r1.<init>(r2)     // Catch:{ all -> 0x003a }
            r0 = 512(0x200, float:7.175E-43)
            char[] r2 = new char[r0]     // Catch:{ all -> 0x0038 }
            r1.read(r2)     // Catch:{ all -> 0x0038 }
            r3 = 0
            r4 = r3
        L_0x0022:
            if (r4 >= r0) goto L_0x002b
            char r5 = r2[r4]     // Catch:{ all -> 0x0038 }
            if (r5 == 0) goto L_0x002b
            int r4 = r4 + 1
            goto L_0x0022
        L_0x002b:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0038 }
            r0.<init>(r2)     // Catch:{ all -> 0x0038 }
            java.lang.String r7 = r0.substring(r3, r4)     // Catch:{ all -> 0x0038 }
            r1.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            return r7
        L_0x0038:
            r0 = move-exception
            goto L_0x003e
        L_0x003a:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x003e:
            boolean r2 = p040c.p325e0.p326a.p332c.C4270g.m11650c(r0)     // Catch:{ all -> 0x0051 }
            if (r2 != 0) goto L_0x0047
            r0.printStackTrace()     // Catch:{ all -> 0x0051 }
        L_0x0047:
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0050
            r1.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            return r7
        L_0x0051:
            r7 = move-exception
            if (r1 == 0) goto L_0x0057
            r1.close()     // Catch:{ all -> 0x0057 }
        L_0x0057:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p325e0.p326a.p327b.p328a.p329a.C4259a.m11601a(int):java.lang.String");
    }

    /* renamed from: b */
    public static String m11602b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName();
        } catch (Throwable th) {
            if (C4270g.m11650c(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    /* renamed from: c */
    public static List<String> m11603c(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            String str = map.get("BUGLY_DISABLE");
            if (str != null) {
                if (str.length() != 0) {
                    String[] split = str.split(RunnerArgs.CLASS_SEPARATOR);
                    for (int i = 0; i < split.length; i++) {
                        split[i] = split[i].trim();
                    }
                    return Arrays.asList(split);
                }
            }
            return null;
        } catch (Throwable th) {
            if (!C4270g.m11650c(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: d */
    public static PackageInfo m11604d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(m11602b(context), 0);
        } catch (Throwable th) {
            if (C4270g.m11650c(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static String m11605e(Context context) {
        CharSequence applicationLabel;
        if (context == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (!(packageManager == null || applicationInfo == null || (applicationLabel = packageManager.getApplicationLabel(applicationInfo)) == null)) {
                return applicationLabel.toString();
            }
        } catch (Throwable th) {
            if (!C4270g.m11650c(th)) {
                th.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Map<String, String> m11606f(Context context) {
        if (context == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            Object obj = applicationInfo.metaData.get("BUGLY_DISABLE");
            if (obj != null) {
                hashMap.put("BUGLY_DISABLE", obj.toString());
            }
            Object obj2 = applicationInfo.metaData.get("BUGLY_APPID");
            if (obj2 != null) {
                hashMap.put("BUGLY_APPID", obj2.toString());
            }
            Object obj3 = applicationInfo.metaData.get("BUGLY_APP_CHANNEL");
            if (obj3 != null) {
                hashMap.put("BUGLY_APP_CHANNEL", obj3.toString());
            }
            Object obj4 = applicationInfo.metaData.get("BUGLY_APP_VERSION");
            if (obj4 != null) {
                hashMap.put("BUGLY_APP_VERSION", obj4.toString());
            }
            Object obj5 = applicationInfo.metaData.get("BUGLY_ENABLE_DEBUG");
            if (obj5 != null) {
                hashMap.put("BUGLY_ENABLE_DEBUG", obj5.toString());
            }
            Object obj6 = applicationInfo.metaData.get("com.tencent.rdm.uuid");
            if (obj6 != null) {
                hashMap.put("com.tencent.rdm.uuid", obj6.toString());
            }
            return hashMap;
        } catch (Throwable th) {
            if (!C4270g.m11650c(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }
}
