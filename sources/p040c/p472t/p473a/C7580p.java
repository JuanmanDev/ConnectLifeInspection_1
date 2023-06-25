package p040c.p472t.p473a;

import android.app.Activity;
import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import com.hisense.connect_life.core.global.PermissionConstKt;

@RequiresApi(api = 31)
/* renamed from: c.t.a.p */
/* compiled from: PermissionDelegateImplV31 */
public class C7580p extends C7579o {
    /* renamed from: B */
    public static Intent m21524B(Context context) {
        Intent intent = new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
        intent.setData(C7584t.m21541k(context));
        return !C7584t.m21531a(context, intent) ? C7584t.m21539i(context) : intent;
    }

    /* renamed from: C */
    public static boolean m21525C(Context context) {
        return ((AlarmManager) context.getSystemService(AlarmManager.class)).canScheduleExactAlarms();
    }

    /* renamed from: a */
    public boolean mo33036a(Activity activity, String str) {
        if (C7584t.m21535e(str, "android.permission.SCHEDULE_EXACT_ALARM")) {
            return false;
        }
        if (C7584t.m21535e(str, "android.permission.BLUETOOTH_SCAN") || C7584t.m21535e(str, "android.permission.BLUETOOTH_CONNECT") || C7584t.m21535e(str, "android.permission.BLUETOOTH_ADVERTISE")) {
            if (C7584t.m21533c(activity, str) || C7584t.m21552v(activity, str)) {
                return false;
            }
            return true;
        } else if (activity.getApplicationInfo().targetSdkVersion < 31 || !C7584t.m21535e(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            return super.mo33036a(activity, str);
        } else {
            if (C7584t.m21533c(activity, PermissionConstKt.PERMISSION_LOCATION) || C7584t.m21533c(activity, "android.permission.ACCESS_COARSE_LOCATION")) {
                if (C7584t.m21533c(activity, str) || C7584t.m21552v(activity, str)) {
                    return false;
                }
                return true;
            } else if (C7584t.m21552v(activity, PermissionConstKt.PERMISSION_LOCATION) || C7584t.m21552v(activity, "android.permission.ACCESS_COARSE_LOCATION")) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* renamed from: b */
    public Intent mo33037b(Context context, String str) {
        if (C7584t.m21535e(str, "android.permission.SCHEDULE_EXACT_ALARM")) {
            return m21524B(context);
        }
        return super.mo33037b(context, str);
    }

    /* renamed from: c */
    public boolean mo33038c(Context context, String str) {
        if (C7584t.m21535e(str, "android.permission.SCHEDULE_EXACT_ALARM")) {
            return m21525C(context);
        }
        if (C7584t.m21535e(str, "android.permission.BLUETOOTH_SCAN") || C7584t.m21535e(str, "android.permission.BLUETOOTH_CONNECT") || C7584t.m21535e(str, "android.permission.BLUETOOTH_ADVERTISE")) {
            return C7584t.m21533c(context, str);
        }
        return super.mo33038c(context, str);
    }
}
