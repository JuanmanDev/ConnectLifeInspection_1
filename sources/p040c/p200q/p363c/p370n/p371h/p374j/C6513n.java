package p040c.p200q.p363c.p370n.p371h.p374j;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.test.internal.runner.TestRequestBuilder;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import com.juconnect.vivino.global.UrlConstKt;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import p040c.p200q.p363c.p370n.p371h.C6479f;

/* renamed from: c.q.c.n.h.j.n */
/* compiled from: CommonUtils */
public class C6513n {

    /* renamed from: a */
    public static final char[] f12233a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static long f12234b = -1;

    /* renamed from: c.q.c.n.h.j.n$a */
    /* compiled from: CommonUtils */
    public enum C6514a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: u */
        public static final Map<String, C6514a> f12245u = null;

        /* access modifiers changed from: public */
        static {
            HashMap hashMap = new HashMap(4);
            f12245u = hashMap;
            hashMap.put("armeabi-v7a", ARMV7);
            f12245u.put("armeabi", ARMV6);
            f12245u.put("arm64-v8a", ARM64);
            f12245u.put("x86", X86_32);
        }

        /* renamed from: c */
        public static C6514a m18249c() {
            C6514a aVar = UNKNOWN;
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C6479f.m18125f().mo30647i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return aVar;
            }
            C6514a aVar2 = f12245u.get(str.toLowerCase(Locale.US));
            return aVar2 == null ? aVar : aVar2;
        }
    }

    /* renamed from: A */
    public static boolean m18220A(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    /* renamed from: B */
    public static String m18221B(String str) {
        return m18242t(str, "SHA-1");
    }

    /* renamed from: C */
    public static String m18222C(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    /* renamed from: a */
    public static long m18223a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: b */
    public static long m18224b(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    public static boolean m18225c(Context context) {
        if (!m18226d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m18226d(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: e */
    public static void m18227e(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C6479f.m18125f().mo30644e(str, e);
            }
        }
    }

    /* renamed from: f */
    public static void m18228f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public static long m18229g(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    /* renamed from: h */
    public static String m18230h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace(AccountManagerConstants$LOCALE.LOCALE_SEPERATOR, "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return m18221B(sb2);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m18231i(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L_0x005f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r3.<init>(r6)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
        L_0x0015:
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x003a }
            if (r3 == 0) goto L_0x0036
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch:{ Exception -> 0x003a }
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch:{ Exception -> 0x003a }
            int r4 = r3.length     // Catch:{ Exception -> 0x003a }
            r5 = 1
            if (r4 <= r5) goto L_0x0015
            r4 = 0
            r4 = r3[r4]     // Catch:{ Exception -> 0x003a }
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x003a }
            if (r4 == 0) goto L_0x0015
            r6 = r3[r5]     // Catch:{ Exception -> 0x003a }
            r2 = r6
        L_0x0036:
            m18227e(r1, r0)
            goto L_0x005f
        L_0x003a:
            r7 = move-exception
            goto L_0x0040
        L_0x003c:
            r6 = move-exception
            goto L_0x005b
        L_0x003e:
            r7 = move-exception
            r1 = r2
        L_0x0040:
            c.q.c.n.h.f r3 = p040c.p200q.p363c.p370n.p371h.C6479f.m18125f()     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r4.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch:{ all -> 0x0059 }
            r4.append(r6)     // Catch:{ all -> 0x0059 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0059 }
            r3.mo30644e(r6, r7)     // Catch:{ all -> 0x0059 }
            goto L_0x0036
        L_0x0059:
            r6 = move-exception
            r2 = r1
        L_0x005b:
            m18227e(r2, r0)
            throw r6
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p370n.p371h.p374j.C6513n.m18231i(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: j */
    public static ActivityManager.RunningAppProcessInfo m18232j(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m18233k(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int q = m18239q(context, str, "bool");
            if (q > 0) {
                return resources.getBoolean(q);
            }
            int q2 = m18239q(context, str, "string");
            if (q2 > 0) {
                return Boolean.parseBoolean(context.getString(q2));
            }
        }
        return z;
    }

    /* renamed from: l */
    public static int m18234l() {
        return C6514a.m18249c().ordinal();
    }

    /* renamed from: m */
    public static int m18235m() {
        int i = m18247y() ? 1 : 0;
        if (m18248z()) {
            i |= 2;
        }
        return m18246x() ? i | 4 : i;
    }

    /* renamed from: n */
    public static String m18236n(Context context) {
        int q = m18239q(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (q == 0) {
            q = m18239q(context, "com.crashlytics.android.build_id", "string");
        }
        if (q != 0) {
            return context.getResources().getString(q);
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m18237o(Context context) {
        if (!m18247y() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static String m18238p(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i);
            if (UrlConstKt.APP_PLATFORM.equals(resourcePackageName)) {
                return context.getPackageName();
            }
            return resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: q */
    public static int m18239q(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m18238p(context));
    }

    /* renamed from: r */
    public static SharedPreferences m18240r(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* renamed from: s */
    public static synchronized long m18241s() {
        long j;
        synchronized (C6513n.class) {
            if (f12234b == -1) {
                long j2 = 0;
                String i = m18231i(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(i)) {
                    String upperCase = i.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = m18229g(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = m18229g(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = m18229g(upperCase, "GB", 1073741824);
                        } else {
                            C6479f f = C6479f.m18125f();
                            f.mo30649k("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e) {
                        C6479f f2 = C6479f.m18125f();
                        f2.mo30644e("Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                f12234b = j2;
            }
            j = f12234b;
        }
        return j;
    }

    /* renamed from: t */
    public static String m18242t(String str, String str2) {
        return m18243u(str.getBytes(), str2);
    }

    /* renamed from: u */
    public static String m18243u(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return m18244v(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C6479f f = C6479f.m18125f();
            f.mo30644e("Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return "";
        }
    }

    /* renamed from: v */
    public static String m18244v(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f12233a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: w */
    public static boolean m18245w(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: x */
    public static boolean m18246x() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* renamed from: y */
    public static boolean m18247y() {
        return Build.PRODUCT.contains("sdk") || Build.HARDWARE.contains(TestRequestBuilder.RequiresDeviceFilter.EMULATOR_HARDWARE_GOLDFISH) || Build.HARDWARE.contains(TestRequestBuilder.RequiresDeviceFilter.EMULATOR_HARDWARE_RANCHU);
    }

    /* renamed from: z */
    public static boolean m18248z() {
        boolean y = m18247y();
        String str = Build.TAGS;
        if ((!y && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (y || !file.exists()) {
            return false;
        }
        return true;
    }
}
