package p040c.p072c.p073a.p074a;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import androidx.core.p028os.EnvironmentCompat;
import com.google.android.material.internal.ManufacturerUtils;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/* renamed from: c.c.a.a.q */
/* compiled from: RomUtils */
public final class C1520q {

    /* renamed from: a */
    public static final String[] f721a = {"huawei"};

    /* renamed from: b */
    public static final String[] f722b = {"vivo"};

    /* renamed from: c */
    public static final String[] f723c = {"xiaomi"};

    /* renamed from: d */
    public static final String[] f724d = {"oppo"};

    /* renamed from: e */
    public static final String[] f725e = {"leeco", "letv"};

    /* renamed from: f */
    public static final String[] f726f = {"360", "qiku"};

    /* renamed from: g */
    public static final String[] f727g = {"zte"};

    /* renamed from: h */
    public static final String[] f728h = {"oneplus"};

    /* renamed from: i */
    public static final String[] f729i = {"nubia"};

    /* renamed from: j */
    public static final String[] f730j = {"coolpad", "yulong"};

    /* renamed from: k */
    public static final String[] f731k = {"lg", ManufacturerUtils.LGE};

    /* renamed from: l */
    public static final String[] f732l = {"google"};

    /* renamed from: m */
    public static final String[] f733m = {ManufacturerUtils.SAMSUNG};

    /* renamed from: n */
    public static final String[] f734n = {ManufacturerUtils.MEIZU};

    /* renamed from: o */
    public static final String[] f735o = {"lenovo"};

    /* renamed from: p */
    public static final String[] f736p = {"smartisan"};

    /* renamed from: q */
    public static final String[] f737q = {"htc"};

    /* renamed from: r */
    public static final String[] f738r = {"sony"};

    /* renamed from: s */
    public static final String[] f739s = {"gionee", "amigo"};

    /* renamed from: t */
    public static final String[] f740t = {"motorola"};

    /* renamed from: u */
    public static C1521a f741u;

    /* renamed from: c.c.a.a.q$a */
    /* compiled from: RomUtils */
    public static class C1521a {

        /* renamed from: a */
        public String f742a;

        /* renamed from: b */
        public String f743b;

        public String toString() {
            return "RomInfo{name=" + this.f742a + ", version=" + this.f743b + "}";
        }
    }

    /* renamed from: a */
    public static String m1019a() {
        try {
            String str = Build.BRAND;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : EnvironmentCompat.MEDIA_UNKNOWN;
        } catch (Throwable unused) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }

    /* renamed from: b */
    public static String m1020b() {
        try {
            String str = Build.MANUFACTURER;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : EnvironmentCompat.MEDIA_UNKNOWN;
        } catch (Throwable unused) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }

    /* renamed from: c */
    public static C1521a m1021c() {
        C1521a aVar = f741u;
        if (aVar != null) {
            return aVar;
        }
        f741u = new C1521a();
        String a = m1019a();
        String b = m1020b();
        if (m1027i(a, b, f721a)) {
            String unused = f741u.f742a = f721a[0];
            String d = m1022d("ro.build.version.emui");
            String[] split = d.split("_");
            if (split.length > 1) {
                String unused2 = f741u.f743b = split[1];
            } else {
                String unused3 = f741u.f743b = d;
            }
            return f741u;
        } else if (m1027i(a, b, f722b)) {
            String unused4 = f741u.f742a = f722b[0];
            String unused5 = f741u.f743b = m1022d("ro.vivo.os.build.display.id");
            return f741u;
        } else if (m1027i(a, b, f723c)) {
            String unused6 = f741u.f742a = f723c[0];
            String unused7 = f741u.f743b = m1022d("ro.build.version.incremental");
            return f741u;
        } else if (m1027i(a, b, f724d)) {
            String unused8 = f741u.f742a = f724d[0];
            String unused9 = f741u.f743b = m1022d("ro.build.version.opporom");
            return f741u;
        } else if (m1027i(a, b, f725e)) {
            String unused10 = f741u.f742a = f725e[0];
            String unused11 = f741u.f743b = m1022d("ro.letv.release.version");
            return f741u;
        } else if (m1027i(a, b, f726f)) {
            String unused12 = f741u.f742a = f726f[0];
            String unused13 = f741u.f743b = m1022d("ro.build.uiversion");
            return f741u;
        } else if (m1027i(a, b, f727g)) {
            String unused14 = f741u.f742a = f727g[0];
            String unused15 = f741u.f743b = m1022d("ro.build.MiFavor_version");
            return f741u;
        } else if (m1027i(a, b, f728h)) {
            String unused16 = f741u.f742a = f728h[0];
            String unused17 = f741u.f743b = m1022d("ro.rom.version");
            return f741u;
        } else if (m1027i(a, b, f729i)) {
            String unused18 = f741u.f742a = f729i[0];
            String unused19 = f741u.f743b = m1022d("ro.build.rom.id");
            return f741u;
        } else {
            if (m1027i(a, b, f730j)) {
                String unused20 = f741u.f742a = f730j[0];
            } else if (m1027i(a, b, f731k)) {
                String unused21 = f741u.f742a = f731k[0];
            } else if (m1027i(a, b, f732l)) {
                String unused22 = f741u.f742a = f732l[0];
            } else if (m1027i(a, b, f733m)) {
                String unused23 = f741u.f742a = f733m[0];
            } else if (m1027i(a, b, f734n)) {
                String unused24 = f741u.f742a = f734n[0];
            } else if (m1027i(a, b, f735o)) {
                String unused25 = f741u.f742a = f735o[0];
            } else if (m1027i(a, b, f736p)) {
                String unused26 = f741u.f742a = f736p[0];
            } else if (m1027i(a, b, f737q)) {
                String unused27 = f741u.f742a = f737q[0];
            } else if (m1027i(a, b, f738r)) {
                String unused28 = f741u.f742a = f738r[0];
            } else if (m1027i(a, b, f739s)) {
                String unused29 = f741u.f742a = f739s[0];
            } else if (m1027i(a, b, f740t)) {
                String unused30 = f741u.f742a = f740t[0];
            } else {
                String unused31 = f741u.f742a = b;
            }
            String unused32 = f741u.f743b = m1022d("");
            return f741u;
        }
    }

    /* renamed from: d */
    public static String m1022d(String str) {
        String e = !TextUtils.isEmpty(str) ? m1023e(str) : "";
        if (TextUtils.isEmpty(e) || e.equals(EnvironmentCompat.MEDIA_UNKNOWN)) {
            try {
                String str2 = Build.DISPLAY;
                if (!TextUtils.isEmpty(str2)) {
                    e = str2.toLowerCase();
                }
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(e)) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return e;
    }

    /* renamed from: e */
    public static String m1023e(String str) {
        String g = m1025g(str);
        if (!TextUtils.isEmpty(g)) {
            return g;
        }
        String h = m1026h(str);
        return (TextUtils.isEmpty(h) && Build.VERSION.SDK_INT < 28) ? m1024f(str) : h;
    }

    /* renamed from: f */
    public static String m1024f(String str) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.os.SystemProperties");
            return (String) cls2.getMethod("get", new Class[]{cls, cls}).invoke(cls2, new Object[]{str, ""});
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[SYNTHETIC, Splitter:B:18:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046 A[SYNTHETIC, Splitter:B:24:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1025g(java.lang.String r4) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            r2.<init>()     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.lang.String r3 = "getprop "
            r2.append(r3)     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            r2.append(r4)     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.lang.Process r4 = r1.exec(r4)     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r4)     // Catch:{ IOException -> 0x0044, all -> 0x003d }
            java.lang.String r4 = r1.readLine()     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            if (r4 == 0) goto L_0x0034
            r1.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            return r4
        L_0x0034:
            r1.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x0049
        L_0x0038:
            r4 = move-exception
            r0 = r1
            goto L_0x003e
        L_0x003b:
            r0 = r1
            goto L_0x0044
        L_0x003d:
            r4 = move-exception
        L_0x003e:
            if (r0 == 0) goto L_0x0043
            r0.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            throw r4
        L_0x0044:
            if (r0 == 0) goto L_0x0049
            r0.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p072c.p073a.p074a.C1520q.m1025g(java.lang.String):java.lang.String");
    }

    /* renamed from: h */
    public static String m1026h(String str) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
            return properties.getProperty(str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: i */
    public static boolean m1027i(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }
}
