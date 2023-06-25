package p040c.p472t.p473a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.test.internal.runner.RunnerArgs;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.p703v1.XmlPullParserException;

/* renamed from: c.t.a.t */
/* compiled from: PermissionUtils */
public final class C7584t {

    /* renamed from: a */
    public static final Handler f14277a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static boolean m21531a(Context context, Intent intent) {
        return !context.getPackageManager().queryIntentActivities(intent, 65536).isEmpty();
    }

    /* renamed from: b */
    public static <T> ArrayList<T> m21532b(T... tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        if (!(tArr == null || tArr.length == 0)) {
            for (T add : tArr) {
                arrayList.add(add);
            }
        }
        return arrayList;
    }

    @RequiresApi(api = 23)
    /* renamed from: c */
    public static boolean m21533c(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    /* renamed from: d */
    public static boolean m21534d(Collection<String> collection, String str) {
        if (!(collection == null || collection.isEmpty() || str == null)) {
            for (String e : collection) {
                if (m21535e(e, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m21535e(String str, String str2) {
        int length;
        if (str == null || str2 == null || (length = str.length()) != str2.length()) {
            return false;
        }
        for (int i = length - 1; i >= 0; i--) {
            if (str.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0007  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Activity m21536f(android.content.Context r2) {
        /*
        L_0x0000:
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0007
            android.app.Activity r2 = (android.app.Activity) r2
            return r2
        L_0x0007:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            r1 = 0
            if (r0 == 0) goto L_0x0014
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            if (r2 != 0) goto L_0x0000
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p472t.p473a.C7584t.m21536f(android.content.Context):android.app.Activity");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"PrivateApi"})
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m21537g(android.content.Context r9, java.lang.String r10) {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            android.content.res.AssetManager r1 = r9.getAssets()
            r2 = 0
            r3 = 1
            int r4 = p040c.p472t.p473a.C7565b.m21444b(r9)     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            r5 = 28
            if (r4 < r5) goto L_0x006e
            int r4 = p040c.p472t.p473a.C7565b.m21443a()     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            if (r4 < r5) goto L_0x006e
            int r4 = p040c.p472t.p473a.C7565b.m21443a()     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            r5 = 30
            if (r4 >= r5) goto L_0x006e
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            java.lang.String r5 = "getDeclaredMethod"
            r6 = 2
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            r7[r2] = r0     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            java.lang.Class<java.lang.Class[]> r8 = java.lang.Class[].class
            r7[r3] = r8     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r7)     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            r4.setAccessible(r3)     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            java.lang.Class<android.content.res.AssetManager> r5 = android.content.res.AssetManager.class
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            java.lang.String r7 = "findCookieForPath"
            r6[r2] = r7     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            r7[r2] = r0     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            r6[r3] = r7     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            java.lang.Object r4 = r4.invoke(r5, r6)     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            if (r4 == 0) goto L_0x006e
            r4.setAccessible(r3)     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            android.content.res.AssetManager r9 = r9.getAssets()     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            r5[r2] = r10     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            java.lang.Object r9 = r4.invoke(r9, r5)     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            if (r9 == 0) goto L_0x006e
            int r9 = r9.intValue()     // Catch:{ NoSuchMethodException -> 0x006a, IllegalAccessException -> 0x0065, InvocationTargetException -> 0x0060 }
            return r9
        L_0x0060:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x006e
        L_0x0065:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x006e
        L_0x006a:
            r9 = move-exception
            r9.printStackTrace()
        L_0x006e:
            java.lang.Class r9 = r1.getClass()     // Catch:{ NoSuchMethodException -> 0x0097, IllegalAccessException -> 0x0092, InvocationTargetException -> 0x008d }
            java.lang.String r4 = "addAssetPath"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0097, IllegalAccessException -> 0x0092, InvocationTargetException -> 0x008d }
            r5[r2] = r0     // Catch:{ NoSuchMethodException -> 0x0097, IllegalAccessException -> 0x0092, InvocationTargetException -> 0x008d }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0097, IllegalAccessException -> 0x0092, InvocationTargetException -> 0x008d }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x0097, IllegalAccessException -> 0x0092, InvocationTargetException -> 0x008d }
            r0[r2] = r10     // Catch:{ NoSuchMethodException -> 0x0097, IllegalAccessException -> 0x0092, InvocationTargetException -> 0x008d }
            java.lang.Object r9 = r9.invoke(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0097, IllegalAccessException -> 0x0092, InvocationTargetException -> 0x008d }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ NoSuchMethodException -> 0x0097, IllegalAccessException -> 0x0092, InvocationTargetException -> 0x008d }
            if (r9 == 0) goto L_0x009b
            int r9 = r9.intValue()     // Catch:{ NoSuchMethodException -> 0x0097, IllegalAccessException -> 0x0092, InvocationTargetException -> 0x008d }
            return r9
        L_0x008d:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x009b
        L_0x0092:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x009b
        L_0x0097:
            r9 = move-exception
            r9.printStackTrace()
        L_0x009b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p472t.p473a.C7584t.m21537g(android.content.Context, java.lang.String):int");
    }

    /* renamed from: h */
    public static String m21538h() {
        return "http://schemas.android.com/apk/res/android";
    }

    /* renamed from: i */
    public static Intent m21539i(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(m21541k(context));
        if (m21531a(context, intent)) {
            return intent;
        }
        Intent intent2 = new Intent("android.settings.APPLICATION_SETTINGS");
        return !m21531a(context, intent2) ? new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS") : intent2;
    }

    /* renamed from: j */
    public static HashMap<String, Integer> m21540j(Context context) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        XmlResourceParser s = m21549s(context);
        if (s != null) {
            do {
                try {
                    if (s.getEventType() == 2) {
                        if ("uses-permission".equals(s.getName())) {
                            hashMap.put(s.getAttributeValue(m21538h(), "name"), Integer.valueOf(s.getAttributeIntValue(m21538h(), "maxSdkVersion", Integer.MAX_VALUE)));
                        }
                    }
                } catch (IOException | XmlPullParserException e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    s.close();
                    throw th;
                }
            } while (s.next() != 1);
            s.close();
        }
        if (hashMap.isEmpty()) {
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                if (strArr != null) {
                    for (String put : strArr) {
                        hashMap.put(put, Integer.MAX_VALUE);
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
            }
        }
        return hashMap;
    }

    /* renamed from: k */
    public static Uri m21541k(Context context) {
        return Uri.parse("package:" + context.getPackageName());
    }

    /* renamed from: l */
    public static Intent m21542l(Context context, List<String> list) {
        if (list == null || list.isEmpty() || !C7571g.m21460a(list)) {
            return m21539i(context);
        }
        int size = list.size();
        if (size == 1) {
            return C7571g.m21464e(context, list.get(0));
        }
        if (size != 2) {
            if (size == 3 && C7565b.m21446d() && m21534d(list, "android.permission.MANAGE_EXTERNAL_STORAGE") && m21534d(list, "android.permission.READ_EXTERNAL_STORAGE") && m21534d(list, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                return C7571g.m21464e(context, "android.permission.MANAGE_EXTERNAL_STORAGE");
            }
        } else if (!C7565b.m21448f() && m21534d(list, "android.permission.NOTIFICATION_SERVICE") && m21534d(list, "android.permission.POST_NOTIFICATIONS")) {
            return C7571g.m21464e(context, "android.permission.NOTIFICATION_SERVICE");
        }
        return m21539i(context);
    }

    /* renamed from: m */
    public static boolean m21543m(Activity activity) {
        int i;
        if (C7565b.m21446d()) {
            i = activity.getDisplay().getRotation();
        } else {
            i = activity.getWindowManager().getDefaultDisplay().getRotation();
        }
        return i == 2 || i == 3;
    }

    /* renamed from: n */
    public static boolean m21544n(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: o */
    public static boolean m21545o(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null || !bundle.containsKey("ScopedStorage")) {
                return false;
            }
            return Boolean.parseBoolean(String.valueOf(bundle.get("ScopedStorage")));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: p */
    public static boolean m21546p(String str) {
        return m21535e(str, "android.permission.MANAGE_EXTERNAL_STORAGE") || m21535e(str, "android.permission.REQUEST_INSTALL_PACKAGES") || m21535e(str, "android.permission.SYSTEM_ALERT_WINDOW") || m21535e(str, "android.permission.WRITE_SETTINGS") || m21535e(str, "android.permission.NOTIFICATION_SERVICE") || m21535e(str, "android.permission.PACKAGE_USAGE_STATS") || m21535e(str, "android.permission.SCHEDULE_EXACT_ALARM") || m21535e(str, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE") || m21535e(str, "android.permission.ACCESS_NOTIFICATION_POLICY") || m21535e(str, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS") || m21535e(str, "android.permission.BIND_VPN_SERVICE") || m21535e(str, "android.permission.PICTURE_IN_PICTURE");
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: q */
    public static void m21547q(Activity activity) {
        try {
            int i = activity.getResources().getConfiguration().orientation;
            int i2 = 1;
            if (i == 1) {
                if (m21543m(activity)) {
                    i2 = 9;
                }
                activity.setRequestedOrientation(i2);
            } else if (i == 2) {
                activity.setRequestedOrientation(m21543m(activity) ? 8 : 0);
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: r */
    public static void m21548r(Activity activity, String[] strArr, int[] iArr) {
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            boolean j = C7571g.m21469j(str);
            boolean z = true;
            if (!C7565b.m21448f() && (m21535e(str, "android.permission.POST_NOTIFICATIONS") || m21535e(str, "android.permission.NEARBY_WIFI_DEVICES") || m21535e(str, "android.permission.BODY_SENSORS_BACKGROUND") || m21535e(str, "android.permission.READ_MEDIA_IMAGES") || m21535e(str, "android.permission.READ_MEDIA_VIDEO") || m21535e(str, "android.permission.READ_MEDIA_AUDIO"))) {
                j = true;
            }
            if (!C7565b.m21447e() && (m21535e(str, "android.permission.BLUETOOTH_SCAN") || m21535e(str, "android.permission.BLUETOOTH_CONNECT") || m21535e(str, "android.permission.BLUETOOTH_ADVERTISE"))) {
                j = true;
            }
            if (!C7565b.m21445c() && (m21535e(str, "android.permission.ACCESS_BACKGROUND_LOCATION") || m21535e(str, "android.permission.ACTIVITY_RECOGNITION") || m21535e(str, "android.permission.ACCESS_MEDIA_LOCATION"))) {
                j = true;
            }
            if (!C7565b.m21454l() && m21535e(str, "android.permission.ACCEPT_HANDOVER")) {
                j = true;
            }
            if (C7565b.m21453k() || (!m21535e(str, "android.permission.ANSWER_PHONE_CALLS") && !m21535e(str, "android.permission.READ_PHONE_NUMBERS"))) {
                z = j;
            }
            if (z) {
                iArr[i] = C7571g.m21465f(activity, str) ? 0 : -1;
            }
        }
    }

    /* renamed from: s */
    public static XmlResourceParser m21549s(Context context) {
        int g = m21537g(context, context.getApplicationInfo().sourceDir);
        if (g == 0) {
            return null;
        }
        try {
            XmlResourceParser openXmlResourceParser = context.getAssets().openXmlResourceParser(g, "AndroidManifest.xml");
            do {
                if (openXmlResourceParser.getEventType() == 2) {
                    if ("manifest".equals(openXmlResourceParser.getName()) && TextUtils.equals(context.getPackageName(), openXmlResourceParser.getAttributeValue((String) null, RunnerArgs.ARGUMENT_TEST_PACKAGE))) {
                        return openXmlResourceParser;
                    }
                }
            } while (openXmlResourceParser.next() != 1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
        return null;
    }

    /* renamed from: t */
    public static void m21550t(List<String> list, Runnable runnable) {
        long j = 300;
        long j2 = C7565b.m21446d() ? 200 : 300;
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        if (!lowerCase.contains("huawei")) {
            j = (!lowerCase.contains("xiaomi") || !C7565b.m21446d() || !m21534d(list, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) ? j2 : 1000;
        } else if (!C7565b.m21453k()) {
            j = 500;
        }
        f14277a.postDelayed(runnable, j);
    }

    /* renamed from: u */
    public static void m21551u(Runnable runnable, long j) {
        f14277a.postDelayed(runnable, j);
    }

    @RequiresApi(api = 23)
    /* renamed from: v */
    public static boolean m21552v(Activity activity, String str) {
        if (C7565b.m21443a() == 31) {
            try {
                PackageManager packageManager = activity.getApplication().getPackageManager();
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[]{String.class}).invoke(packageManager, new Object[]{str})).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
