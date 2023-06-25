package p040c.p313b0.p314a.p315a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsService;
import com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.KeepAliveService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.b0.a.a.c */
/* compiled from: CustomTabsHelper */
public class C4148c {

    /* renamed from: a */
    public static String f8738a;

    /* renamed from: a */
    public static void m11385a(Context context, Intent intent) {
        intent.putExtra("android.support.customtabs.extra.KEEP_ALIVE", new Intent().setClassName(context.getPackageName(), KeepAliveService.class.getCanonicalName()));
    }

    /* renamed from: b */
    public static String m11386b(Context context) {
        String str = f8738a;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo next : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
            intent2.setPackage(next.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(next.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f8738a = null;
        } else if (arrayList.size() == 1) {
            f8738a = (String) arrayList.get(0);
        } else if (!TextUtils.isEmpty(str2) && !m11387c(context, intent) && arrayList.contains(str2)) {
            f8738a = str2;
        } else if (arrayList.contains("com.android.chrome")) {
            f8738a = "com.android.chrome";
        } else if (arrayList.contains("com.chrome.beta")) {
            f8738a = "com.chrome.beta";
        } else if (arrayList.contains("com.chrome.dev")) {
            f8738a = "com.chrome.dev";
        } else if (arrayList.contains("com.google.android.apps.chrome")) {
            f8738a = "com.google.android.apps.chrome";
        }
        return f8738a;
    }

    /* renamed from: c */
    public static boolean m11387c(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (queryIntentActivities != null) {
                if (queryIntentActivities.size() != 0) {
                    for (ResolveInfo next : queryIntentActivities) {
                        IntentFilter intentFilter = next.filter;
                        if (intentFilter != null) {
                            if (intentFilter.countDataAuthorities() == 0) {
                                continue;
                            } else if (intentFilter.countDataPaths() != 0) {
                                if (next.activityInfo != null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException unused) {
        }
        return false;
    }
}
