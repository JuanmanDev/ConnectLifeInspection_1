package p040c.p325e0.p326a.p327b.p328a.p329a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p040c.p325e0.p326a.C4258a;
import p040c.p325e0.p326a.p332c.C4270g;
import p040c.p325e0.p326a.p332c.C4271h;

/* renamed from: c.e0.a.b.a.a.b */
/* compiled from: BUGLY */
public final class C4260b {

    /* renamed from: g */
    public static C4260b f9093g;

    /* renamed from: a */
    public final String f9094a;

    /* renamed from: b */
    public final String f9095b;

    /* renamed from: c */
    public String f9096c = null;

    /* renamed from: d */
    public String f9097d = null;

    /* renamed from: e */
    public Map<String, String> f9098e;

    /* renamed from: f */
    public final Object f9099f;

    public C4260b(Context context) {
        new HashMap();
        new HashMap();
        this.f9098e = new HashMap();
        new HashMap();
        new ArrayList();
        this.f9099f = new Object();
        System.currentTimeMillis();
        C4271h.m11654a(context);
        PackageInfo d = C4259a.m11604d(context);
        if (d != null) {
            try {
                this.f9096c = d.versionName;
                Integer.toString(d.versionCode);
            } catch (Throwable th) {
                if (!C4270g.m11650c(th)) {
                    th.printStackTrace();
                }
            }
        }
        C4259a.m11602b(context);
        C4259a.m11601a(Process.myPid());
        C4261c.m11613e();
        this.f9094a = C4261c.m11609a();
        C4259a.m11605e(context);
        this.f9095b = "Android " + C4261c.m11610b() + ",level " + C4261c.m11611c();
        this.f9094a + MAPCookie.COOKIE_ATTRIBUTE_SEPERATOR + this.f9095b;
        Map<String, String> f = C4259a.m11606f(context);
        if (f != null) {
            try {
                C4259a.m11603c(f);
                String str = f.get("BUGLY_APPID");
                if (str != null) {
                    this.f9097d = str;
                    mo25726b("APP_ID", str);
                }
                String str2 = f.get("BUGLY_APP_VERSION");
                if (str2 != null) {
                    this.f9096c = str2;
                }
                String str3 = f.get("BUGLY_APP_CHANNEL");
                String str4 = f.get("BUGLY_ENABLE_DEBUG");
                if (str4 != null) {
                    str4.equalsIgnoreCase("true");
                }
                String str5 = f.get("com.tencent.rdm.uuid");
            } catch (Throwable th2) {
                if (!C4270g.m11650c(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        try {
            if (!context.getDatabasePath("bugly_db_").exists()) {
                C4270g.m11651d("App is first time to be installed on the device.", new Object[0]);
            }
        } catch (Throwable th3) {
            if (C4258a.f9092a) {
                th3.printStackTrace();
            }
        }
        C4271h.m11655b("BUGLY_COMMON_VALUES", context);
        C4270g.m11651d("com info create end", new Object[0]);
    }

    /* renamed from: a */
    public static synchronized C4260b m11607a(Context context) {
        C4260b bVar;
        synchronized (C4260b.class) {
            if (f9093g == null) {
                f9093g = new C4260b(context);
            }
            bVar = f9093g;
        }
        return bVar;
    }

    /* renamed from: b */
    public final void mo25726b(String str, String str2) {
        if (C4271h.m11659f(str) || C4271h.m11659f(str2)) {
            C4270g.m11652e("server key&value should not be empty %s %s", str, str2);
            return;
        }
        synchronized (this.f9099f) {
            this.f9098e.put(str, str2);
        }
    }
}
