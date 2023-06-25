package p040c.p472t.p473a;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.provider.Settings;
import androidx.annotation.RequiresApi;
import com.hisense.connect_life.core.global.PermissionConstKt;

@RequiresApi(api = 23)
/* renamed from: c.t.a.k */
/* compiled from: PermissionDelegateImplV23 */
public class C7575k extends C7574j {
    /* renamed from: l */
    public static Intent m21495l(Context context) {
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(C7584t.m21541k(context));
        if (!C7584t.m21531a(context, intent)) {
            intent = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        }
        return !C7584t.m21531a(context, intent) ? C7584t.m21539i(context) : intent;
    }

    /* renamed from: m */
    public static Intent m21496m(Context context) {
        Intent intent;
        if (C7565b.m21445c()) {
            intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_DETAIL_SETTINGS");
            intent.setData(C7584t.m21541k(context));
        } else {
            intent = null;
        }
        if (intent == null || !C7584t.m21531a(context, intent)) {
            intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
        }
        return !C7584t.m21531a(context, intent) ? C7584t.m21539i(context) : intent;
    }

    /* renamed from: n */
    public static Intent m21497n(Context context) {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(C7584t.m21541k(context));
        return !C7584t.m21531a(context, intent) ? C7584t.m21539i(context) : intent;
    }

    /* renamed from: o */
    public static Intent m21498o(Context context) {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(C7584t.m21541k(context));
        return !C7584t.m21531a(context, intent) ? C7584t.m21539i(context) : intent;
    }

    /* renamed from: p */
    public static boolean m21499p(Context context) {
        return ((PowerManager) context.getSystemService(PowerManager.class)).isIgnoringBatteryOptimizations(context.getPackageName());
    }

    /* renamed from: q */
    public static boolean m21500q(Context context) {
        return ((NotificationManager) context.getSystemService(NotificationManager.class)).isNotificationPolicyAccessGranted();
    }

    /* renamed from: r */
    public static boolean m21501r(Context context) {
        if (C7565b.m21452j()) {
            return Settings.System.canWrite(context);
        }
        return true;
    }

    /* renamed from: s */
    public static boolean m21502s(Context context) {
        return Settings.canDrawOverlays(context);
    }

    /* renamed from: a */
    public boolean mo33036a(Activity activity, String str) {
        if (C7584t.m21546p(str)) {
            return false;
        }
        if (!C7565b.m21448f()) {
            if (C7584t.m21535e(str, "android.permission.POST_NOTIFICATIONS")) {
                return super.mo33036a(activity, str);
            }
            if (C7584t.m21535e(str, "android.permission.NEARBY_WIFI_DEVICES")) {
                if (C7584t.m21533c(activity, PermissionConstKt.PERMISSION_LOCATION) || C7584t.m21552v(activity, PermissionConstKt.PERMISSION_LOCATION)) {
                    return false;
                }
                return true;
            } else if (C7584t.m21535e(str, "android.permission.BODY_SENSORS_BACKGROUND")) {
                if (C7584t.m21533c(activity, "android.permission.BODY_SENSORS") || C7584t.m21552v(activity, "android.permission.BODY_SENSORS")) {
                    return false;
                }
                return true;
            } else if (C7584t.m21535e(str, "android.permission.READ_MEDIA_IMAGES") || C7584t.m21535e(str, "android.permission.READ_MEDIA_VIDEO") || C7584t.m21535e(str, "android.permission.READ_MEDIA_AUDIO")) {
                if (C7584t.m21533c(activity, "android.permission.READ_EXTERNAL_STORAGE") || C7584t.m21552v(activity, "android.permission.READ_EXTERNAL_STORAGE")) {
                    return false;
                }
                return true;
            }
        }
        if (!C7565b.m21447e()) {
            if (C7584t.m21535e(str, "android.permission.BLUETOOTH_SCAN")) {
                if (C7584t.m21533c(activity, PermissionConstKt.PERMISSION_LOCATION) || C7584t.m21552v(activity, PermissionConstKt.PERMISSION_LOCATION)) {
                    return false;
                }
                return true;
            } else if (C7584t.m21535e(str, "android.permission.BLUETOOTH_CONNECT") || C7584t.m21535e(str, "android.permission.BLUETOOTH_ADVERTISE")) {
                return false;
            }
        }
        if (!C7565b.m21445c()) {
            if (C7584t.m21535e(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                if (C7584t.m21533c(activity, PermissionConstKt.PERMISSION_LOCATION) || C7584t.m21552v(activity, PermissionConstKt.PERMISSION_LOCATION)) {
                    return false;
                }
                return true;
            } else if (C7584t.m21535e(str, "android.permission.ACTIVITY_RECOGNITION")) {
                return false;
            } else {
                if (C7584t.m21535e(str, "android.permission.ACCESS_MEDIA_LOCATION")) {
                    if (C7584t.m21533c(activity, "android.permission.READ_EXTERNAL_STORAGE") || C7584t.m21552v(activity, "android.permission.READ_EXTERNAL_STORAGE")) {
                        return false;
                    }
                    return true;
                }
            }
        }
        if (!C7565b.m21454l() && C7584t.m21535e(str, "android.permission.ACCEPT_HANDOVER")) {
            return false;
        }
        if (!C7565b.m21453k()) {
            if (C7584t.m21535e(str, "android.permission.ANSWER_PHONE_CALLS")) {
                return false;
            }
            if (C7584t.m21535e(str, "android.permission.READ_PHONE_NUMBERS")) {
                if (C7584t.m21533c(activity, "android.permission.READ_PHONE_STATE") || C7584t.m21552v(activity, "android.permission.READ_PHONE_STATE")) {
                    return false;
                }
                return true;
            }
        }
        if (C7584t.m21533c(activity, str) || C7584t.m21552v(activity, str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public Intent mo33037b(Context context, String str) {
        if (C7584t.m21535e(str, "android.permission.SYSTEM_ALERT_WINDOW")) {
            return m21498o(context);
        }
        if (C7584t.m21535e(str, "android.permission.WRITE_SETTINGS")) {
            return m21497n(context);
        }
        if (C7584t.m21535e(str, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
            return m21496m(context);
        }
        if (C7584t.m21535e(str, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
            return m21495l(context);
        }
        return super.mo33037b(context, str);
    }

    /* renamed from: c */
    public boolean mo33038c(Context context, String str) {
        if (!C7584t.m21546p(str)) {
            if (!C7565b.m21448f()) {
                if (C7584t.m21535e(str, "android.permission.POST_NOTIFICATIONS")) {
                    return super.mo33038c(context, str);
                }
                if (C7584t.m21535e(str, "android.permission.NEARBY_WIFI_DEVICES")) {
                    return C7584t.m21533c(context, PermissionConstKt.PERMISSION_LOCATION);
                }
                if (C7584t.m21535e(str, "android.permission.BODY_SENSORS_BACKGROUND")) {
                    return C7584t.m21533c(context, "android.permission.BODY_SENSORS");
                }
                if (C7584t.m21535e(str, "android.permission.READ_MEDIA_IMAGES") || C7584t.m21535e(str, "android.permission.READ_MEDIA_VIDEO") || C7584t.m21535e(str, "android.permission.READ_MEDIA_AUDIO")) {
                    return C7584t.m21533c(context, "android.permission.READ_EXTERNAL_STORAGE");
                }
            }
            if (!C7565b.m21447e()) {
                if (C7584t.m21535e(str, "android.permission.BLUETOOTH_SCAN")) {
                    return C7584t.m21533c(context, PermissionConstKt.PERMISSION_LOCATION);
                }
                if (C7584t.m21535e(str, "android.permission.BLUETOOTH_CONNECT") || C7584t.m21535e(str, "android.permission.BLUETOOTH_ADVERTISE")) {
                    return true;
                }
            }
            if (!C7565b.m21445c()) {
                if (C7584t.m21535e(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    return C7584t.m21533c(context, PermissionConstKt.PERMISSION_LOCATION);
                }
                if (C7584t.m21535e(str, "android.permission.ACTIVITY_RECOGNITION")) {
                    return true;
                }
                if (C7584t.m21535e(str, "android.permission.ACCESS_MEDIA_LOCATION")) {
                    return C7584t.m21533c(context, "android.permission.READ_EXTERNAL_STORAGE");
                }
            }
            if (!C7565b.m21454l() && C7584t.m21535e(str, "android.permission.ACCEPT_HANDOVER")) {
                return true;
            }
            if (!C7565b.m21453k()) {
                if (C7584t.m21535e(str, "android.permission.ANSWER_PHONE_CALLS")) {
                    return true;
                }
                if (C7584t.m21535e(str, "android.permission.READ_PHONE_NUMBERS")) {
                    return C7584t.m21533c(context, "android.permission.READ_PHONE_STATE");
                }
            }
            return C7584t.m21533c(context, str);
        } else if (C7584t.m21535e(str, "android.permission.SYSTEM_ALERT_WINDOW")) {
            return m21502s(context);
        } else {
            if (C7584t.m21535e(str, "android.permission.WRITE_SETTINGS")) {
                return m21501r(context);
            }
            if (C7584t.m21535e(str, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
                return m21500q(context);
            }
            if (C7584t.m21535e(str, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
                return m21499p(context);
            }
            if (C7565b.m21446d() || !C7584t.m21535e(str, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                return super.mo33038c(context, str);
            }
            if (!C7584t.m21533c(context, "android.permission.READ_EXTERNAL_STORAGE") || !C7584t.m21533c(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                return false;
            }
            return true;
        }
    }
}
