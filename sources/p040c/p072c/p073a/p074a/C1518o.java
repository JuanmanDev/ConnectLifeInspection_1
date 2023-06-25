package p040c.p072c.p073a.p074a;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Process;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: c.c.a.a.o */
/* compiled from: ProcessUtils */
public final class C1518o {
    /* renamed from: a */
    public static String m1013a() {
        String c = m1015c();
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        String b = m1014b();
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        return m1016d();
    }

    /* renamed from: b */
    public static String m1014b() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            ActivityManager activityManager = (ActivityManager) C1535z.m1079a().getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return "";
            }
            if (runningAppProcesses.size() == 0) {
                return "";
            }
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid && next.processName != null) {
                    return next.processName;
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m1015c() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            String trim = bufferedReader.readLine().trim();
            bufferedReader.close();
            return trim;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    public static String m1016d() {
        try {
            Application a = C1535z.m1079a();
            Field field = a.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(a);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            return (String) obj2.getClass().getDeclaredMethod("getProcessName", new Class[0]).invoke(obj2, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
