package p040c.p472t.p473a;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 33)
/* renamed from: c.t.a.q */
/* compiled from: PermissionDelegateImplV33 */
public class C7581q extends C7580p {
    /* renamed from: a */
    public boolean mo33036a(Activity activity, String str) {
        if (C7584t.m21535e(str, "android.permission.BODY_SENSORS_BACKGROUND")) {
            if (!C7584t.m21533c(activity, "android.permission.BODY_SENSORS")) {
                return !C7584t.m21552v(activity, "android.permission.BODY_SENSORS");
            }
            if (C7584t.m21533c(activity, str) || C7584t.m21552v(activity, str)) {
                return false;
            }
            return true;
        } else if (!C7584t.m21535e(str, "android.permission.POST_NOTIFICATIONS") && !C7584t.m21535e(str, "android.permission.NEARBY_WIFI_DEVICES") && !C7584t.m21535e(str, "android.permission.READ_MEDIA_IMAGES") && !C7584t.m21535e(str, "android.permission.READ_MEDIA_VIDEO") && !C7584t.m21535e(str, "android.permission.READ_MEDIA_AUDIO")) {
            return super.mo33036a(activity, str);
        } else {
            if (C7584t.m21533c(activity, str) || C7584t.m21552v(activity, str)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: c */
    public boolean mo33038c(Context context, String str) {
        if (C7584t.m21535e(str, "android.permission.BODY_SENSORS_BACKGROUND")) {
            return C7584t.m21533c(context, "android.permission.BODY_SENSORS") && C7584t.m21533c(context, "android.permission.BODY_SENSORS_BACKGROUND");
        }
        if (C7584t.m21535e(str, "android.permission.POST_NOTIFICATIONS") || C7584t.m21535e(str, "android.permission.NEARBY_WIFI_DEVICES") || C7584t.m21535e(str, "android.permission.READ_MEDIA_IMAGES") || C7584t.m21535e(str, "android.permission.READ_MEDIA_VIDEO") || C7584t.m21535e(str, "android.permission.READ_MEDIA_AUDIO")) {
            return C7584t.m21533c(context, str);
        }
        return super.mo33038c(context, str);
    }
}
