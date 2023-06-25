package p040c.p472t.p473a;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 26)
/* renamed from: c.t.a.l */
/* compiled from: PermissionDelegateImplV26 */
public class C7576l extends C7575k {
    /* renamed from: t */
    public static Intent m21506t(Context context) {
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
        intent.setData(C7584t.m21541k(context));
        return !C7584t.m21531a(context, intent) ? C7584t.m21539i(context) : intent;
    }

    /* renamed from: u */
    public static Intent m21507u(Context context) {
        Intent intent = new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS");
        intent.setData(C7584t.m21541k(context));
        return !C7584t.m21531a(context, intent) ? C7584t.m21539i(context) : intent;
    }

    /* renamed from: v */
    public static boolean m21508v(Context context) {
        return context.getPackageManager().canRequestPackageInstalls();
    }

    /* renamed from: w */
    public static boolean m21509w(Context context) {
        int i;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        if (C7565b.m21445c()) {
            i = appOpsManager.unsafeCheckOpNoThrow("android:picture_in_picture", context.getApplicationInfo().uid, context.getPackageName());
        } else {
            i = appOpsManager.checkOpNoThrow("android:picture_in_picture", context.getApplicationInfo().uid, context.getPackageName());
        }
        return i == 0;
    }

    /* renamed from: a */
    public boolean mo33036a(Activity activity, String str) {
        if (C7584t.m21535e(str, "android.permission.REQUEST_INSTALL_PACKAGES") || C7584t.m21535e(str, "android.permission.PICTURE_IN_PICTURE")) {
            return false;
        }
        if (!C7584t.m21535e(str, "android.permission.READ_PHONE_NUMBERS") && !C7584t.m21535e(str, "android.permission.ANSWER_PHONE_CALLS")) {
            return super.mo33036a(activity, str);
        }
        if (C7584t.m21533c(activity, str) || C7584t.m21552v(activity, str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public Intent mo33037b(Context context, String str) {
        if (C7584t.m21535e(str, "android.permission.REQUEST_INSTALL_PACKAGES")) {
            return m21506t(context);
        }
        if (C7584t.m21535e(str, "android.permission.PICTURE_IN_PICTURE")) {
            return m21507u(context);
        }
        return super.mo33037b(context, str);
    }

    /* renamed from: c */
    public boolean mo33038c(Context context, String str) {
        if (C7584t.m21535e(str, "android.permission.REQUEST_INSTALL_PACKAGES")) {
            return m21508v(context);
        }
        if (C7584t.m21535e(str, "android.permission.PICTURE_IN_PICTURE")) {
            return m21509w(context);
        }
        if (C7584t.m21535e(str, "android.permission.READ_PHONE_NUMBERS") || C7584t.m21535e(str, "android.permission.ANSWER_PHONE_CALLS")) {
            return C7584t.m21533c(context, str);
        }
        return super.mo33038c(context, str);
    }
}
