package p040c.p041a.p042a.p043a.p047d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.template.ILogger;
import p040c.p041a.p042a.p043a.p045b.C1337a;

/* renamed from: c.a.a.a.d.d */
/* compiled from: PackageUtils */
public class C1352d {

    /* renamed from: a */
    public static String f376a;

    /* renamed from: b */
    public static int f377b;

    /* renamed from: a */
    public static PackageInfo m248a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (Exception unused) {
            C1337a.f337c.error(ILogger.defaultTag, "Get package info error.");
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m249b(Context context) {
        PackageInfo a = m248a(context);
        if (a != null) {
            String str = a.versionName;
            int i = a.versionCode;
            SharedPreferences sharedPreferences = context.getSharedPreferences("SP_AROUTER_CACHE", 0);
            if (str.equals(sharedPreferences.getString("LAST_VERSION_NAME", (String) null)) && i == sharedPreferences.getInt("LAST_VERSION_CODE", -1)) {
                return false;
            }
            f376a = str;
            f377b = i;
        }
        return true;
    }

    /* renamed from: c */
    public static void m250c(Context context) {
        if (!TextUtils.isEmpty(f376a) && f377b != 0) {
            context.getSharedPreferences("SP_AROUTER_CACHE", 0).edit().putString("LAST_VERSION_NAME", f376a).putInt("LAST_VERSION_CODE", f377b).apply();
        }
    }
}
