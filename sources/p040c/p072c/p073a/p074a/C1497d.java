package p040c.p072c.p073a.p074a;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import p040c.p072c.p073a.p074a.C1535z;

/* renamed from: c.c.a.a.d */
/* compiled from: AppUtils */
public final class C1497d {
    /* renamed from: a */
    public static String m907a() {
        return m908b(C1535z.m1079a().getPackageName());
    }

    /* renamed from: b */
    public static String m908b(String str) {
        if (C1493b0.m899w(str)) {
            return "";
        }
        try {
            PackageManager packageManager = C1535z.m1079a().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public static String m909c() {
        return C1535z.m1079a().getPackageName();
    }

    /* renamed from: d */
    public static int m910d() {
        return m911e(C1535z.m1079a().getPackageName());
    }

    /* renamed from: e */
    public static int m911e(String str) {
        if (C1493b0.m899w(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = C1535z.m1079a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return -1;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: f */
    public static String m912f() {
        return m913g(C1535z.m1079a().getPackageName());
    }

    /* renamed from: g */
    public static String m913g(String str) {
        if (C1493b0.m899w(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = C1535z.m1079a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void registerAppStatusChangedListener(@NonNull C1535z.C1537b bVar) {
        if (bVar != null) {
            C1493b0.addOnAppStatusChangedListener(bVar);
            return;
        }
        throw new NullPointerException("Argument 'listener' of type Utils.OnAppStatusChangedListener (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void unregisterAppStatusChangedListener(@NonNull C1535z.C1537b bVar) {
        if (bVar != null) {
            C1493b0.removeOnAppStatusChangedListener(bVar);
            return;
        }
        throw new NullPointerException("Argument 'listener' of type Utils.OnAppStatusChangedListener (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
