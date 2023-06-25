package p040c.p472t.p473a;

import android.app.Activity;
import android.content.Context;
import android.os.Environment;
import androidx.annotation.RequiresApi;
import com.hisense.connect_life.core.global.PermissionConstKt;

@RequiresApi(api = 29)
/* renamed from: c.t.a.n */
/* compiled from: PermissionDelegateImplV29 */
public class C7578n extends C7577m {
    /* renamed from: y */
    public static boolean m21515y() {
        return Environment.isExternalStorageLegacy();
    }

    /* renamed from: a */
    public boolean mo33036a(Activity activity, String str) {
        if (C7584t.m21535e(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            if (!C7584t.m21533c(activity, PermissionConstKt.PERMISSION_LOCATION)) {
                return !C7584t.m21552v(activity, PermissionConstKt.PERMISSION_LOCATION);
            }
            if (C7584t.m21533c(activity, str) || C7584t.m21552v(activity, str)) {
                return false;
            }
            return true;
        } else if (C7584t.m21535e(str, "android.permission.ACCESS_MEDIA_LOCATION")) {
            if (!mo33039x(activity) || C7584t.m21533c(activity, str) || C7584t.m21552v(activity, str)) {
                return false;
            }
            return true;
        } else if (C7584t.m21535e(str, "android.permission.ACTIVITY_RECOGNITION")) {
            if (C7584t.m21533c(activity, str) || C7584t.m21552v(activity, str)) {
                return false;
            }
            return true;
        } else if (C7565b.m21446d() || !C7584t.m21535e(str, "android.permission.MANAGE_EXTERNAL_STORAGE") || m21515y()) {
            return super.mo33036a(activity, str);
        } else {
            return true;
        }
    }

    /* renamed from: c */
    public boolean mo33038c(Context context, String str) {
        if (C7584t.m21535e(str, "android.permission.ACCESS_MEDIA_LOCATION")) {
            if (!mo33039x(context) || !C7584t.m21533c(context, "android.permission.ACCESS_MEDIA_LOCATION")) {
                return false;
            }
            return true;
        } else if (C7584t.m21535e(str, "android.permission.ACCESS_BACKGROUND_LOCATION") || C7584t.m21535e(str, "android.permission.ACTIVITY_RECOGNITION")) {
            return C7584t.m21533c(context, str);
        } else {
            if (C7565b.m21446d() || !C7584t.m21535e(str, "android.permission.MANAGE_EXTERNAL_STORAGE") || m21515y()) {
                return super.mo33038c(context, str);
            }
            return false;
        }
    }

    /* renamed from: x */
    public final boolean mo33039x(Context context) {
        if (!C7565b.m21448f() || C7565b.m21444b(context) < 33) {
            if (!C7565b.m21446d() || C7565b.m21444b(context) < 30) {
                return C7584t.m21533c(context, "android.permission.READ_EXTERNAL_STORAGE");
            }
            if (C7584t.m21533c(context, "android.permission.READ_EXTERNAL_STORAGE") || mo33038c(context, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                return true;
            }
            return false;
        } else if (C7584t.m21533c(context, "android.permission.READ_MEDIA_IMAGES") || mo33038c(context, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
            return true;
        } else {
            return false;
        }
    }
}
