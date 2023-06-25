package p040c.p072c.p073a.p074a;

import android.app.Activity;
import android.app.Application;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import com.blankj.utilcode.util.ImageUtils;
import com.google.gson.Gson;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p040c.p072c.p073a.p074a.C1535z;

/* renamed from: c.c.a.a.b0 */
/* compiled from: UtilsBridge */
public class C1493b0 {

    /* renamed from: c.c.a.a.b0$a */
    /* compiled from: UtilsBridge */
    public static final class C1494a {

        /* renamed from: a */
        public String f681a;

        /* renamed from: b */
        public LinkedHashMap<String, String> f682b = new LinkedHashMap<>();

        /* renamed from: c */
        public LinkedHashMap<String, String> f683c = new LinkedHashMap<>();

        public C1494a(String str) {
            this.f681a = str;
        }

        /* renamed from: a */
        public void mo15385a(String str, String str2) {
            mo15386b(this.f682b, str, str2);
        }

        /* renamed from: b */
        public final void mo15386b(Map<String, String> map, String str, String str2) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                int length = 19 - str.length();
                if (length > 0) {
                    str = str + "                   ".substring(0, length);
                }
                map.put(str, str2);
            }
        }

        /* renamed from: c */
        public String mo15387c() {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry next : this.f683c.entrySet()) {
                sb.append((String) next.getKey());
                sb.append(": ");
                sb.append((String) next.getValue());
                sb.append("\n");
            }
            return sb.toString();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = "************* " + this.f681a + " Head ****************\n";
            sb.append(str);
            for (Map.Entry next : this.f682b.entrySet()) {
                sb.append((String) next.getKey());
                sb.append(": ");
                sb.append((String) next.getValue());
                sb.append("\n");
            }
            sb.append("Rom Info           : ");
            sb.append(C1520q.m1021c());
            sb.append("\n");
            sb.append("Device Manufacturer: ");
            sb.append(Build.MANUFACTURER);
            sb.append("\n");
            sb.append("Device Model       : ");
            sb.append(Build.MODEL);
            sb.append("\n");
            sb.append("Android Version    : ");
            sb.append(Build.VERSION.RELEASE);
            sb.append("\n");
            sb.append("Android SDK        : ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append("\n");
            sb.append("App VersionName    : ");
            sb.append(C1497d.m912f());
            sb.append("\n");
            sb.append("App VersionCode    : ");
            sb.append(C1497d.m910d());
            sb.append("\n");
            sb.append(mo15387c());
            sb.append(str);
            sb.append("\n");
            return sb.toString();
        }
    }

    /* renamed from: A */
    public static void m871A(C1535z.C1536a aVar) {
        C1487a0.f664q.mo15377s(aVar);
    }

    /* renamed from: B */
    public static void m872B(Runnable runnable) {
        C1528x.m1070e(runnable);
    }

    /* renamed from: C */
    public static void m873C(Runnable runnable, long j) {
        C1528x.m1071f(runnable, j);
    }

    /* renamed from: D */
    public static void m874D(Application application) {
        C1487a0.f664q.mo15380w(application);
    }

    /* renamed from: E */
    public static Bitmap m875E(View view) {
        return ImageUtils.m9562a(view);
    }

    /* renamed from: F */
    public static boolean m876F(String str, String str2, boolean z) {
        return C1500g.m917b(str, str2, z);
    }

    /* renamed from: a */
    public static void m877a(C1535z.C1536a aVar) {
        C1487a0.f664q.mo15354d(aVar);
    }

    public static void addOnAppStatusChangedListener(C1535z.C1537b bVar) {
        C1487a0.f664q.addOnAppStatusChangedListener(bVar);
    }

    /* renamed from: b */
    public static boolean m878b(File file) {
        return C1501h.m918a(file);
    }

    /* renamed from: c */
    public static boolean m879c(File file) {
        return C1501h.m919b(file);
    }

    /* renamed from: d */
    public static int m880d(float f) {
        return C1526v.m1061a(f);
    }

    /* renamed from: e */
    public static void m881e(Activity activity) {
        C1504k.m934a(activity);
    }

    /* renamed from: f */
    public static String m882f(String str, Object... objArr) {
        return C1527w.m1062a(str, objArr);
    }

    /* renamed from: g */
    public static String m883g(String str) {
        return C1503j.m932a(str);
    }

    /* renamed from: h */
    public static List<Activity> m884h() {
        return C1487a0.f664q.mo15359i();
    }

    /* renamed from: i */
    public static int m885i() {
        return C1525u.m1060a();
    }

    /* renamed from: j */
    public static Application m886j() {
        return C1487a0.f664q.mo15363m();
    }

    /* renamed from: k */
    public static String m887k() {
        return C1518o.m1013a();
    }

    /* renamed from: l */
    public static File m888l(String str) {
        return C1501h.m920c(str);
    }

    /* renamed from: m */
    public static String m889m(Throwable th) {
        return C1534y.m1076a(th);
    }

    /* renamed from: n */
    public static Gson m890n() {
        return C1502i.m927g();
    }

    /* renamed from: o */
    public static int m891o() {
        return C1498e.m914a();
    }

    /* renamed from: p */
    public static C1524t m892p() {
        return C1524t.m1042f("Utils");
    }

    /* renamed from: q */
    public static String m893q(@StringRes int i) {
        return C1527w.m1063b(i);
    }

    /* renamed from: r */
    public static void m894r(Application application) {
        C1487a0.f664q.mo15364n(application);
    }

    public static void removeOnAppStatusChangedListener(C1535z.C1537b bVar) {
        C1487a0.f664q.removeOnAppStatusChangedListener(bVar);
    }

    /* renamed from: s */
    public static boolean m895s(Activity activity) {
        return C1486a.m840a(activity);
    }

    /* renamed from: t */
    public static boolean m896t() {
        return C1487a0.f664q.mo15365o();
    }

    @RequiresApi(api = 23)
    /* renamed from: u */
    public static boolean m897u() {
        return C1517n.m1012a();
    }

    /* renamed from: v */
    public static boolean m898v() {
        return C1522r.m1030a();
    }

    /* renamed from: w */
    public static boolean m899w(String str) {
        return C1527w.m1065d(str);
    }

    /* renamed from: x */
    public static View m900x(@LayoutRes int i) {
        return C1496c0.m906a(i);
    }

    /* renamed from: y */
    public static void m901y() {
        m902z(C1491b.m869f());
    }

    /* renamed from: z */
    public static void m902z(Runnable... runnableArr) {
        for (Runnable execute : runnableArr) {
            C1528x.m1067b().execute(execute);
        }
    }
}
