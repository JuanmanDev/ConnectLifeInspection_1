package p040c.p048b.p049a.p050a.p051a;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.identity.auth.device.api.authorization.Region;

/* renamed from: c.b.a.a.a.g */
/* compiled from: StoredPreferences */
public final class C1360g {
    /* renamed from: a */
    public static String m283a(Context context) {
        return m284b(context).getString("com.amazon.lwa.encryption.key", (String) null);
    }

    /* renamed from: b */
    public static SharedPreferences m284b(Context context) {
        return context.getSharedPreferences("com.amazon.lwa.LWASharedPreferences", 0);
    }

    /* renamed from: c */
    public static Region m285c(Context context) {
        return Region.valueOf(m284b(context).getString("com.amazon.lwa.regionMode", Region.AUTO.toString()));
    }

    /* renamed from: d */
    public static String m286d(Context context, String str) {
        return m284b(context).getString(str, (String) null);
    }

    /* renamed from: e */
    public static boolean m287e(Context context) {
        return m284b(context).getBoolean("com.amazon.lwa.sandboxMode", false);
    }

    /* renamed from: f */
    public static boolean m288f(Context context) {
        return m284b(context).getBoolean("com.amazon.lwa.isTokenObtainedFromSSO", false);
    }

    /* renamed from: g */
    public static void m289g(Context context, String str) {
        m284b(context).edit().putString("com.amazon.lwa.encryption.key", str).commit();
    }

    /* renamed from: h */
    public static void m290h(Context context, String str, String str2) {
        m284b(context).edit().putString(str, str2).commit();
    }

    /* renamed from: i */
    public static void m291i(Context context, boolean z) {
        m284b(context).edit().putBoolean("com.amazon.lwa.isTokenObtainedFromSSO", z).commit();
    }
}
