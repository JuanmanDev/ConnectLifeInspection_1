package p040c.p472t.p473a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 30)
/* renamed from: c.t.a.o */
/* compiled from: PermissionDelegateImplV30 */
public class C7579o extends C7578n {
    /* renamed from: A */
    public static boolean m21519A() {
        return Environment.isExternalStorageManager();
    }

    /* renamed from: z */
    public static Intent m21520z(Context context) {
        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
        intent.setData(C7584t.m21541k(context));
        if (!C7584t.m21531a(context, intent)) {
            intent = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
        }
        return !C7584t.m21531a(context, intent) ? C7584t.m21539i(context) : intent;
    }

    /* renamed from: a */
    public boolean mo33036a(Activity activity, String str) {
        if (C7584t.m21535e(str, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
            return false;
        }
        return super.mo33036a(activity, str);
    }

    /* renamed from: b */
    public Intent mo33037b(Context context, String str) {
        if (C7584t.m21535e(str, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
            return m21520z(context);
        }
        return super.mo33037b(context, str);
    }

    /* renamed from: c */
    public boolean mo33038c(Context context, String str) {
        if (C7584t.m21535e(str, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
            return m21519A();
        }
        return super.mo33038c(context, str);
    }
}
