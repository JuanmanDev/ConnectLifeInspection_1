package p040c.p537g0.p538a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.p539zt.shareextend.ShareExtendProvider;
import java.io.File;
import java.util.List;

/* renamed from: c.g0.a.e */
/* compiled from: ShareUtils */
public class C8855e {
    /* renamed from: a */
    public static Uri m23841a(Context context, File file) {
        return ShareExtendProvider.m24006e(context.getPackageName() + ".shareextend.fileprovider", file.getAbsolutePath());
    }

    /* renamed from: b */
    public static void m23842b(Context context, List<Uri> list, Intent intent) {
        try {
            for (Uri next : list) {
                for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
                    context.grantUriPermission(resolveInfo.activityInfo.packageName, next, 3);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public static boolean m23843c(String str) {
        return str.startsWith(Environment.getExternalStorageDirectory().getAbsolutePath());
    }

    /* renamed from: d */
    public static boolean m23844d(String str) {
        return Build.VERSION.SDK_INT >= 23 && m23843c(str);
    }

    /* renamed from: e */
    public static boolean m23845e(List<String> list) {
        for (String d : list) {
            if (m23844d(d)) {
                return true;
            }
        }
        return false;
    }
}
