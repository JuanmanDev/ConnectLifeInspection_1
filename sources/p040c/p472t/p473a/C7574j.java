package p040c.p472t.p473a;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationManagerCompat;

@RequiresApi(api = 14)
/* renamed from: c.t.a.j */
/* compiled from: PermissionDelegateImplV14 */
public class C7574j implements C7573i {
    /* renamed from: d */
    public static Intent m21484d(Context context) {
        Intent intent;
        if (C7565b.m21451i()) {
            intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
        } else {
            intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
        }
        return !C7584t.m21531a(context, intent) ? C7584t.m21539i(context) : intent;
    }

    /* renamed from: e */
    public static Intent m21485e(Context context) {
        Intent intent;
        if (C7565b.m21453k()) {
            intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent = null;
        }
        return (intent == null || !C7584t.m21531a(context, intent)) ? C7584t.m21539i(context) : intent;
    }

    /* renamed from: f */
    public static Intent m21486f(Context context) {
        Intent intent;
        if (C7565b.m21450h()) {
            intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
            if (C7565b.m21445c()) {
                intent.setData(C7584t.m21541k(context));
            }
        } else {
            intent = null;
        }
        return (intent == null || !C7584t.m21531a(context, intent)) ? C7584t.m21539i(context) : intent;
    }

    /* renamed from: g */
    public static Intent m21487g(Context context) {
        Intent prepare = VpnService.prepare(context);
        return (prepare == null || !C7584t.m21531a(context, prepare)) ? C7584t.m21539i(context) : prepare;
    }

    /* renamed from: h */
    public static boolean m21488h(Context context) {
        if (C7565b.m21449g()) {
            return NotificationManagerCompat.getEnabledListenerPackages(context).contains(context.getPackageName());
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m21489i(Context context) {
        return NotificationManagerCompat.from(context).areNotificationsEnabled();
    }

    /* renamed from: j */
    public static boolean m21490j(Context context) {
        int i;
        if (!C7565b.m21450h()) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        if (C7565b.m21445c()) {
            i = appOpsManager.unsafeCheckOpNoThrow("android:get_usage_stats", context.getApplicationInfo().uid, context.getPackageName());
        } else {
            i = appOpsManager.checkOpNoThrow("android:get_usage_stats", context.getApplicationInfo().uid, context.getPackageName());
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m21491k(Context context) {
        return VpnService.prepare(context) == null;
    }

    /* renamed from: a */
    public boolean mo33036a(Activity activity, String str) {
        return false;
    }

    /* renamed from: b */
    public Intent mo33037b(Context context, String str) {
        if (C7584t.m21535e(str, "android.permission.NOTIFICATION_SERVICE")) {
            return m21485e(context);
        }
        if (C7584t.m21535e(str, "android.permission.PACKAGE_USAGE_STATS")) {
            return m21486f(context);
        }
        if (C7584t.m21535e(str, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE")) {
            return m21484d(context);
        }
        if (C7584t.m21535e(str, "android.permission.BIND_VPN_SERVICE")) {
            return m21487g(context);
        }
        if (C7565b.m21448f() || !C7584t.m21535e(str, "android.permission.POST_NOTIFICATIONS")) {
            return C7584t.m21539i(context);
        }
        return m21485e(context);
    }

    /* renamed from: c */
    public boolean mo33038c(Context context, String str) {
        if (C7584t.m21535e(str, "android.permission.NOTIFICATION_SERVICE")) {
            return m21489i(context);
        }
        if (C7584t.m21535e(str, "android.permission.PACKAGE_USAGE_STATS")) {
            return m21490j(context);
        }
        if (C7584t.m21535e(str, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE")) {
            return m21488h(context);
        }
        if (C7584t.m21535e(str, "android.permission.BIND_VPN_SERVICE")) {
            return m21491k(context);
        }
        if (C7565b.m21448f() || !C7584t.m21535e(str, "android.permission.POST_NOTIFICATIONS")) {
            return true;
        }
        return m21489i(context);
    }
}
